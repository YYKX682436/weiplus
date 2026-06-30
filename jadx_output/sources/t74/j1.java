package t74;

/* loaded from: classes4.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416171d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(t74.w1 w1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f416171d = w1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        t74.j1 j1Var = new t74.j1(this.f416171d, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        return j1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        java.lang.Object invokeSuspend = ((t74.j1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W;
        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        t74.w1 w1Var = this.f416171d;
        boolean l07 = t74.w1.l0(w1Var);
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (l07) {
            com.tencent.mars.xlog.Log.i(w1Var.j(), "play, shouldInterceptAction");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
            return f0Var;
        }
        com.tencent.mars.xlog.Log.i(w1Var.j(), "play, mCurrentPageIndex is " + t74.w1.N(w1Var) + ", mCheckVideoCanPlay is " + t74.w1.L(w1Var));
        if (t74.w1.N(w1Var) == 0) {
            if (t74.w1.Y(w1Var)) {
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView H2 = t74.w1.H(w1Var);
                if ((H2 != null && H2.w()) && (H = t74.w1.H(w1Var)) != null) {
                    H.F();
                }
            }
            if (t74.w1.Z(w1Var) && t74.w1.L(w1Var)) {
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W2 = t74.w1.W(w1Var);
                if (!(W2 != null && W2.w())) {
                    com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W3 = t74.w1.W(w1Var);
                    if (!(W3 != null && W3.f0())) {
                        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W4 = t74.w1.W(w1Var);
                        if (W4 != null) {
                            W4.C();
                        }
                        com.tencent.mars.xlog.Log.i(w1Var.j(), "frontOnlineVideoView onResume");
                    }
                }
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W5 = t74.w1.W(w1Var);
                if (W5 != null) {
                    W5.K();
                }
            }
        } else {
            if (t74.w1.Z(w1Var)) {
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView W6 = t74.w1.W(w1Var);
                if ((W6 != null && W6.w()) && (W = t74.w1.W(w1Var)) != null) {
                    W.F();
                }
            }
            if (t74.w1.Y(w1Var) && t74.w1.L(w1Var)) {
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView H3 = t74.w1.H(w1Var);
                if (!(H3 != null && H3.w())) {
                    com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView H4 = t74.w1.H(w1Var);
                    if (!(H4 != null && H4.f0())) {
                        com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView H5 = t74.w1.H(w1Var);
                        if (H5 != null) {
                            H5.C();
                        }
                        com.tencent.mars.xlog.Log.i(w1Var.j(), "backOnlineVideoView onResume");
                    }
                }
                com.tencent.mm.plugin.sns.ui.video.SnsTimelineVideoView H6 = t74.w1.H(w1Var);
                if (H6 != null) {
                    H6.K();
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$play$1");
        return f0Var;
    }
}
