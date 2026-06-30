package com.tencent.mm.ui.chatting.view;

/* loaded from: classes11.dex */
public class g0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.c1 f202939d;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Dialog f202940e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f202941f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f202942g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f202943h;

    /* renamed from: i, reason: collision with root package name */
    public int f202944i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f202945m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f202946n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.ViewTreeObserver f202947o;

    public g0(android.content.Context context, android.view.View view) {
        this.f202943h = false;
        this.f202942g = view;
        this.f202941f = context;
        if (context instanceof android.app.Activity) {
            this.f202945m = ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView()).findViewById(android.R.id.content);
        }
        this.f202940e = new y9.i(context, com.tencent.mm.R.style.f30do);
        this.f202943h = a();
        android.app.Dialog dialog = this.f202940e;
        if (dialog != null) {
            dialog.setContentView(view);
        }
        com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) view.getParent());
        this.f202946n = A;
        A.D(3);
        android.app.Dialog dialog2 = this.f202940e;
        if (dialog2 != null) {
            dialog2.setOnDismissListener(new com.tencent.mm.ui.chatting.view.e0(this));
        }
    }

    public final boolean a() {
        return this.f202941f.getResources().getConfiguration().orientation == 2;
    }

    public void b() {
        android.app.Dialog dialog = this.f202940e;
        if (dialog != null) {
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f202946n;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f44443p = true;
            }
            android.content.Context context = this.f202941f;
            if (!(context instanceof android.app.Activity)) {
                dialog.dismiss();
            } else {
                if (context == null || ((android.app.Activity) context).isFinishing() || ((android.app.Activity) context).isDestroyed()) {
                    return;
                }
                this.f202940e.dismiss();
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.app.Dialog dialog = this.f202940e;
        if (dialog != null && dialog.isShowing()) {
            android.view.View view = this.f202945m;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                b();
                return;
            }
            android.app.Dialog dialog2 = this.f202940e;
            if (dialog2 != null && dialog2.isShowing()) {
                if (this.f202943h == a()) {
                    int i17 = this.f202944i;
                    android.content.Context context = this.f202941f;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                b();
            }
        }
    }
}
