package md3;

/* loaded from: classes7.dex */
public final class s extends lc3.b0 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f325861f = "MBJsApiOpenGameLiteApp";

    @Override // lc3.c0
    public java.lang.String f() {
        return "openGameLiteApp";
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString("url");
        com.tencent.mars.xlog.Log.i(this.f325861f, "url:" + optString);
        java.lang.String optString2 = data.optString("preInjectData");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            kotlin.jvm.internal.o.d(optString2);
            hashMap.put("preInjectData", optString2);
        }
        cl0.g gVar = new cl0.g(hashMap);
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        lc3.e eVar = this.f317890a;
        android.content.Context B0 = eVar != null ? eVar.B0() : null;
        java.lang.String obj = data.toString();
        java.lang.String gVar2 = gVar.toString();
        md3.r rVar = new md3.r(this);
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
        if (B0 == null) {
            B0 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.plugin.game.model.r0 r0Var = new com.tencent.mm.plugin.game.model.r0();
        r0Var.f140430e = optString;
        r0Var.jump_url = optString;
        r53.f.s(B0, r0Var, obj, gVar2, rVar);
    }
}
