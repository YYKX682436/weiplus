package pn1;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuffer f356964a = new java.lang.StringBuffer();

    public void a(java.lang.String str, java.lang.String str2) {
        c(str);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str2);
        java.lang.StringBuffer stringBuffer = this.f356964a;
        if (K0) {
            stringBuffer.append("");
        } else if (str2.contains("]]>")) {
            stringBuffer.append("<![CDATA[" + com.tencent.mm.sdk.platformtools.t8.p(str2) + "]]>");
        } else {
            stringBuffer.append("<![CDATA[" + str2 + "]]>");
        }
        b(str);
    }

    public void b(java.lang.String str) {
        this.f356964a.append("</" + str + ">");
    }

    public void c(java.lang.String str) {
        this.f356964a.append("<" + str + ">");
    }

    public void d(java.lang.String str, java.util.Map map) {
        java.lang.StringBuffer stringBuffer = this.f356964a;
        stringBuffer.append("<" + str);
        for (java.lang.String str2 : map.keySet()) {
            stringBuffer.append(" " + str2 + " =  \"" + ((java.lang.String) map.get(str2)) + "\" ");
        }
        stringBuffer.append(">");
        map.clear();
    }
}
