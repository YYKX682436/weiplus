package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class w7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f114881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114882e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var, android.view.ViewGroup viewGroup) {
        super(0);
        this.f114881d = x7Var;
        this.f114882e = viewGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f114881d;
        if (!((mm2.e1) x7Var.P0(mm2.e1.class)).g7()) {
            return null;
        }
        android.content.Context context = this.f114882e.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new nj2.z(context, x7Var.S0(), x7Var.F, x7Var.C);
    }
}
