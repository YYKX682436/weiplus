package th5;

/* loaded from: classes12.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.o f419358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th5.g0 f419359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(th5.o oVar, th5.g0 g0Var) {
        super(2);
        this.f419358d = oVar;
        this.f419359e = g0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        if (longValue > 0) {
            float e17 = e06.p.e(((float) longValue2) / ((float) longValue), 0.0f, 1.0f);
            th5.o oVar = this.f419358d;
            oVar.f419424i = e17;
            v65.i.c(this.f419359e.f418948f, null, new th5.c0(oVar, e17, null), 1, null);
        }
        return jz5.f0.f302826a;
    }
}
