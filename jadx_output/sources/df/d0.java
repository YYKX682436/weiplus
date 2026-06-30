package df;

/* loaded from: classes15.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f229440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f229441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df.p0 f229442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.RenderMode f229443g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f229444h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kotlinx.coroutines.r2 r2Var, df.p0 p0Var, io.flutter.embedding.android.RenderMode renderMode, long j17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f229441e = r2Var;
        this.f229442f = p0Var;
        this.f229443g = renderMode;
        this.f229444h = j17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df.d0(this.f229441e, this.f229442f, this.f229443g, this.f229444h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df.d0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f229440d;
        io.flutter.embedding.android.RenderMode renderMode = this.f229443g;
        df.p0 p0Var = this.f229442f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = this.f229441e;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            df.z zVar = p0Var.f229532a;
            this.f229440d = 1;
            if (zVar.f(renderMode, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.appbrand.utils.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "switchFlutterRenderSurface-" + p0Var.f229532a.getSkylineWindowId() + " to mode:" + renderMode + " tick:" + this.f229444h + " do swap surface path -- wait for render surface available end", new java.lang.Object[0]);
        p0Var.f229532a.e(renderMode, false);
        return jz5.f0.f302826a;
    }
}
