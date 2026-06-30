package gf;

/* loaded from: classes7.dex */
public final class r1 implements io.flutter.plugin.platform.ISkylineTextureHandler {
    @Override // io.flutter.plugin.platform.ISkylineTextureHandler
    public android.graphics.SurfaceTexture onCreateTexture(int i17, java.lang.String str, int i18) {
        com.tencent.mars.xlog.Log.i("SkylineViewRenderEngine", "onCreateTexture engineId:" + i17 + " type:" + str + " id:" + i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gf.h1.f271086a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyCreateTexture type:");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("SkylineTextureManager", sb6.toString());
        gf.a0 a0Var = (gf.a0) gf.h1.f271086a.get(str);
        if (a0Var != null) {
            return a0Var.d(i17, i18);
        }
        return null;
    }

    @Override // io.flutter.plugin.platform.ISkylineTextureHandler
    public boolean onDestroyTexture(int i17, java.lang.String str, int i18) {
        com.tencent.mars.xlog.Log.i("SkylineViewRenderEngine", "onDestroyTexture engineId:" + i17 + " type:" + str + " id:" + i18);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gf.h1.f271086a;
        gf.a0 a0Var = (gf.a0) gf.h1.f271086a.get(str);
        if (a0Var != null) {
            return a0Var.b(i17, i18);
        }
        return false;
    }

    @Override // io.flutter.plugin.platform.ISkylineTextureHandler
    public void onTextureDestroy(int i17, java.lang.String str, int i18) {
        gf.a2.f271012q.remove(str + '_' + i18);
        gg.c cVar = gf.a2.f271011p;
        if (cVar != null) {
            ((gg.a) cVar).f(str, i18);
        }
    }

    @Override // io.flutter.plugin.platform.ISkylineTextureHandler
    public void onTextureReady(int i17, java.lang.String str, int i18, android.graphics.SurfaceTexture surfaceTexture, int i19, int i27) {
        com.tencent.mars.xlog.Log.i("SkylineViewRenderEngine", "onTextureReady engineId:" + i17 + " type:" + str + " id:" + i18 + " surfaceTexture:" + surfaceTexture);
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(i19, i27);
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        gf.a2.f271012q.put(str + '_' + i18, valueOf);
        if (surfaceTexture != null) {
            try {
                new gf.g1(surfaceTexture).a();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("SkylineViewRenderEngine", "SkylineTextureCleanLogic clean fail! ex:" + e17.getMessage());
            }
        }
        gg.c cVar = gf.a2.f271011p;
        if (cVar != null) {
            ((gg.a) cVar).g(str, i18, surfaceTexture);
        }
    }

    @Override // io.flutter.plugin.platform.ISkylineTextureHandler
    public void onTextureTouch(int i17, java.lang.String str, int i18, android.view.MotionEvent motionEvent) {
        gg.c cVar;
        kotlin.jvm.internal.o.g(motionEvent, "motionEvent");
        motionEvent.toString();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gf.h1.f271086a;
        gf.a0 a0Var = (gf.a0) gf.h1.f271086a.get(str);
        if ((a0Var != null ? a0Var.c(i17, i18, motionEvent) : false) || (cVar = gf.a2.f271011p) == null) {
            return;
        }
        ((gg.a) cVar).h(str, i18, motionEvent);
    }

    @Override // io.flutter.plugin.platform.ISkylineTextureHandler
    public void onTextureUpdate(int i17, java.lang.String str, int i18, int i19, int i27) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = gf.h1.f271086a;
        gf.a0 a0Var = (gf.a0) gf.h1.f271086a.get(str);
        if (a0Var != null) {
            a0Var.a(i17, i18, i19, i27);
        }
    }
}
