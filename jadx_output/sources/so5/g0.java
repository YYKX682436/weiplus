package so5;

/* loaded from: classes14.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f410834d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f410835e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f410836f;

    /* renamed from: g, reason: collision with root package name */
    public int f410837g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f410838h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ so5.k0 f410839i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f410840m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(so5.k0 k0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f410839i = k0Var;
        this.f410840m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        so5.g0 g0Var = new so5.g0(this.f410839i, this.f410840m, continuation);
        g0Var.f410838h = obj;
        return g0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((so5.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x011c A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:22:0x003b, B:24:0x0114, B:26:0x011c), top: B:21:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0139  */
    /* JADX WARN: Type inference failed for: r11v9, types: [kotlinx.coroutines.sync.d] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so5.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
