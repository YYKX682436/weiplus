package i11;

/* loaded from: classes12.dex */
public class i implements com.tencent.mm.app.s5 {
    @Override // com.tencent.mm.app.s5
    public void Jb(java.lang.String str) {
        if (i11.h.f287091J > 0 && i11.h.K > 0) {
            long uptimeMillis = android.os.SystemClock.uptimeMillis() - i11.h.K;
            ob0.r2 r2Var = (ob0.r2) i95.n0.c(ob0.r2.class);
            int i17 = i11.h.f287091J;
            ((com.tencent.mm.feature.performance.q) r2Var).getClass();
            java.util.List list = ri.p.f395959a;
            if (uptimeMillis > gi.d.c() && i17 > 0) {
                qh.b b17 = qh.b.b(uptimeMillis);
                if (b17.f363320m) {
                    long max = java.lang.Math.max(1L, uptimeMillis / 60000);
                    int c17 = b17.c();
                    int d17 = b17.d();
                    long j17 = i17 / max;
                    if (j17 > 2) {
                        java.lang.String f17 = ri.i.f();
                        java.lang.String str2 = b17.f363316i;
                        java.lang.String c18 = ri.j.c(null, true);
                        if (!android.text.TextUtils.isEmpty(b17.f363318k) && ("background".equals(b17.f363316i) || "bg".equals(b17.f363316i))) {
                            str2 = "bg-" + b17.f363318k;
                        }
                        java.lang.String str3 = str2;
                        com.tencent.mars.xlog.Log.i("Matrix.battery.BatteryReporter", "#reportTmsLocationException");
                        android.util.SparseArray sparseArray = ri.s.f396008a;
                        ri.s.b(1, 5, f17, "", c17, d17, "avgTmsLocationErr", j17, "", 0L, "duringMin", max, str3, null, b17.f363309b, b17.f363312e, b17.f363317j, c18);
                    }
                }
            }
        }
        i11.h.f287091J = 0;
        i11.h.K = -1L;
    }

    @Override // com.tencent.mm.app.s5
    public void k2(java.lang.String str) {
        i11.h.K = android.os.SystemClock.uptimeMillis();
    }
}
