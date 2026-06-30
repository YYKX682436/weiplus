package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class qk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rk f119530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f119531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f119532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f119533g;

    public qk(com.tencent.mm.plugin.finder.live.widget.rk rkVar, java.lang.String str, java.util.Map map, kotlinx.coroutines.q qVar) {
        this.f119530d = rkVar;
        this.f119531e = str;
        this.f119532f = map;
        this.f119533g = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView = this.f119530d.f119654b;
        if (magicRewardView != null) {
            magicRewardView.setRepeatCount(0);
        }
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView2 = this.f119530d.f119654b;
        if (magicRewardView2 != null) {
            magicRewardView2.setGiftName(this.f119531e);
        }
        com.tencent.mm.plugin.finder.live.widget.rk rkVar = this.f119530d;
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView3 = rkVar.f119654b;
        if (magicRewardView3 != null) {
            com.tencent.mm.plugin.finder.live.widget.pk pkVar = new com.tencent.mm.plugin.finder.live.widget.pk(rkVar, this.f119533g);
            synchronized (magicRewardView3.f125500m) {
                magicRewardView3.f125500m.add(pkVar);
            }
        }
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView4 = this.f119530d.f119654b;
        if (magicRewardView4 != null) {
            magicRewardView4.setVisibility(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("playGiftAnim magicRewardView isShow:");
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView5 = this.f119530d.f119654b;
        sb6.append(magicRewardView5 != null ? java.lang.Boolean.valueOf(magicRewardView5.isShown()) : null);
        sb6.append(" play params:");
        sb6.append(this.f119532f);
        com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayMagicRewardWidget", sb6.toString());
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView6 = this.f119530d.f119654b;
        if (magicRewardView6 != null) {
            magicRewardView6.f(this.f119532f);
        }
        this.f119530d.f119653a.u1();
    }
}
