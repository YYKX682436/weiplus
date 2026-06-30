package ee5;

/* loaded from: classes9.dex */
public final class i2 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.m2 f251927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251928e;

    public i2(ee5.m2 m2Var, android.view.View view) {
        this.f251927d = m2Var;
        this.f251928e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ee5.m2 m2Var = this.f251927d;
        m2Var.getClass();
        android.view.View view2 = this.f251928e;
        contextMenu.add(0, 0, 0, view2.getContext().getString(com.tencent.mm.R.string.i29));
        contextMenu.add(0, m2Var.f252049e, 0, view2.getContext().getString(com.tencent.mm.R.string.b1o));
        contextMenu.add(0, m2Var.f252050f, 0, view2.getContext().getString(com.tencent.mm.R.string.fgq));
        contextMenu.add(0, m2Var.f252051g, 0, view2.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
