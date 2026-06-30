package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class AdListView extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.model.g1 f166189d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f166190e;

    /* renamed from: f, reason: collision with root package name */
    public int f166191f;

    /* renamed from: g, reason: collision with root package name */
    public int f166192g;

    /* renamed from: h, reason: collision with root package name */
    public int f166193h;

    public AdListView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f166190e = new java.util.HashSet();
        this.f166191f = -1;
        this.f166192g = -1;
        this.f166193h = -1;
    }

    @Override // android.view.ViewGroup
    public void attachViewToParent(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("attachViewToParent", "com.tencent.mm.plugin.sns.ui.AdListView");
        super.attachViewToParent(view, i17, layoutParams);
        if (view.getTag() != null && (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
            int i18 = baseViewHolder.f169262c;
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = baseViewHolder.timeLineObject;
            boolean z17 = true;
            if (timeLineObject.sightFolded != 1 && timeLineObject.showFlag != 1) {
                z17 = false;
            }
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.n(timeLineObject.Id, z17);
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = baseViewHolder.timeLineObject;
            java.lang.String str = timeLineObject2.Id;
            r45.y8 y8Var = timeLineObject2.AppInfo;
            java.lang.String str2 = "";
            s0Var.o(str, y8Var == null ? "" : y8Var.f390846d);
            s0Var.p(baseViewHolder.f169266e);
            java.util.HashSet hashSet = this.f166190e;
            if (!hashSet.contains(baseViewHolder.f169264d) && ((baseViewHolder.isAd && baseViewHolder.timeLineObject.ContentObj.f369837e == 15) || baseViewHolder.timeLineObject.ContentObj.f369837e == 18)) {
                i64.s1.c(com.tencent.mm.plugin.sns.model.l4.Fj().b1(baseViewHolder.f169264d), false, false, 0);
                hashSet.add(baseViewHolder.f169264d);
            }
            com.tencent.mm.plugin.sns.model.g1 g1Var = this.f166189d;
            if (g1Var != null) {
                int i19 = baseViewHolder.f169262c;
                java.lang.String str3 = baseViewHolder.f169268f;
                long j17 = baseViewHolder.f169266e;
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject3 = baseViewHolder.timeLineObject;
                boolean z18 = baseViewHolder.isAd;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxInfoFromHolder", "com.tencent.mm.plugin.sns.ui.AdListView");
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = baseViewHolder.f169275i0;
                if (snsInfo != null) {
                    str2 = snsInfo.getUxinfo();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfoFromHolder", "com.tencent.mm.plugin.sns.ui.AdListView");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfoFromHolder", "com.tencent.mm.plugin.sns.ui.AdListView");
                }
                g1Var.b(i19, str3, j17, timeLineObject3, z18, str2);
            }
            b(baseViewHolder.f169266e);
        }
        if (x51.o1.G) {
            getChildCount();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("attachViewToParent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public final void b(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateUnreadTipFaultRange", "com.tencent.mm.plugin.sns.ui.AdListView");
        com.tencent.mm.plugin.sns.model.l4.Mj().getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkExposeFeeds", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkExposeFeeds", "com.tencent.mm.plugin.sns.model.SnsUnreadTipManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateUnreadTipFaultRange", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.view.ViewGroup
    public void detachViewFromParent(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("detachViewFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
        if (view.getTag() != null && (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(baseViewHolder.f169262c);
            sb6.append(" ");
            sb6.append(baseViewHolder.f169268f);
        }
        if (x51.o1.G) {
            getChildCount();
        }
        super.detachViewFromParent(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("detachViewFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.view.ViewGroup
    public void detachViewsFromParent(int i17, int i18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("detachViewsFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
        for (int i19 = i17; i19 < i17 + i18; i19++) {
            android.view.View childAt = getChildAt(i19);
            if (childAt.getTag() != null && (childAt.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
                com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) childAt.getTag();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(baseViewHolder.f169262c);
                sb6.append(" ");
                sb6.append(baseViewHolder.f169268f);
                com.tencent.mm.plugin.sns.model.g1 g1Var = this.f166189d;
                if (g1Var != null) {
                    g1Var.a(baseViewHolder.f169262c, baseViewHolder.f169268f, baseViewHolder.f169266e, baseViewHolder.timeLineObject, baseViewHolder.isAd);
                }
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(baseViewHolder.f169262c);
                sb7.append(" ");
                sb7.append(baseViewHolder.f169268f);
            }
            if (x51.o1.G) {
                getChildCount();
            }
        }
        super.detachViewsFromParent(i17, i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("detachViewsFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.AdListView");
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.AdListView");
        return dispatchTouchEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView
    public void layoutChildren() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutChildren", "com.tencent.mm.plugin.sns.ui.AdListView");
        super.layoutChildren();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutChildren", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002f, code lost:
    
        if (r3 != 2) goto L16;
     */
    @Override // android.widget.AbsListView, android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "onInterceptTouchEvent"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.AdListView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            boolean r2 = super.onInterceptTouchEvent(r7)
            int r3 = r6.f166193h
            if (r3 >= 0) goto L1e
            android.content.Context r3 = r6.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            r6.f166193h = r3
        L1e:
            int r3 = r7.getActionMasked()
            float r4 = r7.getX()
            int r4 = (int) r4
            float r7 = r7.getY()
            int r7 = (int) r7
            r5 = 2
            if (r3 == 0) goto L32
            if (r3 == r5) goto L36
            goto L4e
        L32:
            r6.f166192g = r4
            r6.f166191f = r7
        L36:
            int r3 = r6.f166192g
            int r4 = r4 - r3
            int r3 = java.lang.Math.abs(r4)
            int r4 = r6.f166191f
            int r7 = r7 - r4
            int r7 = java.lang.Math.abs(r7)
            if (r2 == 0) goto L4e
            if (r3 <= r7) goto L4e
            int r3 = r6.f166193h
            int r3 = r3 * r5
            if (r7 >= r3) goto L4e
            r2 = 0
        L4e:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sns.ui.AdListView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.AdListView");
        super.onLayout(z17, i17, i18, i19, i27);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewAdded", "com.tencent.mm.plugin.sns.ui.AdListView");
        if (view.getTag() != null && (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
            int i17 = baseViewHolder.f169262c;
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject = baseViewHolder.timeLineObject;
            boolean z17 = true;
            if (timeLineObject.sightFolded != 1 && timeLineObject.showFlag != 1) {
                z17 = false;
            }
            com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
            s0Var.n(timeLineObject.Id, z17);
            com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject2 = baseViewHolder.timeLineObject;
            java.lang.String str = timeLineObject2.Id;
            r45.y8 y8Var = timeLineObject2.AppInfo;
            java.lang.String str2 = "";
            s0Var.o(str, y8Var == null ? "" : y8Var.f390846d);
            s0Var.p(baseViewHolder.f169266e);
            java.util.HashSet hashSet = this.f166190e;
            if (!hashSet.contains(baseViewHolder.f169264d) && ((baseViewHolder.isAd && baseViewHolder.timeLineObject.ContentObj.f369837e == 15) || baseViewHolder.timeLineObject.ContentObj.f369837e == 18)) {
                i64.s1.c(com.tencent.mm.plugin.sns.model.l4.Fj().b1(baseViewHolder.f169264d), false, false, 0);
                hashSet.add(baseViewHolder.f169264d);
            }
            com.tencent.mm.plugin.sns.model.g1 g1Var = this.f166189d;
            if (g1Var != null) {
                int i18 = baseViewHolder.f169262c;
                java.lang.String str3 = baseViewHolder.f169268f;
                long j17 = baseViewHolder.f169266e;
                com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject3 = baseViewHolder.timeLineObject;
                boolean z18 = baseViewHolder.isAd;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getUxInfoFromHolder", "com.tencent.mm.plugin.sns.ui.AdListView");
                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = baseViewHolder.f169275i0;
                if (snsInfo != null) {
                    str2 = snsInfo.getUxinfo();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfoFromHolder", "com.tencent.mm.plugin.sns.ui.AdListView");
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getUxInfoFromHolder", "com.tencent.mm.plugin.sns.ui.AdListView");
                }
                g1Var.b(i18, str3, j17, timeLineObject3, z18, str2);
            }
            b(baseViewHolder.f169266e);
        }
        if (x51.o1.G) {
            getChildCount();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewAdded", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewRemoved", "com.tencent.mm.plugin.sns.ui.AdListView");
        if (view.getTag() != null && (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(baseViewHolder.f169262c);
            sb6.append(" ");
            sb6.append(baseViewHolder.f169268f);
            com.tencent.mm.plugin.sns.model.g1 g1Var = this.f166189d;
            if (g1Var != null) {
                g1Var.a(baseViewHolder.f169262c, baseViewHolder.f169268f, baseViewHolder.f169266e, baseViewHolder.timeLineObject, baseViewHolder.isAd);
            }
            if (baseViewHolder.timeLineObject.ContentObj.f369837e == 3) {
                com.tencent.mm.plugin.sns.storage.SnsInfo b17 = com.tencent.mm.plugin.sns.model.l4.Fj().b1(baseViewHolder.f169264d);
                com.tencent.mm.modelstat.k0.k(com.tencent.mm.modelstat.j0.Sns, baseViewHolder.timeLineObject.statExtStr, b17 == null ? 0 : b17.getAdRecSrc(), ca4.z0.t0(baseViewHolder.f169266e), b17);
            }
        }
        if (x51.o1.G) {
            getChildCount();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRemoved", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.widget.AdapterView, android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeView", "com.tencent.mm.plugin.sns.ui.AdListView");
        super.removeView(view);
        if (view.getTag() != null && (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(baseViewHolder.f169262c);
            sb6.append(" ");
            sb6.append(baseViewHolder.f169268f);
        }
        if (x51.o1.G) {
            getChildCount();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeView", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeViewInLayout", "com.tencent.mm.plugin.sns.ui.AdListView");
        if (view.getTag() != null && (view.getTag() instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder)) {
            com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder baseViewHolder = (com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) view.getTag();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(baseViewHolder.f169262c);
            sb6.append(" ");
            sb6.append(baseViewHolder.f169268f);
        }
        if (x51.o1.G) {
            getChildCount();
        }
        super.removeViewInLayout(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeViewInLayout", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public void setOnDispatchTouchListener(com.tencent.mm.plugin.sns.ui.d dVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.AdListView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public void setTimelineEvent(com.tencent.mm.plugin.sns.model.g1 g1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTimelineEvent", "com.tencent.mm.plugin.sns.ui.AdListView");
        this.f166189d = g1Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTimelineEvent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public void setTimelineStat(com.tencent.mm.plugin.sns.model.h1 h1Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTimelineStat", "com.tencent.mm.plugin.sns.ui.AdListView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTimelineStat", "com.tencent.mm.plugin.sns.ui.AdListView");
    }

    public AdListView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f166190e = new java.util.HashSet();
        this.f166191f = -1;
        this.f166192g = -1;
        this.f166193h = -1;
    }

    @Override // android.view.ViewGroup
    public void detachViewFromParent(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("detachViewFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
        if (x51.o1.G) {
            getChildCount();
        }
        super.detachViewFromParent(i17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("detachViewFromParent", "com.tencent.mm.plugin.sns.ui.AdListView");
    }
}
