package ix3;

/* loaded from: classes.dex */
public final class r2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.y2 f295543d;

    public r2(ix3.y2 y2Var) {
        this.f295543d = y2Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f295543d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
