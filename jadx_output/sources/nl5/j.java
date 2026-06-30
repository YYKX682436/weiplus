package nl5;

/* loaded from: classes15.dex */
public final class j extends android.view.View {
    public static final /* synthetic */ int A = 0;

    /* renamed from: d, reason: collision with root package name */
    public final nl5.s0 f338294d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.PopupWindow f338295e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Paint f338296f;

    /* renamed from: g, reason: collision with root package name */
    public final int f338297g;

    /* renamed from: h, reason: collision with root package name */
    public final int f338298h;

    /* renamed from: i, reason: collision with root package name */
    public final int f338299i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Path f338300m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Point f338301n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Point f338302o;

    /* renamed from: p, reason: collision with root package name */
    public android.graphics.Point f338303p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Point f338304q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f338305r;

    /* renamed from: s, reason: collision with root package name */
    public int f338306s;

    /* renamed from: t, reason: collision with root package name */
    public int f338307t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f338308u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f338309v;

    /* renamed from: w, reason: collision with root package name */
    public int f338310w;

    /* renamed from: x, reason: collision with root package name */
    public int f338311x;

    /* renamed from: y, reason: collision with root package name */
    public final int f338312y;

    /* renamed from: z, reason: collision with root package name */
    public final int f338313z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(nl5.s0 helper, android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f338294d = helper;
        int i17 = helper.f338371v / 2;
        this.f338297g = i17;
        int i18 = i17 * 2;
        this.f338298h = i18;
        int a17 = com.tencent.mm.ui.zk.a(helper.f338356g, 9);
        this.f338299i = a17;
        this.f338300m = new android.graphics.Path();
        this.f338301n = new android.graphics.Point(i17, 0);
        double d17 = 1;
        double d18 = 2;
        double d19 = i17;
        this.f338302o = new android.graphics.Point((int) ((d17 - (java.lang.Math.sqrt(2.0d) / d18)) * d19), (int) ((java.lang.Math.sqrt(2.0d) / d18) * d19));
        this.f338303p = new android.graphics.Point((int) ((d17 + (java.lang.Math.sqrt(2.0d) / d18)) * d19), (int) ((java.lang.Math.sqrt(2.0d) / d18) * d19));
        this.f338304q = new android.graphics.Point(i17, (int) (java.lang.Math.sqrt(2.0d) * d19));
        nl5.i iVar = new nl5.i(this);
        this.f338308u = new int[2];
        this.f338309v = new int[2];
        this.f338312y = 1;
        this.f338313z = 2;
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f338296f = paint;
        paint.setColor(helper.f338370u);
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow(this);
        this.f338295e = popupWindow;
        popupWindow.setClippingEnabled(false);
        popupWindow.setWidth(i18 + (a17 * 2));
        popupWindow.setHeight(i18 + (a17 / 2));
        invalidate();
        setOnClickListener(iVar);
    }

