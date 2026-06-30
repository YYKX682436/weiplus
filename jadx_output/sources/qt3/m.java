package qt3;

/* loaded from: classes10.dex */
public class m implements ut3.d, ut3.b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f366649d;

    public m(android.content.Context context) {
    }

    @Override // ut3.b
    public void a(android.content.Context context, android.content.Intent intent) {
        boolean z17;
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "select %s for sending imagePath:%s", stringExtra, this.f366649d);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((stringExtra == null ? "" : stringExtra).split(","));
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, "", context.getResources().getString(com.tencent.mm.R.string.f492702hi3), true, false, null);
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_clear_c2c_tmp_file, true);
        for (int i17 = 0; i17 < P1.size(); i17++) {
            java.lang.String str = (java.lang.String) P1.get(i17);
            k70.i0 i0Var = new k70.i0();
            i0Var.f304642a = 4;
            java.lang.String str2 = this.f366649d;
            java.lang.String r17 = c01.z1.r();
            java.lang.String str3 = r17 == null ? "" : r17;
            if (str == null) {
                str = "";
            }
            r70.g gVar = new r70.g(str2, 0, str3, str, i0Var);
            gVar.f393108j = "media_generate_send_img";
            ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
            if (fj6) {
                z17 = true;
                if (i17 == P1.size() - 1) {
                    dw3.c0.f244182a.x(gVar.f393104f, this.f366649d);
                }
            } else {
                z17 = true;
            }
        }
        ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, stringExtra);
        if (Q != null) {
            Q.dismiss();
        }
        ((android.app.Activity) context).finish();
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        android.view.LayoutInflater.from(context);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        db5.g4 g4Var = new db5.g4(context);
        new db5.g4(context);
        qt3.h hVar = new qt3.h(this, context);
        qt3.l lVar = new qt3.l(this, context, captureDataManager$CaptureVideoNormalModel);
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(context);
        hVar.onCreateMMMenu(g4Var2);
        if (g4Var2.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f211872n = hVar;
            k0Var.f211881s = lVar;
            k0Var.f211854d = null;
            k0Var.G = null;
            k0Var.v();
        }
        db5.e1.a(context, null);
    }

    @Override // ut3.b
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        if (bundle != null) {
            java.lang.String string = bundle.getString("key_media_share_image_path");
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                return;
            }
            this.f366649d = string;
        }
    }

    @Override // ut3.b
    public void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putString("key_media_share_image_path", this.f366649d);
    }

    @Override // ut3.d
    public void r3(boolean z17, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo, android.os.Bundle bundle) {
    }
}
