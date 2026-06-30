package lr1;

/* loaded from: classes8.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f320710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f320711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f320712f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f320713g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f320714h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f320715i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f320716m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(long j17, java.lang.String str, int i17, int i18, int i19, int i27, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f320711e = j17;
        this.f320712f = str;
        this.f320713g = i17;
        this.f320714h = i18;
        this.f320715i = i19;
        this.f320716m = i27;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lr1.z(this.f320711e, this.f320712f, this.f320713g, this.f320714h, this.f320715i, this.f320716m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lr1.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[Catch: all -> 0x0190, TRY_LEAVE, TryCatch #0 {, blocks: (B:8:0x0055, B:11:0x005d, B:17:0x006b, B:77:0x018c), top: B:7:0x0055 }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lr1.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
