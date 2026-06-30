package rk4;

/* loaded from: classes11.dex */
public final class w6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f397040d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f397041e;

    /* renamed from: f, reason: collision with root package name */
    public int f397042f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f397043g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f397044h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(rk4.k8 k8Var, bw5.lp0 lp0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f397043g = k8Var;
        this.f397044h = lp0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.w6(this.f397043g, this.f397044h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.w6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e1 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.w6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
