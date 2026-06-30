package com.tencent.mm.vfs;

/* loaded from: classes12.dex */
public final class b3 implements android.os.Handler.Callback {
    public static volatile android.content.Context E = null;
    public static volatile com.tencent.mm.vfs.v2 F = null;
    public static volatile boolean G = true;
    public static volatile int H;
    public static volatile com.tencent.mm.vfs.u2 I;
    public final android.content.BroadcastReceiver A;
    public volatile java.util.HashMap B;
    public volatile boolean C;
    public volatile android.content.BroadcastReceiver D;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f212813d;

    /* renamed from: e, reason: collision with root package name */
    public final int f212814e;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.vfs.r5 f212816g;

    /* renamed from: h, reason: collision with root package name */
    public int f212817h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.vfs.z2 f212818i;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.vfs.o5 f212820n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.vfs.o5 f212821o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.vfs.o5 f212822p;

    /* renamed from: q, reason: collision with root package name */
    public final java.io.File f212823q;

    /* renamed from: r, reason: collision with root package name */
    public final android.os.HandlerThread f212824r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.vfs.w2 f212825s;

    /* renamed from: t, reason: collision with root package name */
    public final android.os.Handler f212826t;

    /* renamed from: u, reason: collision with root package name */
    public android.os.Message[] f212827u;

    /* renamed from: v, reason: collision with root package name */
    public volatile long f212828v;

    /* renamed from: w, reason: collision with root package name */
    public volatile long f212829w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f212830x;

    /* renamed from: y, reason: collision with root package name */
    public volatile com.tencent.mm.vfs.x2 f212831y;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f212815f = new java.lang.Object();

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Object f212819m = new java.lang.Object();

