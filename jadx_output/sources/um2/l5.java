package um2;

/* loaded from: classes3.dex */
public final class l5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f428868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f428869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428870f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428871g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f428872h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l5(kotlin.jvm.internal.h0 h0Var, um2.x5 x5Var, java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f428869e = h0Var;
        this.f428870f = x5Var;
        this.f428871g = str;
        this.f428872h = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        um2.l5 l5Var = new um2.l5(this.f428869e, this.f428870f, this.f428871g, this.f428872h, continuation);
        l5Var.f428868d = obj;
        return l5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        um2.l5 l5Var = (um2.l5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        l5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0244, code lost:
    
        if (r8 == null) goto L106;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: um2.l5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
