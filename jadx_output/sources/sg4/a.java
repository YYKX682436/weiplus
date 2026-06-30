package sg4;

/* loaded from: classes7.dex */
public final class a extends tg4.a {
    @Override // lc3.c0
    public java.lang.String f() {
        return "insertPagView";
    }

    @Override // tg4.a
    public android.view.View x(android.content.Context context, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context);
        mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxMBSwitch()) == 1);
        return new com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer(context, mMPAGView);
    }

    @Override // tg4.a
    public boolean y(int i17, android.view.View view, org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(data, "data");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) ((com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer) view).d(com.tencent.mm.view.MMPAGView.class);
        if (mMPAGView == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MBJsApiInsertPagView", "onInsertView(viewId : " + i17 + ") failed, targetView is null");
            return false;
        }
        xg4.p pVar = (xg4.p) this.f317890a;
        if (pVar == null) {
            return false;
        }
        pVar.J1();
        up0.j jVar = up0.k.f429791a;
        xg4.p pVar2 = (xg4.p) this.f317890a;
        com.tencent.mm.plugin.appbrand.appstorage.u1 b17 = pVar2 != null ? pVar2.J1().b() : null;
        kotlin.jvm.internal.o.d(b17);
        return jVar.a(b17, data, mMPAGView);
    }
}
