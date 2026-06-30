package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class m7 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f113469d;

    public m7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        this.f113469d = x7Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            this.f113469d.E1();
        }
    }
}
