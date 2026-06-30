package qe5;

/* loaded from: classes3.dex */
public final class a1 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qe5.n1 f362070d;

    public a1(qe5.n1 n1Var) {
        this.f362070d = n1Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f362070d.P6();
        if (P6 == null) {
            return true;
        }
        P6.finish();
        return true;
    }
}
