package dd4;

/* loaded from: classes4.dex */
public final class u {
    public u(kotlin.jvm.internal.i iVar) {
    }

    public final fk4.k a(xc4.p pVar, r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createResourceDownloader", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$Companion");
        dd4.s a17 = dd4.s.f229045k.a(jj4Var);
        int i17 = pVar.h1().CreateTime;
        java.lang.String W0 = pVar.W0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLegacyPlayerReporter", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLegacyPlayerReporter", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        xd4.i0 i0Var = new xd4.i0(jj4Var, i17, W0, a17.f229048b, a17);
        if (com.tencent.mm.plugin.sns.model.y6.a()) {
            i0Var.o(true);
            i0Var.n(30);
        } else {
            i0Var.o(false);
            i0Var.n(31);
        }
        fk4.k kVar = new fk4.k(i0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTpReporter", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTpReporter", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        kVar.b(a17.f229047a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLegacyPlayerReporter", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLegacyPlayerReporter", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleReporter");
        kVar.b(a17.f229048b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createResourceDownloader", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleResourceHelper$Companion");
        return kVar;
    }
}
