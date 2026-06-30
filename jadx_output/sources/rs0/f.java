package rs0;

/* loaded from: classes10.dex */
public abstract class f {
    public static final java.util.List a(java.lang.String str, double[] result, int i17) {
        boolean z17;
        kotlin.jvm.internal.o.g(result, "result");
        if (str == null || !com.tencent.mm.vfs.w6.j(str)) {
            return kz5.p0.f313996d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        gp.c cVar = new gp.c();
        try {
            try {
                cVar.k(str);
                int d17 = cVar.d();
                int i18 = 0;
                while (true) {
                    if (i18 >= d17) {
                        z17 = false;
                        break;
                    }
                    android.media.MediaFormat e17 = cVar.e(i18);
                    kotlin.jvm.internal.o.f(e17, "getTrackFormat(...)");
                    java.lang.String string = e17.getString("mime");
                    kotlin.jvm.internal.o.d(string);
                    if (r26.i0.y(string, "video/", false)) {
                        cVar.i(i18);
                        z17 = true;
                        break;
                    }
                    i18++;
                }
                if (z17) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    int i19 = Integer.MAX_VALUE;
                    int i27 = 0;
                    int i28 = 0;
                    int i29 = 1000000;
                    do {
                        long b17 = cVar.b();
                        if (b17 == -1) {
                            break;
                        }
                        arrayList.add(java.lang.Long.valueOf(b17));
                        if (b17 > i29) {
                            arrayList2.add(java.lang.Integer.valueOf(i28));
                            i27 = java.lang.Math.max(i27, i28);
                            i19 = java.lang.Math.min(i19, i28);
                            if (i27 - i19 >= i17) {
                                break;
                            }
                            i29 += 1000000;
                            i28 = 0;
                        } else {
                            i28++;
                        }
                    } while (cVar.a());
                    if (i29 <= 1000000) {
                        arrayList2.add(java.lang.Integer.valueOf(i28));
                        i27 = java.lang.Math.max(i27, i28);
                        i19 = java.lang.Math.min(i19, i28);
                    }
                    result[0] = i19;
                    result[1] = i27;
                    result[2] = kz5.n0.L(arrayList2);
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("FPSComputer", "compute fps error: " + e18.getLocalizedMessage());
                com.tencent.mm.plugin.report.service.g0.INSTANCE.B(986L, 103L);
            }
            long currentTimeMillis2 = java.lang.System.currentTimeMillis();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("compute fps for file: ");
            sb6.append(str);
            sb6.append(", threshold = ");
            sb6.append(i17);
            sb6.append(" frames = ");
            sb6.append(arrayList.size());
            sb6.append(", execute time = ");
            long j17 = currentTimeMillis2 - currentTimeMillis;
            sb6.append(j17);
            sb6.append("ms, min fps = ");
            sb6.append(result[0]);
            sb6.append(", max fps = ");
            sb6.append(result[1]);
            sb6.append(", avg fps = ");
            sb6.append(result[2]);
            com.tencent.mars.xlog.Log.i("FPSComputer", sb6.toString());
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 102L, j17);
            return arrayList;
        } finally {
            cVar.g();
        }
    }
}
