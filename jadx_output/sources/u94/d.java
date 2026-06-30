package u94;

/* loaded from: classes4.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f425839d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f425841f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425842g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u94.e f425843h;

    public d(u94.e eVar, int i17, java.lang.String str, int i18, java.lang.String str2) {
        this.f425843h = eVar;
        this.f425839d = i17;
        this.f425840e = str;
        this.f425841f = i18;
        this.f425842g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        u94.e eVar = this.f425843h;
        java.lang.ref.WeakReference weakReference = eVar.f425844a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.w("HalfScreenAddBrandController", "AddContactSceneLandPageEnd, controllerRef is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        java.lang.ref.WeakReference weakReference2 = eVar.f425844a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        u94.f fVar = (u94.f) weakReference2.get();
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w("HalfScreenAddBrandController", "AddContactSceneLandPageEnd, controllerRef get is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        android.content.Context context = fVar.f425848c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        if (u94.f.a(fVar) != null) {
            u94.f.a(fVar).dismiss();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
            fVar.f425851f = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
        }
        com.tencent.mars.xlog.Log.i("HalfScreenAddBrandController", "catch add Contact errCode: %d && errMsg: %s", java.lang.Integer.valueOf(this.f425839d), this.f425840e);
        int i17 = this.f425841f;
        int i18 = this.f425839d;
        java.lang.String str = this.f425840e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        int i19 = eVar.f425845b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd");
        u94.f.b(fVar, context, i17, i18, str, i19, this.f425842g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneLandPageEnd$1");
    }
}
