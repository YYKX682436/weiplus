package sm2;

/* loaded from: classes3.dex */
public final class b4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f409370d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f409371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ km2.q f409373g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f409374h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ km2.q f409375i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f409376m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(kotlin.jvm.internal.h0 h0Var, sm2.o4 o4Var, km2.q qVar, boolean z17, km2.q qVar2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f409371e = h0Var;
        this.f409372f = o4Var;
        this.f409373g = qVar;
        this.f409374h = z17;
        this.f409375i = qVar2;
        this.f409376m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        sm2.b4 b4Var = new sm2.b4(this.f409371e, this.f409372f, this.f409373g, this.f409374h, this.f409375i, this.f409376m, continuation);
        b4Var.f409370d = obj;
        return b4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        sm2.b4 b4Var = (sm2.b4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b4Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e7, code lost:
    
        if (r9 == null) goto L49;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sm2.b4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
