package zl2;

/* loaded from: classes.dex */
public final class h0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.LifecycleScope f473791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f473792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f473793f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f473794g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f473795h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f473796i;

    public h0(com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope, com.tencent.mm.ui.widget.dialog.k0 k0Var, v65.n nVar, r45.zc4 zc4Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, r45.zc4 zc4Var2) {
        this.f473791d = lifecycleScope;
        this.f473792e = k0Var;
        this.f473793f = nVar;
        this.f473794g = zc4Var;
        this.f473795h = appCompatActivity;
        this.f473796i = zc4Var2;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        v65.i.c(this.f473791d, null, new zl2.g0(this.f473792e, menuItem, this.f473793f, this.f473794g, this.f473795h, this.f473796i, null), 1, null);
    }
}
