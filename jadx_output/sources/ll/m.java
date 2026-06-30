package ll;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: e, reason: collision with root package name */
    public static ll.m f319112e;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f319113a = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ThreadPoolExecutor f319114b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f319115c;

    /* renamed from: d, reason: collision with root package name */
    public int f319116d;

    public m() {
        java.util.concurrent.PriorityBlockingQueue priorityBlockingQueue = new java.util.concurrent.PriorityBlockingQueue(33);
        this.f319115c = new java.util.LinkedList();
        int availableProcessors = java.lang.Runtime.getRuntime().availableProcessors();
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(availableProcessors)};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioThreadPool", "getNormalCorePoolSize cpuCount:%d", objArr);
        int i18 = (availableProcessors * 2) + 2;
        if (i18 > 32) {
            i18 = 32;
        } else if (i18 < 8) {
            i18 = 8;
        }
        this.f319116d = i18;
        java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = new java.util.concurrent.ThreadPoolExecutor(i18, 32, 120L, java.util.concurrent.TimeUnit.SECONDS, priorityBlockingQueue, new ll.l());
        this.f319114b = threadPoolExecutor;
        threadPoolExecutor.setMaximumPoolSize(32);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioThreadPool", "new AudioThreadPool poolSize:%d", java.lang.Integer.valueOf(i18));
    }

    public static ll.m a() {
        if (f319112e == null) {
            synchronized (ll.m.class) {
                if (f319112e == null) {
                    f319112e = new ll.m();
                }
            }
        }
        return f319112e;
    }

    public static void b(ll.n nVar) {
        ll.m a17 = a();
        synchronized (a17.f319113a) {
            nVar.h();
            a17.f319115c.add(nVar);
            int i17 = a17.f319116d;
            if (a17.f319115c.size() > i17) {
                a17.d(i17 + 2);
            }
        }
        a17.f319114b.execute(nVar);
    }

    public static void c(ll.n nVar) {
        ll.m a17 = a();
        synchronized (a17.f319113a) {
            a17.f319115c.remove(nVar);
            if (a17.f319115c.size() <= 4) {
                a17.f319116d = 4;
                a17.d(4);
            }
        }
        a17.f319114b.remove(nVar);
    }

    public void d(int i17) {
        if (i17 > 32) {
            this.f319116d = 32;
        } else if (i17 < 4) {
            this.f319116d = 4;
        } else {
            this.f319116d = i17;
        }
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
        int i18 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioThreadPool", "setCorePoolSize poolSize:%d", objArr);
        this.f319114b.setCorePoolSize(i17);
    }
}
