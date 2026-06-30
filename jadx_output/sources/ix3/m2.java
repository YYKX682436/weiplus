package ix3;

/* loaded from: classes.dex */
public final class m2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.q2 f295495d;

    public m2(ix3.q2 q2Var) {
        this.f295495d = q2Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f295495d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
