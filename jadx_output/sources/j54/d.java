package j54;

/* loaded from: classes8.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f297822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j54.f f297823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView f297824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f297825g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j54.f fVar, com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView panoramaContainerView, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f297823e = fVar;
        this.f297824f = panoramaContainerView;
        this.f297825g = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController$setImageViewRes$2");
        j54.d dVar = new j54.d(this.f297823e, this.f297824f, this.f297825g, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController$setImageViewRes$2");
        return dVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController$setImageViewRes$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController$setImageViewRes$2");
        java.lang.Object invokeSuspend = ((j54.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController$setImageViewRes$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController$setImageViewRes$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController$setImageViewRes$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f297822d;
        com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaContainerView panoramaContainerView = this.f297824f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getData$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
            j54.b bVar = this.f297823e.f297827a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getData$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController");
            bVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowLoading", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaData");
            if (bVar.f297817b) {
                panoramaContainerView.b(true);
            }
            n74.r rVar = n74.r.f335421a;
            this.f297822d = 1;
            obj = rVar.a(this.f297825g, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, this);
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController$setImageViewRes$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController$setImageViewRes$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            panoramaContainerView.setImageBitmap(bitmap);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.panorama.PanoramaViewController$setImageViewRes$2");
        return f0Var;
    }
}
