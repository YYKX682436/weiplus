package ec4;

/* loaded from: classes10.dex */
public final class x implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ec4.d0 f251190a;

    public x(ec4.d0 d0Var) {
        this.f251190a = d0Var;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
        jz5.k kVar = new jz5.k("An operation is not implemented: Not yet implemented");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationCancel", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
        throw kVar;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoAniUIC", "ani end");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setEnterAniEnd$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        ec4.d0 d0Var = this.f251190a;
        d0Var.f251133s = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setEnterAniEnd$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        androidx.appcompat.app.AppCompatActivity activity = d0Var.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC snsFakeVideoPlayUIC = (com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC.class);
        snsFakeVideoPlayUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFirstFrameFinish", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        boolean z17 = snsFakeVideoPlayUIC.f168332o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFirstFrameFinish", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoAniUIC", "ani end but video is finish first frame");
            androidx.appcompat.app.AppCompatActivity activity2 = d0Var.getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC snsFakeVideoPlayUIC2 = (com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC) pf5.z.f353948a.a(activity2).a(com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC.class);
            snsFakeVideoPlayUIC2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", "resume play");
            snsFakeVideoPlayUIC2.P6().setAlpha(1.0f);
            snsFakeVideoPlayUIC2.P6().h();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumePlay", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getThumbView", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            android.widget.ImageView T6 = d0Var.T6();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getThumbView", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            T6.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoAniUIC", "ani start");
        androidx.appcompat.app.AppCompatActivity activity = this.f251190a.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC snsFakeVideoPlayUIC = (com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC.class);
        snsFakeVideoPlayUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playVideo", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        snsFakeVideoPlayUIC.P6().setPlayerCallback(snsFakeVideoPlayUIC.f168335r);
        snsFakeVideoPlayUIC.f168326f = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new ec4.f0(snsFakeVideoPlayUIC, null), 3, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playVideo", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC$runEnterAni$1$1$onPreDraw$1");
    }
}
