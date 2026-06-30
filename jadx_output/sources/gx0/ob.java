package gx0;

/* loaded from: classes5.dex */
public final class ob extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276796d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276797e;

    /* renamed from: f, reason: collision with root package name */
    public int f276798f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276799g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f276800h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob(gx0.ac acVar, ex0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276799g = acVar;
        this.f276800h = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.ob(this.f276799g, this.f276800h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ob) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00e2  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.ob.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
