package n0;

/* loaded from: classes14.dex */
public final class x3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f333750d;

    /* renamed from: e, reason: collision with root package name */
    public int f333751e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333752f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.b4 f333753g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.q f333754h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n0.r2 f333755i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(n0.b4 b4Var, yz5.q qVar, n0.r2 r2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f333753g = b4Var;
        this.f333754h = qVar;
        this.f333755i = r2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        n0.x3 x3Var = new n0.x3(this.f333753g, this.f333754h, this.f333755i, continuation);
        x3Var.f333752f = obj;
        return x3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((n0.x3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x013b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.x3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
