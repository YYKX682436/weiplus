package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f206177d;

    public w(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f206177d = appAttachNewDownloadUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.Y1;
        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = this.f206177d;
        if (!appAttachNewDownloadUI.t7()) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
        java.lang.String str = appAttachNewDownloadUI.E;
        ((ht.s) a0Var).getClass();
        if (com.tencent.mm.pluginsdk.model.t3.l(str)) {
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            java.lang.String str2 = appAttachNewDownloadUI.B;
            ((ht.a) vVar).getClass();
            if (!((java.util.ArrayList) com.tencent.mm.pluginsdk.ui.tools.f.f191612a).contains(str2)) {
                appAttachNewDownloadUI.v7(true);
                yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
        }
        ((sy.x) ((ty.m0) i95.n0.c(ty.m0.class))).wi(java.lang.Integer.toString(hashCode()), appAttachNewDownloadUI.E, com.tencent.mm.sdk.platformtools.w2.a(appAttachNewDownloadUI.C), 7L, appAttachNewDownloadUI.g7(), appAttachNewDownloadUI.i5());
        appAttachNewDownloadUI.Q = true;
        ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ri(appAttachNewDownloadUI, 3, new yz5.a() { // from class: com.tencent.mm.ui.chatting.w$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                com.tencent.mm.pluginsdk.model.o2 o2Var;
                com.tencent.mm.ui.chatting.w wVar = com.tencent.mm.ui.chatting.w.this;
                com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI2 = wVar.f206177d;
                if (!appAttachNewDownloadUI2.J1 || (o2Var = appAttachNewDownloadUI2.C1) == null) {
                    jt.v vVar2 = (jt.v) i95.n0.c(jt.v.class);
                    com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI3 = wVar.f206177d;
                    ((ht.a) vVar2).Di(appAttachNewDownloadUI3, appAttachNewDownloadUI3.B, appAttachNewDownloadUI3.C, appAttachNewDownloadUI3.E, 1);
                } else {
                    ((com.tencent.mm.pluginsdk.ui.otherway.u0) o2Var).n(appAttachNewDownloadUI2);
                }
                appAttachNewDownloadUI2.z7(false);
                return null;
            }
        });
        yj0.a.h(this, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
