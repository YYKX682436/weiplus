package gc0;

/* loaded from: classes5.dex */
public final class s1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270269d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f270270e;

    /* renamed from: f, reason: collision with root package name */
    public int f270271f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gc0.p2 f270272g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gc0.b0 f270273h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f270274i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f270275m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f270276n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(gc0.p2 p2Var, gc0.b0 b0Var, yz5.a aVar, java.util.List list, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270272g = p2Var;
        this.f270273h = b0Var;
        this.f270274i = aVar;
        this.f270275m = list;
        this.f270276n = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gc0.s1(this.f270272g, this.f270273h, this.f270274i, this.f270275m, this.f270276n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.s1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b5  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gc0.s1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
