package y9;

/* loaded from: classes14.dex */
public class b extends androidx.customview.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior f460240a;

    public b(com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior) {
        this.f460240a = bottomSheetBehavior;
    }

    @Override // androidx.customview.widget.k
    public int a(android.view.View view, int i17, int i18) {
        return view.getLeft();
    }

    @Override // androidx.customview.widget.k
    public int b(android.view.View view, int i17, int i18) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f460240a;
        return h3.a.b(i17, bottomSheetBehavior.B(), bottomSheetBehavior.f44443p ? bottomSheetBehavior.f44450w : bottomSheetBehavior.f44442o);
    }

    @Override // androidx.customview.widget.k
    public int d(android.view.View view) {
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f460240a;
        return bottomSheetBehavior.f44443p ? bottomSheetBehavior.f44450w : bottomSheetBehavior.f44442o;
    }

    @Override // androidx.customview.widget.k
    public void h(int i17) {
        if (i17 == 1) {
            this.f460240a.E(1);
        }
    }

    @Override // androidx.customview.widget.k
    public void i(android.view.View view, int i17, int i18, int i19, int i27) {
        this.f460240a.y(i18);
    }

    @Override // androidx.customview.widget.k
    public void j(android.view.View view, float f17, float f18) {
        int i17;
        int i18 = 0;
        int i19 = 6;
        int i27 = 3;
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f460240a;
        if (f18 < 0.0f) {
            if (bottomSheetBehavior.f44434d) {
                i17 = bottomSheetBehavior.f44440m;
            } else {
                int top = view.getTop();
                int i28 = bottomSheetBehavior.f44441n;
                if (top > i28) {
                    i18 = i28;
                    i17 = i18;
                    i27 = i19;
                }
                i19 = 3;
                i17 = i18;
                i27 = i19;
            }
        } else if (bottomSheetBehavior.f44443p && bottomSheetBehavior.F(view, f18) && (view.getTop() > bottomSheetBehavior.f44442o || java.lang.Math.abs(f17) < java.lang.Math.abs(f18))) {
            i17 = bottomSheetBehavior.f44450w;
            i27 = 5;
        } else if (f18 == 0.0f || java.lang.Math.abs(f17) > java.lang.Math.abs(f18)) {
            int top2 = view.getTop();
            if (!bottomSheetBehavior.f44434d) {
                int i29 = bottomSheetBehavior.f44441n;
                if (top2 < i29) {
                    if (top2 >= java.lang.Math.abs(top2 - bottomSheetBehavior.f44442o)) {
                        i18 = bottomSheetBehavior.f44441n;
                    }
                    i19 = 3;
                } else if (java.lang.Math.abs(top2 - i29) < java.lang.Math.abs(top2 - bottomSheetBehavior.f44442o)) {
                    i18 = bottomSheetBehavior.f44441n;
                } else {
                    i18 = bottomSheetBehavior.f44442o;
                    i19 = 4;
                }
            } else if (java.lang.Math.abs(top2 - bottomSheetBehavior.f44440m) < java.lang.Math.abs(top2 - bottomSheetBehavior.f44442o)) {
                i18 = bottomSheetBehavior.f44440m;
                i19 = 3;
            } else {
                i18 = bottomSheetBehavior.f44442o;
                i19 = 4;
            }
            i17 = i18;
            i27 = i19;
        } else {
            i17 = bottomSheetBehavior.f44442o;
            i27 = 4;
        }
        if (!bottomSheetBehavior.f44446s.s(view.getLeft(), i17)) {
            bottomSheetBehavior.E(i27);
            return;
        }
        bottomSheetBehavior.E(2);
        y9.d dVar = new y9.d(bottomSheetBehavior, view, i27);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.m(view, dVar);
    }

    @Override // androidx.customview.widget.k
    public boolean k(android.view.View view, int i17) {
        java.lang.ref.WeakReference weakReference;
        android.view.View view2;
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f460240a;
        int i18 = bottomSheetBehavior.f44445r;
        if (i18 == 1 || bottomSheetBehavior.D) {
            return false;
        }
        return ((i18 == 3 && bottomSheetBehavior.B == i17 && (view2 = (android.view.View) bottomSheetBehavior.f44452y.get()) != null && view2.canScrollVertically(-1)) || (weakReference = bottomSheetBehavior.f44451x) == null || weakReference.get() != view) ? false : true;
    }
}
