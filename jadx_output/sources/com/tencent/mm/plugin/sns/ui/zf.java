package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class zf implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsCommentFooter f171690d;

    public zf(com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter) {
        this.f171690d = snsCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsCommentFooter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.ui.SnsCommentFooter snsCommentFooter = this.f171690d;
        snsCommentFooter.setModeClick(true);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("state onClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int i17 = snsCommentFooter.f167107x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        int i18 = snsCommentFooter.f167107x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        if (i18 == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("switchToSmileState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCommentFooter", "switchToSmileState");
            snsCommentFooter.J(true);
            snsCommentFooter.f167107x = 1;
            snsCommentFooter.f167092i.k();
            snsCommentFooter.u();
            snsCommentFooter.Q();
            snsCommentFooter.setToSendTextColor(false);
            snsCommentFooter.f167091h.setImageResource(com.tencent.mm.R.drawable.f481236o2);
            snsCommentFooter.f167091h.setContentDescription(snsCommentFooter.getContext().getString(com.tencent.mm.R.string.axm));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("switchToSmileState", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
            snsCommentFooter.T();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsCommentFooter$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter$7");
    }
}
