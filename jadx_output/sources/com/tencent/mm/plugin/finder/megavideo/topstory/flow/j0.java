package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes10.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 f120945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 q0Var) {
        super(0);
        this.f120945d = q0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.lifecycle.n nVar = androidx.lifecycle.n.INITIALIZED;
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 q0Var = this.f120945d;
        androidx.lifecycle.b0 b0Var = q0Var.f120993f;
        androidx.lifecycle.n nVar2 = b0Var.f11605c;
        if (nVar != nVar2) {
            androidx.lifecycle.n nVar3 = androidx.lifecycle.n.RESUMED;
            androidx.lifecycle.b0 b0Var2 = q0Var.f120993f;
            if (nVar3 == nVar2) {
                b0Var.f(androidx.lifecycle.m.ON_PAUSE);
                b0Var2.f(androidx.lifecycle.m.ON_STOP);
                com.tencent.mars.xlog.Log.w("MicroMsg.MegaVideoFlutterTabLifeCycle", "onDestroy called after resumed!!!");
            }
            b0Var2.f(androidx.lifecycle.m.ON_DESTROY);
        }
        return jz5.f0.f302826a;
    }
}
