package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pg0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wg0 f113881e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg0(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var) {
        super(0);
        this.f113880d = viewGroup;
        this.f113881e = wg0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f113880d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.plugin.wg0 wg0Var = this.f113881e;
        return new fh2.g(context, wg0Var.S0(), new com.tencent.mm.plugin.finder.live.plugin.ng0(wg0Var), new com.tencent.mm.plugin.finder.live.plugin.og0(wg0Var));
    }
}
