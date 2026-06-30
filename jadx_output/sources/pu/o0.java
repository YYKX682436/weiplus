package pu;

/* loaded from: classes12.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358351d;

    /* renamed from: e, reason: collision with root package name */
    public int f358352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi3.c f358353f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pu.t0 f358354g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(qi3.c cVar, pu.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358353f = cVar;
        this.f358354g = t0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pu.o0(this.f358353f, this.f358354g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pu.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x013c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b5 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.o0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
