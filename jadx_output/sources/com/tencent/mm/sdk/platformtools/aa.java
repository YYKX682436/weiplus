package com.tencent.mm.sdk.platformtools;

/* loaded from: classes11.dex */
public abstract class aa {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.r2 f192464a = new com.tencent.mm.sdk.platformtools.r2(100);

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.ThreadLocal f192465b = new java.lang.ThreadLocal();

    public static java.lang.String a(java.lang.String str) {
        return str == null ? "" : java.lang.String.format("<![CDATA[%s]]>", str);
    }

    public static boolean b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int indexOf;
        if (str == null) {
            indexOf = -1;
        } else {
            indexOf = str.indexOf("<" + str2);
        }
        return indexOf >= 0;
    }

    public static java.lang.String c(org.w3c.dom.Node node) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        try {
            javax.xml.transform.Transformer newTransformer = javax.xml.transform.TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("omit-xml-declaration", "yes");
            newTransformer.transform(new javax.xml.transform.dom.DOMSource(node), new javax.xml.transform.stream.StreamResult(stringWriter));
        } catch (javax.xml.transform.TransformerException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SDK.XmlParser", "nodeToString: %s", e17.getMessage());
        }
        return stringWriter.toString();
    }

    public static java.util.Map d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        int indexOf;
        if (str == null) {
            indexOf = -1;
        } else {
            indexOf = str.indexOf("<" + str2);
        }
        if (indexOf < 0) {
            return null;
        }
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        java.lang.String str4 = str + "_" + str2;
        com.tencent.mm.sdk.platformtools.r2 r2Var = f192464a;
        if (r2Var.k(str4)) {
            return (java.util.Map) r2Var.get(str4);
        }
        try {
            java.util.Map a17 = new com.tencent.mm.sdk.platformtools.z9(str, str2, str3).a();
            r2Var.put(str4, a17);
            return a17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SDK.XmlParser", e17, "[ %s ]", str);
            return null;
        }
    }
}
