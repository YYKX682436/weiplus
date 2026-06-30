package gx0;

/* loaded from: classes5.dex */
public final class b5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276224d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276225e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f276226f;

    /* renamed from: g, reason: collision with root package name */
    public int f276227g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276228h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276228h = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.b5(this.f276228h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.b5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.b5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
