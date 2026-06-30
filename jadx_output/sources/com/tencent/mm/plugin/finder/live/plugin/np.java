package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class np extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dq f113669d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np(com.tencent.mm.plugin.finder.live.plugin.dq dqVar) {
        super(0);
        this.f113669d = dqVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hideGiftSendAgainLayout: curGiftId:");
        com.tencent.mm.plugin.finder.live.plugin.dq dqVar = this.f113669d;
        sb6.append(dqVar.f112325r);
        sb6.append(", curComboId:");
        sb6.append(dqVar.f112330w);
        sb6.append(", curSongName: ");
        sb6.append(dqVar.f112326s);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftSendPlugin", sb6.toString());
        java.util.Map map = dqVar.K;
        java.lang.String str = dqVar.f112330w;
        if (str == null) {
            str = "";
        }
        ((java.util.HashMap) map).put(str, java.lang.Boolean.TRUE);
        java.lang.String str2 = dqVar.f112325r;
        com.tencent.mm.plugin.finder.live.plugin.dq.v1(dqVar, str2 == null ? "" : str2, dqVar.f112330w, dqVar.f112326s, dqVar.f112329v, 0);
        android.os.Bundle bundle = dqVar.f112323p1;
        if (bundle != null) {
            bundle.putInt("PARAM_FINDER_LIVE_GIFT_SEND_TOTAL_CNT", dqVar.f112322p0);
        }
        dqVar.f112330w = "";
        dqVar.f112333y = false;
        dqVar.f112322p0 = 0;
        dqVar.f365323d.animate().alpha(0.0f).setListener(new com.tencent.mm.plugin.finder.live.plugin.mp(dqVar)).start();
        com.tencent.mm.plugin.finder.live.util.t tVar = dqVar.N;
        if (tVar != null) {
            tVar.d(com.tencent.mm.plugin.finder.live.plugin.dq.t1(dqVar));
        }
        ((je2.t) dqVar.P0(je2.t.class)).f299269o.postValue(new jz5.l(java.lang.Boolean.FALSE, dqVar.f112323p1));
        dqVar.f112323p1 = null;
        return jz5.f0.f302826a;
    }
}
