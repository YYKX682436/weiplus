package e10;

/* loaded from: classes7.dex */
public final class j extends e10.i implements jc3.z {

    /* renamed from: d, reason: collision with root package name */
    public final jc3.y0 f246336d;

    public j(jc3.y0 jsApiSet) {
        kotlin.jvm.internal.o.g(jsApiSet, "jsApiSet");
        this.f246336d = jsApiSet;
    }

    @Override // jc3.a0
    public com.tencent.mm.plugin.magicbrush.MBBuildConfig b0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsPublicService", "onProvideConfig");
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147834x = this;
        mBBuildConfig.f147832v = ((je3.i) i95.n0.c(je3.i.class)).Ii(1.0E-5f);
        mBBuildConfig.f147821h = z65.c.a();
        mBBuildConfig.f147822i = false;
        jc3.y0 y0Var = this.f246336d;
        mBBuildConfig.a(y0Var.f299012a);
        com.tencent.mm.plugin.magicbrush.y4.a(mBBuildConfig, new java.util.HashSet(y0Var.f299013b));
        return mBBuildConfig;
    }

    @Override // jc3.a0
    public void h(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.e("MicroMsg.MagicEcsPublicService", "onJSException envId:" + envId + ",msg:" + msg);
    }

    @Override // jc3.z
    public lc3.g0 k0(java.lang.String version) {
        kotlin.jvm.internal.o.g(version, "version");
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        return ((jc3.z) ((lc3.q) com.tencent.mm.plugin.magicbrush.s4.T9((com.tencent.mm.plugin.magicbrush.s4) c17, "MagicEcsPublicService", null, 2, null))).k0(version);
    }

    @Override // jc3.a0
    public void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsPublicService", "onMainScriptInjected");
    }

    @Override // jc3.a0
    public void onCreated() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsPublicService", "onCreated");
    }

    @Override // jc3.a0
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicEcsPublicService", "onDestroy");
    }
}
