package ii5;

/* loaded from: classes15.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public int f291630a;

    /* renamed from: b, reason: collision with root package name */
    public final int f291631b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f291633d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f291634e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f291635f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f291636g;

    /* renamed from: h, reason: collision with root package name */
    public int f291637h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f291638i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f291639j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f291640k;

    /* renamed from: l, reason: collision with root package name */
    public int f291641l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.VelocityTracker f291642m;

    /* renamed from: n, reason: collision with root package name */
    public float f291643n;

    /* renamed from: o, reason: collision with root package name */
    public float f291644o;

    /* renamed from: p, reason: collision with root package name */
    public int f291645p;

    /* renamed from: q, reason: collision with root package name */
    public final int f291646q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f291647r;

    /* renamed from: s, reason: collision with root package name */
    public int f291648s;

    /* renamed from: t, reason: collision with root package name */
    public final androidx.core.widget.s f291649t;

    /* renamed from: u, reason: collision with root package name */
    public final ii5.b f291650u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f291651v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f291652w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.ViewGroup f291653x;

    /* renamed from: c, reason: collision with root package name */
    public int f291632c = -1;

    /* renamed from: y, reason: collision with root package name */
    public boolean f291654y = false;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f291655z = new ii5.a(this);

    public c(android.content.Context context, android.view.ViewGroup viewGroup, ii5.b bVar, android.view.animation.Interpolator interpolator) {
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("Parent view may not be null");
        }
        if (bVar == null) {
            throw new java.lang.IllegalArgumentException("Callback may not be null");
        }
        this.f291653x = viewGroup;
        this.f291650u = bVar;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        int i17 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f291646q = i17;
        this.f291645p = i17;
        this.f291631b = viewConfiguration.getScaledTouchSlop();
        this.f291643n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f291644o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f291649t = new androidx.core.widget.s(context, interpolator);
    }

    public void a() {
        this.f291632c = -1;
        float[] fArr = this.f291633d;
        if (fArr != null) {
            java.util.Arrays.fill(fArr, 0.0f);
            java.util.Arrays.fill(this.f291634e, 0.0f);
            java.util.Arrays.fill(this.f291635f, 0.0f);
            java.util.Arrays.fill(this.f291636g, 0.0f);
            java.util.Arrays.fill(this.f291638i, 0);
            java.util.Arrays.fill(this.f291639j, 0);
            java.util.Arrays.fill(this.f291640k, 0);
            this.f291641l = 0;
        }
        android.view.VelocityTracker velocityTracker = this.f291642m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f291642m = null;
        }
    }

    public final boolean b(float f17, float f18, int i17, int i18) {
        float abs = java.lang.Math.abs(f17);
        float abs2 = java.lang.Math.abs(f18);
        if ((this.f291638i[i17] & i18) != i18 || (this.f291648s & i18) == 0 || (this.f291640k[i17] & i18) == i18 || (this.f291639j[i17] & i18) == i18) {
            return false;
        }
        int i19 = this.f291631b;
        if (abs <= i19 && abs2 <= i19) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f291650u.getClass();
        }
        return (this.f291639j[i17] & i18) == 0 && abs > ((float) i19);
    }

    public final boolean c(android.view.View view, float f17, float f18) {
        if (view == null) {
            return false;
        }
        ii5.b bVar = this.f291650u;
        bVar.getClass();
        bVar.getClass();
        float abs = java.lang.Math.abs(f17);
        float abs2 = java.lang.Math.abs(f18);
        boolean z17 = this.f291647r;
        int i17 = this.f291631b;
        return z17 ? abs > ((float) i17) && abs2 * 2.19f < abs : abs > ((float) i17);
    }

    public final void d(int i17) {
        float[] fArr = this.f291633d;
        if (fArr == null) {
            return;
        }
        fArr[i17] = 0.0f;
        this.f291634e[i17] = 0.0f;
        this.f291635f[i17] = 0.0f;
        this.f291636g[i17] = 0.0f;
        this.f291638i[i17] = 0;
        this.f291639j[i17] = 0;
        this.f291640k[i17] = 0;
        this.f291641l = (~(1 << i17)) & this.f291641l;
    }

    public final int e(int i17, int i18, int i19) {
        if (i17 == 0) {
            return 0;
        }
        float width = this.f291653x.getWidth() / 2;
        float sin = width + (((float) java.lang.Math.sin((float) ((java.lang.Math.min(1.0f, java.lang.Math.abs(i17) / r0) - 0.5f) * 0.4712389167638204d))) * width);
        int abs = java.lang.Math.abs(i18);
        return java.lang.Math.min(abs > 0 ? java.lang.Math.round(java.lang.Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((java.lang.Math.abs(i17) / i19) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        if (r2 == 3) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(float r16, float r17) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ii5.c.f(float, float):void");
    }

    public final void g(int i17) {
        float[] fArr = this.f291633d;
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
                float[] fArr6 = this.f291634e;
                java.lang.System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f291635f;
                java.lang.System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f291636g;
                java.lang.System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f291638i;
                java.lang.System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f291639j;
                java.lang.System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f291640k;
                java.lang.System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f291633d = fArr2;
            this.f291634e = fArr3;
            this.f291635f = fArr4;
            this.f291636g = fArr5;
            this.f291638i = iArr;
            this.f291639j = iArr2;
            this.f291640k = iArr3;
            this.f291637h = i17;
        }
    }

    public android.view.View h(int i17, int i18) {
        android.view.ViewGroup viewGroup = this.f291653x;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f291650u.getClass();
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if (i17 >= childAt.getLeft() && i17 < childAt.getRight() && i18 >= childAt.getTop() && i18 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean i(int i17, int i18, int i19, int i27, long j17) {
        float f17;
        float f18;
        float f19;
        float f27;
        int left = this.f291651v.getLeft();
        int top = this.f291651v.getTop();
        int i28 = i17 - left;
        int i29 = i18 - top;
        if (i28 == 0 && i29 == 0) {
            this.f291649t.a();
            q(0);
            return false;
        }
        if (j17 == 0) {
            int i37 = (int) this.f291644o;
            int i38 = (int) this.f291643n;
            int abs = java.lang.Math.abs(i19);
            if (abs < i37) {
                i19 = 0;
            } else if (abs > i38) {
                i19 = i19 > 0 ? i38 : -i38;
            }
            int i39 = (int) this.f291644o;
            int i47 = (int) this.f291643n;
            int abs2 = java.lang.Math.abs(i27);
            if (abs2 < i39) {
                i27 = 0;
            } else if (abs2 > i47) {
                i27 = i27 > 0 ? i47 : -i47;
            }
            int abs3 = java.lang.Math.abs(i28);
            int abs4 = java.lang.Math.abs(i29);
            int abs5 = java.lang.Math.abs(i19);
            int abs6 = java.lang.Math.abs(i27);
            int i48 = abs5 + abs6;
            int i49 = abs3 + abs4;
            if (i19 != 0) {
                f17 = abs5;
                f18 = i48;
            } else {
                f17 = abs3;
                f18 = i49;
            }
            float f28 = f17 / f18;
            if (i27 != 0) {
                f19 = abs6;
                f27 = i48;
            } else {
                f19 = abs4;
                f27 = i49;
            }
            this.f291650u.getClass();
            j17 = (int) ((e(i28, i19, 1) * f28) + (e(i29, i27, 0) * (f19 / f27)));
        }
        this.f291649t.d(left, top, i28, i29, (int) j17);
        q(2);
        return true;
    }

    public final int j(int i17, int i18) {
        android.view.ViewGroup viewGroup = this.f291653x;
        int i19 = i17 < viewGroup.getLeft() + this.f291645p ? 1 : 0;
        if (i18 < viewGroup.getTop() + this.f291645p) {
            i19 |= 4;
        }
        if (i17 > viewGroup.getRight() - this.f291645p) {
            i19 |= 2;
        }
        return i18 > viewGroup.getBottom() - this.f291645p ? i19 | 8 : i19;
    }

    public void k(android.view.View view, int i17, int i18, int i19, int i27) {
        if (this.f291654y && view != null) {
            view.setTranslationX(-i17);
            view.setTranslationY(i17 * (view.getWidth() != 0 ? view.getHeight() / view.getWidth() : 1.0f));
        }
        al5.n3 n3Var = (al5.n3) this.f291650u;
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = n3Var.f5968d;
        if (!swipeBackLayout.f211439t) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SwipeBackLayout", "[onViewPositionChanged] mHasTranslucent is false");
            return;
        }
        swipeBackLayout.f211433n = java.lang.Math.abs(i17 / ((swipeBackLayout.f211431i.getWidth() + swipeBackLayout.f211434o.getIntrinsicWidth()) + 10));
        swipeBackLayout.f211428f = i17;
        swipeBackLayout.f211429g = i18;
        swipeBackLayout.invalidate();
        al5.g3 g3Var = swipeBackLayout.f211444y;
        if (g3Var != null) {
            g3Var.R(i17, i18, i19, i27, swipeBackLayout.f211433n);
        }
        al5.e3 e3Var = swipeBackLayout.A;
        if (e3Var != null) {
            e3Var.b(i17, i18, i19, i27, swipeBackLayout.f211433n);
        }
        int i28 = swipeBackLayout.f211432m.f291630a;
        swipeBackLayout.f211431i.getTranslationZ();
        if (java.lang.Float.compare(swipeBackLayout.f211433n, 0.99f) >= 0 && !swipeBackLayout.f211440u) {
            swipeBackLayout.f211440u = true;
            com.tencent.mm.sdk.platformtools.c4.f192496b.f192497a.d(new al5.i3(n3Var));
        } else if (java.lang.Float.compare(swipeBackLayout.f211433n, 1.0E-5f) <= 0) {
            swipeBackLayout.f211441v = false;
            if (n3Var.f5967c != 1) {
                al5.e3 e3Var2 = swipeBackLayout.A;
                if (e3Var2 != null) {
                    e3Var2.c();
                }
                if (swipeBackLayout.D) {
                    swipeBackLayout.post(new al5.d3(swipeBackLayout));
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.SwipeBackLayout", "[onViewPositionChanged] mScrollPercent:%s mHasCallPopOut:%s currentDragState:%s", java.lang.Float.valueOf(swipeBackLayout.f211433n), java.lang.Boolean.valueOf(swipeBackLayout.f211440u), java.lang.Integer.valueOf(n3Var.f5967c));
        }
        if (swipeBackLayout.C) {
            swipeBackLayout.e(swipeBackLayout.f211433n);
        } else if (swipeBackLayout.f211432m.f291630a == 1) {
            swipeBackLayout.e(swipeBackLayout.f211433n);
        }
    }

    public void l(android.view.MotionEvent motionEvent) {
        int i17;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f291642m == null) {
            this.f291642m = android.view.VelocityTracker.obtain();
        }
        this.f291642m.addMovement(motionEvent);
        ii5.b bVar = this.f291650u;
        int i18 = 0;
        if (actionMasked == 0) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            android.view.View h17 = h((int) x17, (int) y17);
            o(x17, y17, pointerId);
            s(h17, pointerId);
            if ((this.f291638i[pointerId] & this.f291648s) != 0) {
                bVar.getClass();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f291630a == 1) {
                m();
            }
            a();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f291630a == 1) {
                    f(0.0f, 0.0f);
                }
                a();
                return;
            }
            if (actionMasked != 5) {
                if (actionMasked != 6) {
                    return;
                }
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                if (this.f291630a == 1 && pointerId2 == this.f291632c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i18 >= pointerCount) {
                            i17 = -1;
                            break;
                        }
                        int pointerId3 = motionEvent.getPointerId(i18);
                        if (pointerId3 != this.f291632c) {
                            android.view.View h18 = h((int) motionEvent.getX(i18), (int) motionEvent.getY(i18));
                            android.view.View view = this.f291651v;
                            if (h18 == view && s(view, pointerId3)) {
                                i17 = this.f291632c;
                                break;
                            }
                        }
                        i18++;
                    }
                    if (i17 == -1) {
                        m();
                    }
                }
                d(pointerId2);
                return;
            }
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            float x18 = motionEvent.getX(actionIndex);
            float y18 = motionEvent.getY(actionIndex);
            o(x18, y18, pointerId4);
            if (this.f291630a == 0) {
                s(h((int) x18, (int) y18), pointerId4);
                if ((this.f291638i[pointerId4] & this.f291648s) != 0) {
                    bVar.getClass();
                    return;
                }
                return;
            }
            int i19 = (int) x18;
            int i27 = (int) y18;
            android.view.View view2 = this.f291651v;
            if (view2 != null && i19 >= view2.getLeft() && i19 < view2.getRight() && i27 >= view2.getTop() && i27 < view2.getBottom()) {
                i18 = 1;
            }
            if (i18 != 0) {
                s(this.f291651v, pointerId4);
                return;
            }
            return;
        }
        if (this.f291630a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (i18 < pointerCount2) {
                int pointerId5 = motionEvent.getPointerId(i18);
                float x19 = motionEvent.getX(i18);
                float y19 = motionEvent.getY(i18);
                float f17 = x19 - this.f291633d[pointerId5];
                float f18 = y19 - this.f291634e[pointerId5];
                n(f17, f18, pointerId5);
                if (this.f291630a != 1) {
                    android.view.View h19 = h((int) x19, (int) y19);
                    if (c(h19, f17, f18) && s(h19, pointerId5)) {
                        break;
                    } else {
                        i18++;
                    }
                } else {
                    break;
                }
            }
            p(motionEvent);
            return;
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.f291632c);
        if (findPointerIndex == -1) {
            com.tencent.mars.xlog.Log.i("WxViewDragHelper", "findPointerIndex invalid.");
            f(0.0f, 0.0f);
            a();
            return;
        }
        float x27 = motionEvent.getX(findPointerIndex);
        float y27 = motionEvent.getY(findPointerIndex);
        float[] fArr = this.f291635f;
        int i28 = this.f291632c;
        int i29 = (int) (x27 - fArr[i28]);
        int i37 = (int) (y27 - this.f291636g[i28]);
        int left = this.f291651v.getLeft() + i29;
        int top = this.f291651v.getTop() + i37;
        int left2 = this.f291651v.getLeft();
        int top2 = this.f291651v.getTop();
        if (i29 != 0) {
            android.view.View view3 = this.f291651v;
            al5.n3 n3Var = (al5.n3) bVar;
            if (n3Var.f5968d.f211439t) {
                int max = java.lang.Math.max(n3Var.f5965a, left);
                n3Var.f5965a = 0;
                left = java.lang.Math.min(view3.getWidth(), java.lang.Math.max(max, 0));
            } else {
                n3Var.f5965a = java.lang.Math.max(n3Var.f5965a, left);
                left = 0;
            }
            this.f291651v.offsetLeftAndRight(left - left2);
        }
        if (i37 != 0) {
            bVar.getClass();
            this.f291651v.offsetTopAndBottom(0 - top2);
        } else {
            i18 = top;
        }
        if (i29 != 0 || i37 != 0) {
            k(this.f291651v, left, i18, left - left2, i18 - top2);
        }
        p(motionEvent);
    }

    public final void m() {
        this.f291642m.computeCurrentVelocity(1000, this.f291643n);
        float xVelocity = this.f291642m.getXVelocity(this.f291632c);
        float f17 = this.f291644o;
        float f18 = this.f291643n;
        float abs = java.lang.Math.abs(xVelocity);
        float f19 = 0.0f;
        if (abs < f17) {
            xVelocity = 0.0f;
        } else if (abs > f18) {
            xVelocity = xVelocity > 0.0f ? f18 : -f18;
        }
        float yVelocity = this.f291642m.getYVelocity(this.f291632c);
        float f27 = this.f291644o;
        float f28 = this.f291643n;
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
        f(xVelocity, f19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v6, types: [al5.e3] */
    /* JADX WARN: Type inference failed for: r4v3, types: [al5.g3] */
    public final void n(float f17, float f18, int i17) {
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
            int[] iArr = this.f291639j;
            iArr[i17] = iArr[i17] | r07;
            com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = ((al5.n3) this.f291650u).f5968d;
            ?? r47 = swipeBackLayout.f211444y;
            if (r47 != 0) {
                r47.c(r07, i17);
            }
            ?? r37 = swipeBackLayout.A;
            if (r37 != 0) {
                r37.a(r07);
            }
        }
    }

    public final void o(float f17, float f18, int i17) {
        g(i17);
        float[] fArr = this.f291633d;
        this.f291635f[i17] = f17;
        fArr[i17] = f17;
        float[] fArr2 = this.f291634e;
        this.f291636g[i17] = f18;
        fArr2[i17] = f18;
        this.f291638i[i17] = j((int) f17, (int) f18);
        this.f291641l |= 1 << i17;
    }

    public final void p(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i17 = 0; i17 < pointerCount; i17++) {
            int pointerId = motionEvent.getPointerId(i17);
            float x17 = motionEvent.getX(i17);
            float y17 = motionEvent.getY(i17);
            this.f291635f[pointerId] = x17;
            this.f291636g[pointerId] = y17;
        }
    }

    public void q(int i17) {
        if (this.f291630a != i17) {
            this.f291630a = i17;
            al5.n3 n3Var = (al5.n3) this.f291650u;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout = n3Var.f5968d;
            com.tencent.mars.xlog.Log.i("MicroMsg.SwipeBackLayout", "ashutest::onViewDragStateChanged state %d, requestedTranslucent %B fastRelease %B", valueOf, java.lang.Boolean.valueOf(swipeBackLayout.f211438s), java.lang.Boolean.valueOf(swipeBackLayout.f211442w));
            n3Var.f5967c = i17;
            if (1 == i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SwipeBackLayout", "ashutest:: on drag");
                if ((swipeBackLayout.getContext() instanceof android.app.Activity) && swipeBackLayout.f211445z == null) {
                    swipeBackLayout.f211445z = ((android.app.Activity) swipeBackLayout.getContext()).getWindow().getDecorView().getBackground();
                    if (swipeBackLayout.H) {
                        ((android.app.Activity) swipeBackLayout.getContext()).getWindow().getDecorView().setBackgroundResource(com.tencent.mm.R.color.a9e);
                    }
                }
                al5.f3 f3Var = swipeBackLayout.I;
                if (f3Var != null) {
                    f3Var.onDrag();
                }
                swipeBackLayout.f211440u = false;
                if (swipeBackLayout.f211439t) {
                    swipeBackLayout.e(0.0f);
                }
            }
            if (i17 == 0 && !swipeBackLayout.f211442w) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SwipeBackLayout", "ashutest:: on cancel");
                if (swipeBackLayout.I != null) {
                    if ((swipeBackLayout.getContext() instanceof android.app.Activity) && swipeBackLayout.f211445z != null) {
                        if (swipeBackLayout.H) {
                            ((android.app.Activity) swipeBackLayout.getContext()).getWindow().getDecorView().setBackground(swipeBackLayout.f211445z);
                        }
                        swipeBackLayout.f211445z = null;
                    }
                    swipeBackLayout.I.onCancel();
                }
                swipeBackLayout.e(1.0f);
            }
            if (1 == i17 && swipeBackLayout.f211437r && (swipeBackLayout.getContext() instanceof android.app.Activity) && !swipeBackLayout.f211439t && !swipeBackLayout.f211438s) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SwipeBackLayout", "ashutest:: match dragging");
                swipeBackLayout.f211438s = true;
                db5.f.c((android.app.Activity) swipeBackLayout.getContext(), n3Var);
            }
            if (2 == i17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SwipeBackLayout", "ashutest:: notify settle, mReleasedLeft %d", java.lang.Integer.valueOf(n3Var.f5966b));
                int i18 = n3Var.f5966b;
                boolean z17 = i18 > 0;
                boolean z18 = !swipeBackLayout.C;
                if (!swipeBackLayout.f211432m.f291654y) {
                    al5.a3.a(z17, i18, z18);
                }
            }
            if (i17 == 0) {
                this.f291651v = null;
            }
        }
    }

    public boolean r(android.view.MotionEvent motionEvent) {
        android.view.View h17;
        android.view.View h18;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f291642m == null) {
            this.f291642m = android.view.VelocityTracker.obtain();
        }
        this.f291642m.addMovement(motionEvent);
        ii5.b bVar = this.f291650u;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5) {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x17 = motionEvent.getX(actionIndex);
                            float y17 = motionEvent.getY(actionIndex);
                            o(x17, y17, pointerId);
                            int i17 = this.f291630a;
                            if (i17 == 0) {
                                if ((this.f291638i[pointerId] & this.f291648s) != 0) {
                                    bVar.getClass();
                                }
                            } else if (i17 == 2 && (h18 = h((int) x17, (int) y17)) == this.f291651v) {
                                s(h18, pointerId);
                            }
                        } else if (actionMasked == 6) {
                            d(motionEvent.getPointerId(actionIndex));
                        }
                    }
                } else if (this.f291633d != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i18 = 0; i18 < pointerCount; i18++) {
                        int pointerId2 = motionEvent.getPointerId(i18);
                        float x18 = motionEvent.getX(i18);
                        float y18 = motionEvent.getY(i18);
                        if (this.f291645p != this.f291646q && !this.f291647r) {
                            this.f291647r = true;
                            if ((this.f291638i[pointerId2] & this.f291648s) != 0) {
                                g(pointerId2);
                                float[] fArr = this.f291633d;
                                this.f291635f[pointerId2] = x18;
                                fArr[pointerId2] = x18;
                                float[] fArr2 = this.f291634e;
                                this.f291636g[pointerId2] = y18;
                                fArr2[pointerId2] = y18;
                                this.f291641l |= 1 << pointerId2;
                            } else {
                                o(x18, y18, pointerId2);
                            }
                        }
                        float f17 = x18 - this.f291633d[pointerId2];
                        float f18 = y18 - this.f291634e[pointerId2];
                        n(f17, f18, pointerId2);
                        if (this.f291630a == 1 || ((h17 = h((int) x18, (int) y18)) != null && c(h17, f17, f18) && s(h17, pointerId2))) {
                            break;
                        }
                    }
                    p(motionEvent);
                }
            }
            a();
        } else {
            float x19 = motionEvent.getX();
            float y19 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            o(x19, y19, pointerId3);
            android.view.View h19 = h((int) x19, (int) y19);
            if (h19 == this.f291651v && this.f291630a == 2) {
                s(h19, pointerId3);
            }
            if ((this.f291638i[pointerId3] & this.f291648s) != 0) {
                bVar.getClass();
            }
        }
        return this.f291630a == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r4 != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean s(android.view.View r8, int r9) {
        /*
            r7 = this;
            android.view.View r0 = r7.f291651v
            r1 = 1
            if (r8 != r0) goto La
            int r0 = r7.f291632c
            if (r0 != r9) goto La
            return r1
        La:
            r0 = 0
            if (r8 == 0) goto L7d
            ii5.b r2 = r7.f291650u
            r3 = r2
            al5.n3 r3 = (al5.n3) r3
            com.tencent.mm.ui.widget.SwipeBackLayout r3 = r3.f5968d
            boolean r4 = r3.f211430h
            al5.h3 r4 = r3.B
            if (r4 == 0) goto L35
            dz4.i4 r4 = (dz4.i4) r4
            com.tencent.mm.plugin.wenote.flutter.WeNoteFlutterUI r4 = r4.f245308a
            com.tencent.mm.ui.widget.SwipeBackLayout r4 = r4.getSwipeBackLayout()
            if (r4 == 0) goto L27
            boolean r4 = r4.f211430h
            goto L28
        L27:
            r4 = r0
        L28:
            r4 = r4 ^ r1
            if (r4 == 0) goto L32
            java.lang.String r5 = "MicroMsg.WeNoteFlutterUI"
            java.lang.String r6 = "[SwipeBackInterceptor] blocking capture"
            com.tencent.mars.xlog.Log.i(r5, r6)
        L32:
            if (r4 == 0) goto L35
            goto L4c
        L35:
            ii5.c r3 = r3.f211432m
            int r4 = r3.f291641l
            int r5 = r1 << r9
            r4 = r4 & r5
            if (r4 == 0) goto L40
            r4 = r1
            goto L41
        L40:
            r4 = r0
        L41:
            if (r4 == 0) goto L4c
            int[] r3 = r3.f291638i
            r3 = r3[r9]
            r3 = r3 & r1
            if (r3 == 0) goto L4c
            r3 = r1
            goto L4d
        L4c:
            r3 = r0
        L4d:
            if (r3 == 0) goto L7d
            r7.f291632c = r9
            android.view.ViewParent r0 = r8.getParent()
            android.view.ViewGroup r3 = r7.f291653x
            if (r0 != r3) goto L64
            r7.f291651v = r8
            r7.f291632c = r9
            r2.getClass()
            r7.q(r1)
            return r1
        L64:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view ("
            r9.<init>(r0)
            r9.append(r3)
            java.lang.String r0 = ")"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L7d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ii5.c.s(android.view.View, int):boolean");
    }
}
