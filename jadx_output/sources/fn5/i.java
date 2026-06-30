package fn5;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f264675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264676e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f264677f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(z0.t tVar, java.lang.String str, int i17) {
        super(2);
        this.f264675d = tVar;
        this.f264676e = str;
        this.f264677f = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f264677f | 1;
        fn5.p.c(this.f264675d, this.f264676e, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
