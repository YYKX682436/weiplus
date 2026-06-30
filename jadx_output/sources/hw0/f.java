package hw0;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw0.g f285457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(hw0.g gVar) {
        super(1);
        this.f285457d = gVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kw0.a whenWhereData = (kw0.a) obj;
        kotlin.jvm.internal.o.g(whenWhereData, "whenWhereData");
        jw0.a aVar = this.f285457d.F;
        if (aVar != null) {
            nw0.h k76 = ((hw0.k) aVar).f285466a.k7();
            k76.getClass();
            kotlinx.coroutines.l.d(k76.f340768b, null, null, new nw0.e(whenWhereData, k76, kw0.b.f312792f, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
