package lc4;

/* loaded from: classes4.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f317967d;

    public j(java.util.ArrayList arrayList) {
        this.f317967d = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$executeDeleteFeedResource$1");
        for (java.lang.Long l17 : this.f317967d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("executeDeleteFeedResource feed id:");
            kotlin.jvm.internal.o.d(l17);
            sb6.append(ca4.z0.s0(l17.longValue()));
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.DataUIC", sb6.toString());
            com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(l17.longValue());
            if (W0 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Improve.DataUIC", "can't get sns info");
            } else {
                com.tencent.mm.plugin.sns.storage.n2.f166079a.a(W0);
                synchronized (jm0.k.f300270i) {
                    gm0.j1.b().c();
                    if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                        throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                    }
                    a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
                }
                ((zc4.g) ((zc4.h) a17).P6(zc4.g.class)).X6(W0.localid, l17.longValue(), W0.getCreateTime());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveDataUIC$executeDeleteFeedResource$1");
    }
}
