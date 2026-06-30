package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class b10 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.f10 f111960d;

    public b10(com.tencent.mm.plugin.finder.live.plugin.f10 f10Var) {
        this.f111960d = f10Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.qm1 qm1Var = (r45.qm1) obj;
        com.tencent.mm.plugin.finder.live.plugin.f10 f10Var = this.f111960d;
        java.lang.String tag = f10Var.f112481q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("curBoxObserver ");
        sb6.append(qm1Var != null ? qm1Var.getString(1) : null);
        java.lang.String str = sb6.toString();
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(str, "str");
        com.tencent.mars.xlog.Log.i(tag, "liveDataLog ".concat(str));
        f10Var.u1("");
    }
}
