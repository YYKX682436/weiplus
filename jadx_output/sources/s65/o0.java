package s65;

/* loaded from: classes11.dex */
public abstract class o0 {
    public static java.lang.String a() {
        return ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "update_config_prefs", 4)).getString("update_downloaded_pack_md5_key", null);
    }

    public static java.lang.String[] b() {
        java.lang.String string = ((com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "update_config_prefs", 4)).getString("update_downloaded_ignored_pack", null);
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            return null;
        }
        return string.split(":");
    }

    public static void c() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "update_config_prefs", 4);
        o4Var.getClass();
        o4Var.putLong("update_downloading_in_silence", java.lang.System.currentTimeMillis()).putBoolean("update_download_start_one_immediate", false).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdateUtil", "putDowningInSilence");
    }

    public static void d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, java.lang.String str4) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "update_config_prefs", 4);
        o4Var.getClass();
        o4Var.putString("update_downloaded_pack_md5_key", str).putString("update_downloaded_pack_sig_key", str2).putString("update_downloaded_pack_desc_key", str3).putInt("update_downloaded_pack_size_key", i17).putInt("update_downloaded_pack_download_mode", i18).putInt("update_downloaded_pack_update_type", i19).putString("update_download_not_auto_download_range", str4).commit();
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdateUtil", "summerupdate putDownloadedPackInfo md5: %s size: %s range: %s", str, java.lang.Integer.valueOf(i17), str4);
    }

    public static void e() {
        java.lang.StringBuffer stringBuffer;
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "update_config_prefs", 4);
        int i17 = o4Var.getInt("update_downloaded_cancel_times", 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdateUtil", "putIgnoreDownloadedPack times %s", java.lang.Integer.valueOf(i17));
        if (i17 < 2) {
            o4Var.putLong("update_downloaded_cancel_ts", java.lang.System.currentTimeMillis()).putInt("update_downloaded_cancel_times", i17 + 1).commit();
            return;
        }
        java.lang.String a17 = a();
        if (com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
            stringBuffer = null;
        } else {
            java.lang.String[] b17 = b();
            stringBuffer = new java.lang.StringBuffer();
            stringBuffer.append(a17);
            if (b17 != null) {
                for (java.lang.String str : b17) {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        stringBuffer.append(":");
                        stringBuffer.append(str);
                    }
                }
            }
        }
        o4Var.clear();
        if (stringBuffer != null) {
            o4Var.putString("update_downloaded_ignored_pack", stringBuffer.toString()).commit();
        }
    }

    public static void f() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = (com.tencent.mm.sdk.platformtools.o4) com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences.b(com.tencent.mm.sdk.platformtools.x2.f193071a, "update_config_prefs", 4);
        o4Var.getClass();
        o4Var.remove("update_downloading_in_silence");
        com.tencent.mars.xlog.Log.i("MicroMsg.UpdateUtil", "removeUnfinishDownloadingInSilence");
    }

    public static void g(android.content.Context context, int i17, int i18) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
        intent.putExtra("intent_extra_is_silence_stat", true);
        intent.putExtra("intent_extra_opcode", i17);
        if (i17 == 2) {
            intent.putExtra("intent_extra_install_dialog_times", i18);
        }
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        context.sendBroadcast(intent, com.tencent.mm.sdk.platformtools.v9.a());
    }

    public static void h(android.content.Context context, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_UPDATE");
        intent.putExtra("intent_extra_is_silence_stat", false);
        intent.putExtra("intent_extra_opcode", i17);
        intent.setPackage(com.tencent.mm.sdk.platformtools.x2.f193072b);
        context.sendBroadcast(intent, com.tencent.mm.sdk.platformtools.v9.a());
    }
}
