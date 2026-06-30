package ix3;

/* loaded from: classes.dex */
public final class u1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.z1 f295571d;

    public u1(ix3.z1 z1Var) {
        this.f295571d = z1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f295571d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
