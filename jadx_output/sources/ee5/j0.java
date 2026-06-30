package ee5;

/* loaded from: classes9.dex */
public final class j0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.n0 f251933d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f251934e;

    public j0(ee5.n0 n0Var, android.view.View view) {
        this.f251933d = n0Var;
        this.f251934e = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, this.f251933d.f252050f, 0, this.f251934e.getContext().getString(com.tencent.mm.R.string.fgq));
    }
}
