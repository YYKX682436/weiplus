package k74;

/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f304789a;

    /* renamed from: b, reason: collision with root package name */
    public final i74.k f304790b;

    /* renamed from: c, reason: collision with root package name */
    public final i74.l f304791c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f304792d;

    /* renamed from: e, reason: collision with root package name */
    public k74.j f304793e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f304794f;

    /* renamed from: g, reason: collision with root package name */
    public final k74.e f304795g;

    /* renamed from: h, reason: collision with root package name */
    public final k74.d f304796h;

    /* renamed from: i, reason: collision with root package name */
    public final k74.f f304797i;

    public h(android.content.Context mContext, i74.k kVar, i74.l lVar) {
        kotlin.jvm.internal.o.g(mContext, "mContext");
        this.f304789a = mContext;
        this.f304790b = kVar;
        this.f304791c = lVar;
        this.f304795g = new k74.e(this);
        this.f304796h = new k74.d(this);
        this.f304797i = new k74.f(this);
    }

    public static final /* synthetic */ k74.j a(k74.h hVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMViewHolder$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        k74.j jVar = hVar.f304793e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMViewHolder$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        return jVar;
    }

    public final java.util.List b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getNotInterestReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        i74.k kVar = this.f304790b;
        java.util.Map i17 = kVar != null ? ((i74.a) kVar).i("reason_list") : null;
        java.lang.Object obj = i17 != null ? ((android.util.ArrayMap) i17).get("reason_list") : null;
        java.util.List list = obj instanceof java.util.List ? (java.util.List) obj : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getNotInterestReason", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        return list;
    }

    public final boolean c() {
        com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer b17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        k74.j jVar = this.f304793e;
        boolean z17 = false;
        if (jVar != null && (b17 = jVar.b()) != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
            java.util.Iterator it = ((java.util.ArrayList) b17.f163195h).iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                    break;
                }
                if (((android.widget.TextView) it.next()).isSelected()) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                    z17 = true;
                    break;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        return z17;
    }

    public final void d(boolean z17) {
        android.widget.TextView a17;
        android.widget.TextView a18;
        android.widget.TextView a19;
        android.widget.TextView a27;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateSubmitBtnStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        android.content.Context context = this.f304789a;
        if (z17) {
            k74.j jVar = this.f304793e;
            if (jVar != null && (a27 = jVar.a()) != null) {
                a27.setTextColor(context.getColor(com.tencent.mm.R.color.aby));
            }
            k74.j jVar2 = this.f304793e;
            if (jVar2 != null && (a19 = jVar2.a()) != null) {
                a19.setBackgroundResource(com.tencent.mm.R.drawable.f482104co4);
            }
            k74.j jVar3 = this.f304793e;
            android.widget.TextView a28 = jVar3 != null ? jVar3.a() : null;
            if (a28 != null) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ls6);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                a28.setText(string);
            }
        } else {
            k74.j jVar4 = this.f304793e;
            if (jVar4 != null && (a18 = jVar4.a()) != null) {
                a18.setTextColor(context.getColor(com.tencent.mm.R.color.abu));
            }
            k74.j jVar5 = this.f304793e;
            if (jVar5 != null && (a17 = jVar5.a()) != null) {
                a17.setBackgroundResource(com.tencent.mm.R.drawable.f482105co5);
            }
            k74.j jVar6 = this.f304793e;
            android.widget.TextView a29 = jVar6 != null ? jVar6.a() : null;
            if (a29 != null) {
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493188ls3);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                a29.setText(string2);
            }
        }
        if (this.f304794f ^ z17) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.i("FeedbackNewStyleDisplayer", "hasSelectItem state changed", null);
            i74.l lVar = this.f304791c;
            if (lVar instanceof k74.i) {
                k74.i iVar = (k74.i) lVar;
                iVar.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updatePosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
                try {
                    if (iVar.f304799e != null && iVar.f304800f != null) {
                        android.graphics.Rect rect = new android.graphics.Rect();
                        iVar.f304800f.getWindowVisibleDisplayFrame(rect);
                        int c17 = iVar.c(iVar.f(iVar.f304800f), rect, iVar.f304799e.getContentView());
                        iVar.j(c17);
                        iVar.f304799e.update(iVar.f304800f, 0, c17, -1, -1);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("FeedbackNewStylePromptManager", "updatePosition, exp=" + e17);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updatePosition", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStylePromptManager");
            }
        }
        this.f304794f = z17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateSubmitBtnStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
    }

    public final void e(android.view.View contentView) {
        java.lang.Object obj;
        android.widget.TextView textView;
        com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer b17;
        android.view.View c17;
        android.widget.TextView a17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        kotlin.jvm.internal.o.g(contentView, "contentView");
        i74.l lVar = this.f304791c;
        if (lVar != null) {
            lVar.a();
        }
        this.f304792d = contentView;
        java.lang.Object tag = contentView.getTag(com.tencent.mm.R.id.qae);
        k74.j jVar = tag instanceof k74.j ? (k74.j) tag : null;
        this.f304793e = jVar;
        if (jVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            return;
        }
        if (jVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMPanelContentView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
            android.view.View view = jVar.f304813h;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMPanelContentView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
            if (view != null) {
                view.addOnLayoutChangeListener(new k74.g(this));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        i74.k kVar = this.f304790b;
        java.util.Map i17 = kVar != null ? ((i74.a) kVar).i("complaint_content") : null;
        if (i17 == null || (obj = ((android.util.ArrayMap) i17).get("complaint_content")) == null) {
            obj = "";
        }
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        java.lang.String str2 = str != null ? str : "";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintContent", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
        boolean z17 = true;
        boolean z18 = false;
        if (str2.length() == 0) {
            str2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f493183j81);
            kotlin.jvm.internal.o.f(str2, "getString(...)");
        }
        k74.j jVar2 = this.f304793e;
        if (jVar2 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMComplaintTextView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
            textView = jVar2.f304812g;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMComplaintTextView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(str2);
        }
        k74.j jVar3 = this.f304793e;
        if (jVar3 != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
            android.view.View view2 = jVar3.f304811f;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackPanelViewBuilder$ViewHolder");
            if (view2 != null) {
                view2.setOnClickListener(this.f304796h);
            }
        }
        k74.j jVar4 = this.f304793e;
        if (jVar4 != null && (a17 = jVar4.a()) != null) {
            a17.setOnClickListener(this.f304797i);
        }
        this.f304794f = false;
        d(false);
        java.util.List<j74.c> b18 = b();
        if (b18 != null && b18.isEmpty()) {
            k74.j jVar5 = this.f304793e;
            com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer b19 = jVar5 != null ? jVar5.b() : null;
            if (b19 != null) {
                b19.setVisibility(8);
            }
            k74.j jVar6 = this.f304793e;
            android.view.ViewGroup.LayoutParams layoutParams = (jVar6 == null || (c17 = jVar6.c()) == null) ? null : c17.getLayoutParams();
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
            }
            k74.j jVar7 = this.f304793e;
            android.view.View c18 = jVar7 != null ? jVar7.c() : null;
            if (c18 != null) {
                c18.setLayoutParams(layoutParams);
            }
        } else {
            k74.j jVar8 = this.f304793e;
            if (jVar8 != null && (b17 = jVar8.b()) != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                k74.e listener = this.f304795g;
                kotlin.jvm.internal.o.g(listener, "listener");
                b17.removeAllViews();
                java.util.ArrayList arrayList = (java.util.ArrayList) b17.f163195h;
                arrayList.clear();
                b17.f163197m = listener;
                if (b18 != null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initViews", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                    for (j74.c cVar : b18) {
                        java.lang.String str3 = cVar.f298065b;
                        if (!((str3 == null || str3.length() == 0) ? z17 : z18)) {
                            java.lang.String mReason = cVar.f298065b;
                            kotlin.jvm.internal.o.f(mReason, "mReason");
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("createReasonItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                            android.widget.TextView textView2 = new android.widget.TextView(b17.getContext());
                            c44.a.o();
                            if (textView2.getLayoutParams() == null) {
                                c44.a.o();
                                textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                            } else {
                                android.view.ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                                layoutParams2.width = -2;
                                textView2.setLayoutParams(layoutParams2);
                            }
                            c44.a.o();
                            if (textView2.getLayoutParams() == null) {
                                c44.a.o();
                                textView2.setLayoutParams(new android.view.ViewGroup.MarginLayoutParams(-2, -2));
                            } else {
                                android.view.ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
                                layoutParams3.height = -2;
                                textView2.setLayoutParams(layoutParams3);
                            }
                            textView2.setPadding(c44.b.a(12), textView2.getPaddingTop(), textView2.getPaddingRight(), textView2.getPaddingBottom());
                            textView2.setPadding(textView2.getPaddingLeft(), c44.b.a(8), textView2.getPaddingRight(), textView2.getPaddingBottom());
                            textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), c44.b.a(12), textView2.getPaddingBottom());
                            textView2.setPadding(textView2.getPaddingLeft(), textView2.getPaddingTop(), textView2.getPaddingRight(), c44.b.a(8));
                            textView2.setIncludeFontPadding(false);
                            textView2.setSingleLine(true);
                            textView2.setEllipsize(android.text.TextUtils.TruncateAt.END);
                            textView2.setTextColor(textView2.getResources().getColorStateList(com.tencent.mm.R.color.a4v));
                            z18 = false;
                            textView2.setTextSize(0, (int) ca4.m0.I(com.tencent.mm.R.dimen.a_h));
                            textView2.setBackgroundResource(com.tencent.mm.R.drawable.b0u);
                            textView2.setText(mReason);
                            textView2.setOnClickListener(b17.f163202r);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("createReasonItemView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                            textView2.setTag(com.tencent.mm.R.id.n2f, cVar);
                            arrayList.add(textView2);
                            b17.addView(textView2);
                            z17 = true;
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initViews", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initData", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
    }
}
