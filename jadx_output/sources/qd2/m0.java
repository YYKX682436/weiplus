package qd2;

/* loaded from: classes.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f361797d;

    public m0(qd2.g1 g1Var) {
        this.f361797d = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qd2.g1 g1Var = this.f361797d;
        g1Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderOriginalDeclareHelpUrl");
        if (d17 == null) {
            d17 = "https://support.weixin.qq.com/cgi-bin/mmsupportacctnodeweb-bin/pages/Vc24Lkjri1oIRvRM#1-6-%E5%8E%9F%E5%88%9B%E4%BF%9D%E6%8A%A4";
        }
        com.tencent.mars.xlog.Log.i("FinderConfig", "FINDER_ORIGINAL_DECLARE_HELP_URL info = ".concat(d17));
        intent.putExtra("rawUrl", d17);
        j45.l.j(g1Var.f361747a, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/helper/FinderOriginSheetHelper$initNoticeView$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
