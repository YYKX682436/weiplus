package u94;

/* loaded from: classes4.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u94.k f425867d;

    public j(u94.k kVar) {
        this.f425867d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        u94.k kVar = this.f425867d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$3$1");
        try {
            u94.p pVar = kVar.f425872h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
            com.tencent.mm.ui.widget.dialog.u3 u3Var = pVar.f425884b;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
            if (u3Var == null) {
                android.content.Context context = kVar.f425871g;
                if ((context instanceof android.app.Activity) && !((android.app.Activity) context).isFinishing()) {
                    u94.p pVar2 = kVar.f425872h;
                    com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(kVar.f425871g, "", "加载中", true, true, null);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$102", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                    pVar2.f425884b = Q;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$102", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController");
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("HalfSubscribeController", th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.controller.HalfSubscribeController$3$1");
    }
}
