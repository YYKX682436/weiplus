package g4;

/* loaded from: classes5.dex */
public final class m3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f268442d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f268443e;

    /* renamed from: f, reason: collision with root package name */
    public int f268444f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g4.l1 f268445g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g4.n3 f268446h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(g4.l1 l1Var, kotlin.coroutines.Continuation continuation, g4.n3 n3Var) {
        super(2, continuation);
        this.f268445g = l1Var;
        this.f268446h = n3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        return new g4.m3(this.f268445g, completion, this.f268446h);
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        g4.m3 m3Var = (g4.m3) create(obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        m3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0161  */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v48 */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 927
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.m3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
