package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes15.dex */
public class h4 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public int f151850d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f151851e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f151852f;

    /* renamed from: g, reason: collision with root package name */
    public int f151853g;

    /* renamed from: h, reason: collision with root package name */
    public float f151854h;

    /* renamed from: i, reason: collision with root package name */
    public float f151855i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.SliderSeekBar f151856m;

    public h4(com.tencent.mm.plugin.mv.ui.view.SliderSeekBar sliderSeekBar) {
        this.f151856m = sliderSeekBar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.plugin.mv.ui.view.SliderSeekBar sliderSeekBar = this.f151856m;
        if (!sliderSeekBar.f151735d) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (!sliderSeekBar.e(true) && !sliderSeekBar.e(false)) {
                        yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return false;
                    }
                    if (sliderSeekBar.f151736e) {
                        yj0.a.i(true, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                        return true;
                    }
                    this.f151853g = 0;
                    boolean z17 = false;
                    while (this.f151853g < motionEvent.getPointerCount()) {
                        int pointerId = motionEvent.getPointerId(this.f151853g);
                        this.f151852f = pointerId;
                        int i17 = this.f151850d;
                        if (pointerId == i17 || pointerId == this.f151851e) {
                            boolean f17 = sliderSeekBar.f(pointerId == i17, motionEvent.getX(this.f151853g));
                            if (sliderSeekBar.f151740i && f17 && !sliderSeekBar.f151739h) {
                                sliderSeekBar.performHapticFeedback(0, 2);
                            }
                            sliderSeekBar.f151739h = f17;
                            sliderSeekBar.getClass();
                            z17 = true;
                        }
                        this.f151853g++;
                    }
                    yj0.a.i(z17, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                    return z17;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                            return false;
                        }
                    }
                }
            }
            int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f151852f = pointerId2;
            if (pointerId2 != this.f151850d && pointerId2 != this.f151851e) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            sliderSeekBar.getClass();
            com.tencent.mm.plugin.mv.ui.view.SliderSeekBar.a(sliderSeekBar, this.f151852f == this.f151850d, false);
            if (this.f151852f == this.f151850d) {
                this.f151850d = -1;
            } else {
                this.f151851e = -1;
            }
            sliderSeekBar.f151739h = false;
            yj0.a.i(true, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        int actionIndex = motionEvent.getActionIndex();
        this.f151853g = actionIndex;
        this.f151852f = motionEvent.getPointerId(actionIndex);
        this.f151854h = motionEvent.getX(this.f151853g);
        float y17 = motionEvent.getY(this.f151853g);
        this.f151855i = y17;
        if (com.tencent.mm.plugin.mv.ui.view.SliderSeekBar.b(sliderSeekBar, sliderSeekBar.f151741m, this.f151854h, y17)) {
            if (sliderSeekBar.e(true)) {
                yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
            sliderSeekBar.getClass();
            this.f151850d = this.f151852f;
            int i18 = sliderSeekBar.f151741m.getBounds().left;
            sliderSeekBar.getClass();
            com.tencent.mm.plugin.mv.ui.view.SliderSeekBar.a(sliderSeekBar, true, true);
            yj0.a.i(true, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (!com.tencent.mm.plugin.mv.ui.view.SliderSeekBar.b(sliderSeekBar, sliderSeekBar.f151742n, this.f151854h, this.f151855i)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        if (sliderSeekBar.e(false)) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        sliderSeekBar.getClass();
        this.f151851e = this.f151852f;
        int i19 = sliderSeekBar.f151742n.getBounds().right;
        sliderSeekBar.getClass();
        com.tencent.mm.plugin.mv.ui.view.SliderSeekBar.a(sliderSeekBar, false, true);
        yj0.a.i(true, this, "com/tencent/mm/plugin/mv/ui/view/SliderSeekBar$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
