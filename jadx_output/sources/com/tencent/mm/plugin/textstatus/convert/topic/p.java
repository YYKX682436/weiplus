package com.tencent.mm.plugin.textstatus.convert.topic;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.convert.topic.e f173335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f173336e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.plugin.textstatus.convert.topic.e eVar, in5.s0 s0Var) {
        super(0);
        this.f173335d = eVar;
        this.f173336e = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.textstatus.convert.topic.e eVar = this.f173335d;
        xm3.n0 n0Var = new xm3.n0();
        java.lang.Object obj = this.f173336e.f293121e;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        return new com.tencent.mm.plugin.mvvmlist.MvvmList(eVar, n0Var, (androidx.lifecycle.y) obj, null, null, 24, null);
    }
}
