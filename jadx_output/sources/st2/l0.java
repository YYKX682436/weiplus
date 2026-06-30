package st2;

/* loaded from: classes3.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f412390d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(java.lang.Long l17) {
        super(1);
        this.f412390d = l17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        so2.j5 it = (so2.j5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (it instanceof cm2.m0) {
            long j17 = ((cm2.m0) it).f43369w;
            java.lang.Long l17 = this.f412390d;
            if (l17 != null && j17 == l17.longValue()) {
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }
        z17 = false;
        return java.lang.Boolean.valueOf(z17);
    }
}
