package ee5;

/* loaded from: classes9.dex */
public final class d2 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.h2 f251855d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251856e;

    public d2(ee5.h2 h2Var, android.view.View view) {
        this.f251855d = h2Var;
        this.f251856e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ee5.h2 h2Var = this.f251855d;
        h2Var.getClass();
        android.view.View view2 = this.f251856e;
        contextMenu.add(0, 0, 0, view2.getContext().getString(com.tencent.mm.R.string.i29));
        contextMenu.add(0, h2Var.f252049e, 0, view2.getContext().getString(com.tencent.mm.R.string.b1o));
        contextMenu.add(0, h2Var.f252050f, 0, view2.getContext().getString(com.tencent.mm.R.string.fgq));
        contextMenu.add(0, h2Var.f252051g, 0, view2.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
