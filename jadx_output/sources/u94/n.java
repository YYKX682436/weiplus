package u94;

/* loaded from: classes4.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f425876d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u94.o f425877e;

    public n(u94.o oVar, android.content.Context context) {
        this.f425877e = oVar;
        this.f425876d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f425876d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$3");
        try {
            if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                u94.o oVar = this.f425877e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = oVar.f425879e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                db5.t7.g(context, adClickActionInfo.f162607t);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("HalfSubscribeController", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$3");
    }
}
