package com.tencent.mm.plugin.music.ui;

/* loaded from: classes11.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.music.ui.j f150762d;

    public k(com.tencent.mm.plugin.music.ui.j jVar) {
        this.f150762d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/music/ui/MusicBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.music.ui.j jVar = this.f150762d;
        boolean z17 = jVar.f150756r;
        java.lang.ref.WeakReference weakReference = jVar.f402842g;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MusicBanner", "enterTingPlayer from MusicBanner");
            qk.g9 g9Var = (qk.g9) i95.n0.c(qk.g9.class);
            if (g9Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MusicBanner", "enterTingPlayer tingService is null");
            } else {
                ql4.a aVar = ql4.a.f364586a;
                b66.h hVar = b66.i.f18167d;
                b66.g gVar = (b66.g) urgen.ur_2BA9.UR_882D.UR_16B0();
                if (gVar != null) {
                    wl4.w.f447104a.a(((b66.i) gVar).getAppId(), null).a();
                }
                jm4.i4 Zi = ((rk4.z8) g9Var).Zi();
                if (Zi != null) {
                    ((jm4.k4) Zi).d(bw5.yq0.TingReportAction_ClickWeixinHomeMusicBanner, bw5.ar0.TingScene_WeixinHomeMusicBanner, aVar.a(), null, null);
                }
            }
            yj0.a.h(this, "com/tencent/mm/plugin/music/ui/MusicBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        b21.r b17 = b21.m.b();
        if (b17 != null && b17.G && !android.text.TextUtils.isEmpty(b17.H)) {
            java.lang.String str3 = b17.H;
            com.tencent.mars.xlog.Log.i("MusicBanner", "barBackToWebView is true, start to jump Url:%s", str3);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str3);
            j45.l.j((android.content.Context) weakReference.get(), "webview", ".ui.tools.WebViewUI", intent, null);
        } else {
            if (b17 == null) {
                yj0.a.h(this, "com/tencent/mm/plugin/music/ui/MusicBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            android.content.Intent intent2 = new android.content.Intent();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11992, 1);
            intent2.putExtra("key_scene", 1);
            if (b17.T) {
                str = "mv";
                str2 = ".ui.MusicMvMainUI";
            } else {
                str = "music";
                str2 = ".ui.MusicMainUI";
            }
            j45.l.j((android.content.Context) weakReference.get(), str, str2, intent2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/music/ui/MusicBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
