package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f171292d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f171293e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f171294f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f171295g;

    /* renamed from: h, reason: collision with root package name */
    public int f171296h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView f171297i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171298m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout.LayoutParams f171299n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171300o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView, java.lang.String str, android.widget.FrameLayout.LayoutParams layoutParams, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f171297i = snsAdBreakFrameVideoView;
        this.f171298m = str;
        this.f171299n = layoutParams;
        this.f171300o = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
        com.tencent.mm.plugin.sns.ui.widget.x xVar = new com.tencent.mm.plugin.sns.ui.widget.x(this.f171297i, this.f171298m, this.f171299n, this.f171300o, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
        return xVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
        java.lang.Object invokeSuspend = ((com.tencent.mm.plugin.sns.ui.widget.x) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
        return invokeSuspend;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f171296h;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView snsAdBreakFrameVideoView = this.f171297i;
            this.f171292d = snsAdBreakFrameVideoView;
            java.lang.String str = this.f171298m;
            this.f171293e = str;
            android.widget.FrameLayout.LayoutParams layoutParams = this.f171299n;
            this.f171294f = layoutParams;
            java.lang.String str2 = this.f171300o;
            this.f171295g = str2;
            this.f171296h = 1;
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(this), 1);
            rVar.k();
            rVar.m(com.tencent.mm.plugin.sns.ui.widget.v.f171280d);
            if (str == null) {
                str = "";
            }
            com.tencent.mm.plugin.sns.ui.widget.w wVar = new com.tencent.mm.plugin.sns.ui.widget.w(rVar);
            snsAdBreakFrameVideoView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPrepare", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
            kotlinx.coroutines.y0 y0Var = snsAdBreakFrameVideoView.scope;
            if (y0Var != null) {
                kotlinx.coroutines.z0.c(y0Var, null);
            }
            snsAdBreakFrameVideoView.scope = kotlinx.coroutines.z0.i(kotlinx.coroutines.z0.b(), kotlinx.coroutines.t3.a(null, 1, null));
            com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView = snsAdBreakFrameVideoView.mPlayerView;
            if (adAlphaPlayerView != null) {
                adAlphaPlayerView.g();
            }
            snsAdBreakFrameVideoView.removeView(snsAdBreakFrameVideoView.mPlayerView);
            com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView2 = new com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView(snsAdBreakFrameVideoView.getContext());
            snsAdBreakFrameVideoView.mPlayerView = adAlphaPlayerView2;
            adAlphaPlayerView2.setOnPrepared(wVar);
            if (layoutParams == null) {
                layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            }
            snsAdBreakFrameVideoView.addView(snsAdBreakFrameVideoView.mPlayerView, 0, layoutParams);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1913, 0);
            com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView3 = snsAdBreakFrameVideoView.mPlayerView;
            if (adAlphaPlayerView3 != null) {
                adAlphaPlayerView3.f163489r = new com.tencent.mm.plugin.sns.ui.widget.f0(snsAdBreakFrameVideoView);
            }
            if (adAlphaPlayerView3 != null) {
                java.lang.String i18 = com.tencent.mm.vfs.w6.i(str, false);
                int i19 = snsAdBreakFrameVideoView.f170780o;
                com.tencent.mm.plugin.sns.ui.widget.g0 g0Var = new com.tencent.mm.plugin.sns.ui.widget.g0(snsAdBreakFrameVideoView);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                adAlphaPlayerView3.f163482h = i18;
                if (str2 != null) {
                    adAlphaPlayerView3.f163488q = str2;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                adAlphaPlayerView3.f163484m = i19;
                adAlphaPlayerView3.f163483i = false;
                adAlphaPlayerView3.f163481g = g0Var;
                g0Var.b(1);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView");
            }
            com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView4 = snsAdBreakFrameVideoView.mPlayerView;
            if (adAlphaPlayerView4 != null) {
                adAlphaPlayerView4.setOnProgressListener(new com.tencent.mm.plugin.sns.ui.widget.h0(snsAdBreakFrameVideoView));
            }
            try {
                com.tencent.mm.plugin.sns.ad.widget.alphavideo.AdAlphaPlayerView adAlphaPlayerView5 = snsAdBreakFrameVideoView.mPlayerView;
                if (adAlphaPlayerView5 != null) {
                    adAlphaPlayerView5.d();
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("SnsAdBreakFrameVideoView", th6.toString());
            }
            com.tencent.mars.xlog.Log.i("SnsAdBreakFrameVideoView", "startPrepare() init end ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPrepare", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView");
            java.lang.Object j17 = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
            if (j17 == aVar) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
                return aVar;
            }
        } else {
            if (i17 != 1) {
                java.lang.IllegalStateException illegalStateException = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
                throw illegalStateException;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.widget.SnsAdBreakFrameVideoView$prepare$2");
        return f0Var;
    }
}
