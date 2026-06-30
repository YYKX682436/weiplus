package wu3;

/* loaded from: classes10.dex */
public final class h extends com.tencent.mm.ui.widget.cropview.TouchEventLayout implements zu3.n, cw3.s {
    public final jz5.g A;
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public final android.view.View E;
    public final int F;
    public long G;
    public yz5.l H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final float[] f449748J;
    public final java.lang.Runnable K;

    /* renamed from: n, reason: collision with root package name */
    public zu3.d f449749n;

    /* renamed from: o, reason: collision with root package name */
    public final bw3.e f449750o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.Rect f449751p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f449752q;

    /* renamed from: r, reason: collision with root package name */
    public zu3.f f449753r;

    /* renamed from: s, reason: collision with root package name */
    public final android.graphics.RectF f449754s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.RectF f449755t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Matrix f449756u;

    /* renamed from: v, reason: collision with root package name */
    public float f449757v;

    /* renamed from: w, reason: collision with root package name */
    public float f449758w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f449759x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f449760y;

    /* renamed from: z, reason: collision with root package name */
    public final int f449761z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f449750o = new bw3.e();
        this.f449751p = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);
        this.f449752q = new android.graphics.Rect(0, 0, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x, com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y);
        this.f449754s = new android.graphics.RectF();
        this.f449755t = new android.graphics.RectF();
        this.f449756u = new android.graphics.Matrix();
        i65.a.b(context, 4);
        this.f449761z = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.A = jz5.h.b(new wu3.e(this));
        this.B = jz5.h.b(new wu3.b(this));
        this.C = jz5.h.b(new wu3.a(this));
        this.D = jz5.h.b(new wu3.d(this, context));
        this.F = i65.a.b(getContext(), 32);
        i65.a.B(context);
        i65.a.h(context, com.tencent.mm.R.dimen.f479664c2);
        this.f449748J = new float[2];
        this.K = new wu3.g(this);
        setEnableFling(false);
        if (kotlin.jvm.internal.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            getTouchDetector().setIsLongpressEnabled(false);
        }
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d3i, (android.view.ViewGroup) this, true);
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d3h, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483547b65);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.E = findViewById;
        getCaptionView().setText(i65.a.r(context, com.tencent.mm.R.string.k6l));
        setOnTouchListener(this);
    }

    private final android.widget.LinearLayout getCaptionContentLayout() {
        return (android.widget.LinearLayout) ((jz5.n) this.C).getValue();
    }

    private final android.widget.RelativeLayout getCaptionLayout() {
        return (android.widget.RelativeLayout) ((jz5.n) this.B).getValue();
    }

    private final android.widget.LinearLayout getCaptionLoadingLayout() {
        return (android.widget.LinearLayout) ((jz5.n) this.D).getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.tencent.mm.plugin.recordvideo.ui.editor.PhotoTextView getCaptionView() {
        return (com.tencent.mm.plugin.recordvideo.ui.editor.PhotoTextView) ((jz5.n) this.A).getValue();
    }

    @Override // cw3.s
    public boolean a(long j17) {
        com.tencent.mm.protobuf.g gVar;
        this.G = j17;
        zu3.d dVar = this.f449749n;
        r45.is i17 = dVar != null ? dVar.i(j17) : null;
        java.lang.String h17 = (i17 == null || (gVar = i17.f377297d) == null) ? null : gVar.h(com.tencent.mapsdk.internal.rv.f51270c);
        if (android.text.TextUtils.isEmpty(h17)) {
            int i18 = rl.b.f397143a;
            setVisibility(4);
            return false;
        }
        setVisibility(0);
        getCaptionView().setAutoSizeTextTypeWithDefaults(0);
        getCaptionView().setText("");
        getCaptionView().setTextSize(0, i65.a.h(getContext(), com.tencent.mm.R.dimen.f479854h3));
        getCaptionView().setAutoSizeTextTypeWithDefaults(1);
        getCaptionView().setVisibility(0);
        getCaptionView().setText(h17);
        kotlin.jvm.internal.o.d(i17);
        boolean z17 = !i17.f377300g;
        this.I = z17;
        if (z17) {
            int i19 = rl.b.f397143a;
            getCaptionContentLayout().setVisibility(0);
            getCaptionLoadingLayout().setVisibility(4);
        } else {
            getCaptionView().setBackgroundDrawable(null);
            int i27 = rl.b.f397143a;
            getCaptionContentLayout().setVisibility(4);
            getCaptionLoadingLayout().setVisibility(0);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        canvas.save();
        canvas.clipRect(this.f449751p);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // zu3.n
    public zu3.a g() {
        zu3.d dVar = this.f449749n;
        if (dVar == null) {
            return null;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postScale(getCaptionLayout().getScaleX(), getCaptionLayout().getScaleY());
        getCaptionLayout().getLocationOnScreen(new int[2]);
        matrix.postTranslate(0.0f, r2[1]);
        zu3.d dVar2 = new zu3.d(dVar.f475758a, dVar.f475792g, matrix);
        dVar2.f475795j = dVar.f475795j;
        dVar2.f475793h = dVar.f475793h;
        dVar2.f475794i = dVar.f475794i;
        return dVar2;
    }

    public final yz5.l getClearCaptionListener() {
        return this.H;
    }

    @Override // cw3.s
    public float[] getContentBoundary() {
        return (float[]) this.f449750o.f24924n.clone();
    }

    public final r45.is getCurrentCaption() {
        zu3.d dVar = this.f449749n;
        if (dVar == null) {
            return null;
        }
        long j17 = this.G;
        java.util.Iterator it = dVar.f475792g.iterator();
        while (it.hasNext()) {
            r45.is isVar = (r45.is) it.next();
            if (isVar.f377298e <= j17 && isVar.f377299f >= j17) {
                return isVar;
            }
        }
        return null;
    }

    @Override // cw3.s
    public android.graphics.RectF getDrawRect() {
        return this.f449755t;
    }

    @Override // cw3.s
    public zu3.a getEditorData() {
        return this.f449749n;
    }

    public final boolean getEnableEdit() {
        return this.I;
    }

    public android.graphics.Rect getSafeArea() {
        android.graphics.Rect rect = this.f449750o.f24918h;
        return rect == null ? new android.graphics.Rect(0, 0, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels) : rect;
    }

    public final int getTouchSlop() {
        return this.f449761z;
    }

    public final bw3.e getTouchTracker() {
        return this.f449750o;
    }

    @Override // cw3.s
    public cw3.j getType() {
        zu3.e eVar = zu3.e.f475802n;
        zu3.d dVar = this.f449749n;
        return (dVar != null ? dVar.f475758a : null) == eVar ? cw3.j.f224171m : cw3.j.f224170i;
    }

    @Override // cw3.s
    public void i(android.graphics.Rect displayRect, float f17) {
        kotlin.jvm.internal.o.g(displayRect, "displayRect");
        this.f449752q.set(displayRect);
        int width = displayRect.width();
        bw3.e eVar = this.f449750o;
        eVar.f24926p = width;
        this.f449754s.right = displayRect.width();
        measure(0, 0);
        lt3.n nVar = lt3.n.f321260a;
        float measuredHeight = (lt3.n.f321264e.bottom - ((getCaptionLayout().getMeasuredHeight() + getCaptionContentLayout().getMeasuredHeight()) / 2.0f)) - this.F;
        int i17 = eVar.f24926p;
        int i18 = eVar.f24925o;
        eVar.getClass();
        eVar.f24922l = new float[]{0.0f, 0.0f, i17, 0.0f, 0.0f, i18, i17, i18};
        this.f449756u.postTranslate(0.0f, measuredHeight);
        k();
        java.lang.String str = "topMargin:" + measuredHeight + " width:" + displayRect.width();
        int i19 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptionItemView", str, null);
    }

    @Override // cw3.s
    public void j(android.graphics.Rect safeRect, int i17) {
        kotlin.jvm.internal.o.g(safeRect, "safeRect");
        bw3.e eVar = this.f449750o;
        eVar.f24918h = safeRect;
        eVar.f24919i = i65.a.b(getContext(), i17);
    }

    public final void k() {
        android.graphics.RectF rectF = this.f449755t;
        android.graphics.RectF rectF2 = this.f449754s;
        android.graphics.Matrix matrix = this.f449756u;
        matrix.mapRect(rectF, rectF2);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        kotlin.jvm.internal.o.g(matrix, "matrix");
        float[] fArr2 = new float[9];
        matrix.getValues(fArr2);
        double d17 = fArr2[0];
        double d18 = fArr2[3];
        float sqrt = (float) java.lang.Math.sqrt((d17 * d17) + (d18 * d18));
        getCaptionLayout().setPivotX(0.0f);
        getCaptionLayout().setPivotY(0.0f);
        getCaptionLayout().setScaleX(sqrt);
        getCaptionLayout().setScaleY(sqrt);
        getCaptionLayout().setTranslationX(fArr[2]);
        getCaptionLayout().setTranslationY(fArr[5]);
    }

    public final void m() {
        float[] fArr = {this.f449754s.right, getCaptionContentLayout().getBottom()};
        android.graphics.Matrix matrix = this.f449756u;
        matrix.mapPoints(fArr);
        float f17 = (this.f449751p.bottom - this.F) - fArr[1];
        if (f17 < 0.0f) {
            matrix.postTranslate(0.0f, f17);
            android.view.View view = this.E;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/ui/editor/CaptionItemView", "checkMatrix", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/ui/editor/CaptionItemView", "checkMatrix", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.widget.cropview.TouchEventLayout, android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(android.view.ScaleGestureDetector detector) {
        kotlin.jvm.internal.o.g(detector, "detector");
        float focusY = detector.getFocusY();
        float scaleFactor = 1 - detector.getScaleFactor();
        android.graphics.Matrix matrix = this.f449756u;
        matrix.postScale(detector.getScaleFactor(), detector.getScaleFactor());
        matrix.postTranslate(this.f449754s.centerX() * scaleFactor, focusY * scaleFactor);
        m();
        k();
        return true;
    }

    @Override // com.tencent.mm.ui.widget.cropview.TouchEventLayout, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent e27, float f17, float f18) {
        kotlin.jvm.internal.o.g(e27, "e2");
        this.f449756u.postTranslate(0.0f, -f18);
        m();
        k();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0027, code lost:
    
        if (r2 != 3) goto L24;
     */
    @Override // com.tencent.mm.ui.widget.cropview.TouchEventLayout, android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wu3.h.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // zu3.n
    public av3.a p(android.graphics.Matrix matrix) {
        return null;
    }

    public final void q(zu3.d captionItem) {
        kotlin.jvm.internal.o.g(captionItem, "captionItem");
        this.f449749n = captionItem;
        if (captionItem.f475793h != 0) {
            getCaptionView().setTextColor(captionItem.f475793h);
        }
        getCaptionView().setTextBackground(captionItem.f475794i);
        if (android.text.TextUtils.isEmpty(captionItem.f475795j)) {
            getCaptionView().setTypeface(getCaptionView().getTypeface(), 1);
        } else if (com.tencent.mm.vfs.w6.j(captionItem.f475795j)) {
            getCaptionView().setTypeface(android.graphics.Typeface.createFromFile(captionItem.f475795j));
        } else {
            getCaptionView().setTypeface(android.graphics.Typeface.DEFAULT);
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptionItemView", "updateCaptionItem caption:" + captionItem, null);
    }

    public final void setCaptionItem(zu3.d captionItem) {
        kotlin.jvm.internal.o.g(captionItem, "captionItem");
        this.f449749n = captionItem;
        getCaptionLayout().measure(0, 0);
        this.f449750o.f24925o = getCaptionLayout().getMeasuredHeight();
        this.f449754s.bottom = getCaptionLayout().getMeasuredHeight();
        k();
        if (captionItem.f475793h != 0) {
            getCaptionView().setTextColor(captionItem.f475793h);
        }
        getCaptionView().setTextBackground(captionItem.f475794i);
        if (android.text.TextUtils.isEmpty(captionItem.f475795j)) {
            getCaptionView().setTypeface(getCaptionView().getTypeface(), 1);
        } else if (com.tencent.mm.vfs.w6.j(captionItem.f475795j)) {
            getCaptionView().setTypeface(android.graphics.Typeface.createFromFile(captionItem.f475795j));
        } else {
            getCaptionView().setTypeface(android.graphics.Typeface.DEFAULT);
        }
        java.lang.String str = "height:" + getCaptionView().getMeasuredHeight() + " caption:" + captionItem;
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.CaptionItemView", str, null);
    }

    public final void setClearCaptionListener(yz5.l lVar) {
        this.H = lVar;
    }

    public final void setEnableEdit(boolean z17) {
        this.I = z17;
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }

    public final void setStateResolve(zu3.f stateResolve) {
        kotlin.jvm.internal.o.g(stateResolve, "stateResolve");
        this.f449753r = stateResolve;
    }

    @Override // cw3.s
    public void setValidArea(android.graphics.Rect validRect) {
        kotlin.jvm.internal.o.g(validRect, "validRect");
        this.f449751p.set(validRect);
        m();
        k();
        android.view.View view = this.E;
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        int i17 = marginLayoutParams.topMargin;
        int i18 = validRect.bottom;
        int i19 = this.F;
        if (i17 != i18 - i19) {
            marginLayoutParams.topMargin = i18 - i19;
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
