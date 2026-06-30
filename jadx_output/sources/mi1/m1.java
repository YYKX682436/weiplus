package mi1;

/* loaded from: classes7.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f326623d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f326624e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f326625f;

    /* renamed from: g, reason: collision with root package name */
    public int f326626g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mi1.q1 f326627h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mi1.r1 f326628i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f326629m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(mi1.q1 q1Var, mi1.r1 r1Var, android.widget.LinearLayout linearLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f326627h = q1Var;
        this.f326628i = r1Var;
        this.f326629m = linearLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mi1.m1(this.f326627h, this.f326628i, this.f326629m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mi1.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if ((r10 != null && r10.getVisibility() == 0) != false) goto L31;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
