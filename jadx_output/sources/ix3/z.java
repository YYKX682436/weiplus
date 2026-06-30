package ix3;

/* loaded from: classes.dex */
public final class z implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.e0 f295618d;

    public z(ix3.e0 e0Var) {
        this.f295618d = e0Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        ix3.e0 e0Var = this.f295618d;
        e0Var.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) e0Var.getContext(), 0, false);
        k0Var.f211872n = new ix3.a0(e0Var);
        k0Var.f211881s = new ix3.c0(e0Var);
        k0Var.v();
        return false;
    }
}
