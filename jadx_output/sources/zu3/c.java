package zu3;

/* loaded from: classes10.dex */
public abstract class c extends android.view.View implements zu3.n, cw3.s {
    public final float[] A;
    public boolean B;

    /* renamed from: d, reason: collision with root package name */
    public final cw3.a f475772d;

    /* renamed from: e, reason: collision with root package name */
    public zu3.f f475773e;

    /* renamed from: f, reason: collision with root package name */
    public final bw3.e f475774f;

    /* renamed from: g, reason: collision with root package name */
    public final int f475775g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f475776h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f475777i;

    /* renamed from: m, reason: collision with root package name */
    public final android.graphics.Paint f475778m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.CharSequence f475779n;

    /* renamed from: o, reason: collision with root package name */
    public float f475780o;

    /* renamed from: p, reason: collision with root package name */
    public int f475781p;

    /* renamed from: q, reason: collision with root package name */
    public int f475782q;

    /* renamed from: r, reason: collision with root package name */
    public int f475783r;

    /* renamed from: s, reason: collision with root package name */
    public zu3.s f475784s;

    /* renamed from: t, reason: collision with root package name */
    public zu3.e f475785t;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.Bitmap f475786u;

    /* renamed from: v, reason: collision with root package name */
    public android.graphics.Matrix f475787v;

    /* renamed from: w, reason: collision with root package name */
    public float f475788w;

    /* renamed from: x, reason: collision with root package name */
    public float f475789x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f475790y;

    /* renamed from: z, reason: collision with root package name */
    public final int f475791z;

