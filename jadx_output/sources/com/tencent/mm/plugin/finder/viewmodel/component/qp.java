package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class qp extends com.tencent.mm.plugin.finder.viewmodel.component.mb0 implements zy2.b9 {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f135726f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f135727g;

    /* renamed from: h, reason: collision with root package name */
    public final so2.c f135728h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135726f = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.np.f135341d);
        this.f135727g = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.op.f135481d);
        this.f135728h = so2.c.f410284n;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void O6(in5.s0 holder, com.tencent.mm.plugin.finder.viewmodel.component.db0 animationType) {
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(animationType, "animationType");
        super.O6(holder, animationType);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public android.view.View R6(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.tencent.mm.R.id.trv);
        if (p17 != null) {
            return p17;
        }
        android.view.ViewStub viewStub = (android.view.ViewStub) holder.p(com.tencent.mm.R.id.trz);
        android.view.View inflate = viewStub != null ? viewStub.inflate() : null;
        if (inflate != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderMultiImageDescCommentUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/finder/viewmodel/component/FinderMultiImageDescCommentUIC", "getContentView", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return inflate;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public so2.c S6() {
        return this.f135728h;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public boolean X6(in5.s0 holder, boolean z17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed == null) {
            com.tencent.mars.xlog.Log.i("Finder.FinderMultiImageDescCommentUIC", "isNeedShow false, feedId is null!");
            return false;
        }
        java.util.List list = (java.util.List) ((com.tencent.mm.sdk.platformtools.c0) ((jz5.n) this.f135726f).getValue()).b(java.lang.Long.valueOf(baseFinderFeed.getItemId()));
        if (list == null || list.isEmpty()) {
            return false;
        }
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127722gh).getValue()).r()).booleanValue() || R6(holder) != null;
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void Y6(in5.s0 holder, android.content.res.Configuration newConfig) {
        android.view.ViewTreeObserver viewTreeObserver;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(newConfig, "newConfig");
        super.Y6(holder, newConfig);
        android.view.View p17 = holder.p(com.tencent.mm.R.id.trv);
        android.view.ViewParent parent = p17 != null ? p17.getParent() : null;
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new com.tencent.mm.plugin.finder.viewmodel.component.pp(this, holder, view));
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void Z6(in5.s0 holder, boolean z17, long j17, long j18) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127722gh).getValue()).r()).booleanValue()) {
            return;
        }
        d7(holder);
    }

    @Override // com.tencent.mm.plugin.finder.viewmodel.component.mb0
    public void c7(in5.s0 holder) {
        r45.e60 content_info;
        java.util.LinkedList list;
        r45.j60 j60Var;
        java.lang.String string;
        java.lang.String string2;
        java.lang.String string3;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = holder.f293125i;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = obj instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed ? (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj : null;
        if (baseFinderFeed != null) {
            long itemId = baseFinderFeed.getItemId();
            android.view.View R6 = R6(holder);
            if (R6 == null) {
                com.tencent.mars.xlog.Log.e("Finder.FinderMultiImageDescCommentUIC", "beforeShow contentView is null");
            } else {
                java.util.List list2 = (java.util.List) ((com.tencent.mm.sdk.platformtools.c0) ((jz5.n) this.f135726f).getValue()).b(java.lang.Long.valueOf(itemId));
                java.util.List list3 = list2 != null ? (java.util.List) kz5.n0.Z(list2) : null;
                if (list3 == null) {
                    com.tencent.mars.xlog.Log.w("Finder.FinderMultiImageDescCommentUIC", "beforeShow commentList is null, feedId=".concat(pm0.v.u(itemId)));
                } else {
                    com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127722gh).getValue()).r()).booleanValue()) {
                        d7(holder);
                    }
                    java.lang.Integer num = (java.lang.Integer) ((com.tencent.mm.sdk.platformtools.c0) ((jz5.n) this.f135727g).getValue()).b(java.lang.Long.valueOf(itemId));
                    android.widget.TextView textView = (android.widget.TextView) R6.findViewById(com.tencent.mm.R.id.oqh);
                    if (textView != null) {
                        android.content.Context context = holder.f293121e;
                        if (num == null || num.intValue() <= 0) {
                            com.tencent.mars.xlog.Log.e("Finder.FinderMultiImageDescCommentUIC", "beforeShow commentCount:" + num);
                            string3 = context.getString(com.tencent.mm.R.string.owt);
                        } else {
                            string3 = context.getString(com.tencent.mm.R.string.ows, num);
                        }
                        textView.setText(string3);
                    }
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) R6.findViewById(com.tencent.mm.R.id.h8v);
                    if (viewGroup != null) {
                        ym5.a1.h(viewGroup, new com.tencent.mm.plugin.finder.viewmodel.component.ip(baseFinderFeed, list3));
                    }
                    if (viewGroup != null) {
                        q26.h hVar = new q26.h((q26.i) q26.h0.i(q26.h0.i(new n3.r1(viewGroup), com.tencent.mm.plugin.finder.viewmodel.component.gp.f134543d), com.tencent.mm.plugin.finder.viewmodel.component.jp.f134876d));
                        int i17 = 0;
                        int i18 = 0;
                        while (hVar.hasNext()) {
                            java.lang.Object next = hVar.next();
                            int i19 = i18 + 1;
                            if (i18 < 0) {
                                kz5.c0.p();
                                throw null;
                            }
                            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) next;
                            com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = (com.tencent.mm.ui.widget.MMRoundCornerImageView) frameLayout.findViewById(com.tencent.mm.R.id.trw);
                            if (mMRoundCornerImageView == null) {
                                com.tencent.mars.xlog.Log.e("Finder.FinderMultiImageDescCommentUIC", "finder_multi_image_desc_comment_image_item image is null, index=" + i18);
                            } else {
                                android.widget.ProgressBar progressBar = (android.widget.ProgressBar) frameLayout.findViewById(com.tencent.mm.R.id.f20try);
                                if (progressBar != null) {
                                    progressBar.setVisibility(i17);
                                }
                                com.tencent.mm.protocal.protobuf.FinderCommentInfo finderCommentInfo = (com.tencent.mm.protocal.protobuf.FinderCommentInfo) kz5.n0.a0(list3, i18);
                                if (finderCommentInfo != null && (content_info = finderCommentInfo.getContent_info()) != null && (list = content_info.getList(1)) != null && (j60Var = (r45.j60) kz5.n0.Z(list)) != null) {
                                    java.lang.String string4 = j60Var.getString(7);
                                    if (((string4 == null || string4.length() == 0) ? 1 : i17) != 0) {
                                        string = j60Var.getString(i17);
                                        string2 = j60Var.getString(1);
                                    } else {
                                        string = j60Var.getString(7);
                                        string2 = j60Var.getString(8);
                                    }
                                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                    sb6.append(string);
                                    if (string2 == null) {
                                        string2 = "";
                                    }
                                    sb6.append(string2);
                                    java.lang.String sb7 = sb6.toString();
                                    mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
                                    i95.m c17 = i95.n0.c(zy2.b6.class);
                                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                                    wo0.c a17 = d1Var.a(ya2.l.f460502a.e(sb7, com.tencent.mm.plugin.finder.storage.y90.f128356f));
                                    a17.f447873d = new com.tencent.mm.plugin.finder.viewmodel.component.lp(progressBar, sb7);
                                    ((wo0.b) a17).c(mMRoundCornerImageView);
                                    mMRoundCornerImageView.setOnClickListener(new com.tencent.mm.plugin.finder.viewmodel.component.mp(i18, mMRoundCornerImageView, baseFinderFeed, finderCommentInfo, this, holder));
                                }
                            }
                            i18 = i19;
                            i17 = 0;
                        }
                    }
                }
            }
        }
        super.c7(holder);
    }

    public final void d7(in5.s0 s0Var) {
        android.view.View R6 = R6(s0Var);
        if (R6 == null) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) R6.findViewById(com.tencent.mm.R.id.trv);
        android.view.ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        android.view.ViewGroup viewGroup2 = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) R6.findViewById(com.tencent.mm.R.id.h8v);
        if (viewGroup3 == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderMultiImageDescCommentUIC", "calculateImageViewSize imageContainer is null");
            return;
        }
        if (viewGroup2 != null) {
            int width = viewGroup2.getWidth();
            if (com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A()) {
                kotlin.jvm.internal.o.d(viewGroup);
                int max = java.lang.Math.max(0, (((viewGroup2.getWidth() - viewGroup2.getPaddingLeft()) - viewGroup2.getPaddingRight()) - i65.a.f(getContext(), com.tencent.mm.R.dimen.f479712an5)) / 2);
                android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = max;
                    marginLayoutParams.rightMargin = max;
                }
                com.tencent.mars.xlog.Log.i("Finder.FinderMultiImageDescCommentUIC", "adjust for pad containerMargin " + max);
            }
            int f17 = i65.a.f(s0Var.f293121e, com.tencent.mm.R.dimen.f479646bl);
            int paddingLeft = (((width - viewGroup2.getPaddingLeft()) - viewGroup2.getPaddingRight()) - viewGroup.getPaddingLeft()) - viewGroup.getPaddingRight();
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            int i17 = paddingLeft - (marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0);
            android.view.ViewGroup.LayoutParams layoutParams3 = viewGroup.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
            int i18 = ((i17 - (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0)) - (f17 * 4)) / 5;
            n3.t1 t1Var = new n3.t1(viewGroup3);
            int i19 = 0;
            while (t1Var.hasNext()) {
                if ((((android.view.View) t1Var.next()).getId() == com.tencent.mm.R.id.trx) && (i19 = i19 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
            int max2 = java.lang.Math.max(0, 5 - i19);
            for (int i27 = 0; i27 < max2; i27++) {
                android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
                frameLayout.setId(com.tencent.mm.R.id.trx);
                android.widget.LinearLayout.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(i18, i18);
                if (i27 > 0) {
                    layoutParams4.leftMargin = f17;
                }
                frameLayout.setLayoutParams(layoutParams4);
                frameLayout.setBackgroundColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.BW_100_Alpha_0_0_3));
                com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = new com.tencent.mm.ui.widget.MMRoundCornerImageView(getContext());
                mMRoundCornerImageView.setId(com.tencent.mm.R.id.trw);
                mMRoundCornerImageView.setRadius(getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479644bj));
                mMRoundCornerImageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                mMRoundCornerImageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                android.view.View progressBar = new android.widget.ProgressBar(getContext(), null, 0, com.tencent.mm.R.style.f494818x4);
                progressBar.setId(com.tencent.mm.R.id.f20try);
                android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                progressBar.setLayoutParams(layoutParams5);
                frameLayout.addView(mMRoundCornerImageView);
                frameLayout.addView(progressBar);
                viewGroup3.addView(frameLayout);
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderMultiImageDescCommentUIC", "calculateWidth imageWidth=" + i18);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((com.tencent.mm.sdk.platformtools.c0) ((jz5.n) this.f135726f).getValue()).a();
    }
}
