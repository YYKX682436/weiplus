package yw;

/* loaded from: classes7.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final yw.s0 f466453d = new yw.s0();

    public s0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            linkedHashMap.put("isDebug", "1");
        }
        linkedHashMap.put("MagicSclPublicService", ((he3.e) ((ie3.i) i95.n0.c(ie3.i.class))).bj("MagicSclPublicService"));
        java.lang.String Ui = ((cx.j1) ((bx.v) i95.n0.c(bx.v.class))).Ui();
        java.lang.String Ui2 = ((cx.j1) ((bx.r) i95.n0.c(bx.r.class))).Ui();
        try {
            java.lang.String optString = new cl0.g(Ui).optString("version");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            linkedHashMap.put("MagicBrandService", optString);
            java.lang.String optString2 = new cl0.g(Ui2).optString("version");
            kotlin.jvm.internal.o.f(optString2, "optString(...)");
            linkedHashMap.put("MagicAdBrandService", optString2);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BizFlutterDynamicCardHelper", e17, "", new java.lang.Object[0]);
        }
        linkedHashMap.put("supportCoverForAdBrandService", java.lang.Boolean.valueOf(((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Bi("MagicAdBrandService")));
        linkedHashMap.put("supportCoverForBrandService", java.lang.Boolean.valueOf(((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Bi("MagicBrandService")));
        return linkedHashMap;
    }
}
