package com.tencent.mm.plugin.vlog.ui;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b!\u0010#J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006$"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/SliderTrackView;", "Landroid/view/View;", "", "pointCount", "Ljz5/f0;", "setPointCount", ya.b.INDEX, "setSelection", "color", "setTrackColor", "", "lineWidth", "setTrackLineWidth", "offset", "setStartOffset", "Landroid/graphics/drawable/Drawable;", "drawable", "setThumbDrawable", "", "getTrackPoint", "Lyo4/b;", "z", "Lyo4/b;", "getCallback", "()Lyo4/b;", "setCallback", "(Lyo4/b;)V", "callback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class SliderTrackView extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f175889d;

    /* renamed from: e, reason: collision with root package name */
    public final int f175890e;

    /* renamed from: f, reason: collision with root package name */
    public float f175891f;

    /* renamed from: g, reason: collision with root package name */
    public float f175892g;

    /* renamed from: h, reason: collision with root package name */
    public float f175893h;

    /* renamed from: i, reason: collision with root package name */
    public float f175894i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f175895m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f175896n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Paint f175897o;

    /* renamed from: p, reason: collision with root package name */
    public int f175898p;

    /* renamed from: q, reason: collision with root package name */
    public int f175899q;

    /* renamed from: r, reason: collision with root package name */
    public final int f175900r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.LinkedList f175901s;

    /* renamed from: t, reason: collision with root package name */
    public int f175902t;

    /* renamed from: u, reason: collision with root package name */
    public float f175903u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.Rect f175904v;

    /* renamed from: w, reason: collision with root package name */
    public int f175905w;

    /* renamed from: x, reason: collision with root package name */
    public int f175906x;

    /* renamed from: y, reason: collision with root package name */
    public android.graphics.drawable.Drawable f175907y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    public yo4.b callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderTrackView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f175889d = "MicroMsg.LabelSlider";
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f175897o = paint;
        this.f175898p = 5;
        this.f175899q = i65.a.h(context, com.tencent.mm.R.dimen.f479718db);
        this.f175900r = i65.a.h(context, com.tencent.mm.R.dimen.f479738dv);
        this.f175901s = new java.util.LinkedList();
        this.f175904v = new android.graphics.Rect();
        this.f175905w = 48;
        this.f175906x = 48;
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setColor(-855638017);
        paint.setStrokeWidth(i65.a.g(context));
        this.f175890e = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final void a() {
        float f17 = this.f175903u;
        float f18 = this.f175906x / 2;
        android.graphics.Rect rect = this.f175904v;
        rect.top = (int) (f17 - f18);
        rect.bottom = (int) (f17 + f18);
        float f19 = ((android.graphics.PointF) this.f175901s.get(this.f175902t)).x;
        float f27 = this.f175905w / 2;
        rect.left = (int) (f19 - f27);
        rect.right = (int) (f19 + f27);
    }

    public final void b() {
        int width = getWidth();
        int i17 = this.f175899q;
        int i18 = (width - (i17 * 2)) / (this.f175898p - 1);
        float f17 = i17;
        float height = getHeight() / 2.0f;
        java.util.LinkedList linkedList = this.f175901s;
        linkedList.clear();
        linkedList.add(new android.graphics.PointF(f17, height));
        int i19 = this.f175898p - 1;
        for (int i27 = 0; i27 < i19; i27++) {
            linkedList.add(new android.graphics.PointF((i18 * i27) + f17 + i18, height));
        }
        this.f175903u = height;
        a();
        postInvalidate();
    }

    public final yo4.b getCallback() {
        return this.callback;
    }

    public final java.util.List<java.lang.Float> getTrackPoint() {
        java.util.LinkedList linkedList = this.f175901s;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Float.valueOf(((android.graphics.PointF) it.next()).x));
        }
        return arrayList;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        java.util.LinkedList linkedList = this.f175901s;
        if (linkedList.size() < 2) {
            return;
        }
        float height = getHeight() / 2.0f;
        int i17 = this.f175900r;
        float f17 = height - (i17 / 2);
        float f18 = (i17 / 2) + height;
        int i18 = 0;
        float f19 = ((android.graphics.PointF) linkedList.get(0)).x;
        float f27 = ((android.graphics.PointF) linkedList.get(0)).x;
        android.graphics.Paint paint = this.f175897o;
        canvas.drawLine(f19, f17, f27, f18, paint);
        int i19 = this.f175898p - 1;
        while (i18 < i19) {
            float f28 = ((android.graphics.PointF) linkedList.get(i18)).x;
            i18++;
            canvas.drawLine(f28, height, ((android.graphics.PointF) linkedList.get(i18)).x, height, paint);
            canvas.drawLine(((android.graphics.PointF) linkedList.get(i18)).x, f17, ((android.graphics.PointF) linkedList.get(i18)).x, f18, paint);
        }
        android.graphics.drawable.Drawable drawable = this.f175907y;
        if (drawable != null) {
            drawable.setBounds(this.f175904v);
        }
        android.graphics.drawable.Drawable drawable2 = this.f175907y;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r0 != 3) goto L49;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.vlog.ui.SliderTrackView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCallback(yo4.b bVar) {
        this.callback = bVar;
    }

    public final void setPointCount(int i17) {
        if (i17 < 2) {
            com.tencent.mars.xlog.Log.e(this.f175889d, "invalid pointCount " + i17);
            return;
        }
        this.f175898p = i17;
        b();
        if (this.f175902t >= i17) {
            int i18 = i17 - 1;
            this.f175902t = i18;
            yo4.b bVar = this.callback;
            if (bVar != null) {
                bVar.a(i18);
            }
        }
    }

    public final void setSelection(int i17) {
        this.f175902t = i17;
        a();
        invalidate();
    }

    public final void setStartOffset(int i17) {
        this.f175899q = i17;
        b();
    }

    public final void setThumbDrawable(android.graphics.drawable.Drawable drawable) {
        this.f175907y = drawable;
        this.f175905w = drawable != null ? drawable.getIntrinsicWidth() : 0;
        android.graphics.drawable.Drawable drawable2 = this.f175907y;
        this.f175906x = drawable2 != null ? drawable2.getIntrinsicHeight() : 0;
    }

    public final void setTrackColor(int i17) {
        this.f175897o.setColor(i17);
        postInvalidate();
    }

    public final void setTrackLineWidth(float f17) {
        this.f175897o.setStrokeWidth(f17);
        postInvalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SliderTrackView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }
}
