package i84;

/* loaded from: classes13.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f289658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView f289659e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView seekBarView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f289659e = seekBarView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        i84.g gVar = new i84.g(this.f289659e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        return gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        java.lang.Object invokeSuspend = ((i84.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f289658d;
        if (i17 != 0 && i17 != 1) {
            java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
            throw illegalStateException;
        }
        kotlin.ResultKt.throwOnFailure(obj);
        do {
            com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView seekBarView = this.f289659e;
            seekBarView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isRefreshing", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            boolean z17 = seekBarView.isRefreshing;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isRefreshing", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
            if (z17) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getProgressProvider$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
                yz5.a aVar2 = seekBarView.f163303m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getProgressProvider$p", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView");
                if (aVar2 != null) {
                    seekBarView.setProgress(((java.lang.Number) aVar2.invoke()).floatValue());
                }
            }
            this.f289658d = 1;
        } while (kotlinx.coroutines.k1.b(1000L, this) != aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.widget.admedia.SeekBarView$onAttachedToWindow$1");
        return aVar;
    }
}
