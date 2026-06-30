package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class d implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f169766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.c f169767b;

    public d(com.tencent.mm.plugin.sns.ui.listener.c cVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f169767b = cVar;
        this.f169766a = snsInfo;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        int i17;
        java.lang.String str2;
        r45.e86 e86Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.plugin.sns.ui.listener.c cVar = this.f169767b;
        android.view.View view = cVar.f169754e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.plugin.sns.ui.u1 u1Var = (com.tencent.mm.plugin.sns.ui.u1) view.getTag();
        if (u1Var == null || (e86Var = u1Var.f170557e) == null) {
            i17 = 0;
            str2 = "";
        } else {
            i17 = e86Var.f373132m;
            str2 = e86Var.f373126d;
        }
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.I(this.f169766a, i17, str2, 2);
        ta4.y0 y0Var = ta4.y0.f416863a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        java.lang.String str3 = cVar.f169755f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        y0Var.d(9, str3, 2, u1Var.f170556d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$1");
    }
}
