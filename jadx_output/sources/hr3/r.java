package hr3;

/* loaded from: classes8.dex */
public class r implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.t f283931d;

    public r(hr3.t tVar) {
        this.f283931d = tVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f283931d.f283993d.getResources().getString(com.tencent.mm.R.string.f490367t0));
    }
}
