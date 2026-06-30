package he4;

/* loaded from: classes4.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f280912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ he4.c f280913e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem f280914f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(he4.c cVar, com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishLivePhotoItem snsPublishLivePhotoItem, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f280913e = cVar;
        this.f280914f = snsPublishLivePhotoItem;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain$startWork$result$1");
        he4.b bVar = new he4.b(this.f280913e, this.f280914f, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain$startWork$result$1");
        return bVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain$startWork$result$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain$startWork$result$1");
        java.lang.Object invokeSuspend = ((he4.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain$startWork$result$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain$startWork$result$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain$startWork$result$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f280912d;
        he4.c cVar = this.f280913e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            cVar.e("start do work threadName: " + java.lang.Thread.currentThread().getName());
            this.f280912d = 1;
            obj = cVar.a(this.f280914f, this);
            if (obj == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain$startWork$result$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain$startWork$result$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        fe4.d dVar = (fe4.d) obj;
        cVar.e("work finish");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.chain.AbsSnsPublishLivePhotoDealChain$startWork$result$1");
        return dVar;
    }
}
