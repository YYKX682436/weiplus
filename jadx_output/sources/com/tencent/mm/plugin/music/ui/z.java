package com.tencent.mm.plugin.music.ui;

/* loaded from: classes10.dex */
public class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.MusicMainUI f150856d;

    public z(com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI) {
        this.f150856d = musicMainUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/MusicMainUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.music.ui.MusicMainUI.I;
        com.tencent.mm.plugin.music.ui.MusicMainUI musicMainUI = this.f150856d;
        musicMainUI.getClass();
        b21.r j17 = kl3.t.g().j();
        if (j17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicMainUI", "doJumpToApp wrapper is null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "doJumpToApp MusicType:%d, SongWebUrl:%s, AppId:%s, srcUsername:%s", java.lang.Integer.valueOf(j17.f17345d), j17.f17354p, j17.f17358t, j17.I);
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str = j17.f17358t;
            ((kt.c) i0Var).getClass();
            com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
            if (h17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "packageName:%s", h17.field_packageName);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicMainUI", "appInfo is null");
            }
            musicMainUI.f150718w = true;
            if (j17.f17345d == 11) {
                com.tencent.mm.autogen.events.FetchAppBrandInfoForMusicEvent fetchAppBrandInfoForMusicEvent = new com.tencent.mm.autogen.events.FetchAppBrandInfoForMusicEvent();
                fetchAppBrandInfoForMusicEvent.e();
                am.ja jaVar = fetchAppBrandInfoForMusicEvent.f54253g;
                java.lang.String str2 = jaVar.f7018a;
                java.lang.String str3 = jaVar.f7020c;
                java.lang.String str4 = jaVar.f7019b;
                int i18 = jaVar.f7021d;
                if (android.text.TextUtils.isEmpty(str3)) {
                    str3 = "";
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "from app brand, appId:%s, brandName:%s, pkgType:%d, appUserName:%s", str2, str3, java.lang.Integer.valueOf(i18), str4);
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "launch app brand Application");
                ll3.j2.g(str2, str4, i18);
            } else if (android.text.TextUtils.isEmpty(j17.f17358t) || !j17.f17358t.equals("wx485a97c844086dc9")) {
                if (!android.text.TextUtils.isEmpty(j17.f17358t) && h17 != null && !android.text.TextUtils.isEmpty(h17.field_packageName)) {
                    lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                    java.lang.String str5 = j17.f17358t;
                    ((kt.c) i0Var2).getClass();
                    if (com.tencent.mm.pluginsdk.model.app.w.r(musicMainUI, str5)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "launch third party app, package name:%s", h17.field_packageName);
                        android.content.Intent launchIntentForPackage = com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().getLaunchIntentForPackage(h17.field_packageName);
                        if (launchIntentForPackage != null) {
                            launchIntentForPackage.addFlags(268435456);
                            lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
                            java.lang.String str6 = h17.field_appName;
                            com.tencent.mm.plugin.music.ui.w wVar = new com.tencent.mm.plugin.music.ui.w(musicMainUI);
                            ((kt.c) i0Var3).getClass();
                            com.tencent.mm.pluginsdk.model.app.w.v(musicMainUI, launchIntentForPackage, str6, wVar, null);
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicMainUI", "launchApp fail intent is null");
                        }
                    }
                }
                if (android.text.TextUtils.isEmpty(j17.I)) {
                    java.lang.String str7 = j17.f17354p;
                    if (str7 == null) {
                        str7 = j17.f17352n;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "launch H5 url:%s", str7);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("rawUrl", str7);
                    j45.l.j(musicMainUI, "webview", ".ui.tools.WebViewUI", intent, null);
                } else {
                    java.lang.String str8 = j17.f17354p;
                    if (str8 == null) {
                        str8 = j17.f17352n;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "launch biz H5 url:%s", str8);
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("rawUrl", str8);
                    j45.l.j(musicMainUI, "webview", ".ui.tools.WebViewUI", intent2, null);
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Music.MusicMainUI", "launch qq music Application");
                musicMainUI.T6(256, j17, ll3.j2.b(j17, musicMainUI));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/music/ui/MusicMainUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
