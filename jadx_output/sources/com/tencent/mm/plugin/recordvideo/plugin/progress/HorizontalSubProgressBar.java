package com.tencent.mm.plugin.recordvideo.plugin.progress;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/progress/HorizontalSubProgressBar;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "style", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HorizontalSubProgressBar extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f155863d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f155864e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f155865f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalSubProgressBar(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        int parseColor = android.graphics.Color.parseColor("#FA9D3B");
        int parseColor2 = android.graphics.Color.parseColor("#ffffff");
        int parseColor3 = android.graphics.Color.parseColor("#FA5151");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f155863d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f155864e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f155865f = new java.util.ArrayList();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(parseColor);
        paint.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setColor(parseColor2);
        paint2.setAntiAlias(true);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setColor(parseColor3);
        paint3.setAntiAlias(true);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        java.util.ArrayList arrayList = this.f155865f;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            ((java.lang.Number) next).floatValue();
            arrayList.size();
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            float width = getWidth() * ((java.lang.Number) obj).floatValue();
            float f17 = 100;
            canvas.drawRect(new android.graphics.RectF(i17 == 0 ? 0.0f : (((java.lang.Number) arrayList.get(i17 - 1)).floatValue() * getWidth()) / f17, 0.0f, width / f17, getHeight()), this.f155863d);
            if (i17 != arrayList.size() - 1) {
                java.lang.Object obj2 = arrayList.get(i17);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                float width2 = (getWidth() * ((java.lang.Number) obj2).floatValue()) / f17;
                canvas.drawRect(new android.graphics.RectF(width2 - (getWidth() * 0.0053f), 0.0f, width2, getHeight()), this.f155864e);
            }
            i17 = i18;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HorizontalSubProgressBar(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        int parseColor = android.graphics.Color.parseColor("#FA9D3B");
        int parseColor2 = android.graphics.Color.parseColor("#ffffff");
        int parseColor3 = android.graphics.Color.parseColor("#FA5151");
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f155863d = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f155864e = paint2;
        android.graphics.Paint paint3 = new android.graphics.Paint();
        this.f155865f = new java.util.ArrayList();
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setColor(parseColor);
        paint.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setColor(parseColor2);
        paint2.setAntiAlias(true);
        paint3.setStyle(android.graphics.Paint.Style.FILL);
        paint3.setColor(parseColor3);
        paint3.setAntiAlias(true);
    }
}
