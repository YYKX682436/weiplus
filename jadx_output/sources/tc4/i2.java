package tc4;

/* loaded from: classes4.dex */
public abstract class i2 extends tc4.x1 implements tc4.s0 {
    public com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout V;
    public com.tencent.mm.plugin.sns.ui.SnsTranslateResultView W;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f417366l1;

    /* renamed from: p0, reason: collision with root package name */
    public zc4.b f417367p0;

    /* renamed from: x0, reason: collision with root package name */
    public in5.s0 f417368x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f417369y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void A() {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateCheckEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        boolean z17 = com.tencent.mm.plugin.sns.ui.improve.component.u.f169000d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getEnableLargeUI$cp", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveConfigUIC$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLARGE_RIGHT_PANEL_LAYOUT_WIDTH", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLARGE_RIGHT_PANEL_LAYOUT_WIDTH$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            jz5.g gVar = tc4.x1.Q;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLARGE_RIGHT_PANEL_LAYOUT_WIDTH$delegate$cp", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
            i17 = ((java.lang.Number) ((jz5.n) gVar).getValue()).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLARGE_RIGHT_PANEL_LAYOUT_WIDTH", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild$Companion");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getRightPanelLayoutWidth", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
            i17 = -1;
        }
        android.view.ViewGroup.LayoutParams layoutParams = getRightPanelLayout().getLayoutParams();
        layoutParams.width = i17;
        getRightPanelLayout().setLayoutParams(layoutParams);
        android.view.ViewGroup contentContainer = getContentContainer();
        if (contentContainer != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = contentContainer.getLayoutParams();
            kotlin.jvm.internal.o.f(layoutParams2, "getLayoutParams(...)");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
            layoutParams2.width = z17 ? -2 : -1;
            if (layoutParams2 instanceof android.widget.LinearLayout.LayoutParams) {
                if (z17) {
                    ((android.widget.LinearLayout.LayoutParams) layoutParams2).gravity = 1;
                } else {
                    ((android.widget.LinearLayout.LayoutParams) layoutParams2).gravity = 0;
                }
            } else if (layoutParams2 instanceof android.widget.RelativeLayout.LayoutParams) {
                if (z17) {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams2).addRule(14);
                } else {
                    ((android.widget.RelativeLayout.LayoutParams) layoutParams2).removeRule(14);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Improve.TimelineItemBuild", "updateContentLayoutParams: enableLargeUI=" + z17 + ',');
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateContentLayoutParams", "com.tencent.mm.plugin.sns.ui.improve.item.large.IImproveEnableLargeUI");
            contentContainer.setLayoutParams(layoutParams2);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateCheckEnableLargeUI", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    @Override // tc4.s0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        android.view.View divider = getDivider();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(divider, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "hideDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        divider.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(divider, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "hideDivider", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    @Override // tc4.s0
    public void b() {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f417367p0;
        if (bVar == null || (n17 = bVar.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return;
        }
        android.widget.TextView publishTimeText = getPublishTimeText();
        if (publishTimeText != null) {
            publishTimeText.setText(n17.f1());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        boolean z17 = ld4.a.f318107c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableShowDebugLabel", "com.tencent.mm.plugin.sns.ui.item.improve.config.TimelineItemConfig");
        if (z17) {
            getDebugLabel().setText(y() + " - " + n17.U0() + " - " + n17.a1());
            if (getViewType() == 38) {
                r45.jj4 R0 = n17.R0();
                if (R0 == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
                    return;
                }
                getDebugLabel().append("\n");
                getDebugLabel().append("media:" + R0.f377855d);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    @Override // tc4.s0
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewRecycleInMain", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewRecycleInMain", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:256:0x06fd. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0ae6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0b21  */
    @Override // tc4.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean f(in5.s0 r57, zc4.b r58, int r59) {
        /*
            Method dump skipped, instructions count: 3756
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.i2.f(in5.s0, zc4.b, int):boolean");
    }

    public java.lang.Object g(kotlin.coroutines.Continuation continuation) {
        xc4.p n17;
        xc4.p n18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewRecycled$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        x("MicroMsg.Improve.TimelineItemMeasure", "[" + hashCode() + "] onViewRecycled");
        com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemHeader itemHeader = getItemHeader();
        zc4.b bVar = this.f417367p0;
        itemHeader.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemHeader");
        if (itemHeader.getContext() instanceof com.tencent.mm.plugin.sns.ui.improve.ImproveSnsTimelineUI) {
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView improveUnreadTierView = itemHeader.f169096d;
            improveUnreadTierView.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
            android.content.Context context = improveUnreadTierView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC improveUnreadUIC = (com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC.class);
            improveUnreadUIC.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeObserver", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            improveUnreadUIC.f169016i.remove(improveUnreadTierView);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeObserver", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadUIC");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.component.unread.ImproveUnreadTierView");
            rc4.e eVar = rc4.e.f394136a;
            long y07 = (bVar == null || (n17 = bVar.n()) == null) ? -1L : n17.y0();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("detachFeedId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            rc4.e.f394145j.remove(java.lang.Long.valueOf(y07));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("detachFeedId", "com.tencent.mm.plugin.sns.ui.improve.finder.FinderTierManager");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemHeader");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.header.ImproveItemHeader");
        }
        getItemFooter().k(this.f417367p0);
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout improveInteractionLayout = this.V;
        if (improveInteractionLayout != null) {
            improveInteractionLayout.reset();
        }
        zc4.b bVar2 = this.f417367p0;
        ad4.l.b((bVar2 == null || (n18 = bVar2.n()) == null) ? null : n18.a1());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRecycled$suspendImpl", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return f0Var;
    }

    public final com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout getCommentView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout improveInteractionLayout = this.V;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return improveInteractionLayout;
    }

    public final com.tencent.mm.plugin.sns.ui.SnsTranslateResultView getContentTranslateResultText() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView = this.W;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return snsTranslateResultView;
    }

    public final zc4.b getData() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getData", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f417367p0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getData", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return bVar;
    }

    public final in5.s0 getHolder() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        in5.s0 s0Var = this.f417368x0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return s0Var;
    }

    @Override // tc4.s0
    public zc4.b getImproveListItem() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImproveListItem", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f417367p0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImproveListItem", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return bVar;
    }

    public final int getSnsPosition() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        int i17 = this.f417369y0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return i17;
    }

    public final void n() {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("checkRefreshSpringUIStyle", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f417367p0;
        if (bVar == null || (n17 = bVar.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkRefreshSpringUIStyle", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return;
        }
        ca4.e1 e1Var = ca4.f1.f39897a;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.graphics.drawable.Drawable l17 = e1Var.l(context, n17.h1());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("replaceCommentIcon", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        getCommentImage().setImageDrawable(l17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("replaceCommentIcon", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemBuild");
        com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout improveInteractionLayout = this.V;
        if (improveInteractionLayout != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("containerView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
            android.view.View findViewById = improveInteractionLayout.findViewById(com.tencent.mm.R.id.f485333r33);
            r5 = findViewById instanceof android.view.View ? findViewById : null;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("containerView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout");
        }
        if (this.f417366l1) {
            if (r5 != null) {
                r5.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.a5c));
            }
        } else if (pc4.d.f353410a.x()) {
            if (r5 != null) {
                r5.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.d4x));
            }
        } else if (r5 != null) {
            r5.setBackground(i65.a.i(getContext(), com.tencent.mm.R.drawable.adw));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) getDelIconStub().findViewById(com.tencent.mm.R.id.f482844pi);
        if (weImageView != null) {
            weImageView.setIconColor(i65.a.d(getContext(), e1Var.n(n17.h1())));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = (com.tencent.mm.ui.widget.imageview.WeImageView) getGroupImageStub().findViewById(com.tencent.mm.R.id.f482852pt);
        if (weImageView2 != null) {
            weImageView2.setIconColor(i65.a.d(getContext(), e1Var.p(n17.h1())));
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = (com.tencent.mm.ui.widget.imageview.WeImageView) getStarIconStub().findViewById(com.tencent.mm.R.id.r_);
        if (weImageView3 != null) {
            weImageView3.setIconColor(i65.a.d(getContext(), e1Var.t(n17.h1())));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("checkRefreshSpringUIStyle", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("customLayoutMeasureForReuse", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        super.onConfigurationChanged(configuration);
        A();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final boolean p(zc4.b item) {
        xc4.p n17;
        xc4.p n18;
        xc4.p n19;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isItemChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String a17 = item.n().a1();
        zc4.b bVar = this.f417367p0;
        java.lang.String str = null;
        if (!kotlin.jvm.internal.o.b(a17, (bVar == null || (n19 = bVar.n()) == null) ? null : n19.a1())) {
            java.lang.String a18 = item.n().a1();
            zc4.b bVar2 = this.f417367p0;
            if (bVar2 != null && (n17 = bVar2.n()) != null) {
                str = n17.a1();
            }
            boolean z17 = !kotlin.jvm.internal.o.b(a18, str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isItemChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return z17;
        }
        zc4.b bVar3 = this.f417367p0;
        boolean z18 = false;
        if (bVar3 != null && (n18 = bVar3.n()) != null && item.n().getCreateTime() == n18.getCreateTime()) {
            z18 = true;
        }
        boolean z19 = !z18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isItemChanged", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return z19;
    }

    public void q() {
        xc4.p n17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f417367p0;
        if (bVar == null || (n17 = bVar.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return;
        }
        sd4.c cVar = com.tencent.mm.plugin.sns.ui.monitor.SnsJankActivity.f169929s;
        cVar.a(name(), "layoutCommentView");
        int b17 = n17.T0().b();
        int size = n17.getCommentList().size();
        x("MicroMsg.Improve.TimelineItemMeasure", "like size:" + b17 + " comment size:" + size);
        if (b17 > 0 || size > 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("buildCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            if (this.V == null) {
                nd4.e eVar = nd4.e.f336476a;
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                this.V = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout) eVar.a(com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout.class, context);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
                tc4.n1 n1Var = tc4.x1.G;
                layoutParams.setMargins(0, n1Var.g(), 0, n1Var.b());
                getCommentContainer().addView(this.V, layoutParams);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("buildCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout improveInteractionLayout = this.V;
            if (improveInteractionLayout != null) {
                improveInteractionLayout.setupLayout(n17);
            }
        } else {
            nd4.e.f336476a.b(this.V);
            this.V = null;
        }
        cVar.b(name());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("layoutCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public void r() {
        xc4.p n17;
        java.lang.Boolean bool;
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadAppNameView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f417367p0;
        if (bVar == null || (n17 = bVar.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadAppNameView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return;
        }
        boolean z17 = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).Bi() || !(n17.J0() != null && kotlin.jvm.internal.o.b(n17.J0(), getContext().getString(com.tencent.mm.R.string.f493118j33)));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getShowAppName", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        if (n17.K1 == null) {
            n17.o1();
        }
        java.lang.Boolean bool2 = n17.K1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getShowAppName", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        java.lang.Boolean bool3 = java.lang.Boolean.TRUE;
        if (kotlin.jvm.internal.o.b(bool2, bool3) && getViewType() != 22 && z17) {
            if (getAppNameStub() instanceof android.view.ViewStub) {
                bool = bool3;
                str = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo";
                android.widget.TextView l17 = tc4.x1.l(this, false, com.tencent.mm.R.color.f479515a62, com.tencent.mm.R.dimen.f479925j4, true, 0, 0, null, 112, null);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -1);
                layoutParams.setMargins(0, i65.a.h(getContext(), com.tencent.mm.R.dimen.f479924j3), 0, 0);
                android.view.View appNameStub = getAppNameStub();
                kotlin.jvm.internal.o.e(appNameStub, "null cannot be cast to non-null type android.view.ViewStub");
                pd4.d.a((android.view.ViewStub) appNameStub, l17, layoutParams);
                setAppNameStub(l17);
            } else {
                bool = bool3;
                str = "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo";
            }
            com.tencent.mm.protocal.protobuf.TimeLineObject h17 = n17.h1();
            java.lang.CharSequence J0 = n17.J0();
            if (J0 == null) {
                J0 = "";
            }
            android.text.SpannableString spannableString = new android.text.SpannableString(J0);
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni());
            lVarArr[1] = new jz5.l("sns_objecttype", java.lang.Integer.valueOf(n17.h1().ContentObj.f369837e));
            lVarArr[2] = new jz5.l("username_sns", n17.getUserName());
            lVarArr[3] = new jz5.l("publishid_sns", n17.a1());
            lVarArr[4] = new jz5.l("sns_scene", 1);
            int i17 = h17.publicBrandContactType;
            lVarArr[5] = new jz5.l("sns_feed_source", java.lang.Integer.valueOf(i17 != 2 ? i17 == 1 ? 3 : 0 : 2));
            java.util.Map k17 = kz5.c1.k(lVarArr);
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(getAppNameStub(), "sns_feed_tail");
            aVar.gk(getAppNameStub(), k17);
            aVar.ik(getAppNameStub(), 40, 33050);
            spannableString.setSpan(new tc4.e2(n17, this), 0, spannableString.length(), 33);
            android.view.View appNameStub2 = getAppNameStub();
            kotlin.jvm.internal.o.e(appNameStub2, "null cannot be cast to non-null type android.widget.TextView");
            android.widget.TextView textView = (android.widget.TextView) appNameStub2;
            textView.setClickable(true);
            java.lang.String str2 = str;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAppTailClickable", str2);
            if (n17.L1 == null) {
                n17.o1();
            }
            java.lang.Boolean bool4 = n17.L1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAppTailClickable", str2);
            if (kotlin.jvm.internal.o.b(bool4, bool) || kotlin.jvm.internal.o.b("wx7fa037cc7dfabad5", h17.AppInfo.f390846d)) {
                textView.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.f479515a62));
                getAppNameStub().setOnTouchListener(new com.tencent.mm.plugin.sns.ui.p5());
            } else {
                textView.setTextColor(i65.a.d(getContext(), com.tencent.mm.R.color.a5w));
                getAppNameStub().setOnTouchListener(null);
            }
            textView.setEllipsize(android.text.TextUtils.TruncateAt.END);
            textView.setText(spannableString, android.widget.TextView.BufferType.SPANNABLE);
            textView.setContentDescription(spannableString);
            android.view.View appNameStub3 = getAppNameStub();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(appNameStub3, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            appNameStub3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(appNameStub3, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (!(getAppNameStub() instanceof android.view.ViewStub)) {
            android.view.View appNameStub4 = getAppNameStub();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(appNameStub4, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            appNameStub4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(appNameStub4, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadAppNameView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadAppNameView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x071b, code lost:
    
        if (r8 == 0) goto L143;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void s() {
        /*
            Method dump skipped, instructions count: 3134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.i2.s():void");
    }

    public final void setCommentView(com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout improveInteractionLayout) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.V = improveInteractionLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCommentView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final void setContentTranslateResultText(com.tencent.mm.plugin.sns.ui.SnsTranslateResultView snsTranslateResultView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.W = snsTranslateResultView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setContentTranslateResultText", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final void setData(zc4.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setData", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.f417367p0 = bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setData", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final void setHolder(in5.s0 s0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.f417368x0 = s0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHolder", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final void setSnsPosition(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.f417369y0 = i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsPosition", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final void setSpringVisible(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSpringVisible", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        this.f417366l1 = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSpringVisible", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x038e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t() {
        /*
            Method dump skipped, instructions count: 1034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.i2.t():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x027c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tc4.i2.u():void");
    }

    public final void v() {
        xc4.p n17;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadStarView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        zc4.b bVar = this.f417367p0;
        if (bVar == null || (n17 = bVar.n()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadStarView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isStar", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        boolean z17 = n17.d1().InTopList == 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isStar", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
        if (z17 && n17.l1() && cc4.b.f40482a.a()) {
            com.tencent.mm.protocal.protobuf.TimeLineObject h17 = n17.h1();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
            if (xa4.g.f452830d.y(h17)) {
                xa4.g.t();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                i17 = com.tencent.mm.R.color.af9;
            } else {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNormalLinkColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNormalLinkColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getStarIconColorResId", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                i17 = com.tencent.mm.R.color.Link_100;
            }
            if (getStarIconStub() instanceof android.view.ViewStub) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(getContext());
                weImageView.s(com.tencent.mm.R.raw.sns_icons_filled_top, i17);
                weImageView.setId(com.tencent.mm.R.id.r_);
                int h18 = i65.a.h(getContext(), com.tencent.mm.R.dimen.f479688cn);
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(h18, h18);
                layoutParams.setMargins(i65.a.h(getContext(), com.tencent.mm.R.dimen.f479671c8), 0, 0, 0);
                android.view.View starIconStub = getStarIconStub();
                kotlin.jvm.internal.o.e(starIconStub, "null cannot be cast to non-null type android.view.ViewStub");
                pd4.d.a((android.view.ViewStub) starIconStub, weImageView, layoutParams);
                setStarIconStub(weImageView);
            }
            android.view.View starIconStub2 = getStarIconStub();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(starIconStub2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadStarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            starIconStub2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(starIconStub2, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadStarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getStarIconStub().setTag(n17.W0());
        } else {
            android.view.View starIconStub3 = getStarIconStub();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(starIconStub3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadStarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            starIconStub3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(starIconStub3, "com/tencent/mm/plugin/sns/ui/improve/item/ImproveTimelineItemMeasure", "loadStarView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadStarView", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final void w(java.lang.String tag, java.lang.String msg) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logE", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.e(tag, "[" + id4.t.f290949a.a(this.f417367p0) + '-' + hashCode() + ']' + msg);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logE", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final void x(java.lang.String tag, java.lang.String msg) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("logI", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        kotlin.jvm.internal.o.g(tag, "tag");
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mars.xlog.Log.i(tag, "[" + id4.t.f290949a.a(this.f417367p0) + '-' + hashCode() + ']' + msg);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("logI", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }

    public final int y() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("position", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        in5.s0 s0Var = this.f417368x0;
        int adapterPosition = s0Var != null ? s0Var.getAdapterPosition() : -1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("position", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        return adapterPosition;
    }

    public final void z(android.widget.TextView textView, int i17, java.lang.CharSequence charSequence) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setWithContent", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
        textView.setVisibility(0);
        if (i17 != 0) {
            charSequence = getContext().getString(i17, charSequence);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, charSequence, textSize), android.widget.TextView.BufferType.SPANNABLE);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setWithContent", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure");
    }
}
