package kf2;

/* loaded from: classes.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f307244d;

    /* renamed from: e, reason: collision with root package name */
    public int f307245e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f307246f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kf2.j f307247g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f307248h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f307249i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.Object obj, kf2.j jVar, long j17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f307246f = obj;
        this.f307247g = jVar;
        this.f307248h = j17;
        this.f307249i = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new kf2.i(this.f307246f, this.f307247g, this.f307248h, this.f307249i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((kf2.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf2.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
