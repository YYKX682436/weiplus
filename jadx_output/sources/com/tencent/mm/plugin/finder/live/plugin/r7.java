package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class r7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f114107e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        super(0);
        this.f114106d = viewGroup;
        this.f114107e = x7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f114106d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new qi2.w(context, this.f114107e);
    }
}
