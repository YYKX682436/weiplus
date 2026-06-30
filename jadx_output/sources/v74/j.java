package v74;

/* loaded from: classes4.dex */
public final class j extends dc4.v implements i64.k0 {
    public int A;
    public final v74.h B;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.storage.SnsInfo f433824p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.listener.i f433825q;

    /* renamed from: r, reason: collision with root package name */
    public final i64.b1 f433826r;

    /* renamed from: s, reason: collision with root package name */
    public final android.app.Activity f433827s;

    /* renamed from: t, reason: collision with root package name */
    public final int f433828t;

    /* renamed from: u, reason: collision with root package name */
    public final v74.k0 f433829u;

    /* renamed from: v, reason: collision with root package name */
    public k84.e6 f433830v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.ViewGroup f433831w;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView f433832x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.ViewStub f433833y;

    /* renamed from: z, reason: collision with root package name */
    public final android.os.Handler f433834z;

    public j(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.plugin.sns.ui.listener.i iVar, i64.b1 b1Var, android.app.Activity mActivity, int i17) {
        kotlin.jvm.internal.o.g(mActivity, "mActivity");
        this.f433824p = snsInfo;
        this.f433825q = iVar;
        this.f433826r = b1Var;
        this.f433827s = mActivity;
        this.f433828t = i17;
        this.f433829u = new v74.k0(1);
        this.f433834z = new android.os.Handler(android.os.Looper.getMainLooper());
        this.B = new v74.h();
    }

    @Override // dc4.v
    public void c(android.view.View view, android.view.View view2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        com.tencent.mars.xlog.Log.i("AdLookbookCardDetailItem", "initView, snsId=" + ca4.z0.y0(this.f433824p));
        if (view == null || view2 == null || this.f433826r == null) {
            com.tencent.mars.xlog.Log.e("AdLookbookCardDetailItem", "initView, params err");
        }
        this.f228833f = view;
        this.f228834g = view2;
        this.f433831w = view != null ? (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.iqu) : null;
        this.f433832x = view != null ? (com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView) view.findViewById(com.tencent.mm.R.id.iqv) : null;
        this.f433833y = view != null ? (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.qlu) : null;
        android.view.ViewStub viewStub = view != null ? (android.view.ViewStub) view.findViewById(com.tencent.mm.R.id.v_f) : null;
        this.f433829u.g(new v74.t(this.f433827s, this.f433826r, this.f433832x, this.f433831w, view2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view2 : null, this.f433833y, view != null ? (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f485714rw0) : null, viewStub), new w64.n(this.f433827s, this.f433828t, this.f433826r, null, null), this.B);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        com.tencent.mars.xlog.Log.i("AdLookbookCardDetailItem", "onAdRemoved, snsId=" + str);
        this.f433829u.f();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
    }

    @Override // dc4.v
    public void e(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        super.e(configuration);
        com.tencent.mars.xlog.Log.i("AdLookbookCardDetailItem", "onConfigurationChanged, snsId=" + ca4.z0.y0(this.f433824p));
        l(v74.k0.E.b(this.f433827s, this.f228839o, 1));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
    }

