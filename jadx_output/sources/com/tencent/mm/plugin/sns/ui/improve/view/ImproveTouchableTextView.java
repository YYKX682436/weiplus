package com.tencent.mm.plugin.sns.ui.improve.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveTouchableTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/view/MotionEvent;", "getLastTouchUpEvent", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public class ImproveTouchableTextView extends androidx.appcompat.widget.AppCompatTextView {

    /* renamed from: g, reason: collision with root package name */
    public android.view.MotionEvent f169180g;

    public ImproveTouchableTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final android.view.MotionEvent getLastTouchUpEvent() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLastTouchUpEvent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTouchableTextView");
        android.view.MotionEvent motionEvent = this.f169180g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLastTouchUpEvent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTouchableTextView");
        return motionEvent;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTouchableTextView");
        if (motionEvent != null && motionEvent.getAction() == 1) {
            this.f169180g = android.view.MotionEvent.obtain(motionEvent);
            motionEvent.getRawX();
            motionEvent.getRawY();
        }
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveTouchableTextView");
        return onTouchEvent;
    }

    public /* synthetic */ ImproveTouchableTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? android.R.attr.textViewStyle : i17);
    }

    public ImproveTouchableTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
