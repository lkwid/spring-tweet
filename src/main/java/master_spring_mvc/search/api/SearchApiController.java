package master_spring_mvc.search.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import master_spring_mvc.search.LightTweet;
import master_spring_mvc.search.TwitterSearch;

@RestController
@RequestMapping("/api/search")
public class SearchApiController {
	private TwitterSearch searchService;

	@Autowired
	public SearchApiController(TwitterSearch searchService) {
		this.searchService = searchService;
	}

	@RequestMapping(value = "/{searchType}", method = RequestMethod.GET)
	public List<LightTweet> search(@PathVariable String searchType, @MatrixVariable List<String> keywords) {
		return searchService.search(searchType, keywords);
	}
}
