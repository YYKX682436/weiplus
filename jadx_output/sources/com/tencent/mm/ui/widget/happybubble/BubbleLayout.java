package com.tencent.mm.ui.widget.happybubble;

/* loaded from: classes15.dex */
public class BubbleLayout extends android.widget.FrameLayout {
    public int A;
    public ol5.g B;
    public final android.graphics.Region C;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.Paint f212087d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Paint f212088e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Path f212089f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Path f212090g;

    /* renamed from: h, reason: collision with root package name */
    public ol5.f f212091h;

    /* renamed from: i, reason: collision with root package name */
    public int f212092i;

    /* renamed from: m, reason: collision with root package name */
    public int f212093m;

    /* renamed from: n, reason: collision with root package name */
    public int f212094n;

    /* renamed from: o, reason: collision with root package name */
    public int f212095o;

    /* renamed from: p, reason: collision with root package name */
    public int f212096p;

    /* renamed from: q, reason: collision with root package name */
    public int f212097q;

    /* renamed from: r, reason: collision with root package name */
    public int f212098r;

    /* renamed from: s, reason: collision with root package name */
    public int f212099s;

    /* renamed from: t, reason: collision with root package name */
    public int f212100t;

    /* renamed from: u, reason: collision with root package name */
    public int f212101u;

    /* renamed from: v, reason: collision with root package name */
    public int f212102v;

    /* renamed from: w, reason: collision with root package name */
    public int f212103w;

    /* renamed from: x, reason: collision with root package name */
    public int f212104x;

    /* renamed from: y, reason: collision with root package name */
    public int f212105y;

    /* renamed from: z, reason: collision with root package name */
    public int f212106z;

