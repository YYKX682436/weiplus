package ee5;

/* loaded from: classes9.dex */
public final class z0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.d1 f252109d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f252110e;

    public z0(ee5.d1 d1Var, android.view.View view) {
        this.f252109d = d1Var;
        this.f252110e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ee5.d1 d1Var = this.f252109d;
        d1Var.getClass();
        android.view.View view2 = this.f252110e;
        contextMenu.add(0, 0, 0, view2.getContext().getString(com.tencent.mm.R.string.i29));
        contextMenu.add(0, d1Var.f252049e, 0, view2.getContext().getString(com.tencent.mm.R.string.b1o));
        contextMenu.add(0, d1Var.f252050f, 0, view2.getContext().getString(com.tencent.mm.R.string.fgq));
        contextMenu.add(0, d1Var.f252051g, 0, view2.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
