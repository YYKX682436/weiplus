package t74;

/* loaded from: classes4.dex */
public final class r1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f416237e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(t74.w1 w1Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f416236d = w1Var;
        this.f416237e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$showNextFrame$1$onPreDraw$1");
        t74.r1 r1Var = new t74.r1(this.f416236d, this.f416237e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$showNextFrame$1$onPreDraw$1");
        return r1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$showNextFrame$1$onPreDraw$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$showNextFrame$1$onPreDraw$1");
        t74.r1 r1Var = (t74.r1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r1Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$showNextFrame$1$onPreDraw$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$showNextFrame$1$onPreDraw$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$showNextFrame$1$onPreDraw$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        t74.w1 w1Var = this.f416236d;
        com.tencent.mars.xlog.Log.i(w1Var.j(), "next onPreDraw frame");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMFakeThumbContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFakeThumbContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) w1Var.T).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFakeThumbContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMFakeThumbContainer", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        android.widget.FrameLayout b07 = t74.w1.b0(w1Var);
        if (b07 != null) {
            b07.setVisibility(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPreDrawFlow$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        kotlinx.coroutines.flow.j2 j2Var = w1Var.f416289v0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPreDrawFlow$p", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent");
        ((kotlinx.coroutines.flow.h3) j2Var).k(java.lang.Boolean.TRUE);
        if (this.f416237e && !t74.w1.l0(w1Var)) {
            t74.w1.B(w1Var);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$showNextFrame$1$onPreDraw$1");
        return f0Var;
    }
}
