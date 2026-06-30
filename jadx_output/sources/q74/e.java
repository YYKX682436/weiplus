package q74;

/* loaded from: classes4.dex */
public class e extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem implements xd4.d, z84.i, z84.h, i64.k0 {
    public d94.g A;
    public android.widget.FrameLayout B;
    public q74.z E;
    public z84.k F;
    public w64.n G;
    public q74.d0 H;

    /* renamed from: q, reason: collision with root package name */
    public q74.d f360444q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f360445r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager f360446s;

    /* renamed from: u, reason: collision with root package name */
    public q74.b1 f360448u;

    /* renamed from: v, reason: collision with root package name */
    public q74.b0 f360449v;

    /* renamed from: w, reason: collision with root package name */
    public w64.n f360450w;

    /* renamed from: x, reason: collision with root package name */
    public int f360451x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.Point f360452y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.ViewGroup f360453z;

    /* renamed from: t, reason: collision with root package name */
    public final z74.i f360447t = new z74.i();
    public final android.graphics.Rect C = new android.graphics.Rect();
    public final android.graphics.Point D = new android.graphics.Point();
    public final d94.a I = new q74.b(this);

    public void F(android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        if (snsInfo == null || snsInfo.getAdXml() == null || snsInfo.getAdXml().adSliderFullCardInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        s34.a1 a1Var = snsInfo.getAdXml().adSliderFullCardInfo;
        java.util.List<s34.x0> list = a1Var.resInfoList;
        if (list == null || list.size() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        s34.x0 x0Var = a1Var.resInfoList.get(i17);
        if (x0Var == null || x0Var.clickActionInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        int a17 = a1Var.a(i17);
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo adClickActionInfo = x0Var.clickActionInfo;
        adClickActionInfo.f162569a = 3;
        this.f360450w.o(adClickActionInfo, snsInfo, a17);
        this.f360450w.k(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(q74.d r18, com.tencent.mm.plugin.sns.storage.SnsInfo r19, s34.a1 r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "fillSlideFullCardContent"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            q74.b1 r5 = r0.f360448u
            if (r5 == 0) goto L1e
            java.lang.String r6 = "setSnsInfo"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r7)
            r5.f360421d = r2
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r7)
        L1e:
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView r5 = r1.F0
            if (r5 == 0) goto Lb6
            androidx.recyclerview.widget.f2 r6 = r5.getAdapter()
            boolean r7 = r6 instanceof q74.x0
            java.lang.String r8 = "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardRecyclerViewAdapter"
            r9 = 1
            if (r7 == 0) goto L5c
            r7 = r6
            q74.x0 r7 = (q74.x0) r7
            r7.getClass()
            java.lang.String r10 = "isSameSnsInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r8)
            r11 = 0
            if (r2 != 0) goto L40
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
            goto L55
        L40:
            com.tencent.mm.plugin.sns.storage.SnsInfo r7 = r7.f360560e     // Catch: java.lang.Throwable -> L52
            java.lang.String r7 = ca4.z0.T(r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r12 = ca4.z0.T(r19)     // Catch: java.lang.Throwable -> L52
            boolean r7 = java.util.Objects.equals(r7, r12)     // Catch: java.lang.Throwable -> L52
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
            goto L56
        L52:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r8)
        L55:
            r7 = r11
        L56:
            if (r7 == 0) goto L5c
            r6.notifyDataSetChanged()
            goto L5d
        L5c:
            r11 = r9
        L5d:
            if (r11 == 0) goto Lb6
            com.tencent.mm.plugin.sns.ui.bs r6 = r0.f169251h
            q74.x0 r7 = new q74.x0
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView r10 = r1.F0
            w64.n r15 = new w64.n
            android.app.Activity r12 = r0.f169249f
            r13 = 0
            i64.b1 r14 = r0.I(r6)
            r16 = 0
            q74.c r11 = new q74.c
            r11.<init>(r0, r6, r1)
            r1 = r11
            r11 = r15
            r6 = r15
            r15 = r16
            r16 = r1
            r11.<init>(r12, r13, r14, r15, r16)
            r7.<init>(r10, r2, r6)
            int r1 = r0.f360451x
            r7.y(r1)
            java.lang.String r1 = "getItemMaterialSize"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r8)
            android.graphics.Point r2 = new android.graphics.Point
            int r6 = r7.f360566n
            int r10 = r7.f360567o
            r2.<init>(r6, r10)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            r0.f360452y = r2
            r7.setHasStableIds(r9)
            java.lang.String r1 = "setItemClickListener"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r8)
            r7.f360563h = r0
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            java.lang.String r1 = "setItemActionBtnClickListener"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r8)
            r7.f360564i = r0
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r8)
            r5.setAdapter(r7)
        Lb6:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q74.e.G(q74.d, com.tencent.mm.plugin.sns.storage.SnsInfo, s34.a1):void");
    }

    public final void H(q74.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        if (dVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        android.view.ViewGroup viewGroup = this.f360444q.D0;
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideFullCardTimeLineItem", "fillViewHolder::the root null, is it right????");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        dVar.E0 = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.n5p);
        dVar.F0 = (com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView) viewGroup.findViewById(com.tencent.mm.R.id.n5o);
        dVar.H0 = (android.view.ViewStub) viewGroup.findViewById(com.tencent.mm.R.id.qpg);
        android.view.View view = dVar.f169277j0;
        if (view instanceof android.view.ViewGroup) {
            this.f360453z = (android.view.ViewGroup) view;
        }
        if (dVar.F0 != null) {
            this.f360451x = q74.t0.c(this.f169249f, 0, this.f169247d);
            dVar.F0.setHasFixedSize(true);
            this.f360446s = new com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager(dVar.F0);
            this.f360448u = new q74.b1(this.f360447t, this.f360449v, 0);
            z84.k kVar = new z84.k(i65.a.b(this.f169249f, 12), i65.a.b(this.f169249f, 8));
            this.F = kVar;
            this.f360446s.D(kVar);
            this.f360446s.E(this.f360448u);
            dVar.F0.setLayoutManager(this.f360446s);
            this.f360450w = new w64.n(this.f169249f, 0, I(this.f169251h), null, new q74.a(this, dVar));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    public i64.b1 I(com.tencent.mm.plugin.sns.ui.bs bsVar) {
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        if (bsVar == null || (l1Var = bsVar.f168036b) == null || (b1Var = l1Var.f169702c) == null) {
            b1Var = null;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        return b1Var;
    }

    public void J(com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        q74.b1 b1Var = this.f360448u;
        if (b1Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
            b1Var.f360419b = false;
            z74.i iVar = b1Var.f360420c;
            if (iVar != null) {
                try {
                    iVar.d();
                } catch (java.lang.Throwable unused) {
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardVideoPlayHelper");
        }
        if (cardLayoutManager != null) {
            cardLayoutManager.o();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // z84.h
    public void a(android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemActionBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            q74.b0 b0Var = this.f360449v;
            if (b0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataBtnClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                q74.a0 d17 = b0Var.d(i17);
                if (d17 != null) {
                    d17.f360393f++;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataBtnClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemActionBtnClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // z84.i
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            F(view, this.f360445r, i17);
            q74.b0 b0Var = this.f360449v;
            if (b0Var != null) {
                b0Var.g(i17);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            xd4.o0.d().j();
            xd4.g.a().d(this);
            q74.b1 b1Var = this.f360448u;
            if (b1Var != null) {
                b1Var.l(this.f360446s);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            q74.b0 b0Var = this.f360449v;
            if (b0Var != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetCurrentIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
                b0Var.f360417j = -1;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetCurrentIndex", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            }
            if (this.f169249f instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) {
                J(this.f360446s);
            }
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f360445r;
            if (snsInfo != null) {
                java.lang.String T = ca4.z0.T(snsInfo);
                if (!android.text.TextUtils.isEmpty(T) && T.equals(str)) {
                    a84.t0.a(this.f360449v);
                }
            }
            q74.d0 d0Var = this.H;
            if (d0Var != null) {
                d0Var.c();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            com.tencent.mm.plugin.sns.storage.ADXml adXml = this.f360445r.getAdXml();
            boolean z17 = (adXml == null || adXml.touchParticleAnimConfig == null || this.B == null) ? false : true;
            com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView adSlideRecyclerView = this.f360444q.F0;
            int totalTouchDuration = (int) adSlideRecyclerView.getTotalTouchDuration();
            int totalTouchCount = adSlideRecyclerView.getTotalTouchCount();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
            com.tencent.mars.xlog.Log.i("AdSlideRecyclerView", "reset");
            adSlideRecyclerView.f163211c2 = 0L;
            adSlideRecyclerView.f163213e2 = 0L;
            adSlideRecyclerView.f163212d2 = 0;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetTouchReportData", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideRecyclerView");
            a84.t0.a(new q74.v(this.f360445r, 1, totalTouchDuration, totalTouchCount, z17));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideFullCardTimeLineItem", "reportTouchDuration, exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportTouchDuration", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            J(this.f360446s);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // z84.h
    public void f(android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemProductClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        q74.b0 b0Var = this.f360449v;
        if (b0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataProductClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
            q74.a0 d17 = b0Var.d(i17);
            if (d17 != null) {
                d17.f360401n++;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataProductClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.SlideFullCardAdChannelData");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemProductClick", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            q74.d dVar = this.f360444q;
            if (dVar != null && (roundedCornerFrameLayout = dVar.E0) != null) {
                int[] iArr = new int[2];
                roundedCornerFrameLayout.getLocationOnScreen(iArr);
                int i17 = iArr[0];
                int i18 = iArr[1];
                android.graphics.Rect rect = new android.graphics.Rect(i17, i18, dVar.E0.getWidth() + i17, dVar.E0.getHeight() + i18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
                return rect;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        return null;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        if (!(baseViewHolder instanceof q74.d)) {
            com.tencent.mars.xlog.Log.e("SnsAd.AdSlideFullCardTimeLineItem", "buildContent::the holder is not type of AdSlideFullCardItemViewHolder!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
            return;
        }
        this.f360444q = (q74.d) baseViewHolder;
        try {
            if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) != null) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.cq_);
                if (!baseViewHolder.f169290q) {
                    this.f360444q.D0 = (android.view.ViewGroup) com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                    baseViewHolder.f169290q = true;
                }
            } else if (!baseViewHolder.f169290q) {
                this.f360444q.D0 = (android.view.ViewGroup) baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.n5j);
                baseViewHolder.f169290q = true;
            }
            this.f360449v = new q74.b0(1);
            H(this.f360444q);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:17|(6:18|19|(3:25|(1:27)|28)|29|(1:31)|32)|(3:104|105|(21:107|108|109|110|35|(1:103)(4:39|40|41|42)|43|(3:45|46|47)(1:96)|48|(2:50|(1:54))|55|56|(1:58)(1:93)|59|(1:92)(5:63|(5:65|66|67|(1:69)(1:88)|70)(1:91)|71|(1:75)|76)|77|78|(1:80)|82|83|84))|34|35|(1:37)|103|43|(0)(0)|48|(0)|55|56|(0)(0)|59|(1:61)|92|77|78|(0)|82|83|84) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0228, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0229, code lost:
    
        com.tencent.mars.xlog.Log.e(r14, "setTouchAnimConfig, exp=" + r0.toString());
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b A[Catch: all -> 0x017f, TryCatch #6 {all -> 0x017f, blocks: (B:47:0x014b, B:48:0x0150, B:50:0x015b, B:52:0x0165, B:54:0x016d, B:55:0x0170), top: B:46:0x014b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0222 A[Catch: all -> 0x0228, TRY_LEAVE, TryCatch #3 {all -> 0x0228, blocks: (B:78:0x021e, B:80:0x0222), top: B:77:0x021e }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x014f  */
    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder r27, int r28, com.tencent.mm.plugin.sns.ui.ns r29, com.tencent.mm.protocal.protobuf.TimeLineObject r30, int r31, com.tencent.mm.plugin.sns.ui.bs r32) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q74.e.p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem$BaseViewHolder, int, com.tencent.mm.plugin.sns.ui.ns, com.tencent.mm.protocal.protobuf.TimeLineObject, int, com.tencent.mm.plugin.sns.ui.bs):void");
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            J(this.f360446s);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        try {
            z74.i iVar = this.f360447t;
            if (iVar != null) {
                iVar.j();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.adSlideFullCard.AdSlideFullCardTimeLineItem");
        return "AdSlideFullCardTimeLineItem";
    }
}
