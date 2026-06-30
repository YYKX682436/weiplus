package sp2;

/* loaded from: classes2.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f411027d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f411028e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f411029f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f411030g;

    /* renamed from: h, reason: collision with root package name */
    public int f411031h;

    /* renamed from: i, reason: collision with root package name */
    public int f411032i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f411033m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f411034n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(sp2.o2 o2Var, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f411033m = o2Var;
        this.f411034n = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sp2.f2(this.f411033m, this.f411034n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.f2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
    
        if (r12 >= r10.f411145m.size()) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e8, code lost:
    
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e9, code lost:
    
        sp2.o2.f(r10, r8);
        r2.f411028e = r10;
        r2.f411029f = r9;
        r2.f411030g = r14;
        r2.f411027d = r6;
        r2.f411031h = r12;
        r2.f411032i = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:
    
        if (kotlinx.coroutines.k1.b(500, r2) != r1) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0100, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0101, code lost:
    
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0127, code lost:
    
        kz5.c0.p();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x012a, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008b -> B:10:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ae -> B:10:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00b2 -> B:10:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00bd -> B:10:0x0122). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0101 -> B:6:0x0102). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.f2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
