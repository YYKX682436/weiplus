package com.tencent.mm.plugin.luckymoney.model;

/* loaded from: classes9.dex */
public abstract class e5 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f145262a = lp0.b.e() + "luckymoneynewyear/";

    public static boolean a() {
        java.lang.String e17 = e();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "checkPAGAnimResource: %s", e17);
        if (!com.tencent.mm.vfs.w6.j(e17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "targetPath is not exist");
            return false;
        }
        com.tencent.mm.vfs.r6[] G = new com.tencent.mm.vfs.r6(e17).G();
        if (G == null || G.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "targetPath empty: %s", e17);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "targetPath has size : %s", java.lang.Integer.valueOf(G.length));
        return true;
    }

    public static void b(java.lang.String str, java.lang.String str2) {
        int startSNSDownload;
        java.lang.String str3 = com.tencent.mm.plugin.luckymoney.model.d4.f145227d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "downnloadPAGAnimResource fileId：%s aesKey:%s", str, str2);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            startSNSDownload = -1;
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 26);
            com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
            java.lang.String str4 = f145262a + "pagResource.zip";
            c2CDownloadRequest.url = str;
            c2CDownloadRequest.fileKey = str;
            c2CDownloadRequest.bizid = 3;
            c2CDownloadRequest.apptype = 266;
            c2CDownloadRequest.fileType = 20303;
            c2CDownloadRequest.setSavePath(str4);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            c2CDownloadRequest.taskStartTime = currentTimeMillis;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyEnvelopeResUpdateListener", "pag resource download beginTime: %s", java.lang.Long.valueOf(currentTimeMillis));
            startSNSDownload = ((com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getManager(com.tencent.mars.cdn.CdnManager.class)).startSNSDownload(c2CDownloadRequest, null, new com.tencent.mm.plugin.luckymoney.model.c4(currentTimeMillis, str, str4, str2), 0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "downloadRet:%s", java.lang.Integer.valueOf(startSNSDownload));
        com.tencent.mm.autogen.events.WxPayLuckMoneyNewYearDownloadPAGResultEvent wxPayLuckMoneyNewYearDownloadPAGResultEvent = new com.tencent.mm.autogen.events.WxPayLuckMoneyNewYearDownloadPAGResultEvent();
        wxPayLuckMoneyNewYearDownloadPAGResultEvent.f54996g.f8341a = startSNSDownload == 0;
        wxPayLuckMoneyNewYearDownloadPAGResultEvent.e();
        if (startSNSDownload == 0) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 27);
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(991, 28);
        }
    }

    public static boolean c(java.lang.String str, java.lang.String str2, com.tencent.mm.modelcdntran.q0 q0Var) {
        dn.m mVar = new dn.m();
        mVar.field_mediaId = "VoiceData" + str2;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f145262a + "voice/");
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        mVar.field_fullpath = sb7;
        mVar.field_fileType = 15;
        mVar.field_aesKey = str2;
        mVar.field_fileId = str;
        mVar.field_chattype = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "downloadVoiceFile %s %s %s", mVar.field_mediaId, sb7, str2);
        return ((rx.f) ((sx.b0) i95.n0.c(sx.b0.class))).Ri(mVar, new java.lang.ref.WeakReference(q0Var)) != null;
    }

    public static java.lang.String d(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = f145262a + "pagResource/" + str + str2 + ".pag";
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "getPAGAnimResource :%s", str3);
        if (com.tencent.mm.vfs.w6.j(str3)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "getPAGAnimResource succ");
            return str3;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "getPAGAnimResource fail");
        return "";
    }

    public static java.lang.String e() {
        return f145262a + "pagResource";
    }

    public static java.lang.String f() {
        java.lang.String str = c01.z1.r() + "_" + java.lang.System.currentTimeMillis();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(f145262a + "voice/");
        sb6.append(str);
        sb6.append(".amr");
        return sb6.toString();
    }

    public static void g(android.view.View view, android.view.animation.Animation.AnimationListener animationListener) {
        android.view.animation.ScaleAnimation scaleAnimation = new android.view.animation.ScaleAnimation(0.0f, 0.96f, 0.0f, 0.96f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(300L);
        scaleAnimation.setInterpolator(new android.view.animation.OvershootInterpolator(1.0f));
        scaleAnimation.setFillAfter(true);
        android.view.animation.ScaleAnimation scaleAnimation2 = new android.view.animation.ScaleAnimation(0.96f, 1.0f, 0.96f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(100L);
        scaleAnimation2.setFillAfter(true);
        scaleAnimation.setAnimationListener(new com.tencent.mm.plugin.luckymoney.model.d5(view, scaleAnimation2));
        if (animationListener != null) {
            scaleAnimation2.setAnimationListener(animationListener);
        }
        if (view != null) {
            view.startAnimation(scaleAnimation);
        }
    }

    public static java.lang.String h(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str));
        java.lang.String r17 = r6Var.n().r();
        if (!r17.endsWith("/")) {
            r17 = r17.concat("/");
        }
        if (!com.tencent.mm.vfs.w6.P(r17, r6Var.n().getName(), str2)) {
            return "";
        }
        return r17 + str2;
    }

    public static boolean i(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "saveFiletoLocal");
        if (com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "fileExists exist, first delete file ：%s", str2);
            com.tencent.mm.vfs.w6.g(str2, true);
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(e());
        java.lang.String str3 = a17.f213279f;
        if (str3 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            m17.f213266a.r(m17.f213267b);
        }
        int Q = com.tencent.mm.vfs.w6.Q(str, e());
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "unzip ret: %s", java.lang.Integer.valueOf(Q));
        p();
        com.tencent.mm.vfs.w6.h(str);
        com.tencent.mm.autogen.events.WxPayLuckMoneyNewYearDownloadPAGResultEvent wxPayLuckMoneyNewYearDownloadPAGResultEvent = new com.tencent.mm.autogen.events.WxPayLuckMoneyNewYearDownloadPAGResultEvent();
        wxPayLuckMoneyNewYearDownloadPAGResultEvent.f54996g.f8342b = Q == 0;
        wxPayLuckMoneyNewYearDownloadPAGResultEvent.e();
        return Q == 0;
    }

    public static void j(android.view.View view, int i17) {
        if (i17 == 4) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.luckymoney.model.z4(view));
            view.startAnimation(alphaAnimation);
            return;
        }
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(300L);
        alphaAnimation2.setAnimationListener(new com.tencent.mm.plugin.luckymoney.model.a5(view));
        view.startAnimation(alphaAnimation2);
    }

    public static void k(android.view.View view, int i17) {
        l(view, i17, 250);
    }

    public static void l(android.view.View view, int i17, int i18) {
        if (i17 == 0) {
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(i18);
            alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.luckymoney.model.b5(view, i17));
            view.startAnimation(alphaAnimation);
            return;
        }
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(i18);
        alphaAnimation2.setAnimationListener(new com.tencent.mm.plugin.luckymoney.model.c5(view, i17));
        view.startAnimation(alphaAnimation2);
    }

    public static void m(java.lang.String str, java.lang.String str2, com.tencent.mm.view.MMPAGView mMPAGView, com.tencent.mm.view.MMPAGView mMPAGView2, ym5.w1 w1Var, ym5.w1 w1Var2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "startPAGAnim ：%s ", str);
        boolean z17 = true;
        if (str.equals("loop")) {
            mMPAGView.i(w1Var);
            mMPAGView.a(w1Var2);
            mMPAGView.setRepeatCount(0);
        } else {
            mMPAGView.i(w1Var2);
            mMPAGView.a(w1Var);
            mMPAGView.setRepeatCount(1);
            if (mMPAGView2 != null) {
                o(mMPAGView2, w1Var, w1Var2);
                mMPAGView.postDelayed(new com.tencent.mm.plugin.luckymoney.model.w4(mMPAGView, str2), 200L);
                z17 = false;
            } else {
                android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(500L);
                mMPAGView.startAnimation(alphaAnimation);
                alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.luckymoney.model.x4());
            }
        }
        if (z17) {
            mMPAGView.setPath(str2);
            mMPAGView.n();
            mMPAGView.d();
            mMPAGView.g();
            mMPAGView.setVisibility(0);
        }
    }

    public static void n(android.widget.ImageView imageView) {
        android.graphics.drawable.AnimationDrawable animationDrawable;
        if (imageView == null || !(imageView.getDrawable() instanceof android.graphics.drawable.AnimationDrawable) || (animationDrawable = (android.graphics.drawable.AnimationDrawable) imageView.getDrawable()) == null) {
            return;
        }
        animationDrawable.stop();
        animationDrawable.selectDrawable(0);
    }

    public static void o(com.tencent.mm.view.MMPAGView mMPAGView, ym5.w1 w1Var, ym5.w1 w1Var2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "stopPAGAnim");
        mMPAGView.i(w1Var);
        mMPAGView.i(w1Var2);
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(500L);
        mMPAGView.startAnimation(alphaAnimation);
        alphaAnimation.setAnimationListener(new com.tencent.mm.plugin.luckymoney.model.y4(mMPAGView));
    }

    public static void p() {
        java.lang.String str = e() + "/WXfzysc.ttf.zip";
        if (!com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuckyMoneyNewYearLogic", "%s not exist", str);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "%s exist, need to unzip", str);
        int Q = com.tencent.mm.vfs.w6.Q(str, e());
        if (Q == 0) {
            com.tencent.mm.vfs.w6.g(str, false);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyNewYearLogic", "unzip font ret: %s", java.lang.Integer.valueOf(Q));
    }
}
