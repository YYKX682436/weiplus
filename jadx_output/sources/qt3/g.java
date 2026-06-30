package qt3;

/* loaded from: classes10.dex */
public class g implements ut3.d, ut3.b {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f366641d;

    public g(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f366641d = "";
    }

    @Override // ut3.b
    public void a(android.content.Context context, android.content.Intent intent) {
        boolean z17;
        if (context == null || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
        com.tencent.mars.xlog.Log.i("MicroMsg.MMRecordUI", "select %s for sending imagePath:%s", stringExtra, this.f366641d);
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        int i17 = 0;
        java.util.ArrayList P1 = com.tencent.mm.sdk.platformtools.t8.P1((java.lang.String[]) r26.n0.f0(stringExtra == null ? "" : stringExtra, new java.lang.String[]{","}, false, 0, 6, null).toArray(new java.lang.String[0]));
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, "", context.getResources().getString(com.tencent.mm.R.string.f492702hi3), true, false, null);
        java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_clear_c2c_tmp_file, true);
        kotlin.jvm.internal.o.d(P1);
        java.util.Iterator it = P1.iterator();
        while (true) {
            if (!it.hasNext()) {
                ((dk5.s5) tg3.t1.a()).Ui(stringExtra2, stringExtra);
                if (Q != null) {
                    Q.dismiss();
                }
                android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.lang.String str = (java.lang.String) next;
            k70.i0 i0Var = new k70.i0();
            i0Var.f304642a = 4;
            java.lang.String str2 = this.f366641d;
            java.lang.String r17 = c01.z1.r();
            if (r17 == null) {
                r17 = "";
            }
            r70.g gVar = new r70.g(str2, 0, r17, str == null ? "" : str, i0Var);
            gVar.f393108j = "media_generate_send_img";
            ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
            if (fj6) {
                z17 = true;
                if (i17 == P1.size() - 1) {
                    dw3.c0.f244182a.x(gVar.f393104f, this.f366641d);
                }
            } else {
                z17 = true;
            }
            i17 = i18;
        }
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel, android.os.Bundle bundle) {
        if (context == null || captureDataManager$CaptureVideoNormalModel == null) {
            return;
        }
        android.view.LayoutInflater.from(context);
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        db5.g4 g4Var = new db5.g4(context);
        new db5.g4(context);
        qt3.c cVar = new qt3.c(context);
        qt3.d dVar = new qt3.d(this, context, captureDataManager$CaptureVideoNormalModel, bundle);
        g4Var.clear();
        db5.g4 g4Var2 = new db5.g4(context);
        cVar.onCreateMMMenu(g4Var2);
        if (g4Var2.z()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSubMenuHelper", "show, menu empty");
        } else {
            k0Var.f211872n = cVar;
            k0Var.f211881s = dVar;
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
            if (string == null) {
                string = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                return;
            }
            this.f366641d = string;
        }
    }

    @Override // ut3.b
    public void onSaveInstanceState(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle.putString("key_media_share_image_path", this.f366641d);
        }
    }

    @Override // ut3.d
    public void r3(boolean z17, com.tencent.mm.plugin.recordvideo.jumper.RecordMediaReportInfo recordMediaReportInfo, android.os.Bundle bundle) {
    }
}
