package u5;

/* loaded from: classes14.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u5.s f424750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c6.j f424751e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r5.j f424752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f424753g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u5.s sVar, c6.j jVar, r5.j jVar2, int i17) {
        super(2);
        this.f424750d = sVar;
        this.f424751e = jVar;
        this.f424752f = jVar2;
        this.f424753g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f424753g | 1;
        c6.j jVar = this.f424751e;
        r5.j jVar2 = this.f424752f;
        u5.x.d(this.f424750d, jVar, jVar2, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
