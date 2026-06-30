package oh4;

/* loaded from: classes8.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oh4.j f345469d;

    public h(oh4.j jVar) {
        this.f345469d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gp1.q controller;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/section/music/TaskBarSectionAudioPanelView$updateRedDotArea$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        controller = this.f345469d.getController();
        ((ip1.q) controller).getClass();
        bw5.vq0 vq0Var = ip1.q.f293603h;
        java.lang.String str = null;
        bw5.xb0 xb0Var = vq0Var != null ? vq0Var.f34466f[1] ? vq0Var.f34464d : new bw5.xb0() : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRedDotAreaClick， syncItem, type:");
        sb6.append(xb0Var != null ? java.lang.Integer.valueOf(xb0Var.f35045e) : null);
        sb6.append(", title:");
        sb6.append(xb0Var != null ? xb0Var.getTitle() : null);
        sb6.append(", id:");
        sb6.append(xb0Var != null ? xb0Var.b() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.AudioPanelTaskBarController", sb6.toString());
        ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).getClass();
        int i17 = jm4.f4.f300382d;
        jm4.e4 e4Var = (jm4.e4) urgen.ur_0025.UR_E533.UR_1332();
        if (e4Var != null) {
            urgen.ur_0025.UR_E533.UR_DD55(((jm4.f4) e4Var).getCppPointer());
        }
        java.lang.Integer valueOf = xb0Var != null ? java.lang.Integer.valueOf(xb0Var.f35045e) : null;
        boolean z17 = false;
        boolean z18 = (valueOf != null && valueOf.intValue() == 5) || (valueOf != null && valueOf.intValue() == 7);
        if (xb0Var != null && xb0Var.f35045e == 6) {
            z17 = true;
        }
        if (xb0Var != null) {
            str = xb0Var.f35053p[9] ? xb0Var.f35052o : "";
        }
        np1.a Ai = ((ov.b) ((pv.z) i95.n0.c(pv.z.class))).Ai();
        pv.z zVar = (pv.z) i95.n0.c(pv.z.class);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_enter_tab", z18 ? 2 : 1);
        bundle.putString("key_red_dot_buffer", str);
        bundle.putBoolean("key_enter_my_album", z17);
        ((ov.b) zVar).N9(1, Ai, 7, bundle, new ip1.i());
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/section/music/TaskBarSectionAudioPanelView$updateRedDotArea$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
