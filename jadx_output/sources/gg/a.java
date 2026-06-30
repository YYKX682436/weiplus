package gg;

/* loaded from: classes7.dex */
public class a implements gg.c {

    /* renamed from: a, reason: collision with root package name */
    public eg.c f271484a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f271485b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public sf.d f271486c;

    public boolean a(java.lang.String str, sf.f fVar) {
        return true;
    }

    public final java.lang.String b() {
        return java.lang.String.format(java.util.Locale.US, "%s(%s)", "MicroMsg.SameLayer.DefaultExtendPluginClientProxy", java.lang.Integer.valueOf(hashCode()));
    }

    public final synchronized eg.b c(java.lang.String str, int i17, java.lang.String str2) {
        return d(str, i17, str2, true);
    }

    public final eg.b d(java.lang.String str, int i17, java.lang.String str2, boolean z17) {
        java.util.Map map = this.f271485b;
        eg.b bVar = (eg.b) ((java.util.concurrent.ConcurrentHashMap) map).get(str2);
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e(b(), "getPluginHandler, key:%s, current no handler for this key", str2);
            eg.c cVar = this.f271484a;
            if (cVar != null) {
                if (z17) {
                    bVar = cVar.Ua(str);
                    if (bVar != null) {
                        com.tencent.mars.xlog.Log.w(b(), "getPluginHandler, key:%s, created new plugin handler(%s)", str2, java.lang.Integer.valueOf(bVar.hashCode()));
                        eg.a aVar = (eg.a) bVar;
                        aVar.f252497d = i17;
                        aVar.f252498e = str;
                        aVar.f252499f = this;
                        ((java.util.concurrent.ConcurrentHashMap) map).put(str2, bVar);
                    } else {
                        com.tencent.mars.xlog.Log.e(b(), "getPluginHandler, key:%s, no handler for this key?", str2);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(b(), "getPluginHandler, key:%s, do not create handler", str2);
                }
            }
        }
        return bVar;
    }

    public java.lang.String e(java.lang.String str, int i17, sf.f fVar) {
        eg.b d17;
        java.lang.String d18 = sf.i.d(str, i17);
        boolean a17 = a(str, fVar);
        com.tencent.mars.xlog.Log.i(b(), "handleJsApi, key:%s, jsapi:%s, createHandlerIfNeed: %b", d18, fVar.l(), java.lang.Boolean.valueOf(a17));
        synchronized (this) {
            d17 = d(str, i17, d18, a17);
        }
        if (d17 == null) {
            com.tencent.mars.xlog.Log.w(b(), "handleJsApi, key:%s, handler is null", d18);
            if (fVar.j()) {
                return fVar.a(jc1.f.f298915d);
            }
            fVar.a(jc1.f.f298915d);
            return "";
        }
        if (d17.b(fVar)) {
            if (fVar.j()) {
                return d17.f(fVar);
            }
            d17.f(fVar);
            return "";
        }
        if (fVar.j()) {
            return fVar.a(jc1.f.f298912a);
        }
        fVar.a(jc1.f.f298912a);
        return "";
    }

    public void f(java.lang.String str, int i17) {
        java.lang.String d17 = sf.i.d(str, i17);
        com.tencent.mars.xlog.Log.i(b(), "onPluginDestroy, key:%s", d17);
        eg.b c17 = c(str, i17, d17);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.w(b(), "onPluginDestroy, key:%s, handler is null", d17);
        } else {
            c17.e();
        }
    }

    public void g(java.lang.String str, int i17, android.graphics.SurfaceTexture surfaceTexture) {
        java.lang.String d17 = sf.i.d(str, i17);
        com.tencent.mars.xlog.Log.i(b(), "onPluginReady, key:%s", d17);
        eg.b c17 = c(str, i17, d17);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.w(b(), "onPluginReady, key:%s, handler is null", d17);
        } else {
            com.tencent.mars.xlog.Log.i(b(), "onPluginReady, key:%s, handler is ready", d17);
            c17.p(surfaceTexture);
        }
    }

    public void h(java.lang.String str, int i17, android.view.MotionEvent motionEvent) {
        java.lang.String d17 = sf.i.d(str, i17);
        b();
        eg.b c17 = c(str, i17, d17);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.w(b(), "onPluginTouch, key:%s, handler is null", d17);
        } else {
            c17.c(motionEvent);
        }
    }

    public synchronized void i(java.lang.String str, int i17) {
        java.lang.String d17 = sf.i.d(str, i17);
        com.tencent.mars.xlog.Log.i(b(), "removePlugin, key:%s", d17);
        ((java.util.concurrent.ConcurrentHashMap) this.f271485b).remove(d17);
    }
}
