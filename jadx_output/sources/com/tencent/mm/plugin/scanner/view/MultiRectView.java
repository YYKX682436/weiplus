package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes3.dex */
public class MultiRectView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f159868d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f159869e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f159870f;

    public MultiRectView(android.content.Context context) {
        super(context);
        new java.util.ArrayList();
        this.f159869e = new android.graphics.Paint();
        this.f159870f = new android.graphics.Paint();
        a();
    }

    public final void a() {
        android.graphics.Paint.Style style = android.graphics.Paint.Style.STROKE;
        android.graphics.Paint paint = this.f159869e;
        paint.setStyle(style);
        paint.setStrokeWidth(8.0f);
        paint.setColor(-65536);
        paint.setAntiAlias(true);
        this.f159870f.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        java.util.List list = this.f159868d;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (android.graphics.Rect rect : this.f159868d) {
            if (rect != null) {
                canvas.save();
                canvas.clipRect(rect, android.graphics.Region.Op.DIFFERENCE);
                canvas.drawRect(rect, this.f159869e);
                canvas.restore();
            }
        }
    }

    public void setRect(java.util.List<android.graphics.Rect> list) {
        this.f159868d = list;
        if (list == null || list.isEmpty()) {
            setVisibility(8);
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiRectView", "setRect:" + list);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiRectView", "setRect:" + list.size());
        setVisibility(0);
        invalidate();
    }

    public MultiRectView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        new java.util.ArrayList();
        this.f159869e = new android.graphics.Paint();
        this.f159870f = new android.graphics.Paint();
        a();
    }

    public MultiRectView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        new java.util.ArrayList();
        this.f159869e = new android.graphics.Paint();
        this.f159870f = new android.graphics.Paint();
        a();
    }
}
