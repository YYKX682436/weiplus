package com.tencent.mm.ui.widget;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/ui/widget/RCLinearLayout;", "Landroid/widget/LinearLayout;", "", "radius", "Ljz5/f0;", "setRadius", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class RCLinearLayout extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public float f211399d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f211400e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        float b17 = i65.a.b(getContext(), 4) * 1.0f;
        this.f211399d = b17;
        this.f211400e = new float[]{b17, b17, b17, b17, b17, b17, b17, b17};
        if (attributeSet != null) {
            a(attributeSet, 0);
        }
    }

    public final void a(android.util.AttributeSet attributeSet, int i17) {
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wm0.a.C, i17, 0);
            kotlin.jvm.internal.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            if (obtainStyledAttributes.hasValue(0)) {
                float dimension = (int) obtainStyledAttributes.getDimension(0, i65.a.b(getContext(), 4) * 1.0f);
                this.f211399d = dimension;
                this.f211400e = new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension};
                com.tencent.mars.xlog.Log.i("RCLinearLayout", "initAttribute cornerDp:" + this.f211399d);
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Path path = new android.graphics.Path();
        path.addRoundRect(new android.graphics.RectF(0.0f, 0.0f, getWidth(), getHeight()), this.f211400e, android.graphics.Path.Direction.CW);
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
    }

    public final void setRadius(float f17) {
        this.f211399d = f17;
        this.f211400e = new float[]{f17, f17, f17, f17, f17, f17, f17, f17};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RCLinearLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        float b17 = i65.a.b(getContext(), 4) * 1.0f;
        this.f211399d = b17;
        this.f211400e = new float[]{b17, b17, b17, b17, b17, b17, b17, b17};
        if (attributeSet != null) {
            a(attributeSet, i17);
        }
    }
}
