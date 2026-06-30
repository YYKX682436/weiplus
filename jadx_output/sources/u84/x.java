package u84;

/* loaded from: classes4.dex */
public final class x implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.f0 f425685d;

    public x(u84.f0 f0Var) {
        this.f425685d = f0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$requestDynamicData$1$1");
        i64.p pVar = (i64.p) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$requestDynamicData$1$1");
        u84.f0 f0Var = this.f425685d;
        java.lang.String j17 = f0Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe numberTitle = ");
        sb6.append(pVar != null ? pVar.a() : null);
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        if (pVar == null || (a17 = pVar.a()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdHotDiscussedBarInfo$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
            u84.h0 h0Var = f0Var.f425525w;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdHotDiscussedBarInfo$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
            a17 = h0Var != null ? h0Var.a() : null;
        }
        if (!(a17 == null || a17.length() == 0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMDescTextView", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
            android.widget.TextView z17 = f0Var.z();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMDescTextView", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
            java.lang.CharSequence text = z17 != null ? z17.getText() : null;
            if (text == null) {
                text = "";
            }
            if (!a17.equals(text)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMDescTextView", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
                android.widget.TextView z18 = f0Var.z();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMDescTextView", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent");
                if (z18 != null) {
                    z18.setText(a17);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$requestDynamicData$1$1");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHotDiscussedBarComponent$requestDynamicData$1$1");
        return f0Var2;
    }
}
