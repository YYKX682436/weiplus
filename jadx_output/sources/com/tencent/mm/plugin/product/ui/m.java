package com.tencent.mm.plugin.product.ui;

/* loaded from: classes12.dex */
public class m implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.product.ui.n f153314a;

    public m(com.tencent.mm.plugin.product.ui.n nVar) {
        this.f153314a = nVar;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.tencent.mm.plugin.product.ui.n nVar = this.f153314a;
        if (i17 == 0) {
            com.tencent.mm.plugin.product.ui.MallGalleryUI mallGalleryUI = nVar.f153317d;
            mallGalleryUI.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Retr_Msg_content", "");
            intent.putExtra("Retr_Msg_Type", 0);
            if (com.tencent.mm.sdk.platformtools.t8.K0(mallGalleryUI.T6())) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MallGalleryUI", "url is null or nil");
                return;
            }
            intent.putExtra("Retr_File_Name", mallGalleryUI.T6());
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            j45.l.u(mallGalleryUI, ".ui.transmit.MsgRetransmitUI", intent, null);
            return;
        }
        if (i17 == 1) {
            com.tencent.mm.plugin.product.ui.MallGalleryUI mallGalleryUI2 = nVar.f153317d;
            java.lang.String T6 = mallGalleryUI2.T6();
            if (com.tencent.mm.sdk.platformtools.t8.K0(T6)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MallGalleryUI", "save error.");
                return;
            } else {
                ((ub0.r) ((vb0.o) i95.n0.c(vb0.o.class))).getClass();
                com.tencent.mm.pluginsdk.ui.tools.l7.a(T6, mallGalleryUI2, null);
                return;
            }
        }
        if (i17 != 2) {
            return;
        }
        com.tencent.mm.plugin.product.ui.MallGalleryUI mallGalleryUI3 = nVar.f153317d;
        java.lang.String T62 = mallGalleryUI3.T6();
        if (com.tencent.mm.sdk.platformtools.t8.K0(T62)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MallGalleryUI", "file path invalid");
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(T62);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (K0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.GetFavDataSource", "fill favorite event fail, event is null or image path is empty");
            c4Var.f6326l = com.tencent.mm.R.string.cac;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.GetFavDataSource", "do fill event info(fav simple image), path %s sourceType %d", T62, 9);
            r45.bq0 bq0Var = new r45.bq0();
            r45.jq0 jq0Var = new r45.jq0();
            r45.gp0 gp0Var = new r45.gp0();
            gp0Var.h0(2);
            gp0Var.A0(T62);
            gp0Var.e0(kk.k.g((gp0Var.toString() + 2 + java.lang.System.currentTimeMillis()).getBytes()));
            com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
            am.z9 z9Var = favoriteOperationEvent.f54243g;
            z9Var.f8528a = 27;
            z9Var.f8533f = gp0Var;
            favoriteOperationEvent.e();
            java.lang.String str = favoriteOperationEvent.f54244h.f6137d;
            com.tencent.mm.sdk.platformtools.x.x(T62, 150, 150, android.graphics.Bitmap.CompressFormat.JPEG, 90, str, true);
            gp0Var.B0(str);
            jq0Var.e(c01.z1.r());
            jq0Var.j(c01.z1.r());
            jq0Var.g(9);
            jq0Var.c(java.lang.System.currentTimeMillis());
            bq0Var.o(jq0Var);
            bq0Var.f370964f.add(gp0Var);
            c4Var.f6318d = gp0Var.f375404d;
            c4Var.f6315a = bq0Var;
            c4Var.f6317c = 2;
        }
        c4Var.f6327m = 4;
        c4Var.f6323i = mallGalleryUI3;
        doFavoriteEvent.e();
    }
}
