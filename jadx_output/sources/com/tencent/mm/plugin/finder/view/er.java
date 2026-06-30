package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class er implements zy2.cc {

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.br f132052f = new com.tencent.mm.plugin.finder.view.br(null);

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f132053a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f132054b;

    /* renamed from: c, reason: collision with root package name */
    public final int f132055c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f132056d;

    /* renamed from: e, reason: collision with root package name */
    public final long f132057e;

    public er(android.content.Context context, java.lang.String str, int i17, boolean z17, long j17) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f132053a = context;
        this.f132054b = str;
        this.f132055c = i17;
        this.f132056d = z17;
        this.f132057e = j17;
    }

    public final java.lang.String b(int i17, long j17) {
        android.content.Intent intent;
        java.lang.String stringExtra;
        cl0.g gVar = new cl0.g();
        android.content.Context context = this.f132053a;
        com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
        if (mMActivity != null && (intent = mMActivity.getIntent()) != null && (stringExtra = intent.getStringExtra("key_extra_info")) != null) {
            try {
                com.tencent.mars.xlog.Log.i("LiveLogoAssistant", "getChnlExtra origin chnl_extra:".concat(stringExtra));
                gVar = new cl0.g(r26.i0.t(stringExtra, ";", ",", false));
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("LiveLogoAssistant", th6, "", new java.lang.Object[0]);
            }
        }
        try {
            java.lang.String a17 = so2.o2.f410517f.a().a(j17);
            if (a17.length() > 0) {
                gVar.h("feed_ad_report_info", a17);
            }
            gVar.o("icon_type", i17);
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.f(gVar2, "toString(...)");
            return gVar2;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("LiveLogoAssistant", e17, "", new java.lang.Object[0]);
            return "";
        }
    }

    public void c(boolean z17, boolean z18, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17) {
        r45.dm2 object_extend;
        r45.x31 x31Var;
        java.lang.String str = this.f132054b;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("LiveLogoAssistant", "[LiveLogoAssistant]click live icon but username is empty!");
            return;
        }
        android.content.Context context = this.f132053a;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        int i18 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).f135380n;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_enter_live_param_visitor_enter_scene", 5);
        int i19 = qs5.z.f366478a;
        intent.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 2);
        long j17 = this.f132057e;
        intent.putExtra("KEY_ENTER_LIVE_PARAM_FROM_OBJECT_ID", j17);
        intent.putExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", z18);
        java.lang.String b17 = b(i17, j17);
        intent.putExtra("key_chnl_extra", b17);
        com.tencent.mars.xlog.Log.i("LiveLogoAssistant", "set fromObjectId:" + pm0.v.u(j17) + ", chnlExtra:" + b17);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, "");
        wk0Var.set(1, "");
        wk0Var.set(2, java.lang.Boolean.valueOf(z17));
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        r45.y74 y74Var = new r45.y74();
        y74Var.set(1, java.lang.Integer.valueOf(i18));
        wk0Var.set(6, y74Var);
        r45.ta4 ta4Var = new r45.ta4();
        java.lang.String str2 = null;
        ta4Var.set(2, finderObject != null ? finderObject.getSessionBuffer() : null);
        if (finderObject != null && (object_extend = finderObject.getObject_extend()) != null && (x31Var = (r45.x31) object_extend.getCustom(7)) != null) {
            str2 = x31Var.getString(0);
        }
        ta4Var.set(3, str2);
        com.tencent.mars.xlog.Log.i("LiveLogoAssistant", "fromObjectId:" + pm0.v.u(j17) + ", jumperSessionBuffer:" + ta4Var.getString(2));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finderForwardSource:");
        sb6.append(ta4Var.getString(3));
        com.tencent.mars.xlog.Log.i("LiveLogoAssistant", sb6.toString());
        wk0Var.set(7, ta4Var);
        ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Di(this.f132053a, intent, this.f132054b, null, wk0Var, new com.tencent.mm.plugin.finder.view.cr(this, intent, i18, finderObject, b17));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0123, code lost:
    
        if (r3.equals("999") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014f, code lost:
    
        r1 = "25";
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0143, code lost:
    
        if (r3.equals("102") == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014c, code lost:
    
        if (r3.equals("101") == false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.lang.String r42, com.tencent.mm.protocal.protobuf.FinderObject r43, int r44, boolean r45, long r46, java.lang.String r48) {
        /*
            Method dump skipped, instructions count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.view.er.d(java.lang.String, com.tencent.mm.protocal.protobuf.FinderObject, int, boolean, long, java.lang.String):void");
    }

    public /* synthetic */ er(android.content.Context context, java.lang.String str, int i17, boolean z17, long j17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, str, i17, z17, (i18 & 16) != 0 ? 0L : j17);
    }
}
