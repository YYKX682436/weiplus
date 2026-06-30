package nu0;

/* loaded from: classes5.dex */
public final class n1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340039d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f340040e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f340041f;

    /* renamed from: g, reason: collision with root package name */
    public int f340042g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340043h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f340043h = b4Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.n1(this.f340043h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.n1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.n1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
