package f80;

/* loaded from: classes12.dex */
public final class d extends f80.f {

    /* renamed from: a, reason: collision with root package name */
    public final oi3.f f260082a;

    /* renamed from: b, reason: collision with root package name */
    public final int f260083b;

    /* renamed from: c, reason: collision with root package name */
    public final int f260084c;

    /* renamed from: d, reason: collision with root package name */
    public volatile xs.z0 f260085d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(oi3.f simpleImgMsgInfo, int i17, int i18, xs.z0 z0Var) {
        super(null);
        kotlin.jvm.internal.o.g(simpleImgMsgInfo, "simpleImgMsgInfo");
        this.f260082a = simpleImgMsgInfo;
        this.f260083b = i17;
        this.f260084c = i18;
        this.f260085d = z0Var;
    }

    @Override // f80.f
    public int a() {
        return this.f260084c;
    }

    @Override // f80.f
    public int b() {
        return this.f260083b;
    }
}
