package wh5;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f446035d;

    /* renamed from: e, reason: collision with root package name */
    public int f446036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446038g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f446039h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f446040i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ wh5.v f446041m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f446042n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f446043o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String str, java.lang.String str2, long j17, long j18, wh5.v vVar, boolean z17, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f446037f = str;
        this.f446038g = str2;
        this.f446039h = j17;
        this.f446040i = j18;
        this.f446041m = vVar;
        this.f446042n = z17;
        this.f446043o = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wh5.d(this.f446037f, this.f446038g, this.f446039h, this.f446040i, this.f446041m, this.f446042n, this.f446043o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wh5.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        bs.b wi6;
        java.lang.String str;
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f446036e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.lang.String str2 = this.f446037f;
            if (com.tencent.mm.sdk.platformtools.y1.g(str2)) {
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                str2 = m11.b1.Di().P0(str2);
                kotlin.jvm.internal.o.f(str2, "exportToJpgAndGetFullPath(...)");
            }
            java.lang.String str3 = str2;
            bs.b wi7 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_file");
            if (wi7 == null || (wi6 = ((hs.v) ((qk.r7) i95.n0.c(qk.r7.class))).wi("check_permission")) == null) {
                return f0Var;
            }
            java.lang.String a18 = q75.c.a("jpg");
            com.tencent.mars.xlog.Log.i("C2CLiveExporter", "exportPath: " + a18 + " destCoverPath: " + str3);
            qk.r7 r7Var = (qk.r7) i95.n0.c(qk.r7.class);
            wi6.b(wi7);
            java.lang.String str4 = this.f446038g;
            kotlin.jvm.internal.o.d(a18);
            str = a18;
            aq.t0 t0Var = new aq.t0(str4, str3, a18, this.f446039h, null, 16, null);
            this.f446035d = str;
            this.f446036e = 1;
            ((hs.v) r7Var).getClass();
            a17 = qp.b.f365674a.a(wi6, t0Var, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str5 = (java.lang.String) this.f446035d;
            kotlin.ResultKt.throwOnFailure(obj);
            str = str5;
            a17 = obj;
        }
        aq.s0 s0Var = (aq.s0) a17;
        com.tencent.mars.xlog.Log.i("C2CLiveExporter", "cost " + (java.lang.System.currentTimeMillis() - this.f446040i) + ", result: " + s0Var.f12960a + " code:" + s0Var.f12961b);
        wh5.v vVar = this.f446041m;
        com.tencent.mm.ui.chatting.gallery.k1.Q(str, null, vVar.f446096a);
        x51.x0.f452109a.a(com.tencent.mm.vfs.w6.p(str), c01.ia.v(vVar.f446096a.G));
        if (!this.f446042n) {
            return f0Var;
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        wh5.c cVar = new wh5.c(s0Var, this.f446043o, null);
        this.f446035d = null;
        this.f446036e = 2;
        return kotlinx.coroutines.l.g(g3Var, cVar, this) == aVar ? aVar : f0Var;
    }
}
