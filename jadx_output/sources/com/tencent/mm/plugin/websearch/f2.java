package com.tencent.mm.plugin.websearch;

/* loaded from: classes8.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su4.j2 f181505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f181506e;

    public f2(com.tencent.mm.plugin.websearch.h2 h2Var, su4.j2 j2Var, android.content.Context context) {
        this.f181505d = j2Var;
        this.f181506e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.tencent.mm.plugin.websearch.l2.h(0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebSearch.StartWebSearchService", "fts h5 template not avail");
            return;
        }
        su4.j2 j2Var = this.f181505d;
        int i17 = j2Var.f412939b;
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        java.lang.String l17 = o13.n.l(i17);
        int i18 = j2Var.f412940c;
        j2Var.getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("ftsbizscene", i17);
        a17.putExtra("ftsType", i18);
        a17.putExtra("key_change_search_icon", true);
        a17.putExtra("key_search_icon_and_hint_fix_default", true);
        java.util.Map b17 = su4.r2.b(i17, false, i18);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        hashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, l17);
        hashMap.put("subSessionId", l17);
        a17.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, l17);
        a17.putExtra("subSessionId", l17);
        if (j2Var.D || j2Var.E) {
            org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
            try {
                jSONStringer.object();
                if (j2Var.E) {
                    jSONStringer.key("disableCommUseApp");
                    jSONStringer.value(true);
                }
                if (j2Var.D) {
                    jSONStringer.key("enableDarkBlueTheme");
                    jSONStringer.value(1L);
                }
                jSONStringer.endObject();
            } catch (org.json.JSONException e17) {
                com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.WebSearch.StartWebSearchService", "", e17);
            }
            hashMap.put("thirdExtParam", tg0.r2.a(i17) ? jSONStringer.toString() : fp.s0.a(jSONStringer.toString()));
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartWebSearchService", "thirdExtParam = " + jSONStringer.toString());
        }
        java.lang.String e18 = su4.r2.e(b17, 0);
        a17.putExtra("rawUrl", e18);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartWebSearchService", "startMiniSearchTabByTemplate , KRawUrl = " + e18);
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsneedkeyboard", j2Var.A);
        a17.putExtra("key_preload_biz", 4);
        a17.putExtra("ftsForceShowDarkMode", false);
        a17.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477804bx);
        a17.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.by);
        if (i17 == 42 && j62.e.g().c(new com.tencent.mm.repairer.config.search.RepairerConfigAppSearchNewStyle()) == 1) {
            a17.putExtra("key_back_and_clear_query", true);
        }
        boolean z17 = j2Var.D;
        android.content.Context context = this.f181506e;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.StartWebSearchService", "startMiniSearchTabByTemplate , KRawUrl = " + e18);
            j45.l.j(context, "webview", ".ui.tools.fts.FTSWeAppSearchWebViewUI", a17, null);
        } else {
            j45.l.z(context, a17, null);
        }
        if ((context instanceof android.app.Activity) && fp.h.b(16)) {
            ((android.app.Activity) context).overridePendingTransition(com.tencent.mm.R.anim.f477804bx, com.tencent.mm.R.anim.by);
        }
        su4.k2.a(i17, l17, l17, false, j2Var.f412941d, i18, "", false, "");
    }
}
