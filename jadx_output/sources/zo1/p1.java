package zo1;

/* loaded from: classes5.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f474728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f474729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI f474730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474731g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(kotlin.jvm.internal.h0 h0Var, yz5.a aVar, com.tencent.mm.plugin.backup.roambackup.ui.pkg.CreatePackageUI createPackageUI, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        super(1);
        this.f474728d = h0Var;
        this.f474729e = aVar;
        this.f474730f = createPackageUI;
        this.f474731g = u3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "auto bind result=" + booleanValue + ", device=" + this.f474728d.f310123d);
        this.f474729e.invoke();
        if (booleanValue) {
            ((ku5.t0) ku5.t0.f312615d).g(new zo1.n1(this.f474730f, this.f474728d, this.f474731g));
        } else {
            nf.e.f(new zo1.o1(this.f474730f, this.f474731g));
        }
        return jz5.f0.f302826a;
    }
}
