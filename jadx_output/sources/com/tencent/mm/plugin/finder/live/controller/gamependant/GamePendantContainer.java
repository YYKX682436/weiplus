package com.tencent.mm.plugin.finder.live.controller.gamependant;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/gamependant/GamePendantContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class GamePendantContainer extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f111585d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f111586e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f111587f;

    /* renamed from: g, reason: collision with root package name */
    public float f111588g;

    /* renamed from: h, reason: collision with root package name */
    public float f111589h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePendantContainer(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f111585d = "Finder.GamePendantContainer";
        this.f111586e = new java.util.ArrayList();
        this.f111587f = new java.util.ArrayList();
        this.f111588g = -1.0f;
        this.f111589h = -1.0f;
    }

    public final android.graphics.RectF a(android.graphics.RectF rectF) {
        kotlin.jvm.internal.o.g(rectF, "<this>");
        return new android.graphics.RectF(i65.a.a(getContext(), rectF.left), i65.a.a(getContext(), rectF.top), i65.a.a(getContext(), rectF.right), i65.a.a(getContext(), rectF.bottom));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Object obj;
        java.lang.Object obj2;
        if (motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        java.util.ArrayList arrayList = this.f111586e;
        java.util.ArrayList arrayList2 = this.f111587f;
        java.lang.String str = this.f111585d;
        java.lang.Object obj3 = null;
        if (action == 0) {
            this.f111588g = motionEvent.getX();
            this.f111589h = motionEvent.getY();
            com.tencent.mars.xlog.Log.i(str, "down:" + motionEvent.getX() + ", " + motionEvent.getY());
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((android.graphics.RectF) obj).contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            }
            if (obj == null) {
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (((android.graphics.RectF) obj2).contains(motionEvent.getX(), motionEvent.getY())) {
                        break;
                    }
                }
                if (obj2 == null) {
                    requestDisallowInterceptTouchEvent(false);
                }
            }
            requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 3) {
            com.tencent.mars.xlog.Log.i(str, "resetTouchPosition");
            this.f111588g = -1.0f;
            this.f111589h = -1.0f;
            requestDisallowInterceptTouchEvent(false);
        }
        if (motionEvent.getAction() == 2 && this.f111588g >= 0.0f && this.f111589h >= 0.0f) {
            float abs = java.lang.Math.abs(motionEvent.getX() - this.f111588g);
            float abs2 = java.lang.Math.abs(motionEvent.getY() - this.f111589h);
            int scaledTouchSlop = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop() / 2;
            com.tencent.mars.xlog.Log.i(str, "distanceX:" + abs + ", distanceY:" + abs2 + ", slop:" + scaledTouchSlop + ", ev.x:" + motionEvent.getX() + ", ev.y:" + motionEvent.getY());
            float f17 = (float) scaledTouchSlop;
            if (abs > f17 || abs2 > f17) {
                if (abs > abs2) {
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it7.next();
                        if (((android.graphics.RectF) next).contains(motionEvent.getX(), motionEvent.getY())) {
                            obj3 = next;
                            break;
                        }
                    }
                    android.graphics.RectF rectF = (android.graphics.RectF) obj3;
                    if (rectF != null) {
                        com.tencent.mars.xlog.Log.i(str, "hitHorizontalRect:" + rectF);
                    } else {
                        requestDisallowInterceptTouchEvent(false);
                    }
                } else {
                    java.util.Iterator it8 = arrayList.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        java.lang.Object next2 = it8.next();
                        if (((android.graphics.RectF) next2).contains(motionEvent.getX(), motionEvent.getY())) {
                            obj3 = next2;
                            break;
                        }
                    }
                    android.graphics.RectF rectF2 = (android.graphics.RectF) obj3;
                    if (rectF2 != null) {
                        com.tencent.mars.xlog.Log.i(str, "hitVerticalRect:" + rectF2);
                    } else {
                        requestDisallowInterceptTouchEvent(false);
                    }
                }
                com.tencent.mars.xlog.Log.i(str, "resetTouchPosition");
                this.f111588g = -1.0f;
                this.f111589h = -1.0f;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        super.requestDisallowInterceptTouchEvent(z17);
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.requestDisallowInterceptTouchEvent(z17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePendantContainer(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f111585d = "Finder.GamePendantContainer";
        this.f111586e = new java.util.ArrayList();
        this.f111587f = new java.util.ArrayList();
        this.f111588g = -1.0f;
        this.f111589h = -1.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePendantContainer(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f111585d = "Finder.GamePendantContainer";
        this.f111586e = new java.util.ArrayList();
        this.f111587f = new java.util.ArrayList();
        this.f111588g = -1.0f;
        this.f111589h = -1.0f;
    }
}
