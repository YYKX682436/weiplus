package t74;

/* loaded from: classes4.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416081d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(t74.w1 w1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f416081d = w1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$adjustContentContainerLayout$1");
        t74.a aVar = new t74.a(this.f416081d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$adjustContentContainerLayout$1");
        return aVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$adjustContentContainerLayout$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$adjustContentContainerLayout$1");
        t74.a aVar = (t74.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        aVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$adjustContentContainerLayout$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$adjustContentContainerLayout$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView H;
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$adjustContentContainerLayout$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        t74.w1 w1Var = this.f416081d;
        com.tencent.mars.xlog.Log.i(w1Var.j(), "adjustContentContainerLayout");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$resetUI", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.M0(false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$resetUI", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (t74.w1.Z(w1Var) && (W = t74.w1.W(w1Var)) != null) {
            W.M(0, false);
        }
        if (t74.w1.Y(w1Var) && (H = t74.w1.H(w1Var)) != null) {
            H.M(0, false);
        }
        android.widget.FrameLayout b07 = t74.w1.b0(w1Var);
        if (b07 != null) {
            b07.setVisibility(4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$resizeUI", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        w1Var.N0(true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$resizeUI", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$adjustContentContainerLayout$1");
        return f0Var;
    }
}
