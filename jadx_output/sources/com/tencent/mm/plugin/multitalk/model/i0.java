package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.s0 f149998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f149999e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.tencent.mm.plugin.multitalk.model.s0 s0Var, yz5.a aVar) {
        super(0);
        this.f149998d = s0Var;
        this.f149999e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitalk.model.s0 s0Var = this.f149998d;
        yz5.a aVar = this.f149999e;
        s0Var.getClass();
        s0Var.f150114f = rs0.g.n(rs0.i.f399296a, null, null, 1, 1, null, 16, null);
        is0.c cVar = new is0.c(false, 19L);
        s0Var.f150115g = cVar;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar.f294395e);
        s0Var.f150120o = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(com.tencent.mm.plugin.multitalk.model.j0.f150018d);
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.multitalk.model.k0(aVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkCameraManager", "init create mulititalk camera PboSurfaceRender");
        return jz5.f0.f302826a;
    }
}
