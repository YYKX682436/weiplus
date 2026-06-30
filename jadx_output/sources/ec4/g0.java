package ec4;

/* loaded from: classes10.dex */
public final class g0 implements vm5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC f251155d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f251156e;

    public g0(com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC snsFakeVideoPlayUIC, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f251155d = snsFakeVideoPlayUIC;
        this.f251156e = appCompatActivity;
    }

    @Override // vm5.a
    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayProgress", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
    }

    @Override // vm5.a
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayError", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", "video on error");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayError", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
    }

    @Override // vm5.a
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayCompleted", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", "video on completed");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayCompleted", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
    }

    @Override // vm5.a
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayStop", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", "video on stop");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayStop", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
    }

    @Override // vm5.b
    public void r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFrame", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFrame", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
    }

    @Override // vm5.a
    public void s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayStarted", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", "video on start");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayStarted", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
    }

    @Override // vm5.a
    public void x() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPlayFirstFrame", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", "videoView on FirstFrame");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setFirstFrame$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC snsFakeVideoPlayUIC = this.f251155d;
        snsFakeVideoPlayUIC.f168332o = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setFirstFrame$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        androidx.appcompat.app.AppCompatActivity activity = this.f251156e;
        kotlin.jvm.internal.o.g(activity, "activity");
        ec4.d0 d0Var = (ec4.d0) pf5.z.f353948a.a(activity).a(ec4.d0.class);
        d0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getIsEnterAniEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        boolean z17 = d0Var.f251133s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getIsEnterAniEnd", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", "first frame >> ani is end");
            kotlin.jvm.internal.o.g(activity, "activity");
            ec4.d0 d0Var2 = (ec4.d0) pf5.z.f353948a.a(activity).a(ec4.d0.class);
            d0Var2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setThumbViewVisible", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoAniUIC", "setThumbViewVisible >> 8, " + d0Var2.f251133s);
            if (d0Var2.f251133s) {
                d0Var2.T6().setVisibility(8);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setThumbViewVisible", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoAniUIC");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsFakeVideoPlayUIC", "first frame >> ani is no end");
            com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC.O6(snsFakeVideoPlayUIC).setAlpha(0.0f);
            com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC.O6(snsFakeVideoPlayUIC).pause();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPlayFirstFrame", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$videoCallback$1");
    }
}
