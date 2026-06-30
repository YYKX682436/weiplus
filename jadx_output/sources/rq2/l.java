package rq2;

/* loaded from: classes.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f398837d;

    /* renamed from: e, reason: collision with root package name */
    public int f398838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f398839f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f22 f398840g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.jp1 f398841h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f398842i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r45.qt2 qt2Var, r45.f22 f22Var, r45.jp1 jp1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f398839f = qt2Var;
        this.f398840g = f22Var;
        this.f398841h = jp1Var;
        this.f398842i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rq2.l(this.f398839f, this.f398840g, this.f398841h, this.f398842i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rq2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00af  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rq2.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
