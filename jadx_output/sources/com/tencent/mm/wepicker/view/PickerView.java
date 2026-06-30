package com.tencent.mm.wepicker.view;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006#"}, d2 = {"Lcom/tencent/mm/wepicker/view/PickerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "b2", "Z", "getEnableAlpha", "()Z", "setEnableAlpha", "(Z)V", "enableAlpha", "", "c2", "F", "getOffset", "()F", "setOffset", "(F)V", "offset", "d2", "getMinScaleRate", "setMinScaleRate", "minScaleRate", "e2", "getMinAlpha", "setMinAlpha", "minAlpha", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mq5/a", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public class PickerView extends androidx.recyclerview.widget.RecyclerView {

    /* renamed from: b2, reason: collision with root package name and from kotlin metadata */
    public boolean enableAlpha;

    /* renamed from: c2, reason: collision with root package name and from kotlin metadata */
    public float offset;

    /* renamed from: d2, reason: collision with root package name and from kotlin metadata */
    public float minScaleRate;

    /* renamed from: e2, reason: collision with root package name and from kotlin metadata */
    public float minAlpha;

    /* renamed from: f2, reason: collision with root package name */
    public float f214345f2;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PickerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        float f17;
        float f18;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        n3.t1 t1Var = new n3.t1(this);
        while (t1Var.hasNext()) {
            android.view.View view = (android.view.View) t1Var.next();
            float top = ((view.getTop() + view.getBottom()) / 2.0f) / (getMeasuredHeight() / 2.0f);
            boolean z17 = top > 1.0f;
            if (z17) {
                top = 2 - top;
            }
            float f19 = 1;
            float f27 = f19 - top;
            float f28 = f19 - (f27 * f27);
            if (this.f214345f2 < 0.0f) {
                this.f214345f2 = view.getX();
            }
            float f29 = this.minScaleRate;
            float f37 = f29 + ((f19 - f29) * f28);
            if (java.lang.Float.isNaN(f37)) {
                return;
            }
            view.setScaleX(f37);
            view.setScaleY(f37);
            if (this.enableAlpha) {
                float f38 = this.minAlpha + ((f19 - this.minScaleRate) * f28);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(f38));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/wepicker/view/PickerView", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/wepicker/view/PickerView", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            float f39 = 90;
            float f47 = f39 - (f28 * f39);
            view.getRotation();
            view.setRotationX(z17 ? -f47 : f47);
            if (f47 < 90.0f) {
                float pow = (float) java.lang.Math.pow(((int) f47) / 90.0f, 3.0f);
                if (z17) {
                    pow = -pow;
                }
                view.setTranslationY(pow * view.getHeight());
            } else {
                if (z17) {
                    f18 = view.getHeight();
                    f17 = 1.0f;
                } else {
                    f17 = 1.0f;
                    f18 = -view.getHeight();
                }
                view.setTranslationY(f18 / f17);
            }
            view.setX(this.f214345f2 + ((f19 - f28) * this.offset));
            drawChild(canvas, view, getDrawingTime());
            view.invalidate();
        }
    }

    public final boolean getEnableAlpha() {
        return this.enableAlpha;
    }

    public final float getMinAlpha() {
        return this.minAlpha;
    }

    public final float getMinScaleRate() {
        return this.minScaleRate;
    }

    public final float getOffset() {
        return this.offset;
    }

    public final void setEnableAlpha(boolean z17) {
        this.enableAlpha = z17;
    }

    public final void setMinAlpha(float f17) {
        this.minAlpha = f17;
    }

    public final void setMinScaleRate(float f17) {
        this.minScaleRate = f17;
    }

    public final void setOffset(float f17) {
        this.offset = f17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        setLayoutManager(new com.tencent.mm.wepicker.view.SmoothCalendarLayoutManager(context));
        setOverScrollMode(1);
        new androidx.recyclerview.widget.p1().b(this);
        this.enableAlpha = true;
        this.minScaleRate = 0.7f;
        this.minAlpha = 0.3f;
        this.f214345f2 = -1.0f;
    }
}
