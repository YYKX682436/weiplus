package uf5;

/* loaded from: classes4.dex */
public class n0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f427275d;

    public n0(uf5.p0 p0Var, int i17) {
        this.f427275d = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f427275d, 0, 0, com.tencent.mm.R.string.bf9);
    }
}
