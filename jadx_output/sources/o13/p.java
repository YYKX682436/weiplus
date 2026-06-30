package o13;

/* loaded from: classes12.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f342248a = {8, 9, 10, 11, 12, 14, 19, 20, 21, 22, 24, 25, 26, 15, 28, 29};

    /* renamed from: b, reason: collision with root package name */
    public static final o13.o f342249b = new o13.o();

    /* renamed from: c, reason: collision with root package name */
    public static long f342250c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static long f342251d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f342252e = "";

    public static final void a(java.util.ArrayList arrayList, int i17, int i18, int i19) {
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(i17);
        iDKey.SetKey(i18);
        iDKey.SetValue(i19);
        arrayList.add(iDKey);
    }

    public static java.lang.String b() {
        java.lang.String str = f342252e;
        if (str == null || "".equals(str)) {
            f342252e = "" + java.lang.System.currentTimeMillis();
        }
        return f342252e;
    }

    public static java.lang.String c(long j17) {
        if (j17 == 0) {
            return "0";
        }
        if (j17 > 0) {
            return java.lang.Long.toString(j17, 10);
        }
        char[] cArr = new char[64];
        long j18 = (j17 >>> 1) / 5;
        long j19 = 10;
        int i17 = 63;
        cArr[63] = java.lang.Character.forDigit((int) (j17 - (j18 * j19)), 10);
        while (j18 > 0) {
            i17--;
            cArr[i17] = java.lang.Character.forDigit((int) (j18 % j19), 10);
            j18 /= j19;
        }
        return new java.lang.String(cArr, i17, 64 - i17);
    }

    public static final void d(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTSReportApiLogic", "reportCommonChatroom: %d %d", 14731, java.lang.Integer.valueOf(i17));
        jx3.f.INSTANCE.d(14731, java.lang.Integer.valueOf(i17));
    }

    public static void e(int i17) {
        com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
        iDKey.SetID(146);
        iDKey.SetKey(0);
        iDKey.SetValue(1L);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(iDKey);
        if (i17 != 1) {
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
            iDKey2.SetID(146);
            iDKey2.SetKey(2);
            iDKey2.SetValue(1L);
            arrayList.add(iDKey2);
            com.tencent.mars.smc.IDKey iDKey3 = new com.tencent.mars.smc.IDKey();
            iDKey3.SetID(146);
            iDKey3.SetKey(i17);
            iDKey3.SetValue(1L);
            arrayList.add(iDKey3);
        } else {
            com.tencent.mars.smc.IDKey iDKey4 = new com.tencent.mars.smc.IDKey();
            iDKey4.SetID(146);
            iDKey4.SetKey(1);
            iDKey4.SetValue(1L);
            arrayList.add(iDKey4);
        }
        jx3.f.INSTANCE.b(arrayList, false);
    }

    public static void f(int i17, long j17) {
        if (i17 > 0) {
            int i18 = ((i17 - 1) * 2) + 1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
            iDKey.SetID(601);
            iDKey.SetKey(i18);
            iDKey.SetValue((int) j17);
            arrayList.add(iDKey);
            com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
            iDKey2.SetID(601);
            iDKey2.SetKey(i18 + 1);
            iDKey2.SetValue(1L);
            arrayList.add(iDKey2);
            jx3.f.INSTANCE.b(arrayList, false);
        }
    }

    public static void g(int i17, long j17) {
        if (i17 > 0) {
            int i18 = ((i17 - 1) * 4) + 1;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
            iDKey.SetID(602);
            iDKey.SetKey(i18);
            iDKey.SetValue(1L);
            arrayList.add(iDKey);
            if (j17 <= 100) {
                com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
                iDKey2.SetID(602);
                iDKey2.SetKey(i18 + 1);
                iDKey2.SetValue(1L);
                arrayList.add(iDKey2);
            } else if (j17 <= 500) {
                com.tencent.mars.smc.IDKey iDKey3 = new com.tencent.mars.smc.IDKey();
                iDKey3.SetID(602);
                iDKey3.SetKey(i18 + 2);
                iDKey3.SetValue(1L);
                arrayList.add(iDKey3);
            } else {
                com.tencent.mars.smc.IDKey iDKey4 = new com.tencent.mars.smc.IDKey();
                iDKey4.SetID(602);
                iDKey4.SetKey(i18 + 3);
                iDKey4.SetValue(1L);
                arrayList.add(iDKey4);
            }
            jx3.f.INSTANCE.b(arrayList, false);
        }
    }

    public static final void h(int i17, long j17, long j18) {
        boolean z17;
        int[] iArr = f342248a;
        int i18 = 0;
        while (true) {
            if (i18 >= 16) {
                z17 = false;
                break;
            } else {
                if (i17 == iArr[i18]) {
                    z17 = true;
                    break;
                }
                i18++;
            }
        }
        if (z17) {
            long longValue = new kk.v(gm0.j1.b().h()).longValue();
            if (o45.wf.f343030h) {
                if (longValue % 100 != 1) {
                    return;
                }
            } else if (o45.wf.f343032j && longValue % 10 != 1) {
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[11];
            objArr[0] = 0;
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = java.lang.Long.valueOf(j17);
            objArr[3] = 0;
            o13.o oVar = f342249b;
            objArr[4] = java.lang.Integer.valueOf(oVar.f342243a >= 1536 ? 1 : 0);
            objArr[5] = java.lang.Long.valueOf(oVar.f342243a);
            objArr[6] = java.lang.Long.valueOf(oVar.f342244b);
            objArr[7] = java.lang.Long.valueOf(oVar.f342245c);
            objArr[8] = java.lang.Long.valueOf(oVar.f342246d);
            objArr[9] = java.lang.Long.valueOf(oVar.f342247e);
            objArr[10] = java.lang.Long.valueOf(j18);
            jx3.f.INSTANCE.kvStat(14175, java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", objArr));
        }
    }
}
