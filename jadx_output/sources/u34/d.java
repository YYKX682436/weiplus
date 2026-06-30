package u34;

/* loaded from: classes4.dex */
public final class d implements t34.a {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f424409a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f424410b;

    /* renamed from: c, reason: collision with root package name */
    public s34.t f424411c;

    /* renamed from: d, reason: collision with root package name */
    public android.animation.Animator.AnimatorListener f424412d;

    /* renamed from: e, reason: collision with root package name */
    public int f424413e;

    /* renamed from: h, reason: collision with root package name */
    public int f424416h;

    /* renamed from: i, reason: collision with root package name */
    public long f424417i;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f424414f = "";

    /* renamed from: g, reason: collision with root package name */
    public final u34.a f424415g = new u34.a(this);

    /* renamed from: j, reason: collision with root package name */
    public int f424418j = Integer.MAX_VALUE;

    /* renamed from: k, reason: collision with root package name */
    public final u34.b f424419k = new u34.b(this);

    public static final /* synthetic */ com.tencent.mm.view.MMPAGView c(u34.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPAGAnimView$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.tencent.mm.view.MMPAGView mMPAGView = dVar.f424410b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPAGAnimView$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        return mMPAGView;
    }

    @Override // t34.a
    public void a(android.content.Context context, s34.x xVar, android.view.ViewGroup viewGroup, android.animation.Animator.AnimatorListener animatorListener) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        kotlin.jvm.internal.o.g(context, "context");
        this.f424409a = context;
        s34.t tVar = xVar != null ? xVar.pagThemeAnimInfo : null;
        this.f424411c = tVar;
        this.f424412d = animatorListener;
        if (viewGroup == null || tVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPAGView", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context);
        mMPAGView.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxSnsSwitch()) == 1);
        this.f424410b = mMPAGView;
        mMPAGView.setScaleMode(3);
        mMPAGView.a(this.f424415g);
        mMPAGView.b(this.f424419k);
        viewGroup.addView(mMPAGView, new android.view.ViewGroup.LayoutParams(-1, -1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPAGView", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ad  */
    @Override // t34.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 666
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: u34.d.b():void");
    }

    public final java.lang.String d(s34.s sVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLocalPagFile", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        if (sVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLocalPagFile", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            return "";
        }
        java.lang.String b17 = com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.b(sVar.pagUrl, sVar.f402756a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLocalPagFile", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        return b17;
    }

    public final void e(s34.s sVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        if (sVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            return;
        }
        java.lang.String str = sVar.pagUrl;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.i("PagAnimScene", "downloadPagFile, url is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
            return;
        }
        com.tencent.mars.xlog.Log.i("PagAnimScene", "downloadPagFile, url=" + sVar.pagUrl);
        com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.l0.a(sVar.pagUrl);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("downloadPagFile", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
    }

    public final void f(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(2029, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("idKeyReport", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
    }

    @Override // t34.a
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.tencent.mars.xlog.Log.i("PagAnimScene", "onDestroy");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
    }
}
