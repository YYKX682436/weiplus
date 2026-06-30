package v26;

/* loaded from: classes14.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f432973d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f432974e;

    /* renamed from: f, reason: collision with root package name */
    public int f432975f;

    /* renamed from: g, reason: collision with root package name */
    public int f432976g;

    /* renamed from: h, reason: collision with root package name */
    public int f432977h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432978i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.j[] f432979m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.a f432980n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yz5.q f432981o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f432982p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(kotlinx.coroutines.flow.j[] jVarArr, yz5.a aVar, yz5.q qVar, kotlinx.coroutines.flow.k kVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f432979m = jVarArr;
        this.f432980n = aVar;
        this.f432981o = qVar;
        this.f432982p = kVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        v26.a0 a0Var = new v26.a0(this.f432979m, this.f432980n, this.f432981o, this.f432982p, continuation);
        a0Var.f432978i = obj;
        return a0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((v26.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c9, code lost:
    
        r15 = r7;
        r23 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0109 A[EDGE_INSN: B:37:0x0109->B:24:0x0109 BREAK  A[LOOP:0: B:16:0x00ea->B:36:?], SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0150 -> B:7:0x0153). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v26.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
