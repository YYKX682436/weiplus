package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f201876d;

    public k(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f201876d = appAttachNewDownloadUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.Y1;
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = this.f201876d;
        if (appAttachNewDownloadUI.I7()) {
            com.tencent.mm.pluginsdk.model.app.d c76 = appAttachNewDownloadUI.c7();
            if (c76 != null) {
                appAttachNewDownloadUI.f7(false);
                c76.field_status = 101;
                c76.field_lastModifyTime = c01.id.e();
                com.tencent.mm.pluginsdk.model.app.u5.wi().update(c76, new java.lang.String[0]);
            }
            ((kq3.e) ((bx1.s) i95.n0.c(bx1.s.class))).Ai(appAttachNewDownloadUI.f198117v.I0(), appAttachNewDownloadUI.f198117v.y0(), true, appAttachNewDownloadUI.f198117v.getCreateTime());
            appAttachNewDownloadUI.f198112q = new bt3.l0(appAttachNewDownloadUI.f198115t, appAttachNewDownloadUI.f198117v.Q0(), appAttachNewDownloadUI.f198113r, appAttachNewDownloadUI.f198119x);
            c01.d9.e().g(appAttachNewDownloadUI.f198112q);
            d35.h.f226344a.d(appAttachNewDownloadUI.f198117v, appAttachNewDownloadUI.A);
        }
        appAttachNewDownloadUI.E7(false);
        com.tencent.mm.ui.report.b.f209619a.c(appAttachNewDownloadUI.f198117v, null, null, 3, false, false);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$15", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
