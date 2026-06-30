package xu4;

/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final xu4.n f457297a = new xu4.n();

    public final boolean a(xu4.m mVar) {
        if (mVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.WebSearch.WxImeEmojiSearchHelper", "checkIfNeeShowTips: textGuide == null ");
            return false;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").getBoolean("mmkv_key_scene_emoji_search_config_has_click", false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getEmojiSearchTips: hasClick(");
        sb6.append(z17);
        sb6.append(',');
        int i17 = mVar.f457296e;
        sb6.append((i17 & 1) == 1);
        sb6.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WxImeEmojiSearchHelper", sb6.toString());
        if (z17) {
            if ((i17 & 1) == 1) {
                return false;
            }
        }
        long c17 = c01.id.c() - com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").getLong("mmkv_key_scene_emoji_search_config_insert_last_timestamp", 0L);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("getEmojiSearchTips: interval(");
        sb7.append(c17);
        sb7.append(',');
        int i18 = mVar.f457293b;
        sb7.append(i18);
        sb7.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WxImeEmojiSearchHelper", sb7.toString());
        if (c17 < i18 * 3600000) {
            return false;
        }
        long j17 = com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").getLong("mmkv_key_scene_emoji_search_config_insert_count", 0L);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("getEmojiSearchTips: maxCount(");
        sb8.append(j17);
        sb8.append(", ");
        int i19 = mVar.f457294c;
        sb8.append(i19);
        sb8.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WxImeEmojiSearchHelper", sb8.toString());
        if (j17 >= i19) {
            return false;
        }
        if (com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").getLong("mmkv_key_scene_emoji_search_config_start_timestamp", 0L) == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WxImeEmojiSearchHelper", "fixStartTime!!!");
            com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").putLong("mmkv_key_scene_emoji_search_config_start_timestamp", c01.id.c());
        }
        long j18 = com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").getLong("mmkv_key_scene_emoji_search_config_start_timestamp", c01.id.c());
        long c18 = c01.id.c() - j18;
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("getEmojiSearchTips: curAliveTime(");
        sb9.append(j18);
        sb9.append(", ");
        sb9.append(c18);
        sb9.append(", ");
        int i27 = mVar.f457295d;
        sb9.append(i27);
        sb9.append(')');
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WxImeEmojiSearchHelper", sb9.toString());
        return c18 < ((long) i27) * 3600000;
    }

    public final xu4.m b() {
        java.lang.String str;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.o.f(packageManager, "getPackageManager(...)");
        android.content.Intent intent = new android.content.Intent("android.intent.action.MAIN", (android.net.Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage("com.tencent.wetype");
        android.content.pm.ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ifInstallWeType: ");
        sb6.append(resolveActivity != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WxImeEmojiSearchHelper", sb6.toString());
        if (resolveActivity != null) {
            return null;
        }
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.c0.clicfg_emoji_search_wetype_guide_config, "{}", true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi) && !com.tencent.mm.sdk.platformtools.t8.D0("{}", Zi)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
                long j17 = jSONObject.getLong("unique_id");
                if (j17 != com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").getLong("mmkv_key_scene_emoji_search_text_config_unique_id", 0L)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WxImeEmojiSearchHelper", "getEmojiSearchTips: uniqueId != curUniqueId");
                    com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").putLong("mmkv_key_scene_emoji_search_text_config_unique_id", j17);
                    com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").putBoolean("mmkv_key_scene_emoji_search_config_has_click", false);
                    com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").putLong("mmkv_key_scene_emoji_search_config_insert_last_timestamp", 0L);
                    com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").putLong("mmkv_key_scene_emoji_search_config_insert_count", 0L);
                    com.tencent.mm.sdk.platformtools.o4.M("mmkv_wetype_scene_emoji_search").putLong("mmkv_key_scene_emoji_search_config_start_timestamp", c01.id.c());
                }
                int optInt = jSONObject.optInt("interval", 0);
                int optInt2 = jSONObject.optInt("max_time", Integer.MAX_VALUE);
                int optInt3 = jSONObject.optInt("total_alive_time", Integer.MAX_VALUE);
                int optInt4 = jSONObject.optInt("exit_condition_mask", 0);
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT);
                java.lang.String str2 = "simplified_chinese";
                if (!com.tencent.mm.sdk.platformtools.m2.m()) {
                    if (com.tencent.mm.sdk.platformtools.m2.n()) {
                        str2 = "traditional_chinese";
                    } else if (!com.tencent.mm.sdk.platformtools.m2.j()) {
                        str2 = "english";
                    }
                }
                java.lang.String string = jSONObject2.getString(str2);
                if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                    str = "";
                } else {
                    kotlin.jvm.internal.o.d(string);
                    str = string;
                }
                xu4.m mVar = new xu4.m(str, optInt, optInt2, optInt3, optInt4);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WxImeEmojiSearchHelper", "getEmojiSearchTips:" + mVar);
                if (a(mVar)) {
                    return mVar;
                }
                return null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.WxImeEmojiSearchHelper", "getEmojiSearchTips, fail, reason:" + e17.getMessage());
            }
        }
        return null;
    }

    public final boolean c() {
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        android.util.Pair c17 = rn3.i.Di().c(new vn3.c(50));
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.WxImeEmojiSearchHelper", "isShowRedDot: true " + ((com.tencent.mm.plugin.newtips.model.r) c17.first) + ' ' + ((r45.pm6) c17.second));
        return c17.first == com.tencent.mm.plugin.newtips.model.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null;
    }
}
