package y1;

/* loaded from: classes14.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final y1.l0 f458769d = new y1.l0();

    public l0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str;
        jz5.b bVar;
        y1.a aVar = (y1.a) obj;
        y1.a childValue = (y1.a) obj2;
        kotlin.jvm.internal.o.g(childValue, "childValue");
        if (aVar == null || (str = aVar.f458692a) == null) {
            str = childValue.f458692a;
        }
        if (aVar == null || (bVar = aVar.f458693b) == null) {
            bVar = childValue.f458693b;
        }
        return new y1.a(str, bVar);
    }
}
