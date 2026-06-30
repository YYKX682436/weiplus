package ee4;

/* loaded from: classes4.dex */
public final class q0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee4.r0 f251735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f251736e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ee4.r0 r0Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251735d = r0Var;
        this.f251736e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$resumeWaitWorkFinishContinuation$1");
        ee4.q0 q0Var = new ee4.q0(this.f251735d, this.f251736e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$resumeWaitWorkFinishContinuation$1");
        return q0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$resumeWaitWorkFinishContinuation$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$resumeWaitWorkFinishContinuation$1");
        ee4.q0 q0Var = (ee4.q0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        q0Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$resumeWaitWorkFinishContinuation$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$resumeWaitWorkFinishContinuation$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$resumeWaitWorkFinishContinuation$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWaitWorkFinishContinuation$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        ee4.r0 r0Var = this.f251735d;
        kotlin.coroutines.Continuation continuation = r0Var.f251740p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWaitWorkFinishContinuation$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        if (continuation != null) {
            boolean z17 = this.f251736e;
            if (!z17) {
                r0Var.j().p();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWaitWorkFinishContinuation$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
            kotlin.coroutines.Continuation continuation2 = r0Var.f251740p;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWaitWorkFinishContinuation$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
            if (continuation2 != null) {
                continuation2.resumeWith(kotlin.Result.m521constructorimpl(new ee4.h1(!z17, true)));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setWaitWorkFinishContinuation$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
            r0Var.f251740p = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setWaitWorkFinishContinuation$p", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc$resumeWaitWorkFinishContinuation$1");
        return f0Var;
    }
}
