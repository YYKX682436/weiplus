package up0;

/* loaded from: classes7.dex */
public final class b extends tp0.c {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f429770f = jz5.h.b(new up0.a(this));

    @Override // lc3.c0
    public java.lang.String f() {
        return "insertPagView";
    }

    @Override // tp0.c
    public void z(org.json.JSONObject data, jc3.m coverViewDelegate, yz5.l callback) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(coverViewDelegate, "coverViewDelegate");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (((lc3.s) this.f317890a) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MBJsApiInsertPagView", "hy: no activity provided! fail to insert PAG View");
            callback.invoke(null);
            return;
        }
        lc3.e eVar = this.f317890a;
        kotlin.jvm.internal.o.d(eVar);
        android.content.Context B0 = ((lc3.s) eVar).B0();
        if (B0 == null) {
            B0 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(B0);
        com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(B0);
        mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxMBSwitch()) == 1);
        up0.k.f429791a.a((com.tencent.mm.plugin.appbrand.appstorage.u1) ((jz5.n) this.f429770f).getValue(), data, mMPAGView);
        callback.invoke(mMPAGView);
    }
}
