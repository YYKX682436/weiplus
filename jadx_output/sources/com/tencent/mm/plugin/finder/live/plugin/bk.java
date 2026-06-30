package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bk extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.hm f112044e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.hm hmVar) {
        super(0);
        this.f112043d = viewGroup;
        this.f112044e = hmVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup viewGroup = this.f112043d;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new vg2.r1(context, viewGroup, new com.tencent.mm.plugin.finder.live.plugin.ak(this.f112044e), null);
    }
}
