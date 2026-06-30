package df2;

/* loaded from: classes3.dex */
public final class s3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231285d;

    /* renamed from: e, reason: collision with root package name */
    public int f231286e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.u3 f231287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f231288g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(df2.u3 u3Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231287f = u3Var;
        this.f231288g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.s3(this.f231287f, this.f231288g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.s3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00f3  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.s3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
