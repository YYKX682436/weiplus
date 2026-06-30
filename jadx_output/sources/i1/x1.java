package i1;

/* loaded from: classes14.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i1.q1 f287072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f287073e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(i1.q1 q1Var, java.util.Map map) {
        super(2);
        this.f287072d = q1Var;
        this.f287073e = map;
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
        i1.c2.a((i1.o1) this.f287072d, this.f287073e, oVar, 64, 0);
        return jz5.f0.f302826a;
    }
}
