package zu3;

/* loaded from: classes10.dex */
public final class x extends android.view.View implements zu3.n, cw3.s {

    /* renamed from: d, reason: collision with root package name */
    public final cw3.a f475856d;

    /* renamed from: e, reason: collision with root package name */
    public zu3.f f475857e;

    /* renamed from: f, reason: collision with root package name */
    public final bw3.e f475858f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f475859g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f475860h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f475861i;

    /* renamed from: m, reason: collision with root package name */
    public zu3.y f475862m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f475863n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f475864o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        bw3.e eVar = new bw3.e();
        this.f475858f = eVar;
        this.f475859g = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);
        this.f475860h = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);
        this.f475861i = new android.graphics.Rect();
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f475863n = true;
        this.f475864o = new float[2];
        eVar.f24928r = 0.5f;
        eVar.f24927q = 3.0f;
        android.content.res.Resources resources = getResources();
        kotlin.jvm.internal.o.f(resources, "getResources(...)");
        this.f475856d = new cw3.a(resources);
        paint.setColor(822083583);
        paint.setStyle(android.graphics.Paint.Style.FILL);
    }

    @Override // zu3.n
    public zu3.a g() {
        zu3.y yVar = this.f475862m;
        if (yVar != null) {
            yVar.f475763f.set(this.f475858f.f24917g);
        }
        return this.f475862m;
    }

    @Override // cw3.s
    public float[] getContentBoundary() {
        return (float[]) this.f475858f.f24924n.clone();
    }

    @Override // cw3.s
    public android.graphics.RectF getDrawRect() {
        float[] fArr = this.f475858f.f24924n;
        return new android.graphics.RectF(fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    @Override // cw3.s
    public zu3.a getEditorData() {
        return this.f475862m;
    }

    public android.graphics.Rect getSafeArea() {
        android.graphics.Rect rect = this.f475858f.f24918h;
        return rect == null ? new android.graphics.Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    public final bw3.e getTouchTracker() {
        return this.f475858f;
    }

    @Override // cw3.s
    public cw3.j getType() {
        return cw3.j.f224172n;
    }

    @Override // cw3.s
    public void i(android.graphics.Rect displayRect, float f17) {
        kotlin.jvm.internal.o.g(displayRect, "displayRect");
        this.f475860h.set(displayRect);
        bw3.e eVar = this.f475858f;
        eVar.f24917g.postTranslate(displayRect.width() / 2.0f, displayRect.height() * f17);
        zu3.y yVar = this.f475862m;
        if (yVar != null) {
            yVar.p(eVar.f24917g);
        }
    }

    @Override // cw3.s
    public void j(android.graphics.Rect safeRect, int i17) {
        kotlin.jvm.internal.o.g(safeRect, "safeRect");
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.setMatrix(this.f475858f.f24917g);
        if (isActivated()) {
            this.f475856d.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        boolean z17;
        zu3.r rVar;
        kotlin.jvm.internal.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        bw3.e eVar = this.f475858f;
        if (actionMasked == 3 || event.getActionMasked() == 1) {
            z17 = true;
        } else {
            z17 = eVar.a(event);
            if (z17) {
                zu3.y yVar = this.f475862m;
                if (yVar != null) {
                    yVar.p(eVar.f24917g);
                }
                bringToFront();
                zu3.y yVar2 = this.f475862m;
                if (yVar2 != null && (rVar = yVar2.f475875q) != null) {
                    rVar.a();
                }
                zu3.f fVar = this.f475857e;
                if (fVar != null) {
                    fVar.a(this, event);
                }
                postInvalidate();
            }
        }
        int actionMasked2 = event.getActionMasked();
        float[] fArr = this.f475864o;
        if (actionMasked2 == 0) {
            fArr[0] = eVar.f24926p / 2.0f;
            fArr[1] = eVar.f24925o / 2.0f;
            eVar.f24917g.mapPoints(fArr);
        } else if (event.getActionMasked() == 1) {
            bw3.b bVar = new bw3.b();
            bVar.f24902c = eVar.f24928r;
            bVar.f24903d = eVar.f24927q;
            bVar.f24901b = new float[]{eVar.f24926p / 2.0f, eVar.f24925o / 2.0f};
            android.graphics.Rect rect = this.f475859g;
            bVar.f24900a = new android.graphics.RectF(rect.left, rect.top, rect.right, rect.bottom);
            float[] fArr2 = {eVar.f24926p / 2.0f, eVar.f24925o / 2.0f};
            eVar.f24917g.mapPoints(fArr2);
            if (!bVar.f24900a.contains(fArr2[0], fArr2[1])) {
                float f17 = fArr[0];
                float f18 = fArr[1];
                bVar.f24900a = new android.graphics.RectF(f17, f18, f17, f18);
            }
            bVar.a(eVar.f24917g, new zu3.w(this, event));
        }
        return z17;
    }

    @Override // zu3.n
    public av3.a p(android.graphics.Matrix matrix) {
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.postConcat(this.f475858f.f24917g);
        int width = this.f475860h.width();
        android.graphics.Rect rect = this.f475859g;
        matrix2.postTranslate((-(width - rect.width())) / 2.0f, (-(r1.height() - rect.height())) / 2.0f);
        if (matrix != null) {
            matrix2.postConcat(matrix);
        }
        return new av3.i(matrix2);
    }

    public final void setEditItem(zu3.y pagItem) {
        kotlin.jvm.internal.o.g(pagItem, "pagItem");
        this.f475862m = pagItem;
        bw3.e eVar = this.f475858f;
        android.graphics.Matrix matrix = eVar.f24917g;
        float f17 = pagItem.f475872n;
        matrix.postScale(f17, f17);
        int i17 = pagItem.f475868j;
        int i18 = pagItem.f475869k;
        this.f475856d.setBounds(0, 0, i17, i18);
        this.f475861i.set(0, 0, i17, i18);
        eVar.f24917g.postTranslate(eVar.f24926p / 2.0f, eVar.f24925o / 2.0f);
        eVar.f24926p = i17;
        eVar.f24925o = i18;
        zu3.y yVar = this.f475862m;
        float f18 = yVar != null ? yVar.f475872n : 1.0f;
        android.graphics.Rect rect = this.f475860h;
        float f19 = (rect.top + rect.bottom) / 2;
        android.graphics.Rect rect2 = this.f475859g;
        float f27 = i18;
        eVar.f24917g.postTranslate(((-i17) * f18) / 2.0f, -((f19 - ((rect2.top + rect2.bottom) / 2.0f)) + ((f18 * f27) / 2.0f)));
        float f28 = i17;
        eVar.f24922l = new float[]{0.0f, 0.0f, f28, 0.0f, 0.0f, f27, f28, f27};
        zu3.y yVar2 = this.f475862m;
        if (yVar2 != null) {
            yVar2.p(eVar.f24917g);
        }
    }

    public final void setStateResolve(zu3.f stateResolve) {
        kotlin.jvm.internal.o.g(stateResolve, "stateResolve");
        this.f475857e = stateResolve;
    }

    @Override // cw3.s
    public void setValidArea(android.graphics.Rect validRect) {
        kotlin.jvm.internal.o.g(validRect, "validRect");
        this.f475859g.set(validRect);
    }
}
