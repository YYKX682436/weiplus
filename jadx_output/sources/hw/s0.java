package hw;

/* loaded from: classes7.dex */
public final class s0 extends hw.c0 {
    public android.widget.FrameLayout G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(fw.h flutterPlugin) {
        super(flutterPlugin);
        kotlin.jvm.internal.o.g(flutterPlugin, "flutterPlugin");
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return "MagicEcsTimeline";
    }

    @Override // hq0.i0, jc3.u
    public void Q9(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        super.Q9(envId, msg);
        com.tencent.mars.xlog.Log.e("MagicEcsTLBiz", "onJSException envId:" + envId + " msg:" + msg);
    }

    @Override // hw.c0, hq0.i0
    public void X0() {
        super.X0();
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147834x = this;
        mBBuildConfig.f147821h = z65.c.a();
        ((ku5.t0) ku5.t0.f312615d).g(new hw.q0(this, mBBuildConfig));
    }

    @Override // hw.c0, hq0.i0
    public void destroy() {
        com.tencent.mars.xlog.Log.i("MagicEcsTLBiz", "destroyBrandServiceBiz");
        if (z65.c.a()) {
            pm0.v.X(new hw.p0(this));
        }
        super.destroy();
    }

    @Override // hw.c0, hq0.i0, jc3.u
    public void n() {
        super.n();
        com.tencent.mars.xlog.Log.i("MagicEcsTLBiz", "onMainScriptInjected");
        ((ku5.t0) ku5.t0.f312615d).q(hw.r0.f285429d);
    }

    @Override // hw.c0, hq0.i0, jc3.u
    public void onCreated() {
        super.onCreated();
        com.tencent.mars.xlog.Log.i("MagicEcsTLBiz", "onCreated");
    }

    @Override // hq0.i0, jc3.u
    public void onDestroy(int i17) {
        super.onDestroy(i17);
        com.tencent.mars.xlog.Log.i("MagicEcsTLBiz", "onDestroy reason:" + i17);
    }

    @Override // hq0.i0
    public void start() {
        super.start();
        com.tencent.mars.xlog.Log.i("MagicEcsTLBiz", "start");
    }
}
