package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class v7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114679d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f114680e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v7(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        super(0);
        this.f114679d = viewGroup;
        this.f114680e = x7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f114679d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f114680e;
        return new qi2.j1(context, x7Var.C, x7Var.F);
    }
}
