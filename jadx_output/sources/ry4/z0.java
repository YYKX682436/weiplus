package ry4;

/* loaded from: classes.dex */
public final class z0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f401694d;

    public z0(ry4.d1 d1Var) {
        this.f401694d = d1Var;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(0, 1, 0, this.f401694d.getActivity().getString(com.tencent.mm.R.string.pjv));
    }
}
