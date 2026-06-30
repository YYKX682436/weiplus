package ee4;

/* loaded from: classes4.dex */
public final class w0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f251762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee4.x0 f251763e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(ee4.x0 x0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251763e = x0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1");
        ee4.w0 w0Var = new ee4.w0(this.f251763e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1");
        return w0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1");
        java.lang.Object invokeSuspend = ((ee4.w0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.flow.f3 f3Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f251762d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            ee4.x0 x0Var = this.f251763e;
            ee4.r0 l17 = x0Var.l();
            l17.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWorkMgrEventFlow", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
            ge4.e eVar = l17.f251738n;
            if (eVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEventFlow", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                f3Var = eVar.f270999l;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEventFlow", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
            } else {
                f3Var = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWorkMgrEventFlow", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
            if (f3Var == null) {
                jz5.f0 f0Var = jz5.f0.f302826a;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1");
                return f0Var;
            }
            ee4.v0 v0Var = new ee4.v0(x0Var);
            this.f251762d = 1;
            if (((kotlinx.coroutines.flow.l2) f3Var).a(v0Var, this) == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.d dVar = new jz5.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicMediaErrorPc$initCollectLivePhotoWorkFlowJob$1");
        throw dVar;
    }
}
