package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class o0 implements db5.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.ProductUI f159599a;

    public o0(com.tencent.mm.plugin.scanner.ui.ProductUI productUI) {
        this.f159599a = productUI;
    }

    @Override // db5.d1
    public void a(int i17, int i18) {
        com.tencent.mm.plugin.scanner.ui.ProductUI productUI = this.f159599a;
        e04.n3 n3Var = productUI.f159319q;
        if (n3Var == null) {
            return;
        }
        if (i18 == -1) {
            db5.e1.b(productUI.getContext(), productUI.getContext().getString(com.tencent.mm.R.string.f490369t2), null, null, productUI.getContext().getString(com.tencent.mm.R.string.f490367t0), new com.tencent.mm.plugin.scanner.ui.n0(this));
            return;
        }
        if (i18 == 0) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.d(11446, n3Var.field_productid, 2);
            if (productUI.f159324v == 3) {
                z30.y yVar = (z30.y) i95.n0.c(z30.y.class);
                long longExtra = productUI.getIntent().getLongExtra("key_favorite_local_id", -1L);
                ((y30.w) yVar).getClass();
                o72.v2.d(longExtra, 1, 0);
                g0Var.d(10651, 10, 0, 0);
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KContentObjDesc", productUI.f159319q.field_subtitle);
            intent.putExtra("Ksnsupload_title", productUI.f159319q.field_title);
            intent.putExtra("Ksnsupload_link", productUI.f159319q.field_shareurl);
            intent.putExtra("Ksnsupload_appname", e04.q3.b(productUI, productUI.f159319q.field_type));
            intent.putExtra("Ksnsupload_appid", com.tencent.mm.plugin.scanner.model.k0.a(productUI.f159319q.field_functionType));
            intent.putExtra("Ksnsupload_imgurl", productUI.f159319q.field_thumburl);
            com.tencent.mars.xlog.Log.i("MicroMsg.scanner.ProductUI", "product.field_thumburl : " + productUI.f159319q.field_thumburl);
            com.tencent.mm.plugin.scanner.ui.b1 b1Var = productUI.f159328z;
            if (b1Var != null) {
                intent.putExtra("KsnsUpload_imgPath", b1Var.k());
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "imgGetStrategy is null");
            }
            intent.putExtra("Ksnsupload_type", 3);
            intent.putExtra("KUploadProduct_UserData", e04.q3.a(productUI.f159319q));
            intent.putExtra("KUploadProduct_subType", productUI.f159319q.field_type);
            java.lang.String a17 = c01.n2.a("scan_product");
            c01.n2.d().c(a17, true).i("prePublishId", "scan_product");
            intent.putExtra("reportSessionId", a17);
            j45.l.j(productUI, "sns", ".ui.SnsUploadUI", intent, null);
            return;
        }
        if (i18 == 1) {
            com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var2.d(11446, n3Var.field_productid, 1);
            java.lang.String c17 = com.tencent.mm.plugin.scanner.model.k0.c(productUI.getContext(), productUI.f159319q);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("Retr_Msg_content", c17);
            intent2.putExtra("Retr_Msg_Type", 2);
            com.tencent.mm.plugin.scanner.ui.b1 b1Var2 = productUI.f159328z;
            if (b1Var2 != null) {
                intent2.putExtra("Retr_Msg_thumb_path", b1Var2.k());
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "imgGetStrategy is null");
            }
            intent2.putExtra("Retr_go_to_chattingUI", false);
            intent2.putExtra("Retr_show_success_tips", true);
            ((com.tencent.mm.app.y7) com.tencent.mm.plugin.scanner.i1.a()).v(intent2, productUI);
            if (productUI.f159324v == 3) {
                g0Var2.d(10651, 10, 1, 0);
                return;
            }
            return;
        }
        if (i18 != 2) {
            if (i18 != 3) {
                if (i18 != 4) {
                    return;
                }
                android.content.Intent intent3 = new android.content.Intent();
                intent3.putExtra("rawUrl", productUI.f159319q.field_exposeurl);
                j45.l.j(productUI.getContext(), "webview", ".ui.tools.WebViewUI", intent3, null);
                return;
            }
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("key_fav_scene", 2);
            intent4.putExtra("key_fav_item_id", productUI.getIntent().getLongExtra("key_favorite_local_id", -1L));
            z30.u uVar = (z30.u) i95.n0.c(z30.u.class);
            androidx.appcompat.app.AppCompatActivity context = productUI.getContext();
            ((y30.q) uVar).getClass();
            o72.x1.L0(context, ".ui.FavTagEditUI", intent4, null);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11446, n3Var.field_productid, 3);
        if (productUI.f159319q == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.scanner.ProductUI", "do favorite, but product is null");
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        r45.aq0 aq0Var = new r45.aq0();
        jq0Var.e(c01.z1.r());
        jq0Var.j(c01.z1.r());
        jq0Var.g(8);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.b(com.tencent.mm.plugin.scanner.model.k0.a(productUI.f159319q.field_functionType));
        aq0Var.g(productUI.f159319q.field_title);
        aq0Var.d(productUI.f159319q.field_subtitle);
        aq0Var.i(productUI.f159319q.field_type);
        aq0Var.e(e04.q3.a(productUI.f159319q));
        aq0Var.f(productUI.f159319q.field_thumburl);
        e04.n3 n3Var2 = productUI.f159319q;
        java.lang.String str = n3Var2.field_title;
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6318d = str;
        c4Var.f6319e = n3Var2.field_subtitle;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 10;
        bq0Var.o(jq0Var);
        bq0Var.n(aq0Var);
        c4Var.f6327m = 11;
        c4Var.f6323i = productUI;
        doFavoriteEvent.e();
    }
}
