package oj;

/* loaded from: classes12.dex */
public final class h0 {
    public h0(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.matrix.util.StatusInfo a(int i17) {
        java.io.BufferedReader bufferedReader;
        java.util.Map map = kz5.q0.f314001d;
        try {
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File("/proc/" + i17 + "/status")), r26.c.f368865a);
            bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.MemoryInfoFactory", th6, "", new java.lang.Object[0]);
        }
        try {
            q26.n m17 = q26.h0.m(vz5.v.b(bufferedReader), oj.f0.f345700d);
            java.util.Map linkedHashMap = new java.util.LinkedHashMap();
            q26.j jVar = new q26.j((q26.k) m17);
            while (jVar.hasNext()) {
                jz5.l lVar = (jz5.l) jVar.next();
                linkedHashMap.put(lVar.f302833d, lVar.f302834e);
            }
            int size = linkedHashMap.size();
            if (size == 0) {
                linkedHashMap = map;
            } else if (size == 1) {
                linkedHashMap = kz5.b1.f(linkedHashMap);
            }
            vz5.b.a(bufferedReader, null);
            map = linkedHashMap;
            com.tencent.matrix.util.StatusInfo statusInfo = new com.tencent.matrix.util.StatusInfo("default", -1L, -1L, -1L, -1L, -1L, -1, -1);
            try {
                oj.g0 g0Var = oj.g0.f345705d;
                java.lang.String str = (java.lang.String) map.get("State");
                if (str == null) {
                    str = com.eclipsesource.mmv8.Platform.UNKNOWN;
                }
                java.lang.String b17 = r26.b0.b(str);
                long a17 = g0Var.a(map, "FDSize");
                long a18 = g0Var.a(map, "VmSize");
                long a19 = g0Var.a(map, "VmRSS");
                long a27 = g0Var.a(map, "VmSwap");
                long a28 = g0Var.a(map, "Threads");
                oj.h0 h0Var = com.tencent.matrix.util.StatusInfo.f53126o;
                return new com.tencent.matrix.util.StatusInfo(b17, a17, a18, a19, a27, a28, h0Var.b(i17), h0Var.c(i17));
            } catch (java.lang.Throwable th7) {
                oj.j.d("Matrix.MemoryInfoFactory", th7, "", new java.lang.Object[0]);
                return statusInfo;
            }
        } finally {
        }
    }

    public final int b(int i17) {
        try {
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File("/proc/" + i17 + "/oom_adj")), r26.c.f368865a);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            try {
                int parseInt = java.lang.Integer.parseInt((java.lang.String) q26.h0.k(vz5.v.b(bufferedReader)));
                vz5.b.a(bufferedReader, null);
                return parseInt;
            } finally {
            }
        } catch (java.lang.Throwable unused) {
            return Integer.MAX_VALUE;
        }
    }

    public final int c(int i17) {
        try {
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(new java.io.FileInputStream(new java.io.File("/proc/" + i17 + "/oom_score_adj")), r26.c.f368865a);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            try {
                int parseInt = java.lang.Integer.parseInt((java.lang.String) q26.h0.k(vz5.v.b(bufferedReader)));
                vz5.b.a(bufferedReader, null);
                return parseInt;
            } finally {
            }
        } catch (java.lang.Throwable unused) {
            return Integer.MAX_VALUE;
        }
    }
}
