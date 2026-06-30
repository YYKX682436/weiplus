package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sh0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f114262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.th0 f114263e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh0(android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.plugin.th0 th0Var) {
        super(0);
        this.f114262d = viewGroup;
        this.f114263e = th0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f114262d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.widget.bw bwVar = new com.tencent.mm.plugin.finder.live.widget.bw(context);
        com.tencent.mm.plugin.finder.live.plugin.th0 plugin = this.f114263e;
        bwVar.f117924h = new com.tencent.mm.plugin.finder.live.plugin.rh0(plugin);
        kotlin.jvm.internal.o.g(plugin, "plugin");
        bwVar.f117925i = plugin;
        return bwVar;
    }
}
