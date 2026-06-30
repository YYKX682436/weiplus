package cw1;

/* loaded from: classes12.dex */
public class o3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw1.j3 f223195d;

    public o3(cw1.j3 j3Var, cw1.k3 k3Var) {
        this.f223195d = j3Var;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x0074. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:62:0x0077. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List r14) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cw1.o3.a(java.util.List):void");
    }

    @Override // java.lang.Runnable
    public void run() {
        ot1.j n17 = mt1.b0.f331191a.n();
        final cw1.j3 j3Var = this.f223195d;
        java.lang.String str = j3Var.f223027g;
        n17.getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long[] jArr = new long[2];
        try {
            android.database.Cursor f17 = n17.f348849d.f("SELECT min(msgtime), max(msgtime) FROM WxFileIndex3 WHERE username = ?", new java.lang.String[]{str}, 0);
            if (f17 != null) {
                try {
                    if (f17.moveToFirst()) {
                        jArr[0] = f17.getLong(0);
                        jArr[1] = f17.getLong(1);
                    }
                } finally {
                }
            }
            if (f17 != null) {
                f17.close();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WxFileIndexStorage", e17, " sql [%s]", "SELECT min(msgtime), max(msgtime) FROM WxFileIndex3 WHERE username = ?");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxFileIndexStorage", "getMediaMsgTimeByUsername [%s] cost[%d]", str, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
        jArr[0] = java.lang.Math.max(jArr[0], j3Var.f223029i) - 1;
        long min = java.lang.Math.min(jArr[1], j3Var.f223030m);
        jArr[1] = min;
        long max = java.lang.Math.max(min - 604800000, jArr[0]);
        try {
            if (j3Var.f223032o) {
                return;
            }
            if (max == min) {
                max--;
            }
            a(mt1.b0.f331191a.n().S1(j3Var.f223027g, min, max, j3Var.f223028h, true, true, false));
            if (!j3Var.f223032o) {
                com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: cw1.j3$$b
                    @Override // java.lang.Runnable
                    public final void run() {
                        cw1.j3.this.notifyDataSetChanged();
                    }
                });
            }
            while (true) {
                long j17 = max;
                if (j3Var.f223032o) {
                    return;
                }
                long j18 = jArr[0];
                if (j17 <= j18) {
                    return;
                }
                max = java.lang.Math.max(j17 - 15552000000L, j18);
                if (max == j17) {
                    max--;
                }
                a(mt1.b0.f331191a.n().S1(j3Var.f223027g, j17, max, j3Var.f223028h, true, true, false));
                if (!j3Var.f223032o) {
                    com.tencent.mm.sdk.platformtools.u3.h(new java.lang.Runnable() { // from class: cw1.j3$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            cw1.j3.this.notifyDataSetChanged();
                        }
                    });
                }
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CleanChattingDetailAdapter", e18, "", new java.lang.Object[0]);
        }
    }
}
