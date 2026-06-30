package com.tencent.mm.plugin.sns.ad.widget.danmuview;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB#\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/danmuview/AdBulletScreenRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "getCurrentScrollX", "getCurrentScrollY", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AdBulletScreenRecyclerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: d2, reason: collision with root package name */
    public static final /* synthetic */ int f163541d2 = 0;

    /* renamed from: b2, reason: collision with root package name */
    public int f163542b2;

    /* renamed from: c2, reason: collision with root package name */
    public int f163543c2;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdBulletScreenRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final int getCurrentScrollX() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentScrollX", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        int i17 = this.f163543c2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentScrollX", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        return i17;
    }

    public final int getCurrentScrollY() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getCurrentScrollY", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        int i17 = this.f163542b2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getCurrentScrollY", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        return i17;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdBulletScreenRecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
        i(new r84.a(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ad.widget.danmuview.AdBulletScreenRecyclerView");
    }
}
