package qe;

/* loaded from: classes7.dex */
public final class j implements com.tencent.mm.plugin.appbrand.jsruntime.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe.m f361965d;

    public j(qe.m mVar) {
        this.f361965d = mVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.x
    public final void onDestroy() {
        ((com.tencent.mm.weapp_core.WsBinding) ((jz5.n) this.f361965d.f361974a).getValue()).destroy();
    }
}
