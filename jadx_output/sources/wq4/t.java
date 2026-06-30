package wq4;

/* loaded from: classes14.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f448687d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.video.OpenGlRender f448688e;

    public t(com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f448688e = openGlRender;
        this.f448687d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.voip.video.OpenGlRender openGlRender = this.f448688e;
        int i17 = openGlRender.f177067o;
        int i18 = openGlRender.f177068p;
        byte[] bArr = new byte[i17 * i18 * 2];
        openGlRender.f177066n = bArr;
        openGlRender.f177065m.x(bArr, i17, i18, bArr, 5, 0);
        this.f448687d.countDown();
    }
}
