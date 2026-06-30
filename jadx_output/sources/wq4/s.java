package wq4;

/* loaded from: classes14.dex */
public class s implements java.lang.Runnable {
    public s(com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender) {
    }

    @Override // java.lang.Runnable
    public void run() {
        br4.e b17 = br4.e.b();
        b17.getClass();
        try {
            if (b17.f23720c != null) {
                is0.c cVar = b17.f23719b;
                if (cVar != null) {
                    cVar.close();
                }
                b17.f23720c.release();
                b17.f23720c = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.VoipHardDecodeUtil", "uninit surface texture");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VoipHardDecodeUtil", e17, "uninitSurfaceTexture error", new java.lang.Object[0]);
        }
        int i17 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
        com.tencent.mars.xlog.Log.i("OpenGlRender", "releaseSurfaceTexture call finish");
        java.lang.Object obj = com.tencent.mm.plugin.voip.video.OpenGlRender.D;
        synchronized (obj) {
            try {
                obj.notifyAll();
            } catch (java.lang.Exception e18) {
                int i18 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
                com.tencent.mars.xlog.Log.printErrStackTrace("OpenGlRender", e18, "", new java.lang.Object[0]);
            }
        }
    }
}
