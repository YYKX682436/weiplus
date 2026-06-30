package cr0;

/* loaded from: classes12.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    public static final cr0.r2 f221734a = new cr0.r2();

    /* renamed from: b, reason: collision with root package name */
    public static android.os.health.HealthStats f221735b;

    public final void a(java.lang.String str, long j17, long j18, long j19, long j27) {
        if (mm.o.h(false, 1, null)) {
            long j28 = j18 - j17;
            long j29 = j19 > 0 ? j27 - j19 : -1L;
            if (ph.t.f354283k == null) {
                synchronized ("Matrix.battery.LifeCycle") {
                    if (ph.t.f354283k == null) {
                        throw new java.lang.IllegalStateException("Call #init() first!".toString());
                    }
                }
            }
            ph.t tVar = ph.t.f354283k;
            kotlin.jvm.internal.o.d(tVar);
            ph.c c17 = tVar.c();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("reset-tolerance", 600000);
            linkedHashMap.put("reset-charging", java.lang.Boolean.valueOf(c17.d()));
            linkedHashMap.put("reset-percentage", java.lang.Integer.valueOf(c17.b()));
            long j37 = com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL;
            long j38 = j17 / j37;
            linkedHashMap.put("reset-battery-min", java.lang.Long.valueOf(j38));
            linkedHashMap.put("reset-duration-min", java.lang.Long.valueOf(j19 > 0 ? (java.lang.System.currentTimeMillis() - j19) / j37 : -1L));
            linkedHashMap.put("reset-time-load", java.lang.Long.valueOf(j29 > 0 ? a06.d.c((((float) j29) * 100.0f) / ((float) j17)) : -1L));
            ap.a.a(1, "errHealthStats", null, linkedHashMap, str, (j28 / j37) + "min", (j18 / j37) + "min", j38 + "min");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:290:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x08fc  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0937 A[LOOP:19: B:317:0x0931->B:319:0x0937, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:323:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0a32  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0ab7  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0b01  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0ab9  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0a34  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.os.health.HealthStats r84) {
        /*
            Method dump skipped, instructions count: 2881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr0.r2.b(android.os.health.HealthStats):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0157 A[Catch: all -> 0x01fc, TryCatch #0 {, blocks: (B:9:0x0034, B:11:0x0038, B:17:0x0070, B:20:0x007e, B:23:0x009d, B:25:0x00ba, B:27:0x00db, B:30:0x00e3, B:31:0x00ee, B:33:0x0116, B:43:0x0134, B:50:0x0157, B:51:0x01a9, B:53:0x01af, B:55:0x01c2, B:56:0x01d2, B:57:0x01d9, B:59:0x01f8, B:62:0x0189, B:68:0x01da), top: B:8:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01af A[Catch: all -> 0x01fc, TryCatch #0 {, blocks: (B:9:0x0034, B:11:0x0038, B:17:0x0070, B:20:0x007e, B:23:0x009d, B:25:0x00ba, B:27:0x00db, B:30:0x00e3, B:31:0x00ee, B:33:0x0116, B:43:0x0134, B:50:0x0157, B:51:0x01a9, B:53:0x01af, B:55:0x01c2, B:56:0x01d2, B:57:0x01d9, B:59:0x01f8, B:62:0x0189, B:68:0x01da), top: B:8:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0189 A[Catch: all -> 0x01fc, TryCatch #0 {, blocks: (B:9:0x0034, B:11:0x0038, B:17:0x0070, B:20:0x007e, B:23:0x009d, B:25:0x00ba, B:27:0x00db, B:30:0x00e3, B:31:0x00ee, B:33:0x0116, B:43:0x0134, B:50:0x0157, B:51:0x01a9, B:53:0x01af, B:55:0x01c2, B:56:0x01d2, B:57:0x01d9, B:59:0x01f8, B:62:0x0189, B:68:0x01da), top: B:8:0x0034 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr0.r2.c(java.lang.Object):void");
    }
}
