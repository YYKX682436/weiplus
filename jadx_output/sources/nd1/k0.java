package nd1;

/* loaded from: classes7.dex */
public final class k0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 170;
    private static final java.lang.String NAME = "reLaunch";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, final int i17) {
        final com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        final java.lang.String optString = jSONObject.optString("url");
        final java.lang.String optString2 = jSONObject.optString("routeId", null);
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: nd1.k0$$a
            @Override // java.lang.Runnable
            public final void run() {
                nd1.k0 k0Var = nd1.k0.this;
                k0Var.getClass();
                com.tencent.mm.plugin.appbrand.y yVar2 = yVar;
                com.tencent.mm.plugin.appbrand.page.i3 x07 = yVar2.getRuntime().x0();
                boolean v17 = x07.v(com.tencent.mm.plugin.appbrand.page.wd.RE_LAUNCH);
                int i18 = i17;
                if (!v17) {
                    yVar2.a(i18, k0Var.o("fail:can not reLaunch in current page environment"));
                } else {
                    x07.c0(new com.tencent.mm.plugin.appbrand.page.l4(x07, optString, false, optString2));
                    yVar2.a(i18, k0Var.o("ok"));
                }
            }
        };
        if ((yVar instanceof com.tencent.mm.plugin.appbrand.page.v5) || !yVar.getRuntime().Q1()) {
            runnable.run();
        } else {
            yVar.getRuntime().I1(runnable);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public boolean z() {
        return true;
    }
}
