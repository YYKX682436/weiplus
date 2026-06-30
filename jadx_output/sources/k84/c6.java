package k84;

/* loaded from: classes4.dex */
public abstract class c6 extends com.tencent.mm.plugin.sns.ui.widget.l {
    public static final k84.r4 Q = new k84.r4(null);
    public static final kotlinx.coroutines.r0 R;
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final jz5.g E;
    public mb4.c F;
    public mb4.a G;
    public com.tencent.mm.plugin.sns.storage.SnsInfo H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f304977J;
    public boolean K;
    public boolean L;
    public boolean M;
    public kotlinx.coroutines.r2 N;
    public final k84.i5 O;
    public final k84.k5 P;

    /* renamed from: o, reason: collision with root package name */
    public final i64.b1 f304978o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f304979p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder f304980q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f304981r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView f304982s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f304983t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f304984u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f304985v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f304986w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f304987x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f304988y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f304989z;

    static {
        int i17 = kotlinx.coroutines.r0.N0;
        R = new k84.u5(kotlinx.coroutines.q0.f310567d);
    }

    public c6(java.lang.String str, androidx.lifecycle.y yVar, android.view.View view, i64.b1 b1Var, com.tencent.mm.plugin.sns.ui.listener.i iVar, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        super(str, yVar, view);
        this.f304978o = b1Var;
        this.f304979p = iVar;
        this.f304980q = baseViewHolder;
        this.f304981r = jz5.h.b(new k84.n5(view));
        this.f304984u = jz5.h.b(new k84.b5(this));
        this.f304985v = jz5.h.b(new k84.f5(this));
        this.f304986w = jz5.h.b(new k84.d5(this));
        this.f304987x = jz5.h.b(new k84.j5(this));
        this.f304988y = jz5.h.b(new k84.c5(this));
        this.f304989z = jz5.h.b(new k84.e5(this));
        this.A = jz5.h.b(new k84.g5(this));
        this.B = jz5.h.b(new k84.o5(this, view));
        this.C = jz5.h.b(new k84.l5(view));
        this.D = jz5.h.b(new k84.a5(view));
        this.E = jz5.h.b(new k84.h5(view));
        this.I = jz5.h.b(k84.m5.f305131d);
        this.f304977J = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
        this.O = new k84.i5(this);
        this.P = new k84.k5(this);
    }

    public static final /* synthetic */ mb4.c A(k84.c6 c6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdSocialInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        mb4.c cVar = c6Var.F;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdSocialInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        return cVar;
    }

