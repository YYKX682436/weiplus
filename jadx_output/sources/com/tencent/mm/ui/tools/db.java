package com.tencent.mm.ui.tools;

/* loaded from: classes4.dex */
public class db implements zb0.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210358a;

    public db(com.tencent.mm.ui.tools.ShowImageUI showImageUI) {
        this.f210358a = showImageUI;
    }

    @Override // zb0.a0
    public void a(java.lang.String str, java.lang.String str2) {
        java.lang.String i17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        boolean z18 = true;
        java.lang.String str3 = null;
        try {
            if (com.tencent.mm.vfs.w6.j(str) && com.tencent.mm.vfs.w6.k(str) > 0 && (i17 = com.tencent.mm.vfs.w6.i(str, true)) != null) {
                androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(i17);
                if (exifInterface.hasAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL)) {
                    java.lang.String attribute = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_DATETIME_ORIGINAL);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(attribute)) {
                        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy:MM:dd HH:mm:ss", java.util.Locale.getDefault());
                        java.text.SimpleDateFormat simpleDateFormat2 = new java.text.SimpleDateFormat("yyyy年MM月dd日 HH:mm", java.util.Locale.getDefault());
                        try {
                            java.util.Date parse = simpleDateFormat.parse(attribute);
                            if (parse != null) {
                                attribute = simpleDateFormat2.format(parse);
                            }
                        } catch (java.text.ParseException unused) {
                        }
                        str3 = attribute;
                    }
                }
            }
        } catch (java.io.IOException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Util", e17, "exitExifTimeInfo error", new java.lang.Object[0]);
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str3);
        com.tencent.mm.ui.tools.ShowImageUI showImageUI = this.f210358a;
        if (K0) {
            db5.t7.i(showImageUI.getContext(), showImageUI.getContext().getString(com.tencent.mm.R.string.ncn), com.tencent.mm.R.raw.icons_filled_done);
            return;
        }
        if (!showImageUI.f210204t) {
            db5.t7.i(showImageUI.getContext(), showImageUI.getContext().getString(com.tencent.mm.R.string.ncn), com.tencent.mm.R.raw.icons_filled_done);
            return;
        }
        androidx.appcompat.app.AppCompatActivity context = showImageUI.getContext();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = showImageUI.getContext().getString(com.tencent.mm.R.string.ncn);
        aVar.f211729s = showImageUI.getContext().getString(com.tencent.mm.R.string.nm9, str3);
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.f490766ap0);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
        java.lang.String stringExtra = showImageUI.getIntent().getStringExtra("key_conv_session_id");
        if (!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            c01.n2.d().c("key_file_img_export_config", true).i("key_file_time_save_alert_last_sessionid", stringExtra);
            z18 = false;
        }
        showImageUI.f210204t = z18;
    }

    @Override // zb0.a0
    public void b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.ui.tools.ShowImageUI showImageUI = this.f210358a;
        com.tencent.mm.platformtools.ExportFileUtil.m(showImageUI.getContext(), showImageUI.getContext().getString(com.tencent.mm.R.string.i87));
    }
}
