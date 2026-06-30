package com.tencent.mm.plugin.vlog.ui.widget;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/widget/MultiEditCropOperationLayout;", "Lcom/tencent/mm/plugin/recordvideo/ui/WxCropOperationLayout;", "Landroid/graphics/RectF;", "x0", "Landroid/graphics/RectF;", "getMaxVisibilityRect", "()Landroid/graphics/RectF;", "maxVisibilityRect", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class MultiEditCropOperationLayout extends com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout {

    /* renamed from: l1, reason: collision with root package name */
    public boolean f176118l1;

    /* renamed from: p0, reason: collision with root package name */
    public final android.graphics.Paint f176119p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f176120p1;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public final android.graphics.RectF maxVisibilityRect;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f176122y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiEditCropOperationLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f176119p0 = paint;
        this.maxVisibilityRect = new android.graphics.RectF();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(i65.a.b(getContext(), 2));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        getGridLinePaint().setColor(android.graphics.Color.parseColor("#4DFFFFFF"));
        getGridLinePaint().setAntiAlias(true);
        getGridLinePaint().setStrokeWidth(i65.a.b(getContext(), 1));
        getGridLinePaint().setStyle(android.graphics.Paint.Style.STROKE);
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout
    public void a(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        if (!this.f176118l1) {
            super.a(canvas);
        } else if (getStyle() == ru3.o.f399764e || getStyle() == ru3.o.f399766g) {
            if (getShowGridLine()) {
                canvas.drawPath(getGridLinePath(), getGridLinePaint());
            }
            canvas.drawRect(getBoxRect(), this.f176119p0);
        }
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout
    public void c(int i17, long j17) {
        if (this.f176118l1) {
            return;
        }
        super.c(i17, j17);
    }

    public final android.graphics.RectF getMaxVisibilityRect() {
        return this.maxVisibilityRect;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!this.f176118l1) {
            return super.onDown(event);
        }
        if (getStyle() == ru3.o.f399764e) {
            this.f176122y0 = false;
            if (getVisibilityRect().contains(event.getX(), event.getY())) {
                this.f176122y0 = true;
            }
        }
        return true;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        if (!this.f176118l1) {
            return super.onScroll(motionEvent, e27, f17, f18);
        }
        java.util.Objects.toString(motionEvent);
        if (this.f176122y0) {
            getVisibilityRect().offset(-f17, -f18);
            float f19 = getVisibilityRect().top;
            android.graphics.RectF rectF = this.maxVisibilityRect;
            if (f19 < rectF.top) {
                getVisibilityRect().offset(0.0f, rectF.top - getVisibilityRect().top);
            }
            if (getVisibilityRect().bottom > rectF.bottom) {
                getVisibilityRect().offset(0.0f, rectF.bottom - getVisibilityRect().bottom);
            }
            if (getVisibilityRect().left < rectF.left) {
                getVisibilityRect().offset(rectF.left - getVisibilityRect().left, 0.0f);
            }
            if (getVisibilityRect().right > rectF.right) {
                getVisibilityRect().offset(rectF.right - getVisibilityRect().right, 0.0f);
            }
        }
        postInvalidate();
        return this.f176122y0;
    }

    @Override // com.tencent.mm.plugin.recordvideo.ui.WxCropOperationLayout, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (!this.f176118l1) {
            return super.onTouchEvent(event);
        }
        super.onTouchEvent(event);
        boolean z17 = this.f176122y0 | this.isBelongTopBlock | this.isBelongBottomBlock;
        if (event.getAction() == 1 || event.getAction() == 3) {
            this.f176122y0 = false;
            setBelongTopBlock(false);
            setBelongBottomBlock(false);
        }
        if (getStyle() != ru3.o.f399764e) {
            return false;
        }
        if (this.f176120p1) {
            return z17;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiEditCropOperationLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f176119p0 = paint;
        this.maxVisibilityRect = new android.graphics.RectF();
        paint.setColor(-1);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(i65.a.b(getContext(), 2));
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        getGridLinePaint().setColor(android.graphics.Color.parseColor("#4DFFFFFF"));
        getGridLinePaint().setAntiAlias(true);
        getGridLinePaint().setStrokeWidth(i65.a.b(getContext(), 1));
        getGridLinePaint().setStyle(android.graphics.Paint.Style.STROKE);
    }
}
