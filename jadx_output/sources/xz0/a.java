package xz0;

/* loaded from: classes15.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz0.a f458169d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f458170e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(yz0.a aVar, java.lang.String str) {
        super(0);
        this.f458169d = aVar;
        this.f458170e = str;
    }

    /* JADX WARN: Finally extract failed */
    public static final boolean a(java.lang.String str, yz0.a aVar, java.lang.String str2, yz0.a aVar2) {
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock;
        int readHoldCount;
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock;
        boolean insert;
        yz0.b bVar = xz0.b.f458172b;
        java.lang.String field_mediaId = aVar2.field_mediaId;
        kotlin.jvm.internal.o.f(field_mediaId, "field_mediaId");
        int i17 = 0;
        if (bVar.D0(field_mediaId)) {
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = xz0.b.f458174d;
            readLock = reentrantReadWriteLock.readLock();
            readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i18 = 0; i18 < readHoldCount; i18++) {
                readLock.unlock();
            }
            writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                insert = xz0.b.f458172b.J0(aVar2);
                while (i17 < readHoldCount) {
                    readLock.lock();
                    i17++;
                }
                writeLock.unlock();
                com.tencent.mars.xlog.Log.i("Finder.MediaCacheLogic", str2 + " update " + insert + " mediaId:" + str + " cache:" + aVar);
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        } else {
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock2 = xz0.b.f458174d;
            readLock = reentrantReadWriteLock2.readLock();
            readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            for (int i19 = 0; i19 < readHoldCount; i19++) {
                readLock.unlock();
            }
            writeLock = reentrantReadWriteLock2.writeLock();
            writeLock.lock();
            try {
                insert = xz0.b.f458172b.insert(aVar2);
                while (i17 < readHoldCount) {
                    readLock.lock();
                    i17++;
                }
                writeLock.unlock();
                com.tencent.mars.xlog.Log.i("Finder.MediaCacheLogic", str2 + " insert " + insert + " mediaId:" + str + " cache:" + aVar);
            } finally {
                while (i17 < readHoldCount) {
                    readLock.lock();
                    i17++;
                }
                writeLock.unlock();
            }
        }
        return insert;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f458170e;
        yz0.a aVar = this.f458169d;
        if (aVar != null) {
            a(str, aVar, "syncMemoryCacheToDB from cache", aVar);
        } else {
            yz0.a aVar2 = (yz0.a) xz0.b.f458173c.get(str);
            if (aVar2 != null) {
                a(str, aVar, "syncMemoryCacheToDB from id", aVar2);
            } else {
                com.tencent.mars.xlog.Log.w("Finder.MediaCacheLogic", "syncMemoryCacheToDB noting for cache mediaId:" + str + " cache:" + aVar);
            }
        }
        return jz5.f0.f302826a;
    }
}
