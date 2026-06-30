package sn1;

/* loaded from: classes12.dex */
public abstract class i extends com.tencent.mm.modelbase.m1 {

    /* renamed from: i, reason: collision with root package name */
    public static sn1.h f410015i;

    /* renamed from: m, reason: collision with root package name */
    public static sn1.e f410016m;

    /* renamed from: s, reason: collision with root package name */
    public static int f410022s;

    /* renamed from: t, reason: collision with root package name */
    public static sn1.g f410023t;

    /* renamed from: d, reason: collision with root package name */
    public int f410024d = 0;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.pointers.PByteArray f410025e = new com.tencent.mm.pointers.PByteArray();

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f410012f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f410013g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.n3 f410014h = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: n, reason: collision with root package name */
    public static int f410017n = -1;

    /* renamed from: o, reason: collision with root package name */
    public static sn1.i0 f410018o = null;

    /* renamed from: p, reason: collision with root package name */
    public static sn1.s0 f410019p = null;

    /* renamed from: q, reason: collision with root package name */
    public static sn1.k0 f410020q = null;

    /* renamed from: r, reason: collision with root package name */
    public static sn1.o0 f410021r = null;

    static {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        f410022s = new java.util.Random(java.lang.System.currentTimeMillis()).nextInt(1147483648);
        f410023t = null;
    }

    public static void H(int i17) {
        sn1.s0 s0Var = f410019p;
        if (s0Var != null) {
            long j17 = i17;
            s0Var.f410086c += j17;
            s0Var.f410088e += j17;
        }
    }

