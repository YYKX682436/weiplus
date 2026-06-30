package com.tencent.mm.plugin.lite.keyboard;

/* loaded from: classes15.dex */
public class LiteAppPayKeyboardView extends android.widget.RelativeLayout {

    /* renamed from: z, reason: collision with root package name */
    public static final android.view.View.AccessibilityDelegate f143850z = new aa3.q0();

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f143851d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f143852e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f143853f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f143854g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f143855h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f143856i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f143857m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f143858n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f143859o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f143860p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f143861q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f143862r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f143863s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f143864t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.LinearLayout f143865u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.Boolean f143866v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f143867w;

    /* renamed from: x, reason: collision with root package name */
    public int f143868x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.inputmethod.InputConnection f143869y;

    public LiteAppPayKeyboardView(android.content.Context context) {
        super(context);
        this.f143866v = null;
        this.f143867w = true;
        this.f143868x = 2;
        b();
    }

    public final android.content.res.ColorStateList a(int i17) {
        int[][] iArr = {new int[]{android.R.attr.state_pressed}, new int[]{-16842910}, new int[0]};
        int[] iArr2 = new int[3];
        java.lang.Boolean bool = this.f143866v;
        float f17 = 1.0f - (bool != null ? bool.booleanValue() ^ true : com.tencent.mm.ui.bk.C() ? 0.6f : 0.1f);
        iArr2[0] = android.graphics.Color.argb(android.graphics.Color.alpha(i17), java.lang.Math.round(android.graphics.Color.red(i17) * f17), java.lang.Math.round(android.graphics.Color.green(i17) * f17), java.lang.Math.round(f17 * android.graphics.Color.blue(i17)));
        iArr2[1] = android.graphics.Color.argb(java.lang.Math.round(android.graphics.Color.alpha(i17) * 0.6f), android.graphics.Color.red(i17), android.graphics.Color.green(i17), android.graphics.Color.blue(i17));
        iArr2[2] = i17;
        return new android.content.res.ColorStateList(iArr, iArr2);
    }

