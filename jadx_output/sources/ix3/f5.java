package ix3;

/* loaded from: classes.dex */
public final class f5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.i5 f295416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f295417e;

    public f5(ix3.i5 i5Var, com.tencent.mm.storage.f9 f9Var) {
        this.f295416d = i5Var;
        this.f295417e = f9Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        ix3.i5 i5Var = this.f295416d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) i5Var.getContext(), 0, false);
        k0Var.f211872n = new ix3.d5(i5Var);
        tg3.u0 u0Var = (tg3.u0) i95.n0.c(tg3.u0.class);
        bm5.f0 f0Var = bm5.f0.f22571s;
        com.tencent.mm.storage.f9 f9Var = this.f295417e;
        k0Var.f211881s = new ix3.e5(this.f295417e, this.f295416d, ((k90.b) u0Var).rj(f9Var, f0Var, f9Var.z0(), false), ((t21.w2) i5Var.e7()).g(f9Var.z0()), ((vf0.c) ((c35.m) ((jz5.n) i5Var.f295452f).getValue())).Ai(f9Var, false));
        k0Var.v();
        return true;
    }
}
