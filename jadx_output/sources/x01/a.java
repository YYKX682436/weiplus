package x01;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    public static final kk.j f450971f = new jt0.j(100);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f450972a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f450973b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f450974c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f450975d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f450976e;

    public static final x01.a a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandQALogic", "empty xml to parse");
            return null;
        }
        int indexOf = str.indexOf("<qamsg");
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        int hashCode = str.hashCode();
        kk.j jVar = f450971f;
        x01.a aVar = (x01.a) ((lt0.f) jVar).get(java.lang.Integer.valueOf(hashCode));
        if (aVar != null) {
            return aVar;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "qamsg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandQALogic", "parse msg failed");
            return null;
        }
        try {
            x01.a aVar2 = new x01.a();
            aVar2.f450972a = (java.lang.String) d17.get(".qamsg.$fromUser");
            aVar2.f450973b = (java.lang.String) d17.get(".qamsg.$fromNickname");
            aVar2.f450974c = (java.lang.String) d17.get(".qamsg.question.content");
            aVar2.f450975d = (java.lang.String) d17.get(".qamsg.answer.content");
            aVar2.f450976e = (java.lang.String) d17.get(".qamsg.answer1.content");
            ((lt0.f) jVar).j(java.lang.Integer.valueOf(hashCode), aVar2);
            return aVar2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BrandQALogic", "parse qamessage xml failed");
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BrandQALogic", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
