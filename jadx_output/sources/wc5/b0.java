package wc5;

/* loaded from: classes4.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444533d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f444534e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wc5.c0 f444535f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f444536g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(wc5.c0 c0Var, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f444535f = c0Var;
        this.f444536g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wc5.b0 b0Var = new wc5.b0(this.f444535f, this.f444536g, continuation);
        b0Var.f444534e = obj;
        return b0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wc5.b0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x019f A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wc5.b0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
