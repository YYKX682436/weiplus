package ix3;

/* loaded from: classes.dex */
public final class c5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.i5 f295381d;

    public c5(ix3.i5 i5Var) {
        this.f295381d = i5Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f295381d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
