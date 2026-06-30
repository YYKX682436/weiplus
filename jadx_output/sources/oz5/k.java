package oz5;

/* loaded from: classes14.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final oz5.k f350328d = new oz5.k();

    public k() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        oz5.d dVar;
        oz5.l acc = (oz5.l) obj;
        oz5.i element = (oz5.i) obj2;
        kotlin.jvm.internal.o.g(acc, "acc");
        kotlin.jvm.internal.o.g(element, "element");
        oz5.l minusKey = acc.minusKey(element.getKey());
        oz5.m mVar = oz5.m.f350329d;
        if (minusKey == mVar) {
            return element;
        }
        int i17 = oz5.f.Y0;
        oz5.e eVar = oz5.e.f350327d;
        oz5.f fVar = (oz5.f) minusKey.get(eVar);
        if (fVar == null) {
            dVar = new oz5.d(minusKey, element);
        } else {
            oz5.l minusKey2 = minusKey.minusKey(eVar);
            if (minusKey2 == mVar) {
                return new oz5.d(element, fVar);
            }
            dVar = new oz5.d(new oz5.d(minusKey2, element), fVar);
        }
        return dVar;
    }
}
