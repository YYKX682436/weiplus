package df2;

/* loaded from: classes3.dex */
public final class b9 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.c9 f229788d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(df2.c9 c9Var) {
        super(2);
        this.f229788d = c9Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.zv1 zv1Var = (r45.zv1) obj;
        r45.zv1 zv1Var2 = (r45.zv1) obj2;
        this.f229788d.getClass();
        boolean z17 = false;
        if (zv1Var == null || zv1Var2 == null ? !(zv1Var != null || zv1Var2 != null) : !(zv1Var.getBoolean(0) != zv1Var2.getBoolean(0) || zv1Var.getLong(3) != zv1Var2.getLong(3) || zv1Var.getLong(4) != zv1Var2.getLong(4))) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
