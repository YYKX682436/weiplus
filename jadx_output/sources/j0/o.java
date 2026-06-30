package j0;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.d f296470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f296471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f296472f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(a2.d dVar, java.util.List list, int i17) {
        super(2);
        this.f296470d = dVar;
        this.f296471e = list;
        this.f296472f = i17;
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
        j0.t1.a(this.f296470d, this.f296471e, oVar, (this.f296472f & 14) | 64);
        return jz5.f0.f302826a;
    }
}
