package eg2;

/* loaded from: classes3.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f252620d;

    /* renamed from: e, reason: collision with root package name */
    public int f252621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eg2.s0 f252622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eg2.p0 f252624h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252625i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f252626m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(eg2.s0 s0Var, java.lang.String str, eg2.p0 p0Var, java.lang.String str2, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252622f = s0Var;
        this.f252623g = str;
        this.f252624h = p0Var;
        this.f252625i = str2;
        this.f252626m = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new eg2.r0(this.f252622f, this.f252623g, this.f252624h, this.f252625i, this.f252626m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((eg2.r0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c A[Catch: Exception -> 0x009b, CancellationException -> 0x009e, TryCatch #2 {CancellationException -> 0x009e, Exception -> 0x009b, blocks: (B:8:0x002a, B:10:0x0159, B:11:0x015c, B:12:0x0179, B:18:0x003e, B:19:0x00cf, B:23:0x00dc, B:25:0x00e6, B:29:0x00f0, B:30:0x010e, B:31:0x0127, B:33:0x012f, B:36:0x0139, B:40:0x0046, B:42:0x007c, B:44:0x0080, B:49:0x008c, B:51:0x00a1, B:52:0x00b0, B:55:0x00b9, B:60:0x004f, B:63:0x0058, B:66:0x0060, B:71:0x0073), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a1 A[Catch: Exception -> 0x009b, CancellationException -> 0x009e, TryCatch #2 {CancellationException -> 0x009e, Exception -> 0x009b, blocks: (B:8:0x002a, B:10:0x0159, B:11:0x015c, B:12:0x0179, B:18:0x003e, B:19:0x00cf, B:23:0x00dc, B:25:0x00e6, B:29:0x00f0, B:30:0x010e, B:31:0x0127, B:33:0x012f, B:36:0x0139, B:40:0x0046, B:42:0x007c, B:44:0x0080, B:49:0x008c, B:51:0x00a1, B:52:0x00b0, B:55:0x00b9, B:60:0x004f, B:63:0x0058, B:66:0x0060, B:71:0x0073), top: B:2:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b9 A[Catch: Exception -> 0x009b, CancellationException -> 0x009e, TryCatch #2 {CancellationException -> 0x009e, Exception -> 0x009b, blocks: (B:8:0x002a, B:10:0x0159, B:11:0x015c, B:12:0x0179, B:18:0x003e, B:19:0x00cf, B:23:0x00dc, B:25:0x00e6, B:29:0x00f0, B:30:0x010e, B:31:0x0127, B:33:0x012f, B:36:0x0139, B:40:0x0046, B:42:0x007c, B:44:0x0080, B:49:0x008c, B:51:0x00a1, B:52:0x00b0, B:55:0x00b9, B:60:0x004f, B:63:0x0058, B:66:0x0060, B:71:0x0073), top: B:2:0x001e }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: eg2.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
