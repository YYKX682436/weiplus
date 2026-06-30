package n0;

/* loaded from: classes14.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f333583d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.Object[] objArr) {
        super(3);
        this.f333583d = objArr;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        n0.e applier = (n0.e) obj;
        kotlin.jvm.internal.o.g(applier, "applier");
        kotlin.jvm.internal.o.g((n0.o4) obj2, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g((n0.d4) obj3, "<anonymous parameter 2>");
        for (java.lang.Object obj4 : this.f333583d) {
            applier.h(obj4);
        }
        return jz5.f0.f302826a;
    }
}
