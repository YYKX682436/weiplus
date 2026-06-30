package ix3;

/* loaded from: classes.dex */
public final class z0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.c1 f295619d;

    public z0(ix3.c1 c1Var) {
        this.f295619d = c1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f295619d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
