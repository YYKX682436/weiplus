package n74;

/* loaded from: classes4.dex */
public class o1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f335408e;

    public o1(java.lang.String str, r45.jj4 jj4Var) {
        this.f335407d = str;
        this.f335408e = jj4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.jj4 jj4Var = this.f335408e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$1");
        try {
            com.tencent.mars.xlog.Log.i("TimeLineAdPreloadHelper", "adVideoPreload, timeline offlineVideo, snsId=" + this.f335407d + ", mediaId=" + jj4Var.f377855d);
            com.tencent.mm.plugin.sns.model.l4.Cj().d(jj4Var, 4, null, com.tencent.mm.storage.s7.f195307k);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1697, 33);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("TimeLineAdPreloadHelper", "adVideoPreload, timeline offlineVideo exp=" + th6.toString());
            ca4.q.c("TimeLineAdPreloadHelper, adVideoPreload", th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.helper.TimeLineAdPreloadHelper$1");
    }
}
