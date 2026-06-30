package pv0;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv0.m f358535d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pv0.m mVar) {
        super(2);
        this.f358535d = mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        dw0.c filter = (dw0.c) obj2;
        kotlin.jvm.internal.o.g(filter, "filter");
        pv0.m.K(this.f358535d, intValue, filter);
        return jz5.f0.f302826a;
    }
}
