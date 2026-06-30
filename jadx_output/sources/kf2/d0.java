package kf2;

/* loaded from: classes.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f307215d;

    /* renamed from: e, reason: collision with root package name */
    public int f307216e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f307217f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kf2.e0 f307218g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f307219h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f307220i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(java.lang.Object obj, kf2.e0 e0Var, long j17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f307217f = obj;
        this.f307218g = e0Var;
        this.f307219h = j17;
        this.f307220i = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.d0(this.f307217f, this.f307218g, this.f307219h, this.f307220i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kf2.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00d9  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf2.d0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
