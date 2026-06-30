package en5;

/* loaded from: classes14.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f255515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f255516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f255517f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i17, int i18, int i19) {
        super(2);
        this.f255515d = i17;
        this.f255516e = i18;
        this.f255517f = i19;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f255517f | 1;
        en5.w.c(this.f255515d, this.f255516e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
