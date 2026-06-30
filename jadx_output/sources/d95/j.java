package d95;

/* loaded from: classes11.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f227686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f227687e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f227688f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f227689g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f227690h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d95.k f227691i;

    public j(d95.k kVar, long j17, long j18, long j19, long j27, long j28) {
        this.f227691i = kVar;
        this.f227686d = j17;
        this.f227687e = j18;
        this.f227688f = j19;
        this.f227689g = j27;
        this.f227690h = j28;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.tencent.mm.app.w.INSTANCE.f53889n) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.MMDataBase", "vacuum too slow, kill self");
        this.f227691i.f227693e.f227694d.c();
        jx3.f fVar = jx3.f.INSTANCE;
        d95.k kVar = this.f227691i;
        fVar.d(25824, kVar.f227692d, kVar.f227693e.f227694d.k(), java.lang.Long.valueOf(this.f227686d), java.lang.Long.valueOf(java.lang.Math.min(this.f227687e, this.f227688f)), java.lang.Long.valueOf(this.f227689g), "slow-kill", 0, java.lang.Long.valueOf(this.f227690h), 0, 0, 0, 0, 0);
        try {
            java.lang.Thread.sleep(1000L);
        } catch (java.lang.InterruptedException unused) {
        }
        int myPid = android.os.Process.myPid();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(myPid));
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/storagebase/MMDataBase$4$1$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
        android.os.Process.killProcess(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(obj, "com/tencent/mm/storagebase/MMDataBase$4$1$1", "run", "()V", "android/os/Process_EXEC_", "killProcess", "(I)V");
    }
}
