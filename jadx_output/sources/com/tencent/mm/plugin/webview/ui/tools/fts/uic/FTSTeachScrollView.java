package com.tencent.mm.plugin.webview.ui.tools.fts.uic;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachScrollView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class FTSTeachScrollView extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public float f184650d;

    /* renamed from: e, reason: collision with root package name */
    public float f184651e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f184652f;

    /* renamed from: g, reason: collision with root package name */
    public final int f184653g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f184654h;

    /* renamed from: i, reason: collision with root package name */
    public float f184655i;

    /* renamed from: m, reason: collision with root package name */
    public float f184656m;

    /* renamed from: n, reason: collision with root package name */
    public long f184657n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FTSTeachScrollView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        int actionMasked = ev6.getActionMasked();
        if (actionMasked == 0) {
            this.f184650d = ev6.getX();
            this.f184651e = ev6.getY();
            this.f184652f = false;
            this.f184655i = ev6.getX();
            this.f184656m = ev6.getY();
            this.f184657n = ev6.getDownTime();
            this.f184654h = false;
            super.onInterceptTouchEvent(ev6);
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float abs = java.lang.Math.abs(ev6.getX() - this.f184650d);
                float abs2 = java.lang.Math.abs(ev6.getY() - this.f184651e);
                if (!this.f184652f && abs2 > this.f184653g / 2 && abs2 > abs) {
                    this.f184652f = true;
                    this.f184654h = true;
                    return true;
                }
                boolean onInterceptTouchEvent = super.onInterceptTouchEvent(ev6);
                if (onInterceptTouchEvent) {
                    this.f184652f = true;
                }
                return onInterceptTouchEvent;
            }
            if (actionMasked != 3) {
                return super.onInterceptTouchEvent(ev6);
            }
        }
        this.f184652f = false;
        this.f184654h = false;
        return super.onInterceptTouchEvent(ev6);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6.getActionMasked() == 0) {
            this.f184655i = ev6.getX();
            this.f184656m = ev6.getY();
            this.f184657n = ev6.getDownTime();
            this.f184654h = false;
        }
        if (this.f184654h && ev6.getActionMasked() == 2) {
            this.f184654h = false;
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(this.f184657n, ev6.getEventTime() - 1, 0, this.f184655i, this.f184656m, ev6.getMetaState());
            super.onTouchEvent(obtain);
            obtain.recycle();
        }
        return super.onTouchEvent(ev6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FTSTeachScrollView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f184653g = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
