package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class sl implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.tl f170476d;

    public sl(com.tencent.mm.plugin.sns.ui.tl tlVar) {
        this.f170476d = tlVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$3$1");
        com.tencent.mm.plugin.sns.ui.tl tlVar = this.f170476d;
        tlVar.f170528d.f167267d.setVisibility(8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.ui.SnsMsgUI snsMsgUI = tlVar.f170528d;
        android.view.View view = snsMsgUI.f167274n;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsMsgUI$3$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsMsgUI$3$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        snsMsgUI.Y = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$802", "com.tencent.mm.plugin.sns.ui.SnsMsgUI");
        com.tencent.mm.plugin.sns.storage.w1 Aj = com.tencent.mm.plugin.sns.model.l4.Aj();
        Aj.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("delAll", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        Aj.f166156d.A("SnsComment", "delete from SnsComment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("delAll", "com.tencent.mm.plugin.sns.storage.SnsCommentStorage");
        snsMsgUI.enableOptionMenu(snsMsgUI.n7());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsMsgUI$3$1");
    }
}
