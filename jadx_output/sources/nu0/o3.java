package nu0;

/* loaded from: classes5.dex */
public final class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f340055d;

    public o3(nu0.b4 b4Var) {
        this.f340055d = b4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nu0.b4 b4Var = this.f340055d;
        int i17 = b4Var.K.f301680g;
        int itemCount = (i17 + 1) % (r1.getItemCount() - 1);
        com.tencent.mars.xlog.Log.i("ImageComp.MainComposingUIC", "[autoSwitchToNext] currentPos:" + i17 + " nextPos:" + itemCount + " disableAutoSwitch:" + b4Var.f339880p0);
        if (b4Var.f339880p0) {
            return;
        }
        b4Var.A7("auto", itemCount, new nu0.g1(b4Var, itemCount));
    }
}
