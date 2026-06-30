package dk;

/* loaded from: classes7.dex */
public final class a extends zj.a {

    /* renamed from: d, reason: collision with root package name */
    public final jc3.y0 f233104d;

    public a(jc3.y0 jsApiSet) {
        kotlin.jvm.internal.o.g(jsApiSet, "jsApiSet");
        this.f233104d = jsApiSet;
    }

    @Override // jc3.a0
    public com.tencent.mm.plugin.magicbrush.MBBuildConfig b0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicAdvertisePublicService", "onProvideConfig");
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147834x = this;
        mBBuildConfig.f147832v = ((je3.i) i95.n0.c(je3.i.class)).Ii(1.0E-5f);
        mBBuildConfig.f147821h = z65.c.a();
        mBBuildConfig.f147822i = false;
        jc3.y0 y0Var = this.f233104d;
        mBBuildConfig.a(y0Var.f299012a);
        com.tencent.mm.plugin.magicbrush.y4.a(mBBuildConfig, new java.util.HashSet(y0Var.f299013b));
        return mBBuildConfig;
    }

    @Override // jc3.a0
    public void h(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.e("MicroMsg.MagicAdvertisePublicService", "onJSException envId:" + envId + ",msg:" + msg);
    }

    @Override // jc3.a0
    public void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicAdvertisePublicService", "onMainScriptInjected");
    }

    @Override // jc3.a0
    public void onCreated() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicAdvertisePublicService", "onCreated");
    }

    @Override // jc3.a0
    public void onDestroy() {
        ((k81.a) ((j81.k) i95.n0.c(j81.k.class))).wi("MagicAdPublicService");
        ((j81.a) ((x71.m) i95.n0.c(x71.m.class))).wi("MagicAdPublicService");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicAdvertisePublicService", "onDestroy");
    }
}
