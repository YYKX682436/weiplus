package sc2;

/* loaded from: classes2.dex */
public final class t5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f406262d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f406263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f406264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f406266h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(sc2.d6 d6Var, android.view.View view, in5.s0 s0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f406264f = d6Var;
        this.f406265g = view;
        this.f406266h = s0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        sc2.t5 t5Var = new sc2.t5(this.f406264f, this.f406265g, this.f406266h, continuation);
        t5Var.f406263e = obj;
        return t5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc2.t5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cb, code lost:
    
        if (r10 != false) goto L52;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.t5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
