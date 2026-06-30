package com.tencent.mm.plugin.multitalk.ui.widget.projector;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/multitalk/ui/widget/projector/MultiTalkSmallControlIconLayout;", "Landroid/widget/FrameLayout;", "", "isChecked", "Ljz5/f0;", "setChecked", "enable", "setIconEnabled", "m", "Z", "isChceked", "()Z", "setChceked", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-multitalk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class MultiTalkSmallControlIconLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f150375d;

    /* renamed from: e, reason: collision with root package name */
    public final int f150376e;

    /* renamed from: f, reason: collision with root package name */
    public final int f150377f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f150378g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f150379h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f150380i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean isChceked;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTalkSmallControlIconLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attributeSet, "attributeSet");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c3z, this);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f150379h = inflate;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xi3.a.f454733b);
        kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        this.f150376e = resourceId;
        obtainStyledAttributes.getInteger(5, -1);
        boolean z17 = obtainStyledAttributes.getBoolean(6, false);
        this.f150378g = z17;
        this.f150377f = obtainStyledAttributes.getResourceId(8, -1);
        obtainStyledAttributes.getDimension(3, -1.0f);
        this.f150380i = obtainStyledAttributes.getBoolean(7, false);
        obtainStyledAttributes.recycle();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.h6y);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f150375d = imageView;
        if (resourceId != -1) {
            if (z17) {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, resourceId, -16777216));
            } else {
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(context, resourceId, -1));
            }
        }
    }

    public final void setChceked(boolean z17) {
        this.isChceked = z17;
    }

    public final void setChecked(boolean z17) {
        int i17;
        this.isChceked = z17;
        setSelected(z17);
        if ((this.f150380i && z17) || (i17 = this.f150376e) == -1) {
            return;
        }
        boolean z18 = this.isChceked;
        int i18 = this.f150377f;
        boolean z19 = this.f150378g;
        this.f150375d.setImageDrawable(z18 ? z19 ? com.tencent.mm.ui.uk.e(getContext(), i18, -1) : com.tencent.mm.ui.uk.e(getContext(), i17, -16777216) : z19 ? com.tencent.mm.ui.uk.e(getContext(), i17, -16777216) : com.tencent.mm.ui.uk.e(getContext(), i18, -1));
    }

    public final void setIconEnabled(boolean z17) {
        if (z17) {
            android.view.View view = this.f150379h;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/MultiTalkSmallControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/projector/MultiTalkSmallControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        android.view.View view2 = this.f150379h;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(java.lang.Float.valueOf(0.3f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/projector/MultiTalkSmallControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/projector/MultiTalkSmallControlIconLayout", "setIconEnabled", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }
}
