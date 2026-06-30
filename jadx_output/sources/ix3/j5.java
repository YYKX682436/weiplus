package ix3;

/* loaded from: classes.dex */
public final class j5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.p5 f295469d;

    public j5(ix3.p5 p5Var) {
        this.f295469d = p5Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f295469d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
