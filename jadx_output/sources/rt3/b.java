package rt3;

/* loaded from: classes5.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f399515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f399516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f399517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f399518g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vt3.n f399519h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rt3.e f399520i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f399521m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.g f399522n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, int i18, int i19, vt3.n nVar, rt3.e eVar, java.lang.Long l17, com.tencent.mm.protobuf.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f399516e = i17;
        this.f399517f = i18;
        this.f399518g = i19;
        this.f399519h = nVar;
        this.f399520i = eVar;
        this.f399521m = l17;
        this.f399522n = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rt3.b(this.f399516e, this.f399517f, this.f399518g, this.f399519h, this.f399520i, this.f399521m, this.f399522n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rt3.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x018a A[SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rt3.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
