package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class a2 implements mv2.w0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151022d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f151023e;

    public a2(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f151022d = musicMvMainUIC;
        this.f151023e = appCompatActivity;
    }

    @Override // mv2.w0
    public void onPostErr(long j17, boolean z17) {
        lm3.e eVar;
        fm3.u uVar;
        java.lang.Long l17;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151022d;
        com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "onPostEnd " + j17 + ' ' + z17);
        java.util.ArrayList arrayList = musicMvMainUIC.f150977g;
        if (!(arrayList.size() > 0)) {
            arrayList = null;
        }
        if (arrayList == null || (eVar = (lm3.e) arrayList.get(0)) == null || (uVar = eVar.f319482d) == null || (l17 = uVar.f264121a) == null || l17.longValue() != j17 || z17) {
            return;
        }
        uVar.f264136p = 3;
        pm0.v.X(new com.tencent.mm.plugin.mv.ui.uic.w1(musicMvMainUIC));
    }

    @Override // mv2.w0
    public void onPostFakeOk(long j17) {
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151022d;
        com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "onPostFakeOk " + j17);
        pm0.v.X(new com.tencent.mm.plugin.mv.ui.uic.x1(musicMvMainUIC));
    }

    @Override // mv2.w0
    public void onPostNotify(long j17, boolean z17) {
        com.tencent.mars.xlog.Log.i(this.f151022d.f150974d, "onPostNotify " + j17 + ' ' + z17);
    }

    @Override // mv2.w0
    public void onPostOk(long j17, long j18) {
        lm3.e eVar;
        fm3.u uVar;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151022d;
        java.util.ArrayList arrayList = musicMvMainUIC.f150977g;
        jz5.f0 f0Var = null;
        if (!(arrayList.size() > 0)) {
            arrayList = null;
        }
        if (arrayList != null && (eVar = (lm3.e) arrayList.get(0)) != null && (uVar = eVar.f319482d) != null) {
            com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "onPostOk " + j17 + ' ' + j18);
            java.lang.Long l17 = uVar.f264121a;
            if (l17 != null && l17.longValue() == j17) {
                uVar.f264136p = 4;
                com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(j18);
                if (h17 != null) {
                    uVar.f264140t = h17.getFeedObject();
                    musicMvMainUIC.U6(h17.getId(), h17.getObjectNonceId(), uVar);
                }
                pm0.v.X(new com.tencent.mm.plugin.mv.ui.uic.y1(musicMvMainUIC, this.f151023e));
            } else {
                com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "first item difference local id " + uVar.f264121a + ' ' + j17);
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "onPostOk not found mv " + j17 + ' ' + j18);
        }
    }

    @Override // mv2.w0
    public void onPostStart(long j17) {
        lm3.e eVar;
        fm3.u uVar;
        java.lang.Long l17;
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151022d;
        com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "onPostStart " + j17);
        java.util.ArrayList arrayList = musicMvMainUIC.f150977g;
        if (!(arrayList.size() > 0)) {
            arrayList = null;
        }
        if (arrayList == null || (eVar = (lm3.e) arrayList.get(0)) == null || (uVar = eVar.f319482d) == null || (l17 = uVar.f264121a) == null || l17.longValue() != j17) {
            return;
        }
        uVar.f264136p = 2;
        pm0.v.X(new com.tencent.mm.plugin.mv.ui.uic.z1(musicMvMainUIC));
    }
}
