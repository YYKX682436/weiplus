package ee5;

/* loaded from: classes9.dex */
public final class j1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.n1 f251935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251936e;

    public j1(ee5.n1 n1Var, android.view.View view) {
        this.f251935d = n1Var;
        this.f251936e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ee5.n1 n1Var = this.f251935d;
        n1Var.getClass();
        android.view.View view2 = this.f251936e;
        contextMenu.add(0, 0, 0, view2.getContext().getString(com.tencent.mm.R.string.i29));
        contextMenu.add(0, n1Var.f252049e, 0, view2.getContext().getString(com.tencent.mm.R.string.b1o));
        contextMenu.add(0, n1Var.f252050f, 0, view2.getContext().getString(com.tencent.mm.R.string.fgq));
        contextMenu.add(0, n1Var.f252051g, 0, view2.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
