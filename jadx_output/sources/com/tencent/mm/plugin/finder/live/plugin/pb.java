package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class pb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113852d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.tb f113853e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pb(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.tb tbVar) {
        super(0);
        this.f113852d = viewGroup;
        this.f113853e = tbVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f113852d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        return new se2.a0(context, 0, this.f113853e);
    }
}
