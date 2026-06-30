package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class RecyclerView extends android.view.ViewGroup implements n3.o0, n3.d0 {
    public static boolean Y1;
    public static boolean Z1;

    /* renamed from: a2 */
    public static final int[] f214388a2 = {android.R.attr.nestedScrollingEnabled};

    /* renamed from: b2 */
    public static final float f214389b2 = (float) (java.lang.Math.log(0.78d) / java.lang.Math.log(0.9d));

    /* renamed from: c2 */
    public static final boolean f214390c2 = true;

    /* renamed from: d2 */
    public static final boolean f214391d2 = true;

    /* renamed from: e2 */
    public static final boolean f214392e2 = true;

    /* renamed from: f2 */
    public static final java.lang.Class[] f214393f2;

    /* renamed from: g2 */
    public static final android.view.animation.Interpolator f214394g2;

    /* renamed from: h2 */
    public static final com.tencent.mm.xcompat.recyclerview.widget.v1 f214395h2;
    public boolean A;
    public final float A1;
    public int B;
    public boolean B1;
    public boolean C;
    public final com.tencent.mm.xcompat.recyclerview.widget.x1 C1;
    public boolean D;
    public com.tencent.mm.xcompat.recyclerview.widget.z D1;
    public boolean E;
    public final com.tencent.mm.xcompat.recyclerview.widget.x E1;
    public int F;
    public final com.tencent.mm.xcompat.recyclerview.widget.u1 F1;
    public final android.view.accessibility.AccessibilityManager G;
    public com.tencent.mm.xcompat.recyclerview.widget.k1 G1;
    public java.util.List H;
    public java.util.List H1;
    public boolean I;
    public boolean I1;

    /* renamed from: J */
    public boolean f214396J;
    public boolean J1;
    public int K;
    public final com.tencent.mm.xcompat.recyclerview.widget.z0 K1;
    public int L;
    public boolean L1;
    public com.tencent.mm.xcompat.recyclerview.widget.y0 M;
    public com.tencent.mm.xcompat.recyclerview.widget.a2 M1;
    public android.widget.EdgeEffect N;
    public final int[] N1;
    public n3.f0 O1;
    public android.widget.EdgeEffect P;
    public final int[] P1;
    public android.widget.EdgeEffect Q;
    public final int[] Q1;
    public android.widget.EdgeEffect R;
    public final int[] R1;
    public com.tencent.mm.xcompat.recyclerview.widget.b1 S;
    public final java.util.List S1;
    public int T;
    public final java.lang.Runnable T1;
    public int U;
    public boolean U1;
    public android.view.VelocityTracker V;
    public int V1;
    public int W;
    public int W1;
    public final com.tencent.mm.xcompat.recyclerview.widget.k2 X1;

    /* renamed from: d */
    public final float f214397d;

    /* renamed from: e */
    public final com.tencent.mm.xcompat.recyclerview.widget.p1 f214398e;

    /* renamed from: f */
    public final com.tencent.mm.xcompat.recyclerview.widget.n1 f214399f;

    /* renamed from: g */
    public com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.SavedState f214400g;

    /* renamed from: h */
    public com.tencent.mm.xcompat.recyclerview.widget.c f214401h;

    /* renamed from: i */
    public com.tencent.mm.xcompat.recyclerview.widget.f f214402i;

    /* renamed from: l1 */
    public int f214403l1;

    /* renamed from: m */
    public final com.tencent.mm.xcompat.recyclerview.widget.l2 f214404m;

    /* renamed from: n */
    public boolean f214405n;

    /* renamed from: o */
    public final java.lang.Runnable f214406o;

    /* renamed from: p */
    public final android.graphics.Rect f214407p;

    /* renamed from: p0 */
    public int f214408p0;

    /* renamed from: p1 */
    public com.tencent.mm.xcompat.recyclerview.widget.i1 f214409p1;

    /* renamed from: q */
    public final android.graphics.Rect f214410q;

    /* renamed from: r */
    public final android.graphics.RectF f214411r;

    /* renamed from: s */
    public com.tencent.mm.xcompat.recyclerview.widget.u0 f214412s;

    /* renamed from: t */
    public com.tencent.mm.xcompat.recyclerview.widget.g1 f214413t;

    /* renamed from: u */
    public final java.util.List f214414u;

    /* renamed from: v */
    public final java.util.ArrayList f214415v;

    /* renamed from: w */
    public final java.util.ArrayList f214416w;

    /* renamed from: x */
    public com.tencent.mm.xcompat.recyclerview.widget.j1 f214417x;

    /* renamed from: x0 */
    public int f214418x0;

    /* renamed from: x1 */
    public final int f214419x1;

    /* renamed from: y */
    public boolean f214420y;

    /* renamed from: y0 */
    public int f214421y0;

    /* renamed from: y1 */
    public final int f214422y1;

    /* renamed from: z */
    public boolean f214423z;

    /* renamed from: z1 */
    public final float f214424z1;

    /* loaded from: classes15.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.SavedState> CREATOR = new com.tencent.mm.xcompat.recyclerview.widget.q1();

        /* renamed from: f */
        public android.os.Parcelable f214429f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f214429f = parcel.readParcelable(classLoader == null ? com.tencent.mm.xcompat.recyclerview.widget.g1.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f11112d, i17);
            parcel.writeParcelable(this.f214429f, 0);
        }
    }

    static {
        java.lang.Class cls = java.lang.Integer.TYPE;
        f214393f2 = new java.lang.Class[]{android.content.Context.class, android.util.AttributeSet.class, cls, cls};
        f214394g2 = new com.tencent.mm.xcompat.recyclerview.widget.p0();
        f214395h2 = new com.tencent.mm.xcompat.recyclerview.widget.v1();
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, com.tencent.mm.R.attr.f478383le);
    }

    public static com.tencent.mm.xcompat.recyclerview.widget.RecyclerView G(android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        if (view instanceof com.tencent.mm.xcompat.recyclerview.widget.RecyclerView) {
            return (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView) view;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView G = G(viewGroup.getChildAt(i17));
            if (G != null) {
                return G;
            }
        }
        return null;
    }

    public static com.tencent.mm.xcompat.recyclerview.widget.y1 K(android.view.View view) {
        if (view == null) {
            return null;
        }
        return ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams()).f214425a;
    }

    private n3.f0 getScrollingChildHelper() {
        if (this.O1 == null) {
            this.O1 = new n3.f0(this);
        }
        return this.O1;
    }

    public static void j(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var) {
        java.lang.ref.WeakReference weakReference = y1Var.f214704e;
        if (weakReference != null) {
            android.view.View view = (android.view.View) weakReference.get();
            while (view != null) {
                if (view == y1Var.f214703d) {
                    return;
                }
                java.lang.Object parent = view.getParent();
                view = parent instanceof android.view.View ? (android.view.View) parent : null;
            }
            y1Var.f214704e = null;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z17) {
        Y1 = z17;
    }

    public static void setVerboseLoggingEnabled(boolean z17) {
        Z1 = z17;
    }

    public void A() {
        if (this.P != null) {
            return;
        }
        android.widget.EdgeEffect a17 = this.M.a(this, 1);
        this.P = a17;
        if (this.f214405n) {
            a17.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a17.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public java.lang.String B() {
        return " " + super.toString() + ", adapter:" + this.f214412s + ", layout:" + this.f214413t + ", context:" + getContext();
    }

    public final void C(com.tencent.mm.xcompat.recyclerview.widget.u1 u1Var) {
        if (getScrollState() != 2) {
            u1Var.getClass();
            return;
        }
        android.widget.OverScroller overScroller = this.C1.f214692f;
        overScroller.getFinalX();
        overScroller.getCurrX();
        u1Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View D(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.D(android.view.View):android.view.View");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r7 == 2) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean E(android.view.MotionEvent r13) {
        /*
            r12 = this;
            int r0 = r13.getAction()
            java.util.ArrayList r1 = r12.f214416w
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto L6c
            java.lang.Object r5 = r1.get(r4)
            com.tencent.mm.xcompat.recyclerview.widget.j1 r5 = (com.tencent.mm.xcompat.recyclerview.widget.j1) r5
            r6 = r5
            com.tencent.mm.xcompat.recyclerview.widget.v r6 = (com.tencent.mm.xcompat.recyclerview.widget.v) r6
            int r7 = r6.f214681v
            r8 = 1
            r9 = 2
            if (r7 != r8) goto L5c
            float r7 = r13.getX()
            float r10 = r13.getY()
            boolean r7 = r6.b(r7, r10)
            float r10 = r13.getX()
            float r11 = r13.getY()
            boolean r10 = r6.a(r10, r11)
            int r11 = r13.getAction()
            if (r11 != 0) goto L60
            if (r7 != 0) goto L3f
            if (r10 == 0) goto L60
        L3f:
            if (r10 == 0) goto L4c
            r6.f214682w = r8
            float r7 = r13.getX()
            int r7 = (int) r7
            float r7 = (float) r7
            r6.f214675p = r7
            goto L58
        L4c:
            if (r7 == 0) goto L58
            r6.f214682w = r9
            float r7 = r13.getY()
            int r7 = (int) r7
            float r7 = (float) r7
            r6.f214672m = r7
        L58:
            r6.c(r9)
            goto L5e
        L5c:
            if (r7 != r9) goto L60
        L5e:
            r6 = r8
            goto L61
        L60:
            r6 = r3
        L61:
            if (r6 == 0) goto L69
            r6 = 3
            if (r0 == r6) goto L69
            r12.f214417x = r5
            return r8
        L69:
            int r4 = r4 + 1
            goto Lc
        L6c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.E(android.view.MotionEvent):boolean");
    }

    public final void F(int[] iArr) {
        int e17 = this.f214402i.e();
        if (e17 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i17 = Integer.MAX_VALUE;
        int i18 = Integer.MIN_VALUE;
        for (int i19 = 0; i19 < e17; i19++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = K(this.f214402i.d(i19));
            if (!K.y()) {
                int e18 = K.e();
                if (e18 < i17) {
                    i17 = e18;
                }
                if (e18 > i18) {
                    i18 = e18;
                }
            }
        }
        iArr[0] = i17;
        iArr[1] = i18;
    }

    public com.tencent.mm.xcompat.recyclerview.widget.y1 H(int i17) {
        com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = null;
        if (this.I) {
            return null;
        }
        int h17 = this.f214402i.h();
        for (int i18 = 0; i18 < h17; i18++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = K(this.f214402i.g(i18));
            if (K != null && !K.m() && I(K) == i17) {
                if (!this.f214402i.j(K.f214703d)) {
                    return K;
                }
                y1Var = K;
            }
        }
        return y1Var;
    }

    public int I(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var) {
        if (!((y1Var.f214712p & 524) != 0) && y1Var.h()) {
            com.tencent.mm.xcompat.recyclerview.widget.c cVar = this.f214401h;
            int i17 = y1Var.f214705f;
            java.util.ArrayList arrayList = cVar.f214469b;
            int size = arrayList.size();
            for (int i18 = 0; i18 < size; i18++) {
                com.tencent.mm.xcompat.recyclerview.widget.b bVar = (com.tencent.mm.xcompat.recyclerview.widget.b) arrayList.get(i18);
                int i19 = bVar.f214453a;
                if (i19 != 1) {
                    if (i19 == 2) {
                        int i27 = bVar.f214454b;
                        if (i27 <= i17) {
                            int i28 = bVar.f214456d;
                            if (i27 + i28 <= i17) {
                                i17 -= i28;
                            }
                        } else {
                            continue;
                        }
                    } else if (i19 == 8) {
                        int i29 = bVar.f214454b;
                        if (i29 == i17) {
                            i17 = bVar.f214456d;
                        } else {
                            if (i29 < i17) {
                                i17--;
                            }
                            if (bVar.f214456d <= i17) {
                                i17++;
                            }
                        }
                    }
                } else if (bVar.f214454b <= i17) {
                    i17 += bVar.f214456d;
                }
            }
            return i17;
        }
        return -1;
    }

    public com.tencent.mm.xcompat.recyclerview.widget.y1 J(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return K(view);
        }
        throw new java.lang.IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean L() {
        return this.K > 0;
    }

    public void M(int i17) {
        if (this.f214413t == null) {
            return;
        }
        setScrollState(2);
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g1Var, arrayList.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/RecyclerView", "jumpToPositionForSmoothScroller", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        g1Var.y(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(g1Var, "com/tencent/mm/xcompat/recyclerview/widget/RecyclerView", "jumpToPositionForSmoothScroller", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        awakenScrollBars();
    }

    public void N() {
        int h17 = this.f214402i.h();
        for (int i17 = 0; i17 < h17; i17++) {
            ((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) this.f214402i.g(i17).getLayoutParams()).f214427c = true;
        }
        java.util.ArrayList arrayList = this.f214399f.f214590c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) ((com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList.get(i18)).f214703d.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f214427c = true;
            }
        }
    }

    public void O(int i17, int i18, boolean z17) {
        int i19 = i17 + i18;
        int h17 = this.f214402i.h();
        for (int i27 = 0; i27 < h17; i27++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = K(this.f214402i.g(i27));
            if (K != null && !K.y()) {
                int i28 = K.f214705f;
                com.tencent.mm.xcompat.recyclerview.widget.u1 u1Var = this.F1;
                if (i28 >= i19) {
                    if (Z1) {
                        K.toString();
                    }
                    K.v(-i18, z17);
                    u1Var.f214651f = true;
                } else if (i28 >= i17) {
                    if (Z1) {
                        K.toString();
                    }
                    K.c(8);
                    K.v(-i18, z17);
                    K.f214705f = i17 - 1;
                    u1Var.f214651f = true;
                }
            }
        }
        com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = this.f214399f;
        java.util.ArrayList arrayList = n1Var.f214590c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                requestLayout();
                return;
            }
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = (com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList.get(size);
            if (y1Var != null) {
                int i29 = y1Var.f214705f;
                if (i29 >= i19) {
                    if (Z1) {
                        y1Var.toString();
                    }
                    y1Var.v(-i18, z17);
                } else if (i29 >= i17) {
                    y1Var.c(8);
                    n1Var.f(size);
                }
            }
        }
    }

    public void P() {
        this.K++;
    }

    public void Q(boolean z17) {
        int i17;
        int i18 = this.K - 1;
        this.K = i18;
        if (i18 < 1) {
            if (Y1 && i18 < 0) {
                throw new java.lang.IllegalStateException("layout or scroll counter cannot go below zero.Some calls are not matching" + B());
            }
            this.K = 0;
            if (z17) {
                int i19 = this.F;
                this.F = 0;
                if (i19 != 0) {
                    android.view.accessibility.AccessibilityManager accessibilityManager = this.G;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        o3.b.b(obtain, i19);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                java.util.ArrayList arrayList = (java.util.ArrayList) this.S1;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = (com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList.get(size);
                    if (y1Var.f214703d.getParent() == this && !y1Var.y() && (i17 = y1Var.f214719w) != -1) {
                        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                        n3.u0.s(y1Var.f214703d, i17);
                        y1Var.f214719w = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void R(android.view.MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.U) {
            int i17 = actionIndex == 0 ? 1 : 0;
            this.U = motionEvent.getPointerId(i17);
            int x17 = (int) (motionEvent.getX(i17) + 0.5f);
            this.f214418x0 = x17;
            this.W = x17;
            int y17 = (int) (motionEvent.getY(i17) + 0.5f);
            this.f214421y0 = y17;
            this.f214408p0 = y17;
        }
    }

    public void S() {
        if (this.L1 || !this.f214420y) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.m(this, this.T1);
        this.L1 = true;
    }

    public void T(boolean z17) {
        this.f214396J = z17 | this.f214396J;
        this.I = true;
        int h17 = this.f214402i.h();
        for (int i17 = 0; i17 < h17; i17++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = K(this.f214402i.g(i17));
            if (K != null && !K.y()) {
                K.c(6);
            }
        }
        N();
        com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = this.f214399f;
        java.util.ArrayList arrayList = n1Var.f214590c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = (com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList.get(i18);
            if (y1Var != null) {
                y1Var.c(6);
                y1Var.b(null);
            }
        }
        com.tencent.mm.xcompat.recyclerview.widget.u0 u0Var = n1Var.f214595h.f214412s;
        n1Var.e();
    }

    public void U(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var, com.tencent.mm.xcompat.recyclerview.widget.a1 a1Var) {
        int i17 = (y1Var.f214712p & (-8193)) | 0;
        y1Var.f214712p = i17;
        boolean z17 = this.F1.f214653h;
        com.tencent.mm.xcompat.recyclerview.widget.l2 l2Var = this.f214404m;
        if (z17) {
            if (((i17 & 2) != 0) && !y1Var.m() && !y1Var.y()) {
                this.f214412s.getClass();
                l2Var.f214573b.d(y1Var.f214705f, y1Var);
            }
        }
        x.n nVar = l2Var.f214572a;
        com.tencent.mm.xcompat.recyclerview.widget.j2 j2Var = (com.tencent.mm.xcompat.recyclerview.widget.j2) nVar.getOrDefault(y1Var, null);
        if (j2Var == null) {
            j2Var = com.tencent.mm.xcompat.recyclerview.widget.j2.a();
            nVar.put(y1Var, j2Var);
        }
        j2Var.f214552b = a1Var;
        j2Var.f214551a |= 4;
    }

    public final int V(int i17, float f17) {
        float height = f17 / getHeight();
        float width = i17 / getWidth();
        android.widget.EdgeEffect edgeEffect = this.N;
        float f18 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.i.a(edgeEffect) == 0.0f) {
            android.widget.EdgeEffect edgeEffect2 = this.Q;
            if (edgeEffect2 != null && androidx.core.widget.i.a(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.Q.onRelease();
                } else {
                    float d17 = androidx.core.widget.i.d(this.Q, width, height);
                    if (androidx.core.widget.i.a(this.Q) == 0.0f) {
                        this.Q.onRelease();
                    }
                    f18 = d17;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.N.onRelease();
            } else {
                float f19 = -androidx.core.widget.i.d(this.N, -width, 1.0f - height);
                if (androidx.core.widget.i.a(this.N) == 0.0f) {
                    this.N.onRelease();
                }
                f18 = f19;
            }
            invalidate();
        }
        return java.lang.Math.round(f18 * getWidth());
    }

    public final int W(int i17, float f17) {
        float width = f17 / getWidth();
        float height = i17 / getHeight();
        android.widget.EdgeEffect edgeEffect = this.P;
        float f18 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.i.a(edgeEffect) == 0.0f) {
            android.widget.EdgeEffect edgeEffect2 = this.R;
            if (edgeEffect2 != null && androidx.core.widget.i.a(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.R.onRelease();
                } else {
                    float d17 = androidx.core.widget.i.d(this.R, height, 1.0f - width);
                    if (androidx.core.widget.i.a(this.R) == 0.0f) {
                        this.R.onRelease();
                    }
                    f18 = d17;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.P.onRelease();
            } else {
                float f19 = -androidx.core.widget.i.d(this.P, -height, width);
                if (androidx.core.widget.i.a(this.P) == 0.0f) {
                    this.P.onRelease();
                }
                f18 = f19;
            }
            invalidate();
        }
        return java.lang.Math.round(f18 * getHeight());
    }

    public final void X(android.view.View view, android.view.View view2) {
        android.view.View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        android.graphics.Rect rect = this.f214407p;
        rect.set(0, 0, width, height);
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) {
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
            if (!layoutParams2.f214427c) {
                int i17 = rect.left;
                android.graphics.Rect rect2 = layoutParams2.f214426b;
                rect.left = i17 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f214413t.getClass();
    }

    public final void Y() {
        android.view.VelocityTracker velocityTracker = this.V;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z17 = false;
        p(0);
        android.widget.EdgeEffect edgeEffect = this.N;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z17 = this.N.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.P;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z17 |= this.P.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.Q;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z17 |= this.Q.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.R;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z17 |= this.R.isFinished();
        }
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Z(int r21, int r22, android.view.MotionEvent r23, int r24) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Z(int, int, android.view.MotionEvent, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a0(int r10, int r11, int[] r12) {
        /*
            r9 = this;
            r9.f0()
            r9.P()
            java.lang.reflect.Method r0 = j3.v.f297343b
            java.lang.String r0 = "RV Scroll"
            j3.t.a(r0)
            com.tencent.mm.xcompat.recyclerview.widget.u1 r0 = r9.F1
            r9.C(r0)
            com.tencent.mm.xcompat.recyclerview.widget.n1 r1 = r9.f214399f
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L26
            com.tencent.mm.xcompat.recyclerview.widget.g1 r4 = r9.f214413t
            com.tencent.mm.xcompat.recyclerview.widget.e0 r4 = (com.tencent.mm.xcompat.recyclerview.widget.e0) r4
            int r5 = r4.f214493n
            if (r5 != r2) goto L21
            goto L26
        L21:
            int r10 = r4.X(r10, r1, r0)
            goto L27
        L26:
            r10 = r3
        L27:
            if (r11 == 0) goto L31
            com.tencent.mm.xcompat.recyclerview.widget.g1 r4 = r9.f214413t
            com.tencent.mm.xcompat.recyclerview.widget.e0 r4 = (com.tencent.mm.xcompat.recyclerview.widget.e0) r4
            int r5 = r4.f214493n
            if (r5 != 0) goto L33
        L31:
            r11 = r3
            goto L37
        L33:
            int r11 = r4.X(r11, r1, r0)
        L37:
            j3.t.b()
            com.tencent.mm.xcompat.recyclerview.widget.f r0 = r9.f214402i
            int r0 = r0.e()
            r1 = r3
        L41:
            if (r1 >= r0) goto L79
            com.tencent.mm.xcompat.recyclerview.widget.f r4 = r9.f214402i
            android.view.View r4 = r4.d(r1)
            com.tencent.mm.xcompat.recyclerview.widget.y1 r5 = r9.J(r4)
            if (r5 == 0) goto L76
            com.tencent.mm.xcompat.recyclerview.widget.y1 r5 = r5.f214711o
            if (r5 == 0) goto L76
            int r6 = r4.getLeft()
            int r4 = r4.getTop()
            android.view.View r5 = r5.f214703d
            int r7 = r5.getLeft()
            if (r6 != r7) goto L69
            int r7 = r5.getTop()
            if (r4 == r7) goto L76
        L69:
            int r7 = r5.getWidth()
            int r7 = r7 + r6
            int r8 = r5.getHeight()
            int r8 = r8 + r4
            r5.layout(r6, r4, r7, r8)
        L76:
            int r1 = r1 + 1
            goto L41
        L79:
            r9.Q(r2)
            r9.g0(r3)
            if (r12 == 0) goto L85
            r12[r3] = r10
            r12[r2] = r11
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.a0(int, int, int[]):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList arrayList, int i17, int i18) {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var != null) {
            g1Var.getClass();
        }
        super.addFocusables(arrayList, i17, i18);
    }

    public void b0(int i17) {
        com.tencent.mm.xcompat.recyclerview.widget.t1 t1Var;
        if (this.D) {
            return;
        }
        setScrollState(0);
        com.tencent.mm.xcompat.recyclerview.widget.x1 x1Var = this.C1;
        x1Var.f214696m.removeCallbacks(x1Var);
        x1Var.f214692f.abortAnimation();
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var != null && (t1Var = g1Var.f214525e) != null) {
            t1Var.c();
        }
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var2 = this.f214413t;
        if (g1Var2 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(g1Var2, arrayList.toArray(), "com/tencent/mm/xcompat/recyclerview/widget/RecyclerView", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        g1Var2.y(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(g1Var2, "com/tencent/mm/xcompat/recyclerview/widget/RecyclerView", "scrollToPosition", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        awakenScrollBars();
    }

    public final boolean c0(android.widget.EdgeEffect edgeEffect, int i17, int i18) {
        if (i17 > 0) {
            return true;
        }
        float a17 = androidx.core.widget.i.a(edgeEffect) * i18;
        float abs = java.lang.Math.abs(-i17) * 0.35f;
        float f17 = this.f214397d * 0.015f;
        double log = java.lang.Math.log(abs / f17);
        double d17 = f214389b2;
        return ((float) (((double) f17) * java.lang.Math.exp((d17 / (d17 - 1.0d)) * log))) < a17;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams)) {
            return false;
        }
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams2 = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) layoutParams;
        this.f214413t.getClass();
        return layoutParams2 != null;
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var != null && g1Var.b()) {
            return ((com.tencent.mm.xcompat.recyclerview.widget.e0) this.f214413t).F(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var != null && g1Var.b()) {
            return ((com.tencent.mm.xcompat.recyclerview.widget.e0) this.f214413t).G(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var != null && g1Var.b()) {
            return ((com.tencent.mm.xcompat.recyclerview.widget.e0) this.f214413t).H(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var != null && g1Var.c()) {
            return ((com.tencent.mm.xcompat.recyclerview.widget.e0) this.f214413t).F(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var != null && g1Var.c()) {
            return ((com.tencent.mm.xcompat.recyclerview.widget.e0) this.f214413t).G(this.F1);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var != null && g1Var.c()) {
            return ((com.tencent.mm.xcompat.recyclerview.widget.e0) this.f214413t).H(this.F1);
        }
        return 0;
    }

    public void d0(int i17, int i18, android.view.animation.Interpolator interpolator, int i19, boolean z17) {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var == null || this.D) {
            return;
        }
        if (!g1Var.b()) {
            i17 = 0;
        }
        if (!this.f214413t.c()) {
            i18 = 0;
        }
        if (i17 == 0 && i18 == 0) {
            return;
        }
        if (!(i19 == Integer.MIN_VALUE || i19 > 0)) {
            scrollBy(i17, i18);
            return;
        }
        if (z17) {
            int i27 = i17 != 0 ? 1 : 0;
            if (i18 != 0) {
                i27 |= 2;
            }
            getScrollingChildHelper().j(i27, 1);
        }
        this.C1.c(i17, i18, i19, interpolator);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f17, float f18, boolean z17) {
        return getScrollingChildHelper().a(f17, f18, z17);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f17, float f18) {
        return getScrollingChildHelper().b(f17, f18);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i17, i18, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i17, int i18, int i19, int i27, int[] iArr) {
        return getScrollingChildHelper().e(i17, i18, i19, i27, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(android.util.SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(android.util.SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        boolean z17;
        super.draw(canvas);
        java.util.ArrayList arrayList = this.f214415v;
        int size = arrayList.size();
        boolean z18 = false;
        int i17 = 0;
        while (true) {
            if (i17 >= size) {
                break;
            }
            com.tencent.mm.xcompat.recyclerview.widget.v vVar = (com.tencent.mm.xcompat.recyclerview.widget.v) ((com.tencent.mm.xcompat.recyclerview.widget.d1) arrayList.get(i17));
            if (vVar.f214676q != vVar.f214678s.getWidth() || vVar.f214677r != vVar.f214678s.getHeight()) {
                vVar.f214676q = vVar.f214678s.getWidth();
                vVar.f214677r = vVar.f214678s.getHeight();
                vVar.c(0);
            } else if (vVar.A != 0) {
                if (vVar.f214679t) {
                    int i18 = vVar.f214676q;
                    int i19 = vVar.f214664e;
                    int i27 = i18 - i19;
                    int i28 = vVar.f214671l;
                    int i29 = vVar.f214670k;
                    int i37 = i28 - (i29 / 2);
                    android.graphics.drawable.StateListDrawable stateListDrawable = vVar.f214662c;
                    stateListDrawable.setBounds(0, 0, i19, i29);
                    int i38 = vVar.f214677r;
                    android.graphics.drawable.Drawable drawable = vVar.f214663d;
                    drawable.setBounds(0, 0, vVar.f214665f, i38);
                    com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = vVar.f214678s;
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    if (n3.v0.d(recyclerView) == 1) {
                        drawable.draw(canvas);
                        canvas.translate(i19, i37);
                        canvas.scale(-1.0f, 1.0f);
                        stateListDrawable.draw(canvas);
                        canvas.scale(-1.0f, 1.0f);
                        canvas.translate(-i19, -i37);
                    } else {
                        canvas.translate(i27, 0.0f);
                        drawable.draw(canvas);
                        canvas.translate(0.0f, i37);
                        stateListDrawable.draw(canvas);
                        canvas.translate(-i27, -i37);
                    }
                }
                if (vVar.f214680u) {
                    int i39 = vVar.f214677r;
                    int i47 = vVar.f214668i;
                    int i48 = i39 - i47;
                    int i49 = vVar.f214674o;
                    int i57 = vVar.f214673n;
                    int i58 = i49 - (i57 / 2);
                    android.graphics.drawable.StateListDrawable stateListDrawable2 = vVar.f214666g;
                    stateListDrawable2.setBounds(0, 0, i57, i47);
                    int i59 = vVar.f214676q;
                    android.graphics.drawable.Drawable drawable2 = vVar.f214667h;
                    drawable2.setBounds(0, 0, i59, vVar.f214669j);
                    canvas.translate(0.0f, i48);
                    drawable2.draw(canvas);
                    canvas.translate(i58, 0.0f);
                    stateListDrawable2.draw(canvas);
                    canvas.translate(-i58, -i48);
                }
            }
            i17++;
        }
        android.widget.EdgeEffect edgeEffect = this.N;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z17 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f214405n ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            android.widget.EdgeEffect edgeEffect2 = this.N;
            z17 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        android.widget.EdgeEffect edgeEffect3 = this.P;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f214405n) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            android.widget.EdgeEffect edgeEffect4 = this.P;
            z17 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        android.widget.EdgeEffect edgeEffect5 = this.Q;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f214405n ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            android.widget.EdgeEffect edgeEffect6 = this.Q;
            z17 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        android.widget.EdgeEffect edgeEffect7 = this.R;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f214405n) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            android.widget.EdgeEffect edgeEffect8 = this.R;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z18 = true;
            }
            z17 |= z18;
            canvas.restoreToCount(save4);
        }
        if ((z17 || this.S == null || arrayList.size() <= 0 || !this.S.f()) ? z17 : true) {
            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        return super.drawChild(canvas, view, j17);
    }

    public void e0(int i17) {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var;
        if (this.D || (g1Var = this.f214413t) == null) {
            return;
        }
        com.tencent.mm.xcompat.recyclerview.widget.e0 e0Var = (com.tencent.mm.xcompat.recyclerview.widget.e0) g1Var;
        e0Var.getClass();
        com.tencent.mm.xcompat.recyclerview.widget.f0 f0Var = new com.tencent.mm.xcompat.recyclerview.widget.f0(getContext());
        f0Var.f214636a = i17;
        e0Var.D(f0Var);
    }

    public void f0() {
        int i17 = this.B + 1;
        this.B = i17;
        if (i17 != 1 || this.D) {
            return;
        }
        this.C = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018c, code lost:
    
        if (r5 < 0) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0194, code lost:
    
        if ((r5 * r6) <= 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x019c, code lost:
    
        if ((r5 * r6) >= 0) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0168, code lost:
    
        if (r9 > 0) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0186, code lost:
    
        if (r5 > 0) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0189, code lost:
    
        if (r9 < 0) goto L279;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View focusSearch(android.view.View r17, int r18) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g(com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var) {
        android.view.View view = y1Var.f214703d;
        boolean z17 = view.getParent() == this;
        this.f214399f.k(J(view));
        if (y1Var.s()) {
            this.f214402i.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z17) {
            this.f214402i.a(view, -1, true);
            return;
        }
        com.tencent.mm.xcompat.recyclerview.widget.f fVar = this.f214402i;
        int indexOfChild = ((com.tencent.mm.xcompat.recyclerview.widget.r0) fVar.f214507a).f214623a.indexOfChild(view);
        if (indexOfChild >= 0) {
            fVar.f214508b.h(indexOfChild);
            fVar.i(view);
        } else {
            throw new java.lang.IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public void g0(boolean z17) {
        if (this.B < 1) {
            if (Y1) {
                throw new java.lang.IllegalStateException("stopInterceptRequestLayout was called more times than startInterceptRequestLayout." + B());
            }
            this.B = 1;
        }
        if (!z17 && !this.D) {
            this.C = false;
        }
        if (this.B == 1) {
            if (z17 && this.C && !this.D && this.f214413t != null && this.f214412s != null) {
                r();
            }
            if (!this.D) {
                this.C = false;
            }
        }
        this.B--;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var != null) {
            ((com.tencent.mm.xcompat.recyclerview.widget.e0) g1Var).getClass();
            return new com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams(-2, -2);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + B());
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var != null) {
            android.content.Context context = getContext();
            g1Var.getClass();
            return new com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams(context, attributeSet);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + B());
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public com.tencent.mm.xcompat.recyclerview.widget.u0 getAdapter() {
        return this.f214412s;
    }

    @Override // android.view.View
    public int getBaseline() {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var == null) {
            return super.getBaseline();
        }
        g1Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i17, int i18) {
        return super.getChildDrawingOrder(i17, i18);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f214405n;
    }

    public com.tencent.mm.xcompat.recyclerview.widget.a2 getCompatAccessibilityDelegate() {
        return this.M1;
    }

    public com.tencent.mm.xcompat.recyclerview.widget.y0 getEdgeEffectFactory() {
        return this.M;
    }

    public com.tencent.mm.xcompat.recyclerview.widget.b1 getItemAnimator() {
        return this.S;
    }

    public int getItemDecorationCount() {
        return this.f214415v.size();
    }

    public com.tencent.mm.xcompat.recyclerview.widget.g1 getLayoutManager() {
        return this.f214413t;
    }

    public int getMaxFlingVelocity() {
        return this.f214422y1;
    }

    public int getMinFlingVelocity() {
        return this.f214419x1;
    }

    public long getNanoTime() {
        if (f214392e2) {
            return java.lang.System.nanoTime();
        }
        return 0L;
    }

    public com.tencent.mm.xcompat.recyclerview.widget.i1 getOnFlingListener() {
        return this.f214409p1;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.B1;
    }

    public com.tencent.mm.xcompat.recyclerview.widget.m1 getRecycledViewPool() {
        return this.f214399f.b();
    }

    public int getScrollState() {
        return this.T;
    }

    public void h(com.tencent.mm.xcompat.recyclerview.widget.k1 k1Var) {
        if (this.H1 == null) {
            this.H1 = new java.util.ArrayList();
        }
        this.H1.add(k1Var);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().h(0);
    }

    public void i(java.lang.String str) {
        if (L()) {
            if (str != null) {
                throw new java.lang.IllegalStateException(str);
            }
            throw new java.lang.IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + B());
        }
        if (this.L > 0) {
            new java.lang.IllegalStateException("" + B());
        }
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f214420y;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.D;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f334334d;
    }

    public void k() {
        int h17 = this.f214402i.h();
        for (int i17 = 0; i17 < h17; i17++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = K(this.f214402i.g(i17));
            if (!K.y()) {
                K.f214706g = -1;
                K.f214709m = -1;
            }
        }
        com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = this.f214399f;
        java.util.ArrayList arrayList = n1Var.f214590c;
        int size = arrayList.size();
        for (int i18 = 0; i18 < size; i18++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var = (com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList.get(i18);
            y1Var.f214706g = -1;
            y1Var.f214709m = -1;
        }
        java.util.ArrayList arrayList2 = n1Var.f214588a;
        int size2 = arrayList2.size();
        for (int i19 = 0; i19 < size2; i19++) {
            com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var2 = (com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList2.get(i19);
            y1Var2.f214706g = -1;
            y1Var2.f214709m = -1;
        }
        java.util.ArrayList arrayList3 = n1Var.f214589b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i27 = 0; i27 < size3; i27++) {
                com.tencent.mm.xcompat.recyclerview.widget.y1 y1Var3 = (com.tencent.mm.xcompat.recyclerview.widget.y1) n1Var.f214589b.get(i27);
                y1Var3.f214706g = -1;
                y1Var3.f214709m = -1;
            }
        }
    }

    public void l(int i17, int i18) {
        boolean z17;
        android.widget.EdgeEffect edgeEffect = this.N;
        if (edgeEffect == null || edgeEffect.isFinished() || i17 <= 0) {
            z17 = false;
        } else {
            this.N.onRelease();
            z17 = this.N.isFinished();
        }
        android.widget.EdgeEffect edgeEffect2 = this.Q;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i17 < 0) {
            this.Q.onRelease();
            z17 |= this.Q.isFinished();
        }
        android.widget.EdgeEffect edgeEffect3 = this.P;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i18 > 0) {
            this.P.onRelease();
            z17 |= this.P.isFinished();
        }
        android.widget.EdgeEffect edgeEffect4 = this.R;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i18 < 0) {
            this.R.onRelease();
            z17 |= this.R.isFinished();
        }
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.u0.k(this);
        }
    }

    public final int m(int i17, android.widget.EdgeEffect edgeEffect, android.widget.EdgeEffect edgeEffect2, int i18) {
        if (i17 > 0 && edgeEffect != null && androidx.core.widget.i.a(edgeEffect) != 0.0f) {
            int round = java.lang.Math.round(((-i18) / 4.0f) * androidx.core.widget.i.d(edgeEffect, ((-i17) * 4.0f) / i18, 0.5f));
            if (round != i17) {
                edgeEffect.finish();
            }
            return i17 - round;
        }
        if (i17 >= 0 || edgeEffect2 == null || androidx.core.widget.i.a(edgeEffect2) == 0.0f) {
            return i17;
        }
        float f17 = i18;
        int round2 = java.lang.Math.round((f17 / 4.0f) * androidx.core.widget.i.d(edgeEffect2, (i17 * 4.0f) / f17, 0.5f));
        if (round2 != i17) {
            edgeEffect2.finish();
        }
        return i17 - round2;
    }

    public void n() {
        if (!this.A || this.I) {
            java.lang.reflect.Method method = j3.v.f297343b;
            j3.t.a("RV FullInvalidate");
            r();
            j3.t.b();
            return;
        }
        if (this.f214401h.g()) {
            com.tencent.mm.xcompat.recyclerview.widget.c cVar = this.f214401h;
            int i17 = cVar.f214473f;
            boolean z17 = false;
            if ((4 & i17) != 0) {
                if (!((i17 & 11) != 0)) {
                    java.lang.reflect.Method method2 = j3.v.f297343b;
                    j3.t.a("RV PartialInvalidate");
                    f0();
                    P();
                    this.f214401h.j();
                    if (!this.C) {
                        int e17 = this.f214402i.e();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= e17) {
                                break;
                            }
                            com.tencent.mm.xcompat.recyclerview.widget.y1 K = K(this.f214402i.d(i18));
                            if (K != null && !K.y()) {
                                if ((K.f214712p & 2) != 0) {
                                    z17 = true;
                                    break;
                                }
                            }
                            i18++;
                        }
                        if (z17) {
                            r();
                        } else {
                            this.f214401h.b();
                        }
                    }
                    g0(true);
                    Q(true);
                    j3.t.b();
                    return;
                }
            }
            if (cVar.g()) {
                java.lang.reflect.Method method3 = j3.v.f297343b;
                j3.t.a("RV FullInvalidate");
                r();
                j3.t.b();
            }
        }
    }

    public void o(int i17, int i18) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        setMeasuredDimension(com.tencent.mm.xcompat.recyclerview.widget.g1.d(i17, paddingLeft, n3.u0.e(this)), com.tencent.mm.xcompat.recyclerview.widget.g1.d(i18, getPaddingTop() + getPaddingBottom(), n3.u0.d(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        if (r1 >= 30.0f) goto L55;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.K = r0
            r1 = 1
            r5.f214420y = r1
            boolean r2 = r5.A
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.A = r1
            com.tencent.mm.xcompat.recyclerview.widget.n1 r1 = r5.f214399f
            r1.c()
            com.tencent.mm.xcompat.recyclerview.widget.g1 r1 = r5.f214413t
            if (r1 == 0) goto L23
            r1.getClass()
        L23:
            r5.L1 = r0
            boolean r0 = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.f214392e2
            if (r0 == 0) goto L80
            java.lang.ThreadLocal r0 = com.tencent.mm.xcompat.recyclerview.widget.z.f214722h
            java.lang.Object r1 = r0.get()
            com.tencent.mm.xcompat.recyclerview.widget.z r1 = (com.tencent.mm.xcompat.recyclerview.widget.z) r1
            r5.D1 = r1
            if (r1 != 0) goto L63
            com.tencent.mm.xcompat.recyclerview.widget.z r1 = new com.tencent.mm.xcompat.recyclerview.widget.z
            r1.<init>()
            r5.D1 = r1
            java.util.WeakHashMap r1 = n3.l1.f334362a
            android.view.Display r1 = n3.v0.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L55
            if (r1 == 0) goto L55
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L55
            goto L57
        L55:
            r1 = 1114636288(0x42700000, float:60.0)
        L57:
            com.tencent.mm.xcompat.recyclerview.widget.z r2 = r5.D1
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f214726f = r3
            r0.set(r2)
        L63:
            com.tencent.mm.xcompat.recyclerview.widget.z r0 = r5.D1
            r0.getClass()
            boolean r1 = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.Y1
            java.util.ArrayList r0 = r0.f214724d
            if (r1 == 0) goto L7d
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L75
            goto L7d
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L7d:
            r0.add(r5)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var;
        com.tencent.mm.xcompat.recyclerview.widget.z zVar;
        com.tencent.mm.xcompat.recyclerview.widget.t1 t1Var;
        super.onDetachedFromWindow();
        com.tencent.mm.xcompat.recyclerview.widget.b1 b1Var = this.S;
        if (b1Var != null) {
            b1Var.e();
        }
        setScrollState(0);
        com.tencent.mm.xcompat.recyclerview.widget.x1 x1Var = this.C1;
        x1Var.f214696m.removeCallbacks(x1Var);
        x1Var.f214692f.abortAnimation();
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var != null && (t1Var = g1Var.f214525e) != null) {
            t1Var.c();
        }
        this.f214420y = false;
        ((java.util.ArrayList) this.S1).clear();
        removeCallbacks(this.T1);
        this.f214404m.getClass();
        do {
        } while (((m3.f) com.tencent.mm.xcompat.recyclerview.widget.j2.f214550d).a() != null);
        int i17 = 0;
        while (true) {
            n1Var = this.f214399f;
            java.util.ArrayList arrayList = n1Var.f214590c;
            if (i17 >= arrayList.size()) {
                break;
            }
            s3.a.a(((com.tencent.mm.xcompat.recyclerview.widget.y1) arrayList.get(i17)).f214703d);
            i17++;
        }
        n1Var.d(n1Var.f214595h.f214412s, false);
        int i18 = 0;
        while (true) {
            if (!(i18 < getChildCount())) {
                if (!f214392e2 || (zVar = this.D1) == null) {
                    return;
                }
                boolean remove = zVar.f214724d.remove(this);
                if (Y1 && !remove) {
                    throw new java.lang.IllegalStateException("RecyclerView removal failed!");
                }
                this.D1 = null;
                return;
            }
            int i19 = i18 + 1;
            android.view.View childAt = getChildAt(i18);
            if (childAt == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            java.util.ArrayList arrayList2 = s3.a.b(childAt).f402380a;
            for (int h17 = kz5.c0.h(arrayList2); -1 < h17; h17--) {
                androidx.compose.ui.platform.AbstractComposeView abstractComposeView = ((androidx.compose.ui.platform.i4) ((s3.b) arrayList2.get(h17))).f10600a;
                n0.f1 f1Var = abstractComposeView.f10451f;
                if (f1Var != null) {
                    f1Var.dispose();
                }
                abstractComposeView.f10451f = null;
                abstractComposeView.requestLayout();
            }
            i18 = i19;
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        java.util.ArrayList arrayList = this.f214415v;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((com.tencent.mm.xcompat.recyclerview.widget.d1) arrayList.get(i17)).getClass();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r16) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        boolean z17;
        boolean z18;
        if (this.D) {
            return false;
        }
        this.f214417x = null;
        if (E(motionEvent)) {
            Y();
            setScrollState(0);
            return true;
        }
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var == null) {
            return false;
        }
        boolean b17 = g1Var.b();
        boolean c17 = this.f214413t.c();
        if (this.V == null) {
            this.V = android.view.VelocityTracker.obtain();
        }
        this.V.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.E) {
                this.E = false;
            }
            this.U = motionEvent.getPointerId(0);
            int x17 = (int) (motionEvent.getX() + 0.5f);
            this.f214418x0 = x17;
            this.W = x17;
            int y17 = (int) (motionEvent.getY() + 0.5f);
            this.f214421y0 = y17;
            this.f214408p0 = y17;
            android.widget.EdgeEffect edgeEffect = this.N;
            if (edgeEffect == null || androidx.core.widget.i.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z17 = false;
            } else {
                androidx.core.widget.i.d(this.N, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z17 = true;
            }
            android.widget.EdgeEffect edgeEffect2 = this.Q;
            boolean z19 = z17;
            if (edgeEffect2 != null) {
                z19 = z17;
                if (androidx.core.widget.i.a(edgeEffect2) != 0.0f) {
                    z19 = z17;
                    if (!canScrollHorizontally(1)) {
                        androidx.core.widget.i.d(this.Q, 0.0f, motionEvent.getY() / getHeight());
                        z19 = true;
                    }
                }
            }
            android.widget.EdgeEffect edgeEffect3 = this.P;
            boolean z27 = z19;
            if (edgeEffect3 != null) {
                z27 = z19;
                if (androidx.core.widget.i.a(edgeEffect3) != 0.0f) {
                    z27 = z19;
                    if (!canScrollVertically(-1)) {
                        androidx.core.widget.i.d(this.P, 0.0f, motionEvent.getX() / getWidth());
                        z27 = true;
                    }
                }
            }
            android.widget.EdgeEffect edgeEffect4 = this.R;
            boolean z28 = z27;
            if (edgeEffect4 != null) {
                z28 = z27;
                if (androidx.core.widget.i.a(edgeEffect4) != 0.0f) {
                    z28 = z27;
                    if (!canScrollVertically(1)) {
                        androidx.core.widget.i.d(this.R, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z28 = true;
                    }
                }
            }
            if (z28 || this.T == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                p(1);
            }
            int[] iArr = this.Q1;
            iArr[1] = 0;
            iArr[0] = 0;
            int i17 = b17;
            if (c17) {
                i17 = (b17 ? 1 : 0) | 2;
            }
            getScrollingChildHelper().j(i17, 0);
        } else if (actionMasked == 1) {
            this.V.clear();
            p(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.U);
            if (findPointerIndex < 0) {
                return false;
            }
            int x18 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y18 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.T != 1) {
                int i18 = x18 - this.W;
                int i19 = y18 - this.f214408p0;
                if (b17 == 0 || java.lang.Math.abs(i18) <= this.f214403l1) {
                    z18 = false;
                } else {
                    this.f214418x0 = x18;
                    z18 = true;
                }
                if (c17 && java.lang.Math.abs(i19) > this.f214403l1) {
                    this.f214421y0 = y18;
                    z18 = true;
                }
                if (z18) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            Y();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.U = motionEvent.getPointerId(actionIndex);
            int x19 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f214418x0 = x19;
            this.W = x19;
            int y19 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f214421y0 = y19;
            this.f214408p0 = y19;
        } else if (actionMasked == 6) {
            R(motionEvent);
        }
        return this.T == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        java.lang.reflect.Method method = j3.v.f297343b;
        j3.t.a("RV OnLayout");
        r();
        j3.t.b();
        this.A = true;
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        boolean z17;
        if (this.f214413t == null) {
            o(i17, i18);
            return;
        }
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        this.f214413t.f214522b.o(i17, i18);
        boolean z18 = false;
        boolean z19 = mode == 1073741824 && mode2 == 1073741824;
        this.U1 = z19;
        if (z19 || this.f214412s == null) {
            return;
        }
        com.tencent.mm.xcompat.recyclerview.widget.u1 u1Var = this.F1;
        if (u1Var.f214649d == 1) {
            s();
        }
        this.f214413t.A(i17, i18);
        u1Var.f214654i = true;
        t();
        this.f214413t.B(i17, i18);
        com.tencent.mm.xcompat.recyclerview.widget.e0 e0Var = (com.tencent.mm.xcompat.recyclerview.widget.e0) this.f214413t;
        if (e0Var.f214531k != 1073741824 && e0Var.f214530j != 1073741824) {
            int h17 = e0Var.h();
            int i19 = 0;
            while (true) {
                if (i19 >= h17) {
                    z17 = false;
                    break;
                }
                android.view.ViewGroup.LayoutParams layoutParams = e0Var.g(i19).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z17 = true;
                    break;
                }
                i19++;
            }
            if (z17) {
                z18 = true;
            }
        }
        if (z18) {
            this.f214413t.A(android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            u1Var.f214654i = true;
            t();
            this.f214413t.B(i17, i18);
        }
        this.V1 = getMeasuredWidth();
        this.W1 = getMeasuredHeight();
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i17, android.graphics.Rect rect) {
        if (L()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i17, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (!(parcelable instanceof com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.SavedState savedState = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.SavedState) parcelable;
        this.f214400g = savedState;
        super.onRestoreInstanceState(savedState.f11112d);
        requestLayout();
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
        com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState linearLayoutManager$SavedState;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.SavedState savedState = new com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.SavedState(super.onSaveInstanceState());
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.SavedState savedState2 = this.f214400g;
        if (savedState2 != null) {
            savedState.f214429f = savedState2.f214429f;
        } else {
            com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
            if (g1Var != null) {
                com.tencent.mm.xcompat.recyclerview.widget.e0 e0Var = (com.tencent.mm.xcompat.recyclerview.widget.e0) g1Var;
                com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = e0Var.f214501v;
                if (linearLayoutManager$SavedState2 != null) {
                    linearLayoutManager$SavedState = new com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState(linearLayoutManager$SavedState2);
                } else {
                    com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState linearLayoutManager$SavedState3 = new com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState();
                    if (e0Var.h() > 0) {
                        e0Var.J();
                        boolean z17 = e0Var.f214497r;
                        linearLayoutManager$SavedState3.f214387f = z17;
                        if (z17) {
                            android.view.View S = e0Var.S();
                            linearLayoutManager$SavedState3.f214386e = e0Var.f214495p.f() - e0Var.f214495p.a(S);
                            linearLayoutManager$SavedState3.f214385d = e0Var.o(S);
                        } else {
                            android.view.View T = e0Var.T();
                            linearLayoutManager$SavedState3.f214385d = e0Var.o(T);
                            linearLayoutManager$SavedState3.f214386e = e0Var.f214495p.d(T) - e0Var.f214495p.i();
                        }
                    } else {
                        linearLayoutManager$SavedState3.f214385d = -1;
                    }
                    linearLayoutManager$SavedState = linearLayoutManager$SavedState3;
                }
                savedState.f214429f = linearLayoutManager$SavedState;
            } else {
                savedState.f214429f = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i17 == i19 && i18 == i27) {
            return;
        }
        this.R = null;
        this.P = null;
        this.Q = null;
        this.N = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x0534, code lost:
    
        if (r8 != false) goto L695;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0521, code lost:
    
        if (r1 < r2) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00e2, code lost:
    
        if (r15 >= 0) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x0139, code lost:
    
        if (r12 >= 0) goto L420;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0218  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r27) {
        /*
            Method dump skipped, instructions count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // n3.d0
    public void p(int i17) {
        getScrollingChildHelper().k(i17);
    }

    public void q(android.view.View view) {
        com.tencent.mm.xcompat.recyclerview.widget.y1 K = K(view);
        com.tencent.mm.xcompat.recyclerview.widget.u0 u0Var = this.f214412s;
        if (u0Var != null && K != null) {
            u0Var.getClass();
        }
        java.util.List list = this.H;
        if (list != null) {
            for (int size = ((java.util.ArrayList) list).size() - 1; size >= 0; size--) {
                ((com.tencent.mm.xcompat.recyclerview.widget.h1) ((java.util.ArrayList) this.H).get(size)).getClass();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0312, code lost:
    
        if (r19.f214402i.j(getFocusedChild()) == false) goto L410;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x025b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r() {
        /*
            Method dump skipped, instructions count: 904
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.r():void");
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(android.view.View view, boolean z17) {
        com.tencent.mm.xcompat.recyclerview.widget.y1 K = K(view);
        if (K != null) {
            if (K.s()) {
                K.f214712p &= -257;
            } else if (!K.y()) {
                throw new java.lang.IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + K + B());
            }
        } else if (Y1) {
            throw new java.lang.IllegalArgumentException("No ViewHolder found for child: " + view + B());
        }
        view.clearAnimation();
        q(view);
        super.removeDetachedView(view, z17);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View view, android.view.View view2) {
        com.tencent.mm.xcompat.recyclerview.widget.t1 t1Var = this.f214413t.f214525e;
        boolean z17 = true;
        if (!(t1Var != null && t1Var.f214640e) && !L()) {
            z17 = false;
        }
        if (!z17 && view2 != null) {
            X(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View view, android.graphics.Rect rect, boolean z17) {
        this.f214413t.getClass();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        java.util.ArrayList arrayList = this.f214416w;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            ((com.tencent.mm.xcompat.recyclerview.widget.j1) arrayList.get(i17)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z17);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.B != 0 || this.D) {
            this.C = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x011d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0089 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s() {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.s():void");
    }

    @Override // android.view.View
    public void scrollBy(int i17, int i18) {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var == null || this.D) {
            return;
        }
        boolean b17 = g1Var.b();
        boolean c17 = this.f214413t.c();
        if (b17 || c17) {
            if (!b17) {
                i17 = 0;
            }
            if (!c17) {
                i18 = 0;
            }
            Z(i17, i18, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i17, int i18) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (L()) {
            int a17 = accessibilityEvent != null ? o3.b.a(accessibilityEvent) : 0;
            this.F |= a17 != 0 ? a17 : 0;
            r1 = 1;
        }
        if (r1 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(com.tencent.mm.xcompat.recyclerview.widget.a2 a2Var) {
        this.M1 = a2Var;
        n3.l1.l(this, a2Var);
    }

    public void setAdapter(com.tencent.mm.xcompat.recyclerview.widget.u0 u0Var) {
        setLayoutFrozen(false);
        com.tencent.mm.xcompat.recyclerview.widget.u0 u0Var2 = this.f214412s;
        com.tencent.mm.xcompat.recyclerview.widget.p1 p1Var = this.f214398e;
        if (u0Var2 != null) {
            u0Var2.f214644a.unregisterObserver(p1Var);
            this.f214412s.getClass();
        }
        com.tencent.mm.xcompat.recyclerview.widget.b1 b1Var = this.S;
        if (b1Var != null) {
            b1Var.e();
        }
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = this.f214399f;
        if (g1Var != null) {
            g1Var.v(n1Var);
            this.f214413t.w(n1Var);
        }
        n1Var.f214588a.clear();
        n1Var.e();
        com.tencent.mm.xcompat.recyclerview.widget.c cVar = this.f214401h;
        cVar.l(cVar.f214469b);
        cVar.l(cVar.f214470c);
        cVar.f214473f = 0;
        com.tencent.mm.xcompat.recyclerview.widget.u0 u0Var3 = this.f214412s;
        this.f214412s = u0Var;
        if (u0Var != null) {
            u0Var.f214644a.registerObserver(p1Var);
        }
        com.tencent.mm.xcompat.recyclerview.widget.u0 u0Var4 = this.f214412s;
        n1Var.f214588a.clear();
        n1Var.e();
        n1Var.d(u0Var3, true);
        com.tencent.mm.xcompat.recyclerview.widget.m1 b17 = n1Var.b();
        if (u0Var3 != null) {
            b17.f214581b--;
        }
        if (b17.f214581b == 0) {
            int i17 = 0;
            while (true) {
                android.util.SparseArray sparseArray = b17.f214580a;
                if (i17 >= sparseArray.size()) {
                    break;
                }
                com.tencent.mm.xcompat.recyclerview.widget.l1 l1Var = (com.tencent.mm.xcompat.recyclerview.widget.l1) sparseArray.valueAt(i17);
                java.util.Iterator it = l1Var.f214568a.iterator();
                while (it.hasNext()) {
                    s3.a.a(((com.tencent.mm.xcompat.recyclerview.widget.y1) it.next()).f214703d);
                }
                l1Var.f214568a.clear();
                i17++;
            }
        }
        if (u0Var4 != null) {
            b17.f214581b++;
        }
        n1Var.c();
        this.F1.f214651f = true;
        T(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(com.tencent.mm.xcompat.recyclerview.widget.x0 x0Var) {
        if (x0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z17) {
        if (z17 != this.f214405n) {
            this.R = null;
            this.P = null;
            this.Q = null;
            this.N = null;
        }
        this.f214405n = z17;
        super.setClipToPadding(z17);
        if (this.A) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(com.tencent.mm.xcompat.recyclerview.widget.y0 y0Var) {
        y0Var.getClass();
        this.M = y0Var;
        this.R = null;
        this.P = null;
        this.Q = null;
        this.N = null;
    }

    public void setHasFixedSize(boolean z17) {
        this.f214423z = z17;
    }

    public void setItemAnimator(com.tencent.mm.xcompat.recyclerview.widget.b1 b1Var) {
        com.tencent.mm.xcompat.recyclerview.widget.b1 b1Var2 = this.S;
        if (b1Var2 != null) {
            b1Var2.e();
            this.S.f214461a = null;
        }
        this.S = b1Var;
        if (b1Var != null) {
            b1Var.f214461a = this.K1;
        }
    }

    public void setItemViewCacheSize(int i17) {
        com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = this.f214399f;
        n1Var.f214592e = i17;
        n1Var.l();
    }

    @java.lang.Deprecated
    public void setLayoutFrozen(boolean z17) {
        suppressLayout(z17);
    }

    public void setLayoutManager(com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var) {
        com.tencent.mm.xcompat.recyclerview.widget.e eVar;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView;
        com.tencent.mm.xcompat.recyclerview.widget.t1 t1Var;
        if (g1Var == this.f214413t) {
            return;
        }
        int i17 = 0;
        setScrollState(0);
        com.tencent.mm.xcompat.recyclerview.widget.x1 x1Var = this.C1;
        x1Var.f214696m.removeCallbacks(x1Var);
        x1Var.f214692f.abortAnimation();
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var2 = this.f214413t;
        if (g1Var2 != null && (t1Var = g1Var2.f214525e) != null) {
            t1Var.c();
        }
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var3 = this.f214413t;
        com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = this.f214399f;
        if (g1Var3 != null) {
            com.tencent.mm.xcompat.recyclerview.widget.b1 b1Var = this.S;
            if (b1Var != null) {
                b1Var.e();
            }
            this.f214413t.v(n1Var);
            this.f214413t.w(n1Var);
            n1Var.f214588a.clear();
            n1Var.e();
            if (this.f214420y) {
                this.f214413t.getClass();
            }
            this.f214413t.C(null);
            this.f214413t = null;
        } else {
            n1Var.f214588a.clear();
            n1Var.e();
        }
        com.tencent.mm.xcompat.recyclerview.widget.f fVar = this.f214402i;
        fVar.f214508b.g();
        java.util.ArrayList arrayList = (java.util.ArrayList) fVar.f214509c;
        int size = arrayList.size();
        while (true) {
            size--;
            eVar = fVar.f214507a;
            if (size < 0) {
                break;
            }
            android.view.View view = (android.view.View) arrayList.get(size);
            com.tencent.mm.xcompat.recyclerview.widget.r0 r0Var = (com.tencent.mm.xcompat.recyclerview.widget.r0) eVar;
            r0Var.getClass();
            com.tencent.mm.xcompat.recyclerview.widget.y1 K = K(view);
            if (K != null) {
                int i18 = K.f214718v;
                com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView2 = r0Var.f214623a;
                if (recyclerView2.L()) {
                    K.f214719w = i18;
                    ((java.util.ArrayList) recyclerView2.S1).add(K);
                } else {
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    n3.u0.s(K.f214703d, i18);
                }
                K.f214718v = 0;
            }
            arrayList.remove(size);
        }
        com.tencent.mm.xcompat.recyclerview.widget.r0 r0Var2 = (com.tencent.mm.xcompat.recyclerview.widget.r0) eVar;
        int a17 = r0Var2.a();
        while (true) {
            recyclerView = r0Var2.f214623a;
            if (i17 >= a17) {
                break;
            }
            android.view.View childAt = recyclerView.getChildAt(i17);
            recyclerView.q(childAt);
            childAt.clearAnimation();
            i17++;
        }
        recyclerView.removeAllViews();
        this.f214413t = g1Var;
        if (g1Var != null) {
            if (g1Var.f214522b != null) {
                throw new java.lang.IllegalArgumentException("LayoutManager " + g1Var + " is already attached to a RecyclerView:" + g1Var.f214522b.B());
            }
            g1Var.C(this);
            if (this.f214420y) {
                this.f214413t.getClass();
            }
        }
        n1Var.l();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @java.lang.Deprecated
    public void setLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new java.lang.IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z17) {
        getScrollingChildHelper().i(z17);
    }

    public void setOnFlingListener(com.tencent.mm.xcompat.recyclerview.widget.i1 i1Var) {
        this.f214409p1 = i1Var;
    }

    @java.lang.Deprecated
    public void setOnScrollListener(com.tencent.mm.xcompat.recyclerview.widget.k1 k1Var) {
        this.G1 = k1Var;
    }

    public void setPreserveFocusAfterLayout(boolean z17) {
        this.B1 = z17;
    }

    public void setRecycledViewPool(com.tencent.mm.xcompat.recyclerview.widget.m1 m1Var) {
        com.tencent.mm.xcompat.recyclerview.widget.n1 n1Var = this.f214399f;
        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = n1Var.f214595h;
        n1Var.d(recyclerView.f214412s, false);
        if (n1Var.f214594g != null) {
            r2.f214581b--;
        }
        n1Var.f214594g = m1Var;
        if (m1Var != null && recyclerView.getAdapter() != null) {
            n1Var.f214594g.f214581b++;
        }
        n1Var.c();
    }

    @java.lang.Deprecated
    public void setRecyclerListener(com.tencent.mm.xcompat.recyclerview.widget.o1 o1Var) {
    }

    public void setScrollState(int i17) {
        com.tencent.mm.xcompat.recyclerview.widget.t1 t1Var;
        if (i17 == this.T) {
            return;
        }
        if (Z1) {
            new java.lang.Exception();
        }
        this.T = i17;
        if (i17 != 2) {
            com.tencent.mm.xcompat.recyclerview.widget.x1 x1Var = this.C1;
            x1Var.f214696m.removeCallbacks(x1Var);
            x1Var.f214692f.abortAnimation();
            com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
            if (g1Var != null && (t1Var = g1Var.f214525e) != null) {
                t1Var.c();
            }
        }
        com.tencent.mm.xcompat.recyclerview.widget.k1 k1Var = this.G1;
        if (k1Var != null) {
            k1Var.a(this, i17);
        }
        java.util.List list = this.H1;
        if (list == null) {
            return;
        }
        int size = ((java.util.ArrayList) list).size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((com.tencent.mm.xcompat.recyclerview.widget.k1) ((java.util.ArrayList) this.H1).get(size)).a(this, i17);
            }
        }
    }

    public void setScrollingTouchSlop(int i17) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        if (i17 != 1) {
            this.f214403l1 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f214403l1 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(com.tencent.mm.xcompat.recyclerview.widget.w1 w1Var) {
        this.f214399f.getClass();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i17) {
        return getScrollingChildHelper().j(i17, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().k(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z17) {
        com.tencent.mm.xcompat.recyclerview.widget.t1 t1Var;
        if (z17 != this.D) {
            i("Do not suppressLayout in layout or scroll");
            if (!z17) {
                this.D = false;
                if (this.C && this.f214413t != null && this.f214412s != null) {
                    requestLayout();
                }
                this.C = false;
                return;
            }
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            onTouchEvent(android.view.MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.D = true;
            this.E = true;
            setScrollState(0);
            com.tencent.mm.xcompat.recyclerview.widget.x1 x1Var = this.C1;
            x1Var.f214696m.removeCallbacks(x1Var);
            x1Var.f214692f.abortAnimation();
            com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
            if (g1Var == null || (t1Var = g1Var.f214525e) == null) {
                return;
            }
            t1Var.c();
        }
    }

    public final void t() {
        f0();
        P();
        com.tencent.mm.xcompat.recyclerview.widget.u1 u1Var = this.F1;
        u1Var.a(6);
        this.f214401h.c();
        u1Var.f214650e = this.f214412s.a();
        u1Var.f214648c = 0;
        if (this.f214400g != null) {
            com.tencent.mm.xcompat.recyclerview.widget.u0 u0Var = this.f214412s;
            int ordinal = u0Var.f214645b.ordinal();
            if (ordinal == 1 ? u0Var.a() > 0 : ordinal != 2) {
                android.os.Parcelable parcelable = this.f214400g.f214429f;
                if (parcelable != null) {
                    com.tencent.mm.xcompat.recyclerview.widget.e0 e0Var = (com.tencent.mm.xcompat.recyclerview.widget.e0) this.f214413t;
                    e0Var.getClass();
                    if (parcelable instanceof com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState) {
                        com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState linearLayoutManager$SavedState = (com.tencent.mm.xcompat.recyclerview.widget.LinearLayoutManager$SavedState) parcelable;
                        e0Var.f214501v = linearLayoutManager$SavedState;
                        if (e0Var.f214499t != -1) {
                            linearLayoutManager$SavedState.f214385d = -1;
                        }
                        com.tencent.mm.xcompat.recyclerview.widget.RecyclerView recyclerView = e0Var.f214522b;
                        if (recyclerView != null) {
                            recyclerView.requestLayout();
                        }
                    }
                }
                this.f214400g = null;
            }
        }
        u1Var.f214652g = false;
        this.f214413t.u(this.f214399f, u1Var);
        u1Var.f214651f = false;
        u1Var.f214655j = u1Var.f214655j && this.S != null;
        u1Var.f214649d = 4;
        Q(true);
        g0(false);
    }

    public boolean u(int i17, int i18, int[] iArr, int[] iArr2, int i19) {
        return getScrollingChildHelper().d(i17, i18, iArr, iArr2, i19);
    }

    public final void v(int i17, int i18, int i19, int i27, int[] iArr, int i28, int[] iArr2) {
        getScrollingChildHelper().f(i17, i18, i19, i27, iArr, i28, iArr2);
    }

    public void w(int i17, int i18) {
        this.L++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i17, scrollY - i18);
        com.tencent.mm.xcompat.recyclerview.widget.k1 k1Var = this.G1;
        if (k1Var != null) {
            k1Var.b(this, i17, i18);
        }
        java.util.List list = this.H1;
        if (list != null) {
            for (int size = ((java.util.ArrayList) list).size() - 1; size >= 0; size--) {
                ((com.tencent.mm.xcompat.recyclerview.widget.k1) ((java.util.ArrayList) this.H1).get(size)).b(this, i17, i18);
            }
        }
        this.L--;
    }

    public void x() {
        if (this.R != null) {
            return;
        }
        android.widget.EdgeEffect a17 = this.M.a(this, 3);
        this.R = a17;
        if (this.f214405n) {
            a17.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a17.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void y() {
        if (this.N != null) {
            return;
        }
        android.widget.EdgeEffect a17 = this.M.a(this, 0);
        this.N = a17;
        if (this.f214405n) {
            a17.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a17.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void z() {
        if (this.Q != null) {
            return;
        }
        android.widget.EdgeEffect a17 = this.M.a(this, 2);
        this.Q = a17;
        if (this.f214405n) {
            a17.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a17.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public RecyclerView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        float a17;
        float a18;
        android.content.res.TypedArray typedArray;
        int i18;
        char c17;
        java.lang.ClassLoader classLoader;
        java.lang.reflect.Constructor constructor;
        java.lang.Object[] objArr;
        this.f214398e = new com.tencent.mm.xcompat.recyclerview.widget.p1(this);
        this.f214399f = new com.tencent.mm.xcompat.recyclerview.widget.n1(this);
        this.f214404m = new com.tencent.mm.xcompat.recyclerview.widget.l2();
        this.f214406o = new com.tencent.mm.xcompat.recyclerview.widget.n0(this);
        this.f214407p = new android.graphics.Rect();
        this.f214410q = new android.graphics.Rect();
        this.f214411r = new android.graphics.RectF();
        this.f214414u = new java.util.ArrayList();
        this.f214415v = new java.util.ArrayList();
        this.f214416w = new java.util.ArrayList();
        this.B = 0;
        this.I = false;
        this.f214396J = false;
        this.K = 0;
        this.L = 0;
        this.M = f214395h2;
        this.S = new com.tencent.mm.xcompat.recyclerview.widget.q();
        this.T = 0;
        this.U = -1;
        this.f214424z1 = Float.MIN_VALUE;
        this.A1 = Float.MIN_VALUE;
        this.B1 = true;
        this.C1 = new com.tencent.mm.xcompat.recyclerview.widget.x1(this);
        this.E1 = f214392e2 ? new com.tencent.mm.xcompat.recyclerview.widget.x() : null;
        this.F1 = new com.tencent.mm.xcompat.recyclerview.widget.u1();
        this.I1 = false;
        this.J1 = false;
        com.tencent.mm.xcompat.recyclerview.widget.c1 c1Var = new com.tencent.mm.xcompat.recyclerview.widget.c1(this);
        this.K1 = c1Var;
        this.L1 = false;
        this.N1 = new int[2];
        this.P1 = new int[2];
        this.Q1 = new int[2];
        this.R1 = new int[2];
        this.S1 = new java.util.ArrayList();
        this.T1 = new com.tencent.mm.xcompat.recyclerview.widget.o0(this);
        this.V1 = 0;
        this.W1 = 0;
        this.X1 = new com.tencent.mm.xcompat.recyclerview.widget.q0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        this.f214403l1 = viewConfiguration.getScaledTouchSlop();
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 >= 26) {
            java.lang.reflect.Method method = n3.o1.f334378a;
            a17 = n3.m1.a(viewConfiguration);
        } else {
            a17 = n3.o1.a(viewConfiguration, context);
        }
        this.f214424z1 = a17;
        if (i19 >= 26) {
            a18 = n3.m1.b(viewConfiguration);
        } else {
            a18 = n3.o1.a(viewConfiguration, context);
        }
        this.A1 = a18;
        this.f214419x1 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f214422y1 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f214397d = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.S.f214461a = c1Var;
        this.f214401h = new com.tencent.mm.xcompat.recyclerview.widget.c(new com.tencent.mm.xcompat.recyclerview.widget.s0(this));
        this.f214402i = new com.tencent.mm.xcompat.recyclerview.widget.f(new com.tencent.mm.xcompat.recyclerview.widget.r0(this));
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if ((i19 >= 26 ? n3.d1.c(this) : 0) == 0 && i19 >= 26) {
            n3.d1.m(this, 8);
        }
        if (n3.u0.c(this) == 0) {
            n3.u0.s(this, 1);
        }
        this.G = (android.view.accessibility.AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new com.tencent.mm.xcompat.recyclerview.widget.a2(this));
        int[] iArr = sq5.a.f411386a;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i17, 0);
        if (i19 >= 29) {
            typedArray = obtainStyledAttributes;
            n3.f1.d(this, context, iArr, attributeSet, obtainStyledAttributes, i17, 0);
        } else {
            typedArray = obtainStyledAttributes;
        }
        java.lang.String string = typedArray.getString(8);
        if (typedArray.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f214405n = typedArray.getBoolean(1, true);
        if (typedArray.getBoolean(3, false)) {
            android.graphics.drawable.StateListDrawable stateListDrawable = (android.graphics.drawable.StateListDrawable) typedArray.getDrawable(6);
            android.graphics.drawable.Drawable drawable = typedArray.getDrawable(7);
            android.graphics.drawable.StateListDrawable stateListDrawable2 = (android.graphics.drawable.StateListDrawable) typedArray.getDrawable(4);
            android.graphics.drawable.Drawable drawable2 = typedArray.getDrawable(5);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                android.content.res.Resources resources = getContext().getResources();
                i18 = 4;
                c17 = 2;
                new com.tencent.mm.xcompat.recyclerview.widget.v(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480407x2), resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f480409x4), resources.getDimensionPixelOffset(com.tencent.mm.R.dimen.f480408x3));
            } else {
                throw new java.lang.IllegalArgumentException("Trying to set fast scroller without both required drawables." + B());
            }
        } else {
            i18 = 4;
            c17 = 2;
        }
        typedArray.recycle();
        if (string != null) {
            java.lang.String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    java.lang.Class<? extends U> asSubclass = java.lang.Class.forName(trim, false, classLoader).asSubclass(com.tencent.mm.xcompat.recyclerview.widget.g1.class);
                    try {
                        constructor = asSubclass.getConstructor(f214393f2);
                        objArr = new java.lang.Object[i18];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c17] = java.lang.Integer.valueOf(i17);
                        objArr[3] = 0;
                    } catch (java.lang.NoSuchMethodException e17) {
                        try {
                            constructor = asSubclass.getConstructor(new java.lang.Class[0]);
                            objArr = null;
                        } catch (java.lang.NoSuchMethodException e18) {
                            e18.initCause(e17);
                            throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + trim, e18);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((com.tencent.mm.xcompat.recyclerview.widget.g1) constructor.newInstance(objArr));
                } catch (java.lang.ClassCastException e19) {
                    throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + trim, e19);
                } catch (java.lang.ClassNotFoundException e27) {
                    throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + trim, e27);
                } catch (java.lang.IllegalAccessException e28) {
                    throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + trim, e28);
                } catch (java.lang.InstantiationException e29) {
                    throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e29);
                } catch (java.lang.reflect.InvocationTargetException e37) {
                    throw new java.lang.IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + trim, e37);
                }
            }
        }
        int[] iArr2 = f214388a2;
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i17, 0);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            n3.f1.d(this, context, iArr2, attributeSet, obtainStyledAttributes2, i17, 0);
        }
        boolean z17 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z17);
        setTag(com.tencent.mm.R.id.hgw, java.lang.Boolean.TRUE);
    }

    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public com.tencent.mm.xcompat.recyclerview.widget.y1 f214425a;

        /* renamed from: b */
        public final android.graphics.Rect f214426b;

        /* renamed from: c */
        public boolean f214427c;

        /* renamed from: d */
        public boolean f214428d;

        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f214426b = new android.graphics.Rect();
            this.f214427c = true;
            this.f214428d = false;
        }

        public int a() {
            return this.f214425a.e();
        }

        public LayoutParams(int i17, int i18) {
            super(i17, i18);
            this.f214426b = new android.graphics.Rect();
            this.f214427c = true;
            this.f214428d = false;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f214426b = new android.graphics.Rect();
            this.f214427c = true;
            this.f214428d = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f214426b = new android.graphics.Rect();
            this.f214427c = true;
            this.f214428d = false;
        }

        public LayoutParams(com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
            super((android.view.ViewGroup.LayoutParams) layoutParams);
            this.f214426b = new android.graphics.Rect();
            this.f214427c = true;
            this.f214428d = false;
        }
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        com.tencent.mm.xcompat.recyclerview.widget.g1 g1Var = this.f214413t;
        if (g1Var != null) {
            g1Var.getClass();
            if (layoutParams instanceof com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) {
                return new com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams((com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) layoutParams);
            }
            if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                return new com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams((android.view.ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams(layoutParams);
        }
        throw new java.lang.IllegalStateException("RecyclerView has no LayoutManager" + B());
    }
}
