package nd1;

/* loaded from: classes7.dex */
public class h2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 150;
    public static final java.lang.String NAME = "switchTab";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, final int i17) {
        final com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        final java.lang.String optString = jSONObject.optString("url");
        if (!yVar.getRuntime().m0().e().a(optString)) {
            yVar.a(i17, o("fail:can not switch to non-TabBar page"));
            return;
        }
        final java.lang.String optString2 = jSONObject.optString("routeId");
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: nd1.h2$$a
            @Override // java.lang.Runnable
            public final void run() {
                nd1.h2 h2Var = nd1.h2.this;
                h2Var.getClass();
                com.tencent.mm.plugin.appbrand.y yVar2 = yVar;
                com.tencent.mm.plugin.appbrand.page.i3 x07 = yVar2.getRuntime().x0();
                boolean v17 = x07.v(com.tencent.mm.plugin.appbrand.page.wd.SWITCH_TAB);
                int i18 = i17;
                if (!v17) {
                    yVar2.a(i18, h2Var.o("fail:can not switch in current page environment"));
                } else {
                    x07.c0(new com.tencent.mm.plugin.appbrand.page.o4(x07, optString, null, optString2));
                    yVar2.a(i18, h2Var.o("ok"));
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
