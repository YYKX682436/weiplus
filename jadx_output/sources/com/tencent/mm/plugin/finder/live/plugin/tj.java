package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class tj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f114410e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(0);
        this.f114409d = viewGroup;
        this.f114410e = hmVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f114409d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new vg2.a0(context, viewGroup, this.f114410e.Q1);
    }
}
