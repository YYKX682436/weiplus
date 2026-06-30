package mr3;

/* loaded from: classes5.dex */
public final class r implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f330894d;

    public r(android.content.Context context) {
        this.f330894d = context;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f330894d.getString(com.tencent.mm.R.string.f490367t0));
    }
}
