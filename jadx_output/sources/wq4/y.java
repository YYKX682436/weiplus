package wq4;

/* loaded from: classes14.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.video.OpenGlRender f448697d;

    public y(com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender) {
        this.f448697d = openGlRender;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f448697d.f177077y) {
            int i17 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
            com.tencent.mars.xlog.Log.i("OpenGlRender", "attachGLContext");
            this.f448697d.f177077y = !r0.f177064l.a();
            com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender = this.f448697d;
            openGlRender.f177059g = null;
            openGlRender.getClass();
            com.tencent.mars.xlog.Log.i("OpenGlRender", "attach finish");
        }
        java.lang.Object obj = com.tencent.mm.plugin.voip.video.OpenGlRender.C;
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
