package yn1;

/* loaded from: classes11.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f463821d;

    public s0(java.lang.String str) {
        this.f463821d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Using account path=");
        sb6.append(yn1.z0.f463933a.g());
        sb6.append(", and delete guestCachePath=");
        java.lang.String str = this.f463821d;
        sb6.append(str);
        sb6.append(", ");
        com.tencent.mars.xlog.Log.i("MM.Mig.MigrationGlobalHolder", sb6.toString());
        com.tencent.mm.vfs.w6.g(str, true);
    }
}
