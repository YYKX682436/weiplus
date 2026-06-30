package df2;

/* loaded from: classes10.dex */
public final class z6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231929d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f231930e;

    /* renamed from: f, reason: collision with root package name */
    public int f231931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.a7 f231932g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(df2.a7 a7Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231932g = a7Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.z6(this.f231932g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.z6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        com.tencent.mars.xlog.Log.i(r1.f229683m, "[play-start] event:" + r3);
        r10.f231929d = r3;
        r10.f231930e = r4;
        r10.f231931f = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b7, code lost:
    
        if (r4.G6(r3, r10) != r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00ba -> B:5:0x00bb). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.z6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
