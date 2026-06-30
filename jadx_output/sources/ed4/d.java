package ed4;

/* loaded from: classes4.dex */
public class d implements com.tencent.mm.pluginsdk.ui.span.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f251290a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f251291b;

    public d(com.tencent.mm.plugin.sns.ui.bs bsVar, java.lang.String str) {
        this.f251290a = new java.lang.ref.WeakReference(bsVar);
        this.f251291b = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.c1
    public void a(android.view.View view, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.q1 q1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$NickNameClickableReportCallBack");
        com.tencent.mm.plugin.sns.ui.bs bsVar = (com.tencent.mm.plugin.sns.ui.bs) this.f251290a.get();
        if (bsVar != null && (q1Var = bsVar.f168055u) != null) {
            q1Var.f170293b = 0;
            q1Var.a(view, obj);
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).hj(this.f251291b, 6L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$NickNameClickableReportCallBack");
    }
}
