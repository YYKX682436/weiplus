package kf2;

/* loaded from: classes.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f307262d;

    /* renamed from: e, reason: collision with root package name */
    public int f307263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f307264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kf2.l0 f307265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f307266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f307267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.Object obj, kf2.l0 l0Var, long j17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f307264f = obj;
        this.f307265g = l0Var;
        this.f307266h = j17;
        this.f307267i = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.k0(this.f307264f, this.f307265g, this.f307266h, this.f307267i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kf2.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00f5  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf2.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
