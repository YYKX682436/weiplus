package com.tencent.mm.plugin.sns.ad.widget.adsocial;

/* loaded from: classes4.dex */
public class AdSocialAttitudeView extends android.widget.FrameLayout implements k84.f6, xn5.a0 {
    public static final /* synthetic */ int D1 = 0;
    public int A;
    public final boolean A1;
    public int B;
    public final ym5.v1 B1;
    public int C;
    public final ym5.w1 C1;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f163439J;
    public int K;
    public int L;
    public int M;
    public long N;
    public boolean P;
    public boolean Q;
    public android.graphics.drawable.Drawable R;
    public java.lang.String S;
    public int T;
    public int U;
    public java.lang.String V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f163440d;

    /* renamed from: e, reason: collision with root package name */
    public int f163441e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f163442f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f163443g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f163444h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f163445i;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f163446l1;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f163447m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f163448n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f163449o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.ImageView f163450p;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f163451p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f163452p1;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f163453q;

    /* renamed from: r, reason: collision with root package name */
    public k84.p4 f163454r;

    /* renamed from: s, reason: collision with root package name */
    public k84.p4 f163455s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.listener.i f163456t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f163457u;

    /* renamed from: v, reason: collision with root package name */
    public int f163458v;

    /* renamed from: w, reason: collision with root package name */
    public mb4.c f163459w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.ViewGroup f163460x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f163461x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f163462x1;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f163463y;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f163464y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.view.GestureDetector f163465y1;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f163466z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f163467z1;

    public AdSocialAttitudeView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static /* synthetic */ java.lang.String a(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        java.lang.String str = adSocialAttitudeView.f163440d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return str;
    }

    public static boolean b(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView, boolean z17) {
        android.view.View.OnClickListener onClickListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        java.lang.String str = adSocialAttitudeView.f163440d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        boolean z18 = false;
        try {
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, "error in cheerClick", new java.lang.Object[0]);
        }
        if (java.lang.System.currentTimeMillis() - adSocialAttitudeView.N <= 800) {
            com.tencent.mars.xlog.Log.w(str, "you must click button slowly");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            return z18;
        }
        adSocialAttitudeView.N = java.lang.System.currentTimeMillis();
        if (adSocialAttitudeView.m() && !adSocialAttitudeView.f163459w.f325386k) {
            k84.p4 p4Var = adSocialAttitudeView.f163454r;
            if (p4Var != null) {
                p4Var.a();
            }
            k84.p4 p4Var2 = adSocialAttitudeView.f163455s;
            if (p4Var2 != null) {
                p4Var2.a();
            }
            if (!adSocialAttitudeView.f163457u.isFireworkCheerAd()) {
                adSocialAttitudeView.x();
            }
        }
        if (adSocialAttitudeView.m()) {
            if (z17) {
                l44.b3.f316041a.k(adSocialAttitudeView.f163457u);
                com.tencent.mars.xlog.Log.i(str, "single tap to do like");
            } else {
                l44.b3.f316041a.j(adSocialAttitudeView.f163457u);
                com.tencent.mars.xlog.Log.i(str, "double tap to do like");
            }
        } else if (z17) {
            l44.b3.f316041a.g(adSocialAttitudeView.f163457u);
            com.tencent.mars.xlog.Log.i(str, "single tap to do unlike");
        }
        com.tencent.mm.plugin.sns.ui.listener.i iVar = adSocialAttitudeView.f163456t;
        if (iVar != null && (onClickListener = iVar.f169817t) != null) {
            onClickListener.onClick(adSocialAttitudeView.f163447m);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        z18 = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return z18;
    }

    public static /* synthetic */ android.view.ViewGroup c(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        android.view.ViewGroup viewGroup = adSocialAttitudeView.f163460x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return viewGroup;
    }

    public static /* synthetic */ int d(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        int i17 = adSocialAttitudeView.f163441e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return i17;
    }

