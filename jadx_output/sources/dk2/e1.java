package dk2;

/* loaded from: classes3.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f233336d;

    /* renamed from: e, reason: collision with root package name */
    public int f233337e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f233338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f233339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233340h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.s f233341i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(boolean z17, dk2.r4 r4Var, yz5.s sVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233339g = z17;
        this.f233340h = r4Var;
        this.f233341i = sVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        dk2.e1 e1Var = new dk2.e1(this.f233339g, this.f233340h, this.f233341i, continuation);
        e1Var.f233338f = obj;
        return e1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0101  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
