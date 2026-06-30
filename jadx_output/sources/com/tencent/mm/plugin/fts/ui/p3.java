package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes3.dex */
public class p3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI f138142d;

    public p3(com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI fTSWXPayNotifyUI) {
        this.f138142d = fTSWXPayNotifyUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI.f137999v;
        com.tencent.mm.plugin.fts.ui.FTSWXPayNotifyUI fTSWXPayNotifyUI = this.f138142d;
        fTSWXPayNotifyUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSServiceNotifyUI", "onSearchDateDetail");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("detail_username", "gh_3dfda90e39d6");
        j45.l.u(fTSWXPayNotifyUI, "com.tencent.mm.chatroom.ui.SelectDateUI", intent, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(27229, 1, 3, "", 0, 0, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSWXPayNotifyUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
