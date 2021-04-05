package com.example.demo;

import com.example.demo.entry.po.Article;
import com.example.demo.entry.po.Work;
import com.example.demo.entry.po.Workinfo;
import com.example.demo.mapper.ds1.ArticleMapper;
import com.example.demo.mapper.ds2.WorkMapper;
import com.example.demo.mapper.ds2.WorkinfoMapper;
import com.example.demo.utils.IdWorker;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {

	@Resource
	private ArticleMapper articleMapper;
	@Resource
	private WorkMapper workMapper;
	@Resource
	private WorkinfoMapper workinfoMapper;

	@Resource
	IdWorker idWorkerl;

	@Test
	void contextLoads() {
//		Article article = articleMapper.selectByPrimaryKey(1361222467321888L);
//		System.out.println(article);
//		Work work = workMapper.selectByPrimaryKey(19);
//		System.out.println(work);

		System.out.println("123");

		int n = 0;
		List<Work> works = workMapper.selectAll();
		if (CollectionUtils.isEmpty(works)) {
			return;
		}
		for (Work work : works) {
			Integer wid = work.getWid();
			Workinfo workinfo = workinfoMapper.selectByWid(wid);
			Article article1 = new Article();
			article1.setTitle(work.getWtitle());
			article1.setIntro(work.getWintro());
			article1.setContent(workinfo.getWinfocontent());
			article1.setSign(2);
			article1.setId(idWorkerl.nextId());
			int insert = articleMapper.insert(article1);
			if (insert < 1) {
				throw new RuntimeException("insert 异常");
			} else {
				n++;
			}
		}

		System.out.println("共计插入成功" + n + "条记录");
	}

}
