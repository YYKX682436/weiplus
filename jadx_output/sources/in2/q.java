package in2;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in2.s f292877d;

    public q(in2.s sVar) {
        this.f292877d = sVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        in2.s sVar = this.f292877d;
        contextMenu.add(0, sVar.K, 0, sVar.f118183e.getResources().getString(com.tencent.mm.R.string.ef8));
    }
}
