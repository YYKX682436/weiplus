package rk4;

/* loaded from: classes.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f396741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f396744g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396745h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f396746i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f396747m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ rk4.l3 f396748n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, boolean z17, long j18, rk4.l3 l3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396742e = str;
        this.f396743f = str2;
        this.f396744g = j17;
        this.f396745h = str3;
        this.f396746i = z17;
        this.f396747m = j18;
        this.f396748n = l3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.j2(this.f396742e, this.f396743f, this.f396744g, this.f396745h, this.f396746i, this.f396747m, this.f396748n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f396741d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            rk4.u6 u6Var = rk4.k8.f396788r;
            al4.a aVar2 = rk4.k8.f396790t;
            if (aVar2 != null) {
                this.f396741d = 1;
                ((com.tencent.mm.plugin.ting.TingFlutterActivity) aVar2).c7(this);
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openWeApp appId: ");
        java.lang.String str = this.f396742e;
        sb6.append(str);
        sb6.append(", path: ");
        java.lang.String str2 = this.f396743f;
        sb6.append(str2);
        sb6.append(", scene: ");
        long j17 = this.f396744g;
        sb6.append(j17);
        sb6.append(", sceneNote: ");
        java.lang.String str3 = this.f396745h;
        sb6.append(str3);
        sb6.append(", noReLaunch: ");
        boolean z18 = this.f396746i;
        sb6.append(z18);
        sb6.append(", debugMode: ");
        long j18 = this.f396747m;
        sb6.append(j18);
        com.tencent.mars.xlog.Log.i("FlutterTingInteractPlugin", sb6.toString());
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = str;
        if (!(str2 == null || r26.n0.N(str2))) {
            b1Var.f317022f = str2;
        }
        b1Var.f317032k = (int) j17;
        b1Var.f317016c = (int) j18;
        if (str3 != null && !r26.n0.N(str3)) {
            z17 = false;
        }
        if (!z17) {
            b1Var.f317034l = str3;
        }
        b1Var.f317024g = z18;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f396748n.a(), b1Var);
        return f0Var;
    }
}
