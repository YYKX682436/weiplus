package ed4;

/* loaded from: classes4.dex */
public class c implements com.tencent.mm.pluginsdk.ui.span.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f251288a;

    public c(com.tencent.mm.plugin.sns.ui.bs bsVar) {
        this.f251288a = new java.lang.ref.WeakReference(bsVar);
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.c1
    public void a(android.view.View view, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.q1 q1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$NickNameClickableCallBack");
        com.tencent.mm.plugin.sns.ui.bs bsVar = (com.tencent.mm.plugin.sns.ui.bs) this.f251288a.get();
        if (bsVar != null && (q1Var = bsVar.f168055u) != null) {
            if (obj instanceof ca4.h ? ((ca4.h) obj).f39934a : false) {
                q1Var.f170293b = 0;
            } else {
                q1Var.f170293b = 6;
            }
            q1Var.a(view, obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$NickNameClickableCallBack");
    }
}
