package y9;

/* loaded from: classes14.dex */
public class i extends androidx.appcompat.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f460247f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f460248g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f460249h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f460250i;

    /* renamed from: m, reason: collision with root package name */
    public final y9.c f460251m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968776(0x7f0400c8, float:1.7546215E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2131821605(0x7f110425, float:1.9275958E38)
        L1b:
            r3.<init>(r4, r5)
            r3.f460248g = r0
            r3.f460249h = r0
            y9.h r4 = new y9.h
            r4.<init>(r3)
            r3.f460251m = r4
            r3.C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.i.<init>(android.content.Context, int):void");
    }

    public final android.view.View D(int i17, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.View.inflate(getContext(), com.tencent.mm.R.layout.a3s, null);
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) frameLayout.findViewById(com.tencent.mm.R.id.f483952cj4);
        if (i17 != 0 && view == null) {
            view = getLayoutInflater().inflate(i17, (android.view.ViewGroup) coordinatorLayout, false);
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) coordinatorLayout.findViewById(com.tencent.mm.R.id.f484059cv0);
        com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A(frameLayout2);
        this.f460247f = A;
        A.f44453z = this.f460251m;
        A.f44443p = this.f460248g;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(com.tencent.mm.R.id.ohv).setOnClickListener(new y9.e(this));
        n3.l1.l(frameLayout2, new y9.f(this));
        frameLayout2.setOnTouchListener(new y9.g(this));
        return frameLayout;
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f460247f;
        if (bottomSheetBehavior == null || bottomSheetBehavior.f44445r != 5) {
            return;
        }
        bottomSheetBehavior.D(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        if (this.f460248g != z17) {
            this.f460248g = z17;
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f460247f;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f44443p = z17;
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z17) {
        super.setCanceledOnTouchOutside(z17);
        if (z17 && !this.f460248g) {
            this.f460248g = true;
        }
        this.f460249h = z17;
        this.f460250i = true;
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(int i17) {
        super.setContentView(D(i17, null, null));
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view) {
        super.setContentView(D(0, view, null));
    }

    @Override // androidx.appcompat.app.i0, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(D(0, view, layoutParams));
    }
}
