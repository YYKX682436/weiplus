package zo1;

/* loaded from: classes5.dex */
public final class i4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zo1.k4 f474645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qo1.j0 f474646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f474647f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.n0 f474648g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qo1.i0 f474649h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(zo1.k4 k4Var, qo1.j0 j0Var, com.tencent.wechat.aff.affroam.g gVar, com.tencent.wechat.aff.affroam.n0 n0Var, qo1.i0 i0Var) {
        super(0);
        this.f474645d = k4Var;
        this.f474646e = j0Var;
        this.f474647f = gVar;
        this.f474648g = n0Var;
        this.f474649h = i0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        qo1.j0 j0Var;
        zo1.k4 k4Var = this.f474645d;
        java.util.Iterator it = k4Var.f474674e.iterator();
        int i17 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            j0Var = this.f474646e;
            if (!hasNext) {
                i17 = -1;
                break;
            }
            if (((com.tencent.wechat.aff.affroam.g) it.next()).f215829d == j0Var.a()) {
                break;
            }
            i17++;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pkgId=");
        sb6.append(j0Var.a());
        sb6.append(", position = ");
        sb6.append(i17);
        sb6.append(", newPkg=");
        com.tencent.wechat.aff.affroam.g gVar = this.f474647f;
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.hashCode()) : null);
        sb6.append(", state=");
        com.tencent.wechat.aff.affroam.n0 n0Var = this.f474648g;
        sb6.append(n0Var);
        sb6.append(", error=");
        qo1.i0 i0Var = this.f474649h;
        sb6.append(i0Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectPackageUI", sb6.toString());
        if (i17 != -1) {
            if (gVar != null) {
                k4Var.f474674e.set(i17, gVar);
            }
            k4Var.notifyItemChanged(i17, kz5.c0.i(0, n0Var, i0Var, j0Var));
        }
        return jz5.f0.f302826a;
    }
}
