package p65;

/* loaded from: classes12.dex */
public class b implements wo.t0 {
    public b(p65.a aVar) {
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            jz5.g gVar = fp.t.f265239a;
            try {
                if (((java.lang.Boolean) ((jz5.n) fp.t.f265239a).getValue()).booleanValue()) {
                    java.lang.String cacheDirectory = io.flutter.util.PathUtils.getCacheDirectory(com.tencent.mm.sdk.platformtools.x2.f193071a);
                    kotlin.jvm.internal.o.f(cacheDirectory, "getCacheDirectory(...)");
                    java.io.File file = new java.io.File(cacheDirectory, fp.t.f265240b);
                    if (file.exists()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterCacheUtil", "markInvalid");
                        java.io.File file2 = new java.io.File(cacheDirectory, fp.t.f265241c);
                        if (!file2.exists()) {
                            file2.mkdirs();
                        }
                        file.renameTo(new java.io.File(file2, java.lang.String.valueOf(java.lang.System.nanoTime())));
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FlutterCacheUtil", th6, "markInvalid error", new java.lang.Object[0]);
            }
            com.tencent.mm.app.p5.f("MicroMsg.BaseStartupRoutine", "[!!] Reset DeviceInfo. InstallTime(%s -> %s), Model(%s -> %s), MMGUID(%s, %s -> %s), AndroidID(%s -> %s)", str, str2, str5, str6, wo.w0.k(), str7, str8, str3, str4);
            com.tencent.mm.autogen.mmdata.rpt.DeviceIdChangeStatStruct deviceIdChangeStatStruct = new com.tencent.mm.autogen.mmdata.rpt.DeviceIdChangeStatStruct();
            deviceIdChangeStatStruct.f55791d = deviceIdChangeStatStruct.b("PreFirstInstallTime", str, true);
            deviceIdChangeStatStruct.f55792e = deviceIdChangeStatStruct.b("CurFirstInstallTime", str2, true);
            deviceIdChangeStatStruct.f55793f = deviceIdChangeStatStruct.b("PreAndroidId", str3, true);
            deviceIdChangeStatStruct.f55794g = deviceIdChangeStatStruct.b("CurAndroidId", str4, true);
            deviceIdChangeStatStruct.f55795h = deviceIdChangeStatStruct.b("PreDeviceModel", str5, true);
            deviceIdChangeStatStruct.f55796i = deviceIdChangeStatStruct.b("CurDeviceModel", str6, true);
            deviceIdChangeStatStruct.n();
            java.lang.String m17 = deviceIdChangeStatStruct.m();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(m17)) {
                com.tencent.mm.app.p5.b(28619, m17);
            }
            com.tencent.mm.app.p5.b(21019, java.lang.String.format(java.util.Locale.ENGLISH, "51001,%s,,%s", bm5.f1.a(), 1));
        }
    }
}
