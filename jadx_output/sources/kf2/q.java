package kf2;

/* loaded from: classes.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f307287d;

    /* renamed from: e, reason: collision with root package name */
    public int f307288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kf2.r f307289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f307290g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f307291h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kf2.r rVar, long j17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f307289f = rVar;
        this.f307290g = j17;
        this.f307291h = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.q(this.f307289f, this.f307290g, this.f307291h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kf2.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf2.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
