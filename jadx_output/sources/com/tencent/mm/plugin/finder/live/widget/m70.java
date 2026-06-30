package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class m70 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.u70 f119051d;

    public m70(com.tencent.mm.plugin.finder.live.widget.u70 u70Var) {
        this.f119051d = u70Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            com.tencent.mm.plugin.finder.live.widget.u70 u70Var = this.f119051d;
            if (r4Var.T1((r45.q12) ((kotlinx.coroutines.flow.h3) ((mm2.g1) u70Var.business(mm2.g1.class)).f329068f).getValue())) {
                com.tencent.mm.plugin.finder.live.widget.u70.Z6(u70Var, "gameLiveCoverUrl", str);
            }
        }
        return jz5.f0.f302826a;
    }
}
