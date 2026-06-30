package e0;

/* loaded from: classes5.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0.a0 f245726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0.g f245727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f245728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f245729g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(e0.a0 a0Var, e0.g gVar, int i17, int i18) {
        super(2);
        this.f245726d = a0Var;
        this.f245727e = gVar;
        this.f245728f = i17;
        this.f245729g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f245729g | 1;
        e0.g gVar = this.f245727e;
        int i18 = this.f245728f;
        this.f245726d.a(gVar, i18, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
