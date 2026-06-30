package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class wx implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.zx f171466d;

    public wx(com.tencent.mm.plugin.sns.ui.zx zxVar) {
        this.f171466d = zxVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$1");
        com.tencent.mm.plugin.sns.ui.zx zxVar = this.f171466d;
        if (com.tencent.mm.plugin.sns.ui.zx.a(zxVar) != null && com.tencent.mm.plugin.sns.ui.zx.a(zxVar).getCount() > zxVar.f171720a) {
            int top = com.tencent.mm.plugin.sns.ui.zx.b(zxVar).getTop();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            com.tencent.mm.plugin.sns.ui.zx.b(zxVar).getHeight();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$210", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            int i17 = zxVar.f171726g;
            zxVar.f171726g = i17 - 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$210", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            if (i17 > 0) {
                if (com.tencent.mm.plugin.sns.ui.zx.c(zxVar) != top || top > zxVar.f171723d - 200 || com.tencent.mm.plugin.sns.ui.zx.a(zxVar).getBottom() > (zxVar.f171723d - com.tencent.mm.plugin.sns.ui.zx.b(zxVar).getHeight()) + org.chromium.net.NetError.ERR_SSL_PINNED_KEY_NOT_IN_CERT_CHAIN) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                    int i18 = zxVar.f171726g;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
                    new com.tencent.mm.sdk.platformtools.n3().postDelayed(this, i18 != 0 ? 10 : 200);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            zxVar.f171724e = top;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            int c17 = (com.tencent.mm.plugin.sns.ui.zx.c(zxVar) + 0) - zxVar.f171721b;
            com.tencent.mm.plugin.sns.ui.zx.c(zxVar);
            com.tencent.mm.plugin.sns.ui.zx.a(zxVar).getBottom();
            com.tencent.mm.plugin.sns.ui.zx.a(zxVar).getTop();
            com.tencent.mm.plugin.sns.ui.zx.c(zxVar);
            com.tencent.mm.plugin.sns.ui.zx.a(zxVar).setSelectionFromTop(zxVar.f171720a + com.tencent.mm.plugin.sns.ui.zx.a(zxVar).getHeaderViewsCount(), c17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation$1");
    }
}
