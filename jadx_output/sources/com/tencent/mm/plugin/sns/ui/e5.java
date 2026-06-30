package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class e5 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.LocationWidget f168223d;

    public e5(com.tencent.mm.plugin.sns.ui.LocationWidget locationWidget) {
        this.f168223d = locationWidget;
    }

    @Override // i11.c
    public boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ui.LocationWidget$3");
        if (!z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ui.LocationWidget$3");
            return true;
        }
        int i18 = com.tencent.mm.plugin.sns.ui.LocationWidget.f166329J;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        this.f168223d.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        ((u90.v) ((v90.x) i95.n0.c(v90.x.class))).wi(2003, f17, f18, 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.LocationWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetLocation", "com.tencent.mm.plugin.sns.ui.LocationWidget$3");
        return false;
    }
}
