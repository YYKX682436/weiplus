package j0;

/* loaded from: classes14.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2.d f296562d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f296563e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f296564f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(a2.d dVar, java.util.List list, int i17) {
        super(2);
        this.f296562d = dVar;
        this.f296563e = list;
        this.f296564f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f296564f | 1;
        j0.t1.a(this.f296562d, this.f296563e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
