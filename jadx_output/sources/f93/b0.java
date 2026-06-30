package f93;

/* loaded from: classes4.dex */
public final class b0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f260294d;

    public b0(int i17) {
        this.f260294d = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        kotlin.jvm.internal.o.d(contextMenu);
        contextMenu.add(this.f260294d, 0, 0, com.tencent.mm.R.string.bod);
    }
}
