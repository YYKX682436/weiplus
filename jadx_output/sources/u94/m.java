package u94;

/* loaded from: classes4.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f425874d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u94.o f425875e;

    public m(u94.o oVar, android.content.Context context) {
        this.f425875e = oVar;
        this.f425874d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f425874d;
        u94.o oVar = this.f425875e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$2");
        try {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
            w64.k kVar = oVar.f425882h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
            com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = oVar.f425879e;
            if (kVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                w64.k kVar2 = oVar.f425882h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                kVar2.a(adClickActionInfo);
            }
            if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd");
                db5.t7.h(context, adClickActionInfo.f162609u);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("HalfSubscribeController", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$SubScribeSceneEnd$2");
    }
}
