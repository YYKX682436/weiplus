package com.tencent.mm.plugin.recordvideo.ui.editor;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/ui/editor/EditorFrameView;", "Landroid/view/View;", "", "maskColor", "Ljz5/f0;", "setMaskColor", "Lwu3/p0;", "position", "setPosition", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class EditorFrameView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public int f155989d;

    /* renamed from: e, reason: collision with root package name */
    public final int f155990e;

    /* renamed from: f, reason: collision with root package name */
    public wu3.p0 f155991f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f155992g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Path f155993h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorFrameView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f155989d = -1;
        this.f155990e = -1;
        this.f155991f = wu3.p0.f449790d;
        this.f155992g = new android.graphics.Paint();
        this.f155993h = new android.graphics.Path();
        a();
    }

    public final void a() {
        this.f155989d = getContext().getResources().getColor(com.tencent.mm.R.color.a7i);
        int b17 = i65.a.b(getContext(), 1);
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        android.graphics.Paint paint = this.f155992g;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        float f17 = b17;
        paint.setStrokeWidth(2.0f * f17);
        paint.setColor(this.f155990e);
        float f18 = f17 * 4.0f;
        paint.setPathEffect(new android.graphics.DashPathEffect(new float[]{f18, f18}, 0.0f));
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.drawColor(this.f155989d);
        int ordinal = this.f155991f.ordinal();
        android.graphics.Paint paint = this.f155992g;
        android.graphics.Path path = this.f155993h;
        if (ordinal == 0) {
            path.moveTo(getWidth(), 0.0f);
            path.lineTo(getWidth(), getHeight());
            canvas.drawPath(path, paint);
        } else if (ordinal == 1) {
            path.moveTo(0.0f, getHeight());
            path.lineTo(getWidth(), getHeight());
            canvas.drawPath(path, paint);
        } else if (ordinal == 2) {
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, getHeight());
            canvas.drawPath(path, paint);
        } else if (ordinal == 3) {
            path.moveTo(0.0f, 0.0f);
            path.lineTo(getWidth(), 0.0f);
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    public final void setMaskColor(int i17) {
        this.f155989d = i17;
    }

    public final void setPosition(wu3.p0 position) {
        kotlin.jvm.internal.o.g(position, "position");
        this.f155991f = position;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorFrameView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f155989d = -1;
        this.f155990e = -1;
        this.f155991f = wu3.p0.f449790d;
        this.f155992g = new android.graphics.Paint();
        this.f155993h = new android.graphics.Path();
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditorFrameView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f155989d = -1;
        this.f155990e = -1;
        this.f155991f = wu3.p0.f449790d;
        this.f155992g = new android.graphics.Paint();
        this.f155993h = new android.graphics.Path();
        a();
    }
}
