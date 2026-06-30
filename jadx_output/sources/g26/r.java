package g26;

/* loaded from: classes16.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g26.s f268005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g26.l f268006e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(g26.s sVar, g26.l lVar) {
        super(0);
        this.f268005d = sVar;
        this.f268006e = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Iterable iterable = (java.util.List) this.f268005d.f268011e.getValue();
        if (iterable == null) {
            iterable = kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((f26.c3) it.next()).y0(this.f268006e));
        }
        return arrayList;
    }
}
