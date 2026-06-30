package m2;

/* loaded from: classes13.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(java.lang.String str, java.lang.String str2) {
        super(2);
        this.f322912d = str;
        this.f322913e = str2;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        m2.a.f322901a.d(this.f322912d, this.f322913e, oVar, new java.lang.Object[0]);
        return jz5.f0.f302826a;
    }
}
