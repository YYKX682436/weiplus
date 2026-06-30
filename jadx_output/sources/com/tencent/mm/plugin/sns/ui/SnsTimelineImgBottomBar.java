package com.tencent.mm.plugin.sns.ui;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB%\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/SnsTimelineImgBottomBar;", "Lcom/tencent/mm/plugin/sns/ui/SnsBaseImgBottomBar;", "Landroid/view/View$OnClickListener;", "clickCallback", "Ljz5/f0;", "setLivePhotoTagClickCallback", "setCircleToSearchTagClickCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SnsTimelineImgBottomBar extends com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f167465h = 0;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.SnsLivePlayButton f167466e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f167467f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f167468g;

    public SnsTimelineImgBottomBar(android.content.Context context) {
        super(context);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.eph, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.skj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = (com.tencent.mm.plugin.sns.ui.SnsLivePlayButton) findViewById;
        this.f167466e = snsLivePlayButton;
        snsLivePlayButton.post(new com.tencent.mm.plugin.sns.ui.ps(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(snsLivePlayButton);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.skg);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f167467f = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f487779vq1);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f167468g = (android.widget.TextView) findViewById3;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar
    public boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCircleToSearchTagVisible", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        boolean z17 = this.f167467f.getVisibility() == 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCircleToSearchTagVisible", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        return z17;
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar
    public void b(r45.jj4 mediaObj, long j17, int i17) {
        int i18;
        java.util.Collection collection;
        com.tencent.mm.protocal.protobuf.TimeLineObject timeLine;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setComponentVisible", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        kotlin.jvm.internal.o.g(mediaObj, "mediaObj");
        r45.jj4 jj4Var = mediaObj.X;
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = this.f167466e;
        if (jj4Var != null) {
            snsLivePlayButton.setVisibility(0);
        } else {
            snsLivePlayButton.setVisibility(8);
        }
        com.tencent.mm.plugin.sns.storage.SnsInfo W0 = com.tencent.mm.plugin.sns.model.l4.Fj().W0(j17);
        java.lang.Boolean valueOf = (W0 == null || (timeLine = W0.getTimeLine()) == null) ? null : java.lang.Boolean.valueOf(timeLine.isExcerpt);
        android.view.View view = this.f167467f;
        int i19 = (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE) || !((sg0.e) ((tg0.f1) i95.n0.c(tg0.f1.class))).Ni(2, 1)) ? 8 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsTimelineImgBottomBar", "setComponentVisible", "(Lcom/tencent/mm/protocal/protobuf/MediaObj;JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsTimelineImgBottomBar", "setComponentVisible", "(Lcom/tencent/mm/protocal/protobuf/MediaObj;JI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_show_ai_follow_tail, false);
        boolean isEmpty = android.text.TextUtils.isEmpty(mediaObj.I1);
        android.widget.TextView textView = this.f167468g;
        if (isEmpty || !fj6) {
            i18 = 8;
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("generateAiTailBuilder", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
            java.lang.String r17 = i65.a.r(getContext(), com.tencent.mm.R.string.pay);
            kotlin.jvm.internal.o.d(r17);
            java.util.List g17 = new r26.t("@").g(r17, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f313996d;
            java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) strArr[0]);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i65.a.d(getContext(), com.tencent.mm.R.color.aby)), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((java.lang.CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((java.lang.CharSequence) strArr[1]);
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i65.a.d(getContext(), com.tencent.mm.R.color.adi)), length, spannableStringBuilder.length(), 33);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("generateAiTailBuilder", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
            textView.setText(spannableStringBuilder);
            textView.setOnClickListener(new com.tencent.mm.plugin.sns.ui.rs(this, mediaObj));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(textView, "sns_yb_create_same");
            aVar.fk(textView, "sessionid_sns", ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ni());
            aVar.fk(textView, "sns_scene", java.lang.Integer.valueOf(i17));
            aVar.fk(textView, "sns_feed_id", ca4.z0.t0(j17));
            aVar.fk(textView, "yb_return_type", java.lang.Integer.valueOf(mediaObj.X != null ? 1 : 0));
            aVar.fk(textView, "yb_template_id", mediaObj.I1);
            aVar.ik(textView, 40, 36244);
            i18 = 8;
        }
        setVisibility((snsLivePlayButton.getVisibility() == 0 || this.f167467f.getVisibility() == 0 || textView.getVisibility() == 0) ? 0 : i18);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setComponentVisible", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar
    public void setCircleToSearchTagClickCallback(android.view.View.OnClickListener clickCallback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCircleToSearchTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        kotlin.jvm.internal.o.g(clickCallback, "clickCallback");
        android.view.View view = this.f167467f;
        if (view.getVisibility() == 0) {
            view.setOnClickListener(clickCallback);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCircleToSearchTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
    }

    @Override // com.tencent.mm.plugin.sns.ui.SnsBaseImgBottomBar
    public void setLivePhotoTagClickCallback(android.view.View.OnClickListener clickCallback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setLivePhotoTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
        kotlin.jvm.internal.o.g(clickCallback, "clickCallback");
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = this.f167466e;
        if (snsLivePlayButton.getVisibility() == 0) {
            snsLivePlayButton.setOnClickListener(new com.tencent.mm.plugin.sns.ui.ss(this, clickCallback));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setLivePhotoTagClickCallback", "com.tencent.mm.plugin.sns.ui.SnsTimelineImgBottomBar");
    }

    public SnsTimelineImgBottomBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.eph, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.skj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = (com.tencent.mm.plugin.sns.ui.SnsLivePlayButton) findViewById;
        this.f167466e = snsLivePlayButton;
        snsLivePlayButton.post(new com.tencent.mm.plugin.sns.ui.ps(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(snsLivePlayButton);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.skg);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f167467f = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f487779vq1);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f167468g = (android.widget.TextView) findViewById3;
    }

    public SnsTimelineImgBottomBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.eph, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.skj);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.plugin.sns.ui.SnsLivePlayButton snsLivePlayButton = (com.tencent.mm.plugin.sns.ui.SnsLivePlayButton) findViewById;
        this.f167466e = snsLivePlayButton;
        snsLivePlayButton.post(new com.tencent.mm.plugin.sns.ui.ps(this));
        ((hs.z) ((qk.t7) i95.n0.c(qk.t7.class))).wi(snsLivePlayButton);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.skg);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f167467f = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f487779vq1);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f167468g = (android.widget.TextView) findViewById3;
    }
}
