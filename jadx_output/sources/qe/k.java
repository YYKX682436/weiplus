package qe;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.t f361970d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qe.m f361971e;

    public k(com.tencent.mm.plugin.appbrand.jsruntime.t tVar, qe.m mVar) {
        this.f361970d = tVar;
        this.f361971e = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.appbrand.jsruntime.u h07 = this.f361970d.h0(com.tencent.mm.plugin.appbrand.jsruntime.l0.class);
        kotlin.jvm.internal.o.f(h07, "getAddon(...)");
        com.tencent.mm.plugin.appbrand.jsruntime.l0 l0Var = (com.tencent.mm.plugin.appbrand.jsruntime.l0) h07;
        ((com.tencent.mm.weapp_core.WsBinding) ((jz5.n) this.f361971e.f361974a).getValue()).tempInit(l0Var.L(), l0Var.G());
    }
}
