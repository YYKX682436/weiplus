package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class c0 extends k34.a implements k34.g {

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f182814d = "";

    @Override // k34.f
    public void c(android.content.Context context, android.content.Intent intent) {
        java.lang.String Ai = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.tencent.mm.sdk.platformtools.c2.l(intent, dm.i4.COL_ID));
        java.lang.String Ai2 = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.tencent.mm.sdk.platformtools.c2.l(intent, "ext_info"));
        java.lang.String l17 = com.tencent.mm.sdk.platformtools.c2.l(intent, "token");
        if (android.text.TextUtils.isEmpty(Ai) || android.text.TextUtils.isEmpty(Ai2) || android.text.TextUtils.isEmpty(l17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewShortcutEntry", "jump to webview  failed, username or appId or token is null or nil.");
            return;
        }
        if (!l17.equals(com.tencent.mm.plugin.webview.model.j0.d(Ai2, "" + gm0.j1.b().h()))) {
            android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences("app_brand_global_sp", 0);
            if (sharedPreferences == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewShortcutEntry", "jump to webview failed, sp is null.");
                return;
            }
            java.util.Set<java.lang.String> stringSet = sharedPreferences.getStringSet("uin_set", new java.util.HashSet());
            if (stringSet == null || stringSet.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.WebViewShortcutEntry", "jump to webview failed, uin set is null or nil.");
                return;
            }
            java.util.HashSet hashSet = new java.util.HashSet(stringSet);
            java.util.HashSet hashSet2 = new java.util.HashSet();
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                hashSet2.add(((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).wi(Ai2, (java.lang.String) it.next()));
            }
            if (!hashSet2.contains(l17)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.WebViewShortcutEntry", "jump to webview failed, illegal token(%s).", l17);
                dp.a.makeText(context, context.getString(com.tencent.mm.R.string.lay), 1).show();
                return;
            }
        }
        intent.putExtra("type", 0);
        intent.putExtra(dm.i4.COL_ID, "");
        java.lang.String str = "https://" + com.tencent.mm.sdk.platformtools.t9.a(com.tencent.mm.R.string.fxy) + "/cgi-bin/h5/static/gameloading/index.html?wegame_ssid=25&appid=" + Ai2;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f182814d)) {
            str = str + "&" + f182814d;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("rawUrl", str);
        intent2.putExtra("from_shortcut", true);
        intent2.putExtra("game_hv_menu_appid", Ai2);
        intent2.addFlags(67108864);
        intent2.addFlags(268435456);
        j45.l.j(context, "webview", ".ui.tools.game.H5GameWebViewUI", intent2, null);
        r01.q3.Ai().c(Ai, null);
        java.lang.String l18 = com.tencent.mm.sdk.platformtools.c2.l(intent, "digest");
        if (android.text.TextUtils.isEmpty(l18)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewShortcutEntry", "digest is null");
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(Ai, true);
        if (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(n17.f2())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewShortcutEntry", "no need update, displayName is null");
            return;
        }
        java.lang.String f27 = n17.f2();
        ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(Ai);
        if (n07 == null || com.tencent.mm.sdk.platformtools.t8.K0(n07.d())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewShortcutEntry", "no need update, imgFlag is null");
            return;
        }
        if (l18.equals(kk.k.g((f27 + n07.d()).getBytes()))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewShortcutEntry", "no need update, digest is same");
            return;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(Ai);
        if (a17 == null || a17.isRecycled()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewShortcutEntry", "icon is not downloaded, next time update");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewShortcutEntry", "update shortcut, displayName = %s", f27);
        java.lang.String Ai3 = ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).Ai(com.tencent.mm.sdk.platformtools.c2.l(intent, "ext_info_1"));
        if (context == null || com.tencent.mm.sdk.platformtools.t8.K0(Ai3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewShrotcutManager", "remove failed, invalid params");
        }
        android.content.Intent c17 = com.tencent.mm.plugin.webview.model.j0.c(context, Ai, Ai2, Ai3, null, false);
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebviewShrotcutManager", "remove failed, intent is null");
        } else {
            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
            xp1.c.i(context, c17);
        }
        com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.webview.model.b0(this, Ai, Ai2), 1000L);
    }
}
