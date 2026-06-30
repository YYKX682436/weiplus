package ee5;

/* loaded from: classes9.dex */
public final class r0 implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.v0 f252025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ae5.g f252026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f252027f;

    public r0(ee5.v0 v0Var, ae5.g gVar, android.view.View view) {
        this.f252025d = v0Var;
        this.f252026e = gVar;
        this.f252027f = view;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        ee5.v0 v0Var = this.f252025d;
        v0Var.getClass();
        contextMenu.add(0, 0, 0, view.getContext().getString(com.tencent.mm.R.string.i29));
        ae5.g gVar = this.f252026e;
        if (!com.tencent.mm.storage.z3.m4(gVar.f4401e) && !com.tencent.mm.storage.z3.q4(gVar.f4401e)) {
            contextMenu.add(0, v0Var.f252049e, 0, view.getContext().getString(com.tencent.mm.R.string.b1o));
        }
        int i17 = v0Var.f252050f;
        android.view.View view2 = this.f252027f;
        contextMenu.add(0, i17, 0, view2.getContext().getString(com.tencent.mm.R.string.fgq));
        contextMenu.add(0, v0Var.f252051g, 0, view2.getContext().getString(com.tencent.mm.R.string.b3p));
    }
}
