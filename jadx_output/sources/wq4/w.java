package wq4;

/* loaded from: classes14.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.video.OpenGlRender f448695d;

    public w(com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender) {
        this.f448695d = openGlRender;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender = this.f448695d;
        if (openGlRender.f177078z) {
            openGlRender.f177064l.e();
            com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender2 = this.f448695d;
            openGlRender2.f177078z = false;
            openGlRender2.f177059g = null;
            openGlRender2.getClass();
            int i17 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
            com.tencent.mars.xlog.Log.i("OpenGlRender", "detach finish");
        }
        java.lang.Object obj = com.tencent.mm.plugin.voip.video.OpenGlRender.B;
        synchronized (obj) {
            try {
                obj.notifyAll();
            } catch (java.lang.Exception e17) {
                int i18 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
                com.tencent.mars.xlog.Log.printErrStackTrace("OpenGlRender", e17, "", new java.lang.Object[0]);
            }
        }
    }
}
