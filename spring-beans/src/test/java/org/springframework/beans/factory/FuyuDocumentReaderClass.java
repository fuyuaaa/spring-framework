package org.springframework.beans.factory;

import org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader;
import org.w3c.dom.Element;

/**
 * @author : fuyuaaa
 * @date : 2020-03-27 17:09
 */
public class FuyuDocumentReaderClass extends DefaultBeanDefinitionDocumentReader {

	@Override
	protected void preProcessXml(Element root) {
		System.out.println("====解析前置处理====");
		super.preProcessXml(root);
	}

	@Override
	protected void postProcessXml(Element root) {
		System.out.println("====解析后置处理====");
		super.postProcessXml(root);
	}
}
