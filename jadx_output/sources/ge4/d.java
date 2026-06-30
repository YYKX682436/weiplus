package ge4;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f270984d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f270985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ge4.a f270986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ge4.e f270987g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ge4.a aVar, ge4.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f270986f = aVar;
        this.f270987g = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        ge4.d dVar = new ge4.d(this.f270986f, this.f270987g, continuation);
        dVar.f270985e = obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        java.lang.Object invokeSuspend = ((ge4.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f270984d;
        ge4.a aVar2 = this.f270986f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.y0 y0Var2 = (kotlinx.coroutines.y0) this.f270985e;
            com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", "launchJob >> thread name: " + java.lang.Thread.currentThread().getName() + " mediaId: " + aVar2.b().g() + " mediaKey: " + aVar2.b().h());
            this.f270985e = y0Var2;
            this.f270984d = 1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startWork", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoJob");
            java.lang.Object g17 = ((he4.c) aVar2.f270975a).g(aVar2.f270976b, this);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startWork", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoJob");
            if (g17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
                return aVar;
            }
            y0Var = y0Var2;
            obj = g17;
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
                throw illegalStateException;
            }
            y0Var = (kotlinx.coroutines.y0) this.f270985e;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        fe4.d dVar = (fe4.d) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("job is finish >> id: ");
        dVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaKey", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        sb6.append(dVar.f261568a);
        sb6.append(" res: ");
        sb6.append(dVar.a());
        sb6.append(" errMsg: ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getErrorMsg", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getErrorMsg", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoDealResult");
        sb6.append(dVar.f261570c);
        com.tencent.mars.xlog.Log.i("SnsPublish.SnsPublishLivePhotoWorkMgr", sb6.toString());
        pm0.v.X(new ge4.c(y0Var, dVar, this.f270987g, aVar2));
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr$launchJob$1");
        return f0Var;
    }
}
