package jg0;

/* loaded from: classes12.dex */
public final class s extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f299611d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f299612e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f299613f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f299614g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f299615h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f299616i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f299617m;

    /* renamed from: n, reason: collision with root package name */
    public int f299618n;

    /* renamed from: o, reason: collision with root package name */
    public int f299619o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299620p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ qi3.k0 f299621q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(jg0.x xVar, qi3.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f299620p = xVar;
        this.f299621q = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new jg0.s(this.f299620p, this.f299621q, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((jg0.s) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x03c6  */
    /* JADX WARN: Type inference failed for: r1v61, types: [int] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
