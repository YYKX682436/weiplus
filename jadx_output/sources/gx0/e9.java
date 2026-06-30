package gx0;

/* loaded from: classes5.dex */
public final class e9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276367d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276368e;

    /* renamed from: f, reason: collision with root package name */
    public int f276369f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.p9 f276370g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f276371h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f276372i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(gx0.p9 p9Var, boolean z17, boolean z18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276370g = p9Var;
        this.f276371h = z17;
        this.f276372i = z18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.e9(this.f276370g, this.f276371h, this.f276372i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.e9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x016c A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.e9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
