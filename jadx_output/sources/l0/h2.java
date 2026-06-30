package l0;

/* loaded from: classes14.dex */
public final class h2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f314218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f314219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p2.f f314220f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h2(java.util.Map map, yz5.p pVar, p2.f fVar) {
        super(2);
        this.f314218d = map;
        this.f314219e = pVar;
        this.f314220f = fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        java.lang.Float valueOf = java.lang.Float.valueOf(floatValue);
        java.util.Map map = this.f314218d;
        return java.lang.Float.valueOf(((l0.f5) this.f314219e.invoke(kz5.c1.h(map, valueOf), kz5.c1.h(map, java.lang.Float.valueOf(floatValue2)))).a(this.f314220f, floatValue, floatValue2));
    }
}
