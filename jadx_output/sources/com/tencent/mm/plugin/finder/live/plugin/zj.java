package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class zj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f115350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f115351e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(0);
        this.f115350d = viewGroup;
        this.f115351e = hmVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f115350d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f115351e;
        return new vg2.r1(context, viewGroup, new com.tencent.mm.plugin.finder.live.plugin.xj(hmVar), new com.tencent.mm.plugin.finder.live.plugin.yj(hmVar));
    }
}
