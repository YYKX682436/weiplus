package ep1;

/* loaded from: classes8.dex */
public final class l implements db5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f255650a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f255651b;

    public l(boolean z17, android.app.Activity activity) {
        this.f255650a = z17;
        this.f255651b = activity;
    }

    @Override // db5.d
    public final void onComplete(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("convertActivityToTranslucent onComplete: ");
        sb6.append(z17);
        sb6.append(", retry: ");
        boolean z18 = this.f255650a;
        sb6.append(z18);
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallPageAnimationUtils", sb6.toString());
        if (z17 || z18) {
            return;
        }
        ep1.m.a(this.f255651b, true);
    }
}
