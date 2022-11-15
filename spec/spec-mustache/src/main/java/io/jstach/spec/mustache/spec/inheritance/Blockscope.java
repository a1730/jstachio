package io.jstach.spec.mustache.spec.inheritance;

import io.jstach.spec.generator.SpecModel;
import io.jstach.annotation.JStache;
import io.jstach.annotation.JStachePartials;
import io.jstach.annotation.JStachePartial;

@JStache(path = "inheritance/Blockscope.mustache")
@JStachePartials({
		@JStachePartial(name = "parent", template = "{{#nested}}{{$block}}You say {{fruit}}.{{/block}}{{/nested}}"), })
public class Blockscope extends SpecModel {

}
