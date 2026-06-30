package u34;

/* loaded from: classes4.dex */
public class g implements t34.a {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.Bitmap f424422a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView f424423b;

    /* renamed from: c, reason: collision with root package name */
    public s34.u f424424c;

    /* renamed from: d, reason: collision with root package name */
    public android.animation.Animator.AnimatorListener f424425d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Handler f424426e = new android.os.Handler(android.os.Looper.getMainLooper());

    @Override // t34.a
    public void a(android.content.Context context, s34.x xVar, android.view.ViewGroup viewGroup, android.animation.Animator.AnimatorListener animatorListener) {
        java.lang.String c17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        this.f424425d = animatorListener;
        this.f424424c = xVar.randomSpriteAnimInfo;
        com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView = new com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView(context);
        this.f424423b = snsAdSphereAnimView;
        viewGroup.addView(snsAdSphereAnimView, new android.view.ViewGroup.LayoutParams(-1, -1));
        s34.u uVar = this.f424424c;
        if (uVar == null) {
            d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
            return;
        }
        java.lang.String str = uVar.spriteImageUrl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        com.tencent.mars.xlog.Log.i("RandomSpriteAnimScene", "loadSpriteImage:" + str);
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        } else {
            try {
                c17 = c(str);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("RandomSpriteAnimScene", "loadLongSpriteImage, exp=" + th6.toString());
            }
            if (android.text.TextUtils.isEmpty(c17)) {
                com.tencent.mars.xlog.Log.e("RandomSpriteAnimScene", "loadLongSpriteImage, !fileExists, start download");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDownloadSpriteImg", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
                za4.t0.b("adId", str, true, 0, 0, new u34.f(this, str));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDownloadSpriteImg", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 19);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
            } else {
                android.graphics.Bitmap J2 = com.tencent.mm.sdk.platformtools.x.J(c17, null);
                if (J2 != null) {
                    this.f424422a = J2;
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 18);
                    com.tencent.mars.xlog.Log.i("RandomSpriteAnimScene", "loadLongSpriteImage succ");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
                } else {
                    com.tencent.mars.xlog.Log.e("RandomSpriteAnimScene", "loadLongSpriteImage, bitmap==null");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1572, 19);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadLongSpriteImage", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
                }
            }
        }
        android.graphics.Bitmap bitmap = this.f424422a;
        if (bitmap == null) {
            d();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        } else {
            com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView2 = this.f424423b;
            s34.u uVar2 = this.f424424c;
            snsAdSphereAnimView2.j(bitmap, uVar2.f402782a, uVar2.f402784c, uVar2.f402783b);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        }
    }

    @Override // t34.a
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView snsAdSphereAnimView = this.f424423b;
        if (snsAdSphereAnimView != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
            com.tencent.mars.xlog.Log.i("SnsAdSphereAnimView", "start");
            snsAdSphereAnimView.invalidate();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ui.widget.SnsAdSphereAnimView");
            this.f424426e.postDelayed(new u34.e(this), this.f424424c.f402784c + 50);
        } else {
            d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
    }

    public final java.lang.String c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLocalImgPath", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.i("RandomSpriteAnimScene", "url empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalImgPath", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
            return "";
        }
        java.lang.String e17 = a84.m.e(str);
        if (com.tencent.mm.vfs.w6.j(e17)) {
            com.tencent.mars.xlog.Log.i("RandomSpriteAnimScene", "pathForImgMM exists");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalImgPath", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
            return e17;
        }
        java.lang.String k17 = za4.t0.k(str);
        if (com.tencent.mm.vfs.w6.j(k17)) {
            com.tencent.mars.xlog.Log.i("RandomSpriteAnimScene", "pathForImg exists");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalImgPath", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
            return k17;
        }
        com.tencent.mars.xlog.Log.i("RandomSpriteAnimScene", "no local imgFile");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLocalImgPath", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        return "";
    }

    public final void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyAnimEnd", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        android.animation.Animator.AnimatorListener animatorListener = this.f424425d;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyAnimEnd", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
    }

    @Override // t34.a
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
        this.f424423b.g();
        this.f424426e.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.animproxy.scene.RandomSpriteAnimScene");
    }
}
