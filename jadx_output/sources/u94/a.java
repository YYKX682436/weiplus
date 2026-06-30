package u94;

/* loaded from: classes4.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u94.f f425831d;

    public a(u94.f fVar) {
        this.f425831d = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        u94.f fVar = this.f425831d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1");
        try {
            if (((int) u94.f.c(fVar).E2) == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                com.tencent.mm.storage.e8 e8Var = fVar.f425850e;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController");
                ((com.tencent.mm.storage.k4) e8Var).i0(u94.f.c(fVar));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("HalfScreenAddBrandController", th6.toString());
        }
        if (((int) u94.f.c(fVar).E2) <= 0) {
            com.tencent.mars.xlog.Log.e("HalfScreenAddBrandController", "addContact : insert contact failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1");
        } else {
            c01.e2.m0(u94.f.c(fVar));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfScreenAddBrandController$1");
        }
    }
}
