package gf;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f271037d;

    public e(int i17) {
        this.f271037d = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df.a1 a1Var = df.a1.f229421a;
        int i17 = this.f271037d;
        synchronized (a1Var) {
            java.lang.Long l17 = (java.lang.Long) df.a1.f229424d.get(java.lang.Integer.valueOf(i17));
            if (l17 == null) {
                l17 = 0L;
            }
            kotlin.jvm.internal.o.d(l17);
            df.x0 x0Var = (df.x0) df.a1.f229423c.get(java.lang.Long.valueOf(l17.longValue()));
            if (x0Var == null) {
                com.tencent.mars.xlog.Log.e("SkylineManager", "destroyFlutter id:" + i17 + " fail");
                return;
            }
            x0Var.a(i17);
            com.tencent.mars.xlog.Log.i("SkylineManager", "destroyFlutter id:" + i17);
            if (x0Var.f229607e == i17) {
                com.tencent.mars.xlog.Log.i("SkylineManager", "destroyFlutter id:" + i17 + " ignore, return");
                return;
            }
            if (x0Var.f229608f.contains(java.lang.Integer.valueOf(i17))) {
                x0Var.f229608f.remove(java.lang.Integer.valueOf(i17));
                com.tencent.skyline.SkylineLogic.destroyFlutterEngine(i17);
            } else {
                com.tencent.mars.xlog.Log.w("SkylineManager", "destroyFlutter id:" + i17 + " fail, return");
            }
        }
    }
}
