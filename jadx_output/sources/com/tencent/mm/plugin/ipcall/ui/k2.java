package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes4.dex */
public class k2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI f142888d;

    public k2(com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI iPCallMsgUI) {
        this.f142888d = iPCallMsgUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.ipcall.ui.IPCallMsgUI iPCallMsgUI = this.f142888d;
        s83.g gVar = (s83.g) iPCallMsgUI.f142633e.getItem(i17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(gVar.field_descUrl)) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13780, java.lang.Integer.valueOf(gVar.field_msgType));
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", gVar.field_descUrl);
            intent.putExtra("showShare", false);
            j45.l.j(iPCallMsgUI, "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
