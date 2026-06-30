package com.tencent.mm.plugin.sns.ui.improve.item.header.view;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001&B\u001d\b\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"B%\b\u0016\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b!\u0010%R#\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R#\u0010\r\u001a\n \u0003*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\fR#\u0010\u0012\u001a\n \u0003*\u0004\u0018\u00010\u000e0\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0011R0\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006'"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/item/header/view/VideoExportStateView;", "Landroid/widget/LinearLayout;", "Lcom/tencent/mm/ui/widget/progress/RoundProgressBtn;", "kotlin.jvm.PlatformType", "d", "Ljz5/g;", "getProgressView", "()Lcom/tencent/mm/ui/widget/progress/RoundProgressBtn;", "progressView", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "e", "getSuccessView", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "successView", "Landroid/widget/TextView;", "f", "getWordingView", "()Landroid/widget/TextView;", "wordingView", "Lkotlin/Function1;", "", "Ljz5/f0;", "h", "Lyz5/l;", "getPublishHideListener", "()Lyz5/l;", "setPublishHideListener", "(Lyz5/l;)V", "publishHideListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "wc4/a", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class VideoExportStateView extends android.widget.LinearLayout {

    /* renamed from: i, reason: collision with root package name */
    public static final wc4.a f169098i = new wc4.a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.HashMap f169099m = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g progressView;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g successView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g wordingView;

    /* renamed from: g, reason: collision with root package name */
    public wu5.c f169103g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yz5.l publishHideListener;

    public VideoExportStateView(android.content.Context context) {
        super(context);
        this.progressView = jz5.h.b(new wc4.b(this));
        this.successView = jz5.h.b(new wc4.f(this));
        this.wordingView = jz5.h.b(new wc4.i(this));
    }

    public static final /* synthetic */ com.tencent.mm.ui.widget.progress.RoundProgressBtn a(com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView videoExportStateView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getProgressView", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        com.tencent.mm.ui.widget.progress.RoundProgressBtn progressView = videoExportStateView.getProgressView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getProgressView", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        return progressView;
    }

    public static final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView b(com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView videoExportStateView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getSuccessView", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        com.tencent.mm.ui.widget.imageview.WeImageView successView = videoExportStateView.getSuccessView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getSuccessView", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        return successView;
    }

    public static final /* synthetic */ java.util.HashMap c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getUploadSightMap$cp", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        java.util.HashMap hashMap = f169099m;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getUploadSightMap$cp", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        return hashMap;
    }

    public static final /* synthetic */ android.widget.TextView d(com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView videoExportStateView) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getWordingView", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        android.widget.TextView wordingView = videoExportStateView.getWordingView();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getWordingView", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        return wordingView;
    }

    private final com.tencent.mm.ui.widget.progress.RoundProgressBtn getProgressView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getProgressView", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        com.tencent.mm.ui.widget.progress.RoundProgressBtn roundProgressBtn = (com.tencent.mm.ui.widget.progress.RoundProgressBtn) this.progressView.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getProgressView", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        return roundProgressBtn;
    }

    private final com.tencent.mm.ui.widget.imageview.WeImageView getSuccessView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getSuccessView", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) this.successView.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getSuccessView", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        return weImageView;
    }

    private final android.widget.TextView getWordingView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getWordingView", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        android.widget.TextView textView = (android.widget.TextView) this.wordingView.getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getWordingView", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        return textView;
    }

    public final void e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("loadLayout", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        if (getChildCount() == 0) {
            com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489511ep3, this);
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(this, "sns_video_publish_tips");
            aVar.ik(this, 160, 33050);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("loadLayout", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
    }

    public final void f(java.lang.String localIdStr, java.lang.String snsIdStr) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishSuccess", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        kotlin.jvm.internal.o.g(localIdStr, "localIdStr");
        kotlin.jvm.internal.o.g(snsIdStr, "snsIdStr");
        e();
        wc4.a.a(f169098i, localIdStr, 100);
        wu5.c cVar = this.f169103g;
        if (cVar != null) {
            cVar.cancel(false);
        }
        setVisibility(0);
        getProgressView().setVisibility(8);
        getSuccessView().setVisibility(0);
        getWordingView().setText(i65.a.r(getContext(), com.tencent.mm.R.string.ojg));
        dy1.a.a(this, new wc4.c(snsIdStr));
        ku5.u0 u0Var = ku5.t0.f312615d;
        wc4.e eVar = new wc4.e(localIdStr, this, snsIdStr);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f169103g = t0Var.z(eVar, 3000L, false);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishSuccess", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
    }

    public final void g(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        if (str == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
            return;
        }
        if (f169098i.b(str) > i17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new wc4.h(this, str, i17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateProgress", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
    }

    public final yz5.l getPublishHideListener() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPublishHideListener", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        yz5.l lVar = this.publishHideListener;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPublishHideListener", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        return lVar;
    }

    public final void setPublishHideListener(yz5.l lVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPublishHideListener", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
        this.publishHideListener = lVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPublishHideListener", "com.tencent.mm.plugin.sns.ui.improve.item.header.view.VideoExportStateView");
    }

    public VideoExportStateView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.progressView = jz5.h.b(new wc4.b(this));
        this.successView = jz5.h.b(new wc4.f(this));
        this.wordingView = jz5.h.b(new wc4.i(this));
    }

    public VideoExportStateView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.progressView = jz5.h.b(new wc4.b(this));
        this.successView = jz5.h.b(new wc4.f(this));
        this.wordingView = jz5.h.b(new wc4.i(this));
    }
}