    private final void setVisible(boolean z17) {
        android.view.View contentView = this.f338295e.getContentView();
        int i17 = z17 ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/ui/widget/edittext/InsertHandle", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(contentView, "com/tencent/mm/ui/widget/edittext/InsertHandle", "setVisible", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void a(int i17, int i18) {
        this.f338306s = i17;
        this.f338307t = i18;
        com.tencent.mm.ui.yk.a("EditHelper.InsertHandle", "showOrUpdate() called with: x = " + i17 + ", y = " + i18, new java.lang.Object[0]);
        android.widget.PopupWindow popupWindow = this.f338295e;
        if (popupWindow.isShowing()) {
            popupWindow.update(i17, i18, -1, -1);
            return;
        }
        nl5.s0 s0Var = this.f338294d;
        popupWindow.showAtLocation(s0Var.f338357h, 0, i17, i18);
        android.widget.TextView textView = s0Var.f338357h;
        kotlin.jvm.internal.o.g(textView, "textView");
        try {
            java.lang.reflect.Field declaredField = android.widget.TextView.class.getDeclaredField("mEditor");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(textView);
            if (obj == null) {
                return;
            }
            java.lang.Class<?> cls = java.lang.Class.forName("android.widget.Editor");
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                java.lang.reflect.Method declaredMethod = cls.getDeclaredMethod("suspendBlink", new java.lang.Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(obj, new java.lang.Object[0]);
                return;
            }
            java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mBlink");
            declaredField2.setAccessible(true);
            java.lang.Object obj2 = declaredField2.get(obj);
            java.lang.Runnable runnable = obj2 instanceof java.lang.Runnable ? (java.lang.Runnable) obj2 : null;
            if (runnable != null) {
                textView.removeCallbacks(runnable);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.ui.yk.b("SelectableEditTextHelper", "suspendBlink err:%s", th6.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b1  */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v56 */
    /* JADX WARN: Type inference failed for: r5v61 */
    /* JADX WARN: Type inference failed for: r5v62 */
    /* JADX WARN: Type inference failed for: r5v63 */
    /* JADX WARN: Type inference failed for: r5v66 */
    /* JADX WARN: Type inference failed for: r5v67 */
    /* JADX WARN: Type inference failed for: r5v70 */
    /* JADX WARN: Type inference failed for: r5v71 */
    /* JADX WARN: Type inference failed for: r5v77 */
    /* JADX WARN: Type inference failed for: r5v78 */
    /* JADX WARN: Type inference failed for: r5v79 */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl5.j.b(android.view.MotionEvent):void");
    }

    public final int getExtraX() {
        return (this.f338308u[0] - this.f338299i) + this.f338294d.f338357h.getPaddingLeft() + 2;
    }

    public final int getExtraY() {
        int i17 = this.f338308u[1];
        nl5.s0 s0Var = this.f338294d;
        return (i17 + s0Var.f338357h.getPaddingTop()) - s0Var.f338357h.getScrollY();
    }

    public final int getINSERTION() {
        return 0;
    }

    public final android.graphics.Path getMPath() {
        return this.f338300m;
    }

    public final android.graphics.Point getMPointR() {
        return this.f338304q;
    }

    public final android.graphics.Point getMPointT1() {
        return this.f338301n;
    }

    public final android.graphics.Point getMPointT2() {
        return this.f338302o;
    }

    public final android.graphics.Point getMPointT3() {
        return this.f338303p;
    }

    public final android.widget.PopupWindow getMWindow() {
        return this.f338295e;
    }

    public final int getMagnifierHandleTrigger() {
        return 0;
    }

    public final int getSELECTION_END() {
        return this.f338313z;
    }

    public final int getSELECTION_START() {
        return this.f338312y;
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        this.f338300m.reset();
        android.graphics.Path path = this.f338300m;
        android.graphics.Point point = this.f338301n;
        path.moveTo(point.x, point.y);
        android.graphics.Path path2 = this.f338300m;
        android.graphics.Point point2 = this.f338302o;
        path2.lineTo(point2.x, point2.y);
        android.graphics.Path path3 = this.f338300m;
        android.graphics.Point point3 = this.f338303p;
        path3.lineTo(point3.x, point3.y);
        android.graphics.Path path4 = this.f338300m;
        android.graphics.Point point4 = this.f338301n;
        path4.lineTo(point4.x, point4.y);
        android.graphics.Path path5 = this.f338300m;
        android.graphics.Paint paint = this.f338296f;
        canvas.drawPath(path5, paint);
        android.graphics.Point point5 = this.f338304q;
        canvas.drawCircle(point5.x, point5.y, this.f338297g, paint);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        if (r1 != 3) goto L51;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nl5.j.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setMPath(android.graphics.Path path) {
        kotlin.jvm.internal.o.g(path, "<set-?>");
        this.f338300m = path;
    }

    public final void setMPointR(android.graphics.Point point) {
        kotlin.jvm.internal.o.g(point, "<set-?>");
        this.f338304q = point;
    }

    public final void setMPointT1(android.graphics.Point point) {
        kotlin.jvm.internal.o.g(point, "<set-?>");
        this.f338301n = point;
    }

    public final void setMPointT2(android.graphics.Point point) {
        kotlin.jvm.internal.o.g(point, "<set-?>");
        this.f338302o = point;
    }

    public final void setMPointT3(android.graphics.Point point) {
        kotlin.jvm.internal.o.g(point, "<set-?>");
        this.f338303p = point;
    }

    public final void setMoving(boolean z17) {
        this.f338305r = z17;
    }
}
