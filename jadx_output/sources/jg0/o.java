package jg0;

/* loaded from: classes12.dex */
public final class o extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f299597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi3.d0 f299599f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jg0.x xVar, qi3.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f299598e = xVar;
        this.f299599f = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new jg0.o(this.f299598e, this.f299599f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((jg0.o) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0332 A[RETURN] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v27 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jg0.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
