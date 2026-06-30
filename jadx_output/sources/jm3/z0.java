package jm3;

/* loaded from: classes8.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.MusicMvPostUI f300371d;

    public z0(com.tencent.mm.plugin.mv.ui.MusicMvPostUI musicMvPostUI) {
        this.f300371d = musicMvPostUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/MusicMvPostUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.mv.ui.MusicMvPostUI.f150882n;
        com.tencent.mm.plugin.mv.ui.MusicMvPostUI musicMvPostUI = this.f300371d;
        musicMvPostUI.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) musicMvPostUI, 1, false);
        k0Var.l(musicMvPostUI.getContext().getResources().getColor(com.tencent.mm.R.color.f478518a0));
        k0Var.t(true);
        k0Var.f211872n = new jm3.s0(musicMvPostUI);
        k0Var.f211881s = new jm3.t0(musicMvPostUI, k0Var);
        k0Var.f211854d = jm3.u0.f300356d;
        k0Var.v();
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/MusicMvPostUI$onCreate$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