    @Override // dc4.v
    public void g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        super.g();
        com.tencent.mars.xlog.Log.i("AdLookbookCardDetailItem", "onPause");
        v74.k0 k0Var = this.f433829u;
        k0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k0Var.l(false);
        v74.s0 s0Var = k0Var.f433849o;
        if (s0Var != null) {
            s0Var.d();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k84.e6 e6Var = this.f433830v;
        if (e6Var != null) {
            e6Var.b();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
    }

    @Override // dc4.v
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        super.i();
        this.f433834z.removeCallbacksAndMessages(null);
        v74.k0 k0Var = this.f433829u;
        k0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onStopPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mars.xlog.Log.i("AdLookbookLogic", "onStopPlay");
        k0Var.f433844j.removeCallbacksAndMessages(null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onStopPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k0Var.k();
        com.tencent.mars.xlog.Log.i("AdLookbookCardDetailItem", "onUIDestroy, snsId=" + ca4.z0.y0(this.f433824p));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
    }

    @Override // dc4.v
    public void j() {
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f433824p;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
            return;
        }
        com.tencent.mars.xlog.Log.i("AdLookbookCardDetailItem", "refreshView, snsId=" + ca4.z0.y0(snsInfo));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        java.lang.String T = ca4.z0.T(snsInfo);
        if (!android.text.TextUtils.isEmpty(T) && !kotlin.jvm.internal.o.b("0", T) && (b1Var = this.f433826r) != null) {
            b1Var.a(T, this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshOtherComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshOtherComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        } else {
            if (this.f433830v == null && snsInfo.isPatAd()) {
                com.tencent.mars.xlog.Log.i("AdLookbookCardDetailItem", "create adSocialPatLogic");
                this.f433830v = new k84.e6(this.f433828t);
            }
            k84.e6 e6Var = this.f433830v;
            if (e6Var != null) {
                e6Var.a(this.f433827s, this.f228836i, com.tencent.mm.plugin.sns.storage.l1.a(snsInfo.getSnsId()), this.f433826r, this.f433825q, null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshOtherComponent", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        }
        v74.s b17 = v74.k0.E.b(this.f433827s, this.f228839o, 1);
        this.f433829u.i(snsInfo, b17, this.A, l(b17));
        android.os.Handler handler = this.f433834z;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(new v74.i(this, snsInfo), 600L);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshView", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
    
        if (r4.n(r2.f305024b) == true) goto L12;
     */
    @Override // dc4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.sns.storage.SnsInfo k(com.tencent.mm.plugin.sns.storage.SnsInfo r7) {
        /*
            r6 = this;
            java.lang.String r0 = "resetSnsInfoLikeFlag"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            k84.e6 r2 = r6.f433830v
            if (r2 != 0) goto L10
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        L10:
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatLogic"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r3)
            k84.c6 r4 = r2.f305023a
            if (r4 == 0) goto L23
            com.tencent.mm.plugin.sns.storage.SnsInfo r5 = r2.f305024b
            boolean r4 = r4.n(r5)
            r5 = 1
            if (r4 != r5) goto L23
            goto L24
        L23:
            r5 = 0
        L24:
            if (r5 == 0) goto L55
            k84.c6 r2 = r2.f305023a
            if (r2 == 0) goto L50
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialPatComponent"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView r2 = r2.f304982s
            if (r2 != 0) goto L37
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            goto L51
        L37:
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.widget.adsocial.AdSocialAttitudeView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r5)
            if (r7 == 0) goto L49
            com.tencent.mm.plugin.sns.storage.SnsInfo r2 = r2.f163457u
            if (r2 == 0) goto L49
            int r2 = r2.getLikeFlag()
            r7.setLikeFlag(r2)
        L49:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            goto L51
        L50:
            r7 = 0
        L51:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
            goto L58
        L55:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r3)
        L58:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.j.k(com.tencent.mm.plugin.sns.storage.SnsInfo):com.tencent.mm.plugin.sns.storage.SnsInfo");
    }

    public final boolean l(v74.s sVar) {
        java.lang.String str;
        boolean z17;
        int i17;
        boolean z18;
        int parseColor;
        int parseColor2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustContentContainerLayout", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        com.tencent.mars.xlog.Log.i("AdLookbookCardDetailItem", "adjustContentContainerLayout, snsId=" + ca4.z0.y0(this.f433824p));
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f228836i.findViewById(com.tencent.mm.R.id.n_6);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f228836i.findViewById(com.tencent.mm.R.id.afc);
        android.view.View view = this.f228833f;
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.iqw) : null;
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        v74.r rVar = v74.k0.E;
        int d17 = rVar.d(this.f433827s, this.f228839o, this.f433828t, sVar, pBool);
        boolean e17 = rVar.e(this.f433827s);
        if (findViewById == null) {
            str = "adjustContentContainerLayout";
            z17 = false;
            i17 = d17;
        } else if (pBool.value || e17) {
            str = "adjustContentContainerLayout";
            z17 = false;
            i17 = d17;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = findViewById;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardDetailItem", "adjustContentContainerLayout", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic$ItemSize;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardDetailItem", "adjustContentContainerLayout", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic$ItemSize;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMaskBackground", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
            if (com.tencent.mm.ui.bk.C()) {
                parseColor = android.graphics.Color.parseColor("#00191919");
                parseColor2 = android.graphics.Color.parseColor("#FF191919");
            } else {
                parseColor = android.graphics.Color.parseColor("#00FFFFFF");
                parseColor2 = android.graphics.Color.parseColor("#FFFFFFFF");
            }
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT, new int[]{parseColor, parseColor2});
            gradientDrawable.setGradientType(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMaskBackground", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$Companion");
            findViewById.setBackground(gradientDrawable);
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view3 = findViewById;
            str = "adjustContentContainerLayout";
            z17 = false;
            i17 = d17;
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardDetailItem", "adjustContentContainerLayout", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic$ItemSize;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookCardDetailItem", "adjustContentContainerLayout", "(Lcom/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic$ItemSize;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i18 = i17;
        if (this.A != i18) {
            rVar.a(this.f433831w, viewGroup, viewGroup2, null, i18, this.f433828t);
            z18 = true;
        } else {
            z18 = z17;
        }
        this.A = i18;
        com.tencent.mars.xlog.Log.i("AdLookbookCardDetailItem", "initView, inLargeWindow=" + this.f228839o + ", displayW=" + this.A + ", isChanged=" + z18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str, "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookCardDetailItem");
        return z18;
    }
}
