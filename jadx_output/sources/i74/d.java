package i74;

/* loaded from: classes4.dex */
public final class d implements android.view.View.OnClickListener {
    public final i74.k A;
    public int B;
    public int C;
    public int D;
    public android.view.ViewGroup E;
    public com.tencent.mm.ui.widget.imageview.WeImageView F;
    public boolean G = false;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f289461d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f289462e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f289463f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f289464g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f289465h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f289466i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f289467m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f289468n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f289469o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f289470p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f289471q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f289472r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f289473s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f289474t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f289475u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.ViewGroup f289476v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f289477w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f289478x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.TextView f289479y;

    /* renamed from: z, reason: collision with root package name */
    public final i74.l f289480z;

    public d(android.content.Context context, i74.k kVar, i74.l lVar) {
        this.f289461d = context;
        this.A = kVar;
        this.f289480z = lVar;
    }

    public final void a(int i17) {
        android.widget.RelativeLayout.LayoutParams layoutParams;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("adjustTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        com.tencent.mars.xlog.Log.i("FeedbackDisplayer", "adjustTitleView() called with: visibility = [" + i17 + "]");
        try {
            if (i17 == 0) {
                android.widget.TextView textView = this.f289477w;
                int width = textView != null ? textView.getWidth() : 0;
                if (this.C == width) {
                    com.tencent.mars.xlog.Log.i("FeedbackDisplayer", "adjustTitleView() just return");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                    return;
                }
                if (width != 0) {
                    this.C = width;
                }
                int i18 = this.C;
                if (i18 <= 0) {
                    com.tencent.mars.xlog.Log.i("FeedbackDisplayer", "adjustTitleView() not get width");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                    return;
                }
                layoutParams = new android.widget.RelativeLayout.LayoutParams((this.B - i18) - (this.D * 2), -2);
            } else {
                layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
                new android.widget.RelativeLayout.LayoutParams(-1, -2);
            }
            int i19 = this.D;
            layoutParams.topMargin = i19;
            layoutParams.setMarginStart(i19);
            layoutParams.setMarginEnd(this.D);
            this.f289478x.setLayoutParams(layoutParams);
            android.widget.TextView textView2 = this.f289479y;
            if (textView2 != null && (textView2.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams)) {
                android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) this.f289479y.getLayoutParams();
                layoutParams2.width = layoutParams.width;
                layoutParams2.setMarginStart(this.D);
                layoutParams2.setMarginEnd(this.D);
                this.f289479y.setLayoutParams(layoutParams2);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("adjustTitleView", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
    }

    public final ca4.j b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        java.lang.Object obj = ((android.util.ArrayMap) ((i74.a) this.A).i("unlike_tag")).get("unlike_tag");
        if (!(obj instanceof ca4.j)) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            return null;
        }
        ca4.j jVar = (ca4.j) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getAdUnlikeTag", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        return jVar;
    }

    public void c(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onNoInteresting", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        android.view.ViewGroup viewGroup = this.f289476v;
        if (viewGroup != null && viewGroup.getChildCount() > 0) {
            this.f289476v.setVisibility(0);
            android.view.View view2 = this.f289475u;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "onNoInteresting", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "onNoInteresting", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = this.f289478x;
            if (textView != null) {
                textView.setTextColor(i65.a.d(textView.getContext(), com.tencent.mm.R.color.a5a));
                this.f289478x.setText(com.tencent.mm.R.string.j88);
            }
            android.widget.TextView textView2 = this.f289479y;
            if (textView2 != null) {
                textView2.setTextColor(i65.a.d(textView2.getContext(), com.tencent.mm.R.color.a59));
                android.widget.TextView textView3 = this.f289479y;
                textView3.setText(textView3.getContext().getString(com.tencent.mm.R.string.j89));
            }
        }
        i74.l lVar = this.f289480z;
        if (lVar != null) {
            ca4.j b17 = b();
            if (b17 != null) {
                view.setTag(b17);
            }
            lVar.b(view, 1, null);
        }
        d();
        a(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        android.view.View view3 = this.f289472r;
        if (view3 != null && this.f289466i != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "hideComplaintLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "hideComplaintLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f289466i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "hideComplaintLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "hideComplaintLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideComplaintLayout", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onNoInteresting", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
    }

    public final void d() {
        android.content.Context context;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showDirectCloseBt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        this.G = false;
        android.widget.TextView textView = this.f289477w;
        if (textView != null && (context = this.f289461d) != null) {
            textView.setVisibility(0);
            this.f289477w.setText(context.getText(com.tencent.mm.R.string.j7z));
            this.f289477w.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479511a55));
            this.f289477w.setBackground(context.getResources().getDrawable(com.tencent.mm.R.drawable.b0v));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showDirectCloseBt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0443  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.view.View r33) {
        /*
            Method dump skipped, instructions count: 1390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i74.d.e(android.view.View):void");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int id6 = view.getId();
        if (id6 == com.tencent.mm.R.id.n2t) {
            c(view);
        } else {
            i74.l lVar = this.f289480z;
            if (id6 == com.tencent.mm.R.id.n2i) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onApprove", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                if (lVar != null) {
                    lVar.b(view, 2, null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onApprove", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            } else if (id6 == com.tencent.mm.R.id.n2k) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                if (lVar != null) {
                    lVar.b(view, 3, null);
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onComplaint", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            } else if (id6 == com.tencent.mm.R.id.n2m) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onConfirm", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                if (lVar != null) {
                    ca4.j b17 = b();
                    if (b17 != null) {
                        view.setTag(b17);
                    }
                    lVar.b(view, 4, java.lang.Boolean.valueOf(this.G));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onConfirm", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            } else if (id6 == com.tencent.mm.R.id.n2v) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onJumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                i74.k kVar = this.A;
                if (kVar != null) {
                    java.lang.String str = ((i74.a) kVar).o().f289502b;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper");
                    if (str == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper");
                    } else {
                        android.content.Context context = this.f289461d;
                        if (context == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper");
                        } else {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                                str = com.tencent.mm.ui.tools.qd.a(str, "lang=" + com.tencent.mm.sdk.platformtools.m2.f(context));
                            }
                            android.content.Intent intent = new android.content.Intent();
                            intent.putExtra("showShare", false);
                            intent.putExtra("rawUrl", str);
                            intent.putExtra("show_feedback", false);
                            intent.putExtra("show_bottom", false);
                            intent.putExtra("needRedirect", false);
                            intent.putExtra("neverGetA8Key", false);
                            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1962, 2);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackHelper");
                        }
                    }
                }
                if (lVar != null) {
                    lVar.dismiss();
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onJumpPersonalizedAdWeb", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
    }
}
