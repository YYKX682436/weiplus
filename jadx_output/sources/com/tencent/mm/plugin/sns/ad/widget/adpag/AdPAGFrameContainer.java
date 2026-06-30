package com.tencent.mm.plugin.sns.ad.widget.adpag;

/* loaded from: classes4.dex */
public class AdPAGFrameContainer extends android.widget.FrameLayout implements androidx.lifecycle.x {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f163313p = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f163314d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f163315e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f163316f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f163317g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f163318h;

    /* renamed from: i, reason: collision with root package name */
    public long f163319i;

    /* renamed from: m, reason: collision with root package name */
    public final ym5.v1 f163320m;

    /* renamed from: n, reason: collision with root package name */
    public final ym5.w1 f163321n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f163322o;

    public AdPAGFrameContainer(android.content.Context context) {
        this(context, null);
    }

    public static /* synthetic */ android.widget.ImageView a(com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        android.widget.ImageView imageView = adPAGFrameContainer.f163315e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        return imageView;
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetPAGViewStatus", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdPAGFrameContainer", "resetPAGViewStatus exp is " + th6);
        }
        if (this.f163316f) {
            com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", "resetPAGViewStatus, mIsReset is true so return");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetPAGViewStatus", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            return;
        }
        android.widget.ImageView imageView = this.f163315e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        com.tencent.mm.view.MMPAGView mMPAGView = this.f163314d;
        if (mMPAGView != null) {
            mMPAGView.setVisibility(8);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            com.tencent.mm.view.MMPAGView mMPAGView2 = this.f163314d;
            if (mMPAGView2 != null) {
                mMPAGView2.post(new com.tencent.mm.plugin.sns.ad.widget.adpag.h(this));
                com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", "stop");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            com.tencent.mm.view.MMPAGView mMPAGView3 = this.f163314d;
            if (mMPAGView3 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            } else {
                try {
                    if (this.f163317g) {
                        this.f163317g = false;
                        mMPAGView3.i(this.f163321n);
                        com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", "stopListenPagView");
                    }
                } catch (java.lang.Throwable unused) {
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            com.tencent.mm.view.MMPAGView mMPAGView4 = this.f163314d;
            if (mMPAGView4 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            } else {
                try {
                    if (this.f163318h) {
                        this.f163318h = false;
                        mMPAGView4.j(this.f163320m);
                        com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", "stopListenFlushListener");
                    }
                } catch (java.lang.Throwable unused2) {
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            }
            this.f163316f = true;
            com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", "resetPAGViewStatus");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetPAGViewStatus", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    public void c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("start", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        if (this.f163314d != null) {
            setProgress(0.0d);
            this.f163314d.setVisibility(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            com.tencent.mm.view.MMPAGView mMPAGView = this.f163314d;
            if (mMPAGView == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            } else {
                try {
                    if (!this.f163317g) {
                        this.f163317g = true;
                        mMPAGView.a(this.f163321n);
                        com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", "startListenPagView");
                    }
                } catch (java.lang.Throwable unused) {
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startListenPAGView", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
            }
            this.f163314d.post(new com.tencent.mm.plugin.sns.ad.widget.adpag.f(this));
            this.f163316f = false;
            com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", com.tencent.tav.core.AssetExtension.SCENE_PLAY);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("start", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        b();
        setEventListenerEnabled(false);
        super.onDetachedFromWindow();
        com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", "onDetachedFromWindow");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_PAUSE)
    public void onPause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        try {
            com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", "onPause");
            b();
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    @Override // android.view.View
    public void onStartTemporaryDetach() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        super.onStartTemporaryDetach();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStartTemporaryDetach", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    public void setEventListenerEnabled(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEventListenerEnabled", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", "setEventListenerEnabled: " + z17);
        com.tencent.mm.sdk.event.IListener iListener = this.f163322o;
        try {
            if (z17) {
                iListener.alive();
            } else {
                iListener.dead();
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdPAGFrameContainer", "setEventListenerEnabled, exp is" + th6);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEventListenerEnabled", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    public void setProgress(double d17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f163314d;
        if (mMPAGView != null) {
            mMPAGView.setProgress(d17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setProgress", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    public void setSnsId(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
        this.f163319i = j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsId", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
    }

    public AdPAGFrameContainer(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdPAGFrameContainer(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163316f = false;
        this.f163320m = new com.tencent.mm.plugin.sns.ad.widget.adpag.d(this);
        this.f163321n = new com.tencent.mm.plugin.sns.ad.widget.adpag.e(this);
        this.f163322o = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.SnsAdInteractionEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer.6
            {
                this.__eventId = 783234387;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.SnsAdInteractionEvent snsAdInteractionEvent) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                am.av avVar = snsAdInteractionEvent.f54792g;
                int i18 = avVar.f6189a;
                long j17 = avVar.f6190b;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("snsAdInteractionEvent callback, visibility is ");
                sb6.append(i18);
                sb6.append(", snsId is ");
                sb6.append(ca4.z0.t0(j17));
                sb6.append(", curSnsId is ");
                int i19 = com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer.f163313p;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer adPAGFrameContainer = com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer.this;
                long j18 = adPAGFrameContainer.f163319i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                sb6.append(ca4.z0.t0(j18));
                sb6.append(", adPAGFrameContainer hashCode is ");
                sb6.append(adPAGFrameContainer.hashCode());
                com.tencent.mars.xlog.Log.i("AdPAGFrameContainer", sb6.toString());
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                long j19 = adPAGFrameContainer.f163319i;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer");
                if (j19 != j17) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                } else {
                    adPAGFrameContainer.setVisibility(i18);
                    if (i18 == 8) {
                        adPAGFrameContainer.setEventListenerEnabled(false);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.ad.widget.adpag.AdPAGFrameContainer$6");
                return false;
            }
        };
        if (context instanceof androidx.lifecycle.y) {
            ((androidx.lifecycle.y) context).mo133getLifecycle().a(this);
        }
    }
}
