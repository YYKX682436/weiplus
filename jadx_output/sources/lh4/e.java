package lh4;

/* loaded from: classes4.dex */
public final class e implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f318704d;

    public e(boolean z17) {
        this.f318704d = z17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        if (this.f318704d && contextMenu != null) {
            contextMenu.add(0, 0, 0, com.tencent.mm.R.string.r_);
        }
        if (contextMenu != null) {
            contextMenu.add(0, 1, 0, com.tencent.mm.R.string.f490312rh);
        }
    }
}
