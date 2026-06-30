package un0;

/* loaded from: classes3.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f429411d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f429412e;

    /* renamed from: f, reason: collision with root package name */
    public int f429413f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429414g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f429415h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f429416i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(kotlin.jvm.internal.h0 h0Var, android.app.Activity activity, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f429414g = h0Var;
        this.f429415h = activity;
        this.f429416i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new un0.r(this.f429414g, this.f429415h, this.f429416i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((un0.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.content.Intent createScreenCaptureIntent;
        kotlin.jvm.internal.h0 h0Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f429413f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.app.Activity activity = this.f429415h;
            this.f429411d = activity;
            kotlin.jvm.internal.h0 h0Var2 = this.f429414g;
            this.f429412e = h0Var2;
            this.f429413f = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) activity;
            java.lang.Object systemService = mMFragmentActivity.getSystemService("media_projection");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
            android.media.projection.MediaProjectionManager mediaProjectionManager = (android.media.projection.MediaProjectionManager) systemService;
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                try {
                    java.lang.Object invoke = android.media.projection.MediaProjectionManager.class.getMethod("createScreenCaptureIntent", java.lang.Class.forName("android.media.projection.MediaProjectionConfig")).invoke(mediaProjectionManager, java.lang.Class.forName("android.media.projection.MediaProjectionConfig").getMethod("createConfigForDefaultDisplay", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]));
                    kotlin.jvm.internal.o.e(invoke, "null cannot be cast to non-null type android.content.Intent");
                    createScreenCaptureIntent = (android.content.Intent) invoke;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.w("FinderLiveScreenRecordHelper", "#requestPermission MediaProjectionConfig not available, fallback to default", e17);
                    createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
                    kotlin.jvm.internal.o.d(createScreenCaptureIntent);
                }
            } else {
                createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
                kotlin.jvm.internal.o.d(createScreenCaptureIntent);
            }
            com.tencent.mars.xlog.Log.i("FinderLiveScreenRecordHelper", "#requestPermission start activity now");
            ((com.tencent.mm.ui.bd) mMFragmentActivity.startActivityForResult(createScreenCaptureIntent)).f197877a = new un0.q(this.f429416i, nVar);
            obj = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
            if (obj == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (kotlin.jvm.internal.h0) this.f429412e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        h0Var.f310123d = obj;
        return jz5.f0.f302826a;
    }
}
