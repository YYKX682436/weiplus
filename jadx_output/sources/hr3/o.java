package hr3;

/* loaded from: classes8.dex */
public class o implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.q f283845d;

    public o(hr3.q qVar) {
        this.f283845d = qVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f283845d.f283904d.getResources().getString(com.tencent.mm.R.string.f490367t0));
    }
}
