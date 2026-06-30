package mz0;

/* loaded from: classes5.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332976d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f332977e;

    /* renamed from: f, reason: collision with root package name */
    public int f332978f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f332980h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(mz0.b2 b2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332980h = b2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        mz0.j1 j1Var = new mz0.j1(this.f332980h, continuation);
        j1Var.f332979g = obj;
        return j1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mz0.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0175  */
    /* JADX WARN: Type inference failed for: r1v7, types: [yz5.a] */
    /* JADX WARN: Type inference failed for: r6v6, types: [yz5.a] */
    /* JADX WARN: Type inference failed for: r7v6, types: [yz5.a] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mz0.j1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
