package pu;

/* loaded from: classes12.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358284d;

    /* renamed from: e, reason: collision with root package name */
    public int f358285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f358286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pu.f0 f358287g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ut.q0 q0Var, pu.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358286f = q0Var;
        this.f358287g = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pu.b0(this.f358286f, this.f358287g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pu.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ad A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pu.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
