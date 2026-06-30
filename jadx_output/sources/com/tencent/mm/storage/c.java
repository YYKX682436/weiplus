package com.tencent.mm.storage;

/* loaded from: classes12.dex */
public class c extends dm.d implements java.io.Serializable {
    public static final l75.e0 E = dm.d.initAutoDBInfo(com.tencent.mm.storage.c.class);
    public java.util.Map D = null;

    @Override // dm.d, l75.f0
    public l75.e0 getDBInfo() {
        return E;
    }

    public boolean isValid() {
        long i17 = com.tencent.mm.sdk.platformtools.t8.i1();
        return i17 >= this.field_startTime && i17 <= this.field_endTime;
    }

    public java.util.Map t0() {
        if (this.D == null) {
            java.lang.String str = this.field_rawXML;
            java.util.HashMap hashMap = new java.util.HashMap();
            org.w3c.dom.Element d17 = com.tencent.mm.model.newabtest.b.d(str);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ABTestParser", "Raw XML string parsing failed, xml: %s", str);
            } else {
                org.w3c.dom.NodeList elementsByTagName = d17.getElementsByTagName("args");
                if (elementsByTagName.getLength() > 0) {
                    org.w3c.dom.NodeList childNodes = elementsByTagName.item(0).getChildNodes();
                    for (int i17 = 0; i17 < childNodes.getLength(); i17++) {
                        org.w3c.dom.Node item = childNodes.item(i17);
                        if (item.getNodeType() == 1 && item.getNodeName().equals("arg")) {
                            org.w3c.dom.Element element = (org.w3c.dom.Element) item;
                            org.w3c.dom.NodeList elementsByTagName2 = element.getElementsByTagName("key");
                            org.w3c.dom.NodeList elementsByTagName3 = element.getElementsByTagName("value");
                            if (elementsByTagName2.getLength() != 0 && elementsByTagName3.getLength() != 0) {
                                hashMap.put(elementsByTagName2.item(0).getTextContent(), elementsByTagName3.item(0).getTextContent());
                            }
                        }
                    }
                }
            }
            this.D = hashMap;
        }
        return this.D;
    }
}
