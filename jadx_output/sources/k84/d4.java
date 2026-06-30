package k84;

/* loaded from: classes4.dex */
public abstract class d4 extends com.tencent.mm.plugin.sns.ui.widget.l {
    public static final k84.r1 V = new k84.r1(null);
    public static final kotlinx.coroutines.r0 W;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public final jz5.g F;
    public final jz5.g G;
    public final jz5.g H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f304997J;
    public boolean K;
    public int L;
    public kotlinx.coroutines.r2 M;
    public k84.s1 N;
    public final kotlinx.coroutines.flow.j2 O;
    public final jz5.g P;
    public android.animation.ValueAnimator Q;
    public android.animation.ValueAnimator R;
    public android.animation.ValueAnimator S;
    public android.animation.ValueAnimator T;
    public kotlinx.coroutines.r2 U;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f304998o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f304999p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView f305000q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView f305001r;

    /* renamed from: s, reason: collision with root package name */
    public final int f305002s;

    /* renamed from: t, reason: collision with root package name */
    public final int f305003t;

    /* renamed from: u, reason: collision with root package name */
    public final i64.b1 f305004u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f305005v;

    /* renamed from: w, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.bs f305006w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder f305007x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.ns f305008y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f305009z;

    static {
        int i17 = kotlinx.coroutines.r0.N0;
        W = new k84.f3(kotlinx.coroutines.q0.f310567d);
    }

    public d4(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, android.view.View view2, android.view.View view3, com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView, com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudePlayView adAttitudePlayView, com.tencent.mm.plugin.sns.ad.widget.adsocial.AdAttitudeAttractView adAttitudeAttractView, int i17, int i18, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar, com.tencent.mm.plugin.sns.ui.bs bsVar, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        super(str, yVar, view);
        this.f304998o = view2;
        this.f304999p = view3;
        this.f305000q = adSocialAttitudeView;
        this.f305001r = adAttitudeAttractView;
        this.f305002s = i17;
        this.f305003t = i18;
        this.f305004u = b1Var;
        this.f305005v = iVar;
        this.f305006w = bsVar;
        this.f305007x = baseViewHolder;
        this.f305009z = jz5.h.b(new k84.y3(view, this, yVar));
        this.A = jz5.h.b(new k84.x3(this));
        this.B = jz5.h.b(new k84.b4(this));
        this.C = jz5.h.b(new k84.w3(this));
        this.D = jz5.h.b(new k84.a4(this));
        this.E = jz5.h.b(new k84.z3(this));
        this.F = jz5.h.b(new k84.x2(this));
        this.G = jz5.h.b(new k84.a3(this));
        this.H = jz5.h.b(new k84.y2(this));
        this.I = jz5.h.b(new k84.z2(this));
        this.L = -1;
        this.N = new k84.s1(0, null, 0);
        this.O = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
        this.P = jz5.h.b(new k84.e3(view));
    }

    public static void b0(k84.d4 d4Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, java.lang.Object obj) {
        java.lang.String str;
        mb4.j0 j17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUIForNoAnim$default", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setUIForNoAnim");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUIForNoAnim$default", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            throw unsupportedOperationException;
        }
        java.lang.String str2 = null;
        if ((i17 & 1) != 0) {
            snsInfo = null;
        }
        d4Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUIForNoAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        boolean z17 = d4Var.K;
        com.tencent.mars.xlog.Log.i(d4Var.j(), "setUIForNoAnim  checkLikeStatus = " + z17 + " holdingAnimState " + d4Var.f304997J);
        if (snsInfo != null) {
            z17 = snsInfo.getLikeFlag() != 0;
        }
        com.tencent.mars.xlog.Log.i(d4Var.j(), "refresh  checkLikeStatus = " + z17);
        android.view.ViewGroup V2 = d4Var.V();
        android.content.Context context = V2 != null ? V2.getContext() : null;
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUIForNoAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        } else {
            androidx.appcompat.widget.AppCompatButton A = d4Var.A();
            if (A != null) {
                A.setTextColor(d4Var.L);
            }
            androidx.appcompat.widget.AppCompatButton A2 = d4Var.A();
            if (A2 != null) {
                A2.setOutlineProvider(new al5.z1(a84.d0.a(4)));
            }
            androidx.appcompat.widget.AppCompatButton A3 = d4Var.A();
            if (A3 != null) {
                A3.setClipToOutline(true);
            }
            int i18 = d4Var.f305003t;
            if (z17) {
                android.view.ViewGroup V3 = d4Var.V();
                if (V3 != null) {
                    V3.setVisibility(4);
                }
                android.view.ViewGroup U = d4Var.U();
                if (U != null) {
                    U.setVisibility(0);
                }
                com.tencent.mars.xlog.Log.i(d4Var.j(), "setTopLikeBackground and album like area");
                android.widget.RelativeLayout I = d4Var.I();
                if (I != null) {
                    I.setVisibility(0);
                }
                android.widget.FrameLayout D = d4Var.D();
                if (D != null) {
                    D.setVisibility(0);
                }
                androidx.appcompat.widget.AppCompatButton A4 = d4Var.A();
                if (A4 != null) {
                    A4.setOnClickListener(new k84.d3(d4Var, context));
                }
                if (i18 == 0) {
                    android.widget.LinearLayout E = d4Var.E();
                    if (E != null) {
                        E.setPadding(0, 0, 0, a84.d0.a(8));
                    }
                    android.view.View F = d4Var.F();
                    android.view.ViewGroup.LayoutParams layoutParams = F != null ? F.getLayoutParams() : null;
                    android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                    if (layoutParams2 != null) {
                        layoutParams2.topMargin = a84.d0.a(4);
                    }
                    if (layoutParams2 != null) {
                        layoutParams2.bottomMargin = a84.d0.a(4);
                    }
                    android.view.View F2 = d4Var.F();
                    if (F2 != null) {
                        F2.requestLayout();
                    }
                }
                if (d4Var.f304997J) {
                    android.widget.RelativeLayout I2 = d4Var.I();
                    if (I2 != null) {
                        I2.setVisibility(4);
                    }
                    android.widget.FrameLayout D2 = d4Var.D();
                    if (D2 != null) {
                        D2.setVisibility(4);
                    }
                    android.widget.ImageView G = d4Var.G();
                    if (G != null) {
                        G.setAlpha(0.0f);
                    }
                    d4Var.f0();
                } else {
                    android.widget.ImageView G2 = d4Var.G();
                    if (G2 != null) {
                        G2.setAlpha(1.0f);
                    }
                    d4Var.e0();
                }
                d4Var.a0();
            } else {
                android.view.ViewGroup V4 = d4Var.V();
                if (V4 != null) {
                    V4.setVisibility(0);
                }
                android.view.ViewGroup U2 = d4Var.U();
                if (U2 != null) {
                    U2.setVisibility(4);
                }
                android.widget.RelativeLayout I3 = d4Var.I();
                if (I3 != null) {
                    I3.setVisibility(8);
                }
                android.widget.FrameLayout D3 = d4Var.D();
                if (D3 != null) {
                    D3.setVisibility(8);
                }
                android.widget.ImageView G3 = d4Var.G();
                if (G3 != null) {
                    G3.setVisibility(8);
                }
                if (i18 == 0) {
                    android.widget.LinearLayout E2 = d4Var.E();
                    if (E2 != null) {
                        E2.setPadding(0, 0, 0, a84.d0.a(0));
                    }
                    android.view.View F3 = d4Var.F();
                    android.view.ViewGroup.LayoutParams layoutParams3 = F3 != null ? F3.getLayoutParams() : null;
                    android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
                    if (layoutParams4 != null) {
                        layoutParams4.topMargin = 0;
                    }
                    if (layoutParams4 != null) {
                        layoutParams4.bottomMargin = 0;
                    }
                    android.view.View F4 = d4Var.F();
                    if (F4 != null) {
                        F4.requestLayout();
                    }
                }
                d4Var.c0();
                d4Var.f0();
            }
            d4Var.Z();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlbumLikedTopWording", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            android.view.View view = d4Var.f304998o;
            android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.fir) : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumLikedTopWording", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            if (textView != null) {
                mb4.r B = d4Var.B();
                if (B == null || (j17 = B.j()) == null) {
                    str = null;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTopLikeTitle", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo");
                    str = j17.f325429b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTopLikeTitle", "com.tencent.mm.plugin.sns.storage.adsocial.TopLikeAreaInfo");
                }
                textView.setText(str);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlbumLikedTopWording", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            android.widget.TextView textView2 = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.fir) : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumLikedTopWording", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            if (textView2 != null) {
                textView2.setTextColor(d4Var.L);
            }
            androidx.appcompat.widget.AppCompatButton A5 = d4Var.A();
            if (A5 != null) {
                mb4.r B2 = d4Var.B();
                if (B2 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomButtonTitle", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                    java.lang.String str3 = B2.f325470q;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomButtonTitle", "com.tencent.mm.plugin.sns.storage.adsocial.FireworkCheerInfo");
                    str2 = str3;
                }
                A5.setText(str2);
            }
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = d4Var.f305000q;
            if (adSocialAttitudeView != null) {
                adSocialAttitudeView.setVisibility(0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUIForNoAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUIForNoAnim$default", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y(k84.d4 r29, com.tencent.mm.plugin.sns.ui.bs r30, android.content.Context r31, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r32, kotlin.coroutines.Continuation r33) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.d4.y(k84.d4, com.tencent.mm.plugin.sns.ui.bs, android.content.Context, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0198, code lost:
    
        if (r6 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01b3, code lost:
    
        if (r1 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01f3, code lost:
    
        if (r6 == null) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x021a, code lost:
    
        if (r6 == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(k84.d4 r27, android.content.Context r28, mb4.r r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.d4.z(k84.d4, android.content.Context, mb4.r, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final androidx.appcompat.widget.AppCompatButton A() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdAlbumCommentListBottomButton", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f304999p;
        androidx.appcompat.widget.AppCompatButton appCompatButton = view != null ? (androidx.appcompat.widget.AppCompatButton) view.findViewById(com.tencent.mm.R.id.d0w) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdAlbumCommentListBottomButton", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return appCompatButton;
    }

    public final mb4.r B() {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        mb4.c cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdFireworkCheerInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) i();
        mb4.r rVar = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null || (cVar = adXml.adSocialInfo) == null) ? null : cVar.f325388m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdFireworkCheerInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return rVar;
    }

    public final mb4.c C() {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdSocialInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) i();
        mb4.c cVar = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null) ? null : adXml.adSocialInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdSocialInfo", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return cVar;
    }

    public final android.widget.FrameLayout D() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlbumLikedBottomContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f304999p;
        android.widget.FrameLayout frameLayout = view != null ? (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.d1s) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumLikedBottomContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return frameLayout;
    }

    public final android.widget.LinearLayout E() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlbumLikedContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f304998o;
        android.widget.LinearLayout linearLayout = view != null ? (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.emm) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumLikedContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return linearLayout;
    }

    public final android.view.View F() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlbumLikedListLine", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f304998o;
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.f482877qj) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumLikedListLine", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return findViewById;
    }

    public final android.widget.ImageView G() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlbumLikedListTvAnimBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f304998o;
        android.widget.ImageView imageView = view != null ? (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.exo) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumLikedListTvAnimBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return imageView;
    }

    public final com.tencent.mm.view.MMPAGView H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlbumLikedTopPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        if (I() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumLikedTopPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            return null;
        }
        android.widget.RelativeLayout I = I();
        if ((I != null ? n3.u1.a(I, 0) : null) instanceof com.tencent.mm.view.MMPAGView) {
            android.widget.RelativeLayout I2 = I();
            android.view.KeyEvent.Callback a17 = I2 != null ? n3.u1.a(I2, 0) : null;
            com.tencent.mm.view.MMPAGView mMPAGView = a17 instanceof com.tencent.mm.view.MMPAGView ? (com.tencent.mm.view.MMPAGView) a17 : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumLikedTopPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            return mMPAGView;
        }
        android.view.View view = this.f304998o;
        android.content.Context context = view != null ? view.getContext() : null;
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumLikedTopPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
            return null;
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = new com.tencent.mm.view.MMPAGView(context);
        mMPAGView2.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxSnsSwitch()) == 1);
        android.widget.RelativeLayout I3 = I();
        if (I3 != null) {
            I3.addView(mMPAGView2, 0);
        }
        mMPAGView2.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, -1));
        mMPAGView2.requestLayout();
        mMPAGView2.o(j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigRfxSnsSwitch()) == 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumLikedTopPagView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return mMPAGView2;
    }

    public final android.widget.RelativeLayout I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAlbumLikedTopTitleContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f304998o;
        android.widget.RelativeLayout relativeLayout = view != null ? (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.fcl) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAlbumLikedTopTitleContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return relativeLayout;
    }

    public final com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView J() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305000q;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return adSocialAttitudeView;
    }

    public final android.animation.ValueAnimator K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomButtonAnimAnimator", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.animation.ValueAnimator valueAnimator = this.T;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomButtonAnimAnimator", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return valueAnimator;
    }

    public final android.animation.ValueAnimator L() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBottomStretchAnimAnimator", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.animation.ValueAnimator valueAnimator = this.S;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBottomStretchAnimAnimator", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return valueAnimator;
    }

    public final android.graphics.drawable.StateListDrawable M() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getBtnNormalDrawable", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.graphics.drawable.StateListDrawable stateListDrawable = new android.graphics.drawable.StateListDrawable();
        int color = com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478492d);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, new android.graphics.drawable.ColorDrawable(e3.b.c(color, com.tencent.mm.sdk.platformtools.x2.f193075e.getColor(com.tencent.mm.R.color.f478714f5), 0.2f)));
        stateListDrawable.addState(new int[0], new android.graphics.drawable.ColorDrawable(color));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getBtnNormalDrawable", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return stateListDrawable;
    }

    public final android.widget.LinearLayout N() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCheerContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.F).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCheerContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return linearLayout;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView O() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCheerIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.H).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCheerIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return weImageView;
    }

    public final com.tencent.mm.ui.widget.imageview.WeImageView P() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCheerNormalIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) this.I).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCheerNormalIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return weImageView;
    }

    public final android.widget.LinearLayout Q() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.G).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return linearLayout;
    }

    public final kotlinx.coroutines.p0 R() {
        kotlinx.coroutines.p0 p0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDispatcherInUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f304998o;
        if ((view != null ? view.findViewById(com.tencent.mm.R.id.exu) : null) == null) {
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            p0Var = kotlinx.coroutines.internal.b0.f310484a;
        } else {
            kotlinx.coroutines.p0 p0Var3 = kotlinx.coroutines.q1.f310568a;
            p0Var = ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDispatcherInUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return p0Var;
    }

    public final android.animation.ValueAnimator S() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGoldAnimAnimator", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.animation.ValueAnimator valueAnimator = this.R;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGoldAnimAnimator", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return valueAnimator;
    }

    public final com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder T() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHolder", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHolder", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return this.f305007x;
    }

    public final android.view.ViewGroup U() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagAfterLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.C).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagAfterLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup V() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagBeforeLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.A).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagBeforeLikeContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return viewGroup;
    }

    public final android.view.ViewGroup W() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.f305009z).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return viewGroup;
    }

    public final android.widget.TextView X() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagWordAfterLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.D).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagWordAfterLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return textView;
    }

    public final android.widget.TextView Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTagWordBeforeLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.B).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTagWordBeforeLike", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        return textView;
    }

    public final void Z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentLayout", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.widget.LinearLayout Q = Q();
        if (Q != null) {
            Q.setBackground(M());
        }
        android.widget.LinearLayout N = N();
        if (N != null) {
            N.setBackground(M());
        }
        android.view.View view = this.f304998o;
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.emn) : null;
        if (findViewById != null) {
            findViewById.setBackground(new android.graphics.drawable.ColorDrawable(this.L));
        }
        android.view.View findViewById2 = view != null ? view.findViewById(com.tencent.mm.R.id.emr) : null;
        if (findViewById2 != null) {
            findViewById2.setBackground(new android.graphics.drawable.ColorDrawable(this.L));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentLayout", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    public final void a0() {
        java.lang.String str;
        mb4.j0 j17;
        android.content.Context context;
        android.content.res.Resources resources;
        java.lang.String str2;
        mb4.j0 j18;
        java.lang.String str3;
        mb4.j0 j19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLikedAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mars.xlog.Log.i(j(), "setLikedAttitudeView() called");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        h0Var2.f310123d = "";
        if (com.tencent.mm.ui.bk.C()) {
            mb4.r B = B();
            if (B == null || (j17 = B.j()) == null || (str = j17.a()) == null) {
                str = "";
            }
            h0Var.f310123d = str;
            mb4.c C = C();
            java.lang.String str4 = C != null ? C.likedIconDark : null;
            if (str4 == null) {
                str4 = "";
            }
            h0Var2.f310123d = str4;
        } else {
            mb4.r B2 = B();
            if (B2 == null || (j19 = B2.j()) == null || (str3 = j19.a()) == null) {
                str3 = "";
            }
            h0Var.f310123d = str3;
            mb4.c C2 = C();
            java.lang.String str5 = C2 != null ? C2.likedIcon : null;
            if (str5 == null) {
                str5 = "";
            }
            h0Var2.f310123d = str5;
        }
        java.lang.CharSequence charSequence = (java.lang.CharSequence) h0Var.f310123d;
        if (charSequence == null || r26.n0.N(charSequence)) {
            mb4.r B3 = B();
            if (B3 == null || (j18 = B3.j()) == null || (str2 = j18.a()) == null) {
                str2 = "";
            }
            h0Var.f310123d = str2;
        }
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) h0Var2.f310123d;
        if (charSequence2 == null || r26.n0.N(charSequence2)) {
            mb4.c C3 = C();
            java.lang.String str6 = C3 != null ? C3.likedIcon : null;
            h0Var2.f310123d = str6 != null ? str6 : "";
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305000q;
        if (adSocialAttitudeView != null) {
            adSocialAttitudeView.x();
        }
        com.tencent.mm.ui.widget.imageview.WeImageView O = O();
        if (O != null) {
            O.setVisibility(0);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView P = P();
        if (P != null) {
            P.setVisibility(8);
        }
        android.widget.ImageView G = G();
        if (G != null) {
            G.setOutlineProvider(new k84.b3());
        }
        android.widget.ImageView G2 = G();
        if (G2 != null) {
            G2.setClipToOutline(true);
        }
        android.widget.ImageView G3 = G();
        if (G3 != null) {
            G3.setVisibility(0);
        }
        kotlinx.coroutines.y0 h17 = h();
        if (h17 != null) {
            kotlinx.coroutines.l.d(h17, W, null, new k84.c3(h0Var, this, h0Var2, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView2 = this.f305000q;
        if (adSocialAttitudeView2 != null && (context = adSocialAttitudeView2.getContext()) != null && (resources = context.getResources()) != null) {
            int color = resources.getColor(com.tencent.mm.R.color.f478524a5);
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView3 = this.f305000q;
            if (adSocialAttitudeView3 != null) {
                adSocialAttitudeView3.setCheerTextColor(color);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLikedAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    public final void c0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUnlikedAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mars.xlog.Log.i(j(), "setUnlikedAttitudeView() called");
        com.tencent.mm.ui.widget.imageview.WeImageView O = O();
        if (O != null) {
            O.setVisibility(8);
        }
        g0();
        int i17 = this.L;
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305000q;
        if (adSocialAttitudeView != null) {
            adSocialAttitudeView.setCheerTextColor(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUnlikedAttitudeView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x01b7, code lost:
    
        if (r8 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0234, code lost:
    
        if (r5 != null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0172, code lost:
    
        if (r10 != null) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0466  */
    /* JADX WARN: Type inference failed for: r2v51, types: [n74.r] */
    /* JADX WARN: Type inference failed for: r6v5, types: [kotlin.coroutines.Continuation, yz5.p] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(java.lang.Object r35, boolean r36) {
        /*
            Method dump skipped, instructions count: 1394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.d4.d(java.lang.Object, boolean):void");
    }

    public final void d0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mars.xlog.Log.i(j(), "startAnim");
        kotlinx.coroutines.r2 r2Var = this.U;
        kotlinx.coroutines.y0 h17 = h();
        kotlinx.coroutines.r2 d17 = h17 != null ? kotlinx.coroutines.l.d(h17, W, null, new k84.m3(this, r2Var, null), 2, null) : null;
        this.U = d17;
        if (d17 != null) {
            d17.p(new k84.n3(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnim", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0() {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.d4.e0():void");
    }

    public final void f0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopTopPag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mars.xlog.Log.i(j(), "stop top pag");
        com.tencent.mm.view.MMPAGView H = H();
        if (H != null) {
            H.n();
        }
        com.tencent.mm.view.MMPAGView H2 = H();
        if (H2 != null) {
            H2.setVisibility(4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopTopPag", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if ((r2.length() > 0) == true) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0() {
        /*
            r6 = this;
            java.lang.String r0 = "tryShowLikeIcon"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            kotlinx.coroutines.flow.j2 r2 = r6.O
            kotlinx.coroutines.flow.h3 r2 = (kotlinx.coroutines.flow.h3) r2
            java.lang.Object r2 = r2.getValue()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto Lae
            k84.e4 r2 = k84.e4.f305021d
            java.lang.Object r3 = r6.i()
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = (com.tencent.mm.plugin.sns.storage.SnsInfo) r3
            if (r3 == 0) goto L27
            java.lang.String r3 = a84.d0.c(r3)
            goto L29
        L27:
            java.lang.String r3 = ""
        L29:
            java.lang.Object r2 = r2.b(r3)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)
            if (r2 != 0) goto L37
            goto Lae
        L37:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r6.P()
            if (r2 != 0) goto L3e
            goto L43
        L3e:
            r4 = 8
            r2.setVisibility(r4)
        L43:
            mb4.r r2 = r6.B()
            r4 = 0
            if (r2 == 0) goto L63
            mb4.t r2 = r2.c()
            if (r2 == 0) goto L63
            java.lang.String r2 = r2.a()
            if (r2 == 0) goto L63
            int r2 = r2.length()
            r5 = 1
            if (r2 <= 0) goto L5f
            r2 = r5
            goto L60
        L5f:
            r2 = r4
        L60:
            if (r2 != r5) goto L63
            goto L64
        L63:
            r5 = r4
        L64:
            if (r5 == 0) goto L7b
            java.lang.String r2 = r6.j()
            java.lang.String r3 = "tryShowLikeIcon has pagThumbUrl"
            com.tencent.mars.xlog.Log.i(r2, r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r6.P()
            if (r2 != 0) goto L77
            goto Laa
        L77:
            r2.setVisibility(r4)
            goto Laa
        L7b:
            java.lang.String r2 = r6.j()
            java.lang.String r5 = "tryShowLikeIcon no pagThumbUrl"
            com.tencent.mars.xlog.Log.i(r2, r5)
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView r2 = r6.f305000q
            if (r2 == 0) goto L92
            boolean r2 = r2.u(r4)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            goto L93
        L92:
            r2 = 0
        L93:
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)
            if (r2 == 0) goto Laa
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView r2 = r6.f305000q
            if (r2 == 0) goto La0
            r2.x()
        La0:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r6.P()
            if (r2 != 0) goto La7
            goto Laa
        La7:
            r2.setVisibility(r4)
        Laa:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        Lae:
            java.lang.String r2 = r6.j()
            java.lang.String r3 = "do not show like icon"
            com.tencent.mars.xlog.Log.i(r2, r3)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.d4.g0():void");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void p(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        kotlin.jvm.internal.o.g(model, "model");
        super.p(model);
        com.tencent.mars.xlog.Log.i(j(), "onDetach");
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f305007x;
        if (baseViewHolder != null && (baseTimeLineItem = baseViewHolder.f169283m0) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnCommentInflateCallback", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
            baseTimeLineItem.f169254n = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnCommentInflateCallback", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem baseTimeLineItem;
        android.widget.LinearLayout E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        android.widget.RelativeLayout I = I();
        if (I != null) {
            I.setVisibility(8);
        }
        android.widget.FrameLayout D = D();
        if (D != null) {
            D.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f305000q;
        if (adSocialAttitudeView != null) {
            adSocialAttitudeView.setPendingFillItem(false);
        }
        android.widget.RelativeLayout I2 = I();
        if (I2 != null) {
            I2.setTranslationY(0.0f);
        }
        android.widget.RelativeLayout I3 = I();
        if (I3 != null) {
            I3.setAlpha(1.0f);
        }
        android.widget.ImageView G = G();
        if (G != null) {
            G.setAlpha(1.0f);
        }
        androidx.appcompat.widget.AppCompatButton A = A();
        if (A != null) {
            A.setAlpha(1.0f);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdAlbumCommentListBottomBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        android.view.View view = this.f304999p;
        android.widget.FrameLayout frameLayout = view != null ? (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.f482622cm5) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdAlbumCommentListBottomBg", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        if (frameLayout != null) {
            frameLayout.setTranslationY(0.0f);
        }
        android.animation.ValueAnimator valueAnimator = this.Q;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        android.widget.LinearLayout N = N();
        if (N != null) {
            N.setBackground(M());
        }
        if (this.f305003t == 0 && (E = E()) != null) {
            E.setPadding(0, 0, 0, a84.d0.a(0));
        }
        android.widget.ImageView G2 = G();
        if (G2 != null) {
            G2.setVisibility(8);
        }
        android.view.ViewGroup W2 = W();
        if (W2 != null) {
            W2.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = this.f305007x;
        if (baseViewHolder != null && (baseTimeLineItem = baseViewHolder.f169283m0) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnCommentInflateCallback", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
            baseTimeLineItem.f169254n = null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnCommentInflateCallback", "com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem");
        }
        android.view.View F = F();
        android.view.ViewGroup.LayoutParams layoutParams = F != null ? F.getLayoutParams() : null;
        android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.topMargin = 0;
        }
        if (layoutParams2 != null) {
            layoutParams2.bottomMargin = 0;
        }
        android.view.View F2 = F();
        if (F2 != null) {
            F2.requestLayout();
        }
        com.tencent.mm.ui.widget.imageview.WeImageView P = P();
        if (P != null) {
            P.setImageResource(com.tencent.mm.R.drawable.cqv);
        }
        ((kotlinx.coroutines.flow.h3) this.O).k(java.lang.Boolean.FALSE);
        f0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdFireworkCheerComponent");
    }
}
