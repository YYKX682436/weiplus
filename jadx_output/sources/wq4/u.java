package wq4;

/* loaded from: classes14.dex */
public class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f448689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f448690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f448691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f448692g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.video.OpenGlRender f448693h;

    public u(com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender, int i17, int i18, int i19, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f448693h = openGlRender;
        this.f448689d = i17;
        this.f448690e = i18;
        this.f448691f = i19;
        this.f448692g = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender = this.f448693h;
        int i17 = openGlRender.f177067o;
        int i18 = this.f448690e;
        int i19 = this.f448689d;
        if (i19 != i17 || i18 != openGlRender.f177068p) {
            openGlRender.f177065m.J(i19, i18);
            openGlRender.f177067o = i19;
            openGlRender.f177068p = i18;
        }
        p05.l4 l4Var = openGlRender.f177065m;
        byte[] bArr = openGlRender.f177066n;
        l4Var.x(bArr, this.f448689d, this.f448690e, bArr, 5, this.f448691f);
        this.f448692g.countDown();
    }
}
