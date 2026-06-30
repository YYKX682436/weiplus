package d84;

/* loaded from: classes4.dex */
public final class f implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d84.j0 f227057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f227058e;

    public f(d84.j0 j0Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f227057d = j0Var;
        this.f227058e = snsInfo;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleInteractType$1$1$1");
        l44.e0 e0Var = (l44.e0) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleInteractType$1$1$1");
        d84.j0 j0Var = this.f227057d;
        java.lang.String j17 = j0Var.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("interactType is ");
        sb6.append(e0Var);
        sb6.append(", model snsId is ");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f227058e;
        sb6.append(snsInfo.getSnsId());
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(snsInfo.field_snsId));
        sb6.append(", mInPAGPlayingPeriod is ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        boolean z17 = j0Var.W;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i(j17, sb6.toString());
        if (e0Var == l44.e0.f316102p) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            boolean z18 = j0Var.W;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
            if (!z18) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                j0Var.W = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMInPAGPlayingPeriod$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                java.lang.String j18 = j0Var.j();
                try {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                    android.os.Handler handler = j0Var.Y;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMUIHandler$p", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                    handler.post(new d84.e(j0Var));
                } catch (java.lang.Throwable th6) {
                    ca4.q.c(j18, th6);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleInteractType$1$1$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("emit", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent$handleInteractType$1$1$1");
        return f0Var;
    }
}
