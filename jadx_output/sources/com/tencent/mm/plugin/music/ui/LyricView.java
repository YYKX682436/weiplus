package com.tencent.mm.plugin.music.ui;

/* loaded from: classes10.dex */
public class LyricView extends android.view.View {
    public static final int F = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
    public static final int G = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 10);
    public float A;
    public int B;
    public float C;
    public final int[] D;
    public final int[] E;

    /* renamed from: d, reason: collision with root package name */
    public long f150680d;

    /* renamed from: e, reason: collision with root package name */
    public ll3.g1 f150681e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.GestureDetector f150682f;

    /* renamed from: g, reason: collision with root package name */
    public int f150683g;

    /* renamed from: h, reason: collision with root package name */
    public android.text.TextPaint f150684h;

    /* renamed from: i, reason: collision with root package name */
    public android.text.TextPaint f150685i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Paint.Align f150686m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f150687n;

    /* renamed from: o, reason: collision with root package name */
    public int f150688o;

    /* renamed from: p, reason: collision with root package name */
    public int f150689p;

    /* renamed from: q, reason: collision with root package name */
    public int f150690q;

    /* renamed from: r, reason: collision with root package name */
    public int f150691r;

    /* renamed from: s, reason: collision with root package name */
    public int f150692s;

    /* renamed from: t, reason: collision with root package name */
    public int f150693t;

    /* renamed from: u, reason: collision with root package name */
    public int f150694u;

    /* renamed from: v, reason: collision with root package name */
    public int f150695v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f150696w;

    /* renamed from: x, reason: collision with root package name */
    public int f150697x;

    /* renamed from: y, reason: collision with root package name */
    public int f150698y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f150699z;

    public LyricView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150683g = 1;
        this.f150686m = android.graphics.Paint.Align.CENTER;
        this.f150687n = false;
        this.f150688o = 0;
        int i17 = F;
        this.f150689p = i17;
        int i18 = G;
        this.f150690q = i18;
        this.f150693t = -1;
        int i19 = 0 + i17 + i18;
        this.f150694u = i19;
        this.f150695v = i19;
        this.D = new int[2];
        this.E = new int[2];
        a();
    }

    public final void a() {
        setNestedScrollingEnabled(true);
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.f150684h = textPaint;
        textPaint.setTextSize(this.f150689p);
        this.f150684h.setColor(-1);
        this.f150684h.setAntiAlias(true);
        this.f150684h.setTextAlign(this.f150686m);
        android.text.TextPaint textPaint2 = new android.text.TextPaint();
        this.f150685i = textPaint2;
        textPaint2.setTextSize(this.f150689p);
        this.f150685i.setColor(-1);
        this.f150685i.setAlpha(127);
        this.f150685i.setAntiAlias(true);
        this.f150685i.setTextAlign(this.f150686m);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(getContext(), new com.tencent.mm.plugin.music.ui.i(this, null));
        this.f150682f = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
    }

    public float getTextSize() {
        return (int) this.f150684h.getTextSize();
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        int descent;
        super.onDraw(canvas);
        ll3.g1 g1Var = this.f150681e;
        if (g1Var == null || ((ll3.h1) g1Var).e() <= 2) {
            int i17 = this.f150697x;
            if (i17 > 300) {
                i17 = this.f150694u;
            }
            int descent2 = ((i17 / 2) + this.f150688o) - (((int) (this.f150684h.descent() + this.f150684h.ascent())) / 2);
            if (descent2 >= i17 || descent2 <= 0) {
                return;
            }
            canvas.drawText("", 0.0f, descent2, this.f150684h);
            return;
        }
        if (this.f150697x == 0 || this.f150698y == 0) {
            this.f150697x = getMeasuredHeight();
            this.f150698y = getMeasuredWidth();
        }
        if (this.f150693t < 0) {
            return;
        }
        if (android.graphics.Paint.Align.LEFT == this.f150686m) {
            int i18 = this.f150695v;
            ll3.g1 g1Var2 = this.f150681e;
            if (g1Var2 != null) {
                int e17 = ((ll3.h1) g1Var2).e();
                int i19 = this.f150693t;
                if (e17 > i19) {
                    int i27 = this.f150688o;
                    this.f150694u = this.f150689p + i27 + this.f150690q;
                    if (!this.f150687n) {
                        int i28 = this.f150697x;
                        int i29 = ((i28 / 2) - i18) + i27;
                        if (i29 < i28 && i29 > 0 && ((ll3.h1) this.f150681e).d(i19) != null) {
                            if (!((ll3.h1) this.f150681e).d(this.f150693t).a()) {
                                canvas.drawText(((ll3.h1) this.f150681e).d(this.f150693t).f319168b, 0.0f, i29, this.f150684h);
                            }
                        }
                        int i37 = this.f150693t;
                        while (true) {
                            i37--;
                            if (i37 < 0) {
                                break;
                            }
                            int i38 = i29 - ((this.f150693t - i37) * this.f150694u);
                            if (i38 > 0 && i38 < this.f150697x && ((ll3.h1) this.f150681e).d(i37) != null && !((ll3.h1) this.f150681e).d(i37).a()) {
                                canvas.drawText(((ll3.h1) this.f150681e).d(i37).f319168b, 0.0f, i38, this.f150685i);
                            }
                        }
                        int i39 = this.f150693t;
                        while (true) {
                            i39++;
                            if (i39 >= ((ll3.h1) this.f150681e).e()) {
                                break;
                            }
                            int i47 = ((i39 - this.f150693t) * this.f150694u) + i29;
                            if (i47 < this.f150697x && i47 > 0 && ((ll3.h1) this.f150681e).d(i39) != null && !((ll3.h1) this.f150681e).d(i39).a()) {
                                canvas.drawText(((ll3.h1) this.f150681e).d(i39).f319168b, 0.0f, i47, this.f150685i);
                            }
                        }
                    } else {
                        ll3.g1 g1Var3 = this.f150681e;
                        if (g1Var3 != null && ((ll3.h1) g1Var3).e() > this.f150693t && (descent = ((this.f150697x / 2) + this.f150688o) - (((int) (this.f150684h.descent() + this.f150684h.ascent())) / 2)) < this.f150697x && descent > 0) {
                            if (((ll3.h1) this.f150681e).d(this.f150693t) != null) {
                                if (!((ll3.h1) this.f150681e).d(this.f150693t).a()) {
                                    canvas.drawText(((ll3.h1) this.f150681e).d(this.f150693t).f319168b, 0.0f, descent, this.f150684h);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            int i48 = this.f150695v;
            ll3.g1 g1Var4 = this.f150681e;
            if (g1Var4 != null) {
                int e18 = ((ll3.h1) g1Var4).e();
                int i49 = this.f150693t;
                if (e18 > i49) {
                    int i57 = this.f150697x;
                    int i58 = ((i57 / 2) - i48) + this.f150688o;
                    if (i58 < i57 && i58 > 0 && ((ll3.h1) this.f150681e).d(i49) != null) {
                        canvas.drawText(((ll3.h1) this.f150681e).d(this.f150693t).f319168b, this.f150698y / 2, i58, this.f150684h);
                    }
                    int i59 = this.f150693t;
                    while (true) {
                        i59--;
                        if (i59 < 0) {
                            break;
                        }
                        int i66 = i58 - ((this.f150693t - i59) * this.f150694u);
                        if (i66 > 0 && i66 < this.f150697x && ((ll3.h1) this.f150681e).d(i59) != null) {
                            canvas.drawText(((ll3.h1) this.f150681e).d(i59).f319168b, this.f150698y / 2, i66, this.f150685i);
                        }
                    }
                    int i67 = this.f150693t;
                    while (true) {
                        i67++;
                        if (i67 >= ((ll3.h1) this.f150681e).e()) {
                            break;
                        }
                        int i68 = ((i67 - this.f150693t) * this.f150694u) + i58;
                        if (i68 < this.f150697x && i68 > 0 && ((ll3.h1) this.f150681e).d(i67) != null) {
                            canvas.drawText(((ll3.h1) this.f150681e).d(i67).f319168b, this.f150698y / 2, i68, this.f150685i);
                        }
                    }
                }
            }
        }
        if (this.f150696w) {
            int i69 = this.f150695v;
            if (i69 != 0) {
                this.f150695v = (int) (i69 * 0.9f);
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        this.f150697x = i18;
        this.f150698y = i17;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f150682f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/music/ui/LyricView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/music/ui/LyricView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        int pointerId = motionEvent.getPointerId(0);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.A = motionEvent.getY();
            motionEvent.getX();
            this.B = this.f150695v;
            this.f150699z = true;
            this.f150696w = false;
            int findPointerIndex = motionEvent.findPointerIndex(pointerId);
            float y17 = findPointerIndex < 0 ? -1.0f : motionEvent.getY(findPointerIndex);
            this.C = y17;
            if (y17 == -1.0f) {
                return false;
            }
            if (2 == this.f150683g) {
                startNestedScroll(2);
            }
        } else if (action == 1) {
            this.f150699z = false;
        } else if (action == 2) {
            motionEvent.getX();
            int y18 = this.B - ((int) (motionEvent.getY() - this.A));
            if (y18 > 0) {
                int i17 = this.f150692s;
                if (y18 > i17) {
                    y18 = i17;
                }
                this.f150695v = y18;
            } else {
                int i18 = -this.f150691r;
                if (y18 < i18) {
                    y18 = i18;
                }
                this.f150695v = y18;
            }
            invalidate();
            if (2 == this.f150683g) {
                int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
                float y19 = findPointerIndex2 < 0 ? -1.0f : motionEvent.getY(findPointerIndex2);
                if (y19 == -1.0f) {
                    return false;
                }
                float f17 = y19 - this.C;
                dispatchNestedPreScroll(0, 0, this.D, this.E);
                dispatchNestedScroll(0, (int) f17, 0, 0, null);
            }
        }
        return true;
    }

    public void setCurrentTime(long j17) {
        int i17;
        if (this.f150680d != j17) {
            this.f150680d = j17;
            ll3.g1 g1Var = this.f150681e;
            if (g1Var == null || ((ll3.h1) g1Var).e() == 0) {
                return;
            }
            int i18 = -1;
            int i19 = 0;
            while (true) {
                int i27 = i19;
                i17 = i18;
                i18 = i27;
                if (i18 >= ((ll3.h1) this.f150681e).e() || ((ll3.h1) this.f150681e).d(i18).f319167a >= j17) {
                    break;
                }
                ((ll3.h1) this.f150681e).d(i18).getClass();
                i19 = i18 + 1;
            }
            if (this.f150699z || i17 == this.f150693t) {
                return;
            }
            this.f150693t = i17;
            int i28 = this.f150694u;
            this.f150691r = i17 * i28;
            this.f150692s = i28 * ((((ll3.h1) this.f150681e).e() - this.f150693t) - 1);
            if (this.f150695v == 0) {
                this.f150695v = -this.f150694u;
            }
            this.f150696w = true;
            invalidate();
        }
    }

    public void setLyricColor(int i17) {
        this.f150684h.setColor(i17);
        this.f150684h.setAlpha(255);
        this.f150685i.setColor(i17);
        this.f150685i.setAlpha(127);
    }

    public void setLyricObj(ll3.g1 g1Var) {
        this.f150681e = g1Var;
        invalidate();
    }

    public void setMode(int i17) {
        this.f150683g = i17;
        this.f150687n = 1 == i17;
    }

    public void setTextSize(float f17) {
        this.f150684h.setTextSize(f17);
        this.f150685i.setTextSize(f17);
    }

    public LyricView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f150683g = 1;
        this.f150686m = android.graphics.Paint.Align.CENTER;
        this.f150687n = false;
        this.f150688o = 0;
        int i18 = F;
        this.f150689p = i18;
        int i19 = G;
        this.f150690q = i19;
        this.f150693t = -1;
        int i27 = 0 + i18 + i19;
        this.f150694u = i27;
        this.f150695v = i27;
        this.D = new int[2];
        this.E = new int[2];
        a();
    }
}
