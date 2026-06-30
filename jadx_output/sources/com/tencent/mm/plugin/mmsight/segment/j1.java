package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class j1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public int f149041d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f149042e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f149043f;

    /* renamed from: g, reason: collision with root package name */
    public int f149044g;

    /* renamed from: h, reason: collision with root package name */
    public float f149045h;

    /* renamed from: i, reason: collision with root package name */
    public float f149046i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.SliderSeekBar f149047m;

    public j1(com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar) {
        this.f149047m = sliderSeekBar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar sliderSeekBar = this.f149047m;
        if (!sliderSeekBar.f148940e) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!sliderSeekBar.c(true) && !sliderSeekBar.c(false)) {
                        yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return false;
                    }
                    if (sliderSeekBar.f148941f) {
                        yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return true;
                    }
                    this.f149044g = 0;
                    boolean z17 = false;
                    while (this.f149044g < motionEvent.getPointerCount()) {
                        int pointerId = motionEvent.getPointerId(this.f149044g);
                        this.f149043f = pointerId;
                        int i17 = this.f149041d;
                        if (pointerId == i17 || pointerId == this.f149042e) {
                            boolean f17 = sliderSeekBar.f(pointerId == i17, motionEvent.getX(this.f149044g));
                            if (sliderSeekBar.f148945m && f17 && !sliderSeekBar.f148944i) {
                                sliderSeekBar.performHapticFeedback(0, 2);
                            }
                            sliderSeekBar.f148944i = f17;
                            com.tencent.mm.plugin.mmsight.segment.k1 k1Var = sliderSeekBar.f148939d;
                            if (k1Var != null) {
                                k1Var.a(this.f149043f == this.f149041d);
                            }
                            z17 = true;
                        }
                        this.f149044g++;
                    }
                    yj0.a.i(z17, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return z17;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            return false;
                        }
                    }
                }
            }
            int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f149043f = pointerId2;
            int i18 = this.f149041d;
            if (pointerId2 != i18 && pointerId2 != this.f149042e) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            com.tencent.mm.plugin.mmsight.segment.k1 k1Var2 = sliderSeekBar.f148939d;
            if (k1Var2 != null) {
                k1Var2.c(pointerId2 == i18);
            }
            com.tencent.mm.plugin.mmsight.segment.SliderSeekBar.a(sliderSeekBar, this.f149043f == this.f149041d, false);
            if (this.f149043f == this.f149041d) {
                this.f149041d = -1;
            } else {
                this.f149042e = -1;
            }
            sliderSeekBar.f148944i = false;
            yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        int actionIndex = motionEvent.getActionIndex();
        this.f149044g = actionIndex;
        this.f149043f = motionEvent.getPointerId(actionIndex);
        this.f149045h = motionEvent.getX(this.f149044g);
        float y17 = motionEvent.getY(this.f149044g);
        this.f149046i = y17;
        if (com.tencent.mm.plugin.mmsight.segment.SliderSeekBar.b(sliderSeekBar, sliderSeekBar.f148946n, this.f149045h, y17)) {
            if (sliderSeekBar.c(true)) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            com.tencent.mm.plugin.mmsight.segment.k1 k1Var3 = sliderSeekBar.f148939d;
            if (k1Var3 != null) {
                k1Var3.b(true);
            }
            this.f149041d = this.f149043f;
            int i19 = sliderSeekBar.f148946n.getBounds().left;
            sliderSeekBar.getClass();
            com.tencent.mm.plugin.mmsight.segment.SliderSeekBar.a(sliderSeekBar, true, true);
            yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (!com.tencent.mm.plugin.mmsight.segment.SliderSeekBar.b(sliderSeekBar, sliderSeekBar.f148947o, this.f149045h, this.f149046i)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (sliderSeekBar.c(false)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        com.tencent.mm.plugin.mmsight.segment.k1 k1Var4 = sliderSeekBar.f148939d;
        if (k1Var4 != null) {
            k1Var4.b(false);
        }
        this.f149042e = this.f149043f;
        int i27 = sliderSeekBar.f148947o.getBounds().right;
        sliderSeekBar.getClass();
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar.a(sliderSeekBar, false, true);
        yj0.a.i(true, this, "com/tencent/mm/plugin/mmsight/segment/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
