package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public final class kg extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f169631e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f169632f;

    public kg(yz5.p onOpenCommentInputFooter, yz5.l onJumpToProfileWithUserName, yz5.l onShowSelfCommentAlert) {
        kotlin.jvm.internal.o.g(onOpenCommentInputFooter, "onOpenCommentInputFooter");
        kotlin.jvm.internal.o.g(onJumpToProfileWithUserName, "onJumpToProfileWithUserName");
        kotlin.jvm.internal.o.g(onShowSelfCommentAlert, "onShowSelfCommentAlert");
        this.f169631e = onOpenCommentInputFooter;
        this.f169632f = onShowSelfCommentAlert;
    }

    @Override // in5.r
    public int e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLayoutId", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        return com.tencent.mm.R.layout.eoz;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.tencent.mm.plugin.sns.ui.ei item = (com.tencent.mm.plugin.sns.ui.ei) cVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindCommentSnsInfoFlipData", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.tencent.mm.R.id.swf);
        frameLayout.removeAllViews();
        frameLayout.addView(item.c());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCommentSnsInfoFlipData", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindCommentNickNameText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.tencent.mm.R.id.vi_);
        com.tencent.mm.plugin.sns.storage.SnsInfo b17 = item.b();
        r45.e86 a17 = item.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCommentNickNameWithSnsInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        java.lang.String e17 = com.tencent.mm.plugin.sns.ui.widget.t2.e(a17);
        if (com.tencent.mm.plugin.sns.ui.widget.t2.k(b17, a17.f373126d)) {
            e17 = com.tencent.mm.plugin.sns.ui.widget.t2.d(b17.getAdXml(), java.lang.String.valueOf(e17));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCommentNickNameWithSnsInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        textView.setText(e17);
        textView.setOnClickListener(com.tencent.mm.plugin.sns.ui.ig.f168611d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCommentNickNameText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindCommentContentText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView snsCollapsibleTextView = (com.tencent.mm.plugin.sns.ui.SnsCollapsibleTextView) holder.p(com.tencent.mm.R.id.ols);
        com.tencent.mm.smiley.x1 Di = com.tencent.mm.smiley.x1.Di();
        java.lang.String str = item.a().f373130h;
        if (str == null) {
            str = "";
        }
        snsCollapsibleTextView.setCustomText(Di.Ri(str, true));
        snsCollapsibleTextView.setOnCollapse(new com.tencent.mm.plugin.sns.ui.fg(this, item));
        snsCollapsibleTextView.setOnExpand(new com.tencent.mm.plugin.sns.ui.gg(this, item));
        snsCollapsibleTextView.setOnClickListener(new com.tencent.mm.plugin.sns.ui.hg(this, holder, item));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCommentContentText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("bindCommentReplyToNameText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.via);
        android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.vib);
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.tencent.mm.R.id.vi_);
        com.tencent.mm.plugin.sns.storage.SnsInfo b18 = item.b();
        r45.e86 a18 = item.a();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getReplyCommentNickNameWithSnsInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        com.tencent.mm.storage.z3 f07 = ((com.tencent.mm.storage.k4) com.tencent.mm.plugin.sns.model.l4.pj()).f0(a18.f373134o);
        java.lang.String g27 = f07 == null ? a18.f373134o : f07.g2();
        if (b18 != null && b18.isAd() && a18.f373134o.equals(b18.getUserName())) {
            g27 = com.tencent.mm.plugin.sns.ui.widget.t2.d(b18.getAdXml(), g27);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getReplyCommentNickNameWithSnsInfo", "com.tencent.mm.plugin.sns.ui.widget.SnsCommentUtil");
        if (g27 != null) {
            if (g27.length() > 0) {
                textView2.setVisibility(0);
                textView3.setVisibility(0);
                textView3.setText(g27);
                kotlin.jvm.internal.o.d(textView4);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetToWrapWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                android.view.ViewGroup.LayoutParams layoutParams = textView4.getLayoutParams();
                if (layoutParams != null) {
                    c44.a.o();
                    layoutParams.width = -2;
                    textView4.setLayoutParams(layoutParams);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetToWrapWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetToWrapWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                android.view.ViewGroup.LayoutParams layoutParams2 = textView3.getLayoutParams();
                if (layoutParams2 != null) {
                    c44.a.o();
                    layoutParams2.width = -2;
                    textView3.setLayoutParams(layoutParams2);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetToWrapWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                java.lang.Object parent = textView4.getParent();
                kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
                android.view.View view = (android.view.View) parent;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                view.post(new ad4.a0(view, textView4, textView3, textView2));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyFoldingLogic", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
                textView3.setOnClickListener(com.tencent.mm.plugin.sns.ui.jg.f169512d);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCommentReplyToNameText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
            }
        }
        textView2.setVisibility(8);
        textView3.setVisibility(8);
        kotlin.jvm.internal.o.d(textView4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resetToWrapWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        android.view.ViewGroup.LayoutParams layoutParams3 = textView4.getLayoutParams();
        if (layoutParams3 != null) {
            c44.a.o();
            layoutParams3.width = -2;
            textView4.setLayoutParams(layoutParams3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resetToWrapWidth", "com.tencent.mm.plugin.sns.ui.improve.util.SnsTextFoldHelper$Companion");
        textView3.setOnClickListener(com.tencent.mm.plugin.sns.ui.jg.f169512d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("bindCommentReplyToNameText", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.itemView.findViewById(com.tencent.mm.R.id.v8a);
        if (linearLayout != null) {
            com.tencent.mm.ui.a4.e(linearLayout, true, false, 2, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
    }

    @Override // in5.r
    public void k(in5.s0 holder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
    }

    public final void n(com.tencent.mm.plugin.sns.ui.ei item, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCmtBigPicExpandEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
        kotlin.jvm.internal.o.g(item, "item");
        ta4.t tVar = new ta4.t();
        tVar.c(item.b());
        tVar.b(item.a());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSnsScene", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSnsScene", "com.tencent.mm.plugin.sns.ui.SnsFeedComment");
        tVar.d(item.f168246i);
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCmtBigPicUnfoldEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
            java.util.Map t17 = kz5.c1.t(tVar.e());
            t17.put("view_id", "cmt_big_pic_unfold");
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar != null) {
                tVar.a();
                ((cy1.a) rVar).Ej("view_clk", t17, 36244);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCmtBigPicUnfoldEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reportCmtBigPicFoldEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
            java.util.Map t18 = kz5.c1.t(tVar.e());
            t18.put("view_id", "cmt_big_pic_fold");
            dy1.r rVar2 = (dy1.r) i95.n0.c(dy1.r.class);
            if (rVar2 != null) {
                tVar.a();
                ((cy1.a) rVar2).Ej("view_clk", t18, 36244);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCmtBigPicFoldEvent", "com.tencent.mm.plugin.sns.report.SnsCommentImageBrowseReporter");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reportCmtBigPicExpandEvent", "com.tencent.mm.plugin.sns.ui.SnsCommentImageFlowConvert");
    }
}
