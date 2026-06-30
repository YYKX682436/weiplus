package qd2;

/* loaded from: classes3.dex */
public final class i implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.CharSequence f361776d;

    public i(int i17, java.lang.CharSequence charSequence) {
        this.f361776d = charSequence;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, this.f361776d);
    }
}
