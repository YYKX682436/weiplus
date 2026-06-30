package en5;

/* loaded from: classes14.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f255429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255430e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f255431f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(java.util.ArrayList arrayList, yz5.l lVar, int i17) {
        super(2);
        this.f255429d = arrayList;
        this.f255430e = lVar;
        this.f255431f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f255431f | 1;
        en5.i1.e(this.f255429d, this.f255430e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
