package n34;

/* loaded from: classes4.dex */
public final class z4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f334800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334801e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n34.d5 f334802f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f334803g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f334804h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(com.tencent.mm.ui.widget.dialog.u3 u3Var, android.content.Context context, n34.d5 d5Var, android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334800d = u3Var;
        this.f334801e = context;
        this.f334802f = d5Var;
        this.f334803g = view;
        this.f334804h = snsInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        n34.z4 z4Var = new n34.z4(this.f334800d, this.f334801e, this.f334802f, this.f334803g, this.f334804h, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        return z4Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        n34.z4 z4Var = (n34.z4) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        z4Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f334800d.dismiss();
        android.content.Context context = this.f334801e;
        db5.t7.e(context, context.getString(com.tencent.mm.R.string.jey), com.tencent.mm.R.raw.sns_icons_filled_top_off);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doScaleGoneAni", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        this.f334802f.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doScaleGoneAni", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        android.view.View view = this.f334803g;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, "scaleX", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(view, "scaleY", 1.0f, 0.0f);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new android.view.animation.LinearInterpolator());
        animatorSet.addListener(new n34.c5(view));
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doScaleGoneAni", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doScaleGoneAni", "com.tencent.mm.plugin.sns.TimelineStarHelper");
        ta4.g1 g1Var = ta4.g1.f416747a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEntranceType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsStarActionReporter", "setEntranceType >> 3");
        ta4.g1.f416748b = 3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEntranceType", "com.tencent.mm.plugin.sns.report.SnsStarActionReporter");
        g1Var.a(2, 4, this.f334804h);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$1");
        return f0Var;
    }
}
