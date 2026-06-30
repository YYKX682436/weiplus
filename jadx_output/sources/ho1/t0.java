package ho1;

/* loaded from: classes5.dex */
public final class t0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f282814d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f282815e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f282816f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f282817g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ho1.a1 a1Var, long j17, int i17, android.content.Context context) {
        super(1);
        this.f282814d = a1Var;
        this.f282815e = j17;
        this.f282816f = i17;
        this.f282817g = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Context viewContext = (android.content.Context) obj;
        kotlin.jvm.internal.o.g(viewContext, "viewContext");
        java.lang.String str = this.f282814d.f282622a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Enter RoamBackupActivity from force notify. pkgId=");
        long j17 = this.f282815e;
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (this.f282816f == 0) {
            mv.y yVar = (mv.y) i95.n0.c(mv.y.class);
            android.content.Context context = this.f282817g;
            kotlin.jvm.internal.o.f(context, "$context");
            ((com.tencent.mm.plugin.backup.roambackup.p1) yVar).aj(context, null, mv.b0.f331477e);
        } else {
            mv.b0 b0Var = mv.b0.f331477e;
            ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Zi(viewContext, kz5.c1.j(new jz5.l("home", null), new jz5.l("edit_package", kz5.c1.l(new jz5.l("packageId", java.lang.Long.valueOf(j17))))));
        }
        return jz5.f0.f302826a;
    }
}
