package jn2;

/* loaded from: classes8.dex */
public final class p1 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f300667d;

    public p1(jn2.r1 r1Var) {
        this.f300667d = r1Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        jn2.r1 r1Var = this.f300667d;
        contextMenu.add(0, r1Var.K, 0, r1Var.f118183e.getResources().getString(com.tencent.mm.R.string.ef8));
    }
}
