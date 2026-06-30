package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class n7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f113596e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        super(0);
        this.f113595d = viewGroup;
        this.f113596e = x7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f113595d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f113596e;
        return new nj2.h(context, x7Var.S0(), x7Var.F, x7Var.C);
    }
}
