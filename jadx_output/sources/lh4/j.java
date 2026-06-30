package lh4;

/* loaded from: classes8.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lh4.l f318717d;

    public j(lh4.l lVar) {
        this.f318717d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionMusicGuideView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lh4.l lVar = this.f318717d;
        lVar.getClass();
        o11.g gVar = gh4.j0.f271933a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TaskBarConfig", "recordMusicGuideClicked");
        com.tencent.mm.sdk.platformtools.o4.M("taskbar_config").putBoolean("music_guide_clicked", true);
        ((rk4.p6) ((qk.e9) i95.n0.c(qk.e9.class))).Di(1134);
        com.tencent.mm.plugin.taskbar.ui.TaskBarView taskBarView = (com.tencent.mm.plugin.taskbar.ui.TaskBarView) lVar.getCallback();
        taskBarView.u(17, false, false, null);
        taskBarView.G2 = 19;
        taskBarView.E2 = true;
        ku5.u0 u0Var = ku5.t0.f312615d;
        lh4.k kVar = new lh4.k(lVar);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(kVar, 0L, false);
        yj0.a.h(this, "com/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionMusicGuideView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
