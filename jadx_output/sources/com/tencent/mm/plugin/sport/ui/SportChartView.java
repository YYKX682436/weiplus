package com.tencent.mm.plugin.sport.ui;

/* loaded from: classes13.dex */
public class SportChartView extends android.view.View {
    public final float A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final android.graphics.Typeface f171833J;
    public int K;
    public boolean L;
    public int M;
    public int N;
    public final we4.d P;
    public final int Q;
    public we4.e[] R;
    public android.graphics.Paint S;
    public android.graphics.Path T;
    public android.graphics.Path U;
    public int V;
    public int W;

    /* renamed from: d, reason: collision with root package name */
    public final java.text.SimpleDateFormat f171834d;

    /* renamed from: e, reason: collision with root package name */
    public final java.text.SimpleDateFormat f171835e;

    /* renamed from: f, reason: collision with root package name */
    public final int f171836f;

    /* renamed from: g, reason: collision with root package name */
    public final int f171837g;

    /* renamed from: h, reason: collision with root package name */
    public final int f171838h;

    /* renamed from: i, reason: collision with root package name */
    public int f171839i;

    /* renamed from: l1, reason: collision with root package name */
    public android.view.GestureDetector f171840l1;

    /* renamed from: m, reason: collision with root package name */
    public int f171841m;

    /* renamed from: n, reason: collision with root package name */
    public int f171842n;

    /* renamed from: o, reason: collision with root package name */
    public final int f171843o;

    /* renamed from: p, reason: collision with root package name */
    public final int f171844p;

    /* renamed from: p0, reason: collision with root package name */
    public int f171845p0;

    /* renamed from: p1, reason: collision with root package name */
    public final android.view.GestureDetector.OnGestureListener f171846p1;

    /* renamed from: q, reason: collision with root package name */
    public final int f171847q;

    /* renamed from: r, reason: collision with root package name */
    public final int f171848r;

    /* renamed from: s, reason: collision with root package name */
    public final int f171849s;

    /* renamed from: t, reason: collision with root package name */
    public final int f171850t;

    /* renamed from: u, reason: collision with root package name */
    public final int f171851u;

    /* renamed from: v, reason: collision with root package name */
    public final int f171852v;

    /* renamed from: w, reason: collision with root package name */
    public final int f171853w;

    /* renamed from: x, reason: collision with root package name */
    public final int f171854x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f171855x0;

    /* renamed from: y, reason: collision with root package name */
    public final int f171856y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f171857y0;

    /* renamed from: z, reason: collision with root package name */
    public final float f171858z;

