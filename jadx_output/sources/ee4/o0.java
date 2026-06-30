package ee4;

/* loaded from: classes4.dex */
public final class o0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f251730d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ee4.r0 f251731e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(ee4.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251731e = r0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1");
        ee4.o0 o0Var = new ee4.o0(this.f251731e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1");
        return o0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1");
        java.lang.Object invokeSuspend = ((ee4.o0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f251730d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWorkMgr$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
            ee4.r0 r0Var = this.f251731e;
            ge4.e eVar = r0Var.f251738n;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWorkMgr$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
            if (eVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEventFlow", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                kotlinx.coroutines.flow.f3 f3Var = eVar.f270999l;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEventFlow", "com.tencent.mm.plugin.sns.ui.widget.multi_image.livephoto.SnsPublishLivePhotoWorkMgr");
                if (f3Var != null) {
                    ee4.n0 n0Var = new ee4.n0(r0Var);
                    this.f251730d = 1;
                    if (((kotlinx.coroutines.flow.l2) f3Var).a(n0Var, this) == aVar) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1");
                        return aVar;
                    }
                }
            }
            jz5.f0 f0Var = jz5.f0.f302826a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1");
            return f0Var;
        }
        if (i17 != 1) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1");
            throw illegalStateException;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        jz5.d dVar = new jz5.d();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$initCollectEventJob$1");
        throw dVar;
    }
}
