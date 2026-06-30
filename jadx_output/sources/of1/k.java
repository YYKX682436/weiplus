package of1;

/* loaded from: classes7.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344949d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344950e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ of1.m f344951f;

    public k(of1.m mVar, java.lang.String str, java.lang.String str2) {
        this.f344951f = mVar;
        this.f344949d = str;
        this.f344950e = str2;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLViewScanHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        of1.m mVar = this.f344951f;
        com.tencent.mm.ui.tools.s6 s6Var = mVar.f344964h;
        if (s6Var != null && s6Var.f210721e.i()) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = mVar.f344964h.f210721e;
            if (k0Var.i()) {
                k0Var.u();
            }
        }
        long j17 = mVar.f344965i;
        java.lang.String url = mVar.b();
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(23040, java.lang.Long.valueOf(j17), 1, 1, 5, url);
        java.lang.String b17 = mVar.b();
        int i17 = mVar.f344968o;
        int i18 = mVar.f344969p;
        com.tencent.mm.plugin.appbrand.jsapi.webview.o oVar = mVar.f344880d;
        java.lang.String str = this.f344949d;
        if (str != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(mVar.a(), com.tencent.mm.plugin.webview.stub.WebviewScanImageActivity.class);
            intent.putExtra("key_string_for_scan", str);
            intent.putExtra("key_string_for_url", b17);
            intent.putExtra("key_string_for_image_url", this.f344950e);
            intent.putExtra("key_codetype_for_scan", i17);
            intent.putExtra("key_codeversion_for_scan", i18);
            if (mVar.f344970q != null) {
                java.lang.String Ri = ((jd0.d2) ((kd0.s2) i95.n0.c(kd0.s2.class))).Ri(java.lang.String.valueOf(java.lang.System.currentTimeMillis()));
                com.tencent.mm.vfs.w6.R(Ri, mVar.f344970q);
                intent.putExtra("key_file_path_for_scan", Ri);
                intent.putExtra("key_delete_file_after_deal", true);
                mVar.f344970q = null;
            }
            if (oVar != null) {
                of1.w1 w1Var = (of1.w1) oVar;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(w1Var.getAppId())) {
                    intent.putExtra("key_string_for_wxapp_id", w1Var.getAppId());
                }
            }
            if (oVar != null) {
                intent.putExtra("key_int_for_wxapp_open_scene", ((of1.w1) oVar).getEnterScene());
            }
            intent.putExtra("geta8key_scene", 44);
            if (oVar != null) {
                of1.w1 w1Var2 = (of1.w1) oVar;
                if (w1Var2.m533getPageView() != null) {
                    intent.putExtra("wxappPathWithQuery", w1Var2.m533getPageView().Y1());
                }
            }
            android.content.Context a17 = mVar.a();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(a17, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLViewScanHelper", "reqDealQBarResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            a17.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(a17, "com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLViewScanHelper", "reqDealQBarResult", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        ((et.s) ((ft.f4) i95.n0.c(ft.f4.class))).wi(((of1.w1) oVar).m533getPageView(), true, mVar.f344968o, mVar.f344966m, true, true, mVar.b());
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/jsapi/webview/bwc/HTMLViewScanHelper$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
