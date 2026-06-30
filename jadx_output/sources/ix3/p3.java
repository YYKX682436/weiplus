package ix3;

/* loaded from: classes.dex */
public final class p3 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.s3 f295529d;

    public p3(ix3.s3 s3Var) {
        this.f295529d = s3Var;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = this.f295529d.P6();
        if (P6 == null) {
            return false;
        }
        P6.finish();
        return false;
    }
}
