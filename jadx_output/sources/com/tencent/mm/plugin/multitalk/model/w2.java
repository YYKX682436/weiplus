package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.b3 f150198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(com.tencent.mm.plugin.multitalk.model.b3 b3Var) {
        super(0);
        this.f150198d = b3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.multitalk.model.b3 b3Var = this.f150198d;
        os0.c cVar = b3Var.f149896i;
        if (cVar != null) {
            cVar.f348010s = null;
        }
        android.view.Surface surface = b3Var.f149890c;
        if (surface != null) {
            surface.release();
        }
        android.graphics.SurfaceTexture surfaceTexture = b3Var.f149889b;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        is0.c cVar2 = b3Var.f149888a;
        if (cVar2 != null) {
            cVar2.close();
        }
        os0.c cVar3 = b3Var.f149896i;
        if (cVar3 != null) {
            cVar3.n();
        }
        rs0.h hVar = b3Var.f149892e;
        if (hVar != null) {
            rs0.i.f399296a.u(hVar);
        }
        return jz5.f0.f302826a;
    }
}
