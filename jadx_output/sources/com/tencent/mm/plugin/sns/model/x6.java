package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class x6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f164758a = true;

    public void a(java.lang.String str, boolean z17, int i17, long j17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doSpecificFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
        if (i18 == 2) {
            this.f164758a = false;
            com.tencent.mm.plugin.sns.model.s5.f164675c = 0L;
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.n3(str, j17, z17, i17, 0, 0, z17 ? 4 : 8, 2));
        } else if (i18 == 1) {
            gm0.j1.i();
            gm0.j1.u().c().w(68377, "");
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.h3(j17, 0L, 0));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doSpecificFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
    }

    public void b(java.lang.String str, boolean z17, int i17, long j17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doUpFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
        if (i18 == 2) {
            com.tencent.mm.plugin.sns.model.s5.f164675c = com.tencent.mm.plugin.sns.model.s5.f164673a;
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.n3(str, com.tencent.mm.plugin.sns.model.s5.f164673a, z17, i17, 1, 0, z17 ? 4 : 8, 2));
        } else if (i18 == 1) {
            gm0.j1.i();
            gm0.j1.u().c().w(68377, "");
            gm0.j1.i();
            gm0.j1.n().f273288b.g(new com.tencent.mm.plugin.sns.model.h3(0L, j17, 1));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doUpFetch", "com.tencent.mm.plugin.sns.model.SnsUpDownServerHelper");
    }
}
