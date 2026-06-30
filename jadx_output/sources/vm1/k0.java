package vm1;

/* loaded from: classes10.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438021f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f438022g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f438023h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f438024i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f438025m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ vm1.x0 f438026n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.lang.String str, java.lang.String str2, long j17, java.lang.String str3, boolean z17, long j18, vm1.x0 x0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f438020e = str;
        this.f438021f = str2;
        this.f438022g = j17;
        this.f438023h = str3;
        this.f438024i = z17;
        this.f438025m = j18;
        this.f438026n = x0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vm1.k0(this.f438020e, this.f438021f, this.f438022g, this.f438023h, this.f438024i, this.f438025m, this.f438026n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vm1.k0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f438019d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            um1.a aVar2 = mm1.b0.f328635i;
            um1.a aVar3 = mm1.b0.f328635i;
            if (aVar3 != null) {
                this.f438019d = 1;
                ((com.tencent.mm.plugin.audio.BizAudioFlutterActivity) aVar3).a7(this);
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
        java.lang.String str = this.f438020e;
        sb6.append(str);
        sb6.append(", path: ");
        java.lang.String str2 = this.f438021f;
        sb6.append(str2);
        sb6.append(", scene: ");
        long j17 = this.f438022g;
        sb6.append(j17);
        sb6.append(", sceneNote: ");
        java.lang.String str3 = this.f438023h;
        sb6.append(str3);
        sb6.append(", noReLaunch: ");
        boolean z18 = this.f438024i;
        sb6.append(z18);
        sb6.append(", debugMode: ");
        long j18 = this.f438025m;
        sb6.append(j18);
        com.tencent.mars.xlog.Log.i("FlutterBizAudioInteractPlugin", sb6.toString());
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
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.f438026n.a(), b1Var);
        return f0Var;
    }
}
