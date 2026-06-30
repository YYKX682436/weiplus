package n74;

/* loaded from: classes4.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f335412e;

    public p1(java.lang.String str, r45.jj4 jj4Var) {
        this.f335411d = str;
        this.f335412e = jj4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.jj4 jj4Var = this.f335412e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$2");
        try {
            com.tencent.mars.xlog.Log.i("TimeLineAdPreloadHelper", "startPreloadThumb, snsId=" + this.f335411d + ", mediaId=" + jj4Var.f377855d);
            ca4.s0 s0Var = new ca4.s0(jj4Var);
            s0Var.d(1);
            s0Var.e(jj4Var.f377855d);
            com.tencent.mm.plugin.sns.model.l4.Cj().d(jj4Var, jj4Var.f377856e == 6 ? 5 : 1, s0Var, com.tencent.mm.storage.s7.f195307k);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("TimeLineAdPreloadHelper", "startPreloadThumb exp=" + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, startPreloadThumb", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$2");
    }
}
