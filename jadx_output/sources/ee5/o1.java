package ee5;

/* loaded from: classes9.dex */
public final class o1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.s1 f251987d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251988e;

    public o1(ee5.s1 s1Var, android.view.View view) {
        this.f251987d = s1Var;
        this.f251988e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ee5.s1 s1Var = this.f251987d;
        s1Var.getClass();
        android.view.View view2 = this.f251988e;
        contextMenu.add(0, 0, 0, view2.getContext().getString(com.tencent.mm.R.string.i29));
        contextMenu.add(0, s1Var.f252049e, 0, view2.getContext().getString(com.tencent.mm.R.string.b1o));
        contextMenu.add(0, s1Var.f252050f, 0, view2.getContext().getString(com.tencent.mm.R.string.fgq));
        contextMenu.add(0, s1Var.f252051g, 0, view2.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
