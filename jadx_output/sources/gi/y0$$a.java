package gi;

/* loaded from: classes12.dex */
public final /* synthetic */ class y0$$a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gi.y0 f272225d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f272226e;

    public /* synthetic */ y0$$a(gi.y0 y0Var, int i17) {
        this.f272225d = y0Var;
        this.f272226e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        gi.y0 y0Var = this.f272225d;
        int i17 = this.f272226e;
        synchronized (y0Var.f272224b.f272207x) {
            com.tencent.mars.xlog.Log.i("MicroMsg.battery.MMCompositeMonitors", y0Var.hashCode() + " DeepBg: " + i17);
            ((java.util.ArrayList) y0Var.f272224b.f272205v).add(0, new wh.f2(java.lang.String.valueOf(i17)));
        }
    }
}
