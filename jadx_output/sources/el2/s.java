package el2;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253906d;

    public s(el2.i0 i0Var) {
        this.f253906d = i0Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, this.f253906d.Z, 0, com.tencent.mm.R.string.e8z);
    }
}
