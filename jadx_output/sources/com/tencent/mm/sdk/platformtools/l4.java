package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class l4 implements android.content.SharedPreferences {

    /* renamed from: s, reason: collision with root package name */
    public static com.tencent.mm.sdk.platformtools.n3 f192821s;

    /* renamed from: t, reason: collision with root package name */
    public static final java.lang.Object f192822t = new java.lang.Object();

    /* renamed from: u, reason: collision with root package name */
    public static final android.util.LruCache f192823u = new android.util.LruCache(5);

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.FLock f192824d;

    /* renamed from: e, reason: collision with root package name */
    public final java.io.File f192825e;

    /* renamed from: f, reason: collision with root package name */
    public final java.io.File f192826f;

    /* renamed from: g, reason: collision with root package name */
    public final int f192827g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f192828h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.Map f192829i = null;

    /* renamed from: m, reason: collision with root package name */
    public int f192830m = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f192831n = false;

    /* renamed from: o, reason: collision with root package name */
    public long f192832o = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f192833p = 0;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f192834q = new java.lang.Object();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.WeakHashMap f192835r = new java.util.WeakHashMap();

    public l4(android.content.Context context, java.lang.String str, int i17) {
        this.f192824d = null;
        this.f192825e = null;
        this.f192826f = null;
        this.f192827g = 0;
        this.f192828h = false;
        android.content.Context applicationContext = context.getApplicationContext();
        if (f192821s == null) {
            f192821s = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        }
        java.lang.String str2 = applicationContext.getApplicationInfo().dataDir;
        if (str2 == null || str2.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MultiProcSharedPreferences", "Failed to retrive data path by ApplicationInfo.dataDir, use prefix hardcoded version instead.");
            str2 = applicationContext.getCacheDir().getParent();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiProcSharedPreferences", "Path to store sp data: " + str2);
        java.io.File file = new java.io.File(str2, "shared_prefs");
        if (!file.exists()) {
            file.mkdirs();
        } else if (!file.canRead() || !file.canWrite()) {
            file.setReadable(true, true);
            file.setWritable(true, true);
        }
        java.io.File file2 = new java.io.File(file, str + ".xml");
        this.f192825e = file2;
        this.f192826f = new java.io.File(file2.getPath() + ".bak");
        this.f192827g = i17;
        boolean z17 = (i17 & 4) != 0;
        this.f192828h = z17;
        if (z17) {
            this.f192824d = new com.tencent.mm.sdk.platformtools.FLock(file2.getPath() + ".lock", true);
        }
        d();
    }

    public static void a(com.tencent.mm.sdk.platformtools.l4 l4Var) {
        com.tencent.mm.sdk.platformtools.FLock fLock = l4Var.f192824d;
        boolean z17 = l4Var.f192828h;
        if (z17) {
            try {
                fLock.b();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MultiProcSharedPreferences", e17, "", new java.lang.Object[0]);
            }
        }
        try {
            if (!l4Var.f192831n) {
                java.io.File file = l4Var.f192826f;
                boolean exists = file.exists();
                java.io.File file2 = l4Var.f192825e;
                if (exists) {
                    file2.delete();
                    file.renameTo(file2);
                }
                if (file2.exists() && !file2.canRead()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MultiProcSharedPreferences", "Attempt to read preferences file " + file2 + " without permission");
                }
                java.util.HashMap hashMap = null;
                if (file2.canRead()) {
                    try {
                        java.io.BufferedInputStream bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file2), 16384);
                        hashMap = com.tencent.mm.sdk.platformtools.ba.a(bufferedInputStream);
                        bufferedInputStream.close();
                    } catch (java.io.FileNotFoundException e18) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MultiProcSharedPreferences", "getSharedPreferences", e18);
                    } catch (java.io.IOException e19) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MultiProcSharedPreferences", "getSharedPreferences", e19);
                    } catch (org.xmlpull.v1.XmlPullParserException e27) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.MultiProcSharedPreferences", "getSharedPreferences", e27);
                    }
                }
                l4Var.f192831n = true;
                if (hashMap != null) {
                    l4Var.f192829i = hashMap;
                    l4Var.f192832o = file2.lastModified();
                    l4Var.f192833p = file2.length();
                } else {
                    l4Var.f192829i = new java.util.HashMap();
                }
                l4Var.notifyAll();
                if (!z17) {
                    return;
                }
            } else if (!z17) {
                return;
            }
            try {
                fLock.e();
            } catch (java.lang.Exception unused) {
            }
        } catch (java.lang.Throwable th6) {
            if (z17) {
                try {
                    fLock.e();
                } catch (java.lang.Exception unused2) {
                }
            }
            throw th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.SharedPreferences c(android.content.Context r8, java.lang.String r9, int r10, boolean r11) {
        /*
            com.tencent.mm.sdk.platformtools.o4 r0 = com.tencent.mm.sdk.platformtools.o4.M(r9)
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.e4.f192552c
            android.content.Context r2 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r3 = "pref_MultiProcSP_dyncfg"
            r4 = 4
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r3, r4)
            com.tencent.mm.sdk.platformtools.e4.f192550a = r2
            r3 = 0
            if (r2 != 0) goto L1e
            java.lang.String r1 = "MicroMsg.MultiProcSharedPreferences"
            java.lang.String r2 = "SharedPreferences in DynamicConfigStorage initialize failed."
            com.tencent.mars.xlog.Log.w(r1, r2)
            r1 = r3
            goto L22
        L1e:
            boolean r1 = r2.getBoolean(r1, r3)
        L22:
            r2 = 1
            if (r1 != 0) goto L45
            java.lang.String r1 = com.tencent.mm.sdk.platformtools.e4.f192551b
            android.content.Context r5 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r6 = "pref_MultiProcSP_dyncfg"
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r6, r4)
            com.tencent.mm.sdk.platformtools.e4.f192550a = r5
            if (r5 != 0) goto L3d
            java.lang.String r1 = "MicroMsg.MultiProcSharedPreferences"
            java.lang.String r5 = "SharedPreferences in DynamicConfigStorage initialize failed."
            com.tencent.mars.xlog.Log.w(r1, r5)
            r1 = r3
            goto L41
        L3d:
            boolean r1 = r5.getBoolean(r1, r3)
        L41:
            if (r1 == 0) goto L45
            r1 = r2
            goto L46
        L45:
            r1 = r3
        L46:
            if (r1 == 0) goto L9e
            java.lang.String r1 = "MicroMsg.MultiProcSharedPreferences"
            java.lang.String r5 = "sp: %s, use Flock version MultiProcessSP."
            java.lang.Object[] r6 = new java.lang.Object[]{r9}
            com.tencent.mars.xlog.Log.i(r1, r5, r6)
            android.util.LruCache r1 = com.tencent.mm.sdk.platformtools.l4.f192823u
            java.lang.Object r5 = r1.get(r9)
            com.tencent.mm.sdk.platformtools.l4 r5 = (com.tencent.mm.sdk.platformtools.l4) r5
            if (r5 != 0) goto L67
            com.tencent.mm.sdk.platformtools.l4 r5 = new com.tencent.mm.sdk.platformtools.l4
            r5.<init>(r8, r9, r10)
            r1.put(r9, r5)
            goto L9a
        L67:
            r8 = r10 & 4
            if (r8 == 0) goto L9a
            if (r11 == 0) goto L71
            r5.d()
            goto L9a
        L71:
            monitor-enter(r5)
            int r8 = r5.f192830m     // Catch: java.lang.Throwable -> L97
            if (r8 <= 0) goto L77
            goto L8e
        L77:
            long r8 = r5.f192832o     // Catch: java.lang.Throwable -> L97
            java.io.File r10 = r5.f192825e     // Catch: java.lang.Throwable -> L97
            long r6 = r10.lastModified()     // Catch: java.lang.Throwable -> L97
            int r8 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r8 != 0) goto L8d
            long r8 = r5.f192833p     // Catch: java.lang.Throwable -> L97
            long r10 = r10.length()     // Catch: java.lang.Throwable -> L97
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L8e
        L8d:
            r3 = r2
        L8e:
            if (r3 != 0) goto L92
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L97
            goto L9a
        L92:
            r5.d()     // Catch: java.lang.Throwable -> L97
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L97
            goto L9a
        L97:
            r8 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L97
            throw r8
        L9a:
            com.tencent.mm.sdk.platformtools.o4.Z(r5, r0)
            return r0
        L9e:
            java.lang.String r11 = "MicroMsg.MultiProcSharedPreferences"
            java.lang.String r0 = "sp: %s, use system sp."
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            com.tencent.mars.xlog.Log.i(r11, r0, r1)
            android.content.SharedPreferences r8 = r8.getSharedPreferences(r9, r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.platformtools.l4.c(android.content.Context, java.lang.String, int, boolean):android.content.SharedPreferences");
    }

    public final void b() {
        while (!this.f192831n) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences
    public boolean contains(java.lang.String str) {
        boolean containsKey;
        synchronized (this) {
            b();
            containsKey = this.f192829i.containsKey(str);
        }
        return containsKey;
    }

    public final void d() {
        synchronized (this) {
            this.f192831n = false;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.sdk.platformtools.d4(this));
    }

    @Override // android.content.SharedPreferences
    public android.content.SharedPreferences.Editor edit() {
        synchronized (this) {
            b();
        }
        return new com.tencent.mm.sdk.platformtools.j4(this, null);
    }

    @Override // android.content.SharedPreferences
    public java.util.Map getAll() {
        java.util.HashMap hashMap;
        synchronized (this) {
            b();
            hashMap = new java.util.HashMap(this.f192829i);
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(java.lang.String str, boolean z17) {
        synchronized (this) {
            b();
            java.lang.Boolean bool = (java.lang.Boolean) this.f192829i.get(str);
            if (bool != null) {
                z17 = bool.booleanValue();
            }
        }
        return z17;
    }

    @Override // android.content.SharedPreferences
    public float getFloat(java.lang.String str, float f17) {
        synchronized (this) {
            b();
            java.lang.Float f18 = (java.lang.Float) this.f192829i.get(str);
            if (f18 != null) {
                f17 = f18.floatValue();
            }
        }
        return f17;
    }

    @Override // android.content.SharedPreferences
    public int getInt(java.lang.String str, int i17) {
        synchronized (this) {
            b();
            java.lang.Integer num = (java.lang.Integer) this.f192829i.get(str);
            if (num != null) {
                i17 = num.intValue();
            }
        }
        return i17;
    }

    @Override // android.content.SharedPreferences
    public long getLong(java.lang.String str, long j17) {
        synchronized (this) {
            b();
            java.lang.Long l17 = (java.lang.Long) this.f192829i.get(str);
            if (l17 != null) {
                j17 = l17.longValue();
            }
        }
        return j17;
    }

    @Override // android.content.SharedPreferences
    public java.lang.String getString(java.lang.String str, java.lang.String str2) {
        synchronized (this) {
            b();
            java.lang.String str3 = (java.lang.String) this.f192829i.get(str);
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    @Override // android.content.SharedPreferences
    public java.util.Set getStringSet(java.lang.String str, java.util.Set set) {
        synchronized (this) {
            b();
            java.util.Set set2 = (java.util.Set) this.f192829i.get(str);
            if (set2 != null) {
                set = set2;
            }
        }
        return set;
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this) {
            this.f192835r.put(onSharedPreferenceChangeListener, f192822t);
        }
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(android.content.SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this) {
            this.f192835r.remove(onSharedPreferenceChangeListener);
        }
    }
}
