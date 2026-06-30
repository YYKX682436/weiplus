package qi2;

/* loaded from: classes3.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f363643d;

    /* renamed from: e, reason: collision with root package name */
    public int f363644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi2.w0 f363645f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f363646g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(qi2.w0 w0Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f363645f = w0Var;
        this.f363646g = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qi2.v0(this.f363645f, this.f363646g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qi2.v0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x013f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qi2.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
