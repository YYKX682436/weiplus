package cu2;

/* loaded from: classes10.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.i3 f222446d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f222447e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f222448f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(so2.i3 i3Var, boolean z17, java.lang.String str) {
        super(0);
        this.f222446d = i3Var;
        this.f222447e = z17;
        this.f222448f = str;
    }

    /* JADX WARN: Finally extract failed */
    public static final boolean a(boolean z17, java.lang.String str, so2.i3 i3Var, java.lang.String str2, so2.i3 i3Var2) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock;
        int readHoldCount;
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock;
        boolean P0;
        boolean L0;
        java.lang.Object putIfAbsent;
        int i17 = 0;
        if (android.text.TextUtils.isEmpty(i3Var2.field_originMediaId)) {
            com.tencent.mars.xlog.Log.w("Finder.MediaCacheLogic", "updateOrInsert originMediaId:" + i3Var2.field_originMediaId + ' ' + i3Var2);
            return false;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = cu2.x.f222452d;
        java.lang.String str3 = i3Var2.field_originMediaId;
        java.lang.Object obj = concurrentHashMap.get(str3);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str3, (obj = new java.util.concurrent.CopyOnWriteArrayList()))) != null) {
            obj = putIfAbsent;
        }
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) obj;
        copyOnWriteArrayList.removeIf(new cu2.v(i3Var2));
        copyOnWriteArrayList.add(i3Var2);
        try {
            if (z17) {
                cu2.x xVar = cu2.x.f222449a;
                java.lang.String str4 = i3Var2.field_mediaId;
                if (android.text.TextUtils.isEmpty(str4)) {
                    L0 = false;
                } else {
                    java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock2 = cu2.x.f222453e.readLock();
                    readLock2.lock();
                    try {
                        com.tencent.mm.plugin.finder.storage.x90 x90Var = cu2.x.f222450b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        L0 = x90Var.L0(str4);
                    } finally {
                        readLock2.unlock();
                    }
                }
                if (!L0) {
                    java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = cu2.x.f222453e;
                    readLock = reentrantReadWriteLock.readLock();
                    readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                    for (int i18 = 0; i18 < readHoldCount; i18++) {
                        readLock.unlock();
                    }
                    writeLock = reentrantReadWriteLock.writeLock();
                    writeLock.lock();
                    try {
                        P0 = cu2.x.f222450b.insert(i3Var2);
                        while (i17 < readHoldCount) {
                            readLock.lock();
                            i17++;
                        }
                        writeLock.unlock();
                        com.tencent.mars.xlog.Log.i("Finder.MediaCacheLogic", str2 + " insert " + P0 + " mediaId:" + str + " cache:" + i3Var);
                        return P0;
                    } catch (java.lang.Throwable th6) {
                        throw th6;
                    }
                }
            }
            P0 = cu2.x.f222450b.P0(i3Var2);
            while (i17 < readHoldCount) {
                readLock.lock();
                i17++;
            }
            writeLock.unlock();
            com.tencent.mars.xlog.Log.i("Finder.MediaCacheLogic", str2 + " update " + P0 + " mediaId:" + str + " cache:" + i3Var);
            return P0;
        } finally {
            while (i17 < readHoldCount) {
                readLock.lock();
                i17++;
            }
            writeLock.unlock();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock2 = cu2.x.f222453e;
        readLock = reentrantReadWriteLock2.readLock();
        readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
        for (int i19 = 0; i19 < readHoldCount; i19++) {
            readLock.unlock();
        }
        writeLock = reentrantReadWriteLock2.writeLock();
        writeLock.lock();
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            so2.i3 i3Var = this.f222446d;
            java.lang.String str = this.f222448f;
            boolean z17 = this.f222447e;
            if (i3Var != null) {
                a(z17, str, i3Var, "syncMemoryCacheToDB from cache", i3Var);
            } else {
                so2.i3 i3Var2 = (so2.i3) cu2.x.f222451c.get(str);
                if (i3Var2 != null) {
                    a(z17, str, i3Var, "syncMemoryCacheToDB from id", i3Var2);
                } else {
                    com.tencent.mars.xlog.Log.w("Finder.MediaCacheLogic", "syncMemoryCacheToDB noting for cache mediaId:" + str + " cache:" + i3Var);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w("Finder.MediaCacheLogic", "syncMemoryCacheToDB throwable e:" + th6);
        }
        return jz5.f0.f302826a;
    }
}
