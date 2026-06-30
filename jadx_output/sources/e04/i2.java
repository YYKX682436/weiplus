package e04;

/* loaded from: classes.dex */
public final class i2 implements q25.a {
    @Override // q25.a
    public boolean a(android.content.Context context, java.lang.String[] strArr, java.lang.String str) {
        java.lang.String str2;
        if (strArr != null && kotlin.jvm.internal.o.b("//scan", strArr[0]) && kotlin.jvm.internal.o.b("showDebug", strArr[1]) && strArr.length > 2) {
            com.tencent.mm.sdk.platformtools.o4.R("ScanDebug").putBoolean("scan_debug_show_debug_view", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], 0) == 1);
            return true;
        }
        if (strArr != null && kotlin.jvm.internal.o.b("//scan", strArr[0]) && kotlin.jvm.internal.o.b("clearSearch", strArr[1]) && strArr.length > 1) {
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(c01.z1.r() + "__image_gallery_search_preview_slot_mmkv_key__");
            if (M != null) {
                M.d();
            }
            return true;
        }
        if (strArr != null && kotlin.jvm.internal.o.b("//scan", strArr[0]) && kotlin.jvm.internal.o.b("clearConfig", strArr[1]) && strArr.length > 1) {
            com.tencent.mm.sdk.platformtools.o4 M2 = com.tencent.mm.sdk.platformtools.o4.M(c01.z1.r() + "_scan_config_mmkv");
            if (M2 != null) {
                M2.d();
            }
            return true;
        }
        if (strArr != null && kotlin.jvm.internal.o.b("//scan", strArr[0]) && kotlin.jvm.internal.o.b("loadLocalSo", strArr[1]) && strArr.length > 2) {
            com.tencent.mm.sdk.platformtools.o4.R("ScanDebug").putBoolean("loadSoFromSDCard", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], 0) == 1);
            db5.t7.makeText(context, ya.b.SUCCESS, 0).show();
            return true;
        }
        if (strArr != null && kotlin.jvm.internal.o.b("//scan", strArr[0]) && kotlin.jvm.internal.o.b("loadLocalConfig", strArr[1]) && strArr.length > 2) {
            com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("ScanDebug");
            if (kotlin.jvm.internal.o.b(strArr[2], "null")) {
                R.putString("debugFFEngineConfig", "");
                db5.t7.makeText(context, "cancel success", 0).show();
                return true;
            }
            if (com.tencent.mm.vfs.w6.j(strArr[2])) {
                R.putString("debugFFEngineConfig", com.tencent.mm.vfs.w6.M(strArr[2]));
                db5.t7.makeText(context, ya.b.SUCCESS, 0).show();
                return true;
            }
            db5.t7.makeText(context, "config file not exist", 0).show();
            R.getClass();
            return false;
        }
        if (strArr != null && kotlin.jvm.internal.o.b("//scan", strArr[0]) && kotlin.jvm.internal.o.b("skipFrame", strArr[1]) && strArr.length >= 2) {
            com.tencent.mm.sdk.platformtools.o4.R("ScanDebug").putInt("skipFrame", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], -1));
            db5.t7.makeText(context, ya.b.SUCCESS, 0).show();
            return true;
        }
        if (strArr != null && kotlin.jvm.internal.o.b("//scan", strArr[0]) && kotlin.jvm.internal.o.b("serverDetect", strArr[1]) && strArr.length >= 2) {
            com.tencent.mm.sdk.platformtools.o4.R("ScanDebug").putBoolean("serverDetect", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], 0) == 1);
            db5.t7.makeText(context, ya.b.SUCCESS, 0).show();
            return true;
        }
        if (strArr != null && kotlin.jvm.internal.o.b("//scan", strArr[0]) && kotlin.jvm.internal.o.b("localDetect", strArr[1]) && strArr.length >= 2) {
            com.tencent.mm.sdk.platformtools.o4.R("ScanDebug").putBoolean("localDetect", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], 1) == 1);
            db5.t7.makeText(context, ya.b.SUCCESS, 0).show();
            return true;
        }
        if (strArr != null && kotlin.jvm.internal.o.b("//scan", strArr[0]) && kotlin.jvm.internal.o.b("disableMerge", strArr[1]) && strArr.length >= 2) {
            com.tencent.mm.sdk.platformtools.o4.R("ScanDebug").putBoolean("disableMerge", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], 0) == 1);
            db5.t7.makeText(context, ya.b.SUCCESS, 0).show();
            return true;
        }
        if (strArr != null && kotlin.jvm.internal.o.b("//scan", strArr[0]) && kotlin.jvm.internal.o.b("xnet", strArr[1]) && strArr.length >= 2) {
            com.tencent.mm.sdk.platformtools.o4.R("ScanDebug").putBoolean("useXNet", com.tencent.mm.sdk.platformtools.t8.P(strArr[2], 0) == 1);
            db5.t7.makeText(context, ya.b.SUCCESS, 0).show();
            return true;
        }
        if (strArr == null || !kotlin.jvm.internal.o.b("//scan", strArr[0]) || strArr.length < 2 || !kotlin.jvm.internal.o.b("dump", strArr[1])) {
            return false;
        }
        zs5.j0 j0Var = zs5.j0.P;
        java.lang.String str3 = "扫码\n" + zs5.j0.P.c() + "\n\n图片识别\n" + zs5.j0.Q.c();
        if (context == null || (str2 = context.getString(com.tencent.mm.R.string.f490359sr)) == null) {
            str2 = "";
        }
        db5.e1.y(context, str3, "", str2, new e04.h2(context, str3));
        return true;
    }
}
