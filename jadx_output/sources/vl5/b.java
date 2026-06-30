package vl5;

/* loaded from: classes15.dex */
public class b extends vl5.u implements android.view.View.OnTouchListener, android.view.GestureDetector.OnGestureListener {
    public boolean A;
    public final int B;
    public final int C;
    public final int D;
    public boolean E;
    public final com.tencent.mm.ui.widget.sortlist.DragSortListView F;
    public int G;

    /* renamed from: h, reason: collision with root package name */
    public int f437906h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f437907i;

    /* renamed from: m, reason: collision with root package name */
    public int f437908m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f437909n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f437910o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.GestureDetector f437911p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.GestureDetector f437912q;

    /* renamed from: r, reason: collision with root package name */
    public final int f437913r;

    /* renamed from: s, reason: collision with root package name */
    public int f437914s;

    /* renamed from: t, reason: collision with root package name */
    public int f437915t;

    /* renamed from: u, reason: collision with root package name */
    public int f437916u;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f437917v;

    /* renamed from: w, reason: collision with root package name */
    public int f437918w;

    /* renamed from: x, reason: collision with root package name */
    public int f437919x;

    /* renamed from: y, reason: collision with root package name */
    public int f437920y;

    /* renamed from: z, reason: collision with root package name */
    public int f437921z;

    public b(com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView, int i17, int i18, int i19, int i27, int i28) {
        super(dragSortListView);
        this.f437906h = 0;
        this.f437907i = true;
        this.f437909n = false;
        this.f437910o = false;
        this.f437914s = -1;
        this.f437915t = -1;
        this.f437916u = -1;
        this.f437917v = new int[2];
        this.A = false;
        vl5.a aVar = new vl5.a(this);
        this.F = dragSortListView;
        this.f437911p = new android.view.GestureDetector(dragSortListView.getContext(), this);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(dragSortListView.getContext(), aVar);
        this.f437912q = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f437913r = android.view.ViewConfiguration.get(dragSortListView.getContext()).getScaledTouchSlop();
        this.B = i17;
        this.C = i27;
        this.D = i28;
        this.f437908m = i19;
        this.f437906h = i18;
    }

    public boolean a(int i17, int i18, int i19) {
        int i27 = (!this.f437907i || this.f437910o) ? 0 : 12;
        if (this.f437909n && this.f437910o) {
            i27 = i27 | 1 | 2;
        }
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.F;
        boolean w17 = dragSortListView.w(i17 - dragSortListView.getHeaderViewsCount(), i27, i18, i19);
        this.A = w17;
        return w17;
    }

    public int b(android.view.MotionEvent motionEvent, int i17) {
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.F;
        int pointToPosition = dragSortListView.pointToPosition(x17, y17);
        int headerViewsCount = dragSortListView.getHeaderViewsCount();
        int footerViewsCount = dragSortListView.getFooterViewsCount();
        int count = dragSortListView.getCount();
        if (pointToPosition != -1 && pointToPosition >= headerViewsCount && pointToPosition < count - footerViewsCount) {
            android.view.View childAt = dragSortListView.getChildAt(pointToPosition - dragSortListView.getFirstVisiblePosition());
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            android.view.View findViewById = i17 == 0 ? childAt : childAt.findViewById(i17);
            if (findViewById != null) {
                int[] iArr = this.f437917v;
                findViewById.getLocationOnScreen(iArr);
                int i18 = iArr[0];
                if (rawX > i18 && rawY > iArr[1] && rawX < i18 + findViewById.getWidth() && rawY < iArr[1] + findViewById.getHeight()) {
                    this.f437918w = childAt.getLeft();
                    this.f437919x = childAt.getTop();
                    return pointToPosition;
                }
            }
        }
        return -1;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent motionEvent) {
        if (this.f437909n && this.f437908m == 0) {
            this.f437916u = b(motionEvent, this.C);
        }
        int b17 = b(motionEvent, this.B);
        this.f437914s = b17;
        if (b17 != -1 && this.f437906h == 0) {
            a(b17, ((int) motionEvent.getX()) - this.f437918w, ((int) motionEvent.getY()) - this.f437919x);
        }
        this.f437910o = false;
        this.E = true;
        this.G = 0;
        this.f437915t = this.f437908m == 1 ? b(motionEvent, this.D) : -1;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        if (this.f437914s != -1 && this.f437906h == 2) {
            this.F.performHapticFeedback(0);
            a(this.f437914s, this.f437920y - this.f437918w, this.f437921z - this.f437919x);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/GestureDetector$OnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18) {
        int i17;
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        int x18 = (int) motionEvent2.getX();
        int y18 = (int) motionEvent2.getY();
        int i18 = x18 - this.f437918w;
        int i19 = y18 - this.f437919x;
        if (this.E && !this.A && ((i17 = this.f437914s) != -1 || this.f437915t != -1)) {
            int i27 = this.f437913r;
            if (i17 != -1) {
                if (this.f437906h == 1 && java.lang.Math.abs(y18 - y17) > i27 && this.f437907i) {
                    a(this.f437914s, i18, i19);
                } else if (this.f437906h != 0 && java.lang.Math.abs(x18 - x17) > i27 && this.f437909n) {
                    this.f437910o = true;
                    a(this.f437915t, i18, i19);
                }
            } else if (this.f437915t != -1) {
                if (java.lang.Math.abs(x18 - x17) > i27 && this.f437909n) {
                    this.f437910o = true;
                    a(this.f437915t, i18, i19);
                } else if (java.lang.Math.abs(y18 - y17) > i27) {
                    this.E = false;
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(android.view.MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        if (this.f437909n && this.f437908m == 0 && (i17 = this.f437916u) != -1) {
            com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.F;
            int headerViewsCount = i17 - dragSortListView.getHeaderViewsCount();
            dragSortListView.F1 = false;
            dragSortListView.u(headerViewsCount, 0.0f);
        }
        yj0.a.i(true, this, "com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/GestureDetector$OnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mm.ui.widget.sortlist.DragSortListView dragSortListView = this.F;
        if (!dragSortListView.f212512y || dragSortListView.H1) {
            yj0.a.i(false, this, "com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        android.view.GestureDetector gestureDetector = this.f437911p;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(motionEvent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(gestureDetector, arrayList2.toArray(), "com/tencent/mm/ui/widget/sortlist/DragSortController", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList2.get(0)), "com/tencent/mm/ui/widget/sortlist/DragSortController", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (this.f437909n && this.A && this.f437908m == 1) {
            android.view.GestureDetector gestureDetector2 = this.f437912q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(motionEvent);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(gestureDetector2, arrayList3.toArray(), "com/tencent/mm/ui/widget/sortlist/DragSortController", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            yj0.a.g(gestureDetector2, gestureDetector2.onTouchEvent((android.view.MotionEvent) arrayList3.get(0)), "com/tencent/mm/ui/widget/sortlist/DragSortController", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        }
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f437920y = (int) motionEvent.getX();
            this.f437921z = (int) motionEvent.getY();
        } else if (action != 1) {
            if (action == 3) {
                this.f437910o = false;
                this.A = false;
            }
        } else if (this.f437909n && this.f437910o) {
            int i17 = this.G;
            if (i17 < 0) {
                i17 = -i17;
            }
            if (i17 > dragSortListView.getWidth() / 2) {
                dragSortListView.F1 = true;
                dragSortListView.x(true, 0.0f);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/widget/sortlist/DragSortController", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
