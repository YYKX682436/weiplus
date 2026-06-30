package z;

/* loaded from: classes13.dex */
public final class s3 implements z.y {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f468830a;

    public s3(z.w wVar, float f17, float f18) {
        e06.k m17 = e06.p.m(0, wVar.b());
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = m17.iterator();
        while (it.hasNext()) {
            arrayList.add(new z.n0(f17, f18, wVar.a(((kz5.x0) it).b())));
        }
        this.f468830a = arrayList;
    }

    @Override // z.y
    public z.l0 get(int i17) {
        return (z.n0) ((java.util.ArrayList) this.f468830a).get(i17);
    }
}
