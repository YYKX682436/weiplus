package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes12.dex */
public class l6 {

    /* renamed from: g, reason: collision with root package name */
    public static android.app.ProgressDialog f182385g;

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f182386a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.e0 f182387b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f182388c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f182389d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f182390e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.jsapi.g6 f182391f;

    public static void a(android.content.Context context, com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem webViewJSSDKFileItem, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, boolean z17, com.tencent.mm.plugin.webview.luggage.jsapi.f6 f6Var) {
        long j17;
        long v37;
        com.tencent.mm.plugin.webview.luggage.jsapi.y5 y5Var = new com.tencent.mm.plugin.webview.luggage.jsapi.y5(str2, f6Var);
        int i27 = !webViewJSSDKFileItem.f182748t ? 1 : 0;
        com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.l0 Di = m11.b1.Di();
        java.lang.String str3 = webViewJSSDKFileItem.f182738g;
        Di.getClass();
        k70.h0 h0Var = new k70.h0();
        h0Var.f304625a = null;
        h0Var.f304626b = "";
        h0Var.f304627c = str3;
        h0Var.f304629e = i27;
        h0Var.f304630f = 0;
        h0Var.f304631g = 0;
        h0Var.f304632h = pString;
        h0Var.f304633i = pInt;
        h0Var.f304634j = pInt2;
        h0Var.f304635k = "";
        h0Var.f304636l = "";
        h0Var.f304637m = -1L;
        h0Var.f304638n = false;
        h0Var.f304639o = 0;
        if (i27 == 0) {
            m11.b0 d17 = Di.d1(h0Var, true, -1L);
            if (d17 != null) {
                h0Var.f304632h.value = d17.f322639g;
                if (com.tencent.mm.vfs.w6.j(h0Var.f304628d)) {
                    java.lang.String Bi = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).Bi(d17.f322637e);
                    com.tencent.mm.vfs.w6.c(h0Var.f304628d, ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).bj(h0Var.f304625a, bm5.f0.f22567o, Bi, "", "", true, true));
                    d17.s(Bi);
                }
                v37 = h0Var.f304638n ? Di.v3(h0Var.f304626b, dm.i4.COL_ID, d17) : Di.t3(h0Var.f304626b, dm.i4.COL_ID, d17);
                if (v37 != -1) {
                    Di.doNotify();
                }
                ((pc0.u1) ((qc0.z0) i95.n0.c(qc0.z0.class))).Ai(h0Var.f304627c);
                j17 = v37;
            }
            j17 = -1;
        } else {
            if (i27 == 1) {
                m11.b0 d18 = Di.d1(h0Var, true, -1L);
                if (d18 != null) {
                    k70.h0 h0Var2 = new k70.h0();
                    h0Var2.f304626b = h0Var.f304626b;
                    h0Var2.f304627c = h0Var.f304627c;
                    h0Var2.f304628d = h0Var.f304628d;
                    h0Var2.f304630f = h0Var.f304630f;
                    h0Var2.f304631g = h0Var.f304631g;
                    com.tencent.mm.pointers.PString pString2 = h0Var.f304632h;
                    h0Var2.f304632h = pString2;
                    h0Var2.f304633i = h0Var.f304633i;
                    h0Var2.f304634j = h0Var.f304634j;
                    h0Var2.f304635k = h0Var.f304635k;
                    h0Var2.f304636l = h0Var.f304636l;
                    h0Var2.f304637m = h0Var.f304637m;
                    h0Var2.f304638n = h0Var.f304638n;
                    h0Var2.f304639o = h0Var.f304639o;
                    h0Var2.f304640p = h0Var.f304640p;
                    h0Var2.f304641q = h0Var.f304641q;
                    h0Var2.f304629e = 0;
                    pString2.value = d18.f322639g;
                    d18.w(0L);
                    d18.x(0L);
                    d18.F((int) com.tencent.mm.vfs.w6.k(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(h0Var.f304625a, bm5.f0.f22562g, d18.f322637e, "", "")));
                    m11.b0 d19 = Di.d1(h0Var2, false, -1L);
                    if (d19 != null) {
                        d19.m(d18.f322637e);
                        d19.E(d18.f322639g);
                        d19.v(d18.f322638f);
                        d19.F(0);
                        long F = Di.f322746p.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
                        d19.r(Di.t3(h0Var.f304626b, dm.i4.COL_ID, d18));
                        v37 = h0Var.f304638n ? Di.v3(h0Var.f304626b, dm.i4.COL_ID, d19) : Di.t3(h0Var.f304626b, dm.i4.COL_ID, d19);
                        if (F > 0) {
                            gm0.j1.u().f273153f.w(java.lang.Long.valueOf(F));
                        }
                        if (v37 != -1) {
                            Di.doNotify();
                        }
                        ((pc0.u1) ((qc0.z0) i95.n0.c(qc0.z0.class))).Ai(h0Var.f304627c);
                        j17 = v37;
                    }
                }
                j17 = -1;
            }
            j17 = 0;
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        m11.b0 C1 = m11.b1.Di().C1(java.lang.Long.valueOf(j17));
        java.lang.String str4 = webViewJSSDKFileItem.f182738g;
        java.lang.String aj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(null, bm5.c0.f22550a.d(C1.l()), C1.f322637e, "", "");
        webViewJSSDKFileItem.f182738g = aj6;
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadMediaFileHelp", "Image Inserted: %s", aj6);
        boolean c17 = com.tencent.mm.plugin.webview.modeltools.z.bj().c(str, str2, i17, i18, i19, y5Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadMediaFileHelp", "add cdn upload task result : %b", java.lang.Boolean.valueOf(c17));
        webViewJSSDKFileItem.f182738g = str4;
        if (!c17) {
            f6Var.a(false, "", "");
        } else if (z17) {
            f182385g = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.lbc), true, true, new com.tencent.mm.plugin.webview.luggage.jsapi.z5(y5Var, str2, f6Var));
        }
    }

    public static void b(android.content.Context context, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, boolean z17, com.tencent.mm.plugin.webview.luggage.jsapi.f6 f6Var) {
        com.tencent.mm.plugin.webview.luggage.jsapi.a6 a6Var = new com.tencent.mm.plugin.webview.luggage.jsapi.a6(str2, f6Var);
        boolean c17 = com.tencent.mm.plugin.webview.modeltools.z.bj().c(str, str2, i17, i18, i19, a6Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.UploadMediaFileHelp", "add cdn upload task result : %b", java.lang.Boolean.valueOf(c17));
        if (!c17) {
            f6Var.a(false, "", "");
        } else if (z17) {
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.lbc), true, true, new com.tencent.mm.plugin.webview.luggage.jsapi.b6(a6Var, str2, f6Var));
            f182385g = Q;
            Q.setOnKeyListener(new com.tencent.mm.plugin.webview.luggage.jsapi.e6(context));
        }
    }

    public final void c() {
        if (this.f182390e) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("local_id", this.f182389d);
            bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, this.f182388c);
            bundle.putBoolean("show_progress_tips", this.f182390e);
            sw4.g.a(this.f182386a, bundle, com.tencent.mm.plugin.webview.luggage.jsapi.i6.class, new com.tencent.mm.plugin.webview.luggage.jsapi.w5(this));
            return;
        }
        com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$UploadMediaFileTask luggageUploadMediaFileManager$UploadMediaFileTask = new com.tencent.mm.plugin.webview.luggage.jsapi.LuggageUploadMediaFileManager$UploadMediaFileTask();
        luggageUploadMediaFileManager$UploadMediaFileTask.f182243g = this.f182389d;
        luggageUploadMediaFileManager$UploadMediaFileTask.f182244h = this.f182388c;
        luggageUploadMediaFileManager$UploadMediaFileTask.f182248o = new com.tencent.mm.plugin.webview.luggage.jsapi.x5(this, luggageUploadMediaFileManager$UploadMediaFileTask);
        luggageUploadMediaFileManager$UploadMediaFileTask.d();
    }

    public final void d() {
        if (this.f182387b.f182186t != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("close_window_confirm_dialog_switch", true);
            bundle.putString("close_window_confirm_dialog_title_cn", this.f182386a.getString(com.tencent.mm.R.string.l6l));
            bundle.putString("close_window_confirm_dialog_title_eng", this.f182386a.getString(com.tencent.mm.R.string.l6l));
            bundle.putString("close_window_confirm_dialog_ok_cn", this.f182386a.getString(com.tencent.mm.R.string.l6i));
            bundle.putString("close_window_confirm_dialog_ok_eng", this.f182386a.getString(com.tencent.mm.R.string.l6i));
            bundle.putString("close_window_confirm_dialog_cancel_cn", this.f182386a.getString(com.tencent.mm.R.string.l6j));
            bundle.putString("close_window_confirm_dialog_cancel_eng", this.f182386a.getString(com.tencent.mm.R.string.l6j));
            this.f182387b.f182186t.setCloseWindowConfirmInfo(bundle);
        }
        c();
    }
}
