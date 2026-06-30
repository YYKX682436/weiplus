package ee5;

/* loaded from: classes9.dex */
public final class w1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.a2 f252078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f252079e;

    public w1(ee5.a2 a2Var, android.view.View view) {
        this.f252078d = a2Var;
        this.f252079e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ee5.a2 a2Var = this.f252078d;
        a2Var.getClass();
        android.view.View view2 = this.f252079e;
        contextMenu.add(0, 0, 0, view2.getContext().getString(com.tencent.mm.R.string.i29));
        contextMenu.add(0, a2Var.f252049e, 0, view2.getContext().getString(com.tencent.mm.R.string.b1o));
        contextMenu.add(0, a2Var.f252050f, 0, view2.getContext().getString(com.tencent.mm.R.string.fgq));
        contextMenu.add(0, a2Var.f252051g, 0, view2.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
