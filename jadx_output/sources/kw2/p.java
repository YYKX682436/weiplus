package kw2;

/* loaded from: classes15.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kw2.y f313075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f313076e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f313077f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(kw2.y yVar, java.lang.String str, long j17) {
        super(0);
        this.f313075d = yVar;
        this.f313076e = str;
        this.f313077f = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        kw2.h hVar = (kw2.h) this.f313075d.f313117c.get(this.f313076e);
        if (hVar != null && !hVar.f313019c) {
            java.util.ArrayList arrayList = hVar.f313022f;
            if (!arrayList.isEmpty()) {
                kw2.e eVar = (kw2.e) kz5.n0.i0(arrayList);
                if (!eVar.A) {
                    long j17 = this.f313077f;
                    if (j17 > 50) {
                        eVar.R.add(java.lang.Integer.valueOf((int) (j17 / 100)));
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
