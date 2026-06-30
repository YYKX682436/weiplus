package qc1;

/* loaded from: classes7.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f361460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f361461e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f361462f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qc1.e f361463g;

    public d(qc1.e eVar, com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.Integer num, int i17) {
        this.f361463g = eVar;
        this.f361460d = lVar;
        this.f361461e = num;
        this.f361462f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f361460d;
        if (lVar.isRunning()) {
            qc1.e eVar = this.f361463g;
            eVar.getClass();
            if (lVar instanceof com.tencent.mm.plugin.appbrand.page.v5) {
                v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
            } else if (lVar instanceof com.tencent.mm.plugin.appbrand.e9) {
                v5Var = ((com.tencent.mm.plugin.appbrand.e9) lVar).t3().x0().getCurrentPage().getCurrentPageView();
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHideKeyboard", "invalid component type while calling hide keyboard");
                v5Var = null;
            }
            lVar.a(this.f361462f, eVar.o(com.tencent.mm.plugin.appbrand.widget.input.r1.d(v5Var, this.f361461e) ? "ok" : "fail:input not exists"));
        }
    }
}
