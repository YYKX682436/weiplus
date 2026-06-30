package com.tencent.mm.plugin.fts.train;

/* loaded from: classes12.dex */
public final class WCSearchGroupTrainMgr {
    static final java.lang.String ASSET_DEFAULT_MODEL = "fts/grouptrain/booster_main";
    private static final java.lang.String TAG = "MicroMsg.FTS.GroupTrainMgr";
    private static volatile com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr sInstance;
    private l75.z0 contactWatcher;
    private final com.tencent.mm.plugin.fts.train.o model = new com.tencent.mm.plugin.fts.train.o();
    private final com.tencent.mm.plugin.fts.train.f cache = new com.tencent.mm.plugin.fts.train.f();
    private final java.util.concurrent.atomic.AtomicBoolean modelLoaded = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean prewarming = new java.util.concurrent.atomic.AtomicBoolean(false);
    private volatile boolean prewarmFinished = false;

    private WCSearchGroupTrainMgr() {
    }

    public static com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr getInstance() {
        if (sInstance == null) {
            synchronized (com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr.class) {
                if (sInstance == null) {
                    sInstance = new com.tencent.mm.plugin.fts.train.WCSearchGroupTrainMgr();
                }
            }
        }
        return sInstance;
    }

    private java.util.List<java.lang.String> listAllChatrooms() {
        try {
            android.database.Cursor f17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().f193770d.f("select * from chatroom where chatroomname like '%@chatroom'", null, 2);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            while (f17.moveToNext()) {
                com.tencent.mm.storage.a3 a3Var = new com.tencent.mm.storage.a3();
                a3Var.convertFrom(f17);
                arrayList.add(a3Var.field_chatroomname);
            }
            f17.close();
            return arrayList;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w(TAG, "listAllChatrooms failed: %s", th6.getMessage());
            return new java.util.ArrayList();
        }
    }

