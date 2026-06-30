package fq0;

/* loaded from: classes7.dex */
public final class c0 extends fq0.i {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Collection f265444d;

    /* renamed from: e, reason: collision with root package name */
    public jc3.b0 f265445e;

    /* renamed from: f, reason: collision with root package name */
    public lc3.q f265446f;

    public c0(java.util.Collection jsApiSet) {
        kotlin.jvm.internal.o.g(jsApiSet, "jsApiSet");
        this.f265444d = jsApiSet;
    }

    @Override // jc3.a0
    public com.tencent.mm.plugin.magicbrush.MBBuildConfig b0() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclService", "onProvideConfig");
        com.tencent.mm.plugin.magicbrush.MBBuildConfig mBBuildConfig = new com.tencent.mm.plugin.magicbrush.MBBuildConfig(null, null, null, null, false, false, false, null, false, null, 1023, null);
        mBBuildConfig.f147832v = ((je3.i) i95.n0.c(je3.i.class)).Ii(1.0E-5f);
        mBBuildConfig.f147834x = this;
        mBBuildConfig.f147821h = z65.c.a();
        mBBuildConfig.a(this.f265444d);
        return mBBuildConfig;
    }

    @Override // jc3.a0
    public void h(java.lang.String envId, java.lang.String msg) {
        kotlin.jvm.internal.o.g(envId, "envId");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.e("MicroMsg.MagicSclService", "onJSException envId:" + envId + ",msg:" + msg);
    }

    @Override // jc3.z
    public lc3.g0 k0(java.lang.String version) {
        kotlin.jvm.internal.o.g(version, "version");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclService", "hy: on request provide plugin from scl service");
        synchronized (this) {
            if (this.f265446f == null) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                this.f265446f = (lc3.q) com.tencent.mm.plugin.magicbrush.s4.T9((com.tencent.mm.plugin.magicbrush.s4) c17, "MagicSclPublicService", null, 2, null);
            }
            kotlin.jvm.internal.o.d(this.f265446f);
        }
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.magicbrush.s4.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        return ((jc3.z) ((lc3.q) com.tencent.mm.plugin.magicbrush.s4.T9((com.tencent.mm.plugin.magicbrush.s4) c18, "MagicSclPublicService", null, 2, null))).k0(version);
    }

    @Override // jc3.a0
    public void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclService", "onMainScriptInjected");
    }

    @Override // jc3.a0
    public void onCreated() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclService", "onCreated");
    }

    @Override // jc3.a0
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclService", "onDestroy");
        this.f265445e = null;
        this.f265446f = null;
        we3.e eVar = (we3.e) ((ve3.n) i95.n0.c(ve3.n.class));
        eVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MBExternalFinderLive", "clearAll");
        java.util.HashMap hashMap = eVar.f445272d;
        java.util.Collection values = hashMap.values();
        kotlin.jvm.internal.o.f(values, "<get-values>(...)");
        java.util.Iterator it = values.iterator();
        while (it.hasNext()) {
            ((we3.k) it.next()).d();
        }
        hashMap.clear();
        xe3.p pVar = (xe3.p) ((ve3.s) i95.n0.c(ve3.s.class));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearAll, total items: ");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = pVar.f453962d;
        sb6.append(concurrentHashMap.size());
        com.tencent.mars.xlog.Log.i("MB_External_surface_video_service", sb6.toString());
        java.util.Collection<xe3.f> values2 = concurrentHashMap.values();
        kotlin.jvm.internal.o.f(values2, "<get-values>(...)");
        for (xe3.f fVar : values2) {
            try {
                fVar.getClass();
                com.tencent.mars.xlog.Log.i("MB_External_surface_video_item", "destroy " + fVar);
                rh3.r rVar = fVar.f453944d;
                rVar.stop();
                rVar.release();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MB_External_surface_video_service", "destroy item failed", e17);
            }
        }
        concurrentHashMap.clear();
        pVar.f453963e.clear();
    }

    @Override // jc3.a0
    public void w(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclService", "onCanvasViewFirstFrameRender " + i17);
    }

    @Override // jc3.a0
    public void x0(jc3.b0 dispatcher) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        this.f265445e = dispatcher;
    }
}
