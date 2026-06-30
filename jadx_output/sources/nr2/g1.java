package nr2;

/* loaded from: classes2.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339194d;

    /* renamed from: e, reason: collision with root package name */
    public int f339195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nr2.i1 f339196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.q6 f339197g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(nr2.i1 i1Var, so2.q6 q6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339196f = i1Var;
        this.f339197g = q6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nr2.g1(this.f339196f, this.f339197g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr2.g1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x014f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.g1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
