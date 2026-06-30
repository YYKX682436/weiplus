package hw2;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw2.e f285502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hw2.e eVar) {
        super(1);
        this.f285502d = eVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        hw2.e eVar = this.f285502d;
        if (booleanValue) {
            ju3.d0.k(eVar.f285513e, ju3.c0.S, null, 2, null);
        } else {
            ju3.d0.k(eVar.f285513e, ju3.c0.W, null, 2, null);
            ju3.d0.k(eVar.f285513e, ju3.c0.T, null, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
