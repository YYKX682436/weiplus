package we4;

/* loaded from: classes13.dex */
public class c extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public long f445288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sport.ui.SportChartView f445289e;

    public c(com.tencent.mm.plugin.sport.ui.SportChartView sportChartView) {
        this.f445289e = sportChartView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onDoubleTap = super.onDoubleTap(motionEvent);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportChartView", "onScroll %.2f", java.lang.Float.valueOf(f17));
        if (java.lang.System.currentTimeMillis() - this.f445288d >= 500) {
            com.tencent.mm.plugin.sport.ui.SportChartView sportChartView = this.f445289e;
            if (sportChartView.f171857y0) {
                this.f445288d = java.lang.System.currentTimeMillis();
                if (f17 > 0.0f) {
                    int i17 = sportChartView.M + 1;
                    sportChartView.M = i17;
                    int i18 = sportChartView.N;
                    if (i17 > i18) {
                        sportChartView.M = i18;
                    }
                    com.tencent.mm.plugin.sport.ui.SportChartView.a(sportChartView, false);
                    sportChartView.invalidate();
                    return true;
                }
                if (f17 < 0.0f) {
                    int i19 = sportChartView.M - 1;
                    sportChartView.M = i19;
                    if (i19 < 1) {
                        sportChartView.M = 1;
                    }
                    com.tencent.mm.plugin.sport.ui.SportChartView.a(sportChartView, false);
                    sportChartView.invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        com.tencent.mm.plugin.sport.ui.SportChartView sportChartView = this.f445289e;
        sportChartView.f171839i = Integer.MAX_VALUE;
        if (sportChartView.R.length > 0) {
            int i17 = 0;
            while (true) {
                we4.e[] eVarArr = sportChartView.R;
                if (i17 >= eVarArr.length) {
                    break;
                }
                if (i17 == 0) {
                    if (x17 < eVarArr[i17].f445295c + (sportChartView.K / 2) && x17 > 0.0f) {
                        sportChartView.f171839i = i17;
                        sportChartView.invalidate();
                        break;
                    }
                    i17++;
                } else if (i17 > 0 && i17 < eVarArr.length - 1) {
                    float f17 = eVarArr[i17].f445295c;
                    float f18 = sportChartView.K / 2;
                    if (x17 < f18 + f17 && x17 > f17 - f18) {
                        sportChartView.f171839i = i17;
                        sportChartView.invalidate();
                        break;
                    }
                    i17++;
                } else {
                    if (i17 != eVarArr.length - 1) {
                        sportChartView.f171839i = Integer.MAX_VALUE;
                        break;
                    }
                    if (x17 < sportChartView.f171841m && x17 > eVarArr[i17].f445295c - (sportChartView.K / 2)) {
                        sportChartView.f171839i = i17;
                        sportChartView.invalidate();
                        break;
                    }
                    i17++;
                }
            }
        }
        sportChartView.f171839i = sportChartView.f171839i;
        int i18 = 0;
        while (true) {
            int i19 = sportChartView.Q;
            if (i18 >= i19) {
                sportChartView.f171855x0 = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.Sport.SportChartView", "onSingleTapUp %s %s %d", java.lang.Float.valueOf(x17), java.lang.Float.valueOf(y17), java.lang.Integer.valueOf(sportChartView.f171839i));
                sportChartView.invalidate();
                yj0.a.i(true, this, "com/tencent/mm/plugin/sport/ui/SportChartView$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
                return true;
            }
            if (i18 == i19 - 1) {
                sportChartView.R[i18].f445297e = true;
            } else {
                sportChartView.R[i18].f445297e = false;
            }
            i18++;
        }
    }
}
