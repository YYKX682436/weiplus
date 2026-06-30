package e22;

/* loaded from: classes10.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e22.d1 f246649d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f246650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f246651f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f246652g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(e22.d1 d1Var, yz5.l lVar, int i17, int i18) {
        super(2);
        this.f246649d = d1Var;
        this.f246650e = lVar;
        this.f246651f = i17;
        this.f246652g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f246651f | 1;
        e22.a1.c(this.f246649d, this.f246650e, (n0.o) obj, i17, this.f246652g);
        return jz5.f0.f302826a;
    }
}
