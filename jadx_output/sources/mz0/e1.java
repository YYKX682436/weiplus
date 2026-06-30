package mz0;

/* loaded from: classes5.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332936d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f332937e;

    /* renamed from: f, reason: collision with root package name */
    public int f332938f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332939g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.m5 f332940h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332941i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ dz0.l f332942m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.mj_template.sns.compose.widget.m5 m5Var, mz0.b2 b2Var, dz0.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332940h = m5Var;
        this.f332941i = b2Var;
        this.f332942m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mz0.e1 e1Var = new mz0.e1(this.f332940h, this.f332941i, this.f332942m, continuation);
        e1Var.f332939g = obj;
        return e1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012d  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v3, types: [kotlin.coroutines.Continuation, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v7 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
