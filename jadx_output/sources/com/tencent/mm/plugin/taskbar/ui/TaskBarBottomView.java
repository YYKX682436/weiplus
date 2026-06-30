package com.tencent.mm.plugin.taskbar.ui;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/taskbar/ui/TaskBarBottomView;", "Landroid/view/View;", "", "topRadius", "Ljz5/f0;", "setTopRoundRadius", "color", "setDrawColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-taskbar_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class TaskBarBottomView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f172489d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f172490e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f172491f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f172492g;

    /* renamed from: h, reason: collision with root package name */
    public float f172493h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.RectF f172494i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.RectF f172495m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskBarBottomView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f172490e = new android.graphics.Paint();
        this.f172491f = new android.graphics.Path();
        this.f172492g = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f172494i = new android.graphics.RectF();
        this.f172495m = new android.graphics.RectF();
        this.f172489d = getResources().getColor(com.tencent.mm.R.color.f478643cz);
        a(8);
    }

    public final void a(int i17) {
        float b17 = i65.a.b(getContext(), i17);
        this.f172493h = b17;
        float[] fArr = this.f172492g;
        fArr[0] = b17;
        fArr[1] = b17;
        fArr[2] = b17;
        fArr[3] = b17;
        com.tencent.mars.xlog.Log.i("Mp.AppBrandDesktopBottomView", "computeRadius radius: %f", java.lang.Float.valueOf(b17));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        int i17 = this.f172489d;
        android.graphics.Paint paint = this.f172490e;
        paint.setColor(i17);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        if (fp.h.b(20)) {
            this.f172491f.addRoundRect(getLeft(), getTop(), getRight(), getBottom(), this.f172492g, android.graphics.Path.Direction.CCW);
            android.graphics.Path path = this.f172491f;
            canvas.drawPath(path, paint);
            path.reset();
            return;
        }
        float f17 = 2;
        this.f172494i.set(getLeft(), getTop(), getLeft() + (this.f172493h * f17), getTop() + (this.f172493h * f17));
        this.f172495m.set(getRight() - (this.f172493h * f17), getTop(), getRight(), getTop() + (this.f172493h * f17));
        canvas.drawArc(this.f172494i, 180.0f, 90.0f, true, this.f172490e);
        canvas.drawArc(this.f172495m, 270.0f, 90.0f, true, this.f172490e);
        float left = getLeft() + this.f172493h;
        float top = getTop();
        float right = getRight();
        float f18 = this.f172493h;
        canvas.drawRect(left, top, right - f18, f18, this.f172490e);
        canvas.drawRect(getLeft(), getTop() + this.f172493h, getRight(), getBottom(), this.f172490e);
    }

    public final void setDrawColor(int i17) {
        this.f172489d = i17;
        invalidate();
    }

    public final void setTopRoundRadius(int i17) {
        a(i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskBarBottomView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f172490e = new android.graphics.Paint();
        this.f172491f = new android.graphics.Path();
        this.f172492g = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f172494i = new android.graphics.RectF();
        this.f172495m = new android.graphics.RectF();
        this.f172489d = getResources().getColor(com.tencent.mm.R.color.f478643cz);
        a(8);
    }
}
