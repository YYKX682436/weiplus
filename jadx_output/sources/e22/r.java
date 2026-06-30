package e22;

/* loaded from: classes14.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0.t f246707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f246708e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f246709f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f246710g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f246711h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f246712i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f246713m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(z0.t tVar, com.tencent.mm.protocal.protobuf.FinderObject finderObject, boolean z17, boolean z18, yz5.a aVar, int i17, int i18) {
        super(2);
        this.f246707d = tVar;
        this.f246708e = finderObject;
        this.f246709f = z17;
        this.f246710g = z18;
        this.f246711h = aVar;
        this.f246712i = i17;
        this.f246713m = i18;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        e22.a1.i(this.f246707d, this.f246708e, this.f246709f, this.f246710g, this.f246711h, (n0.o) obj, this.f246712i | 1, this.f246713m);
        return jz5.f0.f302826a;
    }
}
