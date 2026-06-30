package ix3;

/* loaded from: classes.dex */
public final class q5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.t5 f295540d;

    public q5(ix3.t5 t5Var) {
        this.f295540d = t5Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f295540d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
