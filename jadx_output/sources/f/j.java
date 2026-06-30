package f;

/* loaded from: classes14.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f257984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f257985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f257986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f257987g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z17, yz5.a aVar, int i17, int i18) {
        super(2);
        this.f257984d = z17;
        this.f257985e = aVar;
        this.f257986f = i17;
        this.f257987g = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f257986f | 1;
        f.l.a(this.f257984d, this.f257985e, (n0.o) obj, i17, this.f257987g);
        return jz5.f0.f302826a;
    }
}
