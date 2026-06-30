package com.tencent.mm.ui.chatting.viewitems.mvvmview.markdown.nativeview.selectable;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010-\u001a\u00020,\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00100\u001a\u00020!¢\u0006\u0004\b1\u00102R6\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012R*\u0010 \u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010(\u001a\u00020!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R$\u0010+\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'¨\u00063"}, d2 = {"Lcom/tencent/mm/ui/chatting/viewitems/mvvmview/markdown/nativeview/selectable/SelectionHandleView;", "Landroid/view/View;", "Lkotlin/Function2;", "", "Ljz5/f0;", "d", "Lyz5/p;", "getOnHandleMoved", "()Lyz5/p;", "setOnHandleMoved", "(Lyz5/p;)V", "onHandleMoved", "Lkotlin/Function0;", "e", "Lyz5/a;", "getOnHandleReleased", "()Lyz5/a;", "setOnHandleReleased", "(Lyz5/a;)V", "onHandleReleased", "f", "getOnOutsideTouched", "setOnOutsideTouched", "onOutsideTouched", "Ljf5/i;", "value", "g", "Ljf5/i;", "getRenderHandleType", "()Ljf5/i;", "setRenderHandleType", "(Ljf5/i;)V", "renderHandleType", "", "h", "I", "getCurrentOffset", "()I", "setCurrentOffset", "(I)V", "currentOffset", "getHandleColor", "setHandleColor", "handleColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class SelectionHandleView extends android.view.View {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.p onHandleMoved;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public yz5.a onHandleReleased;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public yz5.a onOutsideTouched;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public jf5.i renderHandleType;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int currentOffset;

    /* renamed from: i, reason: collision with root package name */
    public xl5.c f204685i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.PopupWindow f204686m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f204687n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f204688o;

    /* renamed from: p, reason: collision with root package name */
    public final float f204689p;

    /* renamed from: q, reason: collision with root package name */
    public final float f204690q;

    /* renamed from: r, reason: collision with root package name */
    public final float f204691r;

    /* renamed from: s, reason: collision with root package name */
    public final float f204692s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Paint f204693t;

    /* renamed from: u, reason: collision with root package name */
    public float f204694u;

    /* renamed from: v, reason: collision with root package name */
    public float f204695v;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectionHandleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final android.graphics.RectF a() {
        c();
        float f17 = this.f204694u;
        return new android.graphics.RectF(f17, this.f204695v, getMeasuredWidth() + f17, this.f204695v + getMeasuredHeight());
    }

    public final void b() {
        xl5.c cVar = this.f204685i;
        if (cVar == null) {
            return;
        }
        android.view.MotionEvent obtain = android.view.MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
        try {
            kotlin.jvm.internal.o.d(obtain);
            cVar.b(obtain, this.currentOffset);
        } finally {
            obtain.recycle();
        }
    }

    public final void c() {
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            measure(0, 0);
        }
    }

    public final void d(android.view.View hostView) {
        kotlin.jvm.internal.o.g(hostView, "hostView");
        c();
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(this);
        popupWindow.setClippingEnabled(false);
        popupWindow.setWidth(getMeasuredWidth());
        popupWindow.setHeight(getMeasuredHeight());
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(new jf5.p0(this));
        this.f204686m = popupWindow;
        this.f204687n = hostView;
        this.f204685i = new xl5.c(xl5.f.f455141e, hostView, true, popupWindow);
    }

    public final int getCurrentOffset() {
        return this.currentOffset;
    }

    public final int getHandleColor() {
        return this.f204693t.getColor();
    }

    public final yz5.p getOnHandleMoved() {
        return this.onHandleMoved;
    }

    public final yz5.a getOnHandleReleased() {
        return this.onHandleReleased;
    }

    public final yz5.a getOnOutsideTouched() {
        return this.onOutsideTouched;
    }

    public final jf5.i getRenderHandleType() {
        return this.renderHandleType;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        float f17 = this.f204689p;
        float f18 = this.f204690q;
        float f19 = f17 + f18;
        int ordinal = this.renderHandleType.ordinal();
        android.graphics.Paint paint = this.f204693t;
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            canvas.drawCircle(f17 + f18, f19, f18, paint);
            float f27 = this.f204689p;
            canvas.drawRect(f27, f27, f27 + f18, f27 + f18, paint);
            return;
        }
        float f28 = this.f204691r;
        float f29 = f17 + f18 + f28;
        canvas.drawCircle(f29, f19, f18, paint);
        float f37 = this.f204689p;
        canvas.drawRect(f29, f37, (2 * f18) + f37 + f28, f37 + f18, paint);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        float f17 = 2;
        float f18 = this.f204690q;
        float f19 = (f18 * f17) + this.f204691r;
        float f27 = this.f204689p;
        setMeasuredDimension(a06.d.b(f19 + (f27 * f17)), a06.d.b((f18 * f17) + (f27 * f17)));
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            yz5.p pVar = this.onHandleMoved;
            if (pVar != null) {
                pVar.invoke(java.lang.Float.valueOf(event.getRawX()), java.lang.Float.valueOf(event.getRawY()));
            }
            xl5.c cVar = this.f204685i;
            if (cVar != null) {
                cVar.b(event, this.currentOffset);
            }
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                yz5.p pVar2 = this.onHandleMoved;
                if (pVar2 != null) {
                    pVar2.invoke(java.lang.Float.valueOf(event.getRawX()), java.lang.Float.valueOf(event.getRawY()));
                }
                xl5.c cVar2 = this.f204685i;
                if (cVar2 != null) {
                    cVar2.b(event, this.currentOffset);
                }
                return true;
            }
            if (actionMasked != 3) {
                return super.onTouchEvent(event);
            }
        }
        yz5.a aVar = this.onHandleReleased;
        if (aVar != null) {
            aVar.invoke();
        }
        xl5.c cVar3 = this.f204685i;
        if (cVar3 != null) {
            cVar3.b(event, this.currentOffset);
        }
        return true;
    }

    public final void setCurrentOffset(int i17) {
        this.currentOffset = i17;
    }

    public final void setHandleColor(int i17) {
        android.graphics.Paint paint = this.f204693t;
        if (paint.getColor() != i17) {
            paint.setColor(i17);
            invalidate();
        }
    }

    public final void setOnHandleMoved(yz5.p pVar) {
        this.onHandleMoved = pVar;
    }

    public final void setOnHandleReleased(yz5.a aVar) {
        this.onHandleReleased = aVar;
    }

    public final void setOnOutsideTouched(yz5.a aVar) {
        this.onOutsideTouched = aVar;
    }

    public final void setRenderHandleType(jf5.i value) {
        kotlin.jvm.internal.o.g(value, "value");
        if (this.renderHandleType != value) {
            this.renderHandleType = value;
            invalidate();
        }
    }

    public /* synthetic */ SelectionHandleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionHandleView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.renderHandleType = jf5.i.f299466d;
        this.f204688o = new int[2];
        float f17 = getResources().getDisplayMetrics().density;
        this.f204689p = 10.0f * f17;
        this.f204690q = (18.0f * f17) / 2.0f;
        this.f204691r = 20.0f;
        this.f204692s = f17 * 20.0f;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        this.f204693t = paint;
    }
}
