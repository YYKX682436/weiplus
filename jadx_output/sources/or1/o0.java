package or1;

/* loaded from: classes9.dex */
public class o0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f347546d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ or1.s0 f347547e;

    public o0(or1.s0 s0Var, int i17) {
        this.f347547e = s0Var;
        this.f347546d = i17;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        contextMenu.add(this.f347546d, 1, 0, com.tencent.mm.R.string.c1f);
    }
}
