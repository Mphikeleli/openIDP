//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.04 at 04:27:01 PM IST 
//
package com.infosys.utilities.robot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suite", propOrder = { "kwOrSuiteOrTest" })
public class Suite {
	@XmlElements({ @XmlElement(name = "kw", type = Kw.class), @XmlElement(name = "suite", type = Suite.class),
			@XmlElement(name = "test", type = Test.class), @XmlElement(name = "doc", type = String.class),
			@XmlElement(name = "metadata", type = Metadata.class), @XmlElement(name = "status", type = Status.class) })
	protected List<Object> kwOrSuiteOrTest;
	@XmlAttribute(name = "name", required = true)
	protected String name;
	@XmlAttribute(name = "source")
	protected String source;
	@XmlAttribute(name = "id")
	protected String id;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	public List<Object> getKwOrSuiteOrTest() {
		if (kwOrSuiteOrTest == null) {
			kwOrSuiteOrTest = new ArrayList<Object>();
		}
		return this.kwOrSuiteOrTest;
	}

	public String getName() {
		return name;
	}

	public void setName(String value) {
		this.name = value;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String value) {
		this.source = value;
	}

	public String getId() {
		return id;
	}

	public void setId(String value) {
		this.id = value;
	}

	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}
}