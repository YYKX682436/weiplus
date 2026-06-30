package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class xx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f171591d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.zx f171592e;

    public xx(com.tencent.mm.plugin.sns.ui.zx zxVar) {
        this.f171592e = zxVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$2");
        com.tencent.mm.plugin.sns.ui.zx zxVar = this.f171592e;
        if (com.tencent.mm.plugin.sns.ui.zx.a(zxVar) != null && com.tencent.mm.plugin.sns.ui.zx.a(zxVar).getCount() > zxVar.f171720a) {
            int top = com.tencent.mm.plugin.sns.ui.zx.b(zxVar).getTop();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            zxVar.f171724e = top;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            int c17 = (com.tencent.mm.plugin.sns.ui.zx.c(zxVar) - 0) - zxVar.f171721b;
            com.tencent.mm.plugin.sns.ui.zx.c(zxVar);
            com.tencent.mm.plugin.sns.ui.zx.a(zxVar).getBottom();
            com.tencent.mm.plugin.sns.ui.zx.a(zxVar).getTop();
            com.tencent.mm.plugin.sns.ui.zx.c(zxVar);
            if (c17 == this.f171591d) {
                com.tencent.mm.plugin.sns.ui.zx.a(zxVar).setSelectionFromTop(zxVar.f171720a + com.tencent.mm.plugin.sns.ui.zx.a(zxVar).getHeaderViewsCount(), c17);
                this.f171591d = 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                zxVar.f171726g = 0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$210", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                int i17 = zxVar.f171726g;
                zxVar.f171726g = i17 - 1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$210", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                if (i17 > 0) {
                    new com.tencent.mm.sdk.platformtools.n3().postDelayed(this, 100L);
                    this.f171591d = c17;
                } else {
                    this.f171591d = 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                    zxVar.f171726g = 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$2");
    }
}
