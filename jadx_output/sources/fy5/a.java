package fy5;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static fy5.a f267262b;

    /* renamed from: a, reason: collision with root package name */
    public final gy5.a f267263a;

    public a(android.content.Context context, hy5.b bVar) {
        ky5.b.f313635a = context;
        if (gy5.a.f277634e != null) {
            throw new java.lang.RuntimeException("tinker server client is already init");
        }
        if (gy5.a.f277634e == null) {
            synchronized (iy5.a.class) {
                if (gy5.a.f277634e == null) {
                    gy5.a.f277634e = new gy5.a(bVar);
                }
            }
        }
        this.f267263a = gy5.a.f277634e;
    }

    public static fy5.a d() {
        fy5.a aVar = f267262b;
        if (aVar != null) {
            return aVar;
        }
        throw new java.lang.RuntimeException("you must init TinkerClient sdk first");
    }

    public fy5.a a(final boolean z17) {
        if (this.f267263a == null) {
            com.tencent.mars.xlog.Log.e("Tinker.TinkerClient", "fetchPatchUpdate, tinkerServerClient, just return");
            return f267262b;
        }
        android.content.Context a17 = ky5.b.a();
        if (!((a17.checkSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) && (a17.checkSelfPermission("android.permission.INTERNET") == 0))) {
            com.tencent.mars.xlog.Log.e("Tinker.TinkerClient", "fetchPatchUpdate, permission refuse, you must access INTERNET and ACCESS_NETWORK_STATE permission first");
            return f267262b;
        }
        if (!ak0.o.g()) {
            com.tencent.mars.xlog.Log.e("Tinker.TinkerClient", "fetchPatchUpdate, tinker is disable, just return");
            return f267262b;
        }
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            android.os.Looper.getMainLooper();
            android.os.Looper.myQueue().addIdleHandler(new android.os.MessageQueue.IdleHandler() { // from class: fy5.a$$a
                @Override // android.os.MessageQueue.IdleHandler
                public final boolean queueIdle() {
                    gy5.a aVar = fy5.a.this.f267263a;
                    aVar.getClass();
                    android.content.SharedPreferences sharedPreferences = ky5.b.a().getSharedPreferences("patch_server_config", 0);
                    long j17 = sharedPreferences.getLong("fetch_patch_last_check", 0L);
                    if (j17 == -1) {
                        com.tencent.mars.xlog.Log.i("Tinker.ServerClient", "tinker sync is disabled, with never check flag!");
                    } else {
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - j17;
                        if (!z17 && !aVar.f277638d) {
                            long j18 = aVar.f277636b;
                            if (currentTimeMillis < j18) {
                                com.tencent.mars.xlog.Log.i("Tinker.ServerClient", "tinker sync should wait interval %ss", java.lang.Long.valueOf((j18 - currentTimeMillis) / 1000));
                            }
                        }
                        sharedPreferences.edit().putLong("fetch_patch_last_check", java.lang.System.currentTimeMillis()).commit();
                        hy5.b bVar = aVar.f277635a;
                        iy5.a aVar2 = aVar.f277637c;
                        aVar2.getClass();
                        if (bVar == null) {
                            throw new java.lang.RuntimeException("callback can't be null");
                        }
                        if (bVar.a()) {
                            bVar.c();
                            bVar.b(aVar2.f296038a.f302553a);
                        }
                    }
                    return false;
                }
            });
        }
        return f267262b;
    }

    public fy5.a b(int i17) {
        gy5.a aVar = this.f267263a;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("Tinker.TinkerClient", "setFetchPatchIntervalByHours, tinkerServerClient == null, just return");
            return f267262b;
        }
        com.tencent.mars.xlog.Log.i("Tinker.TinkerClient", "setFetchPatchIntervalByHours to %d hours", java.lang.Integer.valueOf(i17));
        aVar.getClass();
        long j17 = i17;
        if (j17 == -1) {
            com.tencent.mars.xlog.Log.i("Tinker.ServerClient", "Warning, disableFetchPatchUpdate");
            ky5.b.a().getSharedPreferences("patch_server_config", 0).edit().putLong("fetch_patch_last_check", -1L).commit();
        } else {
            if (i17 < 0 || i17 > 24) {
                throw new java.lang.RuntimeException("hours must be between 0 and 24");
            }
            aVar.f277636b = j17 * 3600 * 1000;
        }
        return f267262b;
    }

    public fy5.a c(java.lang.String str, java.lang.String str2) {
        gy5.a aVar = this.f267263a;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("Tinker.TinkerClient", "setPatchCondition, tinkerServerClient == null, just return");
            return f267262b;
        }
        com.tencent.mars.xlog.Log.i("Tinker.TinkerClient", "setPatchCondition %s with value %s", str, str2);
        ((java.util.HashMap) aVar.f277637c.f296038a.f302553a).put(str, str2);
        return f267262b;
    }
}
