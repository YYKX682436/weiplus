package wq4;

/* loaded from: classes14.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.video.OpenGlRender f448696d;

    public x(com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender) {
        this.f448696d = openGlRender;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender = this.f448696d;
        openGlRender.f177064l.e();
        openGlRender.f177078z = false;
        openGlRender.f177059g = null;
        openGlRender.getClass();
        int i17 = com.tencent.mm.plugin.voip.video.OpenGlRender.A;
        com.tencent.mars.xlog.Log.i("OpenGlRender", "detach finish");
    }
}
