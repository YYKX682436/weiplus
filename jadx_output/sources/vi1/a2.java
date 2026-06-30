package vi1;

/* loaded from: classes7.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.b2 f437270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(vi1.b2 b2Var) {
        super(1);
        this.f437270d = b2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Long valueOf;
        r45.zs6 zs6Var = (r45.zs6) obj;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Boolean.valueOf(zs6Var != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.PhoneNumberManagerUI", "update %b", objArr);
        vi1.b2 b2Var = this.f437270d;
        if (zs6Var != null) {
            vi1.l2 l2Var = vi1.l2.f437401a;
            vi1.j2 a17 = l2Var.a(b2Var.f437278b);
            if (a17 != null) {
                vi1.j2 a18 = l2Var.a(b2Var.f437278b);
                valueOf = a18 != null ? java.lang.Long.valueOf(a18.f437373v) : null;
                kotlin.jvm.internal.o.d(valueOf);
                a17.f437373v = valueOf.longValue() + 1;
            }
        } else {
            vi1.l2 l2Var2 = vi1.l2.f437401a;
            vi1.j2 a19 = l2Var2.a(b2Var.f437278b);
            if (a19 != null) {
                vi1.j2 a27 = l2Var2.a(b2Var.f437278b);
                valueOf = a27 != null ? java.lang.Long.valueOf(a27.f437374w) : null;
                kotlin.jvm.internal.o.d(valueOf);
                a19.f437374w = valueOf.longValue() + 1;
            }
        }
        return jz5.f0.f302826a;
    }
}
