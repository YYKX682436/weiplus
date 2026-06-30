package hz3;

/* loaded from: classes12.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f286349d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry3.p f286350e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hz3.s f286351f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hz3.r f286352g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ry3.p pVar, hz3.s sVar, hz3.r rVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f286350e = pVar;
        this.f286351f = sVar;
        this.f286352g = rVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hz3.n(this.f286350e, this.f286351f, this.f286352g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hz3.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0105  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hz3.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
