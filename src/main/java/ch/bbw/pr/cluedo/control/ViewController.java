package ch.bbw.pr.cluedo.control;

import ch.bbw.pr.cluedo.model.Person;
import ch.bbw.pr.cluedo.model.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * ItemController
 *
 * @author Peter Rutschmann
 * @version 29.08.2022
 */
@Controller
public class ViewController {
   @Autowired
   private DataService service;

   @RequestMapping(value = {"/", "/showView"}, method = RequestMethod.GET)
   public String showView(Model model){
      System.out.println("ViewController.showView");
      model.addAttribute("persons", service.getPersons() );
      return "cluedolistview";
   }
}