    public static final com.tencent.mm.ui.widget.imageview.WeImageView B(k84.c6 c6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCheerIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        c6Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCheerIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) c6Var.f304988y).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCheerIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCheerIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        return weImageView;
    }

    public static final com.tencent.mm.ui.widget.imageview.WeImageView C(k84.c6 c6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMCheerNormalIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        c6Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCheerNormalIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) ((jz5.n) c6Var.f304986w).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCheerNormalIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMCheerNormalIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        return weImageView;
    }

    public static final /* synthetic */ com.tencent.mm.view.MMPAGView D(k84.c6 c6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPAGView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.view.MMPAGView H = c6Var.H();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPAGView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        return H;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView E(k84.c6 c6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMShowAdPatAttitudeView$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = c6Var.f304982s;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMShowAdPatAttitudeView$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        return adSocialAttitudeView;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(k84.c6 r21, android.content.Context r22) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k84.c6.F(k84.c6, android.content.Context):void");
    }

    public static final void y(k84.c6 c6Var, int i17) {
        java.lang.Object obj;
        com.tencent.mm.plugin.sns.storage.ADInfo adInfo;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$doClickReport", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        c6Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClickReport", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        i64.b1 b1Var = c6Var.f304978o;
        int i18 = b1Var != null ? b1Var.f289095j : 0;
        int i19 = i18 == 0 ? 1 : 2;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        mb4.a aVar = c6Var.G;
        java.lang.Object obj2 = null;
        if (aVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNumberRequestId", "com.tencent.mm.plugin.sns.storage.adsocial.AdPatInfo");
            obj = aVar.f325356a;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNumberRequestId", "com.tencent.mm.plugin.sns.storage.adsocial.AdPatInfo");
        } else {
            obj = null;
        }
        jSONObject.put("numberRequestId", obj);
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = c6Var.H;
        if (snsInfo != null && (adInfo = snsInfo.getAdInfo(i18)) != null) {
            obj2 = adInfo.uxInfo;
        }
        jSONObject.put("uxinfo", obj2);
        jSONObject.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, i19);
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jSONObject2.put("act_type", i17);
        jSONObject2.put("act_cnt", 1);
        jSONObject2.put("tag", "clk");
        jSONArray.put(jSONObject2);
        jSONObject.put("ad_trace_msg", jSONArray);
        java.lang.String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject3, "toString(...)");
        ca4.m0.a("sns_ad_social_like_pat_click_report", jSONObject3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClickReport", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$doClickReport", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
    }

    public static final /* synthetic */ mb4.a z(k84.c6 c6Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdPatInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        mb4.a aVar = c6Var.G;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdPatInfo$p", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        return aVar;
    }

    public final void G(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCommentViewVisibility", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        if (i17 == 0) {
            android.view.View I = I();
            if (I != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(I, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialPatComponent", "doCommentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                I.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(I, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialPatComponent", "doCommentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View I2 = I();
            if (I2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(I2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialPatComponent", "doCommentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                I2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(I2, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialPatComponent", "doCommentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCommentViewVisibility", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
    }

    public final com.tencent.mm.view.MMPAGView H() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMPAGView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) ((jz5.n) this.f304987x).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMPAGView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        return mMPAGView;
    }

    public final android.view.View I() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMShowCommentView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        android.view.View view = (android.view.View) ((jz5.n) this.B).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMShowCommentView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        return view;
    }

    public final void J(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCommentViewVisibility", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        if (i17 == 0) {
            android.view.View I = I();
            if (I != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(I, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialPatComponent", "resetCommentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                I.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(I, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialPatComponent", "resetCommentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f304982s;
            if (adSocialAttitudeView != null) {
                adSocialAttitudeView.setVisibility(8);
            }
        } else {
            android.view.View I2 = I();
            if (I2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(I2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialPatComponent", "resetCommentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                I2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(I2, "com/tencent/mm/plugin/sns/ad/widget/adsocial/AdSocialPatComponent", "resetCommentViewVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView2 = this.f304982s;
            if (adSocialAttitudeView2 != null) {
                adSocialAttitudeView2.setVisibility(0);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCommentViewVisibility", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
    }

    public final void K() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stopPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.view.MMPAGView H = H();
        if (H != null) {
            H.setProgress(0.0d);
        }
        com.tencent.mm.view.MMPAGView H2 = H();
        if (H2 != null) {
            H2.setVisibility(8);
        }
        com.tencent.mm.view.MMPAGView H3 = H();
        if (H3 != null) {
            H3.i(this.P);
        }
        com.tencent.mm.view.MMPAGView H4 = H();
        if (H4 != null) {
            H4.j(this.O);
        }
        if (!this.K) {
            com.tencent.mars.xlog.Log.w(j(), "stopPAGPlay return");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            return;
        }
        this.K = false;
        com.tencent.mm.view.MMPAGView H5 = H();
        if (H5 != null) {
            H5.post(new k84.b6(this));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stopPAGPlay", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void d(java.lang.Object obj, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo model = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        kotlin.jvm.internal.o.g(model, "model");
        if (!this.f304983t) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMShowAdPatAttitudeStub", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            android.view.ViewStub viewStub = (android.view.ViewStub) ((jz5.n) this.f304981r).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMShowAdPatAttitudeStub", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
            this.f304982s = inflate instanceof com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView ? (com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView) inflate : null;
            this.f304983t = true;
        }
        com.tencent.mars.xlog.Log.i(j(), "bindComponentModel, snsId is " + ca4.z0.t0(model.field_snsId) + ", isSame is " + z17);
        this.H = model;
        mb4.c cVar = model.getAdXml().adSocialInfo;
        this.F = cVar;
        this.G = cVar != null ? cVar.f325389n : null;
        J(8);
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f304982s;
        if (adSocialAttitudeView != null) {
            adSocialAttitudeView.setTag(this.f304980q);
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView2 = this.f304982s;
        if (adSocialAttitudeView2 != null) {
            adSocialAttitudeView2.setOnCommentClickListener(this.f304979p);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustCornerUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCheerContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        jz5.g gVar = this.f304984u;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCheerContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        if (linearLayout != null) {
            linearLayout.setClipToOutline(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCheerContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ((jz5.n) gVar).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCheerContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        if (linearLayout2 != null) {
            linearLayout2.setOutlineProvider(new al5.z1(a84.d0.a(4)));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCommentContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        jz5.g gVar2 = this.f304985v;
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) ((jz5.n) gVar2).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCommentContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        if (linearLayout3 != null) {
            linearLayout3.setClipToOutline(true);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCommentContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) ((jz5.n) gVar2).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCommentContainer", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        if (linearLayout4 != null) {
            linearLayout4.setOutlineProvider(new al5.z1(a84.d0.a(4)));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustCornerUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView3 = this.f304982s;
        boolean z18 = false;
        if (adSocialAttitudeView3 != null) {
            i64.b1 b1Var = this.f304978o;
            int i17 = b1Var != null ? b1Var.f289095j : 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMParentViewGroup", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.C).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMParentViewGroup", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAdSocialLeftView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) ((jz5.n) this.D).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAdSocialLeftView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMNextLineParentViewGroup", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) ((jz5.n) this.E).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMNextLineParentViewGroup", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            adSocialAttitudeView3.n(model, i17, viewGroup, linearLayout5, linearLayout6);
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView4 = this.f304982s;
        if (adSocialAttitudeView4 != null) {
            mb4.a aVar = this.G;
            if (aVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSupportDoubleClick", "com.tencent.mm.plugin.sns.storage.adsocial.AdPatInfo");
                z18 = aVar.f325363h;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSupportDoubleClick", "com.tencent.mm.plugin.sns.storage.adsocial.AdPatInfo");
            }
            adSocialAttitudeView4.y(z18);
        }
        if (model.getLikeFlag() == 1) {
            k84.q4.f305212d.a(a84.d0.c(model), java.lang.Boolean.TRUE);
        } else {
            k84.q4.f305212d.a(a84.d0.c(model), java.lang.Boolean.FALSE);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initCheerNormalIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        kotlinx.coroutines.y0 h17 = h();
        kotlinx.coroutines.r0 r0Var = R;
        if (h17 != null) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(h17, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(r0Var), null, new k84.x4(this, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initCheerNormalIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initLikedIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        kotlinx.coroutines.y0 h18 = h();
        if (h18 != null) {
            kotlinx.coroutines.l.d(h18, r0Var, null, new k84.y4(this, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initLikedIcon", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        kotlinx.coroutines.y0 h19 = h();
        if (h19 != null) {
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(h19, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(r0Var), null, new k84.z4(this, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPAGView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCheerTv", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        androidx.appcompat.widget.AppCompatTextView appCompatTextView = (androidx.appcompat.widget.AppCompatTextView) ((jz5.n) this.f304989z).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCheerTv", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.ui.bk.r0(appCompatTextView != null ? appCompatTextView.getPaint() : null, 0.8f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMCommentTv", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        androidx.appcompat.widget.AppCompatTextView appCompatTextView2 = (androidx.appcompat.widget.AppCompatTextView) ((jz5.n) this.A).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMCommentTv", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.ui.bk.r0(appCompatTextView2 != null ? appCompatTextView2.getPaint() : null, 0.8f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAttitudeViewUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        kotlinx.coroutines.y0 h27 = h();
        if (h27 != null) {
            kotlinx.coroutines.p0 p0Var3 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(h27, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(r0Var), null, new k84.t5(model, this, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAttitudeViewUI", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleInteractType", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        kotlinx.coroutines.y0 h28 = h();
        if (h28 != null) {
            kotlinx.coroutines.p0 p0Var4 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(h28, ((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(r0Var), null, new k84.w4(model, this, null), 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleInteractType", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindComponentModel", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void q(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEveryFillItem", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEveryFillItem", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        super.q(snsInfo);
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f304982s;
        if (adSocialAttitudeView != null) {
            adSocialAttitudeView.setPendingFillItem(true);
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView2 = this.f304982s;
        if (adSocialAttitudeView2 != null) {
            i64.b1 b1Var = this.f304978o;
            int i17 = b1Var != null ? b1Var.f289095j : 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMParentViewGroup", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) this.C).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMParentViewGroup", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMAdSocialLeftView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) ((jz5.n) this.D).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMAdSocialLeftView", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMNextLineParentViewGroup", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) ((jz5.n) this.E).getValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMNextLineParentViewGroup", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
            adSocialAttitudeView2.n(snsInfo, i17, viewGroup, linearLayout, linearLayout2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEveryFillItem", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEveryFillItem", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
    }

    @Override // com.tencent.mm.plugin.sns.ui.widget.l
    public void v(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        super.v((com.tencent.mm.plugin.sns.storage.SnsInfo) obj);
        com.tencent.mars.xlog.Log.i(j(), "resetComponentState");
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView = this.f304982s;
        if (adSocialAttitudeView != null) {
            adSocialAttitudeView.setOnShowAttitudeListener(null);
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView2 = this.f304982s;
        if (adSocialAttitudeView2 != null) {
            adSocialAttitudeView2.setOnCancelAttractAnimationListener(null);
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView3 = this.f304982s;
        if (adSocialAttitudeView3 != null) {
            adSocialAttitudeView3.setPendingFillItem(false);
        }
        com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView adSocialAttitudeView4 = this.f304982s;
        if (adSocialAttitudeView4 != null) {
            adSocialAttitudeView4.y(false);
        }
        ((kotlinx.coroutines.flow.h3) this.f304977J).k(java.lang.Boolean.FALSE);
        J(0);
        K();
        this.K = false;
        this.L = false;
        this.M = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetComponentState", "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent");
    }
}
