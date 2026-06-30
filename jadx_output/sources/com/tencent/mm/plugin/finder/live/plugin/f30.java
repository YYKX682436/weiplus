package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f30 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.i30 f112496d;

    public f30(com.tencent.mm.plugin.finder.live.plugin.i30 i30Var) {
        this.f112496d = i30Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        kotlin.jvm.internal.o.d(bool);
        if (bool.booleanValue()) {
            this.f112496d.u1();
        }
    }
}
