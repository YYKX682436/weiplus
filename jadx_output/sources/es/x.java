package es;

/* loaded from: classes15.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public int f256286a;

    /* renamed from: b, reason: collision with root package name */
    public final int f256287b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f256289d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f256290e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f256291f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f256292g;

    /* renamed from: h, reason: collision with root package name */
    public int f256293h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f256294i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f256295j;

    /* renamed from: k, reason: collision with root package name */
    public int[] f256296k;

    /* renamed from: l, reason: collision with root package name */
    public int f256297l;

    /* renamed from: m, reason: collision with root package name */
    public android.view.VelocityTracker f256298m;

    /* renamed from: n, reason: collision with root package name */
    public float f256299n;

    /* renamed from: o, reason: collision with root package name */
    public float f256300o;

    /* renamed from: p, reason: collision with root package name */
    public int f256301p;

    /* renamed from: q, reason: collision with root package name */
    public int f256302q;

    /* renamed from: r, reason: collision with root package name */
    public final androidx.core.widget.s f256303r;

    /* renamed from: s, reason: collision with root package name */
    public final es.w f256304s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f256305t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f256306u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.ViewGroup f256307v;

    /* renamed from: c, reason: collision with root package name */
    public int f256288c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f256308w = new es.v(this);

    public x(android.content.Context context, android.view.ViewGroup viewGroup, es.w wVar, android.view.animation.Interpolator interpolator) {
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("Parent view may not be null");
        }
        if (wVar == null) {
            throw new java.lang.IllegalArgumentException("Callback may not be null");
        }
        this.f256307v = viewGroup;
        this.f256304s = wVar;
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f256301p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f256287b = viewConfiguration.getScaledTouchSlop();
        this.f256299n = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f256300o = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f256303r = new androidx.core.widget.s(context, interpolator);
    }

    public void a() {
        this.f256288c = -1;
        float[] fArr = this.f256289d;
        if (fArr != null) {
            java.util.Arrays.fill(fArr, 0.0f);
            java.util.Arrays.fill(this.f256290e, 0.0f);
            java.util.Arrays.fill(this.f256291f, 0.0f);
            java.util.Arrays.fill(this.f256292g, 0.0f);
            java.util.Arrays.fill(this.f256294i, 0);
            java.util.Arrays.fill(this.f256295j, 0);
            java.util.Arrays.fill(this.f256296k, 0);
            this.f256297l = 0;
        }
        android.view.VelocityTracker velocityTracker = this.f256298m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f256298m = null;
        }
    }

    public final boolean b(float f17, float f18, int i17, int i18) {
        float abs = java.lang.Math.abs(f17);
        float abs2 = java.lang.Math.abs(f18);
        if ((this.f256294i[i17] & i18) != i18 || (this.f256302q & i18) == 0 || (this.f256296k[i17] & i18) == i18 || (this.f256295j[i17] & i18) == i18) {
            return false;
        }
        int i19 = this.f256287b;
        if (abs <= i19 && abs2 <= i19) {
            return false;
        }
        if (abs < abs2 * 0.5f) {
            this.f256304s.getClass();
        }
        return (this.f256295j[i17] & i18) == 0 && abs > ((float) i19);
    }

    public final void c(int i17) {
        float[] fArr = this.f256289d;
        if (fArr == null) {
            return;
        }
        fArr[i17] = 0.0f;
        this.f256290e[i17] = 0.0f;
        this.f256291f[i17] = 0.0f;
        this.f256292g[i17] = 0.0f;
        this.f256294i[i17] = 0;
        this.f256295j[i17] = 0;
        this.f256296k[i17] = 0;
        this.f256297l = (~(1 << i17)) & this.f256297l;
    }

    public final int d(int i17, int i18, int i19) {
        if (i17 == 0) {
            return 0;
        }
        float width = this.f256307v.getWidth() / 2;
        float sin = width + (((float) java.lang.Math.sin((float) ((java.lang.Math.min(1.0f, java.lang.Math.abs(i17) / r0) - 0.5f) * 0.4712389167638204d))) * width);
        int abs = java.lang.Math.abs(i18);
        return java.lang.Math.min(abs > 0 ? java.lang.Math.round(java.lang.Math.abs(sin / abs) * 1000.0f) * 4 : (int) (((java.lang.Math.abs(i17) / i19) + 1.0f) * 256.0f), 600);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(float r18, float r19) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: es.x.e(float, float):void");
    }

    public android.view.View f(int i17, int i18) {
        android.view.ViewGroup viewGroup = this.f256307v;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.f256304s.getClass();
            android.view.View childAt = viewGroup.getChildAt(childCount);
            if (i17 >= childAt.getLeft() && i17 < childAt.getRight() && i18 >= childAt.getTop() && i18 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final int g(int i17, int i18) {
        android.view.ViewGroup viewGroup = this.f256307v;
        int i19 = i17 < viewGroup.getLeft() + this.f256301p ? 1 : 0;
        if (i18 < viewGroup.getTop() + this.f256301p) {
            i19 |= 4;
        }
        if (i17 > viewGroup.getRight() - this.f256301p) {
            i19 |= 2;
        }
        return i18 > viewGroup.getBottom() - this.f256301p ? i19 | 8 : i19;
    }

    public void h(android.view.MotionEvent motionEvent) {
        boolean z17;
        int i17;
        int i18;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f256298m == null) {
            this.f256298m = android.view.VelocityTracker.obtain();
        }
        this.f256298m.addMovement(motionEvent);
        es.w wVar = this.f256304s;
        int i19 = 0;
        if (actionMasked == 0) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            android.view.View f17 = f((int) x17, (int) y17);
            k(x17, y17, pointerId);
            o(f17, pointerId);
            if ((this.f256294i[pointerId] & this.f256302q) != 0) {
                wVar.getClass();
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f256286a == 1) {
                i();
            }
            a();
            return;
        }
        if (actionMasked != 2) {
            if (actionMasked == 3) {
                if (this.f256286a == 1) {
                    e(0.0f, 0.0f);
                }
                a();
                return;
            }
            if (actionMasked != 5) {
                if (actionMasked != 6) {
                    return;
                }
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                if (this.f256286a == 1 && pointerId2 == this.f256288c) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (true) {
                        if (i19 >= pointerCount) {
                            i18 = -1;
                            break;
                        }
                        int pointerId3 = motionEvent.getPointerId(i19);
                        if (pointerId3 != this.f256288c) {
                            android.view.View f18 = f((int) motionEvent.getX(i19), (int) motionEvent.getY(i19));
                            android.view.View view = this.f256305t;
                            if (f18 == view && o(view, pointerId3)) {
                                i18 = this.f256288c;
                                break;
                            }
                        }
                        i19++;
                    }
                    if (i18 == -1) {
                        i();
                    }
                }
                c(pointerId2);
                return;
            }
            int pointerId4 = motionEvent.getPointerId(actionIndex);
            float x18 = motionEvent.getX(actionIndex);
            float y18 = motionEvent.getY(actionIndex);
            k(x18, y18, pointerId4);
            if (this.f256286a == 0) {
                o(f((int) x18, (int) y18), pointerId4);
                if ((this.f256294i[pointerId4] & this.f256302q) != 0) {
                    wVar.getClass();
                    return;
                }
                return;
            }
            int i27 = (int) x18;
            int i28 = (int) y18;
            android.view.View view2 = this.f256305t;
            if (view2 != null && i27 >= view2.getLeft() && i27 < view2.getRight() && i28 >= view2.getTop() && i28 < view2.getBottom()) {
                i19 = 1;
            }
            if (i19 != 0) {
                o(this.f256305t, pointerId4);
                return;
            }
            return;
        }
        if (this.f256286a != 1) {
            int pointerCount2 = motionEvent.getPointerCount();
            for (int i29 = 0; i29 < pointerCount2; i29++) {
                int pointerId5 = motionEvent.getPointerId(i29);
                float x19 = motionEvent.getX(i29);
                float y19 = motionEvent.getY(i29);
                float f19 = x19 - this.f256289d[pointerId5];
                j(f19, y19 - this.f256290e[pointerId5], pointerId5);
                if (this.f256286a == 1) {
                    break;
                }
                android.view.View f27 = f((int) x19, (int) y19);
                if (f27 != null) {
                    wVar.getClass();
                    if (java.lang.Math.abs(f19) > this.f256287b) {
                        z17 = true;
                        if (!z17 && o(f27, pointerId5)) {
                            break;
                        }
                    }
                }
                z17 = false;
                if (!z17) {
                }
            }
            l(motionEvent);
            return;
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.f256288c);
        float x27 = motionEvent.getX(findPointerIndex);
        float y27 = motionEvent.getY(findPointerIndex);
        float[] fArr = this.f256291f;
        int i37 = this.f256288c;
        int i38 = (int) (x27 - fArr[i37]);
        int i39 = (int) (y27 - this.f256292g[i37]);
        int left = this.f256305t.getLeft() + i38;
        int top = this.f256305t.getTop() + i39;
        int left2 = this.f256305t.getLeft();
        int top2 = this.f256305t.getTop();
        if (i38 != 0) {
            android.view.View view3 = this.f256305t;
            es.t tVar = (es.t) wVar;
            if (tVar.f256278c.f64974u) {
                int max = java.lang.Math.max(tVar.f256276a, left);
                tVar.f256276a = 0;
                left = java.lang.Math.min(view3.getWidth(), java.lang.Math.max(max, 0));
            } else {
                tVar.f256276a = java.lang.Math.max(tVar.f256276a, left);
                left = 0;
            }
            this.f256305t.offsetLeftAndRight(left - left2);
        }
        int i47 = left;
        if (i39 != 0) {
            wVar.getClass();
            this.f256305t.offsetTopAndBottom(0 - top2);
            i17 = 0;
        } else {
            i17 = top;
        }
        if (i38 != 0 || i39 != 0) {
            this.f256304s.a(this.f256305t, i47, i17, i47 - left2, i17 - top2);
        }
        l(motionEvent);
    }

    public final void i() {
        this.f256298m.computeCurrentVelocity(1000, this.f256299n);
        float xVelocity = this.f256298m.getXVelocity(this.f256288c);
        float f17 = this.f256300o;
        float f18 = this.f256299n;
        float abs = java.lang.Math.abs(xVelocity);
        float f19 = 0.0f;
        if (abs < f17) {
            xVelocity = 0.0f;
        } else if (abs > f18) {
            xVelocity = xVelocity > 0.0f ? f18 : -f18;
        }
        float yVelocity = this.f256298m.getYVelocity(this.f256288c);
        float f27 = this.f256300o;
        float f28 = this.f256299n;
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
        e(xVelocity, f19);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void j(float f17, float f18, int i17) {
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
            int[] iArr = this.f256295j;
            iArr[i17] = iArr[i17] | r07;
            this.f256304s.getClass();
        }
    }

    public final void k(float f17, float f18, int i17) {
        float[] fArr = this.f256289d;
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
                float[] fArr6 = this.f256290e;
                java.lang.System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f256291f;
                java.lang.System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f256292g;
                java.lang.System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f256294i;
                java.lang.System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f256295j;
                java.lang.System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f256296k;
                java.lang.System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f256289d = fArr2;
            this.f256290e = fArr3;
            this.f256291f = fArr4;
            this.f256292g = fArr5;
            this.f256294i = iArr;
            this.f256295j = iArr2;
            this.f256296k = iArr3;
            this.f256293h = i17;
        }
        float[] fArr9 = this.f256289d;
        this.f256291f[i17] = f17;
        fArr9[i17] = f17;
        float[] fArr10 = this.f256290e;
        this.f256292g[i17] = f18;
        fArr10[i17] = f18;
        this.f256294i[i17] = g((int) f17, (int) f18);
        this.f256297l |= 1 << i17;
    }

    public final void l(android.view.MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i17 = 0; i17 < pointerCount; i17++) {
            int pointerId = motionEvent.getPointerId(i17);
            float x17 = motionEvent.getX(i17);
            float y17 = motionEvent.getY(i17);
            this.f256291f[pointerId] = x17;
            this.f256292g[pointerId] = y17;
        }
    }

    public void m(int i17) {
        if (this.f256286a != i17) {
            this.f256286a = i17;
            es.t tVar = (es.t) this.f256304s;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            com.tencent.mm.ext.ui.SwipeBackLayout swipeBackLayout = tVar.f256278c;
            kd.c.c("MicroMsg.SwipeBackLayout", "ashutest::onViewDragStateChanged state %d, requestedTranslucent %B fastRelease %B", valueOf, java.lang.Boolean.valueOf(swipeBackLayout.f64973t), java.lang.Boolean.valueOf(swipeBackLayout.f64977x));
            if (1 == i17) {
                kd.c.c("MicroMsg.SwipeBackLayout", "ashutest:: on drag", new java.lang.Object[0]);
                if ((swipeBackLayout.getContext() instanceof android.app.Activity) && swipeBackLayout.A == null) {
                    swipeBackLayout.A = ((android.app.Activity) swipeBackLayout.getContext()).getWindow().getDecorView().getBackground();
                    if (swipeBackLayout.D) {
                        ((android.app.Activity) swipeBackLayout.getContext()).getWindow().getDecorView().setBackgroundResource(android.R.color.transparent);
                    }
                }
                swipeBackLayout.f64975v = false;
                if (swipeBackLayout.f64974u) {
                    es.k.b(0.0f);
                }
            }
            if (i17 == 0 && !swipeBackLayout.f64977x) {
                kd.c.c("MicroMsg.SwipeBackLayout", "ashutest:: on cancel", new java.lang.Object[0]);
                if (swipeBackLayout.E != null) {
                    if ((swipeBackLayout.getContext() instanceof android.app.Activity) && swipeBackLayout.A != null) {
                        if (swipeBackLayout.D) {
                            ((android.app.Activity) swipeBackLayout.getContext()).getWindow().getDecorView().setBackground(swipeBackLayout.A);
                        }
                        swipeBackLayout.A = null;
                    }
                    swipeBackLayout.E.getClass();
                }
                es.k.b(1.0f);
            }
            if (1 == i17 && swipeBackLayout.f64972s && (swipeBackLayout.getContext() instanceof android.app.Activity) && !swipeBackLayout.f64974u && !swipeBackLayout.f64973t) {
                kd.c.c("MicroMsg.SwipeBackLayout", "ashutest:: match dragging", new java.lang.Object[0]);
                swipeBackLayout.f64973t = true;
                es.d.a((android.app.Activity) swipeBackLayout.getContext(), tVar);
            }
            if (2 == i17) {
                kd.c.c("MicroMsg.SwipeBackLayout", "ashutest:: notify settle, mReleasedLeft %d", java.lang.Integer.valueOf(tVar.f256277b));
                int i18 = tVar.f256277b;
                es.k.a(i18 > 0, i18);
            }
            if (i17 == 0) {
                this.f256305t = null;
            }
        }
    }

    public boolean n(android.view.MotionEvent motionEvent) {
        android.view.View f17;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f256298m == null) {
            this.f256298m = android.view.VelocityTracker.obtain();
        }
        this.f256298m.addMovement(motionEvent);
        es.w wVar = this.f256304s;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i17 = 0; i17 < pointerCount; i17++) {
                        int pointerId = motionEvent.getPointerId(i17);
                        float x17 = motionEvent.getX(i17);
                        float y17 = motionEvent.getY(i17);
                        float f18 = x17 - this.f256289d[pointerId];
                        j(f18, y17 - this.f256290e[pointerId], pointerId);
                        if (this.f256286a == 1) {
                            break;
                        }
                        android.view.View f19 = f((int) x17, (int) y17);
                        if (f19 != null) {
                            wVar.getClass();
                            if ((java.lang.Math.abs(f18) > ((float) this.f256287b)) && o(f19, pointerId)) {
                                break;
                            }
                        }
                    }
                    l(motionEvent);
                } else if (actionMasked != 3) {
                    if (actionMasked == 5) {
                        int pointerId2 = motionEvent.getPointerId(actionIndex);
                        float x18 = motionEvent.getX(actionIndex);
                        float y18 = motionEvent.getY(actionIndex);
                        k(x18, y18, pointerId2);
                        int i18 = this.f256286a;
                        if (i18 == 0) {
                            if ((this.f256294i[pointerId2] & this.f256302q) != 0) {
                                wVar.getClass();
                            }
                        } else if (i18 == 2 && (f17 = f((int) x18, (int) y18)) == this.f256305t) {
                            o(f17, pointerId2);
                        }
                    } else if (actionMasked == 6) {
                        c(motionEvent.getPointerId(actionIndex));
                    }
                }
            }
            a();
        } else {
            float x19 = motionEvent.getX();
            float y19 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            k(x19, y19, pointerId3);
            android.view.View f27 = f((int) x19, (int) y19);
            if (f27 == this.f256305t && this.f256286a == 2) {
                o(f27, pointerId3);
            }
            if ((this.f256294i[pointerId3] & this.f256302q) != 0) {
                wVar.getClass();
            }
        }
        return this.f256286a == 1;
    }

    public boolean o(android.view.View view, int i17) {
        if (view == this.f256305t && this.f256288c == i17) {
            return true;
        }
        if (view != null) {
            es.w wVar = this.f256304s;
            es.x xVar = ((es.t) wVar).f256278c.f64967n;
            if (((xVar.f256297l & (1 << i17)) != 0) && (xVar.f256294i[i17] & 1) != 0) {
                this.f256288c = i17;
                android.view.ViewParent parent = view.getParent();
                android.view.ViewGroup viewGroup = this.f256307v;
                if (parent != viewGroup) {
                    throw new java.lang.IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
                }
                this.f256305t = view;
                this.f256288c = i17;
                wVar.getClass();
                m(1);
                return true;
            }
        }
        return false;
    }
}
