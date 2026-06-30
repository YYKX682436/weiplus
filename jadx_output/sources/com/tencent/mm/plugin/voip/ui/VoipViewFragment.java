package com.tencent.mm.plugin.voip.ui;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000fJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/voip/ui/VoipViewFragment;", "Landroid/widget/FrameLayout;", "Lcom/tencent/mm/plugin/voip/widget/BaseSmallView;", "getCurrentView", "", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME, "Ljz5/f0;", "setVoicePlayDevice", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-voip_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class VoipViewFragment extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.widget.BaseSmallView f176932d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.widget.BaseSmallView f176933e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f176934f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VoipViewFragment(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    private final com.tencent.mm.plugin.voip.widget.BaseSmallView getCurrentView() {
        return this.f176934f ? this.f176933e : this.f176932d;
    }

    public final com.tencent.mm.plugin.voip.widget.BaseSmallView a(boolean z17, boolean z18) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator alpha2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator animate3;
        android.view.ViewPropertyAnimator alpha3;
        android.view.ViewPropertyAnimator duration3;
        if (z18) {
            if (z17) {
                this.f176934f = true;
                com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView = this.f176932d;
                if (baseSmallView != null) {
                    baseSmallView.setVisibility(0);
                }
                com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView2 = this.f176933e;
                if (baseSmallView2 != null) {
                    baseSmallView2.setVisibility(0);
                }
                com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView3 = this.f176933e;
                if (baseSmallView3 != null) {
                    baseSmallView3.setAlpha(0.0f);
                }
                com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView4 = this.f176932d;
                if (baseSmallView4 != null && (animate3 = baseSmallView4.animate()) != null && (alpha3 = animate3.alpha(0.0f)) != null && (duration3 = alpha3.setDuration(300L)) != null) {
                    duration3.start();
                }
                com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView5 = this.f176933e;
                if (baseSmallView5 != null && (animate2 = baseSmallView5.animate()) != null && (alpha2 = animate2.alpha(1.0f)) != null && (duration2 = alpha2.setDuration(300L)) != null) {
                    duration2.start();
                }
            } else {
                this.f176934f = false;
                com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView6 = this.f176933e;
                if (baseSmallView6 != null) {
                    baseSmallView6.setVisibility(8);
                }
                com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView7 = this.f176933e;
                if (baseSmallView7 != null) {
                    removeView(baseSmallView7);
                }
                com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView8 = this.f176932d;
                if (baseSmallView8 != null) {
                    baseSmallView8.setVisibility(0);
                }
                com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView9 = this.f176932d;
                if (baseSmallView9 != null) {
                    baseSmallView9.setAlpha(0.0f);
                }
                com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView10 = this.f176932d;
                if (baseSmallView10 != null && (animate = baseSmallView10.animate()) != null && (alpha = animate.alpha(1.0f)) != null && (duration = alpha.setDuration(300L)) != null) {
                    duration.start();
                }
            }
        }
        this.f176934f = z17;
        if (z17) {
            com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView11 = this.f176933e;
            if (baseSmallView11 != null) {
                baseSmallView11.setVisibility(0);
            }
            return this.f176933e;
        }
        com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView12 = this.f176932d;
        if (baseSmallView12 != null) {
            baseSmallView12.setVisibility(0);
        }
        return this.f176932d;
    }

    public final void b(boolean z17) {
        com.tencent.mm.plugin.voip.widget.BaseSmallView currentView = getCurrentView();
        if (currentView != null) {
            currentView.c(z17);
        }
    }

    public final boolean c() {
        com.tencent.mm.plugin.voip.widget.BaseSmallView currentView = getCurrentView();
        if (currentView != null) {
            return currentView.d();
        }
        return false;
    }

    public final void d() {
        com.tencent.mm.plugin.voip.widget.BaseSmallView currentView = getCurrentView();
        if (currentView != null) {
            currentView.g();
        }
    }

    public final void e(java.lang.String str) {
        com.tencent.mm.plugin.voip.widget.BaseSmallView currentView = getCurrentView();
        if (currentView != null) {
            currentView.k(str);
        }
    }

    public final void f(java.lang.String str) {
        com.tencent.mm.plugin.voip.widget.BaseSmallView currentView = getCurrentView();
        if (currentView != null) {
            currentView.l(str);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return true;
    }

    public final void setVoicePlayDevice(int i17) {
        com.tencent.mm.plugin.voip.widget.BaseSmallView currentView = getCurrentView();
        if (currentView != null) {
            currentView.setVoicePlayDevice(i17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoipViewFragment(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f176933e = new com.tencent.mm.plugin.voip.widget.e(com.tencent.mm.sdk.platformtools.x2.f193071a);
        com.tencent.mm.plugin.voip.ui.h1 h1Var = new com.tencent.mm.plugin.voip.ui.h1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f176932d = h1Var;
        h1Var.setVisibility(8);
        com.tencent.mm.plugin.voip.widget.BaseSmallView baseSmallView = this.f176933e;
        if (baseSmallView != null) {
            baseSmallView.setVisibility(8);
        }
        addView(this.f176932d);
        addView(this.f176933e);
    }
}
