package ee5;

/* loaded from: classes9.dex */
public final class e1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.i1 f251864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251865e;

    public e1(ee5.i1 i1Var, android.view.View view) {
        this.f251864d = i1Var;
        this.f251865e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ee5.i1 i1Var = this.f251864d;
        i1Var.getClass();
        android.view.View view2 = this.f251865e;
        contextMenu.add(0, 0, 0, view2.getContext().getString(com.tencent.mm.R.string.i29));
        contextMenu.add(0, i1Var.f252049e, 0, view2.getContext().getString(com.tencent.mm.R.string.b1o));
        contextMenu.add(0, i1Var.f252050f, 0, view2.getContext().getString(com.tencent.mm.R.string.fgq));
        contextMenu.add(0, i1Var.f252051g, 0, view2.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
