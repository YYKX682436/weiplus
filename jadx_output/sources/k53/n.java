package k53;

/* loaded from: classes8.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI f304374d;

    public n(com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI) {
        this.f304374d = gameVideoPreviewUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI = this.f304374d;
        p33.l x17 = gameVideoPreviewUI.f140116f.x(gameVideoPreviewUI.f140124q);
        if (x17 != null) {
            gameVideoPreviewUI.getClass();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(gameVideoPreviewUI.f140114d, 1, true);
            k0Var.f211872n = new k53.p(gameVideoPreviewUI);
            k0Var.f211881s = new k53.q(gameVideoPreviewUI, x17);
            k0Var.f211854d = new k53.r(gameVideoPreviewUI);
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/game/media/preview/GameVideoPreviewUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
