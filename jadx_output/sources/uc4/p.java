package uc4;

/* loaded from: classes4.dex */
public final class p implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.q2 f426440d;

    public p(com.tencent.mm.plugin.sns.model.q2 q2Var) {
        this.f426440d = q2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuItemSelectedListener$1$1");
        gm0.j1.n().f273288b.d(this.f426440d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveCommentClick$clickSelfComment$menuItemSelectedListener$1$1");
    }
}
