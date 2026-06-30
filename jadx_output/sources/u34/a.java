package u34;

/* loaded from: classes4.dex */
public final class a implements ym5.w1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u34.d f424406d;

    public a(u34.d dVar) {
        this.f424406d = dVar;
    }

    @Override // ym5.w1
    public void b(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$mPAGViewUpdateListener$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PagView onAnimationStart, pagType=");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPlayingPagFileType$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        u34.d dVar = this.f424406d;
        int i17 = dVar.f424413e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPlayingPagFileType$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("PagAnimScene", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAnimListener$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        android.animation.Animator.AnimatorListener animatorListener = dVar.f424412d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAnimListener$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        if (animatorListener != null) {
            animatorListener.onAnimationStart(android.animation.ValueAnimator.ofInt(0, 0));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$mPAGViewUpdateListener$1");
    }

    @Override // ym5.w1
    public void c(com.tencent.mm.view.MMPAGView mMPAGView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$mPAGViewUpdateListener$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PagView onAnimationEnd, pagType=");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPlayingPagFileType$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        u34.d dVar = this.f424406d;
        int i17 = dVar.f424413e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPlayingPagFileType$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("PagAnimScene", sb6.toString());
        try {
            com.tencent.mm.view.MMPAGView c17 = u34.d.c(dVar);
            if (c17 != null) {
                c17.i(this);
            }
            com.tencent.mm.view.MMPAGView c18 = u34.d.c(dVar);
            if (c18 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPagUpdateListener$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                u34.b bVar = dVar.f424419k;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPagUpdateListener$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
                c18.j(bVar);
            }
            com.tencent.mm.view.MMPAGView c19 = u34.d.c(dVar);
            if (c19 != null) {
                c19.n();
            }
        } catch (java.lang.Exception e17) {
            ca4.q.c("PagAnimScene pag stop", e17);
            com.tencent.mars.xlog.Log.e("PagAnimScene", "PagView onAnimationEnd exp=" + e17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$idKeyReport", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        dVar.f(27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$idKeyReport", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        int i18 = dVar.f424418j;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPlayingPagFileType$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        int i19 = dVar.f424413e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPlayingPagFileType$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$savePagFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("savePagFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        java.lang.String str = "ad_fullscreen_pag_frame_rate_" + i19;
        p34.o.g(str, java.lang.String.valueOf(i18));
        com.tencent.mars.xlog.Log.i("PagAnimScene", "savePagFrameRate, frameRate=" + i18 + ", pagType=" + i19 + ", key=" + str + ", snsId=" + dVar.f424414f);
        ca4.e0.b("ad_pag_theme_anim_frame_rate", "", i19, i18, dVar.f424414f);
        if (i19 != 1) {
            if (i19 == 2) {
                if (i18 >= 30) {
                    dVar.f(30);
                } else {
                    dVar.f(31);
                }
            }
        } else if (i18 >= 30) {
            dVar.f(28);
        } else {
            dVar.f(29);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("savePagFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$savePagFrameRate", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAnimListener$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        android.animation.Animator.AnimatorListener animatorListener = dVar.f424412d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAnimListener$p", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene");
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(android.animation.ValueAnimator.ofInt(0, 0));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.animproxy.scene.PagAnimScene$mPAGViewUpdateListener$1");
    }
}
