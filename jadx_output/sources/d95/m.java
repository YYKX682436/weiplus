package d95;

/* loaded from: classes11.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d95.f f227695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f227696e;

    public m(d95.f fVar, java.lang.Runnable runnable) {
        this.f227695d = fVar;
        this.f227696e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (d95.f.class) {
            java.util.Set set = d95.f.f227660f;
            if (!set.contains(this.f227695d.k())) {
                set.add(this.f227695d.k());
                com.tencent.mars.xlog.Log.i("MicroMsg.MMDataBase", "executeTaskSilently");
                this.f227696e.run();
            }
        }
    }
}
