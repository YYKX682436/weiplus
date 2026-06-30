package u5;

/* loaded from: classes14.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u5.s f424742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c6.j f424743e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r5.j f424744f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f424745g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(u5.s sVar, c6.j jVar, r5.j jVar2, int i17) {
        super(2);
        this.f424742d = sVar;
        this.f424743e = jVar;
        this.f424744f = jVar2;
        this.f424745g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f424745g | 1;
        c6.j jVar = this.f424743e;
        r5.j jVar2 = this.f424744f;
        u5.x.d(this.f424742d, jVar, jVar2, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