    private static java.lang.String readAll(java.io.InputStream inputStream) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(262144);
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream, java.nio.charset.StandardCharsets.UTF_8));
        try {
            char[] cArr = new char[8192];
            while (true) {
                int read = bufferedReader.read(cArr);
                if (read <= 0) {
                    bufferedReader.close();
                    return sb6.toString();
                }
                sb6.append(cArr, 0, read);
            }
        } catch (java.lang.Throwable th6) {
            try {
                bufferedReader.close();
            } catch (java.lang.Throwable th7) {
                th6.addSuppressed(th7);
            }
            throw th6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerWatchers() {
        try {
            if (this.contactWatcher != null) {
                return;
            }
            this.contactWatcher = new com.tencent.mm.plugin.fts.train.j(this);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().a(this.contactWatcher);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.w(TAG, "registerWatchers failed: %s", th6.getMessage());
        }
    }

    public int getCachedGroupCount() {
        com.tencent.mm.plugin.fts.train.f fVar = this.cache;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = fVar.f137818d;
        reentrantReadWriteLock.readLock().lock();
        try {
            return ((java.util.HashMap) fVar.f137815a).size();
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public java.lang.Double getCachedScore(java.lang.String str) {
        com.tencent.mm.plugin.fts.train.f fVar = this.cache;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = fVar.f137818d;
        reentrantReadWriteLock.readLock().lock();
        try {
            return (java.lang.Double) ((java.util.HashMap) fVar.f137815a).get(str);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public int getModelVersion() {
        return this.model.f137866b;
    }

    public void initIfNeeded(android.content.Context context) {
        if (this.modelLoaded.compareAndSet(false, true)) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.fts.train.g(this, context));
        }
    }

    public boolean isModelLoaded() {
        return this.modelLoaded.get() && !this.model.f137865a.isEmpty();
    }

    public boolean isReady() {
        return this.modelLoaded.get() && !this.model.f137865a.isEmpty() && this.prewarmFinished;
    }

    public boolean loadDefaultModelInternal(android.content.Context context) {
        java.io.InputStream inputStream = null;
        try {
            try {
                inputStream = context.getAssets().open(ASSET_DEFAULT_MODEL);
                boolean a17 = this.model.a(readAll(inputStream));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused) {
                    }
                }
                return a17;
            } catch (java.lang.Throwable th6) {
                if (0 != 0) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException unused2) {
                    }
                }
                throw th6;
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.e(TAG, "loadDefaultModel asset open failed: %s", e17.getMessage());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused3) {
                }
            }
            return false;
        } catch (java.lang.Throwable th7) {
            com.tencent.mars.xlog.Log.e(TAG, "loadDefaultModel unexpected: %s", th7.getMessage());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException unused4) {
                }
            }
            return false;
        }
    }

    public boolean loadDownloadedModel(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(TAG, "loadDownloadedModel called but downloader not wired yet: %s", str);
        return false;
    }

    public boolean loadModelStringForTest(java.lang.String str) {
        boolean a17 = this.model.a(str);
        this.modelLoaded.set(true);
        return a17;
    }

    public void prewarmAllGroups() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.List<java.lang.String> listAllChatrooms = listAllChatrooms();
        if (listAllChatrooms.isEmpty()) {
            com.tencent.mars.xlog.Log.i(TAG, "prewarm: no groups");
            return;
        }
        int i17 = 0;
        for (java.lang.String str : listAllChatrooms) {
            try {
                if (prewarmOne(str)) {
                    i17++;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.w(TAG, "prewarm one %s failed: %s", str, th6.getMessage());
            }
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
        com.tencent.mars.xlog.Log.i(TAG, "prewarm: total=%d, ok=%d, cost=%dms", java.lang.Integer.valueOf(listAllChatrooms.size()), java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(currentTimeMillis2));
        if (!this.prewarmFinished) {
            com.tencent.mm.plugin.fts.train.p.b(11, 12, currentTimeMillis2);
        } else {
            com.tencent.mm.plugin.fts.train.p.b(9, 10, currentTimeMillis2);
        }
        com.tencent.mm.plugin.fts.train.p.b(15, 16, i17);
    }

    public boolean prewarmOne(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !isModelLoaded()) {
            return false;
        }
        com.tencent.mm.plugin.fts.train.b a17 = com.tencent.mm.plugin.fts.train.c.a(str);
        a17.f137811r = 0;
        java.util.ArrayList arrayList = new java.util.ArrayList(this.model.f137865a.size());
        double c17 = this.model.c(a17, arrayList);
        com.tencent.mm.plugin.fts.train.f fVar = this.cache;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = fVar.f137818d;
        reentrantReadWriteLock.writeLock().lock();
        try {
            ((java.util.HashMap) fVar.f137815a).put(str, java.lang.Double.valueOf(c17));
            ((java.util.HashMap) fVar.f137816b).put(str, a17);
            ((java.util.HashMap) fVar.f137817c).put(str, java.util.Collections.unmodifiableList(new java.util.ArrayList(arrayList)));
            reentrantReadWriteLock.writeLock().unlock();
            return true;
        } catch (java.lang.Throwable th6) {
            reentrantReadWriteLock.writeLock().unlock();
            throw th6;
        }
    }

    public void prewarmSyncForTest() {
        prewarmAllGroups();
        this.prewarmFinished = true;
    }

    public double scoreNow(java.lang.String str, int i17) {
        com.tencent.mm.plugin.fts.train.b a17;
        if (!isModelLoaded()) {
            return -9999.0d;
        }
        com.tencent.mm.plugin.fts.train.f fVar = this.cache;
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = fVar.f137818d;
        reentrantReadWriteLock.readLock().lock();
        try {
            com.tencent.mm.plugin.fts.train.b bVar = (com.tencent.mm.plugin.fts.train.b) ((java.util.HashMap) fVar.f137816b).get(str);
            if (bVar != null) {
                a17 = new com.tencent.mm.plugin.fts.train.b();
                a17.f137794a = bVar.f137794a;
                a17.f137795b = bVar.f137795b;
                a17.f137796c = bVar.f137796c;
                a17.f137797d = bVar.f137797d;
                a17.f137798e = bVar.f137798e;
                a17.f137799f = bVar.f137799f;
                a17.f137800g = bVar.f137800g;
                a17.f137801h = bVar.f137801h;
                a17.f137802i = bVar.f137802i;
                a17.f137803j = bVar.f137803j;
                a17.f137804k = bVar.f137804k;
                a17.f137805l = bVar.f137805l;
                a17.f137806m = bVar.f137806m;
                a17.f137807n = bVar.f137807n;
                a17.f137808o = bVar.f137808o;
                a17.f137809p = bVar.f137809p;
                a17.f137810q = bVar.f137810q;
                a17.f137811r = bVar.f137811r;
            } else {
                a17 = com.tencent.mm.plugin.fts.train.c.a(str);
            }
            a17.f137811r = i17;
            boolean z17 = false;
            try {
                p13.w wVar = ((s50.m0) ((u50.x) i95.n0.c(u50.x.class))).f403091d;
                if (wVar != null) {
                    if (wVar.f351172l) {
                        z17 = true;
                    }
                }
            } catch (java.lang.Throwable unused) {
            }
            if (z17) {
                a17.f137800g = a17.f137801h;
            }
            return this.model.c(a17, null);
        } finally {
            reentrantReadWriteLock.readLock().unlock();
        }
    }

    public void triggerPrewarmAsync() {
        if (isModelLoaded() && this.prewarming.compareAndSet(false, true)) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.fts.train.h(this), "fts.GroupTrainPrewarm");
        }
    }
}
