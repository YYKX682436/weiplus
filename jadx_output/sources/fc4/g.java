package fc4;

/* loaded from: classes4.dex */
public final class g extends com.tencent.mm.ui.component.UIComponent implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.VelocityTracker f261144d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f261145e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f261146f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.improve.view.flexible.FlexibleVideoView f261147g;

    /* renamed from: h, reason: collision with root package name */
    public xc4.p f261148h;

    /* renamed from: i, reason: collision with root package name */
    public float f261149i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f261150m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f261151n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f261152o;

    /* renamed from: p, reason: collision with root package name */
    public int f261153p;

    /* renamed from: q, reason: collision with root package name */
    public int f261154q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f261155r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f261156s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.GestureDetector f261157t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        android.view.VelocityTracker obtain = android.view.VelocityTracker.obtain();
        kotlin.jvm.internal.o.f(obtain, "obtain(...)");
        this.f261144d = obtain;
        this.f261149i = 1.0f;
        this.f261157t = new android.view.GestureDetector(getContext(), new fc4.a(this));
    }

    public static void O6(fc4.g gVar, boolean z17, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishImpl$default", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        gVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("finishImpl", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        gVar.P6(2);
        gVar.getActivity().setResult(-1, new android.content.Intent());
        gVar.getActivity().finish();
        if (z17) {
            gVar.getActivity().overridePendingTransition(0, 0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishImpl", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("finishImpl$default", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
    }

    public final void P6(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("publishExitStatus", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        com.tencent.mm.autogen.events.GalleryPhotoInfoEvent galleryPhotoInfoEvent = new com.tencent.mm.autogen.events.GalleryPhotoInfoEvent();
        int intExtra = getIntent().getIntExtra("sns_position", 0);
        am.ie ieVar = galleryPhotoInfoEvent.f54355g;
        ieVar.f6945a = intExtra;
        ieVar.f6949e = i17;
        xc4.p pVar = this.f261148h;
        ieVar.f6948d = pVar != null ? pVar.W0() : null;
        galleryPhotoInfoEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("publishExitStatus", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6() {
        /*
            Method dump skipped, instructions count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc4.g.Q6():void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        Q6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onBackPressed", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r17) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fc4.g.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        this.f261144d.recycle();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent event) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(event, "event");
        android.view.GestureDetector gestureDetector = this.f261157t;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(event);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0)), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        android.view.VelocityTracker velocityTracker = this.f261144d;
        velocityTracker.addMovement(event);
        int action = event.getAction() & 255;
        if (action == 1) {
            velocityTracker.clear();
            if (this.f261151n) {
                view.setPivotX(view.getWidth() / 2);
                view.setPivotY(view.getHeight() / 2);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                android.view.View view2 = this.f261146f;
                if (view2 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList3.add(java.lang.Float.valueOf(1.0f));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view2.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
                this.f261149i = 1.0f;
                this.f261150m = false;
                this.f261152o = false;
                android.view.View view3 = this.f261145e;
                if (view3 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
                return true;
            }
            if (this.f261150m && !this.f261152o) {
                Q6();
                yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
                return true;
            }
            this.f261152o = false;
            view.setLongClickable(true);
        } else if (action == 2) {
            velocityTracker.computeCurrentVelocity(1000);
            int xVelocity = (int) velocityTracker.getXVelocity();
            int yVelocity = (int) velocityTracker.getYVelocity();
            float translationX = view.getTranslationX();
            float translationY = view.getTranslationY();
            this.f261153p = (int) translationX;
            this.f261154q = (int) translationY;
            if ((java.lang.Math.abs(translationX) > 250.0f || java.lang.Math.abs(yVelocity) <= java.lang.Math.abs(xVelocity) || yVelocity <= 0 || this.f261152o) && !this.f261150m) {
                this.f261150m = false;
            } else {
                float height = 1 - (translationY / view.getHeight());
                float f17 = height <= 1.0f ? height : 1.0f;
                if (((yVelocity > 0 && f17 < this.f261149i) || yVelocity < 0) && f17 >= 0.5d) {
                    this.f261149i = f17;
                    view.setPivotX(view.getWidth() / 2);
                    view.setPivotY(view.getHeight() / 2);
                    view.setScaleX(f17);
                    view.setScaleY(f17);
                    view.setTranslationY(translationY);
                    android.view.View view4 = this.f261146f;
                    if (view4 != null) {
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList5.add(java.lang.Float.valueOf(f17));
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view4.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
                        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    }
                    android.view.View view5 = this.f261145e;
                    if (view5 != null) {
                        java.util.ArrayList arrayList6 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
                        arrayList6.add(4);
                        java.util.Collections.reverse(arrayList6);
                        yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    if (!this.f261155r) {
                        this.f261155r = true;
                        P6(1);
                    }
                }
                this.f261150m = true;
            }
            if (translationY > 200.0f) {
                this.f261151n = false;
            } else if (translationY > 10.0f) {
                this.f261151n = true;
            }
            if (translationY > 50.0f) {
                view.setLongClickable(false);
            }
            boolean z17 = this.f261150m;
            yj0.a.i(z17, this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
            return z17;
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleAnimationUIC", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouch", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleAnimationUIC");
        return false;
    }
}
