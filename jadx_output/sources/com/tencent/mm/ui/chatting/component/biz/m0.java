package com.tencent.mm.ui.chatting.component.biz;

/* loaded from: classes8.dex */
public class m0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Dialog f198799d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f198800e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f198801f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f198802g;

    /* renamed from: h, reason: collision with root package name */
    public int f198803h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f198804i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewTreeObserver f198805m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f198806n;

    public m0(android.content.Context context) {
        this.f198802g = false;
        this.f198800e = context;
        if (context instanceof android.app.Activity) {
            this.f198804i = ((android.view.ViewGroup) ((android.app.Activity) context).getWindow().getDecorView()).findViewById(android.R.id.content);
        }
        y9.i iVar = new y9.i(context, com.tencent.mm.R.style.f30do);
        this.f198799d = iVar;
        iVar.setCanceledOnTouchOutside(false);
        this.f198801f = android.view.View.inflate(context, com.tencent.mm.R.layout.f488213kn, null);
        this.f198802g = a();
        this.f198799d.setContentView(this.f198801f);
        com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) this.f198801f.getParent());
        this.f198806n = A;
        A.D(3);
        this.f198806n.f44453z = new com.tencent.mm.ui.chatting.component.biz.k0(this);
        this.f198799d.setOnDismissListener(new com.tencent.mm.ui.chatting.component.biz.l0(this));
    }

    public final boolean a() {
        return this.f198800e.getResources().getConfiguration().orientation == 2;
    }

    public void b() {
        android.app.Dialog dialog = this.f198799d;
        if (dialog != null) {
            android.content.Context context = this.f198800e;
            if (!(context instanceof android.app.Activity)) {
                dialog.dismiss();
            } else if (context != null && !((android.app.Activity) context).isFinishing() && !((android.app.Activity) context).isDestroyed()) {
                this.f198799d.dismiss();
            }
            com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehavior = this.f198806n;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.f44443p = true;
            }
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        android.app.Dialog dialog = this.f198799d;
        if (dialog != null && dialog.isShowing()) {
            android.view.View view = this.f198804i;
            if (view == null || !(view.isShown() || view.getVisibility() == 0)) {
                b();
                return;
            }
            android.app.Dialog dialog2 = this.f198799d;
            if (dialog2 != null && dialog2.isShowing()) {
                if (this.f198802g == a()) {
                    int i17 = this.f198803h;
                    android.content.Context context = this.f198800e;
                    if (i17 == (context instanceof android.app.Activity ? ((android.app.Activity) context).getWindow().getWindowManager().getDefaultDisplay().getRotation() : 0)) {
                        return;
                    }
                }
                b();
            }
        }
    }
}
