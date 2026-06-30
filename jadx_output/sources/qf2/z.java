package qf2;

/* loaded from: classes.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362663d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f362664e;

    /* renamed from: f, reason: collision with root package name */
    public int f362665f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qf2.v0 f362666g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f362667h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.kj1 f362668i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f362669m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ byte[] f362670n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362671o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ yz5.a f362672p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(qf2.v0 v0Var, r45.xn1 xn1Var, r45.kj1 kj1Var, int i17, byte[] bArr, java.lang.String str, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362666g = v0Var;
        this.f362667h = xn1Var;
        this.f362668i = kj1Var;
        this.f362669m = i17;
        this.f362670n = bArr;
        this.f362671o = str;
        this.f362672p = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.z(this.f362666g, this.f362667h, this.f362668i, this.f362669m, this.f362670n, this.f362671o, this.f362672p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x025c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
