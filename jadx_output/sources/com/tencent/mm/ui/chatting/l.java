package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f201914d;

    public l(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f201914d = appAttachNewDownloadUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.ui.chatting.l$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.U6(com.tencent.mm.ui.chatting.l.this.f201914d);
                return null;
            }
        };
        int i17 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.Y1;
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = this.f201914d;
        boolean z17 = false;
        if (appAttachNewDownloadUI.C.contains(".apk")) {
            com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(appAttachNewDownloadUI.getContext(), 1, 2, false);
            z2Var.m(appAttachNewDownloadUI.getResources().getString(com.tencent.mm.R.string.f490347sg), appAttachNewDownloadUI.getResources().getString(com.tencent.mm.R.string.f489792bt));
            z2Var.o(0);
            com.tencent.mm.ui.bk.r0(z2Var.C.getPaint(), 0.8f);
            z2Var.v(appAttachNewDownloadUI.getResources().getColor(com.tencent.mm.R.color.a0c));
            com.tencent.mm.ui.chatting.m mVar = new com.tencent.mm.ui.chatting.m(appAttachNewDownloadUI, z2Var);
            com.tencent.mm.ui.chatting.n nVar = new com.tencent.mm.ui.chatting.n(appAttachNewDownloadUI, aVar, z2Var);
            z2Var.D = mVar;
            z2Var.E = nVar;
            z2Var.q(appAttachNewDownloadUI.getString(com.tencent.mm.R.string.dt9));
            android.widget.TextView textView = new android.widget.TextView(appAttachNewDownloadUI);
            textView.setText(com.tencent.mm.R.string.dt8);
            textView.setTextColor(appAttachNewDownloadUI.getColor(com.tencent.mm.R.color.f478719fa));
            textView.setTextSize(14.0f);
            z2Var.j(textView);
            z2Var.C();
            z17 = true;
        }
        if (!z17) {
            com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.U6(appAttachNewDownloadUI);
        }
        com.tencent.mm.ui.report.b.f209619a.c(appAttachNewDownloadUI.f198117v, null, null, 1, false, false);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$16", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
