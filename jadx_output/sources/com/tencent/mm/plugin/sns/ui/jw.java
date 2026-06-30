package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class jw implements w64.k {
    public com.tencent.mm.plugin.sns.storage.SnsInfo A;
    public java.lang.String B;
    public com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder C;
    public android.view.ViewStub E;
    public com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView F;
    public android.widget.FrameLayout G;
    public android.widget.FrameLayout H;
    public final boolean I;
    public boolean T;

    /* renamed from: a, reason: collision with root package name */
    public w64.n f169566a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.listener.i f169567b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f169568c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f169569d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f169570e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f169571f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f169572g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f169573h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f169574i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f169575j;

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f169576k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f169577l;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.ADXml f169578m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.ADInfo f169579n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f169580o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewStub f169581p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.RoundedCornerFrameLayout f169582q;

    /* renamed from: r, reason: collision with root package name */
    public n74.c2 f169583r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewStub f169584s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView f169585t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.ViewStub f169586u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView f169587v;

    /* renamed from: w, reason: collision with root package name */
    public final w64.l f169588w;

    /* renamed from: x, reason: collision with root package name */
    public final int f169589x;

    /* renamed from: y, reason: collision with root package name */
    public final i64.b1 f169590y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f169591z;
    public h84.j D = null;

    /* renamed from: J, reason: collision with root package name */
    public u84.n f169565J = null;
    public u84.q1 K = null;
    public com.tencent.mm.plugin.sns.ad.widget.living.b0 L = null;
    public u84.j0 M = null;
    public com.tencent.mm.plugin.sns.ad.widget.adpag.c N = null;
    public e84.v O = null;
    public f84.x P = null;
    public d84.n0 Q = null;
    public m84.y R = null;
    public y84.j3 S = null;
    public boolean U = false;

    public jw(android.view.View view, i64.b1 b1Var, int i17, boolean z17, w64.l lVar) {
        boolean z18 = false;
        this.T = false;
        this.f169577l = view;
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f169580o = f17;
        this.f169589x = i17;
        this.f169588w = lVar;
        this.f169590y = b1Var;
        this.I = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineAdView", "adView init lan " + f17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        this.f169570e = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482639jx);
        this.f169572g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482646k4);
        this.f169573h = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f482645k3);
        this.f169574i = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f482643k1);
        this.f169571f = view.findViewById(com.tencent.mm.R.id.f482644k2);
        this.f169575j = view.findViewById(com.tencent.mm.R.id.f482640jy);
        this.f169576k = view.findViewById(com.tencent.mm.R.id.f482642k0);
        this.f169569d = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f482638jw);
        this.f169581p = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.n5x);
        this.f169584s = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.n47);
        this.f169586u = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.s6j);
        this.E = (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.s6a);
        this.G = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.v6z);
        this.H = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.f486968v70);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        w64.n nVar = new w64.n(view.getContext(), i17, b1Var, null, null);
        this.f169566a = nVar;
        nVar.x(new com.tencent.mm.plugin.sns.ui.gw(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initAdClickActionHandler", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initAdTag", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        this.f169570e.setText(" " + view.getResources().getString(com.tencent.mm.R.string.j8o) + " ");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initAdTag", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initDebugFlag", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        try {
            if (ca4.m0.c0() && gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FEED_NEW_SHOW_DEBUG_INT_SYNC, 0) == 1) {
                z18 = true;
            }
            this.T = z18;
        } catch (java.lang.Exception unused) {
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.TimeLineAdView", "initDebugFlag, flag=" + this.T);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initDebugFlag", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }

    @Override // w64.k
    public void a(com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo) {
        com.tencent.mm.plugin.sns.storage.ADXml aDXml;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        if (adClickActionInfo == null || this.f169572g == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineAdView", "clickActionInfo or adInfoLinkTv is null, can not updateTextTitle");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
            return;
        }
        if (adClickActionInfo.f162571b == 2 && (aDXml = this.f169578m) != null && (adClickActionInfo2 = aDXml.adActionLinkClickInfo) != null && adClickActionInfo2.a()) {
            if (android.text.TextUtils.isEmpty(this.f169572g.getText().toString())) {
                this.f169572g.setText(this.B);
            }
            new com.tencent.mm.plugin.sns.ui.iw(this.f169572g, this.f169573h, adClickActionInfo.B, adClickActionInfo.A, this.B).execute(new java.lang.Void[0]);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIStateChange", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0805  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0811  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0898  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x08f9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x09ba  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0a58  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x099b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x045a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.tencent.mm.plugin.sns.storage.SnsInfo r46, com.tencent.mm.plugin.sns.storage.ADXml r47, com.tencent.mm.plugin.sns.storage.ADInfo r48, int r49) {
        /*
            Method dump skipped, instructions count: 2730
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.jw.b(com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.plugin.sns.storage.ADXml, com.tencent.mm.plugin.sns.storage.ADInfo, int):void");
    }

    public boolean c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isAdInfoLinkTvVisible", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        if (this.f169571f.getVisibility() == 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdInfoLinkTvVisible", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
            return true;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isAdInfoLinkTvVisible", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x055f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0650 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x06f5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x06ec  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0262  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.tencent.mm.plugin.sns.storage.SnsInfo r36, com.tencent.mm.plugin.sns.storage.ADXml r37, android.content.Context r38) {
        /*
            Method dump skipped, instructions count: 1868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.jw.d(com.tencent.mm.plugin.sns.storage.SnsInfo, com.tencent.mm.plugin.sns.storage.ADXml, android.content.Context):void");
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetAdSpaceViewUI", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        android.widget.FrameLayout frameLayout = this.H;
        if (frameLayout != null) {
            android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -2;
                this.H.setLayoutParams(layoutParams);
            }
            this.H.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetAdSpaceViewUI", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }

    public final void f(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resizeLBSLayout", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        android.view.View view = this.f169577l;
        if (view == null || this.f169570e == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeLBSLayout", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
            return;
        }
        android.content.Context context = view.getContext();
        if (context == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeLBSLayout", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = this.f169570e.getLayoutParams();
        if (layoutParams instanceof android.widget.LinearLayout.LayoutParams) {
            if (z17) {
                ((android.widget.LinearLayout.LayoutParams) layoutParams).leftMargin = i65.a.b(context, 2);
            } else {
                ((android.widget.LinearLayout.LayoutParams) layoutParams).leftMargin = i65.a.b(context, 8);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resizeLBSLayout", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }

    public void g(int i17, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("sendLabelViewVisibilityEvent", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        if (snsInfo != null) {
            try {
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineAdView", "sendLabelViewVisibilityEvent exp is " + th6);
            }
            if (snsInfo.isShakeAd()) {
                if (!ca4.m0.V(this.f169591z, snsInfo)) {
                    com.tencent.mm.autogen.events.SnsAdInteractionEvent snsAdInteractionEvent = new com.tencent.mm.autogen.events.SnsAdInteractionEvent();
                    am.av avVar = snsAdInteractionEvent.f54792g;
                    avVar.f6189a = i17;
                    avVar.f6190b = snsInfo.field_snsId;
                    snsAdInteractionEvent.e();
                    com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineAdView", "sendVisibilityEvent, interactionLabelView visibility is " + i17 + ", interactionLabelView snsId is " + ca4.z0.t0(avVar.f6190b));
                    this.f169591z = snsInfo;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendLabelViewVisibilityEvent", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
                return;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("sendLabelViewVisibilityEvent", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }

    public void h(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAdTitleTag", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        this.f169571f.setTag(com.tencent.mm.R.id.n4g, this);
        this.f169571f.setTag(obj);
        this.f169570e.setTag(obj2);
        android.view.View view = this.f169575j;
        if (view != null) {
            view.setTag(obj2);
        }
        android.widget.LinearLayout linearLayout = this.f169569d;
        if (linearLayout != null) {
            linearLayout.setTag(obj2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAdTitleTag", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }

    public void i(com.tencent.mm.plugin.sns.ui.listener.i iVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        this.f169567b = iVar;
        this.f169571f.setOnClickListener(iVar.f169820w);
        android.widget.LinearLayout linearLayout = this.f169569d;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(iVar.L);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isFeedbackAccessibilityProtectionEnable", "com.tencent.mm.plugin.sns.ad.utils.AdAccessibilityProtectionHelper");
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        if (e0Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedbackAccessibilityProtectionEnable", "com.tencent.mm.plugin.sns.ad.utils.AdAccessibilityProtectionHelper");
        } else {
            int Ni = ((h62.d) e0Var).Ni(e42.c0.clicfg_sns_ad_feedback_accessibility_protection_enable_switch, 0);
            com.tencent.mars.xlog.Log.i("SnsAd.FeedbackProtection", "feed back accessibility protection switch: the switch value is " + Ni);
            r4 = Ni > 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isFeedbackAccessibilityProtectionEnable", "com.tencent.mm.plugin.sns.ad.utils.AdAccessibilityProtectionHelper");
        }
        if (r4) {
            a84.a.a(this.f169570e);
            a84.a.a(this.f169575j);
            a84.a.a(this.f169569d);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnClickListener", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }

    public void j(int i17) {
        com.tencent.mm.plugin.sns.ad.widget.living.b0 b0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        com.tencent.mm.plugin.sns.storage.ADXml aDXml = this.f169578m;
        if (aDXml == null || !(aDXml.adActionLinkHidden == 1 || aDXml.isDynamicAD())) {
            android.view.View view = this.f169571f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f169571f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f169570e.setVisibility(i17);
        android.view.View view3 = this.f169575j;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.LinearLayout linearLayout = this.f169569d;
        if (linearLayout != null) {
            linearLayout.setVisibility(i17);
        }
        com.tencent.mm.plugin.sns.storage.ADInfo aDInfo = this.f169579n;
        if (aDInfo == null || com.tencent.mm.sdk.platformtools.t8.K0(aDInfo.adActionPOIName)) {
            android.view.View view4 = this.f169576k;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f(false);
        } else {
            android.view.View view5 = this.f169576k;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f(i17 == 0);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineAdView", "timelineAdView setVisibility, visible is " + i17);
        if (i17 == 8) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetOtherComponent", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
            try {
                boolean z17 = ca4.m0.u0(e42.c0.clicfg_sns_ad_disable_reset_ui_bidding_ad, 0) == 1;
                boolean z18 = ca4.m0.u0(e42.c0.clicfg_sns_ad_disable_reset_ui_living_icon_ad, 0) == 1;
                boolean z19 = ca4.m0.u0(e42.c0.clicfg_sns_ad_disable_reset_ui_contract_ad, 0) == 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.TimeLineAdView", "resetOtherComponent, disableBiddingAdResetUI is " + z17 + ", disableLivingAdResetUI is " + z18 + ", disableContractAdResetUI is " + z19);
                this.U = false;
                if (!z17) {
                    h84.j jVar = this.D;
                    if (jVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagLogic");
                        com.tencent.mars.xlog.Log.i("AdWxaGameGiftTagLogic", "adWxaGameGiftTagLogic, from not ad to resetUI");
                        h84.h hVar = jVar.f279576b;
                        if (hVar != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
                            android.widget.FrameLayout frameLayout = hVar.f279570s;
                            if (frameLayout != null) {
                                frameLayout.setVisibility(8);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagComponent");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adgamegift.AdWxaGameGiftTagLogic");
                    }
                    com.tencent.mm.plugin.sns.ad.widget.adconsultbar.SnsAdConsultBarView snsAdConsultBarView = this.F;
                    if (snsAdConsultBarView != null) {
                        snsAdConsultBarView.setVisibility(8);
                    }
                }
                if (!z18 && (b0Var = this.L) != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingLogic");
                    com.tencent.mars.xlog.Log.i("AdNickNameLivingLogic", "adNickNameLivingLogic, from not ad to resetUI");
                    com.tencent.mm.plugin.sns.ad.widget.living.z zVar = b0Var.f163695b;
                    if (zVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
                        android.widget.LinearLayout y17 = zVar.y();
                        if (y17 != null) {
                            y17.setVisibility(8);
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingComponent");
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.living.AdNickNameLivingLogic");
                }
                if (!z19) {
                    android.widget.FrameLayout frameLayout2 = this.G;
                    if (frameLayout2 != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdBarContainerHelper");
                        a84.y0.c(frameLayout2);
                        a84.y0.p(frameLayout2, false);
                        com.tencent.mars.xlog.Log.i("AdBarContainerHelper", "resetUI");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdBarContainerHelper");
                    }
                    com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = this.f169582q;
                    if (roundedCornerFrameLayout != null) {
                        roundedCornerFrameLayout.setVisibility(8);
                    }
                    com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionLabelView snsAdInteractionLabelView = this.f169585t;
                    if (snsAdInteractionLabelView != null) {
                        snsAdInteractionLabelView.setVisibility(8);
                    }
                    com.tencent.mm.plugin.sns.ad.widget.interactionlabel.SnsAdInteractionTagView snsAdInteractionTagView = this.f169587v;
                    if (snsAdInteractionTagView != null) {
                        snsAdInteractionTagView.setVisibility(8);
                    }
                    u84.n nVar = this.f169565J;
                    if (nVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagLogic");
                        com.tencent.mars.xlog.Log.i("AdHighlightTagLogic", "adHighlightTagLogic, from not ad to resetUI");
                        u84.k kVar = nVar.f425607b;
                        if (kVar != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
                            android.widget.FrameLayout frameLayout3 = kVar.f425566s;
                            if (frameLayout3 != null) {
                                frameLayout3.setVisibility(8);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagComponent");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.interactionlabel.AdHighlightTagLogic");
                    }
                    u84.q1 q1Var = this.K;
                    if (q1Var != null) {
                        q1Var.a();
                    }
                    com.tencent.mm.plugin.sns.ad.widget.adpag.c cVar = this.N;
                    if (cVar != null) {
                        cVar.a();
                    }
                    e84.v vVar = this.O;
                    if (vVar != null) {
                        vVar.a();
                    }
                    f84.x xVar = this.P;
                    if (xVar != null) {
                        xVar.a();
                    }
                    d84.n0 n0Var = this.Q;
                    if (n0Var != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsLogic");
                        com.tencent.mars.xlog.Log.i("AdRockPaperScissorsLogic", "mAdRockPaperScissorsComponent, resetUI");
                        d84.j0 j0Var = n0Var.f227118b;
                        if (j0Var != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                            j0Var.T();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsComponent");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adRockPaperScissors.AdRockPaperScissorsLogic");
                    }
                    y84.j3 j3Var = this.S;
                    if (j3Var != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardLogic");
                        y84.h3 h3Var = j3Var.f460120a;
                        if (h3Var != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                            com.tencent.mars.xlog.Log.i(h3Var.j(), "resetUI");
                            y84.h3.N0(h3Var, 0, 1, null);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardComponent");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.randomselectcard.AdRandomSelectCardLogic");
                    }
                    m84.y yVar = this.R;
                    if (yVar != null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarLogic");
                        com.tencent.mars.xlog.Log.i("MicroMsg.AdWorldCupAvatarLogic", "mAdWorldCupAvatarComponent, resetUI");
                        m84.u uVar = yVar.f324820b;
                        if (uVar != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                            uVar.W();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarComponent");
                        }
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetUI", "com.tencent.mm.plugin.sns.ad.widget.adworldcupavatar.AdWorldCupAvatarLogic");
                    }
                    e();
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TimeLineAdView", "resetOtherComponent, exp is " + th6);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetOtherComponent", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        }
        k();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }

    public final void k() {
        android.view.View view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showDebugView", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
        if (this.T && (view = this.f169571f) != null && this.f169573h != null && this.f169574i != null && this.f169572g != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "showDebugView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/TimeLineAdView", "showDebugView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f169573h.setVisibility(8);
            this.f169574i.setVisibility(8);
            this.f169572g.setBackgroundColor(android.graphics.Color.parseColor("#eeeeee"));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDebugView", "com.tencent.mm.plugin.sns.ui.TimeLineAdView");
    }
}
