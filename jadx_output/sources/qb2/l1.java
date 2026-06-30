package qb2;

/* loaded from: classes5.dex */
public final class l1 extends qz5.l implements yz5.p {
    public final /* synthetic */ java.lang.String A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ java.lang.String E;
    public final /* synthetic */ java.lang.String F;
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderJumpInfo G;
    public final /* synthetic */ int H;

    /* renamed from: d, reason: collision with root package name */
    public int f361235d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u26.w f361236e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qb2.r1 f361237f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361238g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361239h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f361240i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f361241m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361242n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f361243o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361244p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361245q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361246r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361247s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f361248t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f361249u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ long f361250v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ long f361251w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f361252x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f361253y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f361254z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(u26.w wVar, qb2.r1 r1Var, java.lang.String str, java.lang.String str2, long j17, kotlin.jvm.internal.f0 f0Var, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, boolean z17, boolean z18, long j18, long j19, int i18, int i19, int i27, java.lang.String str8, int i28, int i29, boolean z19, java.lang.String str9, java.lang.String str10, com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo, int i37, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f361236e = wVar;
        this.f361237f = r1Var;
        this.f361238g = str;
        this.f361239h = str2;
        this.f361240i = j17;
        this.f361241m = f0Var;
        this.f361242n = str3;
        this.f361243o = i17;
        this.f361244p = str4;
        this.f361245q = str5;
        this.f361246r = str6;
        this.f361247s = str7;
        this.f361248t = z17;
        this.f361249u = z18;
        this.f361250v = j18;
        this.f361251w = j19;
        this.f361252x = i18;
        this.f361253y = i19;
        this.f361254z = i27;
        this.A = str8;
        this.B = i28;
        this.C = i29;
        this.D = z19;
        this.E = str9;
        this.F = str10;
        this.G = finderJumpInfo;
        this.H = i37;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qb2.l1(this.f361236e, this.f361237f, this.f361238g, this.f361239h, this.f361240i, this.f361241m, this.f361242n, this.f361243o, this.f361244p, this.f361245q, this.f361246r, this.f361247s, this.f361248t, this.f361249u, this.f361250v, this.f361251w, this.f361252x, this.f361253y, this.f361254z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qb2.l1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object r17;
        android.graphics.Bitmap bitmap;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f361235d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f361235d = 1;
            r17 = this.f361236e.r(this);
            if (r17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            r17 = obj;
        }
        android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) r17;
        kotlin.jvm.internal.f0 f0Var = this.f361241m;
        if (bitmap2 != null) {
            bitmap = bitmap2;
            this.f361237f.l(this.f361238g, this.f361239h, this.f361240i, f0Var.f310116d, this.f361242n, this.f361243o, this.f361244p, this.f361245q, this.f361246r, this.f361247s, bitmap, this.f361248t, this.f361249u, this.f361250v, this.f361251w, this.f361252x, this.f361253y, this.f361254z, this.A, this.B, this.C, this.D, this.E, this.F, this.G);
        } else {
            bitmap = bitmap2;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23669, this.f361244p, "return", new java.lang.Long(java.lang.System.currentTimeMillis()), "13", new java.lang.Integer(this.H), new java.lang.Integer(f0Var.f310116d));
        }
        com.tencent.mars.xlog.Log.i("Finder.GlobalPushNewXmlConsumer", "loadLinkIcon resource :" + bitmap);
        return jz5.f0.f302826a;
    }
}
