package dj0;

/* loaded from: classes14.dex */
public class r extends dj0.w {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f232869h;

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.reflect.Method f232870i;

    /* renamed from: j, reason: collision with root package name */
    public static java.lang.Class f232871j;

    /* renamed from: k, reason: collision with root package name */
    public static java.lang.Class f232872k;

    /* renamed from: l, reason: collision with root package name */
    public static java.lang.reflect.Field f232873l;

    /* renamed from: m, reason: collision with root package name */
    public static java.lang.reflect.Field f232874m;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.WindowInsets f232875c;

    /* renamed from: d, reason: collision with root package name */
    public dj0.l[] f232876d;

    /* renamed from: e, reason: collision with root package name */
    public dj0.l f232877e;

    /* renamed from: f, reason: collision with root package name */
    public dj0.x f232878f;

    /* renamed from: g, reason: collision with root package name */
    public dj0.l f232879g;

    public r(dj0.x xVar, android.view.WindowInsets windowInsets) {
        super(xVar);
        this.f232877e = null;
        this.f232875c = windowInsets;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    @Override // dj0.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.view.View r6) {
        /*
            r5 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto L8a
            boolean r0 = dj0.r.f232869h
            r1 = 0
            if (r0 != 0) goto L4b
            r0 = 1
            java.lang.Class<android.view.View> r2 = android.view.View.class
            java.lang.String r3 = "getViewRootImpl"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.ReflectiveOperationException -> L45
            dj0.r.f232870i = r2     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.String r2 = "android.view.ViewRootImpl"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ReflectiveOperationException -> L45
            dj0.r.f232871j = r2     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.String r2 = "android.view.View$AttachInfo"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.ReflectiveOperationException -> L45
            dj0.r.f232872k = r2     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.String r3 = "mVisibleInsets"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.ReflectiveOperationException -> L45
            dj0.r.f232873l = r2     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.Class r2 = dj0.r.f232871j     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.String r3 = "mAttachInfo"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.ReflectiveOperationException -> L45
            dj0.r.f232874m = r2     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.reflect.Field r2 = dj0.r.f232873l     // Catch: java.lang.ReflectiveOperationException -> L45
            r2.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L45
            java.lang.reflect.Field r2 = dj0.r.f232874m     // Catch: java.lang.ReflectiveOperationException -> L45
            r2.setAccessible(r0)     // Catch: java.lang.ReflectiveOperationException -> L45
            goto L49
        L45:
            r2 = move-exception
            r2.getMessage()
        L49:
            dj0.r.f232869h = r0
        L4b:
            java.lang.reflect.Method r0 = dj0.r.f232870i
            if (r0 == 0) goto L82
            java.lang.Class r2 = dj0.r.f232872k
            if (r2 == 0) goto L82
            java.lang.reflect.Field r2 = dj0.r.f232873l
            if (r2 != 0) goto L58
            goto L82
        L58:
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.ReflectiveOperationException -> L7e
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: java.lang.ReflectiveOperationException -> L7e
            if (r6 != 0) goto L61
            goto L82
        L61:
            java.lang.reflect.Field r0 = dj0.r.f232874m     // Catch: java.lang.ReflectiveOperationException -> L7e
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.ReflectiveOperationException -> L7e
            java.lang.reflect.Field r0 = dj0.r.f232873l     // Catch: java.lang.ReflectiveOperationException -> L7e
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.ReflectiveOperationException -> L7e
            android.graphics.Rect r6 = (android.graphics.Rect) r6     // Catch: java.lang.ReflectiveOperationException -> L7e
            if (r6 == 0) goto L82
            int r0 = r6.left     // Catch: java.lang.ReflectiveOperationException -> L7e
            int r1 = r6.top     // Catch: java.lang.ReflectiveOperationException -> L7e
            int r2 = r6.right     // Catch: java.lang.ReflectiveOperationException -> L7e
            int r6 = r6.bottom     // Catch: java.lang.ReflectiveOperationException -> L7e
            dj0.l r6 = dj0.l.a(r0, r1, r2, r6)     // Catch: java.lang.ReflectiveOperationException -> L7e
            goto L83
        L7e:
            r6 = move-exception
            r6.getMessage()
        L82:
            r6 = 0
        L83:
            if (r6 != 0) goto L87
            dj0.l r6 = dj0.l.f232857e
        L87:
            r5.f232879g = r6
            return
        L8a:
            java.lang.UnsupportedOperationException r6 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dj0.r.d(android.view.View):void");
    }

    @Override // dj0.w
    public void e(dj0.x xVar) {
        xVar.f232887a.p(this.f232878f);
        xVar.f232887a.o(this.f232879g);
    }

    @Override // dj0.w
    public boolean equals(java.lang.Object obj) {
        if (super.equals(obj)) {
            return java.util.Objects.equals(this.f232879g, ((dj0.r) obj).f232879g);
        }
        return false;
    }

    @Override // dj0.w
    public dj0.l f(int i17) {
        dj0.l a17;
        dj0.l h17;
        int i18;
        dj0.l lVar = dj0.l.f232857e;
        dj0.l lVar2 = lVar;
        for (int i19 = 1; i19 <= 256; i19 <<= 1) {
            if ((i17 & i19) != 0) {
                if (i19 == 1) {
                    a17 = dj0.l.a(0, j().f232859b, 0, 0);
                } else if (i19 == 2) {
                    dj0.l j17 = j();
                    dj0.x xVar = this.f232878f;
                    h17 = xVar != null ? xVar.f232887a.h() : null;
                    int i27 = j17.f232861d;
                    if (h17 != null) {
                        i27 = java.lang.Math.min(i27, h17.f232861d);
                    }
                    a17 = dj0.l.a(j17.f232858a, 0, j17.f232860c, i27);
                } else if (i19 == 8) {
                    dj0.l[] lVarArr = this.f232876d;
                    h17 = lVarArr != null ? lVarArr[3] : null;
                    if (h17 != null) {
                        a17 = h17;
                    } else {
                        dj0.l j18 = j();
                        dj0.x xVar2 = this.f232878f;
                        dj0.l h18 = xVar2 != null ? xVar2.f232887a.h() : lVar;
                        int i28 = j18.f232861d;
                        if (i28 > h18.f232861d) {
                            a17 = dj0.l.a(0, 0, 0, i28);
                        } else {
                            dj0.l lVar3 = this.f232879g;
                            if (lVar3 != null && !lVar3.equals(lVar) && (i18 = this.f232879g.f232861d) > h18.f232861d) {
                                a17 = dj0.l.a(0, 0, 0, i18);
                            }
                            a17 = lVar;
                        }
                    }
                } else if (i19 == 16) {
                    a17 = i();
                } else if (i19 != 32) {
                    if (i19 == 64) {
                        a17 = k();
                    }
                    a17 = lVar;
                } else {
                    a17 = g();
                }
                lVar2 = dj0.l.a(java.lang.Math.max(lVar2.f232858a, a17.f232858a), java.lang.Math.max(lVar2.f232859b, a17.f232859b), java.lang.Math.max(lVar2.f232860c, a17.f232860c), java.lang.Math.max(lVar2.f232861d, a17.f232861d));
            }
        }
        return lVar2;
    }

    @Override // dj0.w
    public final dj0.l j() {
        if (this.f232877e == null) {
            android.view.WindowInsets windowInsets = this.f232875c;
            this.f232877e = dj0.l.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f232877e;
    }

    @Override // dj0.w
    public boolean m() {
        return this.f232875c.isRound();
    }

    @Override // dj0.w
    public void n(dj0.l[] lVarArr) {
        this.f232876d = lVarArr;
    }

    @Override // dj0.w
    public void o(dj0.l lVar) {
        this.f232879g = lVar;
    }

    @Override // dj0.w
    public void p(dj0.x xVar) {
        this.f232878f = xVar;
    }

    public r(dj0.x xVar, dj0.r rVar) {
        this(xVar, new android.view.WindowInsets(rVar.f232875c));
    }
}
