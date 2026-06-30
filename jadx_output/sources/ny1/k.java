package ny1;

/* loaded from: classes13.dex */
public class k {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f341413k = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f341414a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f341415b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f341416c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f341417d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f341418e;

    /* renamed from: f, reason: collision with root package name */
    public long f341419f;

    /* renamed from: g, reason: collision with root package name */
    public int f341420g;

    /* renamed from: h, reason: collision with root package name */
    public int f341421h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f341422i;

    /* renamed from: j, reason: collision with root package name */
    public long f341423j;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(1, 29309);
        hashMap.put(2, 29309);
        hashMap.put(3, 29205);
        hashMap.put(4, 29572);
        hashMap.put(5, 29771);
        hashMap.put(9, 29771);
        hashMap.put(6, 30149);
        hashMap.put(7, 30481);
        hashMap.put(8, 30482);
        hashMap.put(10, 31502);
    }

    public k(int i17, java.lang.Long l17) {
        this.f341414a = 0;
        this.f341415b = "";
        this.f341418e = false;
        this.f341419f = -1L;
        this.f341420g = -1;
        this.f341421h = 0;
        this.f341422i = new java.util.LinkedList();
        this.f341423j = 0L;
        this.f341414a = i17;
        this.f341423j = l17.longValue();
        this.f341416c = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f341417d = new java.util.concurrent.ConcurrentLinkedQueue();
    }

    public boolean a(r45.uc4 uc4Var) {
        r45.pq5 pq5Var;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = this.f341417d;
        if (concurrentLinkedQueue2 != null) {
            concurrentLinkedQueue2.add(java.lang.Long.valueOf(uc4Var.f387221h));
        }
        if (uc4Var == null || (pq5Var = uc4Var.f387218e) == null || (concurrentLinkedQueue = this.f341416c) == null) {
            return false;
        }
        concurrentLinkedQueue.add(pq5Var);
        return true;
    }

    public k(int i17, java.lang.String str, r45.uc4 uc4Var, boolean z17, java.lang.Long l17) {
        this.f341414a = 0;
        this.f341415b = "";
        this.f341418e = false;
        this.f341419f = -1L;
        this.f341420g = -1;
        this.f341421h = 0;
        this.f341422i = new java.util.LinkedList();
        this.f341423j = 0L;
        if (str == null || str.equals("")) {
            return;
        }
        this.f341414a = i17;
        this.f341415b = str;
        this.f341418e = z17;
        this.f341423j = l17.longValue();
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f341416c = concurrentLinkedQueue;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f341417d = concurrentLinkedQueue2;
        concurrentLinkedQueue2.add(java.lang.Long.valueOf(uc4Var.f387221h));
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        concurrentLinkedQueue.add(uc4Var.f387218e);
    }
}
