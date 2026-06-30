package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public final class r implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.t f115658d;

    public r(com.tencent.mm.plugin.finder.live.util.t tVar) {
        this.f115658d = tVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.finder.live.util.t.a(this.f115658d);
        com.tencent.mars.xlog.Log.i("Finder.ContinuousClickManager", "ContinuousClickManager Timer callback: clickCnt = " + this.f115658d.f115685g + ", state = " + this.f115658d.f115683e.name() + ", lastClickCnt = " + this.f115658d.f115686h);
        if (this.f115658d.f115686h != this.f115658d.f115685g) {
            int i17 = this.f115658d.f115685g - this.f115658d.f115686h;
            com.tencent.mm.plugin.finder.live.util.t tVar = this.f115658d;
            tVar.f115686h = tVar.f115685g;
            if (i17 < 0) {
                com.tencent.mm.plugin.finder.live.util.t tVar2 = this.f115658d;
                com.tencent.mm.plugin.finder.live.util.n nVar = com.tencent.mm.plugin.finder.live.util.n.f115631d;
                tVar2.e(nVar);
                com.tencent.mm.plugin.finder.live.util.t tVar3 = this.f115658d;
                com.tencent.mm.plugin.finder.live.util.m mVar = tVar3.f115690l;
                if (mVar != null) {
                    com.tencent.mm.plugin.finder.live.util.m.b(mVar, tVar3.f115692n, this.f115658d.f115685g, 0, nVar, this.f115658d.f115684f, false, this.f115658d.f115689k, 32, null);
                }
                return false;
            }
            com.tencent.mm.plugin.finder.live.util.t tVar4 = this.f115658d;
            com.tencent.mm.plugin.finder.live.util.m mVar2 = tVar4.f115690l;
            if (mVar2 != null) {
                com.tencent.mm.plugin.finder.live.util.m.b(mVar2, tVar4.f115692n, this.f115658d.f115685g, i17, this.f115658d.f115683e, this.f115658d.f115684f, false, this.f115658d.f115689k, 32, null);
            }
            com.tencent.mm.plugin.finder.live.util.r2 r2Var = this.f115658d.f115693o;
            r2Var.a("onTimerExpired", i17, r2Var.b(true));
        }
        com.tencent.mm.plugin.finder.live.util.t tVar5 = this.f115658d;
        if (!tVar5.f115688j || java.lang.System.currentTimeMillis() - tVar5.f115687i < 3000) {
            return true;
        }
        com.tencent.mm.plugin.finder.live.util.t tVar6 = this.f115658d;
        com.tencent.mm.plugin.finder.live.util.n nVar2 = com.tencent.mm.plugin.finder.live.util.n.f115631d;
        tVar6.e(nVar2);
        com.tencent.mm.plugin.finder.live.util.t tVar7 = this.f115658d;
        com.tencent.mm.plugin.finder.live.util.m mVar3 = tVar7.f115690l;
        if (mVar3 == null) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.util.m.b(mVar3, tVar7.f115692n, this.f115658d.f115685g, 0, nVar2, this.f115658d.f115684f, false, this.f115658d.f115689k, 32, null);
        return false;
    }
}
