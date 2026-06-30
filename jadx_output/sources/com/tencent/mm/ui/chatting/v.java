package com.tencent.mm.ui.chatting;

/* loaded from: classes3.dex */
public class v implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f202759d;

    public v(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f202759d = appAttachNewDownloadUI;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$26", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = this.f202759d;
        if (appAttachNewDownloadUI.S1 == null) {
            appAttachNewDownloadUI.S1 = new rl5.r(appAttachNewDownloadUI.getContext());
        }
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI2 = this.f202759d;
        appAttachNewDownloadUI2.S1.h(view, appAttachNewDownloadUI2, appAttachNewDownloadUI2.V1, appAttachNewDownloadUI2.T1, appAttachNewDownloadUI2.U1);
        yj0.a.i(true, this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$26", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
