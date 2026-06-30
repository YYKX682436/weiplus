package w82;

/* loaded from: classes11.dex */
public final class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel f443812d;

    public a1(com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel) {
        this.f443812d = favTopTagPanel;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fav/ui/widget/FavTopTagPanel$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopTagPanel", "core editTextView onClick");
        java.lang.String str = com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel.f101559x1;
        com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel = this.f443812d;
        favTopTagPanel.getEditTextView().setCursorVisible(true);
        w82.n0 n0Var = favTopTagPanel.U;
        if (n0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[on input panel edit text click]");
            com.tencent.mm.plugin.fav.ui.z7 z7Var = ((com.tencent.mm.plugin.fav.ui.o7) n0Var).f101321a;
            if (z7Var.f101665k.getVisibility() == 0) {
                com.tencent.mm.plugin.fav.ui.MaxHeightFrameLayout maxHeightFrameLayout = z7Var.f101667m;
                if (maxHeightFrameLayout == null) {
                    kotlin.jvm.internal.o.o("mFlRvContains");
                    throw null;
                }
                maxHeightFrameLayout.startAnimation(com.tencent.mm.plugin.fav.ui.z7.b(z7Var));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fav/ui/widget/FavTopTagPanel$init$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
