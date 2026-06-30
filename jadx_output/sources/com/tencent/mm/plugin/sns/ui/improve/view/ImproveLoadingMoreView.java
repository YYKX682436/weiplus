package com.tencent.mm.plugin.sns.ui.improve.view;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012B%\b\u0016\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView;", "Landroid/widget/LinearLayout;", "Landroid/view/View;", "d", "Ljz5/g;", "getLoadLayout", "()Landroid/view/View;", "loadLayout", "Lcom/tencent/mm/ui/EndMaskView;", "e", "getEndLineLayout", "()Lcom/tencent/mm/ui/EndMaskView;", "endLineLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImproveLoadingMoreView extends android.widget.LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f169150g = 0;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final jz5.g loadLayout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g endLineLayout;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f169153f;

    public ImproveLoadingMoreView(android.content.Context context) {
        super(context);
        this.loadLayout = jz5.h.b(new bd4.t0(this));
        this.endLineLayout = jz5.h.b(new bd4.s0(this));
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489510cs5, (android.view.ViewGroup) this, true);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.f169153f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f482881qn);
    }

    private final com.tencent.mm.ui.EndMaskView getEndLineLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getEndLineLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        java.lang.Object value = this.endLineLayout.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        com.tencent.mm.ui.EndMaskView endMaskView = (com.tencent.mm.ui.EndMaskView) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getEndLineLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        return endMaskView;
    }

    private final android.view.View getLoadLayout() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLoadLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        java.lang.Object value = this.loadLayout.getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLoadLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        return view;
    }

    public final void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showEndLine", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishAnimation", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        android.widget.ImageView imageView = this.f169153f;
        if (imageView != null) {
            imageView.clearAnimation();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishAnimation", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        android.view.View loadLayout = getLoadLayout();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(loadLayout, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView", "showEndLine", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        loadLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(loadLayout, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView", "showEndLine", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getEndLineLayout().setVisibility(0);
        if (android.text.TextUtils.isEmpty(str)) {
            getEndLineLayout().b();
        } else {
            com.tencent.mm.ui.EndMaskView endLineLayout = getEndLineLayout();
            kotlin.jvm.internal.o.d(str);
            endLineLayout.getClass();
            android.view.View findViewById = endLineLayout.findViewById(com.tencent.mm.R.id.u_3);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/EndMaskView", "showTipsWithoutEndLine", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/EndMaskView", "showTipsWithoutEndLine", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = endLineLayout.findViewById(com.tencent.mm.R.id.uzh);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/ui/EndMaskView", "showTipsWithoutEndLine", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/ui/EndMaskView", "showTipsWithoutEndLine", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = endLineLayout.f196645d;
            textView.setText(str);
            textView.setVisibility(0);
            endLineLayout.f196647f.setVisibility(8);
            endLineLayout.f196646e.setVisibility(8);
        }
        setImportantForAccessibility(2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showEndLine", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
    }

    public final void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
        android.view.View loadLayout = getLoadLayout();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(loadLayout, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView", "startAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        loadLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(loadLayout, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveLoadingMoreView", "startAnimation", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        getEndLineLayout().setVisibility(8);
        android.view.animation.RotateAnimation rotateAnimation = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(1000L);
        rotateAnimation.setRepeatCount(-1);
        rotateAnimation.setInterpolator(new android.view.animation.LinearInterpolator());
        android.widget.ImageView imageView = this.f169153f;
        if (imageView != null) {
            imageView.startAnimation(rotateAnimation);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startAnimation", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveLoadingMoreView");
    }

    public ImproveLoadingMoreView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadLayout = jz5.h.b(new bd4.t0(this));
        this.endLineLayout = jz5.h.b(new bd4.s0(this));
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489510cs5, (android.view.ViewGroup) this, true);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.f169153f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f482881qn);
    }

    public ImproveLoadingMoreView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.loadLayout = jz5.h.b(new bd4.t0(this));
        this.endLineLayout = jz5.h.b(new bd4.s0(this));
        com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.f489510cs5, (android.view.ViewGroup) this, true);
        setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2));
        this.f169153f = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f482881qn);
    }
}
