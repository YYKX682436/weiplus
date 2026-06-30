package q85;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f360816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f360817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f360818g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f360819h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, long j17, long j18, int i17, int i18) {
        super(2);
        this.f360815d = str;
        this.f360816e = j17;
        this.f360817f = j18;
        this.f360818g = i17;
        this.f360819h = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        q85.m.a(this.f360815d, this.f360816e, this.f360817f, (n0.o) obj, this.f360818g | 1, this.f360819h);
        return jz5.f0.f302826a;
    }
}
