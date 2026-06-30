package ix3;

/* loaded from: classes.dex */
public final class t3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.x3 f295565d;

    public t3(ix3.x3 x3Var) {
        this.f295565d = x3Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f295565d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
