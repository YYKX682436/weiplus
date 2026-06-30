package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f202651d;

    public s(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f202651d = appAttachNewDownloadUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = this.f202651d;
        java.lang.String str = appAttachNewDownloadUI.E;
        ((ht.s) a0Var).getClass();
        if (com.tencent.mm.pluginsdk.model.t3.l(str)) {
            ((sy.x) ((ty.m0) i95.n0.c(ty.m0.class))).wi(java.lang.Integer.toString(hashCode()), appAttachNewDownloadUI.E, com.tencent.mm.sdk.platformtools.w2.a(appAttachNewDownloadUI.C), 13L, appAttachNewDownloadUI.g7(), appAttachNewDownloadUI.i5());
            appAttachNewDownloadUI.v7(true);
        } else {
            ((sy.x) ((ty.m0) i95.n0.c(ty.m0.class))).wi(java.lang.Integer.toString(hashCode()), appAttachNewDownloadUI.E, com.tencent.mm.sdk.platformtools.w2.a(appAttachNewDownloadUI.C), 7L, appAttachNewDownloadUI.g7(), appAttachNewDownloadUI.i5());
            appAttachNewDownloadUI.Q = true;
            ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).Di(appAttachNewDownloadUI, appAttachNewDownloadUI.B, appAttachNewDownloadUI.C, appAttachNewDownloadUI.E, appAttachNewDownloadUI.f198114s);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
