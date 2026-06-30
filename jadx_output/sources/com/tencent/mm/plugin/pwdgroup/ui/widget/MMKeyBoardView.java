package com.tencent.mm.plugin.pwdgroup.ui.widget;

/* loaded from: classes15.dex */
public class MMKeyBoardView extends android.widget.LinearLayout implements android.view.View.OnClickListener, android.view.View.OnLongClickListener {
    public int A;
    public float B;
    public android.content.res.ColorStateList C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f154778J;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f154779d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f154780e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f154781f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f154782g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f154783h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f154784i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f154785m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Button f154786n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f154787o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f154788p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.ImageButton f154789q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f154790r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f154791s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f154792t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f154793u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f154794v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.View f154795w;

    /* renamed from: x, reason: collision with root package name */
    public gs3.d f154796x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f154797y;

    /* renamed from: z, reason: collision with root package name */
    public int f154798z;

    public MMKeyBoardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void a(java.lang.String str) {
        com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI;
        com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView mMPwdInputView;
        gs3.d dVar = this.f154796x;
        if (dVar == null || !this.f154797y || (mMPwdInputView = (facingCreateChatRoomAllInOneUI = ((fs3.p) dVar).f266314a).f154759n) == null) {
            return;
        }
        boolean z17 = facingCreateChatRoomAllInOneUI.f154753e;
        java.lang.StringBuilder sb6 = mMPwdInputView.f154799d;
        if (!z17) {
            if (android.text.TextUtils.isEmpty(str) || mMPwdInputView.f154800e) {
                return;
            }
            sb6.append(str);
            mMPwdInputView.a();
            mMPwdInputView.c();
            return;
        }
        mMPwdInputView.b();
        if (!android.text.TextUtils.isEmpty(str) && !mMPwdInputView.f154800e) {
            sb6.append(str);
            mMPwdInputView.a();
            mMPwdInputView.c();
        }
        facingCreateChatRoomAllInOneUI.Z6(fs3.u.Normal);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        gs3.d dVar;
        com.tencent.mm.plugin.pwdgroup.ui.FacingCreateChatRoomAllInOneUI facingCreateChatRoomAllInOneUI;
        com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView mMPwdInputView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f154797y;
        if (!z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view == this.f154779d) {
            a("0");
        } else if (view == this.f154780e) {
            a("1");
        } else if (view == this.f154781f) {
            a("2");
        } else if (view == this.f154782g) {
            a("3");
        } else if (view == this.f154783h) {
            a("4");
        } else if (view == this.f154784i) {
            a("5");
        } else if (view == this.f154785m) {
            a("6");
        } else if (view == this.f154786n) {
            a("7");
        } else if (view == this.f154787o) {
            a("8");
        } else if (view == this.f154788p) {
            a("9");
        } else if (view == this.f154789q && (dVar = this.f154796x) != null && z17 && (mMPwdInputView = (facingCreateChatRoomAllInOneUI = ((fs3.p) dVar).f266314a).f154759n) != null) {
            if (facingCreateChatRoomAllInOneUI.f154753e) {
                mMPwdInputView.b();
                facingCreateChatRoomAllInOneUI.Z6(fs3.u.Normal);
            } else {
                int i17 = mMPwdInputView.f154801f;
                if (i17 > 0) {
                    mMPwdInputView.f154799d.deleteCharAt(i17 - 1);
                }
                mMPwdInputView.a();
                mMPwdInputView.c();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        this.E = getWidth();
        this.F = getHeight();
        int i28 = this.A;
        int i29 = -i28;
        int i37 = this.I;
        int i38 = (i37 - i28) + 1;
        int i39 = ((i37 * 2) - i28) + 2;
        int i47 = this.f154778J;
        int i48 = i47 + 2;
        int i49 = (i47 * 2) + 3;
        int i57 = (i47 * 3) + 4;
        this.f154780e.layout(i29, 1, this.G + i29, this.H + 1);
        this.f154781f.layout(i38, 1, this.G + i38, this.H + 1);
        this.f154782g.layout(i39, 1, this.G + i39, this.H + 1);
        this.f154783h.layout(i29, i48, this.G + i29, this.H + i48);
        this.f154784i.layout(i38, i48, this.G + i38, this.H + i48);
        this.f154785m.layout(i39, i48, this.G + i39, this.H + i48);
        this.f154786n.layout(i29, i49, this.G + i29, this.H + i49);
        this.f154787o.layout(i38, i49, this.G + i38, this.H + i49);
        this.f154788p.layout(i39, i49, this.G + i39, this.H + i49);
        this.f154779d.layout(i38, i57, this.G + i38, this.H + i57);
        this.f154789q.layout(i39, i57, this.G + i39, this.H + i57);
        android.view.View view = this.f154790r;
        int i58 = this.f154798z;
        view.layout(0, i58 + 1, this.E, i58 + 1 + 1);
        android.view.View view2 = this.f154791s;
        int i59 = this.f154798z;
        view2.layout(0, i48 + i59, this.E, i48 + i59 + 1);
        android.view.View view3 = this.f154792t;
        int i66 = this.f154798z;
        view3.layout(0, i49 + i66, this.E, i49 + i66 + 1);
        android.view.View view4 = this.f154793u;
        int i67 = this.f154798z;
        view4.layout(0, i57 + i67, this.E, i57 + i67 + 1);
        android.view.View view5 = this.f154794v;
        int i68 = this.I;
        view5.layout(i68 + 1, this.f154798z, i68 + 2, this.F);
        android.view.View view6 = this.f154795w;
        int i69 = this.I;
        view6.layout((i69 * 2) + 2, this.f154798z, (i69 * 2) + 3, this.F);
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        gs3.d dVar;
        com.tencent.mm.plugin.pwdgroup.ui.widget.MMPwdInputView mMPwdInputView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        if (view == this.f154789q && (dVar = this.f154796x) != null && this.f154797y && (mMPwdInputView = ((fs3.p) dVar).f266314a.f154759n) != null) {
            mMPwdInputView.b();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/pwdgroup/ui/widget/MMKeyBoardView", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        this.E = getWidth();
        int height = getHeight();
        this.F = height;
        int i19 = this.E;
        if (i19 != 0 && height != 0) {
            int i27 = (i19 - 2) / 3;
            this.I = i27;
            int i28 = this.f154798z;
            int i29 = ((height - i28) - 4) / 4;
            this.f154778J = i29;
            this.G = i27 + (this.A * 2);
            this.H = i29 + (i28 * 2);
        }
        this.f154780e.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f154781f.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f154782g.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f154783h.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f154784i.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f154785m.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f154786n.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f154787o.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f154788p.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f154779d.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f154789q.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.G, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.H, 1073741824));
        this.f154790r.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.E, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        this.f154791s.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.E, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        this.f154792t.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.E, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        this.f154793u.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.E, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1, 1073741824));
        this.f154794v.measure(android.view.View.MeasureSpec.makeMeasureSpec(1, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.F, 1073741824));
        this.f154795w.measure(android.view.View.MeasureSpec.makeMeasureSpec(1, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.F, 1073741824));
    }

    public void setKeyBoardEnable(boolean z17) {
        this.f154797y = z17;
        this.f154779d.setEnabled(z17);
        this.f154780e.setEnabled(z17);
        this.f154781f.setEnabled(z17);
        this.f154782g.setEnabled(z17);
        this.f154783h.setEnabled(z17);
        this.f154784i.setEnabled(z17);
        this.f154785m.setEnabled(z17);
        this.f154786n.setEnabled(z17);
        this.f154787o.setEnabled(z17);
        this.f154788p.setEnabled(z17);
        this.f154789q.setEnabled(z17);
    }

    public void setOnInputDeleteListener(gs3.d dVar) {
        this.f154796x = dVar;
    }

    public MMKeyBoardView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f154797y = true;
        this.f154798z = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3e);
        this.A = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3f);
        this.B = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a3g);
        this.C = getResources().getColorStateList(com.tencent.mm.R.color.f479290v6);
        this.D = getResources().getColor(com.tencent.mm.R.color.f479289v5);
        this.f154779d = new android.widget.Button(context);
        this.f154780e = new android.widget.Button(context);
        this.f154781f = new android.widget.Button(context);
        this.f154782g = new android.widget.Button(context);
        this.f154783h = new android.widget.Button(context);
        this.f154784i = new android.widget.Button(context);
        this.f154785m = new android.widget.Button(context);
        this.f154786n = new android.widget.Button(context);
        this.f154787o = new android.widget.Button(context);
        this.f154788p = new android.widget.Button(context);
        this.f154789q = new android.widget.ImageButton(context);
        this.f154790r = new android.view.View(context);
        this.f154790r = new android.view.View(context);
        this.f154791s = new android.view.View(context);
        this.f154792t = new android.view.View(context);
        this.f154793u = new android.view.View(context);
        this.f154794v = new android.view.View(context);
        this.f154795w = new android.view.View(context);
        this.f154779d.setBackgroundResource(com.tencent.mm.R.drawable.f481902ai3);
        this.f154780e.setBackgroundResource(com.tencent.mm.R.drawable.f481902ai3);
        this.f154781f.setBackgroundResource(com.tencent.mm.R.drawable.f481902ai3);
        this.f154782g.setBackgroundResource(com.tencent.mm.R.drawable.f481902ai3);
        this.f154783h.setBackgroundResource(com.tencent.mm.R.drawable.f481902ai3);
        this.f154784i.setBackgroundResource(com.tencent.mm.R.drawable.f481902ai3);
        this.f154785m.setBackgroundResource(com.tencent.mm.R.drawable.f481902ai3);
        this.f154786n.setBackgroundResource(com.tencent.mm.R.drawable.f481902ai3);
        this.f154787o.setBackgroundResource(com.tencent.mm.R.drawable.f481902ai3);
        this.f154784i.setBackgroundResource(com.tencent.mm.R.drawable.f481902ai3);
        this.f154788p.setBackgroundResource(com.tencent.mm.R.drawable.f481902ai3);
        this.f154789q.setBackgroundResource(com.tencent.mm.R.drawable.f481902ai3);
        this.f154789q.setImageResource(com.tencent.mm.R.drawable.f481903ai4);
        this.f154789q.setContentDescription("删除");
        this.f154779d.setText("0");
        this.f154780e.setText("1");
        this.f154781f.setText("2");
        this.f154782g.setText("3");
        this.f154783h.setText("4");
        this.f154784i.setText("5");
        this.f154785m.setText("6");
        this.f154786n.setText("7");
        this.f154787o.setText("8");
        this.f154788p.setText("9");
        this.f154779d.setGravity(17);
        this.f154780e.setGravity(17);
        this.f154781f.setGravity(17);
        this.f154782g.setGravity(17);
        this.f154783h.setGravity(17);
        this.f154784i.setGravity(17);
        this.f154785m.setGravity(17);
        this.f154786n.setGravity(17);
        this.f154787o.setGravity(17);
        this.f154788p.setGravity(17);
        this.f154779d.setTextSize(0, this.B);
        this.f154780e.setTextSize(0, this.B);
        this.f154781f.setTextSize(0, this.B);
        this.f154782g.setTextSize(0, this.B);
        this.f154783h.setTextSize(0, this.B);
        this.f154784i.setTextSize(0, this.B);
        this.f154785m.setTextSize(0, this.B);
        this.f154786n.setTextSize(0, this.B);
        this.f154787o.setTextSize(0, this.B);
        this.f154788p.setTextSize(0, this.B);
        this.f154779d.setTextColor(this.C);
        this.f154780e.setTextColor(this.C);
        this.f154781f.setTextColor(this.C);
        this.f154782g.setTextColor(this.C);
        this.f154783h.setTextColor(this.C);
        this.f154784i.setTextColor(this.C);
        this.f154785m.setTextColor(this.C);
        this.f154786n.setTextColor(this.C);
        this.f154787o.setTextColor(this.C);
        this.f154788p.setTextColor(this.C);
        this.f154779d.setOnClickListener(this);
        this.f154780e.setOnClickListener(this);
        this.f154781f.setOnClickListener(this);
        this.f154782g.setOnClickListener(this);
        this.f154783h.setOnClickListener(this);
        this.f154784i.setOnClickListener(this);
        this.f154785m.setOnClickListener(this);
        this.f154786n.setOnClickListener(this);
        this.f154787o.setOnClickListener(this);
        this.f154788p.setOnClickListener(this);
        this.f154789q.setOnClickListener(this);
        this.f154789q.setOnLongClickListener(this);
        this.f154790r.setBackgroundColor(this.D);
        this.f154790r.setBackgroundColor(this.D);
        this.f154791s.setBackgroundColor(this.D);
        this.f154792t.setBackgroundColor(this.D);
        this.f154793u.setBackgroundColor(this.D);
        this.f154794v.setBackgroundColor(this.D);
        this.f154795w.setBackgroundColor(this.D);
        addView(this.f154779d);
        addView(this.f154780e);
        addView(this.f154781f);
        addView(this.f154782g);
        addView(this.f154783h);
        addView(this.f154784i);
        addView(this.f154785m);
        addView(this.f154786n);
        addView(this.f154787o);
        addView(this.f154788p);
        addView(this.f154789q);
        addView(this.f154790r);
        addView(this.f154791s);
        addView(this.f154792t);
        addView(this.f154793u);
        addView(this.f154794v);
        addView(this.f154795w);
        post(new gs3.c(this));
    }
}
