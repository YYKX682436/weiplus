package gr;

/* loaded from: classes15.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String filePath, gr.b xmlContent) {
        java.io.InputStream E;
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(xmlContent, "xmlContent");
        java.io.InputStream inputStream = null;
        try {
            try {
                E = com.tencent.mm.vfs.w6.E(filePath);
            } catch (java.lang.Throwable th6) {
                th = th6;
            }
        } catch (java.lang.Exception e17) {
            e = e17;
        }
        try {
            org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
            kotlin.jvm.internal.o.f(newPullParser, "newPullParser(...)");
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(E, null);
            newPullParser.nextTag();
            xmlContent.a(newPullParser);
            if (E != null) {
                E.close();
            }
        } catch (java.lang.Exception e18) {
            e = e18;
            inputStream = E;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BaseXmlContent", e, "safeParse error", new java.lang.Object[0]);
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            inputStream = E;
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }
}
