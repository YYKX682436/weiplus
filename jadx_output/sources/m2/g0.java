package m2;

/* loaded from: classes13.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f322916e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f322917f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(java.lang.String str, java.lang.String str2, java.lang.Object[] objArr) {
        super(2);
        this.f322915d = str;
        this.f322916e = str2;
        this.f322917f = objArr;
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
        m2.a aVar = m2.a.f322901a;
        java.lang.Object[] objArr = this.f322917f;
        aVar.d(this.f322915d, this.f322916e, oVar, java.util.Arrays.copyOf(objArr, objArr.length));
        return jz5.f0.f302826a;
    }
}
