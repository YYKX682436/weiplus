package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f114266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(0);
        this.f114265d = viewGroup;
        this.f114266e = hmVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f114265d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new vg2.t(context, viewGroup, new com.tencent.mm.plugin.finder.live.plugin.rj(this.f114266e));
    }
}
