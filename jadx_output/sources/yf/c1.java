package yf;

/* loaded from: classes7.dex */
public class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f461324d;

    /* renamed from: e, reason: collision with root package name */
    public int f461325e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f461326f;

    public c1(yf.i0 i0Var) {
        this.f461326f = i0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f461325e + 1;
        this.f461325e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.LivePusherPluginHandler", "[CheckRotateTask] number:%s, angle:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f461324d));
        yf.i0 i0Var = this.f461326f;
        int y17 = i0Var.y();
        if (y17 == this.f461324d) {
            i0Var.z(y17);
        } else if (this.f461325e < 8) {
            i0Var.f461376z.postDelayed(this, 250L);
        }
    }
}
