package pc4;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final pc4.d f353410a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f353411b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f353412c;

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f353413d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f353414e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f353415f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f353416g;

    /* renamed from: h, reason: collision with root package name */
    public static boolean f353417h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f353418i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f353419j;

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f353420k;

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f353421l;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.Integer f353422m;

    /* renamed from: n, reason: collision with root package name */
    public static java.lang.Boolean f353423n;

    /* renamed from: o, reason: collision with root package name */
    public static r45.ga6 f353424o;

    /* renamed from: p, reason: collision with root package name */
    public static final boolean f353425p;

    static {
        pc4.d dVar = new pc4.d();
        f353410a = dVar;
        f353411b = c01.z1.r();
        f353412c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_redownload_fix, false);
        f353413d = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_biz_tail, true);
        f353414e = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_use_avatar_crop, false);
        f353415f = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_comment_is_support_ime_emoji, true);
        f353420k = jz5.h.b(pc4.b.f353408d);
        f353421l = jz5.h.b(pc4.c.f353409d);
        try {
            dVar.G();
            dVar.g();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Improve.SnsConfig", e17, "init sns config error:", new java.lang.Object[0]);
        }
        f353422m = 0;
        pc4.d dVar2 = f353410a;
        dVar2.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableUseFlutterGroupWithLastGroup", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = j62.e.g().c(new com.tencent.mm.plugin.sns.config.RCSnsVisibilitySettingUseFlutterSwitch()) == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableUseFlutterGroupWithLastGroup", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        f353425p = z17 || dVar2.n();
    }

    public static boolean e(pc4.d dVar, boolean z17, int i17, java.lang.Object obj) {
        boolean z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableHDRPlay$default", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        dVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableHDRPlay", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCheckHlgSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            boolean booleanValue = ((java.lang.Boolean) ((jz5.n) f353420k).getValue()).booleanValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCheckHlgSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            if (booleanValue) {
                z18 = f353419j;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSupportHdr", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                boolean booleanValue2 = ((java.lang.Boolean) ((jz5.n) f353421l).getValue()).booleanValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSupportHdr", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                boolean z19 = !booleanValue2 && z18 && dVar.c();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableHDRPlay", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableHDRPlay$default", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                return z19;
            }
        }
        z18 = f353418i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSupportHdr", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean booleanValue22 = ((java.lang.Boolean) ((jz5.n) f353421l).getValue()).booleanValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSupportHdr", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (booleanValue22) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableHDRPlay", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableHDRPlay$default", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z19;
    }

    public final boolean A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsPostPicWithAigcData", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_pic_post_with_aigc_data, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsPostPicWithAigcData", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean B() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsPublishUseMultiPicWidget", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = true;
        if (!pc4.e.f353426a.a() && j62.e.g().c(new com.tencent.mm.plugin.sns.config.RCSnsImagePublishUseMultiPicWidget()) != 1) {
            z17 = false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsPublishUseMultiPicWidget", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean C() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsTimelineShareToBizBtnEnable", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        wa4.l lVar = wa4.l.f444255a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPoiPostBizExpt", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        boolean z17 = wa4.l.f444256b || wa4.l.f444257c != -1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPoiPostBizExpt", "com.tencent.mm.plugin.sns.snstimeline.SnsBizPostManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsTimelineShareToBizBtnEnable", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isTimelineExpandNewStyleEnable", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = j62.e.g().c(new com.tencent.mm.plugin.sns.config.RCSnsTimelineExpandNewStyle()) > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "isTimelineExpandNewStyleEnable >> " + z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isTimelineExpandNewStyleEnable", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isUseStableFinderShareBtn", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = false;
        if (C()) {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_timeline_share_to_finder_stablize, false)) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isUseStableFinderShareBtn", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean F() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isWsVersion3Open", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_WS_VERSION_INT_SYNC, -1);
        if (r17 > 0) {
            z17 = r17 == 3;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWsVersion3Open", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return z17;
        }
        u();
        z17 = u() == 3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isWsVersion3Open", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final void G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        f353411b = c01.z1.r();
        f353412c = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_redownload_fix, false);
        f353416g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_try_fix_loadmore_bug, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "enableSnsImageUrlExpAppend:" + h() + " tryFixLoadMoreBug:" + f353416g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refresh", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
    }

    public final void H(r45.cu5 cu5Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWsBuffer", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (cu5Var == null || cu5Var.f371839d <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Improve.SnsConfig", "setWsBuffer null buffer");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWsBuffer", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "setWsBuffer length:" + cu5Var.f371839d);
        com.tencent.mm.sdk.platformtools.o4.J("sns_config", gm0.j1.b().h(), 1).H("KVWsBufferKey", cu5Var.toByteArray());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWsBuffer", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
    }

    public final void I(r45.ga6 ga6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateServerConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (ga6Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateServerConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return;
        }
        f353424o = ga6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "updateServerConfig:" + ga6Var.toJSON() + " value:" + com.tencent.mm.sdk.platformtools.o4.J("sns_config", gm0.j1.b().h(), 1).H("SnsServerConfig", ga6Var.toByteArray()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateServerConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
    }

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableBizCardStyle", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_biz_card_style, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableBizCardStyle", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean b(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableDescTextSelection", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (z17) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_ad_desc_text_selection, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableDescTextSelection", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return fj6;
        }
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_desc_text_selection, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableDescTextSelection", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj7;
    }

    public final boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlexibleVideo", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlexibleVideoViewConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.tencent.mm.plugin.sns.config.RCSnsFlexibleVideo rCSnsFlexibleVideo = new com.tencent.mm.plugin.sns.config.RCSnsFlexibleVideo();
        int h17 = bm5.o1.f22719a.h(rCSnsFlexibleVideo);
        boolean z17 = false;
        int nj6 = h17 != 2 ? h17 != 3 ? ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(rCSnsFlexibleVideo) : 0 : 1;
        java.lang.Integer num = f353422m;
        if (num == null || nj6 != num.intValue()) {
            f353422m = java.lang.Integer.valueOf(nj6);
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "checkConfigEnableFlexibleVideoView:" + nj6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlexibleVideoViewConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (nj6 == 1) {
            z17 = f353417h;
        } else if (nj6 == 2 ? !(!f353417h || !f353419j) : !(nj6 != 3 || !f353417h || !f353419j || !f353418i)) {
            z17 = true;
        }
        if (!kotlin.jvm.internal.o.b(f353423n, java.lang.Boolean.valueOf(z17))) {
            f353423n = java.lang.Boolean.valueOf(z17);
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "enableFlexibleVideo:" + z17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlexibleVideo", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean d(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlexibleWithHdrCheck", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        kotlin.jvm.internal.o.g(timeLineObject, "timeLineObject");
        java.util.List a17 = qa4.f.a(timeLineObject);
        boolean z17 = false;
        if (c() && e(this, false, 1, null) && (!a17.isEmpty())) {
            ka4.n nVar = ka4.n.f306147a;
            r45.jj4 media = (r45.jj4) kz5.n0.X(a17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isHDRMedia", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            kotlin.jvm.internal.o.g(media, "media");
            boolean z18 = nVar.b(media) >= 4;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isHDRMedia", "com.tencent.mm.plugin.sns.model.config.SnsVideoDownloadStrategy");
            if (z18) {
                z17 = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlexibleWithHdrCheck", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableLocalThumbSizeChange", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_image_thumb_size_change, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableLocalThumbSizeChange", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableOpenGLExtSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = false;
        android.opengl.EGLDisplay eglGetDisplay = android.opengl.EGL14.eglGetDisplay(0);
        if (kotlin.jvm.internal.o.b(eglGetDisplay, android.opengl.EGL14.EGL_NO_DISPLAY)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Improve.SnsConfig", "eglGetDisplay EGL_NO_DISPLAY");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableOpenGLExtSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return false;
        }
        int[] iArr = new int[2];
        if (!android.opengl.EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Improve.SnsConfig", "eglInitialize failed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableOpenGLExtSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return false;
        }
        java.lang.String eglQueryString = android.opengl.EGL14.eglQueryString(eglGetDisplay, 12373);
        kotlin.jvm.internal.o.d(eglQueryString);
        f353418i = r26.n0.B(eglQueryString, "EGL_EXT_gl_colorspace_bt2020_pq", false);
        f353419j = r26.n0.B(eglQueryString, "EGL_EXT_gl_colorspace_bt2020_hlg", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "supportPQExt:" + f353418i + " supportHlgExt:" + f353419j);
        int[] iArr2 = new int[1];
        if (!android.opengl.EGL14.eglChooseConfig(eglGetDisplay, new int[]{12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12344}, 0, null, 0, 0, iArr2, 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Improve.SnsConfig", "eglChooseConfig error");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableOpenGLExtSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "eglChooseConfig result:" + iArr2[0]);
        if (!android.opengl.EGL14.eglTerminate(eglGetDisplay)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Improve.SnsConfig", "eglTerminate error");
        }
        f353417h = iArr2[0] > 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "supportColor10Bit:" + f353417h);
        if (f353418i && f353419j && f353417h) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableOpenGLExtSupport", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableSnsImageUrlExpAppend", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = false;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_image_url_exp_append, false);
        r45.ga6 p17 = p();
        int i17 = p17 != null ? p17.f375059u : 0;
        if (fj6 && i17 == 0) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSnsImageUrlExpAppend", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableSnsMultiSpecUpload", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = false;
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_image_publish_definition_enable, false);
        r45.ga6 p17 = p();
        int i17 = p17 != null ? p17.f375059u : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "enableSnsMultiSpecUpload:" + fj6);
        if (fj6 && i17 == 0) {
            z17 = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableSnsMultiSpecUpload", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableToReportSnsPostMediaMetaData", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_media_metadata_report_android, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableToReportSnsPostMediaMetaData", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEnableReDownload", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = f353412c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEnableReDownload", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEnableSnsAvatarCrop", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEnableSnsAvatarCrop", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return f353414e;
    }

    public final boolean m() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEnableUseFlutterGroup", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEnableUseFlutterGroup", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return f353425p;
    }

    public final int n(android.content.Context context) {
        int f17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRVOffsetAbs", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        kotlin.jvm.internal.o.g(context, "context");
        if (y()) {
            f17 = i65.a.f(context, com.tencent.mm.R.dimen.aqc);
        } else {
            f17 = i65.a.f(context, com.tencent.mm.R.dimen.aax);
        }
        int abs = java.lang.Math.abs(f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActionBottomPoistion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int h17 = i65.a.h(context, com.tencent.mm.R.dimen.f479623ay) + com.tencent.mm.ui.bl.h(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActionBottomPoistion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int i17 = h17 + abs;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRVOffsetAbs", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return i17;
    }

    public final java.lang.String o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelfUserName", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        java.lang.String str = f353411b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelfUserName", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return str;
    }

    public final r45.ga6 p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getServerConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (f353424o == null) {
            byte[] j17 = com.tencent.mm.sdk.platformtools.o4.J("sns_config", gm0.j1.b().h(), 1).j("SnsServerConfig");
            if (j17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getServerConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
                return null;
            }
            r45.ga6 ga6Var = new r45.ga6();
            ga6Var.parseFrom(j17);
            f353424o = ga6Var;
        }
        r45.ga6 ga6Var2 = f353424o;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getServerConfig", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return ga6Var2;
    }

    public final int q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsCommentFoldThreshold", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_comment_fold_line_threshold_t4_1, 5);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "getSnsCommentFoldThreshold xConfig >> " + Ni);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsCommentFoldThreshold", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return Ni;
    }

    public final int r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsImageLoadImageType", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        r45.ga6 p17 = p();
        if ((p17 != null ? p17.f375059u : 0) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "getSnsImageLoadImageType hardcode big by server");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsImageLoadImageType", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return 0;
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_load_type, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "getSnsImageLoadImageType:" + Ni);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsImageLoadImageType", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return Ni;
    }

    public final int s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsUploadImageSizeLimit", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_image_size_limit, 1920);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "getSnsUploadImageSizeLimit:" + Ni);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsUploadImageSizeLimit", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return Ni;
    }

    public final r45.cu5 t() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWsBuffer", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        byte[] j17 = com.tencent.mm.sdk.platformtools.o4.J("sns_config", gm0.j1.b().h(), 1).j("KVWsBufferKey");
        r45.cu5 cu5Var = new r45.cu5();
        if (j17 != null) {
            if (true ^ (j17.length == 0)) {
                try {
                    cu5Var.b(j17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Improve.SnsConfig", e17, "getWsBuffer parse error", new java.lang.Object[0]);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWsBuffer", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return cu5Var;
    }

    public final int u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWsVersion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (com.tencent.mm.sdk.platformtools.o4.J("sns_config", gm0.j1.b().h(), 1).o("KVWsVersionKey", 2) == 3) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWsVersion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return 3;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWsVersion", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return 2;
    }

    public final boolean v(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("is5minVideoOpen", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_PUBLISH_VIDEO_DURATION_INT_SYNC, 0) == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "is5minVideoOpen true with local config");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("is5minVideoOpen", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return true;
        }
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("is5minVideoOpen", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return false;
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_5min_video_enable, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "is5minVideoOpen:" + fj6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("is5minVideoOpen", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isEnableExpandableVideoSeekBar", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = false;
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_VIDEO_PLAYER_OPT_INT_SYNC, 0);
        if (r17 == 1) {
            z17 = true;
        } else if (r17 != 2) {
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_use_expandable_video_seek_bar, false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableExpandableVideoSeekBar", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
            return fj6;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isEnableExpandableVideoSeekBar", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }

    public final boolean x() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsCardStyleOptimization", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_card_style_optimization, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "isSnsCardStyleOptimization:" + fj6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsCardStyleOptimization", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsCoverBlurOptimizationEnable", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_cover_blur_optimization, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "sns_cover_blur_optimization:" + fj6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsCoverBlurOptimizationEnable", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSnsOperateButtonSVG", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_operate_button_svg, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "isSnsOperateButtonSVG:" + fj6);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSnsOperateButtonSVG", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return fj6;
    }

    public final boolean n() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableUseFlutterGroupWithComplexVisibility", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        boolean z17 = j62.e.g().c(new com.tencent.mm.plugin.sns.config.RCSnsVisibilitySettingUseFlutterComplexSwitch()) == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableUseFlutterGroupWithComplexVisibility", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        return z17;
    }
}