    public c(android.content.Context context) {
        super(context);
        bw3.e eVar = new bw3.e();
        this.f475774f = eVar;
        this.f475775g = com.tencent.mm.ui.bl.c(com.tencent.mm.sdk.platformtools.x2.f193071a);
        this.f475776h = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);
        this.f475777i = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f475778m = paint;
        this.f475780o = getResources().getDimension(com.tencent.mm.R.dimen.f480341v2);
        this.f475785t = zu3.e.f475796e;
        this.A = new float[2];
        eVar.f24928r = 0.5f;
        eVar.f24927q = 3.0f;
        android.content.res.Resources resources = getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        this.f475772d = new cw3.a(resources);
        kotlin.jvm.internal.o.d(context);
        this.f475791z = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        paint.setAntiAlias(true);
        this.B = true;
    }

    public zu3.a g() {
        if (this.f475786u == null) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postConcat(this.f475774f.f24917g);
        zu3.e eVar = this.f475785t;
        if (eVar == zu3.e.f475796e || eVar == zu3.e.f475799h) {
            return new zu3.a0(this.f475779n, this.f475781p, this.f475782q, this.f475783r, matrix);
        }
        zu3.s sVar = this.f475784s;
        kotlin.jvm.internal.o.d(sVar);
        java.lang.String str = sVar.f475826g;
        zu3.s sVar2 = this.f475784s;
        kotlin.jvm.internal.o.d(sVar2);
        java.lang.String str2 = sVar2.f475827h;
        zu3.s sVar3 = this.f475784s;
        kotlin.jvm.internal.o.d(sVar3);
        float f17 = sVar3.f475828i;
        zu3.s sVar4 = this.f475784s;
        kotlin.jvm.internal.o.d(sVar4);
        return new zu3.s(str, str2, f17, sVar4.f475829j, matrix);
    }

    public final android.graphics.Bitmap getBitmap() {
        return this.f475786u;
    }

    public final int getColor() {
        return this.f475781p;
    }

    @Override // cw3.s
    public float[] getContentBoundary() {
        return (float[]) this.f475774f.f24924n.clone();
    }

    public final android.graphics.Rect getDisplayRect() {
        return this.f475777i;
    }

    @Override // cw3.s
    public android.graphics.RectF getDrawRect() {
        float[] fArr = this.f475774f.f24924n;
        return new android.graphics.RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public abstract /* synthetic */ zu3.a getEditorData();

    public final boolean getEnableNotify() {
        return this.B;
    }

    public final zu3.s getLocation() {
        return this.f475784s;
    }

    public final int getMarginBottom() {
        return this.f475783r;
    }

    public final int getNavigateBarHeight() {
        return this.f475775g;
    }

    public android.graphics.Rect getSafeArea() {
        android.graphics.Rect rect = this.f475774f.f24918h;
        return rect == null ? new android.graphics.Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    public final zu3.e getSourceDataType() {
        return this.f475785t;
    }

    public final java.lang.CharSequence getText() {
        return this.f475779n;
    }

    public final int getTextBg() {
        return this.f475782q;
    }

    public final float getTextSize() {
        return this.f475780o;
    }

    public final float getTouchDownX() {
        return this.f475788w;
    }

    public final float getTouchDownY() {
        return this.f475789x;
    }

    public final boolean getTouchMoved() {
        return this.f475790y;
    }

    public final int getTouchSlop() {
        return this.f475791z;
    }

    public final bw3.e getTouchTracker() {
        return this.f475774f;
    }

    public abstract /* synthetic */ cw3.j getType();

    public final android.graphics.Rect getValidRect() {
        return this.f475776h;
    }

    public final android.graphics.Matrix getViewMatrix() {
        return this.f475787v;
    }

    @Override // cw3.s
    public void i(android.graphics.Rect displayRect, float f17) {
        kotlin.jvm.internal.o.g(displayRect, "displayRect");
        this.f475777i.set(displayRect);
        this.f475774f.f24917g.postTranslate(displayRect.width() / 2.0f, displayRect.height() * f17);
    }

    @Override // cw3.s
    public void j(android.graphics.Rect safeRect, int i17) {
        kotlin.jvm.internal.o.g(safeRect, "safeRect");
        bw3.e eVar = this.f475774f;
        eVar.f24918h = safeRect;
        eVar.f24919i = i65.a.b(getContext(), i17);
    }

    @Override // cw3.s
    public boolean o() {
        return this.B;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.save();
        android.graphics.Matrix matrix = this.f475787v;
        bw3.e eVar = this.f475774f;
        if (matrix != null) {
            canvas.setMatrix(matrix);
        } else {
            canvas.setMatrix(eVar.f24917g);
        }
        if (isActivated()) {
            this.f475772d.draw(canvas);
        }
        canvas.restore();
        canvas.clipRect(this.f475776h);
        canvas.save();
        android.graphics.Matrix matrix2 = this.f475787v;
        if (matrix2 != null) {
            canvas.setMatrix(matrix2);
        } else {
            canvas.setMatrix(eVar.f24917g);
        }
        android.graphics.Bitmap bitmap = this.f475786u;
        if (bitmap != null) {
            kotlin.jvm.internal.o.d(bitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f475778m);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        boolean z17;
        kotlin.jvm.internal.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        bw3.e eVar = this.f475774f;
        if (actionMasked == 3 || event.getActionMasked() == 1) {
            z17 = true;
        } else {
            z17 = eVar.a(event);
            if (z17) {
                bringToFront();
                zu3.f fVar = this.f475773e;
                if (fVar != null) {
                    fVar.a(this, event);
                }
                postInvalidate();
            }
        }
        if (z17) {
            int actionMasked2 = event.getActionMasked();
            float[] fArr = this.A;
            if (actionMasked2 == 0) {
                this.f475788w = event.getX();
                this.f475789x = event.getY();
                this.f475790y = false;
                fArr[0] = eVar.f24926p / 2.0f;
                fArr[1] = eVar.f24925o / 2.0f;
                eVar.f24917g.mapPoints(fArr);
            } else if (actionMasked2 == 1) {
                bw3.b bVar = new bw3.b();
                bVar.f24902c = eVar.f24928r;
                bVar.f24903d = eVar.f24927q;
                bVar.f24901b = new float[]{eVar.f24926p / 2.0f, eVar.f24925o / 2.0f};
                android.graphics.Rect rect = this.f475776h;
                bVar.f24900a = new android.graphics.RectF(rect.left, rect.top, rect.right, rect.bottom);
                float[] fArr2 = {eVar.f24926p / 2.0f, eVar.f24925o / 2.0f};
                eVar.f24917g.mapPoints(fArr2);
                if (!bVar.f24900a.contains(fArr2[0], fArr2[1])) {
                    float f17 = fArr[0];
                    float f18 = fArr[1];
                    bVar.f24900a = new android.graphics.RectF(f17, f18, f17, f18);
                }
                bVar.a(eVar.f24917g, new zu3.b(this, event));
            } else if (actionMasked2 == 2) {
                float max = java.lang.Math.max(java.lang.Math.abs(event.getX() - this.f475788w), java.lang.Math.abs(event.getY() - this.f475789x));
                if (!this.f475790y) {
                    this.f475790y = max > ((float) this.f475791z);
                }
            }
        }
        return z17;
    }

    @Override // zu3.n
    public av3.a p(android.graphics.Matrix matrix) {
        if (this.f475786u == null) {
            return null;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postConcat(this.f475774f.f24917g);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        return new av3.c(this.f475786u, matrix2);
    }

    public final void setBitmap(android.graphics.Bitmap bitmap) {
        this.f475786u = bitmap;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            bw3.e eVar = this.f475774f;
            eVar.f24926p = width;
            eVar.f24925o = bitmap.getHeight();
            eVar.f24917g.preTranslate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
            this.f475772d.setBounds(0, 0, bitmap.getWidth(), bitmap.getHeight());
            eVar.getClass();
            eVar.f24922l = new float[]{0.0f, 0.0f, bitmap.getWidth(), 0.0f, 0.0f, bitmap.getHeight(), bitmap.getWidth(), bitmap.getHeight()};
        }
    }

    public final void setColor(int i17) {
        this.f475781p = i17;
    }

    public final void setEnableNotify(boolean z17) {
        this.B = z17;
    }

    public final void setLocation(zu3.s sVar) {
        this.f475784s = sVar;
    }

    public final void setMarginBottom(int i17) {
        this.f475783r = i17;
    }

    public final void setSourceDataType(zu3.e eVar) {
        kotlin.jvm.internal.o.g(eVar, "<set-?>");
        this.f475785t = eVar;
    }

    public final void setStateResolve(zu3.f stateResolve) {
        kotlin.jvm.internal.o.g(stateResolve, "stateResolve");
        this.f475773e = stateResolve;
    }

    public final void setText(java.lang.CharSequence charSequence) {
        this.f475779n = charSequence;
    }

    public final void setTextBg(int i17) {
        this.f475782q = i17;
    }

    public final void setTextSize(float f17) {
        this.f475780o = f17;
    }

    public final void setTouchDownX(float f17) {
        this.f475788w = f17;
    }

    public final void setTouchDownY(float f17) {
        this.f475789x = f17;
    }

    public final void setTouchMoved(boolean z17) {
        this.f475790y = z17;
    }

    @Override // cw3.s
    public void setValidArea(android.graphics.Rect validRect) {
        kotlin.jvm.internal.o.g(validRect, "validRect");
        this.f475776h.set(validRect);
    }

    public final void setViewMatrix(android.graphics.Matrix matrix) {
        this.f475787v = matrix;
        if (matrix != null) {
            bw3.e eVar = this.f475774f;
            eVar.getClass();
            eVar.f24917g = matrix;
            android.graphics.Canvas canvas = new android.graphics.Canvas();
            canvas.save();
            if (this.f475787v != null) {
                canvas.setMatrix(matrix);
            }
            if (isActivated()) {
                this.f475772d.draw(canvas);
            }
            android.graphics.Bitmap bitmap = this.f475786u;
            if (bitmap != null) {
                kotlin.jvm.internal.o.d(bitmap);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
            }
        }
    }
}
