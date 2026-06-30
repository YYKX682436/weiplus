package zl2;

/* loaded from: classes.dex */
public final class j0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f473832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f473833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.LifecycleScope f473834f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.zc4 f473835g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f473836h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ v65.n f473837i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(r45.zc4 zc4Var, com.tencent.mm.ui.widget.dialog.k0 k0Var, com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope, r45.zc4 zc4Var2, androidx.appcompat.app.AppCompatActivity appCompatActivity, v65.n nVar) {
        super(1);
        this.f473832d = zc4Var;
        this.f473833e = k0Var;
        this.f473834f = lifecycleScope;
        this.f473835g = zc4Var2;
        this.f473836h = appCompatActivity;
        this.f473837i = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f473832d.set(14, (java.lang.String) obj);
        this.f473833e.u();
        v65.i.c(this.f473834f, null, new zl2.i0(this.f473835g, this.f473836h, this.f473832d, this.f473837i, null), 1, null);
        return jz5.f0.f302826a;
    }
}
