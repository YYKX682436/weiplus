package sr2;

/* loaded from: classes2.dex */
public final class z implements db5.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sr2.w0 f411821a;

    public z(sr2.w0 w0Var) {
        this.f411821a = w0Var;
    }

    @Override // db5.n4
    public final void a(db5.g4 g4Var, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        g4Var.clear();
        sr2.w0 w0Var = this.f411821a;
        g4Var.c(0, 0, 0, w0Var.getContext().getResources().getString(com.tencent.mm.R.string.n3o), com.tencent.mm.R.raw.icons_filled_edit_photo_pencil);
        g4Var.c(0, 1, 1, w0Var.getContext().getResources().getString(com.tencent.mm.R.string.f490367t0), com.tencent.mm.R.raw.icons_filled_delete);
    }
}
