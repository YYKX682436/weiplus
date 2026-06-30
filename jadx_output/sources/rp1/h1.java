package rp1;

/* loaded from: classes14.dex */
public class h1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f398409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ball.view.FloatBallView f398410e;

    public h1(com.tencent.mm.plugin.ball.view.FloatBallView floatBallView, float f17) {
        this.f398410e = floatBallView;
        this.f398409d = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        float f17 = this.f398409d;
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallView", "setFloatBallAlpha when animation ends, alpha:%s", java.lang.Float.valueOf(f17));
        this.f398410e.setFloatBallAlphaInternal(f17);
    }
}
