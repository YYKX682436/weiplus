package w64;

/* loaded from: classes4.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f443294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo f443295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f443296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f443297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ w64.n f443298h;

    public f(w64.n nVar, android.content.Context context, com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        this.f443298h = nVar;
        this.f443294d = context;
        this.f443295e = adClickActionInfo;
        this.f443296f = snsInfo;
        this.f443297g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$3");
        android.content.Context context = this.f443294d;
        if (context != null) {
            try {
                com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, true, 0);
                u94.p pVar = new u94.p();
                android.content.Context context2 = this.f443294d;
                com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = this.f443295e;
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f443296f;
                int i17 = this.f443297g;
                w64.n nVar = this.f443298h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                w64.k kVar = nVar.f443325r;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
                k0Var.s(pVar.a(context2, adClickActionInfo, k0Var, snsInfo, i17, kVar, Bi), true);
                k0Var.e(true);
                k0Var.v();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("AdClickActionHandler", th6.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler$3");
    }
}
