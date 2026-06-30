package df2;

/* loaded from: classes5.dex */
public final class ha extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230314d;

    /* renamed from: e, reason: collision with root package name */
    public int f230315e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.zb f230316f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha(df2.zb zbVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230316f = zbVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.ha(this.f230316f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ha) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c2  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ha.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