    public BubbleLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        android.graphics.Paint paint = this.f212087d;
        paint.setPathEffect(new android.graphics.CornerPathEffect(this.f212106z));
        paint.setShadowLayer(this.f212103w, this.f212104x, this.f212105y, this.f212102v);
        int i17 = this.f212092i;
        ol5.f fVar = this.f212091h;
        this.f212095o = (fVar == ol5.f.LEFT ? this.f212101u : 0) + i17;
        this.f212096p = (fVar == ol5.f.TOP ? this.f212101u : 0) + i17;
        this.f212097q = (this.f212093m - i17) - (fVar == ol5.f.RIGHT ? this.f212101u : 0);
        this.f212098r = (this.f212094n - i17) - (fVar == ol5.f.BOTTOM ? this.f212101u : 0);
        paint.setColor(this.A);
        this.f212088e.setColor(this.A);
        android.graphics.Path path = this.f212089f;
        path.reset();
        android.graphics.Path path2 = this.f212090g;
        path2.reset();
        int i18 = this.f212099s;
        int i19 = this.f212101u;
        int i27 = i18 + i19;
        int i28 = this.f212098r;
        int i29 = i27 > i28 ? i28 - this.f212100t : i18;
        int i37 = this.f212092i;
        if (i29 <= i37) {
            i29 = i37;
        }
        int i38 = i19 + i18;
        int i39 = this.f212097q;
        if (i38 > i39) {
            i18 = i39 - this.f212100t;
        }
        if (i18 > i37) {
            i37 = i18;
        }
        int ordinal = this.f212091h.ordinal();
        if (ordinal == 0) {
            float f17 = i29;
            path.moveTo(this.f212095o, f17);
            path2.moveTo(this.f212095o, f17);
            path2.rLineTo(-this.f212101u, this.f212100t / 2);
            path2.rLineTo(this.f212101u, this.f212100t / 2);
            path2.lineTo(this.f212095o, f17);
            path.lineTo(this.f212095o, this.f212098r);
            path.lineTo(this.f212097q, this.f212098r);
            path.lineTo(this.f212097q, this.f212096p);
            path.lineTo(this.f212095o, this.f212096p);
        } else if (ordinal == 1) {
            float f18 = i37;
            path.moveTo(f18, this.f212096p);
            path2.moveTo(f18, this.f212096p);
            path2.rLineTo(this.f212100t / 2, -this.f212101u);
            path2.rLineTo(this.f212100t / 2, this.f212101u);
            path2.lineTo(f18, this.f212096p);
            path.lineTo(this.f212097q, this.f212096p);
            path.lineTo(this.f212097q, this.f212098r);
            path.lineTo(this.f212095o, this.f212098r);
            path.lineTo(this.f212095o, this.f212096p);
        } else if (ordinal == 2) {
            float f19 = i29;
            path.moveTo(this.f212097q, f19);
            path2.moveTo(this.f212097q, f19);
            path2.rLineTo(this.f212101u, this.f212100t / 2);
            path2.rLineTo(-this.f212101u, this.f212100t / 2);
            path2.lineTo(this.f212097q, f19);
            path.lineTo(this.f212097q, this.f212098r);
            path.lineTo(this.f212095o, this.f212098r);
            path.lineTo(this.f212095o, this.f212096p);
            path.lineTo(this.f212097q, this.f212096p);
        } else if (ordinal == 3) {
            float f27 = i37;
            path.moveTo(f27, this.f212098r);
            path2.moveTo(f27, this.f212098r);
            path2.rLineTo(this.f212100t / 2, this.f212101u);
            path2.rLineTo(this.f212100t / 2, -this.f212101u);
            path2.lineTo(f27, this.f212098r);
            path.lineTo(this.f212097q, this.f212098r);
            path.lineTo(this.f212097q, this.f212096p);
            path.lineTo(this.f212095o, this.f212096p);
            path.lineTo(this.f212095o, this.f212098r);
        }
        path.close();
        path2.close();
    }

    public void b() {
        int i17 = this.f212092i * 2;
        int ordinal = this.f212091h.ordinal();
        if (ordinal == 0) {
            setPadding(this.f212101u + i17, i17, i17, i17);
            return;
        }
        if (ordinal == 1) {
            setPadding(i17, this.f212101u + i17, i17, i17);
        } else if (ordinal == 2) {
            setPadding(i17, i17, this.f212101u + i17, i17);
        } else {
            if (ordinal != 3) {
                return;
            }
            setPadding(i17, i17, i17, this.f212101u + i17);
        }
    }

    public int getBubbleColor() {
        return this.A;
    }

    public int getBubblePadding() {
        return this.f212092i;
    }

    public int getBubbleRadius() {
        return this.f212106z;
    }

    public ol5.f getLook() {
        return this.f212091h;
    }

    public int getLookLength() {
        return this.f212101u;
    }

    public int getLookPosition() {
        return this.f212099s;
    }

    public int getLookWidth() {
        return this.f212100t;
    }

    public android.graphics.Paint getPaint() {
        return this.f212087d;
    }

    public android.graphics.Path getPath() {
        return this.f212089f;
    }

    public int getShadowColor() {
        return this.f212102v;
    }

    public int getShadowRadius() {
        return this.f212103w;
    }

    public int getShadowX() {
        return this.f212104x;
    }

    public int getShadowY() {
        return this.f212105y;
    }

    @Override // android.view.View
    public void invalidate() {
        a();
        super.invalidate();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        android.graphics.Paint paint = this.f212087d;
        paint.setPathEffect(new android.graphics.CornerPathEffect(this.f212106z));
        canvas.drawPath(this.f212089f, paint);
        paint.setPathEffect(null);
        canvas.drawPath(this.f212090g, this.f212088e);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof android.os.Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        android.os.Bundle bundle = (android.os.Bundle) parcelable;
        this.f212099s = bundle.getInt("mLookPosition");
        this.f212100t = bundle.getInt("mLookWidth");
        this.f212101u = bundle.getInt("mLookLength");
        this.f212102v = bundle.getInt("mShadowColor");
        this.f212103w = bundle.getInt("mShadowRadius");
        this.f212104x = bundle.getInt("mShadowX");
        this.f212105y = bundle.getInt("mShadowY");
        this.f212106z = bundle.getInt("mBubbleRadius");
        this.f212093m = bundle.getInt("mWidth");
        this.f212094n = bundle.getInt("mHeight");
        this.f212095o = bundle.getInt("mLeft");
        this.f212096p = bundle.getInt("mTop");
        this.f212097q = bundle.getInt("mRight");
        this.f212098r = bundle.getInt("mBottom");
        super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putInt("mLookPosition", this.f212099s);
        bundle.putInt("mLookWidth", this.f212100t);
        bundle.putInt("mLookLength", this.f212101u);
        bundle.putInt("mShadowColor", this.f212102v);
        bundle.putInt("mShadowRadius", this.f212103w);
        bundle.putInt("mShadowX", this.f212104x);
        bundle.putInt("mShadowY", this.f212105y);
        bundle.putInt("mBubbleRadius", this.f212106z);
        bundle.putInt("mWidth", this.f212093m);
        bundle.putInt("mHeight", this.f212094n);
        bundle.putInt("mLeft", this.f212095o);
        bundle.putInt("mTop", this.f212096p);
        bundle.putInt("mRight", this.f212097q);
        bundle.putInt("mBottom", this.f212098r);
        return bundle;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f212093m = i17;
        this.f212094n = i18;
        a();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        ol5.g gVar;
        if (motionEvent.getAction() == 0) {
            android.graphics.RectF rectF = new android.graphics.RectF();
            android.graphics.Path path = this.f212089f;
            path.computeBounds(rectF, true);
            android.graphics.Region region = this.C;
            region.setPath(path, new android.graphics.Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
            if (!region.contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (gVar = this.B) != null) {
                ol5.e eVar = ((ol5.c) gVar).f346214a;
                if (eVar.f346227n) {
                    eVar.dismiss();
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void postInvalidate() {
        a();
        super.postInvalidate();
    }

    public void setBubbleColor(int i17) {
        this.A = i17;
    }

    public void setBubblePadding(int i17) {
        this.f212092i = i17;
    }

    public void setBubbleRadius(int i17) {
        this.f212106z = i17;
    }

    public void setLook(ol5.f fVar) {
        this.f212091h = fVar;
        b();
    }

    public void setLookLength(int i17) {
        this.f212101u = i17;
        b();
    }

    public void setLookPosition(int i17) {
        this.f212099s = i17;
    }

    public void setLookWidth(int i17) {
        this.f212100t = i17;
    }

    public void setOnClickEdgeListener(ol5.g gVar) {
        this.B = gVar;
    }

    public void setShadowColor(int i17) {
        this.f212102v = i17;
    }

    public void setShadowRadius(int i17) {
        this.f212103w = i17;
    }

    public void setShadowX(int i17) {
        this.f212104x = i17;
    }

    public void setShadowY(int i17) {
        this.f212105y = i17;
    }

    public BubbleLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.C = new android.graphics.Region();
        setLayerType(1, null);
        setWillNotDraw(false);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447186d, i17, 0);
        int i18 = obtainStyledAttributes.getInt(3, 4);
        ol5.f fVar = ol5.f.BOTTOM;
        if (i18 == 1) {
            fVar = ol5.f.LEFT;
        } else if (i18 == 2) {
            fVar = ol5.f.TOP;
        } else if (i18 == 3) {
            fVar = ol5.f.RIGHT;
        }
        this.f212091h = fVar;
        this.f212099s = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
        this.f212100t = obtainStyledAttributes.getDimensionPixelOffset(6, i65.a.a(getContext(), 17.0f));
        this.f212101u = obtainStyledAttributes.getDimensionPixelOffset(4, i65.a.a(getContext(), 17.0f));
        this.f212103w = obtainStyledAttributes.getDimensionPixelOffset(8, i65.a.a(getContext(), 3.3f));
        this.f212104x = obtainStyledAttributes.getDimensionPixelOffset(9, i65.a.a(getContext(), 1.0f));
        this.f212105y = obtainStyledAttributes.getDimensionPixelOffset(10, i65.a.a(getContext(), 1.0f));
        this.f212106z = obtainStyledAttributes.getDimensionPixelOffset(2, i65.a.a(getContext(), 7.0f));
        this.f212092i = obtainStyledAttributes.getDimensionPixelOffset(1, i65.a.a(getContext(), 8.0f));
        this.f212102v = obtainStyledAttributes.getColor(7, -7829368);
        this.A = obtainStyledAttributes.getColor(0, -1);
        obtainStyledAttributes.recycle();
        android.graphics.Paint paint = new android.graphics.Paint(5);
        this.f212087d = paint;
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint(5);
        this.f212088e = paint2;
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        this.f212089f = new android.graphics.Path();
        this.f212090g = new android.graphics.Path();
        b();
    }
}
