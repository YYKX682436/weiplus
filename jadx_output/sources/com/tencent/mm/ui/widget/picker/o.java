package com.tencent.mm.ui.widget.picker;

/* loaded from: classes9.dex */
public class o implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public y9.i f212300d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f212301e;

    /* renamed from: f, reason: collision with root package name */
    public int f212302f;

    /* renamed from: g, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f212303g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f212304h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f212305i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.CustomDatePickerNew f212306m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.n f212307n;

    public o(android.content.Context context) {
        this.f212300d = new y9.i(context, 0);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.a3k, null);
        this.f212301e = inflate;
        this.f212304h = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.cqo);
        this.f212305i = (android.widget.LinearLayout) this.f212301e.findViewById(com.tencent.mm.R.id.cqq);
        this.f212306m = new com.tencent.mm.ui.widget.picker.CustomDatePickerNew(context);
        this.f212304h.removeAllViews();
        this.f212304h.setGravity(17);
        this.f212304h.addView(this.f212306m.getView(), new android.widget.LinearLayout.LayoutParams(-1, -1));
        ((android.widget.Button) this.f212301e.findViewById(com.tencent.mm.R.id.khs)).setOnClickListener(new com.tencent.mm.ui.widget.picker.i(this));
        ((android.widget.Button) this.f212301e.findViewById(com.tencent.mm.R.id.b5i)).setOnClickListener(new com.tencent.mm.ui.widget.picker.j(this));
        ((android.widget.Button) this.f212301e.findViewById(com.tencent.mm.R.id.b1e)).setOnClickListener(new com.tencent.mm.ui.widget.picker.k(this));
        this.f212300d.setContentView(this.f212301e);
        this.f212300d.setOnCancelListener(new com.tencent.mm.ui.widget.picker.l(this));
        this.f212302f = com.tencent.mm.ui.zk.a(context, com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOn);
        com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) this.f212301e.getParent());
        this.f212303g = A;
        if (A != null) {
            A.C(this.f212302f);
            this.f212303g.f44443p = false;
        }
        this.f212300d.setOnDismissListener(new com.tencent.mm.ui.widget.picker.m(this));
    }

    public java.lang.String a() {
        com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew = this.f212306m;
        if (customDatePickerNew == null) {
            return null;
        }
        customDatePickerNew.f212193e.f();
        return customDatePickerNew.f212200o ? java.lang.String.format(java.util.Locale.US, "%04d-%02d-%02d", java.lang.Integer.valueOf(customDatePickerNew.f212197i), java.lang.Integer.valueOf(customDatePickerNew.f212198m), java.lang.Integer.valueOf(customDatePickerNew.f212199n)) : customDatePickerNew.f212201p ? java.lang.String.format(java.util.Locale.US, "%04d-%02d", java.lang.Integer.valueOf(customDatePickerNew.f212197i), java.lang.Integer.valueOf(customDatePickerNew.f212198m)) : java.lang.String.format(java.util.Locale.US, "%04d", java.lang.Integer.valueOf(customDatePickerNew.f212197i));
    }

    public void b() {
        y9.i iVar = this.f212300d;
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    public void c(android.view.View view) {
        android.widget.LinearLayout linearLayout = this.f212305i;
        if (linearLayout != null) {
            if (view == null) {
                linearLayout.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(0);
            this.f212305i.removeAllViews();
            this.f212305i.setGravity(17);
            this.f212305i.addView(view, new android.widget.LinearLayout.LayoutParams(-1, -2));
        }
    }

    public void d(int i17, int i18, int i19) {
        com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew;
        if (i17 < 0 || i18 < 0 || i19 < 0 || (customDatePickerNew = this.f212306m) == null) {
            return;
        }
        customDatePickerNew.f212203r = i17;
        customDatePickerNew.f212204s = i18;
        customDatePickerNew.f212205t = i19;
        if (customDatePickerNew.f212192d == null) {
            customDatePickerNew.f212192d = customDatePickerNew.f212193e.d();
        }
    }

    public void e(int i17, int i18, int i19) {
        if (i17 < 0 || i18 < 0 || i19 < 0) {
            return;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.Locale.US);
        calendar.set(i17, i18 - 1, i19);
        com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew = this.f212306m;
        if (customDatePickerNew != null) {
            customDatePickerNew.setMaxDate(java.lang.Long.valueOf(calendar.getTimeInMillis()));
        }
    }

    public void f(int i17, int i18, int i19) {
        if (i17 < 0 || i18 < 0 || i19 < 0) {
            return;
        }
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.Locale.US);
        calendar.set(i17, i18 - 1, i19);
        com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew = this.f212306m;
        if (customDatePickerNew != null) {
            customDatePickerNew.setMinDate(java.lang.Long.valueOf(calendar.getTimeInMillis()));
        }
    }

    public void g(boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew = this.f212306m;
        if (customDatePickerNew != null) {
            customDatePickerNew.f212200o = z19;
            customDatePickerNew.f212201p = z18;
            customDatePickerNew.f212202q = z17;
        }
    }

    public void h() {
        if (this.f212300d != null) {
            com.tencent.mm.ui.widget.picker.CustomDatePickerNew customDatePickerNew = this.f212306m;
            if (customDatePickerNew != null) {
                customDatePickerNew.a();
            }
            this.f212300d.show();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }
}
