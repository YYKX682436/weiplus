package ut2;

/* loaded from: classes3.dex */
public final class t2 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f431101d;

    public t2(ut2.s3 s3Var) {
        this.f431101d = s3Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 0, 0, this.f431101d.itemView.getContext().getResources().getString(com.tencent.mm.R.string.nns));
    }
}
