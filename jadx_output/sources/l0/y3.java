package l0;

/* loaded from: classes14.dex */
public final class y3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f314680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(long j17, yz5.p pVar) {
        super(2);
        this.f314680d = j17;
        this.f314681e = pVar;
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
        l0.h4.b(this.f314680d, null, null, this.f314681e, oVar, 0, 6);
        return jz5.f0.f302826a;
    }
}