    public SportChartView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f171834d = new java.text.SimpleDateFormat(getResources().getString(com.tencent.mm.R.string.jjl));
        this.f171835e = new java.text.SimpleDateFormat("d");
        this.f171836f = getResources().getColor(com.tencent.mm.R.color.a6t);
        this.f171837g = getResources().getColor(com.tencent.mm.R.color.a6u);
        this.f171838h = getResources().getColor(com.tencent.mm.R.color.a6u);
        this.f171839i = Integer.MAX_VALUE;
        this.f171841m = 0;
        this.f171842n = 0;
        this.f171843o = (int) c(1, 2.5f);
        this.f171844p = (int) c(1, 4.0f);
        this.f171847q = (int) c(1, 1.8f);
        this.f171848r = (int) c(1, 1.0f);
        this.f171849s = (int) c(1, 8.0f);
        this.f171850t = (int) c(1, 22.0f);
        this.f171851u = (int) c(1, 67.0f);
        this.f171852v = (int) c(1, 40.0f);
        this.f171853w = (int) c(1, 22.0f);
        c(1, 55.0f);
        this.f171854x = (int) c(1, 35.0f);
        this.f171856y = (int) c(1, 45.0f);
        this.f171858z = (int) c(1, 8.0f);
        this.A = (int) c(1, 8.0f);
        this.B = (int) c(1, 2.0f);
        this.C = (int) c(1, 15.0f);
        this.D = (int) c(1, 33.0f);
        this.E = (int) c(1, 8.0f);
        this.F = (int) c(1, 35.0f);
        this.G = (int) c(1, 10.0f);
        this.H = (int) c(1, 58.0f);
        c(1, 1.0f);
        this.I = 0;
        this.f171833J = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT_BOLD, 0);
        android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT_BOLD, 1);
        this.K = 0;
        this.M = -1;
        this.N = -1;
        this.P = we4.d.WEEK;
        this.Q = 7;
        this.R = new we4.e[7];
        this.f171846p1 = new we4.c(this);
        d();
    }

    public static void a(com.tencent.mm.plugin.sport.ui.SportChartView sportChartView, boolean z17) {
        sportChartView.f171839i = Integer.MAX_VALUE;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        int i17 = sportChartView.Q;
        sportChartView.R = new we4.e[i17];
        int i18 = 0;
        while (true) {
            we4.e[] eVarArr = sportChartView.R;
            if (i18 >= eVarArr.length) {
                break;
            }
            eVarArr[i18] = new we4.e(sportChartView, null);
            i18++;
        }
        sportChartView.L = true;
        calendar.add(5, -i17);
        for (int i19 = 0; i19 < sportChartView.R.length; i19++) {
            calendar.add(5, 1);
            sportChartView.R[i19].f445293a = calendar.getTimeInMillis();
            sportChartView.R[i19].f445294b = 0;
        }
    }

    public final void b(android.graphics.Canvas canvas, boolean z17) {
        int i17 = 0;
        if (z17) {
            this.U.reset();
            android.graphics.Path path = this.U;
            we4.e eVar = this.R[0];
            path.moveTo(eVar.f445295c, eVar.f445296d);
            int i18 = 0;
            while (true) {
                we4.e[] eVarArr = this.R;
                if (i18 >= eVarArr.length) {
                    android.graphics.Path path2 = this.U;
                    float f17 = eVarArr[eVarArr.length - 1].f445295c;
                    int i19 = this.f171842n;
                    int i27 = this.f171854x;
                    path2.lineTo(f17, (i19 - i27) - 1);
                    android.graphics.Path path3 = this.U;
                    int i28 = this.f171849s;
                    path3.lineTo(i28, (this.f171842n - i27) - 1);
                    this.U.lineTo(i28, this.R[0].f445296d);
                    canvas.drawPath(this.U, this.S);
                    return;
                }
                android.graphics.Path path4 = this.U;
                we4.e eVar2 = eVarArr[i18];
                path4.lineTo(eVar2.f445295c, eVar2.f445296d);
                i18++;
            }
        } else {
            this.U.reset();
            android.graphics.Path path5 = this.U;
            we4.e eVar3 = this.R[0];
            path5.moveTo(eVar3.f445295c, eVar3.f445296d);
            while (true) {
                we4.e[] eVarArr2 = this.R;
                if (i17 >= eVarArr2.length) {
                    return;
                }
                if (i17 <= 0) {
                    e();
                } else if (eVarArr2[i17 - 1].f445296d == this.f171842n - this.f171852v) {
                    this.S.reset();
                    this.S.setPathEffect(new android.graphics.DashPathEffect(new float[]{5.0f, 5.0f}, 0.0f));
                    this.S.setAntiAlias(true);
                    this.S.setStrokeWidth(this.f171847q);
                    this.S.setStyle(android.graphics.Paint.Style.STROKE);
                    this.S.setColor(-1);
                } else {
                    e();
                }
                android.graphics.Path path6 = this.U;
                we4.e eVar4 = this.R[i17];
                path6.lineTo(eVar4.f445295c, eVar4.f445296d);
                canvas.drawPath(this.U, this.S);
                this.U.reset();
                android.graphics.Path path7 = this.U;
                we4.e eVar5 = this.R[i17];
                path7.moveTo(eVar5.f445295c, eVar5.f445296d);
                i17++;
            }
        }
    }

    public float c(int i17, float f17) {
        android.content.Context context = getContext();
        return android.util.TypedValue.applyDimension(i17, f17, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics());
    }

    public final void d() {
        this.S = new android.graphics.Paint();
        this.T = new android.graphics.Path();
        this.U = new android.graphics.Path();
        int i17 = this.Q;
        this.R = new we4.e[i17];
        int i18 = 0;
        while (true) {
            we4.e[] eVarArr = this.R;
            if (i18 >= eVarArr.length) {
                break;
            }
            eVarArr[i18] = new we4.e(this, null);
            i18++;
        }
        for (int i19 = 0; i19 < i17; i19++) {
            if (i19 == i17 - 1) {
                this.R[i19].f445297e = true;
            } else {
                this.R[i19].f445297e = false;
            }
        }
        this.f171840l1 = new android.view.GestureDetector(getContext(), this.f171846p1);
    }

    public final void e() {
        this.S.reset();
        this.S.setAntiAlias(true);
        this.S.setStrokeWidth(this.f171847q);
        this.S.setStyle(android.graphics.Paint.Style.STROKE);
        this.S.setColor(-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02dd  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.sport.ui.SportChartView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f171840l1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/sport/ui/SportChartView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/sport/ui/SportChartView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    public void setHasSwitchBtn(boolean z17) {
        this.f171857y0 = z17;
    }

    public void setTodayStep(int i17) {
        this.V = i17;
    }

    public SportChartView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f171834d = new java.text.SimpleDateFormat(getResources().getString(com.tencent.mm.R.string.jjl));
        this.f171835e = new java.text.SimpleDateFormat("d");
        this.f171836f = getResources().getColor(com.tencent.mm.R.color.a6t);
        this.f171837g = getResources().getColor(com.tencent.mm.R.color.a6u);
        this.f171838h = getResources().getColor(com.tencent.mm.R.color.a6u);
        this.f171839i = Integer.MAX_VALUE;
        this.f171841m = 0;
        this.f171842n = 0;
        this.f171843o = (int) c(1, 2.5f);
        this.f171844p = (int) c(1, 4.0f);
        this.f171847q = (int) c(1, 1.8f);
        this.f171848r = (int) c(1, 1.0f);
        this.f171849s = (int) c(1, 8.0f);
        this.f171850t = (int) c(1, 22.0f);
        this.f171851u = (int) c(1, 67.0f);
        this.f171852v = (int) c(1, 40.0f);
        this.f171853w = (int) c(1, 22.0f);
        c(1, 55.0f);
        this.f171854x = (int) c(1, 35.0f);
        this.f171856y = (int) c(1, 45.0f);
        this.f171858z = (int) c(1, 8.0f);
        this.A = (int) c(1, 8.0f);
        this.B = (int) c(1, 2.0f);
        this.C = (int) c(1, 15.0f);
        this.D = (int) c(1, 33.0f);
        this.E = (int) c(1, 8.0f);
        this.F = (int) c(1, 35.0f);
        this.G = (int) c(1, 10.0f);
        this.H = (int) c(1, 58.0f);
        c(1, 1.0f);
        this.I = 0;
        this.f171833J = android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT_BOLD, 0);
        android.graphics.Typeface.create(android.graphics.Typeface.DEFAULT_BOLD, 1);
        this.K = 0;
        this.M = -1;
        this.N = -1;
        this.P = we4.d.WEEK;
        this.Q = 7;
        this.R = new we4.e[7];
        this.f171846p1 = new we4.c(this);
        d();
    }
}
