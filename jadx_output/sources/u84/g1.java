package u84;

/* loaded from: classes4.dex */
public final class g1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f425533d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f425534e;

    public g1(u84.m1 m1Var, android.content.Context context) {
        this.f425533d = m1Var;
        this.f425534e = context;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1$1");
        i64.p pVar = (i64.p) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1$1");
        u84.m1 m1Var = this.f425533d;
        java.lang.String j17 = m1Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observe numberTitle = ");
        sb6.append(pVar != null ? pVar.a() : null);
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        if (pVar == null || (a17 = pVar.a()) == null) {
            u84.o1 y17 = u84.m1.y(m1Var);
            a17 = y17 != null ? y17.a() : null;
        }
        if (!(a17 == null || a17.length() == 0)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMStateSettingTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
            android.widget.TextView I = m1Var.I();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMStateSettingTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
            java.lang.CharSequence text = I != null ? I.getText() : null;
            if (text == null) {
                text = "";
            }
            if (!a17.equals(text)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMStateSettingTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                android.widget.TextView I2 = m1Var.I();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMStateSettingTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                if (I2 != null) {
                    I2.setText(a17);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMStateSettingTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                android.widget.TextView I3 = m1Var.I();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMStateSettingTitle", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                android.content.Context context = this.f425534e;
                float b17 = i65.a.b(context, 14) * i65.a.q(context);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAvailableWidth$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                float f17 = m1Var.I;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAvailableWidth$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                ca4.m0.b(context, I3, b17, f17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$requestDynamicData$1$1");
        return f0Var;
    }
}
