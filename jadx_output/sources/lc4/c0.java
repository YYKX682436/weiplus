package lc4;

/* loaded from: classes4.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lc4.d0 f317952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f317953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ua6 f317954f;

    public c0(lc4.d0 d0Var, int i17, r45.ua6 ua6Var) {
        this.f317952d = d0Var;
        this.f317953e = i17;
        this.f317954f = ua6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader$onSceneEnd$1");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(zc4.h.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(zc4.h.class);
        }
        zc4.g gVar = (zc4.g) ((zc4.h) a17).P6(zc4.g.class);
        lc4.d0 d0Var = this.f317952d;
        d0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLiveList", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader");
        java.util.List c76 = gVar.c7(new ym3.c(d0Var.f317955d.f152073w.get(), 0, this.f317953e, new lc4.b0(ca4.z0.s0(((com.tencent.mm.protocal.protobuf.SnsObject) this.f317954f.f387170f.getFirst()).Id), ca4.z0.s0(((com.tencent.mm.protocal.protobuf.SnsObject) this.f317954f.f387170f.getLast()).Id), 0, 0, 12, null)));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(c76, 10));
        java.util.Iterator it = c76.iterator();
        while (it.hasNext()) {
            arrayList.add(new zc4.b((xc4.p) it.next(), false, 2, null));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.UnreadLoader", "preload form db size:" + arrayList.size());
        this.f317952d.b().clear();
        this.f317952d.b().addAll(arrayList);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.data.ImproveUnreadLoader$onSceneEnd$1");
    }
}
