package rv0;

/* loaded from: classes5.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f400165d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f400166e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f400167f;

    /* renamed from: g, reason: collision with root package name */
    public int f400168g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400169h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f400170i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(rv0.n1 n1Var, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f400169h = n1Var;
        this.f400170i = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rv0.p(this.f400169h, this.f400170i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(1:(1:(11:5|6|7|8|(1:10)|11|12|(1:14)|15|(4:17|(2:20|18)|21|22)|23)(2:28|29))(4:30|31|32|33))(4:65|66|67|(1:69)(1:70))|34|35|(7:37|11|12|(0)|15|(0)|23)(9:38|(2:58|59)|40|(1:42)(1:57)|43|44|45|46|(1:48)(9:49|8|(0)|11|12|(0)|15|(0)|23))|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0101, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0102, code lost:
    
        r16 = r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00f7 A[Catch: all -> 0x0027, TryCatch #3 {all -> 0x0027, blocks: (B:7:0x0022, B:8:0x00eb, B:10:0x00f7, B:11:0x00fa), top: B:6:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x012e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
