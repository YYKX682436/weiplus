package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f202593d;

    public q(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f202593d = appAttachNewDownloadUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ty.m0 m0Var = (ty.m0) i95.n0.c(ty.m0.class);
        java.lang.String num = java.lang.Integer.toString(hashCode());
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = this.f202593d;
        ((sy.x) m0Var).wi(num, appAttachNewDownloadUI.E, com.tencent.mm.sdk.platformtools.w2.a(appAttachNewDownloadUI.C), 7L, appAttachNewDownloadUI.g7(), appAttachNewDownloadUI.i5());
        appAttachNewDownloadUI.Q = true;
        jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI2 = this.f202593d;
        java.lang.String str = appAttachNewDownloadUI2.B;
        java.lang.String str2 = appAttachNewDownloadUI2.C;
        java.lang.String str3 = appAttachNewDownloadUI2.E;
        ((ht.a) vVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.f.l(appAttachNewDownloadUI2, str, str2, str3, 1, 1);
        appAttachNewDownloadUI.z7(false);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$21", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
