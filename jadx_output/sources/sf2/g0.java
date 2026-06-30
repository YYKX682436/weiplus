package sf2;

/* loaded from: classes10.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.j0 f407140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.zr5 f407142g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hn2.d f407143h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.cy1 f407144i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.q f407145m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(sf2.j0 j0Var, java.lang.String str, r45.zr5 zr5Var, hn2.d dVar, r45.cy1 cy1Var, yz5.q qVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f407140e = j0Var;
        this.f407141f = str;
        this.f407142g = zr5Var;
        this.f407143h = dVar;
        this.f407144i = cy1Var;
        this.f407145m = qVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new sf2.g0(this.f407140e, this.f407141f, this.f407142g, this.f407143h, this.f407144i, this.f407145m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((sf2.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0124 A[Catch: Exception -> 0x0215, TryCatch #1 {Exception -> 0x0215, blocks: (B:7:0x0026, B:9:0x010e, B:13:0x0124, B:16:0x014d, B:19:0x0188, B:29:0x01f6, B:33:0x0036, B:34:0x00b6, B:35:0x00ca, B:37:0x00ce, B:39:0x00f9, B:42:0x003d, B:44:0x00c8, B:46:0x0048, B:49:0x0080, B:51:0x00a9, B:54:0x00ba, B:22:0x01a7, B:24:0x01b1, B:27:0x01d7), top: B:2:0x001e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x014d A[Catch: Exception -> 0x0215, TRY_LEAVE, TryCatch #1 {Exception -> 0x0215, blocks: (B:7:0x0026, B:9:0x010e, B:13:0x0124, B:16:0x014d, B:19:0x0188, B:29:0x01f6, B:33:0x0036, B:34:0x00b6, B:35:0x00ca, B:37:0x00ce, B:39:0x00f9, B:42:0x003d, B:44:0x00c8, B:46:0x0048, B:49:0x0080, B:51:0x00a9, B:54:0x00ba, B:22:0x01a7, B:24:0x01b1, B:27:0x01d7), top: B:2:0x001e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0121  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf2.g0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
