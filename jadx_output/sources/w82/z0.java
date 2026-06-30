package w82;

/* loaded from: classes11.dex */
public final class z0 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnFocusChangeListener f443949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel f443950e;

    public z0(android.view.View.OnFocusChangeListener onFocusChangeListener, com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel) {
        this.f443949d = onFocusChangeListener;
        this.f443950e = favTopTagPanel;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f443949d;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("core editTextView onFocus change = ");
        sb6.append(z17);
        sb6.append(", panelChange = ");
        com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel = this.f443950e;
        sb6.append(favTopTagPanel.f101562p1);
        com.tencent.mars.xlog.Log.i("MicroMsg.FavTopTagPanel", sb6.toString());
        if (z17) {
            if (!favTopTagPanel.f101562p1) {
                favTopTagPanel.getEditTextView().setCursorVisible(true);
            }
            favTopTagPanel.f101562p1 = false;
        } else {
            favTopTagPanel.f();
        }
        w82.p0 p0Var = favTopTagPanel.T;
        if (p0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "[onFocusChange] hasFocus = " + z17);
            com.tencent.mm.plugin.fav.ui.z7 z7Var = ((com.tencent.mm.plugin.fav.ui.v7) p0Var).f101492a;
            if (!z17) {
                z7Var.d();
                return;
            }
            if (z7Var.f101665k.getVisibility() == 0) {
                com.tencent.mm.plugin.fav.ui.MaxHeightFrameLayout maxHeightFrameLayout = z7Var.f101667m;
                if (maxHeightFrameLayout != null) {
                    maxHeightFrameLayout.startAnimation(com.tencent.mm.plugin.fav.ui.z7.b(z7Var));
                } else {
                    kotlin.jvm.internal.o.o("mFlRvContains");
                    throw null;
                }
            }
        }
    }
}
