package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class f implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f169776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.c f169777b;

    public f(com.tencent.mm.plugin.sns.ui.listener.c cVar, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f169777b = cVar;
        this.f169776a = snsInfo;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.plugin.sns.model.q2 q2Var;
        java.lang.String str2;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$2");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f169776a;
        java.lang.String snsId = snsInfo.getSnsId();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.plugin.sns.ui.listener.c cVar = this.f169777b;
        android.view.View view = cVar.f169754e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
        com.tencent.mm.plugin.sns.ui.u1 u1Var = (com.tencent.mm.plugin.sns.ui.u1) view.getTag();
        if (u1Var != null) {
            boolean e17 = com.tencent.mm.plugin.sns.storage.w2.e(snsId);
            r45.e86 e86Var = u1Var.f170557e;
            if (e17) {
                q2Var = new com.tencent.mm.plugin.sns.model.q2(com.tencent.mm.plugin.sns.storage.w2.n(snsId), 6, e86Var);
                gm0.j1.i();
                gm0.j1.n().f273288b.g(q2Var);
            } else {
                q2Var = new com.tencent.mm.plugin.sns.model.q2(com.tencent.mm.plugin.sns.storage.w2.n(snsId), 4, e86Var);
                gm0.j1.i();
                gm0.j1.n().f273288b.g(q2Var);
            }
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(com.tencent.mm.plugin.sns.ui.listener.c.a(cVar), com.tencent.mm.plugin.sns.ui.listener.c.a(cVar).getString(com.tencent.mm.R.string.f490573yv), com.tencent.mm.plugin.sns.ui.listener.c.a(cVar).getString(com.tencent.mm.R.string.j9z), true, true, new com.tencent.mm.plugin.sns.ui.listener.e(this, q2Var));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            cVar.f169760n = Q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$202", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            if (e86Var != null) {
                i17 = e86Var.f373132m;
                str2 = e86Var.f373126d;
            } else {
                str2 = "";
                i17 = 0;
            }
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.I(snsInfo, i17, str2, 1);
            ad4.g gVar = ad4.g.f3183a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            android.view.View view2 = cVar.f169754e;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            gVar.a(view2, 0);
            ta4.y0 y0Var = ta4.y0.f416863a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            java.lang.String str3 = cVar.f169755f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener");
            y0Var.d(9, str3, 2, u1Var.f170556d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDialogClick", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$2");
    }
}
