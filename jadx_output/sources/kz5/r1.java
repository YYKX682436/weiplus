package kz5;

/* loaded from: classes14.dex */
public final class r1 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f314003e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f314004f;

    /* renamed from: g, reason: collision with root package name */
    public int f314005g;

    /* renamed from: h, reason: collision with root package name */
    public int f314006h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f314007i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f314008m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f314009n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.Iterator f314010o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f314011p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f314012q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(int i17, int i18, java.util.Iterator it, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f314008m = i17;
        this.f314009n = i18;
        this.f314010o = it;
        this.f314011p = z17;
        this.f314012q = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kz5.r1 r1Var = new kz5.r1(this.f314008m, this.f314009n, this.f314010o, this.f314011p, this.f314012q, continuation);
        r1Var.f314007i = obj;
        return r1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kz5.r1) create((q26.p) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0092, code lost:
    
        r1.f314007i = r5;
        r1.f314003e = r4;
        r1.f314004f = r3;
        r1.f314005g = r10;
        r1.f314006h = 1;
        r5.b(r4, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x00a1, code lost:
    
        if (pz5.a.f359186d != r0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00a3, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x018a -> B:12:0x018d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0155 -> B:30:0x0158). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x00a1 -> B:67:0x00a4). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kz5.r1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
