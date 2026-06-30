package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class o70 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.u70 f119272d;

    public o70(com.tencent.mm.plugin.finder.live.widget.u70 u70Var) {
        this.f119272d = u70Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str;
        com.tencent.mm.plugin.finder.live.widget.u70 u70Var = this.f119272d;
        u70Var.a7();
        if (!zl2.r4.f473950a.T1((r45.q12) obj) && (str = (java.lang.String) ((kotlinx.coroutines.flow.h3) ((mm2.g1) u70Var.business(mm2.g1.class)).f329075p).getValue()) != null) {
            com.tencent.mm.plugin.finder.live.widget.u70.Z6(u70Var, "liveMode", str);
        }
        return jz5.f0.f302826a;
    }
}
