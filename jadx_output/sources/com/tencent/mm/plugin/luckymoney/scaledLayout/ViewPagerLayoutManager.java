package com.tencent.mm.plugin.luckymoney.scaledLayout;

/* loaded from: classes15.dex */
public abstract class ViewPagerLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    public int A;
    public float B;
    public com.tencent.mm.plugin.luckymoney.scaledLayout.e C;
    public boolean D;
    public boolean E;
    public final boolean F;
    public int G;
    public com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState H;
    public float I;

    /* renamed from: J, reason: collision with root package name */
    public int f145739J;
    public int K;
    public int L;
    public int M;
    public android.view.View N;

    /* renamed from: v, reason: collision with root package name */
    public final android.util.SparseArray f145740v;

    /* renamed from: w, reason: collision with root package name */
    public int f145741w;

    /* renamed from: x, reason: collision with root package name */
    public int f145742x;

    /* renamed from: y, reason: collision with root package name */
    public int f145743y;

    /* renamed from: z, reason: collision with root package name */
    public int f145744z;

    public ViewPagerLayoutManager(android.content.Context context, int i17, boolean z17) {
        super(context);
        this.f145740v = new android.util.SparseArray();
        this.D = false;
        this.E = false;
        this.F = true;
        this.G = -1;
        this.H = null;
        this.L = -1;
        this.M = Integer.MAX_VALUE;
        Q(i17);
        R(z17);
        setAutoMeasureEnabled(true);
        setItemPrefetchEnabled(false);
    }

    private int O(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0 || i17 == 0) {
            return 0;
        }
        r();
        float f17 = i17;
        float Z = f17 / Z();
        if (java.lang.Math.abs(Z) < 1.0E-8f) {
            return 0;
        }
        float f18 = this.B + Z;
        if (f18 < (!this.E ? 0.0f : (-(getItemCount() - 1)) * this.I)) {
            i17 = (int) (f17 - ((f18 - (this.E ? (-(getItemCount() - 1)) * this.I : 0.0f)) * Z()));
        } else {
            if (f18 > (!this.E ? (getItemCount() - 1) * this.I : 0.0f)) {
                i17 = (int) (((this.E ? 0.0f : (getItemCount() - 1) * this.I) - this.B) * Z());
            }
        }
        this.B += i17 / Z();
        c0(z2Var);
        return i17;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int H() {
        return this.f145743y;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void Q(int i17) {
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalArgumentException("invalid orientation:" + i17);
        }
        assertNotInLayoutOrScroll(null);
        if (i17 == this.f145743y) {
            return;
        }
        this.f145743y = i17;
        this.C = null;
        this.M = Integer.MAX_VALUE;
        removeAllViews();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void R(boolean z17) {
        assertNotInLayoutOrScroll(null);
        if (z17 == this.D) {
            return;
        }
        this.D = z17;
        removeAllViews();
    }

    public final int W() {
        if (getChildCount() == 0) {
            return 0;
        }
        if (!this.F) {
            return !this.E ? X() : (getItemCount() - X()) - 1;
        }
        boolean z17 = this.E;
        float f17 = z17 ? this.B : this.B;
        return !z17 ? (int) f17 : (int) (((getItemCount() - 1) * this.I) + f17);
    }

    public int X() {
        if (getItemCount() == 0) {
            return 0;
        }
        return java.lang.Math.abs(Y());
    }

    public int Y() {
        float f17 = this.I;
        if (f17 == 0.0f) {
            return 0;
        }
        return java.lang.Math.round(this.B / f17);
    }

    public float Z() {
        return 1.0f;
    }

    public final android.view.View a0(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var, int i17) {
        if (i17 >= h3Var.b() || i17 < 0) {
            return null;
        }
        try {
            return z2Var.f(i17);
        } catch (java.lang.Exception unused) {
            return a0(z2Var, h3Var, i17 + 1);
        }
    }

    public int b0(int i17) {
        return (int) (((i17 * (!this.E ? this.I : -this.I)) - this.B) * Z());
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c0(androidx.recyclerview.widget.z2 r26) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.c0(androidx.recyclerview.widget.z2):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        return this.f145743y == 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: canScrollVertically */
    public boolean getF123307r() {
        return this.f145743y == 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollExtent(androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.F) {
            return (int) this.I;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollOffset(androidx.recyclerview.widget.h3 h3Var) {
        return W();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeHorizontalScrollRange(androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.F ? getItemCount() : (int) (getItemCount() * this.I);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollExtent(androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        if (this.F) {
            return (int) this.I;
        }
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollOffset(androidx.recyclerview.widget.h3 h3Var) {
        return W();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int computeVerticalScrollRange(androidx.recyclerview.widget.h3 h3Var) {
        if (getChildCount() == 0) {
            return 0;
        }
        return !this.F ? getItemCount() : (int) (getItemCount() * this.I);
    }

    public abstract float d0();

    public abstract void e0(android.view.View view, float f17);

    public void f0() {
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.view.View findViewByPosition(int i17) {
        int itemCount = getItemCount();
        if (itemCount == 0) {
            return null;
        }
        int i18 = 0;
        while (true) {
            android.util.SparseArray sparseArray = this.f145740v;
            if (i18 >= sparseArray.size()) {
                return null;
            }
            int keyAt = sparseArray.keyAt(i18);
            if (keyAt < 0) {
                int i19 = keyAt % itemCount;
                if (i19 == 0) {
                    i19 = -itemCount;
                }
                if (i19 + itemCount == i17) {
                    return (android.view.View) sparseArray.valueAt(i18);
                }
            } else if (i17 == keyAt % itemCount) {
                return (android.view.View) sparseArray.valueAt(i18);
            }
            i18++;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public androidx.recyclerview.widget.RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new androidx.recyclerview.widget.RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onAdapterChanged(androidx.recyclerview.widget.f2 f2Var, androidx.recyclerview.widget.f2 f2Var2) {
        removeAllViews();
        this.B = 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onAddFocusables(androidx.recyclerview.widget.RecyclerView r5, java.util.ArrayList r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r4.X()
            android.view.View r1 = r4.findViewByPosition(r0)
            r2 = 1
            if (r1 != 0) goto Lc
            return r2
        Lc:
            boolean r3 = r5.hasFocus()
            if (r3 == 0) goto L4d
            int r6 = r4.f145743y
            r8 = -1
            if (r6 != r2) goto L25
            r6 = 33
            if (r7 != r6) goto L1e
            boolean r6 = r4.E
            goto L2b
        L1e:
            r6 = 130(0x82, float:1.82E-43)
            if (r7 != r6) goto L34
            boolean r6 = r4.E
            goto L35
        L25:
            r6 = 17
            if (r7 != r6) goto L2d
            boolean r6 = r4.E
        L2b:
            r6 = r6 ^ r2
            goto L35
        L2d:
            r6 = 66
            if (r7 != r6) goto L34
            boolean r6 = r4.E
            goto L35
        L34:
            r6 = r8
        L35:
            if (r6 == r8) goto L50
            if (r6 != r2) goto L3b
            int r0 = r0 - r2
            goto L3c
        L3b:
            int r0 = r0 + r2
        L3c:
            int r6 = r4.b0(r0)
            int r7 = r4.f145743y
            r8 = 0
            if (r7 != r2) goto L49
            r5.smoothScrollBy(r8, r6)
            goto L50
        L49:
            r5.smoothScrollBy(r6, r8)
            goto L50
        L4d:
            r1.addFocusables(r6, r7, r8)
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.onAddFocusables(androidx.recyclerview.widget.RecyclerView, java.util.ArrayList, int, int):boolean");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onDetachedFromWindow(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.z2 z2Var) {
        super.onDetachedFromWindow(recyclerView, z2Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.view.View onFocusSearchFailed(android.view.View view, int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        return null;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        float f17;
        float f18;
        if (h3Var.b() == 0) {
            removeAndRecycleAllViews(z2Var);
            this.B = 0.0f;
            return;
        }
        r();
        if (this.f145743y == 1 || !I()) {
            this.E = this.D;
        } else {
            this.E = !this.D;
        }
        android.view.View a07 = a0(z2Var, h3Var, 0);
        if (a07 == null) {
            removeAndRecycleAllViews(z2Var);
            this.B = 0.0f;
            return;
        }
        measureChildWithMargins(a07, 0, 0);
        this.f145741w = this.C.a(a07);
        this.f145742x = this.C.b(a07);
        this.f145744z = (this.C.d() - this.f145741w) / 2;
        if (this.M == Integer.MAX_VALUE) {
            this.A = (this.C.e() - this.f145742x) / 2;
        } else {
            this.A = (this.C.e() - this.f145742x) - this.M;
        }
        this.I = d0();
        f0();
        if (this.I == 0.0f) {
            this.f145739J = 1;
            this.K = 1;
        } else {
            this.f145739J = ((int) java.lang.Math.abs((((-this.f145741w) - this.C.c()) - this.f145744z) / this.I)) + 1;
            this.K = ((int) java.lang.Math.abs((this.C.d() - this.f145744z) / this.I)) + 1;
        }
        com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState savedState = this.H;
        if (savedState != null) {
            this.E = savedState.f145747f;
            this.G = savedState.f145745d;
            this.B = savedState.f145746e;
        }
        int i17 = this.G;
        if (i17 != -1) {
            if (this.E) {
                f17 = i17;
                f18 = -this.I;
            } else {
                f17 = i17;
                f18 = this.I;
            }
            this.B = f17 * f18;
        }
        c0(z2Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutCompleted(androidx.recyclerview.widget.h3 h3Var) {
        super.onLayoutCompleted(h3Var);
        this.H = null;
        this.G = -1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onRestoreInstanceState(android.os.Parcelable parcelable) {
        if (parcelable instanceof com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState) {
            this.H = new com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState((com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState) parcelable);
            requestLayout();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public android.os.Parcelable onSaveInstanceState() {
        com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState savedState = this.H;
        if (savedState != null) {
            return new com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState(savedState);
        }
        com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState savedState2 = new com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState();
        savedState2.f145745d = this.G;
        savedState2.f145746e = this.B;
        savedState2.f145747f = this.E;
        return savedState2;
    }

    public void r() {
        com.tencent.mm.plugin.luckymoney.scaledLayout.e cVar;
        if (this.C == null) {
            int i17 = this.f145743y;
            if (i17 == 0) {
                cVar = new com.tencent.mm.plugin.luckymoney.scaledLayout.c(this);
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalArgumentException("invalid orientation");
                }
                cVar = new com.tencent.mm.plugin.luckymoney.scaledLayout.d(this);
            }
            this.C = cVar;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollHorizontallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (this.f145743y == 1) {
            return 0;
        }
        return O(i17, z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void scrollToPosition(int i17) {
        if (i17 < 0 || i17 >= getItemCount()) {
            return;
        }
        this.G = i17;
        this.B = i17 * (this.E ? -this.I : this.I);
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
        if (this.f145743y == 0) {
            return 0;
        }
        return O(i17, z2Var, h3Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.h3 h3Var, int i17) {
        int b07 = b0(i17);
        if (this.f145743y == 1) {
            recyclerView.b1(0, b07, null);
        } else {
            recyclerView.b1(b07, 0, null);
        }
    }

    /* loaded from: classes15.dex */
    public static class SavedState implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState> CREATOR = new com.tencent.mm.plugin.luckymoney.scaledLayout.f();

        /* renamed from: d, reason: collision with root package name */
        public int f145745d;

        /* renamed from: e, reason: collision with root package name */
        public float f145746e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f145747f;

        public SavedState(android.os.Parcel parcel) {
            this.f145745d = parcel.readInt();
            this.f145746e = parcel.readFloat();
            this.f145747f = parcel.readInt() == 1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeInt(this.f145745d);
            parcel.writeFloat(this.f145746e);
            parcel.writeInt(this.f145747f ? 1 : 0);
        }

        public SavedState(com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager.SavedState savedState) {
            this.f145745d = savedState.f145745d;
            this.f145746e = savedState.f145746e;
            this.f145747f = savedState.f145747f;
        }
    }
}