    public static void I(int i17, com.tencent.mm.modelbase.u0 u0Var) {
        java.util.Map map = f410012f;
        synchronized (map) {
            if (!((java.util.HashMap) map).containsKey(java.lang.Integer.valueOf(i17))) {
                ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), new java.util.HashSet());
            }
            if (!((java.util.Set) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).contains(u0Var)) {
                ((java.util.Set) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).add(u0Var);
            }
        }
    }

    public static java.lang.String L() {
        sn1.s0 s0Var = f410019p;
        if (s0Var == null) {
            return "";
        }
        float currentTimeMillis = (float) ((s0Var.f410087d / (java.lang.System.currentTimeMillis() + s0Var.f410093j)) * 1000);
        long j17 = s0Var.f410092i;
        long j18 = j17 - s0Var.f410087d;
        long j19 = s0Var.f410085b;
        if (j19 < 1 || j18 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupSpeedCalculator", "getBackupRemainTime totalSize:%d, receiveDataSize:%d, backupSpeed:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(s0Var.f410087d), java.lang.Long.valueOf(s0Var.f410085b));
            return com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.a7k, 1);
        }
        long j27 = currentTimeMillis > 1.0f ? ((float) j18) / currentTimeMillis : j18 / j19;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupSpeedCalculator", "getBackupRemainTime totalSize:%d, receiveDataSize:%d, backupSpeed:%d, speed:%f, sec:%d, transferTime:%d", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(s0Var.f410087d), java.lang.Long.valueOf(s0Var.f410085b), java.lang.Float.valueOf(currentTimeMillis), java.lang.Long.valueOf(j27), java.lang.Long.valueOf(s0Var.f410093j));
        if (j27 >= 3600) {
            return com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.a7j, java.lang.Integer.valueOf((int) java.lang.Math.floor(j27 / 3600.0d)), java.lang.Integer.valueOf((int) java.lang.Math.ceil((j27 % 3600) / 60)));
        }
        if (j27 < 60) {
            j27 = 60;
        }
        return com.tencent.mm.sdk.platformtools.x2.h(com.tencent.mm.R.string.a7k, java.lang.Integer.valueOf((int) java.lang.Math.ceil(j27 / 60.0d)));
    }

    public static java.lang.String O() {
        java.lang.String str;
        sn1.s0 s0Var = f410019p;
        if (s0Var == null) {
            return "0B";
        }
        long j17 = s0Var.f410085b;
        if ((j17 >> 30) > 0) {
            str = com.tencent.mm.sdk.platformtools.t8.e0(j17, 100.0d);
        } else if ((j17 >> 20) > 0) {
            str = com.tencent.mm.sdk.platformtools.t8.i0(j17, 100.0d);
        } else if ((j17 >> 9) > 0) {
            str = "" + java.lang.Math.round(((float) j17) / 1024.0f) + " KB";
        } else {
            str = "" + j17 + " B";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupSpeedCalculator", "getBackupSpeed[%s]", str);
        return str;
    }

    public static void Q(int i17, com.tencent.mm.modelbase.u0 u0Var) {
        java.util.Map map = f410012f;
        synchronized (map) {
            try {
                if (((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null) {
                    ((java.util.Set) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).remove(u0Var);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupBaseScene", e17, "removeSceneEndListener failed", new java.lang.Object[0]);
            }
        }
    }

    public static boolean R(byte[] bArr, int i17) {
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        synchronized (f410013g) {
            int i18 = f410022s;
            f410022s = i18 + 1;
            on1.f.a(bArr, i18, (short) i17, pByteArray, f410017n);
            sn1.e eVar = f410016m;
            if (eVar != null) {
                ((ln1.g) eVar).c(i18, pByteArray.value, i17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupBaseScene", "sendBuf sendSeq[%d], type[%d], buflen[%d]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(pByteArray.value.length));
        }
        return true;
    }

    public static boolean S(byte[] bArr, int i17, int i18) {
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        on1.f.a(bArr, i18, (short) i17, pByteArray, f410017n);
        sn1.e eVar = f410016m;
        if (eVar == null) {
            return true;
        }
        ((ln1.g) eVar).c(i18, pByteArray.value, i17);
        return true;
    }

    public static void T() {
        if (f410020q == null) {
            f410020q = new sn1.k0();
        }
        sn1.k0 k0Var = f410020q;
        k0Var.getClass();
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupLogManager", "start");
            sn1.k0.f410044c = 0L;
            sn1.k0.f410045d = 0L;
            sn1.k0.f410046e = 0L;
            sn1.k0.f410047f = 0L;
            com.tencent.mm.sdk.platformtools.b4 b4Var = k0Var.f410049b;
            if (b4Var != null) {
                b4Var.d();
                k0Var.f410049b = null;
            }
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            sn1.k0.f410044c = currentTimeMillis;
            sn1.k0.f410046e = k0Var.a(currentTimeMillis);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupLogManager", e17, "start exception", new java.lang.Object[0]);
        }
    }

    public static void U(sn1.n0 n0Var) {
        sn1.o0 o0Var = f410021r;
        if (o0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupBaseScene", "startBackupReconnectHandler, no old backupReconnectHandler is stopped, new one.");
        } else {
            if (!o0Var.f410064c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupBaseScene", "startBackupReconnectHandler, backupReconnectHandler already running, ignore it.");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupBaseScene", "startBackupReconnectHandler, old backupReconnectHandler is stopped, new one.");
        }
        sn1.o0 o0Var2 = new sn1.o0(n0Var);
        f410021r = o0Var2;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupReconnectHandler", "start backupReconnectTimeHandler.");
        sn1.o0.f410061f = 0;
        o0Var2.f410064c = false;
        o0Var2.f410063b = 1;
        if (o0Var2.f410062a != null) {
            o0Var2.f410066e.c(0L, 0L);
        }
    }

    public static void V() {
        sn1.i0 i0Var = f410018o;
        if (i0Var != null && i0Var.f410030e != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupHeartBeatHandler", "stop");
            i0Var.f410030e = java.lang.Boolean.TRUE;
        }
        sn1.i0 i0Var2 = new sn1.i0();
        f410018o = i0Var2;
        i0Var2.b(true);
    }

    public static void W() {
        sn1.s0 s0Var = f410019p;
        if (s0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BackupBaseScene", "startSpeedCalculator backupSpeedCalculator is null!");
            return;
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = s0Var.f410096m;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupSpeedCalculator", "start backupGetSpeedTimeHandler. hash:%d", java.lang.Integer.valueOf(b4Var.hashCode()));
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        s0Var.f410089f = java.lang.System.currentTimeMillis();
        s0Var.f410086c = 0L;
        s0Var.f410084a = 0L;
        java.util.LinkedList linkedList = (java.util.LinkedList) s0Var.f410094k;
        linkedList.clear();
        s0Var.f410091h = 0;
        s0Var.f410090g = 0L;
        for (int i17 = 0; i17 < 10; i17++) {
            linkedList.offer(204800L);
        }
        b4Var.c(1000L, 1000L);
    }

    public static void X(int i17) {
        sn1.k0 k0Var = f410020q;
        if (k0Var != null) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupLogManager", "end backupMode[%d]", java.lang.Integer.valueOf(i17));
                long j17 = sn1.k0.f410044c;
                if (j17 != 0 && sn1.k0.f410046e != 0) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    sn1.k0.f410045d = currentTimeMillis;
                    long j18 = 0;
                    for (long j19 = sn1.k0.f410044c; j19 <= currentTimeMillis + 86400000; j19 += 86400000) {
                        j18 += k0Var.a(j19);
                    }
                    sn1.k0.f410047f = j18;
                    com.tencent.mars.xlog.Log.i("MicroMsg.BackupLogManager", "end, backupMode[%d], endTime[%d], startTime[%d], endLogSize[%d], startLogSize[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(sn1.k0.f410045d), java.lang.Long.valueOf(sn1.k0.f410044c), java.lang.Long.valueOf(sn1.k0.f410047f), java.lang.Long.valueOf(sn1.k0.f410046e));
                    long j27 = sn1.k0.f410047f;
                    if (j27 != 0) {
                        long j28 = sn1.k0.f410046e;
                        if (j27 > j28) {
                            k0Var.b(i17, sn1.k0.f410045d - sn1.k0.f410044c, j27 - j28, false);
                        }
                    }
                    sn1.k0.f410044c = 0L;
                    sn1.k0.f410045d = 0L;
                    sn1.k0.f410046e = 0L;
                    sn1.k0.f410047f = 0L;
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.BackupLogManager", "end is zero, startTime[%d], startLogSize[%d], skip report", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(sn1.k0.f410046e));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupLogManager", e17, "end exception", new java.lang.Object[0]);
            }
        }
    }

    public static void Y() {
        sn1.o0 o0Var = f410021r;
        if (o0Var != null) {
            o0Var.f410063b = 0;
            if (o0Var.f410064c) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupReconnectHandler", "stop backupReconnectTimeHandler.");
            o0Var.f410066e.d();
            o0Var.f410064c = true;
        }
    }

    public static void Z() {
        sn1.i0 i0Var = f410018o;
        if (i0Var == null || i0Var.f410030e == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupHeartBeatHandler", "stop");
        i0Var.f410030e = java.lang.Boolean.TRUE;
    }

    public static void a0() {
        sn1.s0 s0Var = f410019p;
        if (s0Var != null) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = s0Var.f410096m;
            com.tencent.mars.xlog.Log.i("MicroMsg.BackupSpeedCalculator", "stop backupGetSpeedTimeHandler. hash:%d", java.lang.Integer.valueOf(b4Var.hashCode()));
            b4Var.d();
            s0Var.f410091h = 0;
        }
    }

    public void J(int i17, int i18, java.lang.String str) {
        f410014h.post(new sn1.c(this, i17, i18, str));
    }

    public boolean K() {
        try {
            byte[] byteArray = M().toByteArray();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f410013g;
            synchronized (concurrentHashMap) {
                int i17 = f410022s;
                f410022s = i17 + 1;
                this.f410024d = i17;
                on1.f.a(byteArray, i17, (short) getType(), this.f410025e, f410017n);
                sn1.e eVar = f410016m;
                if (eVar != null) {
                    ((ln1.g) eVar).c(this.f410024d, this.f410025e.value, getType());
                }
                concurrentHashMap.put(java.lang.Integer.valueOf(this.f410024d), this);
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupBaseScene", "doScene sendSeq[%d], type[%d], buflen[%d], sceneCount:%d", java.lang.Integer.valueOf(this.f410024d), java.lang.Integer.valueOf(getType()), java.lang.Integer.valueOf(this.f410025e.value.length), java.lang.Integer.valueOf(concurrentHashMap.size()));
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupBaseScene", e17, "req to buf fail: " + e17.toString(), new java.lang.Object[0]);
            return false;
        }
    }

    public abstract com.tencent.mm.protobuf.f M();

    public abstract com.tencent.mm.protobuf.f N();

    public abstract void P(int i17);

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        return 0;
    }
}
