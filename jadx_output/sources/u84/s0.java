package u84;

/* loaded from: classes4.dex */
public final class s0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u84.m1 f425664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f425665e;

    public s0(u84.m1 m1Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f425664d = m1Var;
        this.f425665e = snsInfo;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        long j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1$1");
        l44.e0 e0Var = (l44.e0) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1$1");
        u84.m1 m1Var = this.f425664d;
        java.lang.String j18 = m1Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("interactType is ");
        sb6.append(e0Var);
        sb6.append(", stateTriggerType is ");
        u84.o1 y17 = u84.m1.y(m1Var);
        sb6.append(y17 != null ? new java.lang.Integer(y17.b()) : null);
        sb6.append(", model snsId is ");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f425665e;
        sb6.append(snsInfo.getSnsId());
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(snsInfo.field_snsId));
        com.tencent.mars.xlog.Log.i(j18, sb6.toString());
        u84.o1 y18 = u84.m1.y(m1Var);
        boolean z17 = false;
        if (!(y18 != null && y18.b() == 0)) {
            u84.o1 y19 = u84.m1.y(m1Var);
            if (y19 != null && y19.b() == 1) {
                z17 = true;
            }
            if (z17 && e0Var == l44.e0.f316102p && ca4.m0.Y(snsInfo)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsDoAlphaAnimation$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                boolean z18 = m1Var.L;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsDoAlphaAnimation$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                if (!z18) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsDoAlphaAnimation$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                    m1Var.L = true;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsDoAlphaAnimation$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                    android.os.Handler handler = m1Var.M;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent");
                    u84.r0 r0Var = new u84.r0(m1Var);
                    u84.o1 y27 = u84.m1.y(m1Var);
                    if (y27 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStateTriggerTime", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
                        j17 = y27.f425636k;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStateTriggerTime", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarInfo");
                    } else {
                        j17 = 3000;
                    }
                    handler.postDelayed(r0Var, j17);
                }
            }
        } else if (e0Var == l44.e0.f316093d) {
            android.view.ViewGroup B = u84.m1.B(m1Var);
            if (B != null) {
                B.setVisibility(4);
            }
            android.view.ViewGroup A = u84.m1.A(m1Var);
            if (A != null) {
                A.setVisibility(0);
            }
        } else if (e0Var == l44.e0.f316094e) {
            android.view.ViewGroup B2 = u84.m1.B(m1Var);
            if (B2 != null) {
                B2.setVisibility(0);
            }
            android.view.ViewGroup A2 = u84.m1.A(m1Var);
            if (A2 != null) {
                A2.setVisibility(4);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdStateSettingBarComponent$handleInteractType$1$1$1");
        return f0Var;
    }
}
