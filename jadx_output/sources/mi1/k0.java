package mi1;

/* loaded from: classes7.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f326597d;

    /* renamed from: e, reason: collision with root package name */
    public int f326598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mi1.m0 f326599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mi1.j0 f326600g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f326601h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mi1.j0 f326602i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(mi1.m0 m0Var, mi1.j0 j0Var, long j17, mi1.j0 j0Var2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f326599f = m0Var;
        this.f326600g = j0Var;
        this.f326601h = j17;
        this.f326602i = j0Var2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mi1.k0(this.f326599f, this.f326600g, this.f326601h, this.f326602i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mi1.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0103 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d3 A[Catch: all -> 0x0056, Exception -> 0x0079, TryCatch #1 {all -> 0x0056, blocks: (B:9:0x0025, B:11:0x0104, B:18:0x010f, B:22:0x0038, B:24:0x00f2, B:28:0x0042, B:30:0x00cf, B:32:0x00d3, B:33:0x00d6, B:35:0x00e1, B:37:0x00e5, B:41:0x004c, B:42:0x00af, B:43:0x00b1, B:47:0x00c4, B:50:0x0051, B:52:0x007c, B:54:0x0081, B:59:0x008e, B:63:0x00a3, B:69:0x005c, B:72:0x0066, B:74:0x006e), top: B:2:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bd A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c4 A[Catch: all -> 0x0056, Exception -> 0x0079, TRY_ENTER, TryCatch #1 {all -> 0x0056, blocks: (B:9:0x0025, B:11:0x0104, B:18:0x010f, B:22:0x0038, B:24:0x00f2, B:28:0x0042, B:30:0x00cf, B:32:0x00d3, B:33:0x00d6, B:35:0x00e1, B:37:0x00e5, B:41:0x004c, B:42:0x00af, B:43:0x00b1, B:47:0x00c4, B:50:0x0051, B:52:0x007c, B:54:0x0081, B:59:0x008e, B:63:0x00a3, B:69:0x005c, B:72:0x0066, B:74:0x006e), top: B:2:0x0019 }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
