package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class t7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f114351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        super(0);
        this.f114351d = x7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nj2.f fVar;
        nj2.w wVar;
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f114351d;
        nj2.z B1 = x7Var.B1();
        if (B1 != null && B1.q()) {
            nj2.z B12 = x7Var.B1();
            if (B12 != null && (wVar = B12.f337878u) != null) {
                nj2.z zVar = wVar.f337864a;
                if (zVar.q()) {
                    nj2.r y17 = zVar.y();
                    y17.getClass();
                    pm0.v.X(new nj2.l(y17));
                    zVar.z().r("onTimerUpdateData");
                    zVar.f337879v.c();
                }
            }
        } else {
            nj2.h w17 = x7Var.w1();
            if (w17 != null && w17.P()) {
                nj2.h w18 = x7Var.w1();
                if (w18 != null && (fVar = w18.S) != null) {
                    nj2.h hVar = fVar.f337832a;
                    if (hVar.P()) {
                        nj2.j e07 = nj2.h.e0(hVar);
                        e07.getClass();
                        pm0.v.X(new nj2.l(e07));
                        ((mj2.f) ((jz5.n) hVar.N).getValue()).r("onTimerUpdateData");
                    }
                }
            } else {
                if (x7Var.A1().q()) {
                    x7Var.A1().z();
                }
                if (x7Var.v1().q()) {
                    x7Var.v1().z();
                }
                if (x7Var.w0() == 0) {
                    x7Var.L1();
                }
                if (x7Var.z1().q()) {
                    x7Var.z1().H();
                }
                if (x7Var.y1().q()) {
                    x7Var.y1().H();
                }
                if (((mm2.o4) x7Var.P0(mm2.o4.class)).Z == null) {
                    jz5.g gVar = x7Var.K;
                    if (((qi2.n) ((jz5.n) gVar).getValue()).q()) {
                        ((qi2.n) ((jz5.n) gVar).getValue()).a();
                    }
                    jz5.g gVar2 = x7Var.f115035J;
                    if (((qi2.n) ((jz5.n) gVar2).getValue()).q()) {
                        ((qi2.n) ((jz5.n) gVar2).getValue()).a();
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
