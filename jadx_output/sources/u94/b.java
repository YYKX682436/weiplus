package u94;

/* loaded from: classes4.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f425832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f425833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f425834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425835g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ u94.c f425836h;

    public b(u94.c cVar, int i17, int i18, com.tencent.mm.modelbase.m1 m1Var, java.lang.String str) {
        this.f425836h = cVar;
        this.f425832d = i17;
        this.f425833e = i18;
        this.f425834f = m1Var;
        this.f425835g = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        u94.c cVar = this.f425836h;
        java.lang.ref.WeakReference weakReference = cVar.f425837d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.w("HalfScreenAddBrandController", "AddContactSceneEnd, controllerRef is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd$1");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        java.lang.ref.WeakReference weakReference2 = cVar.f425837d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        u94.f fVar = (u94.f) weakReference2.get();
        if (fVar == null) {
            com.tencent.mars.xlog.Log.w("HalfScreenAddBrandController", "AddContactSceneEnd, controllerRef get is null");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd$1");
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
        if (this.f425832d == 0 && this.f425833e == 0) {
            com.tencent.mm.modelbase.m1 m1Var = this.f425834f;
            if (m1Var.getType() == 30) {
                str = ((com.tencent.mm.pluginsdk.model.m3) ((ns.l) m1Var)).J();
            } else if (m1Var.getType() == 667) {
                str = ((l41.o) ((ab0.s) m1Var)).f315884f;
            }
            int i17 = this.f425832d;
            int i18 = this.f425833e;
            java.lang.String str2 = this.f425835g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
            int i19 = cVar.f425838e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
            u94.f.b(fVar, context, i17, i18, str2, i19, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd$1");
        }
        str = "";
        int i172 = this.f425832d;
        int i182 = this.f425833e;
        java.lang.String str22 = this.f425835g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        int i192 = cVar.f425838e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd");
        u94.f.b(fVar, context, i172, i182, str22, i192, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$AddContactSceneEnd$1");
    }
}
