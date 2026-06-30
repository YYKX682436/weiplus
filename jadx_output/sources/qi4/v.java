package qi4;

/* loaded from: classes11.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final qi4.v f363788a = new qi4.v();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f363789b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f363790c = new java.util.LinkedHashSet();

    /* renamed from: d, reason: collision with root package name */
    public static qi4.q f363791d = qi4.q.f363782e;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.CountDownLatch f363792e = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: f, reason: collision with root package name */
    public static volatile boolean f363793f;

    static {
        new java.text.SimpleDateFormat(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, java.util.Locale.CHINA);
    }

    public final void a(java.lang.String userName, java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        kotlin.jvm.internal.o.g(userName, "userName");
        b();
        synchronized (this) {
            concurrentHashMap = f363789b;
            concurrentHashMap.remove(userName);
            com.tencent.mars.xlog.Log.e("StatusJVMCacheStorage", "[deleteStatusInfoWithId] success, userName: " + userName + " statusId: " + str);
        }
        bw5.um0 selectStatusInfoWithUsername = com.tencent.wechat.aff.status.StatusStorageManager.getInstance().selectStatusInfoWithUsername(userName, 0, 1, c01.id.c() - com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER);
        mj4.h hVar = null;
        if (selectStatusInfoWithUsername != null && selectStatusInfoWithUsername.f33984d && selectStatusInfoWithUsername.f33987g.size() > 0) {
            ai4.f fVar = ai4.f.f5139a;
            java.lang.Object obj = selectStatusInfoWithUsername.f33987g.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            hVar = ai4.f.e(fVar, (bw5.sm0) obj, null, 2, null);
        }
        if (hVar != null) {
            synchronized (this) {
                concurrentHashMap.put(userName, hVar);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[deleteStatusInfoWithId] update, userName=");
            sb6.append(userName);
            sb6.append(" statusId:");
            mj4.k kVar = (mj4.k) hVar;
            sb6.append(kVar.o());
            sb6.append(" createTime: ");
            sb6.append(kVar.f327067b.field_CreateTime);
            com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", sb6.toString());
        }
    }

    public final void b() {
        if (f363793f) {
            return;
        }
        synchronized (this) {
            if (f363793f) {
                return;
            }
            qi4.p.f363776a.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.StatusDBWrapper", "activate: ");
            f363793f = true;
        }
    }

    public final boolean c(mj4.h hVar) {
        if (hVar == null) {
            return true;
        }
        mj4.k kVar = (mj4.k) hVar;
        if (kVar.w()) {
            return true;
        }
        qi4.p pVar = qi4.p.f363776a;
        int i17 = kVar.f327067b.field_CreateTime;
        pVar.getClass();
        return (((long) i17) * 1000) + ((long) com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER) < c01.id.c();
    }

    public final mj4.h d(java.lang.String userName) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        boolean z17;
        kotlin.jvm.internal.o.g(userName, "userName");
        ((ku5.t0) ku5.t0.f312615d).q(qi4.t.f363787d);
        java.util.HashMap hashMap = new java.util.HashMap();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        synchronized (this) {
            concurrentHashMap = f363789b;
            hashMap.putAll(concurrentHashMap);
        }
        java.util.Set set = f363790c;
        synchronized (set) {
            z17 = !set.contains(userName);
        }
        java.lang.Object obj = hashMap.get(userName);
        java.lang.Object obj2 = c((mj4.h) obj) ? null : obj;
        if (obj2 != null) {
            return (mj4.h) obj2;
        }
        if (z17) {
            b();
            bw5.um0 selectStatusInfoWithUsername = com.tencent.wechat.aff.status.StatusStorageManager.getInstance().selectStatusInfoWithUsername(userName, 0, 1, c01.id.c() - com.tencent.tmassistantsdk.downloadservice.Downloads.MAX_RETYR_AFTER);
            if (selectStatusInfoWithUsername != null && selectStatusInfoWithUsername.f33984d && selectStatusInfoWithUsername.f33987g.size() > 0) {
                ai4.f fVar = ai4.f.f5139a;
                java.lang.Object obj3 = selectStatusInfoWithUsername.f33987g.get(0);
                kotlin.jvm.internal.o.f(obj3, "get(...)");
                obj2 = ai4.f.e(fVar, (bw5.sm0) obj3, null, 2, null);
            }
            if (obj2 != null) {
                synchronized (this) {
                    concurrentHashMap.put(userName, obj2);
                }
                com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[getLatestStatusByUserName] read aff success, userName=" + userName + ", cost =" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                return (mj4.h) obj2;
            }
        }
        synchronized (set) {
            set.add(userName);
        }
        com.tencent.mars.xlog.Log.e("StatusJVMCacheStorage", "[getLatestStatusByUserName] read failed, userName=" + userName + " enableAffQuery=" + z17);
        return null;
    }

    public final mj4.h e(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        return (mj4.h) f363789b.get(userName);
    }

    public final bw5.um0 f(bw5.sm0 sm0Var, mj4.h hVar) {
        int i17;
        if (sm0Var == null) {
            return null;
        }
        b();
        com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[insertOrReplaceInfo] try check infoId = " + sm0Var.getStatusId() + ", userName=" + sm0Var.e());
        bw5.um0 insertOrReplaceInfo = com.tencent.wechat.aff.status.StatusStorageManager.getInstance().insertOrReplaceInfo(sm0Var);
        if (hVar == null) {
            hVar = ai4.f.e(ai4.f.f5139a, sm0Var, null, 2, null);
        }
        int i18 = ((mj4.k) hVar).f327067b.field_CreateTime;
        if (insertOrReplaceInfo == null || !insertOrReplaceInfo.f33984d) {
            com.tencent.mars.xlog.Log.e("StatusJVMCacheStorage", "[insertOrReplaceInfo] failed infoId = " + sm0Var.getStatusId() + ", userName=" + sm0Var.e());
        } else {
            synchronized (this) {
                mj4.k kVar = (mj4.k) hVar;
                java.lang.String o17 = kVar.o();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = f363789b;
                if (concurrentHashMap.contains(o17)) {
                    java.lang.Object obj = concurrentHashMap.get(kVar.o());
                    kotlin.jvm.internal.o.d(obj);
                    i17 = ((mj4.k) ((mj4.h) obj)).f327067b.field_CreateTime;
                } else {
                    i17 = -1;
                }
                if (i18 >= i17) {
                    concurrentHashMap.put(o17, hVar);
                    com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[insertOrReplaceInfo] success infoId = " + sm0Var.getStatusId() + ", userName=" + sm0Var.e() + ", createTime=" + i18 + ", cacheCreateTime=" + i17);
                } else {
                    com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[insertOrReplaceInfo] abort, infoId = " + sm0Var.getStatusId() + ", userName=" + sm0Var.e() + ", createTime=" + i18 + ", cacheCreateTime=" + i17);
                }
            }
        }
        return insertOrReplaceInfo;
    }

    public final void g(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        synchronized (this) {
        }
        java.util.Set set = f363790c;
        synchronized (set) {
            set.remove(userName);
        }
        com.tencent.mars.xlog.Log.i("StatusJVMCacheStorage", "[invalidateCacheForUser] userName=".concat(userName));
    }
}
