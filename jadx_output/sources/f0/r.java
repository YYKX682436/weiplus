package f0;

/* loaded from: classes5.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.s f258203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f258204e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f258205f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(f0.s sVar, int i17, int i18) {
        super(2);
        this.f258203d = sVar;
        this.f258204e = i17;
        this.f258205f = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f258205f | 1;
        this.f258203d.d(this.f258204e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
