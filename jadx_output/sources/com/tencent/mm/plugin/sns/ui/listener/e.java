package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class e implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.q2 f169773d;

    public e(com.tencent.mm.plugin.sns.ui.listener.f fVar, com.tencent.mm.plugin.sns.model.q2 q2Var) {
        this.f169773d = q2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$2$1");
        gm0.j1.i();
        gm0.j1.n().f273288b.d(this.f169773d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.listener.TimeLineMMMenuItemSelectedListener$2$1");
    }
}
