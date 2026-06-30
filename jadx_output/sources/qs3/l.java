package qs3;

/* loaded from: classes4.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.radar.ui.RadarMemberView f366358d;

    public l(com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView) {
        this.f366358d = radarMemberView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean l17 = j62.e.g().l("clicfg_lbs_expose_config_switch_android", false, false, true);
        com.tencent.mm.plugin.radar.ui.RadarMemberView radarMemberView = this.f366358d;
        if (l17) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            bundle.putString("query", "{\"scene\":38}");
            android.os.Bundle bundle2 = new android.os.Bundle();
            com.tencent.mm.storage.z3 z3Var = radarMemberView.f154986u;
            bundle2.putString("k_username", z3Var != null ? z3Var.d1() : null);
            bundle.putBundle(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, bundle2);
            int i17 = com.tencent.mm.plugin.radar.ui.RadarMemberView.B;
            com.tencent.mars.xlog.Log.i("MicroMsg.RadarMemberView", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
            ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(radarMemberView.getContext(), bundle, true, false, new qs3.k(radarMemberView));
        } else {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.storage.z3 z3Var2 = radarMemberView.f154986u;
            intent.putExtra("k_username", z3Var2 != null ? z3Var2.d1() : null);
            intent.putExtra("showShare", false);
            java.lang.String KExposeH5Url = com.tencent.mm.ui.n2.f209398a;
            kotlin.jvm.internal.o.f(KExposeH5Url, "KExposeH5Url");
            java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{38}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            intent.putExtra("rawUrl", format);
            j45.l.j(radarMemberView.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
