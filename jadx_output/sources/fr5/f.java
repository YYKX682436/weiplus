package fr5;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final fr5.c f265920a;

    /* renamed from: b, reason: collision with root package name */
    public final int f265921b;

    /* renamed from: c, reason: collision with root package name */
    public final int f265922c;

    /* renamed from: d, reason: collision with root package name */
    public float f265923d;

    /* renamed from: e, reason: collision with root package name */
    public float f265924e;

    /* renamed from: f, reason: collision with root package name */
    public float f265925f;

    /* renamed from: g, reason: collision with root package name */
    public int f265926g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.GestureDetector f265927h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f265928i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f265929j;

    /* renamed from: k, reason: collision with root package name */
    public float f265930k;

    /* renamed from: l, reason: collision with root package name */
    public float f265931l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f265932m;

    /* renamed from: n, reason: collision with root package name */
    public float f265933n;

    /* renamed from: o, reason: collision with root package name */
    public float f265934o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f265935p;

    public f(android.content.Context mContext, fr5.c mListener, android.os.Handler handler, int i17, kotlin.jvm.internal.i iVar) {
        handler = (i17 & 4) != 0 ? null : handler;
        kotlin.jvm.internal.o.g(mContext, "mContext");
        kotlin.jvm.internal.o.g(mListener, "mListener");
        this.f265920a = mListener;
        int scaledTouchSlop = android.view.ViewConfiguration.get(mContext).getScaledTouchSlop() * 2;
        this.f265921b = scaledTouchSlop;
        this.f265922c = scaledTouchSlop;
        int i18 = mContext.getApplicationInfo().targetSdkVersion;
        if (i18 > 18) {
            this.f265929j = true;
            if (this.f265927h == null) {
                this.f265927h = new android.view.GestureDetector(mContext, new fr5.e(this), handler);
            }
        }
        if (i18 > 22) {
            this.f265932m = true;
        }
    }

    public final boolean a() {
        return this.f265926g != 0;
    }

    public final boolean b(android.view.MotionEvent event) {
        float f17;
        float f18;
        kotlin.jvm.internal.o.g(event, "event");
        event.getEventTime();
        int actionMasked = event.getActionMasked();
        boolean z17 = false;
        if (this.f265929j) {
            android.view.GestureDetector gestureDetector = this.f265927h;
            kotlin.jvm.internal.o.d(gestureDetector);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(event);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/zoomimage/view/zoom/internal/FasterScaleGestureDetector", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/zoomimage/view/zoom/internal/FasterScaleGestureDetector", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        int pointerCount = event.getPointerCount();
        boolean z18 = (event.getButtonState() & 32) != 0;
        boolean z19 = this.f265926g == 2 && !z18;
        boolean z27 = actionMasked == 1 || actionMasked == 3 || z19;
        fr5.c cVar = this.f265920a;
        float f19 = 0.0f;
        if (actionMasked == 0 || z27) {
            if (this.f265935p) {
                fr5.d dVar = (fr5.d) cVar;
                dVar.getClass();
                yz5.l lVar = dVar.f265911c;
                if (lVar != null) {
                    lVar.invoke(this);
                }
                this.f265935p = false;
                this.f265923d = 0.0f;
                this.f265926g = 0;
            } else if (a() && z27) {
                this.f265935p = false;
                this.f265923d = 0.0f;
                this.f265926g = 0;
            }
            if (z27) {
                return true;
            }
        }
        if (!this.f265935p && this.f265932m && !a() && !z27 && z18) {
            this.f265924e = event.getX();
            this.f265925f = event.getY();
            this.f265926g = 2;
            this.f265923d = 0.0f;
        }
        boolean z28 = actionMasked == 0 || actionMasked == 6 || actionMasked == 5 || z19;
        boolean z29 = actionMasked == 6;
        int actionIndex = z29 ? event.getActionIndex() : -1;
        int i17 = z29 ? pointerCount - 1 : pointerCount;
        if (a()) {
            f18 = this.f265924e;
            f17 = this.f265925f;
            this.f265928i = event.getY() < f17;
        } else {
            float f27 = 0.0f;
            float f28 = 0.0f;
            for (int i18 = 0; i18 < pointerCount; i18++) {
                if (actionIndex != i18) {
                    f27 += event.getX(i18);
                    f28 += event.getY(i18);
                }
            }
            float f29 = i17;
            float f37 = f27 / f29;
            f17 = f28 / f29;
            f18 = f37;
        }
        float f38 = 0.0f;
        for (int i19 = 0; i19 < pointerCount; i19++) {
            if (actionIndex != i19) {
                f19 += java.lang.Math.abs(event.getX(i19) - f18);
                f38 += java.lang.Math.abs(event.getY(i19) - f17);
            }
        }
        float f39 = i17;
        float f47 = f19 / f39;
        float f48 = f38 / f39;
        float f49 = 2;
        float f57 = f47 * f49;
        float f58 = f48 * f49;
        if (!a()) {
            f58 = (float) java.lang.Math.hypot(f57, f58);
        }
        boolean z37 = this.f265935p;
        this.f265930k = f18;
        this.f265931l = f17;
        boolean a17 = a();
        int i27 = this.f265922c;
        if (!a17 && this.f265935p && (f58 < i27 || z28)) {
            fr5.d dVar2 = (fr5.d) cVar;
            dVar2.getClass();
            yz5.l lVar2 = dVar2.f265911c;
            if (lVar2 != null) {
                lVar2.invoke(this);
            }
            this.f265935p = false;
            this.f265923d = f58;
        }
        if (z28) {
            this.f265933n = f58;
            this.f265934o = f58;
            this.f265923d = f58;
        }
        boolean a18 = a();
        int i28 = this.f265921b;
        if (a18) {
            i27 = i28;
        }
        if (!this.f265935p && f58 >= i27 && (z37 || java.lang.Math.abs(f58 - this.f265923d) > i28)) {
            this.f265933n = f58;
            this.f265934o = f58;
            fr5.d dVar3 = (fr5.d) cVar;
            dVar3.getClass();
            yz5.l lVar3 = dVar3.f265910b;
            this.f265935p = lVar3 != null ? ((java.lang.Boolean) lVar3.invoke(this)).booleanValue() : true;
        }
        if (actionMasked == 2) {
            this.f265933n = f58;
            if (this.f265935p) {
                fr5.d dVar4 = (fr5.d) cVar;
                dVar4.getClass();
                yz5.l lVar4 = dVar4.f265909a;
                if (lVar4 != null) {
                    z17 = ((java.lang.Boolean) lVar4.invoke(this)).booleanValue();
                }
            } else {
                z17 = true;
            }
            if (z17) {
                this.f265934o = this.f265933n;
            }
        }
        return true;
    }
}
