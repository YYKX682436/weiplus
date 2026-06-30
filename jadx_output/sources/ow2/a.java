package ow2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: k, reason: collision with root package name */
    public static final double f349363k = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().xdpi / 2.54d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f349364a;

    /* renamed from: b, reason: collision with root package name */
    public float f349365b;

    /* renamed from: c, reason: collision with root package name */
    public float f349366c;

    /* renamed from: d, reason: collision with root package name */
    public float f349367d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Rect f349368e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f349369f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f349370g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f349371h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f349372i;

    /* renamed from: j, reason: collision with root package name */
    public yz5.a f349373j;

    public a(boolean z17) {
        this.f349364a = z17;
    }

    public static final void b(ow2.a aVar, android.view.MotionEvent motionEvent, float f17, float f18) {
        aVar.f349367d = f17;
        yz5.l lVar = aVar.f349370g;
        if (lVar != null) {
            lVar.invoke(java.lang.Float.valueOf(f17));
        }
        aVar.f349365b = f18;
        com.tencent.mars.xlog.Log.i("FinderSpeedGestureDetector", "onSpeedChange " + motionEvent.getX(0));
    }

    public final void a(android.view.MotionEvent motionEvent) {
        android.graphics.Rect rect;
        yz5.a aVar;
        if (motionEvent == null) {
            return;
        }
        int action = motionEvent.getAction() & 255;
        motionEvent.getX(0);
        int y17 = (int) motionEvent.getY(0);
        boolean z17 = (this.f349364a && ((float) y17) - this.f349366c > ((float) ym5.x.a(com.tencent.mm.sdk.platformtools.x2.f193071a, (float) ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.M3).getValue()).r()).intValue()))) || ((rect = this.f349368e) != null && y17 >= rect.top);
        if (action != 1) {
            if (action == 2) {
                float x17 = motionEvent.getX(0) - this.f349365b;
                float y18 = motionEvent.getY(0) - this.f349366c;
                double abs = java.lang.Math.abs(x17);
                double d17 = f349363k;
                boolean z18 = abs > d17 && !z17 && ((double) y18) < ((double) 1.5f) * d17;
                com.tencent.mars.xlog.Log.i("FinderSpeedGestureDetector", "touch:" + motionEvent.getX(0) + " init:" + this.f349365b + " offsetX:" + x17 + " absOffsetX:" + java.lang.Math.abs(x17) + " offsetY:" + y18 + " isTouchInLockArea:" + z17 + " threshold:" + d17 + " yThreshold:" + (1.5f * d17) + " handleX:" + z18);
                if (z18) {
                    if (x17 > 0.0f) {
                        float f17 = this.f349367d;
                        if (f17 == 1.5f) {
                            b(this, motionEvent, 2.0f, motionEvent.getX(0));
                        } else {
                            if (f17 == 2.0f) {
                                b(this, motionEvent, 3.0f, motionEvent.getX(0));
                            }
                        }
                    } else {
                        float f18 = this.f349367d;
                        if (f18 == 3.0f) {
                            b(this, motionEvent, 2.0f, motionEvent.getX(0));
                        } else {
                            if (f18 == 2.0f) {
                                b(this, motionEvent, 1.5f, motionEvent.getX(0));
                            }
                        }
                    }
                }
                if (z17) {
                    if (this.f349369f) {
                        return;
                    }
                    yz5.a aVar2 = this.f349371h;
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    this.f349369f = true;
                    return;
                }
                if (this.f349369f) {
                    yz5.a aVar3 = this.f349372i;
                    if (aVar3 != null) {
                        aVar3.invoke();
                    }
                    this.f349369f = false;
                    return;
                }
                return;
            }
            if (action != 3) {
                return;
            }
        }
        if (!z17 || (aVar = this.f349373j) == null) {
            return;
        }
        aVar.invoke();
    }

    public final void c(float f17, android.view.MotionEvent motionEvent, android.graphics.Rect rect) {
        this.f349367d = f17;
        this.f349365b = motionEvent != null ? motionEvent.getX(0) : 0.0f;
        this.f349366c = motionEvent != null ? motionEvent.getY(0) : 0.0f;
        this.f349368e = rect;
        this.f349369f = false;
        com.tencent.mars.xlog.Log.i("FinderSpeedGestureDetector", "onTriggerSpeedPlay " + this.f349365b + ' ' + this.f349366c + " rect:" + this.f349368e);
    }
}
