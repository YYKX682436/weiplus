package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sg0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wg0 f114259e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg0(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var) {
        super(0);
        this.f114258d = viewGroup;
        this.f114259e = wg0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f114258d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var = this.f114259e;
        return new ni2.e2(context, wg0Var.S0(), new com.tencent.mm.plugin.finder.live.plugin.qg0(wg0Var), new com.tencent.mm.plugin.finder.live.plugin.rg0(wg0Var));
    }
}
