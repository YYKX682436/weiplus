package com.tencent.mm.plugin.gallery.picker.behavior;

/* loaded from: classes15.dex */
public class AppBarLayoutBehavior extends com.google.android.material.appbar.AppBarLayout.Behavior implements android.view.View.OnTouchListener {
    public final int A;
    public final android.graphics.Rect B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* renamed from: x, reason: collision with root package name */
    public boolean f138457x;

    /* renamed from: y, reason: collision with root package name */
    public com.google.android.material.appbar.AppBarLayout f138458y;

    /* renamed from: z, reason: collision with root package name */
    public android.view.View f138459z;

    public AppBarLayoutBehavior() {
        this.f138457x = false;
        this.A = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479723df);
        this.B = new android.graphics.Rect();
        this.C = true;
        this.D = false;
        this.E = false;
        this.f44296w = new y23.a(this);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: J */
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
        this.f138458y = appBarLayout;
        this.f138459z = appBarLayout.findViewById(com.tencent.mm.R.id.ga6);
        if (coordinatorLayout instanceof com.tencent.mm.plugin.gallery.picker.view.TouchCoordinatorLayout) {
            ((com.tencent.mm.plugin.gallery.picker.view.TouchCoordinatorLayout) coordinatorLayout).setTouchListener(this);
        }
        super.g(coordinatorLayout, appBarLayout, i17);
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: K */
    public void l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i17, int i18, int[] iArr, int i19) {
        if (!(i19 == 1 && this.D) && this.f138457x) {
            super.l(coordinatorLayout, appBarLayout, view, i17, i18, iArr, i19);
            if (this.C) {
                if (iArr[1] == 0) {
                    super.o(coordinatorLayout, appBarLayout, view, 0, 0, 0, i18, i19);
                }
                iArr[1] = i18;
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: L */
    public void o(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, int i17, int i18, int i19, int i27, int i28) {
        if (!(i28 == 1 && this.D) && this.f138457x) {
            super.o(coordinatorLayout, appBarLayout, view, i17, i18, i19, i27, i28);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: M */
    public boolean u(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, com.google.android.material.appbar.AppBarLayout appBarLayout, android.view.View view, android.view.View view2, int i17, int i18) {
        super.u(coordinatorLayout, appBarLayout, view, view2, i17, i18);
        return true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public /* bridge */ /* synthetic */ boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17) {
        g(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, i17);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/picker/behavior/AppBarLayoutBehavior", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        android.graphics.Rect rect = this.B;
        if (action == 0) {
            this.f138457x = false;
            this.E = false;
            this.C = java.lang.Math.abs(y()) <= 0;
            this.D = this.f138458y.getTotalScrollRange() == java.lang.Math.abs(y());
            if (this.C) {
                this.f138459z.getGlobalVisibleRect(rect);
                if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    this.f138457x = true;
                    this.E = true;
                }
            }
        }
        if (this.D) {
            this.f138457x = true;
        }
        if (!this.f138457x) {
            this.f138458y.getGlobalVisibleRect(rect);
            rect.bottom -= this.A;
            if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                this.f138457x = true;
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/gallery/picker/behavior/AppBarLayoutBehavior", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean u(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i17, int i18) {
        super.u(coordinatorLayout, (com.google.android.material.appbar.AppBarLayout) view, view2, view3, i17, i18);
        return true;
    }

    public AppBarLayoutBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f138457x = false;
        this.A = (int) com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimension(com.tencent.mm.R.dimen.f479723df);
        this.B = new android.graphics.Rect();
        this.C = true;
        this.D = false;
        this.E = false;
        this.f44296w = new y23.a(this);
    }
}
