package qf2;

/* loaded from: classes.dex */
public final class f3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362371d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f362372e;

    /* renamed from: f, reason: collision with root package name */
    public int f362373f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qf2.q3 f362374g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f362375h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362376i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(qf2.q3 q3Var, int i17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362374g = q3Var;
        this.f362375h = i17;
        this.f362376i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.f3(this.f362374g, this.f362375h, this.f362376i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.f3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x014e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.f3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
