package ij4;

/* loaded from: classes11.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f291737d;

    /* renamed from: e, reason: collision with root package name */
    public int f291738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ym3.c f291739f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ij4.o f291740g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.i2 f291741h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ym3.c cVar, ij4.o oVar, kotlinx.coroutines.flow.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f291739f = cVar;
        this.f291740g = oVar;
        this.f291741h = i2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ij4.n(this.f291739f, this.f291740g, this.f291741h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ij4.n) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0281  */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53, types: [int] */
    /* JADX WARN: Type inference failed for: r0v66 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v4 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 940
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ij4.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
