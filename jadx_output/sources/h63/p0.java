package h63;

/* loaded from: classes7.dex */
public final class p0 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f279269a;

    public p0(android.content.Context context) {
        this.f279269a = context;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        if (((com.tencent.mm.plugin.gamelive.GameLiveAppbrandProcessService$EnterFinderLiveResult) appBrandProxyUIProcessTask$ProcessResult).f142011d != 0) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(this.f279269a);
            u1Var.u(i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.a0p));
            u1Var.g(i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.a0o));
            u1Var.m(com.tencent.mm.R.string.a0q);
            u1Var.a(true);
            u1Var.q(false);
        }
    }
}
