package ln1;

/* loaded from: classes12.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final ln1.s f319750a;

    /* renamed from: b, reason: collision with root package name */
    public ln1.c0 f319751b = null;

    /* renamed from: c, reason: collision with root package name */
    public long f319752c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f319753d = new java.util.concurrent.atomic.AtomicInteger(0);

    public f0(ln1.s sVar) {
        this.f319750a = sVar;
    }

    public boolean a() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f319753d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupPackAndSend.TagQueueSucker", "endCount:%d", java.lang.Integer.valueOf(atomicInteger.get()));
        return atomicInteger.get() == 0;
    }
}
