package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class li implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.oi f113399a;

    public li(com.tencent.mm.plugin.finder.live.plugin.oi oiVar) {
        this.f113399a = oiVar;
    }

    @Override // r35.n3
    public final void a(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFollowGuidePlugin", "#updateForBizMode-follow biz result=" + i17);
        com.tencent.mm.plugin.finder.live.plugin.oi oiVar = this.f113399a;
        oiVar.K0(8);
        oiVar.f113756p.statusChange(qo0.b.E4, null);
    }
}
