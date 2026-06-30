package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class q implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.t f115649d;

    public q(com.tencent.mm.plugin.finder.live.util.t tVar) {
        this.f115649d = tVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        if (this.f115649d.f115688j) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.util.t.a(this.f115649d);
        com.tencent.mars.xlog.Log.i("Finder.ContinuousClickManager", "ContinuousClickManager longClickTimer callback: clickCnt = " + this.f115649d.f115685g + ", state = " + this.f115649d.f115683e.name() + ", lastClickCnt = " + this.f115649d.f115686h);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.util.p(this.f115649d));
        return true;
    }
}
