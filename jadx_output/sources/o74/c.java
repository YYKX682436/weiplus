package o74;

/* loaded from: classes4.dex */
public class c extends com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem implements xd4.d, z84.i, i64.k0 {

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager f343558q;

    /* renamed from: s, reason: collision with root package name */
    public o74.b f343560s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f343561t;

    /* renamed from: u, reason: collision with root package name */
    public w74.c f343562u;

    /* renamed from: v, reason: collision with root package name */
    public w74.h f343563v;

    /* renamed from: x, reason: collision with root package name */
    public w74.b f343565x;

    /* renamed from: r, reason: collision with root package name */
    public final z74.i f343559r = new z74.i();

    /* renamed from: w, reason: collision with root package name */
    public final w74.d f343564w = new w74.d();

    public void F(android.view.View view, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doMaterialClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        android.app.Activity activity = this.f169249f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("makeFinderTopicCardAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        v64.c a17 = v64.a.a(5, activity);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("makeFinderTopicCardAction", "com.tencent.mm.plugin.sns.ad.timeline.clicker.AdTimelinePartActionMaker");
        if (a17 != null) {
            a17.a(view, 0, snsInfo, new v64.d());
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = this.f343561t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            w74.c cVar = this.f343562u;
            if (cVar != null) {
                cVar.a(snsInfo2, false);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doMaterialClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void G(o74.b r10, com.tencent.mm.plugin.sns.storage.SnsInfo r11, s34.h0 r12) {
        /*
            r9 = this;
            java.lang.String r12 = "fillTopicCardContent"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r0)
            w74.h r1 = r9.f343563v
            if (r1 == 0) goto L18
            java.lang.String r2 = "setSnsInfo"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r1.f443554d = r11
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        L18:
            androidx.recyclerview.widget.RecyclerView r1 = r10.F0
            if (r1 == 0) goto L71
            androidx.recyclerview.widget.f2 r2 = r1.getAdapter()
            boolean r3 = r2 instanceof w74.e
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardRecyclerViewAdapter"
            r5 = 1
            if (r3 == 0) goto L56
            r3 = r2
            w74.e r3 = (w74.e) r3
            r3.getClass()
            java.lang.String r6 = "isSameSnsInfo"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r4)
            r7 = 0
            if (r11 != 0) goto L3a
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
            goto L4f
        L3a:
            com.tencent.mm.plugin.sns.storage.SnsInfo r3 = r3.f443536f     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = ca4.z0.T(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r8 = ca4.z0.T(r11)     // Catch: java.lang.Throwable -> L4c
            boolean r3 = java.util.Objects.equals(r3, r8)     // Catch: java.lang.Throwable -> L4c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
            goto L50
        L4c:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r4)
        L4f:
            r3 = r7
        L50:
            if (r3 == 0) goto L56
            r2.notifyDataSetChanged()
            goto L57
        L56:
            r7 = r5
        L57:
            if (r7 == 0) goto L71
            w74.e r2 = new w74.e
            androidx.recyclerview.widget.RecyclerView r10 = r10.F0
            r2.<init>(r10, r11)
            r2.setHasStableIds(r5)
            java.lang.String r10 = "setItemClickListener"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r4)
            r2.f443538h = r9
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r4)
            r1.setAdapter(r2)
        L71:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o74.c.G(o74.b, com.tencent.mm.plugin.sns.storage.SnsInfo, s34.h0):void");
    }

    public final void H(o74.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        if (bVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        android.view.ViewGroup viewGroup = bVar.D0;
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderTopicTimeLineItem", "fillViewHolder::the root null, is it right????");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        bVar.E0 = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) viewGroup.findViewById(com.tencent.mm.R.id.n3c);
        bVar.F0 = (androidx.recyclerview.widget.RecyclerView) viewGroup.findViewById(com.tencent.mm.R.id.n3b);
        bVar.H0 = (android.widget.ImageView) viewGroup.findViewById(com.tencent.mm.R.id.n39);
        bVar.I0 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.n3a);
        bVar.J0 = (com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout) viewGroup.findViewById(com.tencent.mm.R.id.n38);
        bVar.K0 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.n37);
        bVar.G0 = (android.view.ViewGroup) viewGroup.findViewById(com.tencent.mm.R.id.n3_);
        android.widget.ImageView imageView = bVar.H0;
        if (imageView != null) {
            imageView.setImageResource(com.tencent.mm.R.raw.sns_ad_finder_topic_item_rear_flag);
        }
        com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout stackUpLayout = bVar.J0;
        if (stackUpLayout != null) {
            stackUpLayout.setStackUpWidthSize(i65.a.b(this.f169249f, 6));
            int b17 = i65.a.b(this.f169249f, 20);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setChildSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
            stackUpLayout.f163879e = b17;
            stackUpLayout.f163880f = b17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setChildSize", "com.tencent.mm.plugin.sns.ad.widget.stackup.StackUpLayout");
        }
        if (bVar.E0 != null) {
            float b18 = i65.a.b(this.f169249f, 8);
            bVar.E0.b(b18, b18, 0.0f, 0.0f);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = bVar.F0;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = new com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager(bVar.F0);
            this.f343558q = cardLayoutManager;
            this.f343563v = new w74.h(this.f343559r, this.f343565x);
            cardLayoutManager.D(new z84.g(i65.a.b(this.f169249f, 12), i65.a.b(this.f169249f, 8)));
            this.f343558q.E(this.f343563v);
            bVar.F0.setLayoutManager(this.f343558q);
        }
        this.f343562u = new w74.c(this.f169249f, bVar.K0, bVar.F0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillViewHolder", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // z84.i
    public void b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            F(view, this.f343561t);
            w74.b bVar = this.f343565x;
            if (bVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
                w74.a d17 = bVar.d(i17);
                if (d17 != null) {
                    d17.f443509d++;
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateItemDataClickCount", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardAdChannelData");
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // xd4.d
    public void c(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            xd4.o0.d().j();
            xd4.g.a().d(this);
            w74.h hVar = this.f343563v;
            if (hVar != null) {
                hVar.g(this.f343558q);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.tav.core.AssetExtension.SCENE_PLAY, "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // i64.k0
    public void d(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f343561t;
            if (snsInfo != null) {
                java.lang.String T = ca4.z0.T(snsInfo);
                if (!android.text.TextUtils.isEmpty(T) && T.equals(str)) {
                    a84.t0.a(this.f343565x);
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAdRemoved", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // xd4.d
    public void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f343558q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            w74.h hVar = this.f343563v;
            if (hVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
                hVar.f443552b = false;
                z74.i iVar = hVar.f443553c;
                if (iVar != null) {
                    try {
                        iVar.d();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            }
            if (cardLayoutManager != null) {
                cardLayoutManager.o();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        } catch (java.lang.Throwable unused2) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // xd4.d
    public android.graphics.Rect getDisplayRect() {
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            o74.b bVar = this.f343560s;
            if (bVar != null && (roundedCornerFrameLayout = bVar.E0) != null) {
                int[] iArr = new int[2];
                roundedCornerFrameLayout.getLocationOnScreen(iArr);
                int i17 = iArr[0];
                int i18 = iArr[1];
                android.graphics.Rect rect = new android.graphics.Rect(i17, i18, bVar.E0.getWidth() + i17, bVar.E0.getHeight() + i18);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
                return rect;
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getDisplayRect", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        return null;
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void h(android.view.ViewStub viewStub, com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        if (!(baseViewHolder instanceof o74.b)) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderTopicTimeLineItem", "buildContent::the holder is not type of FinderTopicItemViewHolder!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        this.f343560s = (o74.b) baseViewHolder;
        try {
            if (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder) != null) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).setLayoutResource(com.tencent.mm.R.layout.cot);
                if (!baseViewHolder.f169290q) {
                    this.f343560s.D0 = (android.view.ViewGroup) com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.r(baseViewHolder).inflate();
                    baseViewHolder.f169290q = true;
                }
            } else if (!baseViewHolder.f169290q) {
                this.f343560s.D0 = (android.view.ViewGroup) baseViewHolder.f169272h.findViewById(com.tencent.mm.R.id.f482625jn);
                baseViewHolder.f169290q = true;
            }
            this.f343565x = new w74.b(1);
            H(this.f343560s);
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildContent", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public void p(com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder, int i17, com.tencent.mm.plugin.sns.ui.ns nsVar, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, int i18, com.tencent.mm.plugin.sns.ui.bs bsVar) {
        i64.b1 b1Var;
        com.tencent.mm.plugin.sns.ui.l1 l1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        if (!(baseViewHolder instanceof o74.b)) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderTopicTimeLineItem", "fillItem::the holder is not type of FinderTopicItemViewHolder!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        if (nsVar == null) {
            com.tencent.mars.xlog.Log.e("SnsAd.FinderTopicTimeLineItem", "fillItem::the struct is null!!!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        if (baseViewHolder.f169303w0) {
            com.tencent.mars.xlog.Log.i("SnsAd.FinderTopicTimeLineItem", "holder is busy");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        baseViewHolder.f169303w0 = true;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = nsVar.f170025a;
        if (snsInfo == null || snsInfo.getAdXml() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            return;
        }
        this.f343561t = snsInfo;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ad fillItem, finderTopicItem, pos=");
        sb6.append(i17);
        sb6.append(", snsId=");
        sb6.append(timeLineObject == null ? "" : timeLineObject.Id);
        sb6.append(", hash=");
        sb6.append(hashCode());
        com.tencent.mars.xlog.Log.i("SnsAd.FinderTopicTimeLineItem", sb6.toString());
        try {
            o74.b bVar = (o74.b) baseViewHolder;
            s34.h0 h0Var = snsInfo.getAdXml().adFinderTopicInfo;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillRelationAvatarAndText", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            a84.y0.l(bVar.K0, h0Var.f402654d);
            this.f343564w.c(bVar.J0, snsInfo);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillRelationAvatarAndText", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillTopicRearFlagTextAndImage", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            android.widget.TextView textView = bVar.I0;
            if (textView != null) {
                textView.setText(h0Var.f402653c);
            }
            android.view.ViewGroup viewGroup = bVar.G0;
            if (viewGroup != null) {
                viewGroup.setOnClickListener(new o74.a(this, snsInfo));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillTopicRearFlagTextAndImage", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            G(bVar, snsInfo, h0Var);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            w74.c cVar = this.f343562u;
            if (cVar != null) {
                cVar.a(snsInfo, true);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doDynamicRequest", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            w74.b bVar2 = this.f343565x;
            if (bVar2 != null) {
                bVar2.e(snsInfo, 0, h0Var);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            if (bsVar == null || (l1Var = bsVar.f168036b) == null || (b1Var = l1Var.f169702c) == null) {
                b1Var = null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsAdStatistic", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            if (b1Var != null) {
                java.lang.String T = ca4.z0.T(snsInfo);
                if (!android.text.TextUtils.isEmpty(T) && !"0".equals(T)) {
                    b1Var.a(T, this);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addOnRemovedListener", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        } catch (java.lang.Throwable unused) {
        }
        baseViewHolder.f169303w0 = false;
        g(nsVar, 3);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillItem", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // xd4.d
    public void pause() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager = this.f343558q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
            w74.h hVar = this.f343563v;
            if (hVar != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
                hVar.f443552b = false;
                z74.i iVar = hVar.f443553c;
                if (iVar != null) {
                    try {
                        iVar.d();
                    } catch (java.lang.Throwable unused) {
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pausePlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.topic.TopicCardVideoPlayHelper");
            }
            if (cardLayoutManager != null) {
                cardLayoutManager.o();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        } catch (java.lang.Throwable unused2) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("pause", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // xd4.d
    public void stop() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        try {
            z74.i iVar = this.f343559r;
            if (iVar != null) {
                iVar.j();
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("stop", "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
    }

    @Override // com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem
    public java.lang.String u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ad.timeline.item.AdFinderTopicTimeLineItem");
        return "AdFinderTopicTimeLineItem";
    }
}
