package nu0;

/* loaded from: classes5.dex */
public final class k2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f339997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider f339999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f340000g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f340001h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(nu0.b4 b4Var, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider, java.util.List list, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f339998e = b4Var;
        this.f339999f = recordConfigProvider;
        this.f340000g = list;
        this.f340001h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new nu0.k2(this.f339998e, this.f339999f, this.f340000g, this.f340001h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.k2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object Y6;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f339997d;
        nu0.b4 b4Var = this.f339998e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f339997d = 1;
            Y6 = nu0.b4.Y6(b4Var, this);
            if (Y6 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            Y6 = obj;
        }
        boolean booleanValue = ((java.lang.Boolean) Y6).booleanValue();
        xt0.b bVar = b4Var.Z;
        android.app.Activity context = b4Var.getContext();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(booleanValue);
        bVar.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = this.f339999f;
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        java.util.List imagePathList = this.f340000g;
        kotlin.jvm.internal.o.g(imagePathList, "imagePathList");
        bVar.b(configProvider);
        ut3.f fVar = ut3.f.f431176c;
        android.os.Bundle bundle = fVar.f431178b;
        bundle.putBoolean("KEY_DELAY_ENTER_POST_UI", this.f340001h);
        bundle.putByteArray("KEY_POST_ASSET_INFO", null);
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = configProvider.I;
        bundle.putInt("key_ref_enter_scene", videoCaptureReportInfo != null ? videoCaptureReportInfo.f155696m : 0);
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo2 = configProvider.I;
        bundle.putLong("key_ref_feed_id", videoCaptureReportInfo2 != null ? videoCaptureReportInfo2.f155694h : 0L);
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo3 = configProvider.I;
        bundle.putString("key_ref_feed_dup_flag", videoCaptureReportInfo3 != null ? videoCaptureReportInfo3.f155695i : null);
        if (valueOf != null) {
            bundle.putBoolean("KEY_POST_ASSETS_IS_REAL_SHOOT", valueOf.booleanValue());
        }
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        nu3.i iVar = nu3.i.f340218a;
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = new com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel(bool, "", "", 0L, bool2, iVar.l());
        captureDataManager$CaptureVideoNormalModel.f155666m.addAll(imagePathList);
        fVar.a(context, captureDataManager$CaptureVideoNormalModel);
        fVar.d(true, iVar.l());
        return jz5.f0.f302826a;
    }
}