    public final void b() {
        if (this.f143867w) {
            android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489219bq3, (android.view.ViewGroup) this, true);
        } else {
            android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489220bq4, (android.view.ViewGroup) this, true);
        }
        this.f143865u = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.keyboard_base);
        this.f143860p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_0);
        this.f143851d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_1);
        this.f143852e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_2);
        this.f143853f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_3);
        this.f143854g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_4);
        this.f143855h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_5);
        this.f143856i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_6);
        this.f143857m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_7);
        this.f143858n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_8);
        this.f143859o = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_9);
        this.f143861q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_dot);
        this.f143863s = findViewById(com.tencent.mm.R.id.keyboard_del);
        this.f143862r = (android.widget.TextView) findViewById(com.tencent.mm.R.id.keyboard_action);
        this.f143864t = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.keyboard_del_img);
        if (this.f143862r == null) {
            this.f143862r = new android.widget.TextView(getContext());
        }
        this.f143862r.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
        this.f143862r.setTextSize(1, i65.a.q(getContext()) * 17.0f);
        aa3.r0 r0Var = new aa3.r0(this);
        this.f143865u.setOnClickListener(r0Var);
        this.f143860p.setOnClickListener(r0Var);
        this.f143851d.setOnClickListener(r0Var);
        this.f143852e.setOnClickListener(r0Var);
        this.f143853f.setOnClickListener(r0Var);
        this.f143854g.setOnClickListener(r0Var);
        this.f143855h.setOnClickListener(r0Var);
        this.f143856i.setOnClickListener(r0Var);
        this.f143857m.setOnClickListener(r0Var);
        this.f143858n.setOnClickListener(r0Var);
        this.f143859o.setOnClickListener(r0Var);
        this.f143863s.setOnClickListener(r0Var);
        this.f143861q.setOnClickListener(r0Var);
        this.f143862r.setOnClickListener(r0Var);
        if (j62.e.g().l("clicfg_android_liteapp_pay_keyboard_accessibility_switch", false, true, true)) {
            android.view.View view = this.f143863s;
            android.view.View.AccessibilityDelegate accessibilityDelegate = f143850z;
            view.setAccessibilityDelegate(accessibilityDelegate);
            this.f143862r.setAccessibilityDelegate(accessibilityDelegate);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(nl1.b bVar) {
        if (bVar == 0) {
            return;
        }
        if (bVar == 0) {
            this.f143869y = null;
            return;
        }
        if (bVar instanceof android.view.View) {
            android.view.View view = (android.view.View) bVar;
            com.tencent.mm.plugin.appbrand.widget.input.x4 a17 = com.tencent.mm.plugin.appbrand.widget.input.w4.a(view.getContext());
            if (a17 != null) {
                a17.hideVKB();
            }
            view.requestFocus();
        }
        this.f143869y = bVar.a();
    }

    public void setActionText(java.lang.String str) {
        this.f143862r.setText(str);
    }

    public void setConfirmBgColor(int i17) {
        this.f143862r.getBackground().setTintList(a(i17));
    }

    public void setConfirmColor(int i17) {
        this.f143862r.setTextColor(a(i17));
    }

    public void setForceLight(boolean z17) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        this.f143866v = valueOf;
        if (valueOf.booleanValue() && com.tencent.mm.ui.bk.C()) {
            this.f143851d.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            this.f143851d.setBackgroundResource(com.tencent.mm.R.drawable.aj_);
            this.f143852e.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            this.f143852e.setBackgroundResource(com.tencent.mm.R.drawable.aj_);
            this.f143853f.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            this.f143853f.setBackgroundResource(com.tencent.mm.R.drawable.aj_);
            this.f143854g.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            this.f143854g.setBackgroundResource(com.tencent.mm.R.drawable.aj_);
            this.f143855h.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            this.f143855h.setBackgroundResource(com.tencent.mm.R.drawable.aj_);
            this.f143856i.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            this.f143856i.setBackgroundResource(com.tencent.mm.R.drawable.aj_);
            this.f143857m.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            this.f143857m.setBackgroundResource(com.tencent.mm.R.drawable.aj_);
            this.f143858n.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            this.f143858n.setBackgroundResource(com.tencent.mm.R.drawable.aj_);
            this.f143859o.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            this.f143859o.setBackgroundResource(com.tencent.mm.R.drawable.aj_);
            this.f143861q.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            this.f143861q.setBackgroundResource(com.tencent.mm.R.drawable.aj_);
            this.f143860p.setTextColor(getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_9));
            this.f143860p.setBackgroundResource(com.tencent.mm.R.drawable.aj_);
            this.f143863s.setBackgroundResource(com.tencent.mm.R.drawable.aj_);
            this.f143864t.setEnableColorFilter(false);
            this.f143865u.setBackgroundResource(com.tencent.mm.R.color.UN_BW_97);
        }
    }

    public void setHeightListener(aa3.s0 s0Var) {
    }

    public void setIsOnlySupportInteger(boolean z17) {
        if (z17) {
            this.f143861q.setVisibility(8);
            android.view.ViewGroup.LayoutParams layoutParams = this.f143860p.getLayoutParams();
            if (layoutParams == null || !(layoutParams instanceof androidx.gridlayout.widget.GridLayout.LayoutParams)) {
                return;
            }
            androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams2 = (androidx.gridlayout.widget.GridLayout.LayoutParams) layoutParams;
            layoutParams2.f11552b = androidx.gridlayout.widget.GridLayout.l(0, 3, androidx.gridlayout.widget.GridLayout.f11538w, 1.0f);
            this.f143860p.setLayoutParams(layoutParams2);
            return;
        }
        this.f143861q.setVisibility(0);
        android.view.ViewGroup.LayoutParams layoutParams3 = this.f143860p.getLayoutParams();
        if (layoutParams3 == null || !(layoutParams3 instanceof androidx.gridlayout.widget.GridLayout.LayoutParams)) {
            return;
        }
        androidx.gridlayout.widget.GridLayout.LayoutParams layoutParams4 = (androidx.gridlayout.widget.GridLayout.LayoutParams) layoutParams3;
        layoutParams4.f11552b = androidx.gridlayout.widget.GridLayout.l(0, 2, androidx.gridlayout.widget.GridLayout.f11538w, 1.0f);
        this.f143860p.setLayoutParams(layoutParams4);
    }

    public void setXMode(int i17) {
        this.f143868x = i17;
        if (i17 == 1) {
            this.f143861q.setText("X");
        } else if (i17 == 2) {
            this.f143861q.setText(".");
        }
    }

    public LiteAppPayKeyboardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f143866v = null;
        this.f143867w = true;
        this.f143868x = 2;
        b();
    }

    public LiteAppPayKeyboardView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f143866v = null;
        this.f143867w = true;
        this.f143868x = 2;
        b();
    }
}
