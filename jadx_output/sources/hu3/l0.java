package hu3;

/* loaded from: classes5.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f285150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f285151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.Surface f285152f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285153g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(boolean z17, android.view.Surface surface, hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f285151e = z17;
        this.f285152f = surface;
        this.f285153g = n0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new hu3.l0(this.f285151e, this.f285152f, this.f285153g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((hu3.l0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0081 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hu3.l0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
