package z26;

/* loaded from: classes15.dex */
public class l {

    /* renamed from: w, reason: collision with root package name */
    public static final android.view.animation.Interpolator f469834w = new z26.i();

    /* renamed from: a, reason: collision with root package name */
    public int f469835a;

    /* renamed from: b, reason: collision with root package name */
    public final int f469836b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f469838d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f469839e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f469840f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f469841g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f469842h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f469843i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f469844j;

    /* renamed from: k, reason: collision with root package name */
    public int f469845k;

    /* renamed from: l, reason: collision with root package name */
    public android.view.VelocityTracker f469846l;

    /* renamed from: m, reason: collision with root package name */
    public float f469847m;

    /* renamed from: n, reason: collision with root package name */
    public float f469848n;

    /* renamed from: o, reason: collision with root package name */
    public int f469849o;

    /* renamed from: p, reason: collision with root package name */
    public int f469850p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.core.widget.s f469851q;

    /* renamed from: r, reason: collision with root package name */
    public final z26.k f469852r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f469853s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f469854t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.ViewGroup f469855u;

    /* renamed from: c, reason: collision with root package name */
    public int f469837c = -1;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Runnable f469856v = new z26.j(this);

    public l(android.content.Context context, android.view.ViewGroup viewGroup, z26.k kVar) {
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("Parent view may not be null");
        }
        if (kVar == null) {
            throw new java.lang.IllegalArgumentException("Callback may not be null");
        }
        this.f469855u = viewGroup;
        this.f469852r = kVar;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f469849o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f469836b = viewConfiguration.getScaledTouchSlop();
        this.f469847m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f469848n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f469851q = new androidx.core.widget.s(context, f469834w);
    }

    public void a() {
        this.f469837c = -1;
        float[] fArr = this.f469838d;
        if (fArr != null) {
            java.util.Arrays.fill(fArr, 0.0f);
            java.util.Arrays.fill(this.f469839e, 0.0f);
            java.util.Arrays.fill(this.f469840f, 0.0f);
            java.util.Arrays.fill(this.f469841g, 0.0f);
            java.util.Arrays.fill(this.f469842h, 0);
            java.util.Arrays.fill(this.f469843i, 0);
            java.util.Arrays.fill(this.f469844j, 0);
            this.f469845k = 0;
        }
        android.view.VelocityTracker velocityTracker = this.f469846l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f469846l = null;
        }
    }

    public final boolean b(float f17, float f18, int i17, int i18) {
        float abs = java.lang.Math.abs(f17);
        float abs2 = java.lang.Math.abs(f18);
        if ((this.f469842h[i17] & i18) != i18 || (this.f469850p & i18) == 0 || (this.f469844j[i17] & i18) == i18 || (this.f469843i[i17] & i18) == i18) {
            return false;
        }
        int i19 = this.f469836b;
        if (abs <= i19 && abs2 <= i19) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f469852r.getClass();
        }
        return (this.f469843i[i17] & i18) == 0 && abs > ((float) i19);
    }

    public boolean c(int i17, int i18) {
        if (!((this.f469845k & (1 << i18)) != 0)) {
            return false;
        }
        boolean z17 = (i17 & 1) == 1;
        boolean z18 = (i17 & 2) == 2;
        float f17 = this.f469840f[i18] - this.f469838d[i18];
        float f18 = this.f469841g[i18] - this.f469839e[i18];
        int i19 = this.f469836b;
        return (z17 && z18) ? (f17 * f17) + (f18 * f18) > ((float) (i19 * i19)) : z17 ? java.lang.Math.abs(f17) > ((float) i19) : z18 && java.lang.Math.abs(f18) > ((float) i19);
    }

    public final boolean d(android.view.View view, float f17, float f18) {
        if (view == null) {
            return false;
        }
        z26.k kVar = this.f469852r;
        boolean z17 = (((z26.g) kVar).f469832b.f325885d & 3) > 0;
        boolean z18 = (((z26.g) kVar).f469832b.f325885d & 8) > 0;
        int i17 = this.f469836b;
        if (z17 && z18) {
            return (f17 * f17) + (f18 * f18) > ((float) (i17 * i17));
        }
        if (!z17) {
            return z18 && java.lang.Math.abs(f18) > ((float) i17);
        }
        float abs = java.lang.Math.abs(f17);
        return this.f469849o > 20 ? abs > ((float) i17) && java.lang.Math.abs(f18) * 2.19f < abs : abs > ((float) i17);
    }

    public final void e(int i17) {
        float[] fArr = this.f469838d;
        if (fArr == null) {
            return;
        }
        fArr[i17] = 0.0f;
        this.f469839e[i17] = 0.0f;
        this.f469840f[i17] = 0.0f;
        this.f469841g[i17] = 0.0f;
        this.f469842h[i17] = 0;
        this.f469843i[i17] = 0;
        this.f469844j[i17] = 0;
        this.f469845k = (~(1 << i17)) & this.f469845k;
    }

    public final int f(int i17, int i18, int i19) {
        if (i17 == 0) {
            return 0;
        }
        float width = this.f469855u.getWidth() / 2;
        float sin = width + (((float) java.lang.Math.sin((float) ((java.lang.Math.min(1.0f, java.lang.Math.abs(i17) / r0) - 0.5f) * 0.4712389167638204d))) * width);
        int abs = java.lang.Math.abs(i18);
        return java.lang.Math.min(abs > 0 ? java.lang.Math.round(java.lang.Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((java.lang.Math.abs(i17) / i19) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(float r19, float r20) {
        /*
            Method dump skipped, instructions count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z26.l.g(float, float):void");
    }

    public android.view.View h(int i17, int i18) {
        android.view.ViewGroup viewGroup = this.f469855u;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f469852r.getClass();
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if (i17 >= childAt.getLeft() && i17 < childAt.getRight() && i18 >= childAt.getTop() && i18 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public boolean i(int i17, int i18) {
        return ((this.f469845k & (1 << i18)) != 0) && (i17 & this.f469842h[i18]) != 0;
    }

    public void j(android.view.MotionEvent motionEvent) {
        int i17;
        int i18;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f469846l == null) {
            this.f469846l = android.view.VelocityTracker.obtain();
        }
        this.f469846l.addMovement(motionEvent);
        z26.k kVar = this.f469852r;
        if (actionMasked == 0) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            android.view.View h17 = h((int) x17, (int) y17);
            m(x17, y17, pointerId);
            q(h17, pointerId);
            if ((this.f469842h[pointerId] & this.f469850p) != 0) {
                kVar.getClass();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f469835a == 1) {
                k();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f469835a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (r5 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(r5);
                    float x18 = motionEvent.getX(r5);
                    float y18 = motionEvent.getY(r5);
                    float f17 = x18 - this.f469838d[pointerId2];
                    float f18 = y18 - this.f469839e[pointerId2];
                    l(f17, f18, pointerId2);
                    if (this.f469835a != 1) {
                        android.view.View h18 = h((int) x18, (int) y18);
                        if (d(h18, f17, f18) && q(h18, pointerId2)) {
                            break;
                        } else {
                            r5++;
                        }
                    } else {
                        break;
                    }
                }
                n(motionEvent);
                return;
            }
            int findPointerIndex = motionEvent.findPointerIndex(this.f469837c);
            float x19 = motionEvent.getX(findPointerIndex);
            float y19 = motionEvent.getY(findPointerIndex);
            float[] fArr = this.f469840f;
            int i19 = this.f469837c;
            int i27 = (int) (x19 - fArr[i19]);
            int i28 = (int) (y19 - this.f469841g[i19]);
            int left = this.f469853s.getLeft() + i27;
            int top = this.f469853s.getTop() + i28;
            int left2 = this.f469853s.getLeft();
            int top2 = this.f469853s.getTop();
            if (i27 != 0) {
                android.view.View view = this.f469853s;
                int i29 = ((z26.g) kVar).f469832b.f325902x;
                left = (i29 & 1) != 0 ? java.lang.Math.min(view.getWidth(), java.lang.Math.max(left, 0)) : (2 & i29) != 0 ? java.lang.Math.min(0, java.lang.Math.max(left, -view.getWidth())) : 0;
                this.f469853s.offsetLeftAndRight(left - left2);
            }
            int i37 = left;
            if (i28 != 0) {
                r5 = (((z26.g) kVar).f469832b.f325902x & 8) != 0 ? java.lang.Math.min(0, java.lang.Math.max(top, -this.f469853s.getHeight())) : 0;
                this.f469853s.offsetTopAndBottom(r5 - top2);
                i17 = r5;
            } else {
                i17 = top;
            }
            if (i27 != 0 || i28 != 0) {
                this.f469852r.a(this.f469853s, i37, i17, i37 - left2, i17 - top2);
            }
            n(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f469835a == 1) {
                g(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked != 5) {
            if (actionMasked != 6) {
                return;
            }
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            if (this.f469835a == 1 && pointerId3 == this.f469837c) {
                int pointerCount2 = motionEvent.getPointerCount();
                while (true) {
                    if (r5 >= pointerCount2) {
                        i18 = -1;
                        break;
                    }
                    int pointerId4 = motionEvent.getPointerId(r5);
                    if (pointerId4 != this.f469837c) {
                        android.view.View h19 = h((int) motionEvent.getX(r5), (int) motionEvent.getY(r5));
                        android.view.View view2 = this.f469853s;
                        if (h19 == view2 && q(view2, pointerId4)) {
                            i18 = this.f469837c;
                            break;
                        }
                    }
                    r5++;
                }
                if (i18 == -1) {
                    k();
                }
            }
            e(pointerId3);
            return;
        }
        int pointerId5 = motionEvent.getPointerId(actionIndex);
        float x27 = motionEvent.getX(actionIndex);
        float y27 = motionEvent.getY(actionIndex);
        m(x27, y27, pointerId5);
        if (this.f469835a == 0) {
            q(h((int) x27, (int) y27), pointerId5);
            if ((this.f469842h[pointerId5] & this.f469850p) != 0) {
                kVar.getClass();
                return;
            }
            return;
        }
        int i38 = (int) x27;
        int i39 = (int) y27;
        android.view.View view3 = this.f469853s;
        if (view3 != null && i38 >= view3.getLeft() && i38 < view3.getRight() && i39 >= view3.getTop() && i39 < view3.getBottom()) {
            r5 = 1;
        }
        if (r5 != 0) {
            q(this.f469853s, pointerId5);
        }
    }

    public final void k() {
        this.f469846l.computeCurrentVelocity(1000, this.f469847m);
        float xVelocity = this.f469846l.getXVelocity(this.f469837c);
        float f17 = this.f469848n;
        float f18 = this.f469847m;
        float abs = java.lang.Math.abs(xVelocity);
        float f19 = 0.0f;
        if (abs < f17) {
            xVelocity = 0.0f;
        } else if (abs > f18) {
            xVelocity = xVelocity > 0.0f ? f18 : -f18;
        }
        float yVelocity = this.f469846l.getYVelocity(this.f469837c);
        float f27 = this.f469848n;
        float f28 = this.f469847m;
        float abs2 = java.lang.Math.abs(yVelocity);
        if (abs2 >= f27) {
            if (abs2 > f28) {
                if (yVelocity > 0.0f) {
                    f19 = f28;
                } else {
                    yVelocity = -f28;
                }
            }
            f19 = yVelocity;
        }
        g(xVelocity, f19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void l(float f17, float f18, int i17) {
        boolean b17 = b(f17, f18, i17, 1);
        boolean z17 = b17;
        if (b(f18, f17, i17, 4)) {
            z17 = (b17 ? 1 : 0) | 4;
        }
        boolean z18 = z17;
        if (b(f17, f18, i17, 2)) {
            z18 = (z17 ? 1 : 0) | 2;
        }
        ?? r07 = z18;
        if (b(f18, f17, i17, 8)) {
            r07 = (z18 ? 1 : 0) | 8;
        }
        if (r07 != 0) {
            int[] iArr = this.f469843i;
            iArr[i17] = iArr[i17] | r07;
            this.f469852r.getClass();
        }
    }

    public final void m(float f17, float f18, int i17) {
        float[] fArr = this.f469838d;
        if (fArr == null || fArr.length <= i17) {
            int i18 = i17 + 1;
            float[] fArr2 = new float[i18];
            float[] fArr3 = new float[i18];
            float[] fArr4 = new float[i18];
            float[] fArr5 = new float[i18];
            int[] iArr = new int[i18];
            int[] iArr2 = new int[i18];
            int[] iArr3 = new int[i18];
            if (fArr != null) {
                java.lang.System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f469839e;
                java.lang.System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f469840f;
                java.lang.System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f469841g;
                java.lang.System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f469842h;
                java.lang.System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f469843i;
                java.lang.System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f469844j;
                java.lang.System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f469838d = fArr2;
            this.f469839e = fArr3;
            this.f469840f = fArr4;
            this.f469841g = fArr5;
            this.f469842h = iArr;
            this.f469843i = iArr2;
            this.f469844j = iArr3;
        }
        float[] fArr9 = this.f469838d;
        this.f469840f[i17] = f17;
        fArr9[i17] = f17;
        float[] fArr10 = this.f469839e;
        this.f469841g[i17] = f18;
        fArr10[i17] = f18;
        int[] iArr7 = this.f469842h;
        int i19 = (int) f17;
        int i27 = (int) f18;
        android.view.ViewGroup viewGroup = this.f469855u;
        int i28 = i19 < viewGroup.getLeft() + this.f469849o ? 1 : 0;
        if (i27 < viewGroup.getTop() + this.f469849o) {
            i28 = 4;
        }
        if (i19 > viewGroup.getRight() - this.f469849o) {
            i28 = 2;
        }
        if (i27 > viewGroup.getBottom() - this.f469849o) {
            i28 = 8;
        }
        iArr7[i17] = i28;
        this.f469845k |= 1 << i17;
    }

    public final void n(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i17 = 0; i17 < pointerCount; i17++) {
            int pointerId = motionEvent.getPointerId(i17);
            float x17 = motionEvent.getX(i17);
            float y17 = motionEvent.getY(i17);
            this.f469840f[pointerId] = x17;
            this.f469841g[pointerId] = y17;
        }
    }

    public void o(int i17) {
        if (this.f469835a != i17) {
            this.f469835a = i17;
            me.imid.swipebacklayout.lib.SwipeBackLayout swipeBackLayout = ((z26.g) this.f469852r).f469832b;
            java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = swipeBackLayout.f325893o;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                java.util.Iterator it = swipeBackLayout.f325893o.iterator();
                while (it.hasNext()) {
                    ((z26.e) it.next()).d(i17, swipeBackLayout.f325890i);
                }
            }
            if (i17 == 0) {
                this.f469853s = null;
            }
        }
    }

    public boolean p(android.view.MotionEvent motionEvent) {
        android.view.View h17;
        android.view.View h18;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f469846l == null) {
            this.f469846l = android.view.VelocityTracker.obtain();
        }
        this.f469846l.addMovement(motionEvent);
        z26.k kVar = this.f469852r;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i17 = 0; i17 < pointerCount; i17++) {
                        int pointerId = motionEvent.getPointerId(i17);
                        float x17 = motionEvent.getX(i17);
                        float y17 = motionEvent.getY(i17);
                        float f17 = x17 - this.f469838d[pointerId];
                        float f18 = y17 - this.f469839e[pointerId];
                        l(f17, f18, pointerId);
                        if (this.f469835a == 1 || ((h17 = h((int) x17, (int) y17)) != null && d(h17, f17, f18) && q(h17, pointerId))) {
                            break;
                        }
                    }
                    n(motionEvent);
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x18 = motionEvent.getX(actionIndex);
                        float y18 = motionEvent.getY(actionIndex);
                        m(x18, y18, pointerId2);
                        int i18 = this.f469835a;
                        if (i18 == 0) {
                            if ((this.f469842h[pointerId2] & this.f469850p) != 0) {
                                kVar.getClass();
                            }
                        } else if (i18 == 2 && (h18 = h((int) x18, (int) y18)) == this.f469853s) {
                            q(h18, pointerId2);
                        }
                    } else if (actionMasked == 6) {
                        e(motionEvent.getPointerId(actionIndex));
                    }
                }
            }
            a();
        } else {
            float x19 = motionEvent.getX();
            float y19 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            m(x19, y19, pointerId3);
            android.view.View h19 = h((int) x19, (int) y19);
            if (h19 == this.f469853s && this.f469835a == 2) {
                q(h19, pointerId3);
            }
            if ((this.f469842h[pointerId3] & this.f469850p) != 0) {
                kVar.getClass();
            }
        }
        return this.f469835a == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean q(android.view.View r13, int r14) {
        /*
            r12 = this;
            android.view.View r0 = r12.f469853s
            r1 = 1
            if (r13 != r0) goto La
            int r0 = r12.f469837c
            if (r0 != r14) goto La
            return r1
        La:
            r0 = 0
            if (r13 == 0) goto Lb0
            z26.k r2 = r12.f469852r
            r3 = r2
            z26.g r3 = (z26.g) r3
            me.imid.swipebacklayout.lib.SwipeBackLayout r4 = r3.f469832b
            z26.l r5 = r4.f325889h
            int r6 = r4.f325885d
            boolean r5 = r5.i(r6, r14)
            z26.l r6 = r4.f325889h
            r7 = 8
            r8 = 2
            if (r5 == 0) goto L61
            boolean r9 = r6.i(r1, r14)
            if (r9 == 0) goto L2c
            r4.f325902x = r1
            goto L3d
        L2c:
            boolean r9 = r6.i(r8, r14)
            if (r9 == 0) goto L35
            r4.f325902x = r8
            goto L3d
        L35:
            boolean r9 = r6.i(r7, r14)
            if (r9 == 0) goto L3d
            r4.f325902x = r7
        L3d:
            java.util.concurrent.CopyOnWriteArrayList r9 = r4.f325893o
            if (r9 == 0) goto L5f
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L5f
            java.util.concurrent.CopyOnWriteArrayList r9 = r4.f325893o
            java.util.Iterator r9 = r9.iterator()
        L4d:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L5f
            java.lang.Object r10 = r9.next()
            z26.e r10 = (z26.e) r10
            int r11 = r4.f325902x
            r10.e(r11)
            goto L4d
        L5f:
            r3.f469831a = r1
        L61:
            int r3 = r4.f325885d
            if (r3 == r1) goto L77
            if (r3 != r8) goto L68
            goto L77
        L68:
            if (r3 != r7) goto L6f
            boolean r3 = r6.c(r1, r14)
            goto L7b
        L6f:
            r6 = 11
            if (r3 != r6) goto L75
            r3 = r1
            goto L7c
        L75:
            r3 = r0
            goto L7c
        L77:
            boolean r3 = r6.c(r8, r14)
        L7b:
            r3 = r3 ^ r1
        L7c:
            r3 = r3 & r5
            boolean r4 = r4.f325887f
            r3 = r3 & r4
            if (r3 == 0) goto Lb0
            r12.f469837c = r14
            android.view.ViewParent r0 = r13.getParent()
            android.view.ViewGroup r3 = r12.f469855u
            if (r0 != r3) goto L97
            r12.f469853s = r13
            r12.f469837c = r14
            r2.getClass()
            r12.o(r1)
            return r1
        L97:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view ("
            r14.<init>(r0)
            r14.append(r3)
            java.lang.String r0 = ")"
            r14.append(r0)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        Lb0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z26.l.q(android.view.View, int):boolean");
    }
}
