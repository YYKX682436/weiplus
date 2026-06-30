package ln1;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static long f319764b = -1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f319765a = false;

    public void a(final java.util.LinkedList linkedList, final ln1.m mVar, long j17) {
        java.util.HashMap hashMap;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        xn1.h l17 = mn1.d.i().l();
        if (l17.f455469r == 0) {
            long j18 = l17.f455467p;
            long j19 = l17.f455468q;
            hashMap = new java.util.HashMap();
            try {
                android.database.Cursor p17 = mt1.b0.f331191a.n().p1(j18, j19, null);
                while (p17.moveToNext()) {
                    try {
                        java.lang.String string = p17.getString(0);
                        long[] jArr = new long[5];
                        int i17 = 0;
                        while (i17 < 5) {
                            int i18 = i17 + 1;
                            jArr[i17] = jArr[i17] + p17.getLong(i18);
                            i17 = i18;
                        }
                        hashMap.put(string, jArr);
                    } finally {
                    }
                }
                p17.close();
            } catch (java.lang.NullPointerException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BackupCalculator", e17, "", new java.lang.Object[0]);
            }
        } else {
            hashMap = null;
        }
        java.util.HashMap hashMap2 = hashMap;
        java.util.Iterator it = linkedList.iterator();
        int i19 = 0;
        while (it.hasNext()) {
            kn1.i iVar = (kn1.i) it.next();
            if (iVar.f309628g >= 0) {
                i19++;
            } else {
                if (f319764b == -1) {
                    f319764b = aw1.v.d();
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.BackupCalculator", "calConversation, msgPerSize = " + f319764b);
                long j27 = f319764b * iVar.f309629h;
                long[] jArr2 = iVar.f309627f;
                jArr2[0] = j27;
                iVar.f309628g = j27;
                if (hashMap2 != null && hashMap2.containsKey(iVar.f309625d)) {
                    long[] jArr3 = (long[]) hashMap2.get(iVar.f309625d);
                    if (jArr3.length > 0) {
                        long j28 = jArr2[0] + jArr3[0];
                        jArr2[0] = j28;
                        long j29 = jArr3[0];
                        long j37 = jArr3[1];
                        if (j29 >= j37) {
                            jArr2[1] = jArr2[1] + (j29 - j37);
                        }
                        iVar.f309628g = j28;
                    }
                }
                final int i27 = i19 + 1;
                if (!this.f319765a && mVar != null) {
                    final kn1.i iVar2 = new kn1.i();
                    iVar2.f309625d = iVar.f309625d;
                    iVar2.f309626e = iVar.f309626e;
                    iVar2.f309628g = iVar.f309628g;
                    iVar2.f309629h = iVar.f309629h;
                    com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: ln1.h$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (ln1.h.this.f319765a) {
                                return;
                            }
                            mVar.X0(linkedList, iVar2, i27);
                        }
                    });
                }
                i19 = i27;
            }
        }
        if (!this.f319765a && mVar != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: ln1.h$$b
                @Override // java.lang.Runnable
                public final void run() {
                    ln1.m mVar2;
                    if (ln1.h.this.f319765a || (mVar2 = mVar) == null) {
                        return;
                    }
                    mVar2.e1(linkedList);
                }
            });
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCalculator", "calculChooseConvSize loading time[%d] userSize:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(linkedList.size()));
    }

    public void b() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCalculator", "cancel. stack:%s", new com.tencent.mm.sdk.platformtools.z3());
        this.f319765a = true;
    }
}
