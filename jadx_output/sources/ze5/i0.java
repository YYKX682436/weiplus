package ze5;

/* loaded from: classes9.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f471982d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f471983e;

    /* renamed from: f, reason: collision with root package name */
    public int f471984f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f471985g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.br2 f471986h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f471987i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yb5.d f471988m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ze5.n8 f471989n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ze5.n0 f471990o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(r45.br2 br2Var, com.tencent.mm.storage.f9 f9Var, yb5.d dVar, ze5.n8 n8Var, ze5.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f471986h = br2Var;
        this.f471987i = f9Var;
        this.f471988m = dVar;
        this.f471989n = n8Var;
        this.f471990o = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ze5.i0 i0Var = new ze5.i0(this.f471986h, this.f471987i, this.f471988m, this.f471989n, this.f471990o, continuation);
        i0Var.f471985g = obj;
        return i0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ze5.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0140  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.i0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
