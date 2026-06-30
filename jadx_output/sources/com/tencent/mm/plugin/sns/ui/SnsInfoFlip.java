package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsInfoFlip extends com.tencent.mm.plugin.sns.ui.FlipView implements com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener, db5.c8, com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleChangeReportListener {

    /* renamed from: o2, reason: collision with root package name */
    public static final /* synthetic */ int f167186o2 = 0;
    public boolean A1;
    public boolean B1;
    public boolean C1;
    public boolean D1;
    public boolean E1;
    public boolean F1;
    public android.view.View G1;
    public android.widget.TextView H1;
    public android.widget.TextView I1;
    public java.util.List J1;
    public boolean K1;
    public float L1;
    public com.tencent.mm.ui.base.MMPageControlView M1;
    public java.lang.Runnable N1;
    public final com.tencent.mm.sdk.platformtools.n3 O1;
    public java.lang.String P1;
    public int Q1;
    public int R1;
    public boolean S1;
    public boolean T1;
    public long U1;
    public android.content.Context V;
    public int V1;
    public com.tencent.mm.ui.base.MMViewPager W;
    public boolean W1;
    public boolean X1;
    public final java.util.HashMap Y1;
    public com.tencent.mm.plugin.sns.ui.nj Z1;

    /* renamed from: a2, reason: collision with root package name */
    public int f167187a2;

    /* renamed from: b2, reason: collision with root package name */
    public boolean f167188b2;

    /* renamed from: c2, reason: collision with root package name */
    public android.view.View f167189c2;

    /* renamed from: d2, reason: collision with root package name */
    public db5.a8 f167190d2;

    /* renamed from: e2, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.ak f167191e2;

    /* renamed from: f2, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.zj f167192f2;

    /* renamed from: g2, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.yj f167193g2;

    /* renamed from: h2, reason: collision with root package name */
    public final java.util.HashMap f167194h2;

    /* renamed from: i2, reason: collision with root package name */
    public com.tencent.mm.ui.widget.TouchMediaPreviewLayout f167195i2;

    /* renamed from: j2, reason: collision with root package name */
    public boolean f167196j2;

    /* renamed from: k2, reason: collision with root package name */
    public boolean f167197k2;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f167198l1;

    /* renamed from: l2, reason: collision with root package name */
    public final java.util.HashSet f167199l2;

    /* renamed from: m2, reason: collision with root package name */
    public final java.util.HashMap f167200m2;

    /* renamed from: n2, reason: collision with root package name */
    public final java.util.HashMap f167201n2;

    /* renamed from: p0, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.bk f167202p0;

    /* renamed from: p1, reason: collision with root package name */
    public final java.util.HashMap f167203p1;

    /* renamed from: x0, reason: collision with root package name */
    public db5.f0 f167204x0;

    /* renamed from: x1, reason: collision with root package name */
    public final java.util.HashMap f167205x1;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f167206y0;

    /* renamed from: y1, reason: collision with root package name */
    public final java.util.HashMap f167207y1;

    /* renamed from: z1, reason: collision with root package name */
    public final java.util.HashMap f167208z1;

    public SnsInfoFlip(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f167206y0 = false;
        this.f167198l1 = true;
        this.f167203p1 = new java.util.HashMap();
        this.f167205x1 = new java.util.HashMap();
        this.f167207y1 = new java.util.HashMap();
        this.f167208z1 = new java.util.HashMap();
        this.A1 = false;
        this.B1 = false;
        this.C1 = false;
        this.D1 = false;
        this.E1 = false;
        this.F1 = true;
        this.K1 = true;
        this.L1 = 1.0f;
        this.N1 = null;
        this.O1 = new com.tencent.mm.sdk.platformtools.n3();
        this.P1 = "";
        this.Q1 = -1;
        this.R1 = -1;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0L;
        this.V1 = 0;
        this.W1 = true;
        this.X1 = false;
        this.Y1 = new java.util.HashMap();
        this.Z1 = null;
        this.f167187a2 = 0;
        this.f167188b2 = false;
        this.f167190d2 = null;
        this.f167194h2 = new java.util.HashMap();
        this.f167196j2 = false;
        this.f167197k2 = false;
        this.f167199l2 = new java.util.HashSet();
        this.f167200m2 = new java.util.HashMap();
        this.f167201n2 = new java.util.HashMap();
        p(context);
    }

    public static /* synthetic */ com.tencent.mm.ui.base.MMPageControlView A(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.ui.base.MMPageControlView mMPageControlView = snsInfoFlip.M1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return mMPageControlView;
    }

    public static /* synthetic */ db5.f0 B(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        db5.f0 f0Var = snsInfoFlip.f167204x0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return f0Var;
    }

    public static /* synthetic */ db5.f0 C(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip, db5.f0 f0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        snsInfoFlip.f167204x0 = f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return f0Var;
    }

    public static /* synthetic */ boolean D(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z17 = snsInfoFlip.X1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    public static /* synthetic */ java.util.List E(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        java.util.List list = snsInfoFlip.J1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return list;
    }

    public static void F(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        snsInfoFlip.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("exit", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        android.content.Context context = snsInfoFlip.V;
        if (context instanceof com.tencent.mm.plugin.sns.ui.SnsBrowseUI) {
            ((com.tencent.mm.plugin.sns.ui.SnsBrowseUI) context).v7();
        } else {
            if (context instanceof com.tencent.mm.plugin.sns.ui.SnsGalleryUI) {
                com.tencent.mm.plugin.sns.ui.SnsGalleryUI snsGalleryUI = (com.tencent.mm.plugin.sns.ui.SnsGalleryUI) context;
                if (snsGalleryUI.X) {
                    snsGalleryUI.z7();
                }
            }
            if (context instanceof com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI) {
                ((com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowUI) context).D7();
            } else {
                if (snsInfoFlip.B1) {
                    ((com.tencent.mm.ui.MMActivity) context).finish();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exit", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                }
                snsInfoFlip.O1.post(new com.tencent.mm.plugin.sns.ui.pj(snsInfoFlip));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("exit", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public static void G(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, r45.jj4 jj4Var) {
        int i17;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        snsInfoFlip.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLivePhotoPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int i18 = 0;
        if (snsInfo != null) {
            int i19 = snsInfo.field_type;
            str = ca4.z0.t0(snsInfo.field_snsId);
            i17 = i19;
        } else {
            i17 = 0;
            str = "";
        }
        java.lang.String str2 = jj4Var.f377855d;
        java.util.HashMap hashMap = snsInfoFlip.f167208z1;
        java.lang.String str3 = hashMap.containsKey(str2) ? (java.lang.String) hashMap.get(jj4Var.f377855d) : "";
        if (snsInfoFlip.C == com.tencent.mm.storage.s7.d()) {
            i18 = 3;
        } else if (snsInfoFlip.C == new com.tencent.mm.storage.s7("comment_detail")) {
            i18 = 5;
        } else if (snsInfoFlip.D == 7) {
            i18 = 2;
        }
        ke4.a.f307025a.c(2, str3, i18, jj4Var.f377855d, ca4.z0.l(), i17, str, ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni(), (int) jj4Var.X.R);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLivePhotoPlay", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public static /* synthetic */ boolean H(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z17 = snsInfoFlip.S1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    public static /* synthetic */ java.util.HashMap I(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        java.util.HashMap hashMap = snsInfoFlip.f167194h2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return hashMap;
    }

    public static /* synthetic */ java.util.HashMap J(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        java.util.HashMap hashMap = snsInfoFlip.Y1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return hashMap;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.bk K(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.bk bkVar = snsInfoFlip.f167202p0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return bkVar;
    }

    public static /* synthetic */ com.tencent.mm.ui.base.MMViewPager L(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.ui.base.MMViewPager mMViewPager = snsInfoFlip.W;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return mMViewPager;
    }

    public static /* synthetic */ r45.jj4 M(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        r45.jj4 mediaObj = snsInfoFlip.getMediaObj();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return mediaObj;
    }

    public static /* synthetic */ com.tencent.mm.ui.widget.TouchMediaPreviewLayout N(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = snsInfoFlip.f167195i2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return touchMediaPreviewLayout;
    }

    public static void O(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip, android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        snsInfoFlip.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("scaleTouchView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (view instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView) {
            com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) view;
            snsInfoFlip.q0(onlineVideoView.getRoot(), onlineVideoView.getVideoView());
        } else {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            if (viewGroup.getChildAt(0) instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView) {
                com.tencent.mm.plugin.sns.ui.OnlineVideoView onlineVideoView2 = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) viewGroup.getChildAt(0);
                snsInfoFlip.q0(onlineVideoView2.getRoot(), onlineVideoView2.getVideoView());
            } else if (viewGroup.getChildAt(0) instanceof com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) {
                com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView flexibleVideoView = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView) viewGroup.getChildAt(0);
                snsInfoFlip.q0(flexibleVideoView, flexibleVideoView);
            } else if (viewGroup.getChildAt(0) instanceof com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView) {
                com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView) viewGroup.getChildAt(0);
                snsInfoFlip.q0(flexibleLivePhotoView.getScaleMediaParent(), flexibleLivePhotoView.getScaleMediaParent());
            } else if (viewGroup.getChildAt(0) instanceof y51.c) {
                y51.b bVar = (y51.b) ((y51.c) viewGroup.getChildAt(0));
                snsInfoFlip.q0(bVar.getScaleParent(), bVar.getScaleParent());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("scaleTouchView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.zj P(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.zj zjVar = snsInfoFlip.f167192f2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return zjVar;
    }

    public static /* synthetic */ boolean Q(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z17 = snsInfoFlip.A1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    public static java.lang.String e0(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("packageReportKey", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        java.lang.String str2 = str + "_" + i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("packageReportKey", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return str2;
    }

    private r45.jj4 getMediaObj() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        r45.m33 selectItem = getSelectItem();
        if (selectItem == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        r45.jj4 jj4Var = selectItem.f380109d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObj", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return jj4Var;
    }

    private int getReportNetworkType() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (com.tencent.mars.comm.NetStatusUtil.is2G(context)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 1;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is3G(context)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 2;
        }
        if (com.tencent.mars.comm.NetStatusUtil.is4G(context)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 3;
        }
        if (com.tencent.mars.comm.NetStatusUtil.isWifi(context)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 4;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReportNetworkType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return 0;
    }

    private void p(android.content.Context context) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.U1 = java.lang.System.currentTimeMillis();
        this.V = context;
        com.tencent.mm.ui.base.MMViewPager mMViewPager = (com.tencent.mm.ui.base.MMViewPager) android.view.View.inflate(context, com.tencent.mm.R.layout.cs6, this).findViewById(com.tencent.mm.R.id.ghs);
        this.W = mMViewPager;
        mMViewPager.setVerticalFadingEdgeEnabled(false);
        this.W.setHorizontalFadingEdgeEnabled(false);
        this.W.setOffscreenPageLimit(1);
        this.W.setSingleClickOverListener(new com.tencent.mm.plugin.sns.ui.qj(this));
        this.W.setScaleFinishListener(this);
        this.W.setScaleChangeReportListener(this);
        com.tencent.mm.ui.base.MMPageControlView mMPageControlView = (com.tencent.mm.ui.base.MMPageControlView) findViewById(com.tencent.mm.R.id.plr);
        this.M1 = mMPageControlView;
        mMPageControlView.setIndicatorLayoutRes(com.tencent.mm.R.layout.f489534cv4);
        this.G1 = findViewById(com.tencent.mm.R.id.t2k);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vfu);
        this.H1 = textView;
        com.tencent.mm.ui.dl.i(textView.getPaint());
        this.I1 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.vfx);
        android.view.View view = this.G1;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.G1.setBackground(new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Integer.MIN_VALUE, 0}));
        }
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.M1.getLayoutParams();
        int c17 = layoutParams.bottomMargin + com.tencent.mm.ui.bl.c(getContext());
        layoutParams.bottomMargin = c17;
        this.f167187a2 = c17 + i65.a.b(getContext(), 6);
        this.M1.setLayoutParams(layoutParams);
        ca4.z0.f40069b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_big_pic_bound, 3200);
        com.tencent.mm.plugin.sns.ui.nj njVar = new com.tencent.mm.plugin.sns.ui.nj(context);
        this.Z1 = njVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAlive", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageTransSheetManager", "onAlive");
        njVar.f170015b.alive();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAlive", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public static /* synthetic */ boolean z(com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z17 = snsInfoFlip.D1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    public android.util.Pair R(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        android.view.View e17 = this.f167202p0.e(i17);
        if (e17 instanceof android.view.ViewGroup) {
            boolean z17 = false;
            android.view.View childAt = ((android.view.ViewGroup) e17).getChildAt(0);
            if (childAt instanceof com.tencent.mm.ui.widget.cropview.DragExitCropLayout) {
                childAt = ((android.view.ViewGroup) childAt).getChildAt(0);
                z17 = true;
            }
            if (childAt instanceof com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "getLivePhotoView >> pos: %d is %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(childAt.hashCode()));
                android.util.Pair pair = new android.util.Pair((com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView) childAt, java.lang.Boolean.valueOf(z17));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                return pair;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.SnsInfoFlip", "getLivePhotoView >> pos: %d is null", java.lang.Integer.valueOf(i17));
        android.util.Pair pair2 = new android.util.Pair(null, java.lang.Boolean.FALSE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return pair2;
    }

    public void S() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar imgBottomBarView = getImgBottomBarView();
        if (imgBottomBarView != null && imgBottomBarView.getVisibility() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "hideImgBottomBarView >> position: %d", java.lang.Integer.valueOf(getPosition()));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(imgBottomBarView, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "hideImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imgBottomBarView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(imgBottomBarView, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "hideImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (this.D1 && (view = this.G1) != null && view.getVisibility() == 0) {
            android.view.View view2 = this.G1;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "hideImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "hideImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        r0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public boolean T(r45.jj4 jj4Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLivePhotoMedia", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z17 = jj4Var.X != null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLivePhotoMedia", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    public boolean U(r45.jj4 jj4Var) {
        boolean z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isOnlineLivePhoto", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (jj4Var.X != null) {
            android.os.Vibrator vibrator = ca4.z0.f40068a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isLocalLivePhoto", "com.tencent.mm.plugin.sns.data.SnsUtil");
            boolean startsWith = jj4Var.f377855d.startsWith("pre_temp_sns_live_photo");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isLocalLivePhoto", "com.tencent.mm.plugin.sns.data.SnsUtil");
            if (!startsWith) {
                z17 = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlineLivePhoto", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                return z17;
            }
        }
        z17 = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isOnlineLivePhoto", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    public final void V() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("longClickAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (!this.f167198l1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("longClickAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        com.tencent.mm.plugin.sns.ui.bk bkVar = this.f167202p0;
        if (bkVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoFlip", "longClickOver, adapter is null.");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("longClickAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        r45.m33 m17 = bkVar.m(this.W.getCurrentItem());
        if (m17 == null || (com.tencent.mm.sdk.platformtools.t8.K0(m17.f380110e) && !w())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("longClickAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        android.view.View.OnLongClickListener onLongClickListener = this.F;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(this.W);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "longClick %b", java.lang.Boolean.valueOf(m17.f380113h));
        if (m17.f380113h) {
            p0(m17);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("longClickAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct galleryTranslateReportStruct = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct();
        galleryTranslateReportStruct.f58317e = 1L;
        if (this.S1) {
            galleryTranslateReportStruct.f58318f = 6L;
        } else {
            galleryTranslateReportStruct.f58318f = 7L;
        }
        r45.jj4 jj4Var = this.f167202p0.m(this.W.getCurrentItem()).f380109d;
        galleryTranslateReportStruct.q(jj4Var.f377858g);
        galleryTranslateReportStruct.k();
        x(jj4Var, com.tencent.mm.plugin.sns.model.i1.l(jj4Var), m17.f380110e, jj4Var.f377855d, 1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("longClickAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void W() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.bk bkVar = this.f167202p0;
        if (bkVar != null) {
            bkVar.notifyDataSetChanged();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyDataSetChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void X(java.util.List list, java.lang.String str, int i17, com.tencent.mm.plugin.sns.ui.s4 s4Var, com.tencent.mm.plugin.sns.ui.n4 n4Var) {
        r45.lj4 lj4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.model.l4.Cj().c(this);
        this.J1 = list;
        int i18 = com.tencent.mm.plugin.sns.model.s5.f164676d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSelf", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        c01.z1.r().equals(str.trim());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSelf", "com.tencent.mm.plugin.sns.model.SnsInfoStorageLogic");
        this.f166279g = s4Var;
        this.f166280h = n4Var;
        com.tencent.mm.plugin.sns.ui.bk bkVar = new com.tencent.mm.plugin.sns.ui.bk(this, this.V);
        this.f167202p0 = bkVar;
        this.W.setAdapter(bkVar);
        if (i17 >= 0 && i17 < this.J1.size()) {
            this.W.setCurrentItem(i17);
            if (this.K1) {
                this.K1 = false;
                r45.jj4 jj4Var = this.f167202p0.m(i17).f380109d;
                if (jj4Var != null && (lj4Var = jj4Var.f377865p) != null) {
                    float f17 = lj4Var.f379521e;
                    if (f17 > 0.0f) {
                        this.L1 = lj4Var.f379520d / f17;
                    }
                }
                this.L1 = 1.0f;
            }
        }
        this.W.setFadingEdgeLength(0);
        this.W.setOnPageChangeListener(new com.tencent.mm.plugin.sns.ui.uj(this));
        this.W.setOnTouchListener(new com.tencent.mm.plugin.sns.ui.vj(this));
        db5.a8 a8Var = this.f167190d2;
        if (a8Var != null) {
            this.W.setLongClickOverListener(a8Var);
        } else if (this.f167198l1) {
            this.W.setLongClickOverListener(new com.tencent.mm.plugin.sns.ui.wj(this));
        }
        if (this.f167188b2) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTouchLayout", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            com.tencent.mm.ui.widget.TouchMediaPreviewLayout touchMediaPreviewLayout = new com.tencent.mm.ui.widget.TouchMediaPreviewLayout(getContext());
            this.f167195i2 = touchMediaPreviewLayout;
            android.view.View view = this.f167189c2;
            kotlin.jvm.internal.o.g(view, "view");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            android.view.View childAt = viewGroup.getChildAt(0);
            viewGroup.removeView(childAt);
            touchMediaPreviewLayout.addView(childAt, 0);
            viewGroup.addView(touchMediaPreviewLayout, 0);
            this.f167195i2.setScaleListener(new com.tencent.mm.plugin.sns.ui.sj(this));
            this.f167195i2.setDoubleTapListener(new com.tencent.mm.plugin.sns.ui.tj(this));
            r0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTouchLayout", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        }
        if (this.A1 && this.f167202p0.getCount() > 1 && !this.D1) {
            this.M1.setVisibility(0);
            com.tencent.mm.ui.base.MMPageControlView mMPageControlView = this.M1;
            mMPageControlView.f197514e = this.f167202p0.getCount();
            mMPageControlView.a(i17);
        }
        if (this.T1 && !com.tencent.mm.sdk.platformtools.t8.K0(this.f167202p0.m(i17).f380110e)) {
            r45.jj4 jj4Var2 = this.f167202p0.m(i17).f380109d;
            java.lang.String str2 = jj4Var2.f377855d;
            final java.lang.String l17 = com.tencent.mm.plugin.sns.model.i1.l(this.f167202p0.m(i17).f380109d);
            if (jj4Var2.X != null) {
                android.content.Context context = this.V;
                android.content.DialogInterface.OnClickListener onClickListener = new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$$a
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(android.content.DialogInterface dialogInterface, int i19) {
                        int i27 = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.f167186o2;
                        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.this;
                        snsInfoFlip.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onAttach$2", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        snsInfoFlip.n(l17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onAttach$2", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    }
                };
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showEditLiveAlert", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoUIHelper");
                kotlin.jvm.internal.o.g(context, "context");
                db5.e1.C(context, i65.a.r(context, com.tencent.mm.R.string.ojq), "", i65.a.r(context, com.tencent.mm.R.string.ojp), i65.a.r(context, com.tencent.mm.R.string.f490347sg), false, onClickListener, ke4.d.f307039d);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showEditLiveAlert", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoUIHelper");
            } else {
                n(l17);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAttach", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void Y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mars.xlog.Log.i("MicroMsg.FlipView", "onDestroy: ");
        this.L.dead();
        this.M.dead();
        this.N.dead();
        com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent releaseDealQBarStrEvent = new com.tencent.mm.autogen.events.ReleaseDealQBarStrEvent();
        releaseDealQBarStrEvent.f54672g.f7446a = (android.app.Activity) this.f166283n;
        releaseDealQBarStrEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mm.plugin.sns.ui.bk bkVar = this.f167202p0;
        if (bkVar != null) {
            bkVar.h();
            this.f167202p0 = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void Z() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "sns info flip on detach.");
        com.tencent.mm.plugin.sns.ui.bk bkVar = this.f167202p0;
        if (bkVar != null) {
            bkVar.p();
            this.f167202p0.i();
            com.tencent.mm.plugin.sns.ui.bk bkVar2 = this.f167202p0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            bkVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("releaseAdapterHoldLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            android.util.SparseArray sparseArray = K(bkVar2.f167925r).f228471f;
            for (int i17 = 0; i17 < sparseArray.size(); i17++) {
                java.lang.Object valueAt = sparseArray.valueAt(i17);
                if (valueAt instanceof android.view.View) {
                    bkVar2.s((android.view.View) valueAt);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("releaseAdapterHoldLivePhotoVideoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3500", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
        }
        com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDetach", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a0(r45.jj4 r23, int r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.SnsInfoFlip.a0(r45.jj4, int, java.lang.String):void");
    }

    public void b0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.FlipView");
        this.f166291v = null;
        this.f166292w = "";
        this.f166293x = null;
        this.f166294y = null;
        if (this.B != null) {
            com.tencent.mm.autogen.events.CancelDealQBarStrEvent cancelDealQBarStrEvent = new com.tencent.mm.autogen.events.CancelDealQBarStrEvent();
            android.app.Activity activity = (android.app.Activity) this.f166283n;
            am.p1 p1Var = cancelDealQBarStrEvent.f54025g;
            p1Var.f7594b = activity;
            p1Var.f7593a = this.B.f158619d;
            cancelDealQBarStrEvent.e();
            this.B = null;
        }
        this.A.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.FlipView");
        com.tencent.mm.plugin.sns.ui.bk bkVar = this.f167202p0;
        if (bkVar != null) {
            bkVar.p();
            this.f167202p0.i();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void c0(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.bk bkVar = this.f167202p0;
        if (bkVar != null) {
            if (z17) {
                bkVar.notifyDataSetChanged();
            }
            d0();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onRefresh", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public final void d0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.bk bkVar = this.f167202p0;
        if (bkVar == null || bkVar.m(this.W.getCurrentItem()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        int currentItem = this.W.getCurrentItem();
        if (this.A1 && this.f167202p0.getCount() > 1 && !this.D1) {
            this.M1.setVisibility(0);
            this.M1.setPage(currentItem);
        }
        r45.jj4 jj4Var = this.f167202p0.m(this.W.getCurrentItem()).f380109d;
        this.f167199l2.add(jj4Var.f377855d);
        java.lang.String str = this.f167202p0.m(this.W.getCurrentItem()).f380110e;
        java.lang.String str2 = jj4Var.f377855d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetFailId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.P1) || !this.P1.equals(str2)) {
            this.P1 = "";
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetFailId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetFailId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        }
        a0(jj4Var, currentItem, str);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void f0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordLoadCancel", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (!this.S1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordLoadCancel", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        java.util.HashMap hashMap = this.f167200m2;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport recordLoadCancel >> reportInfoMapSize：%d", java.lang.Integer.valueOf(hashMap.size()));
        hashMap.forEach(new java.util.function.BiConsumer() { // from class: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$$b
            @Override // java.util.function.BiConsumer
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                int i17 = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.f167186o2;
                com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.this;
                snsInfoFlip.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$recordLoadCancel$4", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport recordLoadCancel key:%s", (java.lang.String) obj);
                snsInfoFlip.j0((com.tencent.mm.plugin.sns.ui.xj) obj2, 2);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$recordLoadCancel$4", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            }
        });
        hashMap.clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordLoadCancel", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public final void g0(java.lang.String str, r45.jj4 jj4Var, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordLoadStart", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (jj4Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoFlip", "recordLoadStart error for null media");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordLoadStart", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        if (!this.S1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordLoadStart", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        java.lang.String str2 = jj4Var.f377855d;
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.SnsInfoFlip", "BigImageReport recordLoadStart, snsId:%s, mediaId:%s downloadType:%d reason:%d downloadScene:%d", str, str2, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(i27));
        java.lang.String e07 = e0(str2, i18);
        com.tencent.mm.plugin.sns.ui.xj xjVar = new com.tencent.mm.plugin.sns.ui.xj();
        xjVar.f171518a = getCount();
        xjVar.f171526i = str;
        xjVar.f171520c = getReportNetworkType();
        xjVar.f171523f = java.lang.System.currentTimeMillis();
        xjVar.f171522e = jj4Var;
        xjVar.f171527j = i18;
        xjVar.f171528k = i19;
        if (i27 == 0) {
            xjVar.f171521d = i27;
            java.util.HashMap hashMap = this.f167200m2;
            if (!hashMap.containsKey(e07)) {
                hashMap.put(e07, xjVar);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport recordLoadStart, put to report map key: %s", e07);
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport recordLoadStart, put to need load map key: %s", str2);
            this.f167201n2.put(str2, xjVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordLoadStart", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.tencent.mm.plugin.sns.ui.FlipView
    public r45.jj4 getCntMedia() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCntMedia", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (this.f167202p0 != null) {
            int currentItem = this.W.getCurrentItem();
            java.util.List list = this.J1;
            if (list != null && currentItem < list.size()) {
                r45.jj4 jj4Var = this.f167202p0.m(currentItem).f380109d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCntMedia", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                return jj4Var;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCntMedia", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return null;
    }

    public int getCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.bk bkVar = this.f167202p0;
        if (bkVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 0;
        }
        int count = bkVar.getCount();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return count;
    }

    public r45.m33 getCurrentFlipItem() {
        java.util.List list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentFlipItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int currentItem = this.W.getCurrentItem();
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "getCurrentFlipItem pos: %d size: %d", java.lang.Integer.valueOf(currentItem), java.lang.Integer.valueOf(this.J1.size()));
        if (currentItem < 0 || (list = this.J1) == null || list.size() <= currentItem) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentFlipItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        r45.m33 m33Var = (r45.m33) this.J1.get(currentItem);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentFlipItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return m33Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.FlipView
    public android.view.View getCurrentImageView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        java.lang.Object obj = this.f167204x0;
        if (!(obj instanceof android.view.View)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        android.view.View view = (android.view.View) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return view;
    }

    public android.view.View getCurrentView() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.bk bkVar = this.f167202p0;
        if (bkVar == null || (i17 = this.R1) == -1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        android.view.View e17 = bkVar.e(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return e17;
    }

    public java.util.List<r45.m33> getFlipList() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFlipList", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        java.util.List<r45.m33> list = this.J1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFlipList", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return list;
    }

    public com.tencent.mm.storage.s7 getFromScene() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.storage.s7 s7Var = this.C;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return s7Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.FlipView
    public com.tencent.mm.ui.base.MMViewPager getGallery() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGallery", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.W;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGallery", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return mMViewPager;
    }

    public com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar getImgBottomBarView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        android.view.View currentView = getCurrentView();
        if (!(currentView instanceof android.view.ViewGroup)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) currentView;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar) {
                com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar snsBaseImgBottomBar = (com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar) childAt;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                return snsBaseImgBottomBar;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return null;
    }

    public int getNumOfFileExist() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNumOfFileExist", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int i17 = 0;
        int i18 = 0;
        for (r45.m33 m33Var : this.J1) {
            com.tencent.mm.plugin.sns.model.l4.hj();
            if (com.tencent.mm.vfs.w6.j(com.tencent.mm.plugin.sns.model.i1.l(m33Var.f380109d))) {
                i17++;
            }
            i18++;
            if (i18 > 9) {
                break;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNumOfFileExist", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return i17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.FlipView
    public int getPosition() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int i17 = this.R1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return i17;
    }

    public int getSelectCount() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int size = this.f167199l2.size();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectCount", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return size;
    }

    public java.lang.String getSelectId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        r45.m33 selectItem = getSelectItem();
        if (selectItem == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        java.lang.String str = selectItem.f380110e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return str;
    }

    public r45.m33 getSelectItem() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.W;
        if (mMViewPager == null || this.f167202p0 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        r45.m33 m17 = this.f167202p0.m(mMViewPager.getCurrentItem());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return m17;
    }

    public com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView getSelectLivePhotoView() {
        r45.jj4 jj4Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        r45.m33 selectItem = getSelectItem();
        if (selectItem == null || (jj4Var = selectItem.f380109d) == null || !U(jj4Var)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView) R(getSelectPos()).first;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectLivePhotoView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return flexibleLivePhotoView;
    }

    public int getSelectPos() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectPos", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.ui.base.MMViewPager mMViewPager = this.W;
        if (mMViewPager == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectPos", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return -1;
        }
        int currentItem = mMViewPager.getCurrentItem();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectPos", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return currentItem;
    }

    @Override // com.tencent.mm.plugin.sns.ui.FlipView
    public java.lang.String getSelectedMediaId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSelectedMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        r45.jj4 cntMedia = getCntMedia();
        if (cntMedia == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return null;
        }
        java.lang.String str = cntMedia.f377855d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSelectedMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return str;
    }

    @Override // com.tencent.mm.plugin.sns.ui.FlipView
    public long getSnsId() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.bk bkVar = this.f167202p0;
        if (bkVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 0L;
        }
        r45.m33 m17 = bkVar.m(this.W.getCurrentItem());
        java.lang.String str = m17 == null ? "" : m17.f380110e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return 0L;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        long j17 = k17 != null ? k17.field_snsId : 0L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return j17;
    }

    public float getWidthModHeight() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWidthModHeight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        float f17 = this.L1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWidthModHeight", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return f17;
    }

    public void h0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("release", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        l0(this.W.getCurrentItem());
        this.W.f197615m.removeMessages(1);
        com.tencent.mm.plugin.sns.ui.nj njVar = this.Z1;
        njVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDead", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsImageTransSheetManager", "onDead");
        njVar.f170015b.dead();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDead", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("release", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.tencent.mm.plugin.sns.ui.FlipView
    public boolean i(float f17, float f18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchXY", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchXY", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return true;
    }

    public boolean i0(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        int i17 = 0;
        if (this.f167202p0 == null || this.J1 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return false;
        }
        while (i17 >= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeInItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            if (this.f167202p0 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeInItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            } else {
                while (i17 < this.J1.size()) {
                    r45.m33 m17 = this.f167202p0.m(i17);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(m17.f380110e) && m17.f380110e.equals(str)) {
                        this.J1.remove(i17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeInItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        break;
                    }
                    i17++;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeInItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            }
            i17 = -1;
        }
        this.f167202p0.notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return true;
    }

    public final void j0(com.tencent.mm.plugin.sns.ui.xj xjVar, int i17) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportBigPicLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        xjVar.f171524g = java.lang.System.currentTimeMillis();
        xjVar.f171520c = getReportNetworkType();
        xjVar.f171525h = xjVar.f171524g - xjVar.f171523f;
        xjVar.f171519b = i17;
        r45.jj4 jj4Var = xjVar.f171522e;
        int i18 = jj4Var.S;
        r45.lj4 lj4Var = new r45.lj4();
        int i19 = xjVar.f171527j;
        if (i19 == 2) {
            lj4Var = jj4Var.f377865p;
            str = "0";
        } else if (i19 == 10) {
            lj4Var = jj4Var.f377882z1;
            str = "2000";
        } else if (i19 == 11) {
            lj4Var = jj4Var.F1;
            str = "1000";
        } else {
            str = "";
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[16];
        objArr[0] = java.lang.Integer.valueOf(xjVar.f171518a);
        objArr[1] = java.lang.Integer.valueOf(xjVar.f171519b);
        objArr[2] = java.lang.Long.valueOf(xjVar.f171525h);
        objArr[3] = java.lang.Integer.valueOf(xjVar.f171520c);
        objArr[4] = java.lang.Integer.valueOf(xjVar.f171521d);
        objArr[5] = java.lang.Float.valueOf(lj4Var.f379522f);
        objArr[6] = xjVar.f171526i;
        objArr[7] = java.lang.Long.valueOf(xjVar.f171523f);
        objArr[8] = java.lang.Float.valueOf(lj4Var.f379520d);
        objArr[9] = java.lang.Float.valueOf(lj4Var.f379521e);
        objArr[10] = java.lang.Float.valueOf(lj4Var.f379522f);
        objArr[11] = java.lang.Integer.valueOf(i18);
        objArr[12] = java.lang.Integer.valueOf(xjVar.f171522e.X != null ? 1 : 0);
        objArr[13] = java.lang.Integer.valueOf(xjVar.f171522e.Y + 1);
        objArr[14] = java.lang.Integer.valueOf(xjVar.f171528k);
        objArr[15] = str;
        g0Var.d(11601, objArr);
        java.lang.Object[] objArr2 = new java.lang.Object[13];
        objArr2[0] = java.lang.Integer.valueOf(xjVar.f171518a);
        objArr2[1] = java.lang.Integer.valueOf(xjVar.f171519b);
        objArr2[2] = java.lang.Long.valueOf(xjVar.f171525h);
        objArr2[3] = java.lang.Integer.valueOf(xjVar.f171520c);
        objArr2[4] = xjVar.f171526i;
        objArr2[5] = java.lang.Long.valueOf(xjVar.f171523f);
        objArr2[6] = java.lang.Float.valueOf(lj4Var.f379520d);
        objArr2[7] = java.lang.Float.valueOf(lj4Var.f379521e);
        objArr2[8] = java.lang.Float.valueOf(lj4Var.f379522f);
        objArr2[9] = java.lang.Integer.valueOf(i18);
        objArr2[10] = "";
        objArr2[11] = java.lang.Boolean.valueOf(xjVar.f171522e.X != null);
        objArr2[12] = java.lang.Integer.valueOf(xjVar.f171522e.Y);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport report big pic load, picNum:%d, loadResult:%d, loadCostTime:%d, networkType:%d ,publishid:%s,startTimes:%d,width:%f,height:%f,size:%f,mediaType:%d,path:%sisLivePhoto:%b,index:%d ", objArr2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportBigPicLoaded", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public final void k0(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17, r45.jj4 jj4Var) {
        java.lang.String str;
        java.lang.String str2;
        int i18;
        int i19;
        int i27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportLivePhotoExposure", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (jj4Var.X != null) {
            java.lang.String str3 = jj4Var.f377855d;
            java.util.HashMap hashMap = this.f167208z1;
            if (hashMap.containsKey(str3)) {
                str = (java.lang.String) hashMap.get(jj4Var.f377855d);
            } else {
                str = jj4Var.f377855d + "_" + java.lang.System.currentTimeMillis();
                hashMap.put(jj4Var.f377855d, str);
            }
            java.lang.String str4 = str;
            if (snsInfo != null) {
                int i28 = snsInfo.field_type;
                str2 = ca4.z0.t0(snsInfo.field_snsId);
                i18 = i28;
            } else {
                str2 = "";
                i18 = 0;
            }
            if (this.C == com.tencent.mm.storage.s7.d()) {
                i27 = 3;
            } else if (this.C == new com.tencent.mm.storage.s7("comment_detail")) {
                i27 = 5;
            } else if (this.D == 7) {
                i27 = 2;
            } else {
                i19 = 0;
                ke4.a.f307025a.b(str4, i18, str2, ca4.z0.l(), i19, jj4Var.f377855d, ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni(), (int) jj4Var.X.R);
            }
            i19 = i27;
            ke4.a.f307025a.b(str4, i18, str2, ca4.z0.l(), i19, jj4Var.f377855d, ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni(), (int) jj4Var.X.R);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportLivePhotoExposure", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public final void l0(int i17) {
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (i17 < 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        r45.m33 m17 = this.f167202p0.m(i17);
        if (m17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        r45.jj4 jj4Var = m17.f380109d;
        if (jj4Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        java.lang.String str = m17.f380110e;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        if (k17 == null || k17.getTimeLine().ContentObj == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        java.util.LinkedList linkedList = k17.getTimeLine().ContentObj.f369840h;
        if (linkedList.isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        int i19 = 0;
        while (true) {
            i18 = -1;
            if (i19 >= linkedList.size()) {
                i19 = -1;
                break;
            } else if (((r45.jj4) linkedList.get(i19)).f377855d.equals(jj4Var.f377855d)) {
                break;
            } else {
                i19++;
            }
        }
        java.lang.String t07 = ca4.z0.t0(k17.field_snsId);
        int i27 = jj4Var.f377856e == 6 || T(jj4Var) ? 2 : 1;
        ta4.f1 f1Var = ta4.f1.f416743a;
        int i28 = this.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("snsUIScene2Report", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
        if (i28 == 1) {
            i18 = 3;
        } else if (i28 == 2) {
            i18 = 4;
        } else if (i28 == 4 || i28 == 5) {
            i18 = 5;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("snsUIScene2Report", "com.tencent.mm.plugin.sns.report.SnsScaleReporter");
        f1Var.b(i18, i27, t07, i19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportScaleAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public boolean m0(db5.f0 f0Var, int i17) {
        com.tencent.mm.plugin.sns.ui.yj yjVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFirstViewLoad", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (f0Var == null || !this.W1 || (yjVar = this.f167193g2) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFirstViewLoad", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return false;
        }
        this.W1 = false;
        yjVar.a(f0Var, i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFirstViewLoad", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return true;
    }

    public void n0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPageControlGone", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.ui.base.MMPageControlView mMPageControlView = this.M1;
        if (mMPageControlView != null) {
            mMPageControlView.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPageControlGone", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void o0() {
        java.lang.Integer num;
        int i17;
        java.lang.Float f17;
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar imgBottomBarView = getImgBottomBarView();
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        if (imgBottomBarView == null || imgBottomBarView.getVisibility() != 8) {
            num = 0;
            i17 = 0;
            f17 = valueOf;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "showImgBottomBarView >> position: %d", java.lang.Integer.valueOf(getPosition()));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(valueOf);
            java.util.Collections.reverse(arrayList);
            num = 0;
            i17 = 0;
            f17 = valueOf;
            yj0.a.d(imgBottomBarView, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            imgBottomBarView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(imgBottomBarView, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(null);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(imgBottomBarView, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imgBottomBarView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(imgBottomBarView, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(imgBottomBarView, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.start();
        }
        if (this.D1 && (view = this.G1) != null && view.getVisibility() == 8) {
            android.view.View view2 = this.G1;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(f17);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList3.get(i17)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view3 = this.G1;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(num);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(i17)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "showImgBottomBarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.G1, "alpha", 0.0f, 1.0f);
            ofFloat2.setDuration(300L);
            ofFloat2.start();
        }
        r0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showImgBottomBarView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener
    public void onCenterChanged(android.graphics.PointF pointF, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCenterChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCenterChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleChangeReportListener
    public void onDoubleClickScale(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleClickScale", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        ta4.f1.f416743a.a(1, f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleClickScale", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.ScaleChangeReportListener
    public void onFingerScaleEnd(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFingerScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        ta4.f1.f416743a.a(2, f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFingerScaleEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.tencent.mm.plugin.sns.ui.FlipView, com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip;
        r45.jj4 jj4Var;
        java.lang.String str3;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        super.onImageFinish(str, i17, z17);
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = java.lang.Boolean.valueOf(this.f167202p0 == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "onImageFinish, mediaId: %s,downloadType:%d isOK: %s, null == adapter: %s.", objArr);
        com.tencent.mm.plugin.sns.ui.bk bkVar = this.f167202p0;
        if (bkVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        final r45.jj4 jj4Var2 = bkVar.m(this.W.getCurrentItem()).f380109d;
        if (!z17 && jj4Var2 != null && (str3 = jj4Var2.f377855d) != null && str3.equals(str)) {
            android.content.Context context = this.V;
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.j_9), 0).show();
            this.P1 = str;
        }
        int i18 = z17 ? 1 : 3;
        if (this.S1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("recordLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMediaObjWithMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            java.util.Iterator it = this.J1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObjWithMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    jj4Var = null;
                    break;
                } else {
                    r45.m33 m33Var = (r45.m33) it.next();
                    if (m33Var.f380109d.f377855d.equals(str)) {
                        jj4Var = m33Var.f380109d;
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMediaObjWithMediaId", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        break;
                    }
                }
            }
            if (jj4Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsInfoFlip", "BigImageReport recordEnd, mediaId: %s no in item", str);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport recordLoadEnd, result:%d, mediaId:%s downloadType:%d", java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(i17));
                java.lang.String e07 = e0(str, i17);
                java.util.HashMap hashMap = this.f167200m2;
                if (hashMap.containsKey(e07)) {
                    com.tencent.mm.plugin.sns.ui.xj xjVar = (com.tencent.mm.plugin.sns.ui.xj) hashMap.remove(e07);
                    if (xjVar == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport infoMap has key: %s", e07);
                        j0(xjVar, i18);
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SnsInfoFlip", "BigImageReport infoMap no has key: %s", e07);
                }
                java.util.HashMap hashMap2 = this.f167201n2;
                if (hashMap2.containsKey(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "BigImageReport need to load info to remove: %s", str);
                    hashMap2.remove(str);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("recordLoadEnd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            }
        }
        if (jj4Var2 != null && (str2 = jj4Var2.f377855d) != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "img download finish, refresh ui, media id: %s. and mediaLocal id %s", str2, java.lang.Integer.valueOf(jj4Var2.f377870s));
            com.tencent.mm.plugin.sns.ui.bk bkVar2 = this.f167202p0;
            bkVar2.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip2 = bkVar2.f167925r;
            int size = E(snsInfoFlip2).size();
            int i19 = 0;
            while (true) {
                if (i19 >= size) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                    break;
                }
                r45.m33 m17 = bkVar2.m(i19);
                if (m17 != null && m17.f380109d.f377855d.equals(str)) {
                    if (!snsInfoFlip2.U(m17.f380109d)) {
                        bkVar2.t(i19, i17, str, z17);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateBigImage", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                        break;
                    }
                    com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView flexibleLivePhotoView = (com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView) snsInfoFlip2.R(i19).first;
                    if (flexibleLivePhotoView != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLivePhotoViewByLoadBigImageFinish", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                        snsInfoFlip = snsInfoFlip2;
                        flexibleLivePhotoView.m("updateLivePhotoViewByLoadBigImageFinish isOk: " + z17);
                        if (!z17) {
                            flexibleLivePhotoView.f169205w = dd4.f.f228997f;
                            android.view.View view = flexibleLivePhotoView.f169191f;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleLivePhotoView", "updateLivePhotoViewByLoadBigImageFinish", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/improve/view/flexible/FlexibleLivePhotoView", "updateLivePhotoViewByLoadBigImageFinish", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        } else if (flexibleLivePhotoView.f169205w == dd4.f.f228996e) {
                            flexibleLivePhotoView.p();
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLivePhotoViewByLoadBigImageFinish", "com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleLivePhotoView");
                    } else {
                        snsInfoFlip = snsInfoFlip2;
                    }
                } else {
                    snsInfoFlip = snsInfoFlip2;
                }
                i19++;
                snsInfoFlip2 = snsInfoFlip;
            }
            if (jj4Var2.f377855d.equals(str) && this.T1) {
                if (jj4Var2.X != null) {
                    android.content.Context context2 = this.V;
                    android.content.DialogInterface.OnClickListener onClickListener = new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$$c
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(android.content.DialogInterface dialogInterface, int i27) {
                            int i28 = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.f167186o2;
                            com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip3 = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.this;
                            snsInfoFlip3.getClass();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onImageFinish$3", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                            snsInfoFlip3.o(jj4Var2);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onImageFinish$3", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                        }
                    };
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showEditLiveAlert", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoUIHelper");
                    kotlin.jvm.internal.o.g(context2, "context");
                    db5.e1.C(context2, i65.a.r(context2, com.tencent.mm.R.string.ojq), "", i65.a.r(context2, com.tencent.mm.R.string.ojp), i65.a.r(context2, com.tencent.mm.R.string.f490347sg), false, onClickListener, ke4.d.f307039d);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showEditLiveAlert", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoUIHelper");
                } else {
                    o(jj4Var2);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener
    public void onScaleChanged(float f17, float f18, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScaleChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScaleChanged", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.davemorrissey.labs.subscaleview.view.SubsamplingScaleImageView.OnStateChangedListener
    public void onScaleFinish(float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onScaleFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        pc4.d dVar = pc4.d.f353410a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsImageLoadScaleLimit", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        float Di = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Di(e42.c0.clicfg_sns_image_load_scale_limit, 1.1f);
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsConfig", "getSnsImageLoadScaleLimit:" + Di);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsImageLoadScaleLimit", "com.tencent.mm.plugin.sns.ui.improve.config.ImproveSnsConfig");
        if (f17 >= Di) {
            r45.jj4 mediaObj = getMediaObj();
            if (mediaObj == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScaleFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                return;
            }
            com.tencent.mm.plugin.sns.ui.bk bkVar = this.f167202p0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            int n17 = bkVar.n(mediaObj);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3600", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
            if (n17 == 3 || n17 == 4) {
                com.tencent.mm.plugin.sns.ui.bk bkVar2 = this.f167202p0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                java.util.HashSet hashSet = bkVar2.f167920m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                if (hashSet.contains(mediaObj.f377855d)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScaleFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    return;
                }
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "start load uhd image id:%s", mediaObj.f377855d);
                com.tencent.mm.plugin.sns.ui.bk bkVar3 = this.f167202p0;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                java.util.HashSet hashSet2 = bkVar3.f167920m;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$3700", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip$SnsGalleryAdapter");
                hashSet2.add(mediaObj.f377855d);
                com.tencent.mm.storage.s7 s7Var = this.C;
                int i17 = getSelectItem().f380111f;
                com.tencent.mm.storage.s7 s7Var2 = new com.tencent.mm.storage.s7(s7Var.f195312a);
                s7Var2.f195313b = i17;
                boolean n07 = com.tencent.mm.plugin.sns.model.l4.hj().n0(mediaObj, 2, s7Var2, mediaObj.N);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", "onScaleFinish to load uhd image %b", java.lang.Boolean.valueOf(n07));
                if (!n07) {
                    com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(getSelectItem().f380110e);
                    g0(k17 != null ? ca4.z0.t0(k17.field_snsId) : "", mediaObj, getSelectItem().f380112g, 10, 2, 0);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onScaleFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.tencent.mm.plugin.sns.ui.FlipView, com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        r45.jj4 jj4Var;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        super.onSightFinish(str, z17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSightFinish ");
        sb6.append(str);
        sb6.append(" ");
        sb6.append(z17);
        sb6.append(" ");
        sb6.append(this.f167202p0 == null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsInfoFlip", sb6.toString());
        com.tencent.mm.plugin.sns.ui.bk bkVar = this.f167202p0;
        if (bkVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        if (!z17 && bkVar.m(this.W.getCurrentItem()) != null && (jj4Var = this.f167202p0.m(this.W.getCurrentItem()).f380109d) != null && (str2 = jj4Var.f377855d) != null && str2.equals(str)) {
            android.content.Context context = this.V;
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.j__), 0).show();
            this.P1 = str;
        }
        this.f167202p0.notifyDataSetChanged();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void p0(r45.m33 m33Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showTranlateLongClickBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.nj njVar = this.Z1;
        njVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showMenuForOCRTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        if (m33Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsImageTransSheetManager", "showMenuForOCRTranslateResult item is NULL");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showMenuForOCRTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        } else {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(njVar.f170014a, 0, false);
            k0Var.f211872n = new com.tencent.mm.plugin.sns.ui.lj(njVar);
            k0Var.f211881s = new com.tencent.mm.plugin.sns.ui.mj(njVar, m33Var);
            k0Var.v();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showMenuForOCRTranslateResult", "com.tencent.mm.plugin.sns.ui.SnsImageTransSheetManager");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTranlateLongClickBottomSheet", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public final void q0(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("touchView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (view2 != null && view != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            view2.getGlobalVisibleRect(rect);
            if (rect.bottom - rect.top > 0) {
                this.f167195i2.setRealViewHeight(r7 - r3);
                this.f167195i2.setViewRect(rect);
            }
            this.f167195i2.b(view);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("touchView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void r0() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateTouchLayoutDisabledRect", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        if (!this.D1 || this.f167195i2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTouchLayoutDisabledRect", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
            return;
        }
        final com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar imgBottomBarView = getImgBottomBarView();
        if ((imgBottomBarView instanceof com.tencent.mm.plugin.sns.ui.SnsAlbumImgBottomBar) && imgBottomBarView.getVisibility() == 0) {
            imgBottomBarView.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.sns.ui.SnsInfoFlip$$d
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.f167186o2;
                    com.tencent.mm.plugin.sns.ui.SnsInfoFlip snsInfoFlip = com.tencent.mm.plugin.sns.ui.SnsInfoFlip.this;
                    snsInfoFlip.getClass();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$updateTouchLayoutDisabledRect$1", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                    com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar snsBaseImgBottomBar = imgBottomBarView;
                    if (snsBaseImgBottomBar.getVisibility() == 0 && snsInfoFlip.f167195i2 != null) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        snsBaseImgBottomBar.getGlobalVisibleRect(rect);
                        snsInfoFlip.f167195i2.setDisabledRect(rect);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$updateTouchLayoutDisabledRect$1", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
                }
            });
        } else {
            this.f167195i2.setDisabledRect(null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateTouchLayoutDisabledRect", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    @Override // com.tencent.mm.plugin.sns.ui.FlipView
    public boolean s() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        boolean z17 = this.S1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        return z17;
    }

    public void setCurrentImageView(db5.f0 f0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCurrentImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f167204x0 = f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCurrentImageView", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setEnableHorLongBmpMode(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnableHorLongBmpMode", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.E1 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnableHorLongBmpMode", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setEnableSingleClickOver(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnableSingleClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.F1 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnableSingleClickOver", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setFirstItemLoadListener(com.tencent.mm.plugin.sns.ui.yj yjVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFirstItemLoadListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f167193g2 = yjVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFirstItemLoadListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setFromScene(com.tencent.mm.storage.s7 s7Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.C = s7Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setGalleyLongClickOverListener(db5.a8 a8Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setGalleyLongClickOverListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f167190d2 = a8Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setGalleyLongClickOverListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setInfoType(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setInfoType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setInfoType", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setIsAd(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f167206y0 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsAd", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setIsFromMainTimeline(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.S1 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsFromMainTimeline", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setIsSoonEnterPhotoEditUI(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsSoonEnterPhotoEditUI", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.T1 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsSoonEnterPhotoEditUI", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setItems(java.util.List<r45.m33> list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.J1 = list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setItems", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setOnDeleteAllAction(java.lang.Runnable runnable) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnDeleteAllAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.N1 = runnable;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnDeleteAllAction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setOnPageScrollChangeListener(com.tencent.mm.plugin.sns.ui.zj zjVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnPageScrollChangeListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f167192f2 = zjVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnPageScrollChangeListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setOnPageSelectListener(com.tencent.mm.plugin.sns.ui.ak akVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnPageSelectListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f167191e2 = akVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnPageSelectListener", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setShowLongClickMenu(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowLongClickMenu", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.f167198l1 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowLongClickMenu", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setShowPageControl(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowPageControl", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.A1 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowPageControl", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setShowTitle(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setShowTitle", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.C1 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setShowTitle", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setTitleMain(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleMain", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        android.widget.TextView textView = this.H1;
        if (textView != null) {
            textView.setText(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleMain", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setTitleSubtitle(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTitleSubtitle", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        android.widget.TextView textView = this.I1;
        if (textView != null) {
            textView.setText(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTitleSubtitle", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setTouchFinish(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTouchFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.B1 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTouchFinish", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setUIFromScene(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUIFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.D = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUIFromScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setUseFixAnimation(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUseFixAnimation", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.X1 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUseFixAnimation", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setUseNewInteraction(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUseNewInteraction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.D1 = z17;
        android.view.View view = this.G1;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "setUseNewInteraction", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsInfoFlip", "setUseNewInteraction", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUseNewInteraction", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public void setVideoScene(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
        this.V1 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoScene", "com.tencent.mm.plugin.sns.ui.SnsInfoFlip");
    }

    public SnsInfoFlip(android.content.Context context) {
        super(context);
        this.f167206y0 = false;
        this.f167198l1 = true;
        this.f167203p1 = new java.util.HashMap();
        this.f167205x1 = new java.util.HashMap();
        this.f167207y1 = new java.util.HashMap();
        this.f167208z1 = new java.util.HashMap();
        this.A1 = false;
        this.B1 = false;
        this.C1 = false;
        this.D1 = false;
        this.E1 = false;
        this.F1 = true;
        this.K1 = true;
        this.L1 = 1.0f;
        this.N1 = null;
        this.O1 = new com.tencent.mm.sdk.platformtools.n3();
        this.P1 = "";
        this.Q1 = -1;
        this.R1 = -1;
        this.S1 = false;
        this.T1 = false;
        this.U1 = 0L;
        this.V1 = 0;
        this.W1 = true;
        this.X1 = false;
        this.Y1 = new java.util.HashMap();
        this.Z1 = null;
        this.f167187a2 = 0;
        this.f167188b2 = false;
        this.f167190d2 = null;
        this.f167194h2 = new java.util.HashMap();
        this.f167196j2 = false;
        this.f167197k2 = false;
        this.f167199l2 = new java.util.HashSet();
        this.f167200m2 = new java.util.HashMap();
        this.f167201n2 = new java.util.HashMap();
        p(context);
    }
}
