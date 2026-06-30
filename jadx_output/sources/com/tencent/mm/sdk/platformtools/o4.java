package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class o4 implements android.content.SharedPreferences, android.content.SharedPreferences.Editor {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Set f192893i;

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.Map f192894m;

    /* renamed from: n, reason: collision with root package name */
    public static final boolean f192895n;

    /* renamed from: o, reason: collision with root package name */
    public static final kk.l f192896o;

    /* renamed from: p, reason: collision with root package name */
    public static final java.util.Map f192897p;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mmkv.MMKV f192898d;

    /* renamed from: e, reason: collision with root package name */
    public final android.util.Pair f192899e;

    /* renamed from: f, reason: collision with root package name */
    public final int f192900f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock f192901g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock f192902h;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f192893i = hashSet;
        f192894m = new java.util.concurrent.ConcurrentHashMap();
        f192896o = new kk.l(45, new com.tencent.mm.sdk.platformtools.m4());
        fp.d0.o("mmkv");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mmkv.MMKV.initialize(context, context.getFilesDir().getAbsolutePath() + "/mmkv", null, ir5.e.LevelInfo, com.tencent.mm.sdk.platformtools.n4.f192870a);
        com.tencent.mmkv.MMKV.disableProcessModeChecker();
        int decodeInt = com.tencent.mmkv.MMKV.defaultMMKV(2, null).decodeInt(bm5.f1.a() + "_mFdLimit", -1);
        boolean z17 = decodeInt <= 1024 && decodeInt > 0;
        f192895n = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiProcessMMKV", "mFdLimit = %d", java.lang.Integer.valueOf(decodeInt));
        if (z17) {
            hashSet.add(android.util.Pair.create("MULTIPROCESSMMKV_SINGLE_DEFAULT", null));
            hashSet.add(android.util.Pair.create("MULTIPROCESSMMKV_MULTI_DEFAULT", null));
            hashSet.add(android.util.Pair.create("_webview_web_prefetcher_info", null));
        }
        f192897p = new android.util.ArrayMap();
    }

    public o4(java.lang.String str, java.lang.String str2, int i17, com.tencent.mmkv.MMKV mmkv) {
        java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = new java.util.concurrent.locks.ReentrantReadWriteLock();
        this.f192901g = reentrantReadWriteLock.readLock();
        this.f192902h = reentrantReadWriteLock.writeLock();
        this.f192898d = mmkv;
        this.f192899e = android.util.Pair.create(str, str2);
        this.f192900f = i17;
    }

    public static com.tencent.mm.sdk.platformtools.o4 J(java.lang.String str, int i17, int i18) {
        return O(str, lp0.b.e() + kk.k.g(("mm" + i17).getBytes()) + "/mmkv_private", i18, null);
    }

    public static com.tencent.mmkv.MMKV K(java.lang.String str, java.lang.String str2, int i17) {
        try {
            return com.tencent.mmkv.MMKV.mmkvWithID(str, i17, (java.lang.String) null, str2);
        } catch (java.lang.IllegalArgumentException unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiProcessMMKV", "getCoreMMKV mode error name : %s ,mode : %d", str, java.lang.Integer.valueOf(i17));
            jx3.f.INSTANCE.idkeyStat(941L, 150L, 1L, true);
            return i17 == 2 ? com.tencent.mmkv.MMKV.mmkvWithID(str, 1, (java.lang.String) null, str2) : com.tencent.mmkv.MMKV.mmkvWithID(str, i17, (java.lang.String) null, str2);
        }
    }

    public static com.tencent.mm.sdk.platformtools.o4 L() {
        return N("MULTIPROCESSMMKV_MULTI_DEFAULT", 2, com.tencent.mmkv.MMKV.defaultMMKV(2, null));
    }

    public static com.tencent.mm.sdk.platformtools.o4 M(java.lang.String str) {
        return N(str, 2, null);
    }

    public static com.tencent.mm.sdk.platformtools.o4 N(java.lang.String str, int i17, com.tencent.mmkv.MMKV mmkv) {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.D0(str, "MULTIPROCESSMMKV_PERSERVED_NAME")) {
            return O(str, null, i17, mmkv);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiProcessMMKV", "getMMKV name is illegal");
        return null;
    }

    public static com.tencent.mm.sdk.platformtools.o4 O(java.lang.String str, java.lang.String str2, int i17, com.tencent.mmkv.MMKV mmkv) {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        boolean z17;
        android.util.Pair create = android.util.Pair.create(str, str2);
        com.tencent.mm.sdk.platformtools.o4 P = P(create, i17);
        if (P == null) {
            java.util.Map map = f192897p;
            synchronized (map) {
                android.util.ArrayMap arrayMap = (android.util.ArrayMap) map;
                reentrantLock = (java.util.concurrent.locks.ReentrantLock) arrayMap.get(create);
                z17 = true;
                if (reentrantLock == null) {
                    reentrantLock = new java.util.concurrent.locks.ReentrantLock(true);
                    arrayMap.put(create, reentrantLock);
                }
            }
            try {
                reentrantLock.lock();
                com.tencent.mm.sdk.platformtools.o4 P2 = P(create, i17);
                if (P2 != null) {
                    return P2;
                }
                P = mmkv == null ? new com.tencent.mm.sdk.platformtools.o4(str, str2, i17, K(str, str2, i17)) : new com.tencent.mm.sdk.platformtools.o4(str, str2, i17, mmkv);
                long Y = P.Y();
                if (Y > 1048576) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MultiProcessMMKV", "MMKV file is too big, name : %s, path : %s, size : %d, please contact with leafjia", str, str2, java.lang.Long.valueOf(Y));
                    if (Y <= 5242880) {
                        jx3.f.INSTANCE.idkeyStat(941L, 10L, 1L, true);
                    } else if (Y <= 10485760) {
                        jx3.f.INSTANCE.idkeyStat(941L, 11L, 1L, true);
                    } else if (Y <= com.tencent.tmassistantsdk.downloadservice.DownloadHelper.SAVE_LENGTH) {
                        jx3.f.INSTANCE.idkeyStat(941L, 12L, 1L, true);
                    } else {
                        jx3.f.INSTANCE.idkeyStat(941L, 13L, 1L, true);
                    }
                    jx3.f fVar = jx3.f.INSTANCE;
                    fVar.d(18378, str, java.lang.Long.valueOf(Y));
                    if (Y > 5242880) {
                        fVar.idkeyStat(941L, 100L, 1L, true);
                        com.tencent.mars.xlog.Log.i("MicroMsg.MultiProcessMMKV", "start to trim, before size : %d", java.lang.Long.valueOf(Y));
                        P.a0();
                        com.tencent.mars.xlog.Log.i("MicroMsg.MultiProcessMMKV", "trim is over, after size : %d", java.lang.Long.valueOf(P.Y()));
                        if (Y > 52428800) {
                            fVar.d(24632, str, 3, java.lang.Long.valueOf(Y), java.lang.Long.valueOf(P.Y()), com.tencent.mm.sdk.platformtools.z.f193109e);
                        }
                    }
                }
                if (!f192895n || f192896o == null || ((java.util.HashSet) f192893i).contains(create)) {
                    z17 = false;
                }
                if (z17) {
                    f192896o.put(create, P);
                    ((java.util.concurrent.ConcurrentHashMap) f192894m).put(create, P);
                } else {
                    ((java.util.concurrent.ConcurrentHashMap) f192894m).put(create, P);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
        return P;
    }

    public static com.tencent.mm.sdk.platformtools.o4 P(android.util.Pair pair, int i17) {
        boolean z17 = f192895n;
        kk.l lVar = f192896o;
        boolean z18 = (!z17 || lVar == null || ((java.util.HashSet) f192893i).contains(pair)) ? false : true;
        java.util.Map map = f192894m;
        if (!z18) {
            return (com.tencent.mm.sdk.platformtools.o4) ((java.util.concurrent.ConcurrentHashMap) map).get(pair);
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) lVar.get(pair);
        if (o4Var != null) {
            return o4Var;
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var2 = (com.tencent.mm.sdk.platformtools.o4) ((java.util.concurrent.ConcurrentHashMap) map).get(pair);
        if (o4Var2 == null) {
            return o4Var2;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = o4Var2.f192901g;
        readLock.lock();
        o4Var2.c(pair);
        lVar.put(pair, o4Var2);
        readLock.unlock();
        return o4Var2;
    }

    public static com.tencent.mm.sdk.platformtools.o4 Q(java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 M = M(str);
        Z(com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(str, 4), M);
        return M;
    }

    public static com.tencent.mm.sdk.platformtools.o4 R(java.lang.String str) {
        return N(str, 1, null);
    }

    public static boolean V(java.lang.String str) {
        try {
            return O("MULTIPROCESSMMKV_PERSERVED_NAME", null, 2, null).i(str, false);
        } catch (java.lang.Throwable unused) {
            com.tencent.mmkv.MMKV.class.getClassLoader();
            fp.d0.n("mmkv");
            return O("MULTIPROCESSMMKV_PERSERVED_NAME", null, 2, null).i(str, false);
        }
    }

    public static int Z(android.content.SharedPreferences sharedPreferences, com.tencent.mm.sdk.platformtools.o4 o4Var) {
        if (sharedPreferences == null || o4Var == null) {
            return 0;
        }
        android.util.Pair pair = o4Var.f192899e;
        java.lang.String str = (java.lang.String) pair.first;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiProcessMMKV", "transport2MMKV, name : %s", str);
        if (V(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiProcessMMKV", "%s transport2MMKV has Done, return", str);
            return 0;
        }
        O("MULTIPROCESSMMKV_PERSERVED_NAME", null, 2, null).G(str, true);
        jx3.f.INSTANCE.idkeyStat(941L, 2L, 1L, true);
        if (!o4Var.U()) {
            return o4Var.f192898d.importFromSharedPreferences(sharedPreferences);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = o4Var.f192901g;
        readLock.lock();
        o4Var.c(pair);
        int importFromSharedPreferences = o4Var.f192898d.importFromSharedPreferences(sharedPreferences);
        readLock.unlock();
        return importFromSharedPreferences;
    }

    public boolean A(java.lang.String str, int i17) {
        if (!T(str, java.lang.Integer.valueOf(i17))) {
            return false;
        }
        if (!U()) {
            return this.f192898d.encode(str, i17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean encode = this.f192898d.encode(str, i17);
        readLock.unlock();
        return encode;
    }

    public boolean B(java.lang.String str, long j17) {
        if (!T(str, java.lang.Long.valueOf(j17))) {
            return false;
        }
        if (!U()) {
            return this.f192898d.encode(str, j17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean encode = this.f192898d.encode(str, j17);
        readLock.unlock();
        return encode;
    }

    public boolean C(java.lang.String str, android.os.Parcelable parcelable) {
        if (!T(str, parcelable)) {
            return false;
        }
        if (!U()) {
            return this.f192898d.encode(str, parcelable);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean encode = this.f192898d.encode(str, parcelable);
        readLock.unlock();
        return encode;
    }

    public boolean D(java.lang.String str, java.lang.String str2) {
        if (!T(str, str2)) {
            return false;
        }
        if (!U()) {
            return this.f192898d.encode(str, str2);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean encode = this.f192898d.encode(str, str2);
        readLock.unlock();
        return encode;
    }

    public boolean E(java.lang.String str, java.lang.String str2, int i17) {
        if (!T(str, str2)) {
            return false;
        }
        if (!U()) {
            return this.f192898d.encode(str, str2, i17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean encode = this.f192898d.encode(str, str2, i17);
        readLock.unlock();
        return encode;
    }

    public boolean F(java.lang.String str, java.util.Set set) {
        if (!T(str, set)) {
            return false;
        }
        if (!U()) {
            return this.f192898d.encode(str, (java.util.Set<java.lang.String>) set);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean encode = this.f192898d.encode(str, (java.util.Set<java.lang.String>) set);
        readLock.unlock();
        return encode;
    }

    public boolean G(java.lang.String str, boolean z17) {
        if (!T(str, java.lang.Boolean.valueOf(z17))) {
            return false;
        }
        if (!U()) {
            return this.f192898d.encode(str, z17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean encode = this.f192898d.encode(str, z17);
        readLock.unlock();
        return encode;
    }

    public boolean H(java.lang.String str, byte[] bArr) {
        if (!T(str, bArr)) {
            return false;
        }
        if (!U()) {
            return this.f192898d.encode(str, bArr);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean encode = this.f192898d.encode(str, bArr);
        readLock.unlock();
        return encode;
    }

    public boolean I(java.lang.String str, byte[] bArr, int i17) {
        if (!T(str, bArr)) {
            return false;
        }
        if (!U()) {
            return this.f192898d.encode(str, bArr, i17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean encode = this.f192898d.encode(str, bArr, i17);
        readLock.unlock();
        return encode;
    }

    public final boolean S() {
        java.lang.String str;
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
            readLock.lock();
            java.lang.String mmapID = this.f192898d.mmapID();
            readLock.unlock();
            str = mmapID;
        } else {
            str = this.f192898d.mmapID();
        }
        return str == null;
    }

    public final boolean T(java.lang.String str, java.lang.Object obj) {
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || obj == null || com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) this.f192899e.first)) ? false : true;
    }

    public boolean U() {
        return f192895n && f192896o != null;
    }

    public void W(java.lang.String str) {
        if (!U()) {
            this.f192898d.removeValueForKey(str);
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        this.f192898d.removeValueForKey(str);
        readLock.unlock();
    }

    public void X(java.lang.String[] strArr) {
        if (!U()) {
            this.f192898d.removeValuesForKeys(strArr);
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        this.f192898d.removeValuesForKeys(strArr);
        readLock.unlock();
    }

    public long Y() {
        if (!U()) {
            return this.f192898d.totalSize();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        long j17 = this.f192898d.totalSize();
        readLock.unlock();
        return j17;
    }

    public long a() {
        if (!U()) {
            return this.f192898d.actualSize();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        long actualSize = this.f192898d.actualSize();
        readLock.unlock();
        return actualSize;
    }

    public void a0() {
        if (!U()) {
            this.f192898d.trim();
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        this.f192898d.trim();
        readLock.unlock();
    }

    @Override // android.content.SharedPreferences.Editor
    public void apply() {
    }

    public java.lang.String[] b() {
        if (!U()) {
            return this.f192898d.allKeys();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        java.lang.String[] allKeys = this.f192898d.allKeys();
        readLock.unlock();
        return allKeys;
    }

    public final void c(android.util.Pair pair) {
        if (f192893i.contains(pair)) {
            return;
        }
        kk.l lVar = f192896o;
        lVar.m(pair);
        if (S()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
            readLock.unlock();
            java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writeLock = this.f192902h;
            writeLock.lock();
            if (S()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiProcessMMKV", "MMKV : %s has bean closed, reopen now, my hashcode = %d, core mmkv hashcode = %d ", pair.first, java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(this.f192898d.hashCode()));
                android.util.Pair pair2 = this.f192899e;
                this.f192898d = K((java.lang.String) pair2.first, (java.lang.String) pair2.second, this.f192900f);
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiProcessMMKV", "MMKV : %s has bean closed, reopen done", pair.first);
                lVar.put(pair, this);
                com.tencent.mars.xlog.Log.e("MicroMsg.MultiProcessMMKV", "MMKV : %s checkReopen done", pair.first);
            }
            readLock.lock();
            writeLock.unlock();
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor clear() {
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
            readLock.lock();
            c(this.f192899e);
            this.f192898d.clear();
            readLock.unlock();
        } else {
            this.f192898d.clear();
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public boolean commit() {
        return true;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String str) {
        if (!U()) {
            return this.f192898d.contains(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean contains = this.f192898d.contains(str);
        readLock.unlock();
        return contains;
    }

    public void d() {
        if (!U()) {
            this.f192898d.clearAll();
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        this.f192898d.clearAll();
        readLock.unlock();
    }

    public void e() {
        if (!U()) {
            this.f192898d.clearMemoryCache();
            return;
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        this.f192898d.clearMemoryCache();
        readLock.unlock();
    }

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
        return this;
    }

    public boolean f(java.lang.String str) {
        if (!U()) {
            return this.f192898d.containsKey(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean containsKey = this.f192898d.containsKey(str);
        readLock.unlock();
        return containsKey;
    }

    public void finalize() {
    }

    public long g() {
        if (!U()) {
            return this.f192898d.count();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        long count = this.f192898d.count();
        readLock.unlock();
        return count;
    }

    @Override // android.content.SharedPreferences
    public java.util.Map getAll() {
        if (!U()) {
            return this.f192898d.getAll();
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        java.util.Map<java.lang.String, ?> all = this.f192898d.getAll();
        readLock.unlock();
        return all;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String str, boolean z17) {
        if (!U()) {
            return this.f192898d.getBoolean(str, z17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean z18 = this.f192898d.getBoolean(str, z17);
        readLock.unlock();
        return z18;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String str, float f17) {
        if (!U()) {
            return this.f192898d.getFloat(str, f17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        float f18 = this.f192898d.getFloat(str, f17);
        readLock.unlock();
        return f18;
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String str, int i17) {
        if (!U()) {
            return this.f192898d.getInt(str, i17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        int i18 = this.f192898d.getInt(str, i17);
        readLock.unlock();
        return i18;
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String str, long j17) {
        if (!U()) {
            return this.f192898d.getLong(str, j17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        long j18 = this.f192898d.getLong(str, j17);
        readLock.unlock();
        return j18;
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        if (!U()) {
            return this.f192898d.getString(str, str2);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        java.lang.String string = this.f192898d.getString(str, str2);
        readLock.unlock();
        return string;
    }

    @Override // android.content.SharedPreferences
    public java.util.Set getStringSet(java.lang.String str, java.util.Set set) {
        if (!U()) {
            return this.f192898d.getStringSet(str, set);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        java.util.Set<java.lang.String> stringSet = this.f192898d.getStringSet(str, set);
        readLock.unlock();
        return stringSet;
    }

    public boolean h(java.lang.String str) {
        if (!U()) {
            return this.f192898d.decodeBool(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean decodeBool = this.f192898d.decodeBool(str);
        readLock.unlock();
        return decodeBool;
    }

    public boolean i(java.lang.String str, boolean z17) {
        if (!U()) {
            return this.f192898d.decodeBool(str, z17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean decodeBool = this.f192898d.decodeBool(str, z17);
        readLock.unlock();
        return decodeBool;
    }

    public byte[] j(java.lang.String str) {
        if (!U()) {
            return this.f192898d.decodeBytes(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        byte[] decodeBytes = this.f192898d.decodeBytes(str);
        readLock.unlock();
        return decodeBytes;
    }

    public double k(java.lang.String str) {
        if (!U()) {
            return this.f192898d.decodeDouble(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        double decodeDouble = this.f192898d.decodeDouble(str);
        readLock.unlock();
        return decodeDouble;
    }

    public float l(java.lang.String str) {
        if (!U()) {
            return this.f192898d.decodeFloat(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        float decodeFloat = this.f192898d.decodeFloat(str);
        readLock.unlock();
        return decodeFloat;
    }

    public float m(java.lang.String str, float f17) {
        if (!U()) {
            return this.f192898d.decodeFloat(str, f17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        float decodeFloat = this.f192898d.decodeFloat(str, f17);
        readLock.unlock();
        return decodeFloat;
    }

    public int n(java.lang.String str) {
        if (!U()) {
            return this.f192898d.decodeInt(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        int decodeInt = this.f192898d.decodeInt(str);
        readLock.unlock();
        return decodeInt;
    }

    public int o(java.lang.String str, int i17) {
        if (!U()) {
            return this.f192898d.decodeInt(str, i17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        int decodeInt = this.f192898d.decodeInt(str, i17);
        readLock.unlock();
        return decodeInt;
    }

    public long p(java.lang.String str) {
        if (!U()) {
            return this.f192898d.decodeLong(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        long decodeLong = this.f192898d.decodeLong(str);
        readLock.unlock();
        return decodeLong;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putBoolean(java.lang.String str, boolean z17) {
        if (!T(str, java.lang.Boolean.valueOf(z17))) {
            return this;
        }
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
            readLock.lock();
            c(this.f192899e);
            this.f192898d.putBoolean(str, z17);
            readLock.unlock();
        } else {
            this.f192898d.putBoolean(str, z17);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putFloat(java.lang.String str, float f17) {
        if (!T(str, java.lang.Float.valueOf(f17))) {
            return this;
        }
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
            readLock.lock();
            c(this.f192899e);
            this.f192898d.putFloat(str, f17);
            readLock.unlock();
        } else {
            this.f192898d.putFloat(str, f17);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putInt(java.lang.String str, int i17) {
        if (!T(str, java.lang.Integer.valueOf(i17))) {
            return this;
        }
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
            readLock.lock();
            c(this.f192899e);
            this.f192898d.putInt(str, i17);
            readLock.unlock();
        } else {
            this.f192898d.putInt(str, i17);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putLong(java.lang.String str, long j17) {
        if (!T(str, java.lang.Long.valueOf(j17))) {
            return this;
        }
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
            readLock.lock();
            c(this.f192899e);
            this.f192898d.putLong(str, j17);
            readLock.unlock();
        } else {
            this.f192898d.putLong(str, j17);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putString(java.lang.String str, java.lang.String str2) {
        if (!T(str, str2)) {
            return this;
        }
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
            readLock.lock();
            c(this.f192899e);
            this.f192898d.putString(str, str2);
            readLock.unlock();
        } else {
            this.f192898d.putString(str, str2);
        }
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor putStringSet(java.lang.String str, java.util.Set set) {
        if (!T(str, set)) {
            return this;
        }
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
            readLock.lock();
            c(this.f192899e);
            this.f192898d.putStringSet(str, set);
            readLock.unlock();
        } else {
            this.f192898d.putStringSet(str, set);
        }
        return this;
    }

    public long q(java.lang.String str, long j17) {
        if (!U()) {
            return this.f192898d.decodeLong(str, j17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        long decodeLong = this.f192898d.decodeLong(str, j17);
        readLock.unlock();
        return decodeLong;
    }

    public android.os.Parcelable r(java.lang.String str, java.lang.Class cls) {
        if (!U()) {
            return this.f192898d.decodeParcelable(str, cls);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        android.os.Parcelable decodeParcelable = this.f192898d.decodeParcelable(str, cls);
        readLock.unlock();
        return decodeParcelable;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences.Editor
    public android.content.SharedPreferences.Editor remove(java.lang.String str) {
        if (U()) {
            java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
            readLock.lock();
            c(this.f192899e);
            this.f192898d.remove(str);
            readLock.unlock();
        } else {
            this.f192898d.remove(str);
        }
        return this;
    }

    public android.os.Parcelable s(java.lang.String str, java.lang.Class cls, android.os.Parcelable parcelable) {
        if (!U()) {
            return this.f192898d.decodeParcelable(str, cls, parcelable);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        android.os.Parcelable decodeParcelable = this.f192898d.decodeParcelable(str, cls, parcelable);
        readLock.unlock();
        return decodeParcelable;
    }

    public java.lang.String t(java.lang.String str) {
        if (!U()) {
            return this.f192898d.decodeString(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        java.lang.String decodeString = this.f192898d.decodeString(str);
        readLock.unlock();
        return decodeString;
    }

    public java.lang.String u(java.lang.String str, java.lang.String str2) {
        if (!U()) {
            return this.f192898d.decodeString(str, str2);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        java.lang.String decodeString = this.f192898d.decodeString(str, str2);
        readLock.unlock();
        return decodeString;
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    public java.util.Set v(java.lang.String str) {
        if (!U()) {
            return this.f192898d.decodeStringSet(str);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        java.util.Set<java.lang.String> decodeStringSet = this.f192898d.decodeStringSet(str);
        readLock.unlock();
        return decodeStringSet;
    }

    public java.util.Set w(java.lang.String str, java.util.Set set) {
        if (!U()) {
            return this.f192898d.decodeStringSet(str, (java.util.Set<java.lang.String>) set);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        java.util.Set<java.lang.String> decodeStringSet = this.f192898d.decodeStringSet(str, (java.util.Set<java.lang.String>) set);
        readLock.unlock();
        return decodeStringSet;
    }

    public boolean x(int i17) {
        if (!U()) {
            return this.f192898d.enableAutoKeyExpire(i17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean enableAutoKeyExpire = this.f192898d.enableAutoKeyExpire(i17);
        readLock.unlock();
        return enableAutoKeyExpire;
    }

    public boolean y(java.lang.String str, double d17) {
        if (!T(str, java.lang.Double.valueOf(d17))) {
            return false;
        }
        if (!U()) {
            return this.f192898d.encode(str, d17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean encode = this.f192898d.encode(str, d17);
        readLock.unlock();
        return encode;
    }

    public boolean z(java.lang.String str, float f17) {
        if (!T(str, java.lang.Float.valueOf(f17))) {
            return false;
        }
        if (!U()) {
            return this.f192898d.encode(str, f17);
        }
        java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock readLock = this.f192901g;
        readLock.lock();
        c(this.f192899e);
        boolean encode = this.f192898d.encode(str, f17);
        readLock.unlock();
        return encode;
    }
}
