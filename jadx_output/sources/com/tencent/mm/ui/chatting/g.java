package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f200514d;

    public g(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f200514d = appAttachNewDownloadUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zh1.v0 v0Var = this.f200514d.O1;
        if (v0Var != null) {
            v0Var.r();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
