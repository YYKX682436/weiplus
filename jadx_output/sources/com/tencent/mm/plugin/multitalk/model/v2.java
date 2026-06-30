package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class v2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.b3 f150192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f150193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f150194f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.tencent.mm.plugin.multitalk.model.b3 b3Var, int i17, int i18) {
        super(0);
        this.f150192d = b3Var;
        this.f150193e = i17;
        this.f150194f = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        rs0.h n17 = rs0.g.n(rs0.i.f399296a, null, null, this.f150193e, this.f150194f, null, 16, null);
        com.tencent.mm.plugin.multitalk.model.b3 b3Var = this.f150192d;
        b3Var.f149892e = n17;
        is0.c cVar = new is0.c(false, 19L);
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar.f294395e);
        surfaceTexture.setOnFrameAvailableListener(new com.tencent.mm.plugin.multitalk.model.u2(b3Var, surfaceTexture));
        b3Var.f149889b = surfaceTexture;
        b3Var.f149890c = new android.view.Surface(b3Var.f149889b);
        b3Var.f149888a = cVar;
        os0.c cVar2 = new os0.c(this.f150193e, this.f150194f, 0, 0, 2, 0, 44, null);
        cVar2.f348012u = false;
        b3Var.f149896i = cVar2;
        return jz5.f0.f302826a;
    }
}