    public static void e(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView, int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        adSocialAttitudeView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeContentMarginParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        android.widget.LinearLayout linearLayout = adSocialAttitudeView.f163447m;
        int i19 = adSocialAttitudeView.H;
        linearLayout.setPadding(i17, i19, i17, i19);
        android.widget.LinearLayout linearLayout2 = adSocialAttitudeView.f163449o;
        int i27 = adSocialAttitudeView.H;
        linearLayout2.setPadding(i17, i27, i17, i27);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) adSocialAttitudeView.f163448n.getLayoutParams();
        layoutParams.rightMargin = i18;
        adSocialAttitudeView.f163448n.setLayoutParams(layoutParams);
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) adSocialAttitudeView.f163450p.getLayoutParams();
        layoutParams2.rightMargin = i18;
        adSocialAttitudeView.f163450p.setLayoutParams(layoutParams2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeContentMarginParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public static void f(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView, boolean z17, int i17) {
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        adSocialAttitudeView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeCheerAndCommentContainerParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) adSocialAttitudeView.f163447m.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) adSocialAttitudeView.f163449o.getLayoutParams();
        if (!z17 || i17 <= 0) {
            layoutParams.width = -2;
            layoutParams2.width = -2;
            if (adSocialAttitudeView.f163444h != null && (snsInfo = adSocialAttitudeView.f163457u) != null && snsInfo.isFireworkCheerAd()) {
                android.view.ViewGroup.LayoutParams layoutParams3 = adSocialAttitudeView.f163444h.getLayoutParams();
                if (layoutParams3 != null) {
                    layoutParams3.width = -2;
                    layoutParams3.height = -2;
                }
                adSocialAttitudeView.f163444h.requestLayout();
            }
        } else {
            layoutParams.width = i17;
            layoutParams2.width = i17;
            if (adSocialAttitudeView.f163444h != null && (snsInfo3 = adSocialAttitudeView.f163457u) != null && snsInfo3.isFireworkCheerAd() && adSocialAttitudeView.f163444h.getPaint() != null && adSocialAttitudeView.f163444h.getText() != null) {
                android.view.ViewGroup.LayoutParams layoutParams4 = adSocialAttitudeView.f163444h.getLayoutParams();
                if (layoutParams4 != null) {
                    float measureText = adSocialAttitudeView.f163444h.getPaint().measureText(adSocialAttitudeView.f163444h.getText().toString()) + a84.d0.b(6);
                    float b17 = i17 - a84.d0.b(48);
                    com.tencent.mars.xlog.Log.i(adSocialAttitudeView.f163440d, " resizeCheerAndCommentContainerParams textW " + measureText + " containerW " + b17);
                    layoutParams4.width = (int) java.lang.Math.min(measureText, b17);
                    layoutParams4.height = (int) a84.d0.b(32);
                }
                adSocialAttitudeView.f163444h.requestLayout();
            }
        }
        adSocialAttitudeView.f163447m.setLayoutParams(layoutParams);
        adSocialAttitudeView.f163449o.setLayoutParams(layoutParams2);
        if (adSocialAttitudeView.f163444h != null && (snsInfo2 = adSocialAttitudeView.f163457u) != null && snsInfo2.isFireworkCheerAd()) {
            float b18 = a84.d0.b(15);
            if (z17) {
                androidx.core.widget.a0.c(adSocialAttitudeView.f163444h, 0);
                int i18 = (int) b18;
                adSocialAttitudeView.f163444h.setTextSize(0, i18);
                androidx.core.widget.a0.b(adSocialAttitudeView.f163444h, 1, i18, 1, 0);
            } else {
                androidx.core.widget.a0.c(adSocialAttitudeView.f163444h, 0);
                adSocialAttitudeView.f163444h.setTextSize(0, (int) b18);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeCheerAndCommentContainerParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public static void g(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        adSocialAttitudeView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeViewFromParent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        android.view.ViewParent parent = adSocialAttitudeView.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(adSocialAttitudeView);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeViewFromParent", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public static void h(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView, boolean z17) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        adSocialAttitudeView.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeParamsInSnsCommentUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (z17) {
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(3, com.tencent.mm.R.id.f482668kq);
        } else {
            if (adSocialAttitudeView.f163445i.getHeight() > 0) {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) adSocialAttitudeView.f163463y.getLayoutParams();
                int i17 = adSocialAttitudeView.H;
                layoutParams2.topMargin = i17;
                layoutParams2.bottomMargin = i17;
                adSocialAttitudeView.f163463y.setLayoutParams(layoutParams2);
            }
            layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(3, com.tencent.mm.R.id.n_6);
            layoutParams.addRule(21, -1);
        }
        adSocialAttitudeView.setLayoutParams(layoutParams);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeParamsInSnsCommentUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3100", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public static /* synthetic */ android.widget.LinearLayout i(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        android.widget.LinearLayout linearLayout = adSocialAttitudeView.f163466z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3200", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return linearLayout;
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView j(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = adSocialAttitudeView.f163442f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return weImageView;
    }

    public static /* synthetic */ com.tencent.mm.view.MMPAGView k(com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.view.MMPAGView mMPAGView = adSocialAttitudeView.f163443g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return mMPAGView;
    }

    public com.tencent.mm.view.MMPAGView getCheerPAGView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCheerPAGView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.view.MMPAGView mMPAGView = this.f163443g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCheerPAGView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return mMPAGView;
    }

    public void l() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("calcAdSocialAttitudeParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (this.f163459w == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcAdSocialAttitudeParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            return;
        }
        if (this.f163460x == null || this.f163463y == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcAdSocialAttitudeParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            return;
        }
        if (!this.P) {
            getViewTreeObserver().addOnPreDrawListener(new k84.n4(this));
            this.P = true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("calcAdSocialAttitudeParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public boolean m() {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkLikeStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f163457u;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLikeStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            return false;
        }
        if (this.f163458v != 0) {
            z17 = snsInfo.getLikeFlag() == 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLikeStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            return z17;
        }
        java.lang.Object tag = getTag();
        if (!(tag instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLikeStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            return false;
        }
        z17 = ((com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) tag).f169270g == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkLikeStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        return z17;
    }

    public void n(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, android.view.ViewGroup viewGroup, android.widget.LinearLayout linearLayout, android.widget.LinearLayout linearLayout2) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillAdSocialAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        java.lang.String str = this.f163440d;
        com.tencent.mars.xlog.Log.i(str, "fillAdSocialAttitudeView() called with: snsInfo = [" + snsInfo + "]");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        this.f163457u = snsInfo;
        this.f163458v = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fixLikeFlagToLikeList", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(this.f163457u);
        java.lang.String r17 = c01.z1.r();
        if (e17 == null || android.text.TextUtils.isEmpty(r17)) {
            t(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixLikeFlagToLikeList", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        } else {
            java.util.LinkedList<r45.e86> linkedList = e17.LikeUserList;
            if (a84.b0.b(linkedList)) {
                t(0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixLikeFlagToLikeList", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            } else {
                int size = linkedList.size();
                int i18 = 0;
                while (true) {
                    if (i18 < size) {
                        r45.e86 e86Var = linkedList.get(i18);
                        if (e86Var != null && com.tencent.mm.sdk.platformtools.t8.D0(r17, e86Var.f373126d)) {
                            z17 = true;
                            t(1);
                            break;
                        }
                        i18++;
                    } else {
                        z17 = false;
                        break;
                    }
                }
                if (!z17) {
                    t(0);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fixLikeFlagToLikeList", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
            }
        }
        this.f163459w = snsInfo.getAdXml().adSocialInfo;
        this.f163460x = viewGroup;
        this.f163463y = linearLayout;
        this.f163466z = linearLayout2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillData", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (this.f163462x1) {
            com.tencent.mars.xlog.Log.i(str, "fillAdSocialAttitudeView UI refresh pending!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdSocialAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        } else {
            p();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillAdSocialAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0036, code lost:
    
        if (r2 == null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0068, code lost:
    
        if (r2 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(boolean r9) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.o(boolean):void");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        super.onConfigurationChanged(configuration);
        if (this.f163462x1 && !this.f163457u.isPatAd()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        } else {
            l();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        try {
            com.tencent.mars.xlog.Log.i(this.f163440d, "onDetachedFromWindow() called");
            super.onDetachedFromWindow();
            if (this.f163446l1) {
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f163457u;
                if (snsInfo == null || !snsInfo.isFireworkCheerAd()) {
                    x();
                }
            } else {
                x();
            }
            this.f163464y0 = "";
            this.f163452p1 = false;
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        super.onFinishInflate();
        try {
            this.f163445i = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.cgi);
            this.f163447m = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.btv);
            this.f163448n = (android.widget.FrameLayout) findViewById(com.tencent.mm.R.id.h68);
            this.f163442f = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f482869qc);
            com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) findViewById(com.tencent.mm.R.id.f486238ko5);
            this.f163443g = mMPAGView;
            if (mMPAGView != null) {
                mMPAGView.o(this.A1);
            }
            this.f163444h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.btw);
            this.f163450p = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.c78);
            this.f163449o = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.c6o);
            this.f163453q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c86);
            r();
            this.f163465y1 = new android.view.GestureDetector(getContext(), new android.view.GestureDetector.SimpleOnGestureListener());
            this.f163447m.setClickable(true);
            y(false);
            this.f163465y1.setOnDoubleTapListener(new k84.g4(this));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f163440d, th6, "error in cheer inflate", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFinishInflate", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void p() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        q(m());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void q(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillUIWithStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setRoundCorner", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        setClipToOutline(true);
        setOutlineProvider(new al5.z1(a84.d0.a(4)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setRoundCorner", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        o(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillImgWithStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (z17) {
            if (com.tencent.mm.ui.bk.C()) {
                this.S = this.f163459w.cheerIconDark;
            } else {
                this.S = this.f163459w.cheerIcon;
            }
        } else if (com.tencent.mm.ui.bk.C()) {
            this.S = this.f163459w.likedIconDark;
        } else {
            this.S = this.f163459w.likedIcon;
        }
        java.lang.String snsId = this.f163457u.getSnsId();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(snsId) && !com.tencent.mm.sdk.platformtools.t8.D0(snsId, this.f163464y0)) {
            x();
            this.f163452p1 = false;
        }
        this.f163464y0 = snsId;
        android.graphics.drawable.Drawable e17 = com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.drawable.at7, getContext().getResources().getColor(com.tencent.mm.R.color.f478524a5));
        this.R = e17;
        e17.setBounds(0, 0, e17.getIntrinsicWidth(), this.R.getIntrinsicHeight());
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f163442f;
        if (weImageView != null) {
            weImageView.setTag(com.tencent.mm.R.id.n5q, this.S);
            this.f163442f.setTag(com.tencent.mm.R.id.qaf, this.f163457u);
            a84.m.g(this.S, new k84.o4(this));
        }
        if (this.f163457u.isPatAd()) {
            this.f163450p.setImageDrawable(getContext().getDrawable(com.tencent.mm.R.drawable.cxb));
        } else {
            this.f163450p.setImageDrawable(com.tencent.mm.ui.uk.e(getContext(), com.tencent.mm.R.drawable.f480743bi, getContext().getResources().getColor(com.tencent.mm.R.color.f478524a5)));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillImgWithStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        l();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillUIWithStatus", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public final void r() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCalcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        this.C = i65.a.b(getContext(), 12);
        this.D = i65.a.b(getContext(), 4);
        this.E = i65.a.b(getContext(), 6);
        this.F = i65.a.b(getContext(), 40);
        this.G = i65.a.b(getContext(), 32);
        this.H = i65.a.b(getContext(), 8);
        this.I = 56;
        this.f163439J = i65.a.b(getContext(), this.I);
        this.K = this.I / 2;
        this.L = i65.a.b(getContext(), this.K);
        this.M = i65.a.b(getContext(), 16);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCalcParams", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPAGAnimationGone", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (this.f163447m != null) {
            com.tencent.mars.xlog.Log.i(this.f163440d, "cheerContainer enable");
            this.f163447m.setEnabled(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPAGAnimationGone", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void setCheerTextColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCheerTextColor", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        android.widget.TextView textView = this.f163444h;
        if (textView != null) {
            textView.setTextColor(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCheerTextColor", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void setOnCancelAttractAnimationListener(k84.p4 p4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnCancelAttractAnimationListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        this.f163455s = p4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnCancelAttractAnimationListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void setOnCommentClickListener(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnCommentClickListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        android.widget.LinearLayout linearLayout = this.f163449o;
        if (linearLayout != null && iVar != null) {
            this.f163456t = iVar;
            linearLayout.setOnClickListener(iVar.f169816s);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnCommentClickListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void setOnShowAttitudeListener(k84.p4 p4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnShowAttitudeListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        this.f163454r = p4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnShowAttitudeListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void setPendingFillItem(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPendingFillItem", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        this.f163462x1 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPendingFillItem", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    @Override // android.view.View
    public void setTag(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        super.setTag(obj);
        android.widget.LinearLayout linearLayout = this.f163449o;
        if (linearLayout != null) {
            linearLayout.setTag(obj);
        }
        android.widget.LinearLayout linearLayout2 = this.f163447m;
        if (linearLayout2 != null) {
            linearLayout2.setTag(obj);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public final void t(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetLikeFlag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        if (this.f163458v == 0) {
            java.lang.Object tag = getTag();
            if (tag instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) {
                ((com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) tag).f169270g = i17;
            }
        }
        this.f163457u.setLikeFlag(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetLikeFlag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u(boolean r17) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView.u(boolean):boolean");
    }

    public final void v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        try {
            com.tencent.mm.view.MMPAGView mMPAGView = this.f163443g;
            if (mMPAGView != null && this.f163461x0) {
                this.f163461x0 = false;
                mMPAGView.j(this.B1);
                com.tencent.mars.xlog.Log.i(this.f163440d, "stopListenFlushListener");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListenFlushListener", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public final void w() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        try {
            com.tencent.mm.view.MMPAGView mMPAGView = this.f163443g;
            if (mMPAGView != null && this.f163451p0) {
                this.f163451p0 = false;
                mMPAGView.i(this.C1);
                com.tencent.mars.xlog.Log.i(this.f163440d, "stopListenPagView");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopListenPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void x() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopPlayIconAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        java.lang.String str = this.f163440d;
        com.tencent.mars.xlog.Log.i(str, "stopPlayIconAttractAnimation() called");
        try {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f163442f;
            if (weImageView != null) {
                weImageView.setVisibility(0);
            }
            if (this.f163443g != null) {
                w();
                v();
                this.f163443g.setVisibility(8);
                this.f163443g.post(new k84.m4(this));
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, "stopPlayIconAttractAnimation error", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopPlayIconAttractAnimation", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public void y(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("supportDoubleTap", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
        this.f163467z1 = z17;
        this.f163447m.setOnTouchListener(null);
        this.f163447m.setOnClickListener(null);
        if (this.f163467z1) {
            this.f163447m.setOnTouchListener(new k84.h4(this));
        } else {
            this.f163447m.setOnClickListener(new k84.i4(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("supportDoubleTap", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView");
    }

    public AdSocialAttitudeView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f163440d = "AdSocialAttitudeView " + hashCode();
        this.f163441e = 0;
        this.f163451p0 = false;
        this.f163461x0 = false;
        this.f163446l1 = false;
        this.f163452p1 = false;
        this.f163462x1 = false;
        this.f163467z1 = false;
        this.A1 = j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxSnsSwitch()) == 1;
        this.B1 = new k84.j4(this);
        this.C1 = new k84.k4(this);
    }
}
