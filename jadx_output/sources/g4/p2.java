package g4;

/* loaded from: classes5.dex */
public final class p2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268485d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f268486e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f268487f;

    /* renamed from: g, reason: collision with root package name */
    public int f268488g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g4.y2 f268489h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(g4.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f268489h = y2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation completion) {
        kotlin.jvm.internal.o.g(completion, "completion");
        g4.p2 p2Var = new g4.p2(this.f268489h, completion);
        p2Var.f268485d = obj;
        return p2Var;
    }

    @Override // yz5.p
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((g4.p2) create(obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00ca  */
    /* JADX WARN: Type inference failed for: r0v11, types: [kotlinx.coroutines.sync.d] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.p2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
