package rp4;

/* loaded from: classes10.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f398622d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f398623e;

    /* renamed from: f, reason: collision with root package name */
    public int f398624f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rp4.f0 f398625g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ st3.s f398626h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rp4.x f398627i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(rp4.f0 f0Var, st3.s sVar, rp4.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398625g = f0Var;
        this.f398626h = sVar;
        this.f398627i = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rp4.e0(this.f398625g, this.f398626h, this.f398627i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rp4.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x02cb  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 1152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp4.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
