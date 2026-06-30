package oy3;

/* loaded from: classes13.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI f350037d;

    public o(com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI) {
        this.f350037d = rtosWatchLoginUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.E;
        com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = this.f350037d;
        rtosWatchLoginUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "save privacy flag");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINOF_WATCH_READ_PRIVACY_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        rtosWatchLoginUI.D.postUI(new oy3.v(rtosWatchLoginUI));
        if (com.tencent.mm.sdk.platformtools.t8.K0(rtosWatchLoginUI.f158601s)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Rtos.RtosWatchLoginUI", "mac address is empty");
        } else {
            fy3.e eVar = (fy3.e) i95.n0.c(fy3.e.class);
            java.lang.String scanMac = rtosWatchLoginUI.f158601s;
            my3.q qVar = (my3.q) eVar;
            qVar.getClass();
            kotlin.jvm.internal.o.g(scanMac, "scanMac");
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "startLogin scanMac ".concat(scanMac));
            qVar.Ri(fy3.i.f267250i);
            com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193057e, new com.tencent.mm.ipcinvoker.type.IPCVoid(), iy3.f.class, new my3.m(qVar, scanMac));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/rtos/ui/RtosWatchLoginUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
