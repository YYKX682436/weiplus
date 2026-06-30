package tn3;

/* loaded from: classes8.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    public final java.lang.String a() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (b(context)) {
            return "";
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_voice_input_wetype_guide_config_new, "{}", true);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Zi) || com.tencent.mm.sdk.platformtools.t8.D0("{}", Zi)) {
            return "";
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(Zi).getJSONObject(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
            kotlin.jvm.internal.o.f(jSONObject, "getJSONObject(...)");
            java.lang.String str = "simplified_chinese";
            if (!com.tencent.mm.sdk.platformtools.m2.m()) {
                if (com.tencent.mm.sdk.platformtools.m2.n()) {
                    str = "traditional_chinese";
                } else if (!com.tencent.mm.sdk.platformtools.m2.j()) {
                    str = "english";
                }
            }
            java.lang.String string = jSONObject.getString(str);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            return !com.tencent.mm.sdk.platformtools.t8.K0(string) ? string : "";
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewTips.NewTipsIdVoiceInputWetypeFilter", "getVoiceToTextAfterSendText, fail, reason:${e.message}");
            return "";
        }
    }

    public final boolean b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.o.f(packageManager, "getPackageManager(...)");
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN", (android.net.Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage("com.tencent.wetype");
        return packageManager.resolveActivity(intent, 0) != null;
    }

    public final boolean c() {
        java.util.List<android.view.inputmethod.InputMethodInfo> enabledInputMethodList;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager == null || (enabledInputMethodList = inputMethodManager.getEnabledInputMethodList()) == null) {
            return false;
        }
        for (android.view.inputmethod.InputMethodInfo inputMethodInfo : enabledInputMethodList) {
            if (kotlin.jvm.internal.o.b(inputMethodInfo.getId(), "com.tencent.wetype/.plugin.hld.WxHldService") || kotlin.jvm.internal.o.b(inputMethodInfo.getId(), "com.tencent.wetype/com.tencent.wetype.plugin.hld.WxHldService")) {
                return true;
            }
        }
        return false;
    }
}
