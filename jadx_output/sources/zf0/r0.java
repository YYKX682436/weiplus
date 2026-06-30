package zf0;

/* loaded from: classes12.dex */
public final class r0 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f472522d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f472523e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f472524f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f472525g;

    /* renamed from: h, reason: collision with root package name */
    public int f472526h;

    /* renamed from: i, reason: collision with root package name */
    public int f472527i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472528m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ qi3.i0 f472529n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(zf0.v0 v0Var, qi3.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f472528m = v0Var;
        this.f472529n = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new zf0.r0(this.f472528m, this.f472529n, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((zf0.r0) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x04da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c8  */
    /* JADX WARN: Type inference failed for: r0v77, types: [int] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 1252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zf0.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
