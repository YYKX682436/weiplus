package ix3;

/* loaded from: classes3.dex */
public final class c2 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.l2 f295376d;

    public c2(ix3.l2 l2Var) {
        this.f295376d = l2Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f295376d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
