package rs0;

/* loaded from: classes14.dex */
public final class j {
    public j(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a() {
        java.lang.String string = d().getString("gpu_detector_version", null);
        if (string == null || string.length() == 0) {
            g();
        }
        return string;
    }

    public final java.lang.String b() {
        java.lang.String string = d().getString("gpu_info_device_model", null);
        if (string == null || string.length() == 0) {
            g();
        }
        return string;
    }

    public final int c() {
        int i17 = d().getInt("gpu_info_rating", -1);
        if (i17 == -1) {
            g();
        }
        return i17;
    }

    public final com.tencent.mm.sdk.platformtools.o4 d() {
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv_gpu_info");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        return M;
    }

    public final java.lang.String e() {
        try {
            java.lang.String b17 = b();
            if (b17 != null) {
                return b17;
            }
            new rs0.n().a();
            return b17;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.GpuDetectorUtil", "error happened " + e17, new java.lang.Object[0]);
            return null;
        }
    }

    public final int f() {
        try {
            int c17 = c();
            java.lang.String a17 = a();
            java.lang.String version = com.tencent.gpudetector.JniGPUDetector.INSTANCE.getVersion();
            if (c17 == -1 || a17 == null || !kotlin.jvm.internal.o.b(version, version)) {
                new rs0.n().a();
            }
            return c17;
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.GpuDetectorUtil", "error happened " + e17, new java.lang.Object[0]);
            return -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        r4.putString("gpu_detector_version", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:3:0x000d, B:5:0x0023, B:6:0x0026, B:8:0x002e, B:13:0x003a, B:14:0x003d, B:16:0x0043, B:21:0x004d), top: B:2:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r10 = this;
            java.lang.String r0 = "gpu_detector_version"
            java.lang.String r1 = "gpu_info_device_model"
            java.lang.String r2 = "gpu_info_rating"
            java.lang.String r3 = "MicroMsg.GpuDetectorUtil"
            com.tencent.mm.sdk.platformtools.o4 r4 = r10.d()
            r5 = 0
            java.lang.String r6 = "spToMMKV: "
            com.tencent.mars.xlog.Log.i(r3, r6)     // Catch: java.lang.Exception -> L51
            android.content.Context r6 = com.tencent.mm.sdk.platformtools.x2.f193071a     // Catch: java.lang.Exception -> L51
            java.lang.String r7 = com.tencent.mm.sdk.platformtools.x2.e()     // Catch: java.lang.Exception -> L51
            android.content.SharedPreferences r6 = r6.getSharedPreferences(r7, r5)     // Catch: java.lang.Exception -> L51
            r7 = -1
            int r8 = r6.getInt(r2, r7)     // Catch: java.lang.Exception -> L51
            if (r8 == r7) goto L26
            r4.putInt(r2, r8)     // Catch: java.lang.Exception -> L51
        L26:
            r2 = 0
            java.lang.String r7 = r6.getString(r1, r2)     // Catch: java.lang.Exception -> L51
            r8 = 1
            if (r7 == 0) goto L37
            int r9 = r7.length()     // Catch: java.lang.Exception -> L51
            if (r9 != 0) goto L35
            goto L37
        L35:
            r9 = r5
            goto L38
        L37:
            r9 = r8
        L38:
            if (r9 != 0) goto L3d
            r4.putString(r1, r7)     // Catch: java.lang.Exception -> L51
        L3d:
            java.lang.String r1 = r6.getString(r0, r2)     // Catch: java.lang.Exception -> L51
            if (r1 == 0) goto L4b
            int r2 = r1.length()     // Catch: java.lang.Exception -> L51
            if (r2 != 0) goto L4a
            goto L4b
        L4a:
            r8 = r5
        L4b:
            if (r8 != 0) goto L59
            r4.putString(r0, r1)     // Catch: java.lang.Exception -> L51
            goto L59
        L51:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.mars.xlog.Log.printErrStackTrace(r3, r0, r1, r2)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs0.j.g():void");
    }
}
