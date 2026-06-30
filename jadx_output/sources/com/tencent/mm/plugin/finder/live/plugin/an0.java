package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class an0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f111908d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.wn0 f111909e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an0(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var) {
        super(0);
        this.f111908d = viewGroup;
        this.f111909e = wn0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f111908d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.plugin.wn0 wn0Var = this.f111909e;
        return new com.tencent.mm.plugin.finder.live.wish.widget.t0(context, wn0Var, wn0Var, wn0Var, wn0Var.R0());
    }
}
