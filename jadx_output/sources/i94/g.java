package i94;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f289770a;

    /* renamed from: b, reason: collision with root package name */
    public final i94.c f289771b;

    /* renamed from: c, reason: collision with root package name */
    public final i74.l f289772c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f289773d;

    /* renamed from: e, reason: collision with root package name */
    public i94.h f289774e;

    public g(android.content.Context context, i94.c data, i74.l feedbackController) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(feedbackController, "feedbackController");
        this.f289770a = context;
        this.f289771b = data;
        this.f289772c = feedbackController;
    }

    public final void a(android.view.View contentView) {
        r45.d43 b17;
        r45.gr0 gr0Var;
        java.lang.String str;
        r45.d43 b18;
        r45.gr0 gr0Var2;
        r45.d43 b19;
        r45.gr0 gr0Var3;
        java.lang.String str2;
        r45.d43 b27;
        r45.gr0 gr0Var4;
        r45.d43 b28;
        r45.gr0 gr0Var5;
        r45.d43 b29;
        r45.gr0 gr0Var6;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackDisplayer");
        kotlin.jvm.internal.o.g(contentView, "contentView");
        this.f289773d = contentView;
        java.lang.Object tag = contentView.getTag(com.tencent.mm.R.id.vpl);
        i94.h hVar = tag instanceof i94.h ? (i94.h) tag : null;
        this.f289774e = hVar;
        if (hVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleTextView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.widget.TextView textView = hVar.f289777c;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleTextView");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleTextView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            i94.c cVar = this.f289771b;
            cVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTitleText", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
            java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
            boolean equals = "zh_CN".equals(f17);
            java.lang.String str3 = "";
            h94.a aVar = cVar.f289763a;
            if (!equals ? "zh_HK".equals(f17) || "zh_TW".equals(f17) ? (b17 = aVar.b()) == null || (gr0Var = b17.f372082r) == null || (str = gr0Var.f375500o) == null : (b18 = aVar.b()) == null || (gr0Var2 = b18.f372082r) == null || (str = gr0Var2.f375501p) == null : (b29 = aVar.b()) == null || (gr0Var6 = b29.f372082r) == null || (str = gr0Var6.f375499n) == null) {
                str = "";
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTitleText", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
            textView.setText(str);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComplaintTextView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.widget.TextView textView2 = hVar.f289782h;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("complaintTextView");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintTextView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            cVar.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComplaintText", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
            java.lang.String f18 = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
            boolean equals2 = "zh_CN".equals(f18);
            h94.a aVar2 = cVar.f289763a;
            if (!equals2 ? !("zh_HK".equals(f18) || "zh_TW".equals(f18) ? (b19 = aVar2.b()) == null || (gr0Var3 = b19.f372082r) == null || (str2 = gr0Var3.f375494f) == null : (b27 = aVar2.b()) == null || (gr0Var4 = b27.f372082r) == null || (str2 = gr0Var4.f375495g) == null) : !((b28 = aVar2.b()) == null || (gr0Var5 = b28.f372082r) == null || (str2 = gr0Var5.f375493e) == null)) {
                str3 = str2;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintText", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
            textView2.setText(str3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLikeIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.widget.ImageView imageView = hVar.f289778d;
            if (imageView == null) {
                kotlin.jvm.internal.o.o("likeIcon");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLikeIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.content.Context context = this.f289770a;
            a84.v0.a(context, imageView, 20, 20);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCloseIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.widget.ImageView imageView2 = hVar.f289779e;
            if (imageView2 == null) {
                kotlin.jvm.internal.o.o("closeIcon");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCloseIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            a84.v0.a(context, imageView2, 20, 20);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedbackGreatButton", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.view.View view = hVar.f289780f;
            if (view == null) {
                kotlin.jvm.internal.o.o("feedbackGreatButton");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedbackGreatButton", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            view.setOnClickListener(new i94.d(this, contentView));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFeedbackCloseAdButton", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.view.View view2 = hVar.f289781g;
            if (view2 == null) {
                kotlin.jvm.internal.o.o("feedbackCloseAdButton");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFeedbackCloseAdButton", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            view2.setOnClickListener(new i94.e(this, contentView));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getComplaintContainer", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.view.View view3 = hVar.f289783i;
            if (view3 == null) {
                kotlin.jvm.internal.o.o("complaintContainer");
                throw null;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getComplaintContainer", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            view3.setOnClickListener(new i94.f(this, contentView));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackDisplayer");
    }
}
