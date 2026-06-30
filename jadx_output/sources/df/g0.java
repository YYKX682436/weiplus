package df;

/* loaded from: classes15.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f229462d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f229463e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df.p0 f229464f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.RenderMode f229465g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f229466h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f229467i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f229468m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(df.p0 p0Var, io.flutter.embedding.android.RenderMode renderMode, long j17, kotlinx.coroutines.r2 r2Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229464f = p0Var;
        this.f229465g = renderMode;
        this.f229466h = j17;
        this.f229467i = r2Var;
        this.f229468m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        df.g0 g0Var = new df.g0(this.f229464f, this.f229465g, this.f229466h, this.f229467i, this.f229468m, continuation);
        g0Var.f229463e = obj;
        return g0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df.g0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.String str;
        long j17;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        io.flutter.embedding.engine.renderer.FlutterRenderer flutterRenderer;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f229462d;
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        long j18 = this.f229466h;
        io.flutter.embedding.android.RenderMode renderMode = this.f229465g;
        df.p0 p0Var = this.f229464f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f229463e;
            com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "switchFlutterRenderSurface-" + p0Var.f229532a.getSkylineWindowId() + " to mode:" + renderMode + " tick:" + j18 + " do swap surface path -- coroutine scope start", new java.lang.Object[0]);
            kotlinx.coroutines.r2 r2Var = this.f229467i;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchFlutterRenderSurface-");
            df.z zVar = p0Var.f229532a;
            sb6.append(zVar.getSkylineWindowId());
            sb6.append(" to mode:");
            sb6.append(renderMode);
            sb6.append(" tick:");
            sb6.append(j18);
            sb6.append(" do swap surface path -- lastInFlightJob cancel end");
            com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", sb6.toString(), new java.lang.Object[0]);
            io.flutter.embedding.engine.renderer.FlutterRenderer attachedRenderer = zVar.getAttachedRenderer();
            if (attachedRenderer == null) {
                return f0Var2;
            }
            com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "switchFlutterRenderSurface-" + zVar.getSkylineWindowId() + " to mode:" + renderMode + " tick:" + j18 + " do swap surface path -- acquire renderer end", new java.lang.Object[0]);
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            kotlinx.coroutines.a1 a1Var = kotlinx.coroutines.a1.UNDISPATCHED;
            f0Var = f0Var2;
            str = "SkylineFlutterViewWrapperSwapRenderSurfaceImpl";
            j17 = j18;
            str2 = " tick:";
            str3 = " to mode:";
            str4 = "switchFlutterRenderSurface-";
            kotlinx.coroutines.f1[] f1VarArr = {kotlinx.coroutines.l.a(y0Var, g3Var, a1Var, new df.e0(this.f229464f, this.f229465g, this.f229466h, null)), kotlinx.coroutines.l.a(y0Var, g3Var, a1Var, new df.f0(this.f229468m, this.f229464f, this.f229465g, this.f229466h, attachedRenderer, null))};
            this.f229463e = attachedRenderer;
            this.f229462d = 1;
            if (kotlinx.coroutines.h.b(f1VarArr, this) == aVar) {
                return aVar;
            }
            flutterRenderer = attachedRenderer;
            obj2 = null;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                f0Var = f0Var2;
                j17 = j18;
                str2 = " tick:";
                str4 = "switchFlutterRenderSurface-";
                str = "SkylineFlutterViewWrapperSwapRenderSurfaceImpl";
                str3 = " to mode:";
                com.tencent.mm.plugin.appbrand.utils.s3.b(str, str4 + p0Var.f229532a.getSkylineWindowId() + str3 + renderMode + str2 + j17 + " do swap surface path -- waitForLastFrameRedrawn end", new java.lang.Object[0]);
                p0Var.f229532a.e(renderMode, false);
                return f0Var;
            }
            flutterRenderer = (io.flutter.embedding.engine.renderer.FlutterRenderer) this.f229463e;
            kotlin.ResultKt.throwOnFailure(obj);
            f0Var = f0Var2;
            j17 = j18;
            str2 = " tick:";
            str4 = "switchFlutterRenderSurface-";
            str = "SkylineFlutterViewWrapperSwapRenderSurfaceImpl";
            obj2 = null;
            str3 = " to mode:";
        }
        this.f229463e = obj2;
        this.f229462d = 2;
        if (df.p0.n(p0Var, flutterRenderer, this) == aVar) {
            return aVar;
        }
        com.tencent.mm.plugin.appbrand.utils.s3.b(str, str4 + p0Var.f229532a.getSkylineWindowId() + str3 + renderMode + str2 + j17 + " do swap surface path -- waitForLastFrameRedrawn end", new java.lang.Object[0]);
        p0Var.f229532a.e(renderMode, false);
        return f0Var;
    }
}
