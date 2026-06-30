package tt2;

/* loaded from: classes3.dex */
public final class u0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f422002d;

    public u0(tt2.e1 e1Var) {
        this.f422002d = e1Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        tt2.e1 e1Var = this.f422002d;
        contextMenu.add(0, 100, 0, e1Var.f421880h.getResources().getString(com.tencent.mm.R.string.ees));
        contextMenu.add(0, 101, 1, e1Var.f421880h.getResources().getString(com.tencent.mm.R.string.edq));
    }
}
