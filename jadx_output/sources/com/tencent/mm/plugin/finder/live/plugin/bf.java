package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bf extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f112027e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        super(0);
        this.f112026d = viewGroup;
        this.f112027e = mgVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f112026d.findViewById(com.tencent.mm.R.id.f4w);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new cn2.y0((android.view.ViewGroup) findViewById, this.f112027e);
    }
}
