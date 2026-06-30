package ux1;

/* loaded from: classes.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f431843d;

    public b() {
        this.f431843d = 0L;
        this.f431843d = java.lang.System.currentTimeMillis();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.e("MicroMsg.BadBinder", hashCode() + "#send_bad#");
    }
}
