package el2;

/* loaded from: classes3.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f253862d;

    /* renamed from: e, reason: collision with root package name */
    public int f253863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253864f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f253865g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.i23 f253866h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f253867i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(el2.i0 i0Var, java.lang.String str, r45.i23 i23Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f253864f = i0Var;
        this.f253865g = str;
        this.f253866h = i23Var;
        this.f253867i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new el2.n(this.f253864f, this.f253865g, this.f253866h, this.f253867i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((el2.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x013d  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: el2.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
