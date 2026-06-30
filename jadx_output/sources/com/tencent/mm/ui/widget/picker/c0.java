package com.tencent.mm.ui.widget.picker;

/* loaded from: classes3.dex */
public class c0 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    public final boolean A;
    public com.tencent.mm.ui.widget.picker.y B;
    public com.tencent.mm.ui.widget.picker.b0 C;

    /* renamed from: d, reason: collision with root package name */
    public y9.i f212246d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f212247e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f212248f;

    /* renamed from: g, reason: collision with root package name */
    public int f212249g;

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.material.bottomsheet.BottomSheetBehavior f212250h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f212251i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f212252m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String[] f212253n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f212254o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f212255p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.CustomOptionPickNew f212256q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.CustomOptionPickNew f212257r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.CustomOptionPickNew f212258s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.a0 f212259t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.ui.widget.picker.z f212260u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.LinearLayout f212261v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f212262w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f212263x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f212264y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.LinearLayout f212265z;

    public c0(android.content.Context context, java.lang.String[] strArr) {
        this.f212254o = null;
        this.f212255p = null;
        this.A = false;
        this.f212248f = context;
        this.f212253n = strArr;
        e();
    }

    public final java.lang.String[] a(int i17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = this.f212254o;
        if (arrayList2 == null || (arrayList = (java.util.ArrayList) arrayList2.get(i17)) == null) {
            return null;
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public int b() {
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = this.f212256q;
        if (customOptionPickNew != null) {
            return customOptionPickNew.getValue();
        }
        return 0;
    }

    public final java.lang.String[] c(int i17) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = this.f212255p;
        if (arrayList2 == null || (arrayList = (java.util.ArrayList) arrayList2.get(i17)) == null) {
            return null;
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
    }

    public void d() {
        y9.i iVar = this.f212246d;
        if (iVar != null) {
            iVar.dismiss();
        }
    }

    public final void e() {
        android.content.Context context = this.f212248f;
        this.f212246d = new y9.i(context, 0);
        android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.byt, null);
        this.f212247e = inflate;
        this.f212264y = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.kk6);
        this.f212261v = (android.widget.LinearLayout) this.f212247e.findViewById(com.tencent.mm.R.id.f486201kk4);
        this.f212265z = (android.widget.LinearLayout) this.f212247e.findViewById(com.tencent.mm.R.id.qmx);
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = new com.tencent.mm.ui.widget.picker.CustomOptionPickNew(context);
        this.f212256q = customOptionPickNew;
        customOptionPickNew.setOptionsArray(this.f212253n);
        this.f212261v.removeAllViews();
        this.f212261v.setGravity(17);
        this.f212261v.addView(this.f212256q.getView(), new android.widget.LinearLayout.LayoutParams(-2, -1));
        this.f212262w = (android.widget.LinearLayout) this.f212247e.findViewById(com.tencent.mm.R.id.kk7);
        this.f212263x = (android.widget.LinearLayout) this.f212247e.findViewById(com.tencent.mm.R.id.kk_);
        if (this.f212254o != null) {
            this.f212262w.setVisibility(0);
            this.f212257r = new com.tencent.mm.ui.widget.picker.CustomOptionPickNew(context);
            this.f212262w.removeAllViews();
            this.f212262w.setGravity(17);
            this.f212262w.addView(this.f212257r.getView(), new android.widget.LinearLayout.LayoutParams(-2, -1));
            this.f212257r.setOptionsArray(a(this.f212256q.getValue()));
            this.f212256q.setOnValueChangedListener(new com.tencent.mm.ui.widget.picker.p(this));
        } else {
            this.f212262w.setVisibility(8);
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew2 = this.f212256q;
            if (customOptionPickNew2 != null) {
                customOptionPickNew2.setOnValueChangedListener(new com.tencent.mm.ui.widget.picker.q(this));
            }
        }
        if (this.f212255p != null) {
            this.f212263x.setVisibility(0);
            this.f212258s = new com.tencent.mm.ui.widget.picker.CustomOptionPickNew(context);
            this.f212263x.removeAllViews();
            this.f212263x.setGravity(17);
            this.f212263x.addView(this.f212258s.getView(), new android.widget.LinearLayout.LayoutParams(-2, -1));
            this.f212258s.setOptionsArray(c(this.f212257r.getValue()));
            this.f212257r.setOnValueChangedListener(new com.tencent.mm.ui.widget.picker.r(this));
        } else {
            this.f212263x.setVisibility(8);
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew3 = this.f212257r;
            if (customOptionPickNew3 != null) {
                customOptionPickNew3.setOnValueChangedListener(new com.tencent.mm.ui.widget.picker.s(this));
            }
        }
        android.widget.Button button = (android.widget.Button) this.f212247e.findViewById(com.tencent.mm.R.id.khs);
        this.f212251i = button;
        button.setOnClickListener(new com.tencent.mm.ui.widget.picker.t(this));
        android.widget.Button button2 = (android.widget.Button) this.f212247e.findViewById(com.tencent.mm.R.id.b5i);
        this.f212252m = button2;
        button2.setOnClickListener(new com.tencent.mm.ui.widget.picker.u(this));
        ((android.widget.Button) this.f212247e.findViewById(com.tencent.mm.R.id.b1e)).setOnClickListener(new com.tencent.mm.ui.widget.picker.v(this));
        this.f212246d.setContentView(this.f212247e);
        this.f212249g = com.tencent.mm.ui.zk.a(context, com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOn);
        com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A((android.view.View) this.f212247e.getParent());
        this.f212250h = A;
        if (A != null) {
            A.C(this.f212249g);
            this.f212250h.f44443p = false;
        }
        this.f212246d.setOnDismissListener(new com.tencent.mm.ui.widget.picker.w(this));
    }

    public boolean f() {
        return this.f212258s != null;
    }

    public void g(android.view.View view) {
        android.widget.LinearLayout linearLayout = this.f212264y;
        if (linearLayout != null) {
            if (view == null) {
                linearLayout.setVisibility(8);
                return;
            }
            linearLayout.setVisibility(0);
            this.f212264y.removeAllViews();
            this.f212264y.setGravity(17);
            this.f212264y.addView(view, new android.widget.LinearLayout.LayoutParams(-1, -2));
        }
    }

    public void h(int i17) {
        android.widget.Button button = this.f212251i;
        if (button != null) {
            android.content.Context context = this.f212248f;
            button.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f478838io));
            if (i17 == 0) {
                this.f212251i.setBackgroundResource(com.tencent.mm.R.drawable.f481057jk);
                return;
            }
            if (i17 == 1) {
                this.f212251i.setBackgroundResource(com.tencent.mm.R.drawable.f481063jr);
                this.f212251i.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.aax));
            } else {
                if (i17 != 2) {
                    return;
                }
                this.f212251i.setBackgroundResource(com.tencent.mm.R.drawable.f481067jw);
            }
        }
    }

    public void i(int i17) {
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = this.f212256q;
        if (customOptionPickNew != null) {
            customOptionPickNew.setValue(i17);
            this.f212256q.c(i17);
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew2 = this.f212257r;
            if (customOptionPickNew2 == null || this.f212254o == null) {
                return;
            }
            customOptionPickNew2.setOptionsArray(a(i17));
        }
    }

    public void j(int i17, int i18) {
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = this.f212256q;
        if (customOptionPickNew == null || this.f212257r == null) {
            return;
        }
        customOptionPickNew.setValue(i17);
        this.f212256q.c(i17);
        this.f212257r.setOptionsArray(a(i17));
        this.f212257r.setValue(i18);
        this.f212257r.c(i18);
        this.f212257r.invalidate();
    }

    public void k(int i17, int i18, int i19) {
        com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = this.f212256q;
        if (customOptionPickNew == null || this.f212257r == null || this.f212258s == null) {
            return;
        }
        customOptionPickNew.setValue(i17);
        this.f212256q.c(i17);
        this.f212257r.setOptionsArray(a(i17));
        this.f212257r.setValue(i18);
        this.f212257r.c(i18);
        this.f212257r.invalidate();
        this.f212258s.setOptionsArray(c(i18));
        this.f212258s.setValue(i19);
        this.f212258s.c(i19);
        this.f212258s.invalidate();
    }

    public void l() {
        y9.i iVar = this.f212246d;
        if (iVar != null) {
            iVar.show();
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    public c0(android.content.Context context, java.util.ArrayList arrayList) {
        this.f212254o = null;
        this.f212255p = null;
        this.A = false;
        this.f212248f = context;
        if (arrayList != null) {
            this.f212253n = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }
        e();
    }

    public c0(android.content.Context context, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        this.f212254o = null;
        this.f212255p = null;
        this.A = false;
        this.f212248f = context;
        if (arrayList != null) {
            this.f212253n = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }
        this.f212254o = arrayList2;
        e();
    }

    public c0(android.content.Context context, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3) {
        this.f212254o = null;
        this.f212255p = null;
        this.A = false;
        this.f212248f = context;
        if (arrayList != null) {
            this.f212253n = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }
        this.f212254o = arrayList2;
        this.f212255p = arrayList3;
        e();
    }

    public c0(android.content.Context context, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, boolean z17) {
        this.f212254o = null;
        this.f212255p = null;
        this.A = false;
        this.f212248f = context;
        if (arrayList != null) {
            this.f212253n = (java.lang.String[]) arrayList.toArray(new java.lang.String[arrayList.size()]);
        }
        this.f212254o = arrayList2;
        this.f212255p = arrayList3;
        this.A = z17;
        e();
    }
}