    /* renamed from: z, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReference f212832z = new java.util.concurrent.atomic.AtomicReference();

    public b3(com.tencent.mm.vfs.r2 r2Var) {
        android.content.Context context = E;
        this.f212813d = context;
        this.f212814e = H;
        if (context == null) {
            throw new java.lang.IllegalStateException("Call FileSystemManager.setContext(Context) before calling instance()");
        }
        java.io.File parentFile = context.getFilesDir().getParentFile();
        this.f212823q = new java.io.File(parentFile == null ? context.getCacheDir() : parentFile, ".vfs");
        this.f212827u = new android.os.Message[3];
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("VFS.Maintenance", 1);
        this.f212824r = handlerThread;
        handlerThread.start();
        this.f212826t = new android.os.Handler(handlerThread.getLooper(), this);
        this.f212825s = new com.tencent.mm.vfs.w2(this, null);
        this.f212828v = -1L;
        this.f212829w = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
        this.C = true;
        this.A = new com.tencent.mm.vfs.s2(this);
        this.B = g(context);
        com.tencent.mm.vfs.o5 o5Var = new com.tencent.mm.vfs.o5();
        java.util.Map map = o5Var.f213110a;
        com.tencent.mm.vfs.n2 n2Var = com.tencent.mm.vfs.FileSchemeResolver.CREATOR;
        com.tencent.mm.vfs.t5 t5Var = com.tencent.mm.vfs.n2.f213080a;
        map.put(null, t5Var);
        map.put("", t5Var);
        map.put("file", t5Var);
        com.tencent.mm.vfs.m8 m8Var = com.tencent.mm.vfs.WcfSchemeResolver.CREATOR;
        map.put("wcf", com.tencent.mm.vfs.m8.f213079a);
        java.util.Map map2 = o5Var.f213111b;
        android.os.Parcelable.Creator<com.tencent.mm.vfs.NullFileSystem> creator = com.tencent.mm.vfs.NullFileSystem.CREATOR;
        map2.put("null", com.tencent.mm.vfs.j4.f213013a);
        java.util.Map map3 = o5Var.f213114e;
        map3.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, context.getCacheDir().getParent());
        map3.put("dataCache", context.getCacheDir().getPath());
        this.f212822p = o5Var;
        com.tencent.mm.vfs.o5.c(o5Var.f213114e, this.B);
        this.f212820n = new com.tencent.mm.vfs.o5();
        this.f212821o = new com.tencent.mm.vfs.o5();
        this.f212816g = new com.tencent.mm.vfs.r5(this.f212822p);
        this.f212817h = 0;
        this.f212818i = new com.tencent.mm.vfs.z2(null, null, 0, null);
    }

    public static java.util.HashMap g(android.content.Context context) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.io.File externalCacheDir = context.getExternalCacheDir();
        hashMap.put("extData", externalCacheDir == null ? null : externalCacheDir.getParent());
        hashMap.put("extCache", externalCacheDir == null ? null : externalCacheDir.getPath());
        java.io.File externalStorageDirectory = android.os.Environment.getExternalStorageDirectory();
        hashMap.put("storage", externalStorageDirectory != null ? externalStorageDirectory.getPath() : null);
        return hashMap;
    }

    public com.tencent.mm.vfs.m5 a() {
        com.tencent.mm.vfs.r5 r5Var;
        synchronized (this.f212815f) {
            r5Var = this.f212816g;
        }
        return r5Var;
    }

    public void b(long j17, long j18, boolean z17) {
        long j19 = this.f212828v;
        if (j17 >= 0 && j19 < 0) {
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            int i17 = android.os.Build.VERSION.SDK_INT;
            if (i17 < 33 || this.f212813d.getApplicationInfo().targetSdkVersion < 33) {
                this.f212813d.registerReceiver(this.f212825s, intentFilter);
            } else {
                this.f212813d.registerReceiver(this.f212825s, intentFilter, 4);
            }
            com.tencent.mm.vfs.w2 w2Var = this.f212825s;
            android.content.Context context = this.f212813d;
            w2Var.getClass();
            w2Var.f213224b = ((android.os.PowerManager) context.getSystemService("power")).isScreenOn();
            android.content.IntentFilter intentFilter2 = new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED");
            android.content.Intent registerReceiver = (i17 < 33 || context.getApplicationInfo().targetSdkVersion < 33) ? context.registerReceiver(null, intentFilter2) : context.registerReceiver(null, intentFilter2, 4);
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("status", -1);
                w2Var.f213223a = intExtra == 2 || intExtra == 5;
            }
            w2Var.a();
        } else if (j17 < 0 && j19 >= 0) {
            this.f212813d.unregisterReceiver(this.f212825s);
            this.f212826t.removeMessages(2);
        }
        this.f212828v = j17;
        this.f212829w = j18;
        this.f212830x = z17;
    }

    public java.util.Map c() {
        return ((com.tencent.mm.vfs.r5) a()).a();
    }

    public com.tencent.mm.vfs.z7 d(com.tencent.mm.vfs.z7 z7Var) {
        com.tencent.mm.vfs.r5 r5Var;
        synchronized (this.f212815f) {
            r5Var = this.f212816g;
        }
        com.tencent.mm.vfs.s5 f17 = r5Var.f(z7Var.f213277d);
        if (f17 == null) {
            return null;
        }
        return f17.c(r5Var, z7Var);
    }

    public java.util.Map e() {
        return ((com.tencent.mm.vfs.r5) a()).c();
    }

    public final android.os.Bundle h() {
        java.io.DataInputStream dataInputStream;
        java.io.File file = new java.io.File(this.f212823q, "fs.bin");
        long length = file.length();
        if (length > 8388608 || length <= 8) {
            throw new java.io.IOException("Invalid parcel file size: " + length);
        }
        android.os.Parcel obtain = android.os.Parcel.obtain();
        java.io.DataInputStream dataInputStream2 = null;
        try {
            dataInputStream = new java.io.DataInputStream(new java.io.FileInputStream(file));
        } catch (java.lang.Throwable th6) {
            th = th6;
        }
        try {
            int readInt = dataInputStream.readInt();
            if (readInt != 5) {
                throw new com.tencent.mm.vfs.d8(com.tencent.mm.vfs.b3.class, readInt, 5);
            }
            int readInt2 = dataInputStream.readInt();
            int i17 = this.f212814e;
            if (readInt2 != i17) {
                throw new com.tencent.mm.vfs.d8(com.tencent.mm.vfs.b3.class, readInt2, i17);
            }
            int i18 = ((int) length) - 8;
            byte[] bArr = new byte[i18];
            int i19 = 0;
            while (i19 < i18) {
                i19 += dataInputStream.read(bArr, i19, i18 - i19);
            }
            obtain.unmarshall(bArr, 0, i19);
            obtain.setDataPosition(0);
            android.os.Bundle readBundle = obtain.readBundle(com.tencent.mm.vfs.FileSystem.class.getClassLoader());
            com.tencent.mm.vfs.e8.d(dataInputStream);
            obtain.recycle();
            return readBundle;
        } catch (java.lang.Throwable th7) {
            th = th7;
            dataInputStream2 = dataInputStream;
            com.tencent.mm.vfs.e8.d(dataInputStream2);
            obtain.recycle();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0122, code lost:
    
        if (r3.isHeld() != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015b, code lost:
    
        r12 = r3;
        yj0.a.c(r12, "com/tencent/mm/vfs/FileSystemManager", "doMaintenance", "(Landroid/os/CancellationSignal;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        r3.release();
        yj0.a.f(r12, "com/tencent/mm/vfs/FileSystemManager", "doMaintenance", "(Landroid/os/CancellationSignal;)V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0159, code lost:
    
        if (r3.isHeld() != false) goto L63;
     */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r21) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.b3.handleMessage(android.os.Message):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.os.CancellationSignal r12) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.b3.i(android.os.CancellationSignal):void");
    }

    public long j() {
        com.tencent.mm.vfs.y2 y2Var = (com.tencent.mm.vfs.y2) this.f212832z.get();
        if (y2Var == null || y2Var.f213255a != android.os.Process.myTid()) {
            return Long.MIN_VALUE;
        }
        return y2Var.f213256b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = "VFS.FileSystemManager"
            java.lang.String r1 = "Cannot write parcel file: "
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r2.writeBundle(r9)
            byte[] r3 = r2.marshall()
            r2.recycle()
            java.io.File r2 = new java.io.File
            java.io.File r4 = r8.f212823q
            java.lang.String r5 = "fs.bin.tmp"
            r2.<init>(r4, r5)
            java.io.File r5 = new java.io.File
            java.lang.String r6 = "fs.bin"
            r5.<init>(r4, r6)
            r4 = 0
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d
            r4 = 5
            r6.writeInt(r4)     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            int r4 = r8.f212814e     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            r6.writeInt(r4)     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            r6.write(r3)     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            r6.close()     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            java.lang.String r4 = r2.getPath()     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            java.lang.String r5 = r5.getPath()     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            com.tencent.mm.vfs.z3.a(r4, r5)     // Catch: java.io.IOException -> L48 java.lang.Throwable -> Lcb
            goto L66
        L48:
            r4 = move-exception
            goto L50
        L4a:
            r9 = move-exception
            goto Lcd
        L4d:
            r5 = move-exception
            r6 = r4
            r4 = r5
        L50:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r5.<init>(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r4.getMessage()     // Catch: java.lang.Throwable -> Lcb
            r5.append(r1)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> Lcb
            com.tencent.stubs.logger.Log.e(r0, r1)     // Catch: java.lang.Throwable -> Lcb
            r2.delete()     // Catch: java.lang.Throwable -> Lcb
        L66:
            com.tencent.mm.vfs.e8.d(r6)
            android.content.Context r1 = r8.f212813d
            java.lang.String r2 = r1.getPackageName()
            android.content.Intent r4 = new android.content.Intent
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = ".REFRESH_VFS"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            int r2 = r3.length
            r5 = 131072(0x20000, float:1.83671E-40)
            java.lang.String r6 = "fromFile"
            if (r2 >= r5) goto L90
            r4.putExtras(r9)
            goto L94
        L90:
            r9 = 1
            r4.putExtra(r6, r9)
        L94:
            java.lang.String r9 = "pid"
            int r2 = android.os.Process.myPid()
            r4.putExtra(r9, r2)
            java.lang.String r9 = "uid"
            int r2 = android.os.Process.myUid()
            r4.putExtra(r9, r2)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "Bundle published - size: "
            r9.<init>(r2)
            int r2 = r3.length
            r9.append(r2)
            java.lang.String r2 = ", fromFile: "
            r9.append(r2)
            r2 = 0
            boolean r2 = r4.getBooleanExtra(r6, r2)
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            com.tencent.stubs.logger.Log.i(r0, r9)
            r1.sendBroadcast(r4)
            return
        Lcb:
            r9 = move-exception
            r4 = r6
        Lcd:
            com.tencent.mm.vfs.e8.d(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.vfs.b3.k(android.os.Bundle):void");
    }

    public final void l(boolean z17) {
        if (z17) {
            this.f212822p = this.f212822p.f();
            this.f212821o = this.f212821o.f();
            this.f212820n = this.f212820n.f();
        }
        com.tencent.mm.vfs.o5 o5Var = new com.tencent.mm.vfs.o5(this.f212822p);
        o5Var.a(this.f212821o);
        o5Var.a(this.f212820n);
        com.tencent.mm.vfs.r5 r5Var = new com.tencent.mm.vfs.r5(o5Var);
        synchronized (this.f212815f) {
            this.f212816g = r5Var;
            int i17 = this.f212817h + 1;
            this.f212817h = i17;
            this.f212818i = new com.tencent.mm.vfs.z2(null, null, i17, null);
        }
    }

    public com.tencent.mm.vfs.z2 m(com.tencent.mm.vfs.z7 z7Var, com.tencent.mm.vfs.z2 z2Var) {
        android.util.Pair a17;
        synchronized (this.f212815f) {
            if (z2Var != null) {
                if (z2Var.f213268c == this.f212817h) {
                    return z2Var;
                }
            }
            com.tencent.mm.vfs.r5 r5Var = this.f212816g;
            int i17 = this.f212817h;
            com.tencent.mm.vfs.z2 z2Var2 = this.f212818i;
            com.tencent.mm.vfs.s5 f17 = r5Var.f(z7Var.f213277d);
            return (f17 == null || (a17 = f17.a(r5Var, z7Var)) == null) ? z2Var2 : new com.tencent.mm.vfs.z2((com.tencent.mm.vfs.q2) a17.first, (java.lang.String) a17.second, i17, null);
        }
    }
}
