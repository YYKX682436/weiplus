package df2;

/* loaded from: classes10.dex */
public final class h9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230311d;

    /* renamed from: e, reason: collision with root package name */
    public int f230312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.k9 f230313f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(df2.k9 k9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230313f = k9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.h9(this.f230313f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.h9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00cf, code lost:
    
        r7 = (c61.yb) i95.n0.c(c61.yb.class);
        r9 = r1.f230560n;
        r10 = com.tencent.mm.sdk.platformtools.w2.a(r8);
        kotlin.jvm.internal.o.f(r10, "getMD5String(...)");
        r7 = ((c61.p2) r7).bj(r9, r10);
        com.tencent.mars.xlog.Log.i(r1.f230559m, "loadpag, path:" + r7);
        r1 = wh2.l.f445955a;
        r14.f230311d = r7;
        r14.f230312e = 1;
        r1 = r1.a(r8, r7, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0105, code lost:
    
        if (r1 != r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0107, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0108, code lost:
    
        r12 = r0;
        r0 = r14;
        r14 = r1;
        r1 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x002a, code lost:
    
        r14 = r0;
        r0 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0180 A[SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.h9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
