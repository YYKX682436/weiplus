package gf;

/* loaded from: classes7.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f271123d;

    public m(long j17) {
        this.f271123d = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        df.a1 a1Var = df.a1.f229421a;
        long j17 = this.f271123d;
        synchronized (a1Var) {
            com.tencent.mars.xlog.Log.i("SkylineManager", "release " + j17);
            java.util.HashMap hashMap = df.a1.f229423c;
            df.x0 x0Var = (df.x0) hashMap.get(java.lang.Long.valueOf(j17));
            if (x0Var == null) {
                com.tencent.mars.xlog.Log.e("SkylineManager", "release runtimePtr:" + j17 + " fail stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
                return;
            }
            hashMap.remove(java.lang.Long.valueOf(j17));
            java.util.Iterator it = x0Var.f229608f.iterator();
            while (it.hasNext()) {
                java.lang.Integer num = (java.lang.Integer) it.next();
                int i17 = x0Var.f229607e;
                if (num != null && num.intValue() == i17) {
                }
                com.tencent.mars.xlog.Log.i("SkylineManager", "release destroyFlutter id:" + num.intValue());
                com.tencent.skyline.SkylineLogic.destroyFlutterEngine(num.intValue());
            }
            com.tencent.mars.xlog.Log.i("SkylineManager", "release destroyFirstFlutter id:" + x0Var.f229607e);
            com.tencent.skyline.SkylineLogic.destroyFlutterEngine(x0Var.f229607e);
        }
    }
}
