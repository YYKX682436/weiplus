package com.tencent.mm.plugin.sns.ui.improve.view;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB%\b\u0016\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\rJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveRepostView;", "Lcom/tencent/mm/view/x2c/X2CLinearLayout;", "Ltc4/s0;", "Lzc4/b;", "getImproveListItem", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveRepostView extends com.tencent.mm.view.x2c.X2CLinearLayout implements tc4.s0 {

    /* renamed from: d, reason: collision with root package name */
    public zc4.b f169174d;

    public ImproveRepostView(android.content.Context context) {
        super(context);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.ctb, (android.view.ViewGroup) this, true);
        findViewById(com.tencent.mm.R.id.nal).setOnClickListener(new bd4.b1(this));
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
    }

    @Override // tc4.s0
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideDivider", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
    }

    @Override // tc4.s0
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("realTimeUpdate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
    }

    @Override // tc4.s0
    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("viewRecycleInMain", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("viewRecycleInMain", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
    }

    @Override // tc4.s0
    public boolean f(in5.s0 holder, zc4.b item, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("measure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("measure", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        return true;
    }

    @Override // tc4.s0
    public java.lang.Object g(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewRecycled", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        return f0Var;
    }

    @Override // tc4.s0
    public zc4.b getImproveListItem() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getImproveListItem", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getImproveListItem", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        return null;
    }

    @Override // tc4.s0
    public java.lang.Object h(in5.s0 s0Var, zc4.b bVar, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        this.f169174d = bVar;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        return f0Var;
    }

    @Override // tc4.s0
    public java.lang.String name() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "com.tencent.mm.plugin.sns.ui.improve.view.ImproveRepostView");
        return "ImproveRepostView";
    }

    public ImproveRepostView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.ctb, (android.view.ViewGroup) this, true);
        findViewById(com.tencent.mm.R.id.nal).setOnClickListener(new bd4.b1(this));
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
    }

    public ImproveRepostView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.ctb, (android.view.ViewGroup) this, true);
        findViewById(com.tencent.mm.R.id.nal).setOnClickListener(new bd4.b1(this));
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
    }
}
