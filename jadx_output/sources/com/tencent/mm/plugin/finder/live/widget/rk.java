package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class rk {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.kn f119653a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.reward.view.MagicRewardView f119654b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f119655c;

    public rk(com.tencent.mm.plugin.finder.live.plugin.kn plugin) {
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f119653a = plugin;
    }

    public final void a(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayMagicRewardWidget", source.concat(" hideGift"));
        d75.b.g(new com.tencent.mm.plugin.finder.live.widget.nk(this));
    }
}
