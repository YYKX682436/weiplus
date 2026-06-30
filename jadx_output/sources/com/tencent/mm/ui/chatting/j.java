package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f201862d;

    public j(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f201862d = appAttachNewDownloadUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = this.f201862d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp roundProgressBar downloadAppAttachScene[%s]", appAttachNewDownloadUI.f198112q);
        bt3.l0 l0Var = appAttachNewDownloadUI.f198112q;
        if (l0Var != null) {
            l0Var.M(appAttachNewDownloadUI);
            gm0.j1.d().d(appAttachNewDownloadUI.f198112q);
            appAttachNewDownloadUI.f198112q = null;
            appAttachNewDownloadUI.y7(15, -1);
        } else {
            com.tencent.mm.pluginsdk.model.app.d c76 = appAttachNewDownloadUI.c7();
            if (c76 != null) {
                long j17 = c76.field_status;
                if (j17 != 199) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "summerapp roundProgressBar onClick but scene is null and set status[%d] paused", java.lang.Long.valueOf(j17));
                    c76.field_status = 102L;
                    c76.field_lastModifyTime = c01.id.e();
                    com.tencent.mm.pluginsdk.model.app.u5.wi().update(c76, new java.lang.String[0]);
                    appAttachNewDownloadUI.y7(15, -1);
                }
            }
            d35.h.f226344a.a(appAttachNewDownloadUI.f198117v);
        }
        appAttachNewDownloadUI.E7(false);
        com.tencent.mm.ui.report.b.f209619a.c(appAttachNewDownloadUI.f198117v, null, null, 2, false, false);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$14", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
