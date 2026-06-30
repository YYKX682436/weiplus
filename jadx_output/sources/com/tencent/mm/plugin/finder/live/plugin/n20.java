package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class n20 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.t20 f113584d;

    public n20(com.tencent.mm.plugin.finder.live.plugin.t20 t20Var) {
        this.f113584d = t20Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            this.f113584d.u1();
        }
    }
}
