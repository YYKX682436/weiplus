package yg0;

/* loaded from: classes.dex */
public final class z3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f462312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f462313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zg0.s3 f462314f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, zg0.s3 s3Var) {
        super(1);
        this.f462312d = c0Var;
        this.f462313e = c0Var2;
        this.f462314f = s3Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        kotlin.jvm.internal.c0 c0Var = this.f462312d;
        if (!booleanValue) {
            c0Var.f310112d = true;
        }
        if (!this.f462313e.f310112d && c0Var.f310112d) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Qk(booleanValue, this.f462314f.f472780a.hashCode(), false);
        }
        return jz5.f0.f302826a;
    }
}
