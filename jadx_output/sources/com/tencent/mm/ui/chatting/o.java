package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f202043d;

    public o(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f202043d = appAttachNewDownloadUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "cancel receive file");
        int i17 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.Y1;
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = this.f202043d;
        appAttachNewDownloadUI.y7(14, -1);
        ((ot.g) ((pt.g0) i95.n0.c(pt.g0.class))).vj(appAttachNewDownloadUI.f198117v, null, 5, true);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(appAttachNewDownloadUI.f198115t, appAttachNewDownloadUI.f198117v);
        appAttachNewDownloadUI.E7(false);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
