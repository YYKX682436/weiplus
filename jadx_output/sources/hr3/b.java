package hr3;

/* loaded from: classes8.dex */
public class b implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.d f283411d;

    public b(hr3.d dVar) {
        this.f283411d = dVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f283411d.f283460d.getResources().getString(com.tencent.mm.R.string.f490367t0));
    }
}
