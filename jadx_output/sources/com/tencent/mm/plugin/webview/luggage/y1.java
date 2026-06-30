package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public abstract class y1 extends android.widget.FrameLayout {
    public boolean A;
    public java.lang.Integer B;
    public boolean C;
    public final android.view.View.OnClickListener D;

    /* renamed from: d, reason: collision with root package name */
    public final vj5.h f182692d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.luggage.e0 f182693e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f182694f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.RelativeLayout f182695g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f182696h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f182697i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f182698m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f182699n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.LinearLayout f182700o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.ImageView f182701p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f182702q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.menu.y f182703r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.d4 f182704s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f182705t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f182706u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f182707v;

    /* renamed from: w, reason: collision with root package name */
    public int f182708w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f182709x;

    /* renamed from: y, reason: collision with root package name */
    public int f182710y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f182711z;

    public y1(com.tencent.mm.plugin.webview.luggage.e0 e0Var) {
        super(e0Var.f406610d);
        this.f182705t = null;
        this.f182707v = false;
        this.f182710y = -1;
        this.A = false;
        this.D = new com.tencent.mm.plugin.webview.luggage.a2(this);
        setId(com.tencent.mm.R.id.j7i);
        android.content.Context context = e0Var.f406610d;
        this.f182694f = context;
        this.f182693e = e0Var;
        setBackgroundColor(0);
        com.tencent.mm.plugin.webview.luggage.s sVar = new com.tencent.mm.plugin.webview.luggage.s(context);
        this.f182692d = sVar;
        addView(sVar, -1, -1);
        this.f182708w = b3.l.getColor(context, com.tencent.mm.R.color.aay);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.d9q, (android.view.ViewGroup) this, false);
        this.f182711z = inflate;
        setActionBarViewColor(this.f182708w);
        sVar.addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, getActionBarHeight()));
        this.f182695g = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.f482438el);
        this.f182696h = inflate.findViewById(com.tencent.mm.R.id.jbs);
        this.f182697i = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.d0v);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f482510gi);
        this.f182698m = imageView;
        imageView.setOnClickListener(new com.tencent.mm.plugin.webview.luggage.b2(this));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
        this.f182699n = textView;
        com.tencent.mm.ui.f.b(textView, com.tencent.mm.R.dimen.f479575r);
        this.f182700o = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f482538h4);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f482537h3);
        this.f182701p = imageView2;
        imageView2.setOnClickListener(new com.tencent.mm.plugin.webview.luggage.c2(this));
        imageView2.setClickable(false);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482539h5);
        this.f182702q = textView2;
        textView2.setOnClickListener(new com.tencent.mm.plugin.webview.luggage.d2(this));
        textView2.setClickable(false);
    }

    private int getActionBarHeight() {
        return com.tencent.mm.ui.bl.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    private void setActionBarColor(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebViewActionBar", "setActionBarColor, color : %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            i17 = getResources().getColor(com.tencent.mm.R.color.aaw);
        }
        boolean g17 = com.tencent.mm.ui.uk.g(i17);
        int i18 = this.f182710y;
        if (i18 == 0) {
            g17 = true;
        } else if (i18 == 1) {
            g17 = false;
        }
        vj5.a.a(this.f182692d, i17, !g17);
        this.B = java.lang.Integer.valueOf(i17);
        this.C = g17;
        setActionBarViewColor(i17);
        e(g17);
    }

    private void setActionBarViewColor(int i17) {
        android.view.View view = this.f182711z;
        if (view != null) {
            view.setBackgroundColor(i17);
            if (((i17 >> 24) & 255) / 255.0f > 0.0f) {
                view.setClickable(true);
            } else {
                view.setClickable(false);
            }
        }
    }

    private void setImmersiveStyle(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebViewActionBar", "setImmersiveStyle");
        int i17 = this.f182710y;
        if (i17 == 0) {
            z17 = true;
        } else if (i17 == 1) {
            z17 = false;
        }
        vj5.a.a(this.f182692d, 0, !z17);
        this.B = 0;
        this.C = z17;
        setActionBarViewColor(0);
        this.f182699n.setVisibility(8);
        this.f182697i.setVisibility(8);
        this.f182698m.setImageAlpha(255);
        this.f182701p.setImageAlpha(255);
        e(z17);
    }

    public final void a(boolean z17) {
        android.widget.ImageView imageView = this.f182701p;
        if (imageView != null) {
            if (z17) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
            }
        }
    }

    public void b() {
        this.A = true;
        android.widget.ImageView imageView = this.f182697i;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        android.view.View view = this.f182696h;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar", "fakeNativeClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/webview/luggage/LuggageWebActionBar", "fakeNativeClose", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public abstract void c();

    public abstract void d();

    public abstract void e(boolean z17);

    public void f(int i17, boolean z17, boolean z18) {
        java.lang.Integer num;
        this.f182708w = i17;
        this.f182709x = z18;
        if (z17 && ((num = this.B) == null || num.intValue() == 0)) {
            setImmersiveStyle(z18);
        } else {
            setActionBarColor(i17);
        }
    }

    public void g() {
        setImmersiveStyle(this.f182709x);
    }

    public com.tencent.mm.plugin.webview.luggage.menu.y getMenuHelp() {
        if (this.f182703r == null) {
            this.f182703r = new com.tencent.mm.plugin.webview.luggage.menu.y();
        }
        return this.f182703r;
    }

    public java.lang.String getTitle() {
        return this.f182706u;
    }

    public int getTopBarHeight() {
        return this.f182692d.getHeight();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h() {
        /*
            r13 = this;
            com.tencent.mm.plugin.webview.luggage.d4 r0 = r13.f182704s
            r1 = 0
            if (r0 == 0) goto Le8
            java.lang.String r2 = "zh_CN"
            boolean r3 = r0.f182168a
            r4 = 1
            if (r3 == 0) goto L44
            java.lang.String r3 = r0.f182175h
            boolean r5 = r2.equals(r3)
            if (r5 == 0) goto L18
            java.lang.String r5 = r0.f182169b
            goto L1a
        L18:
            java.lang.String r5 = r0.f182170c
        L1a:
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r5)
            if (r5 != 0) goto L44
            boolean r5 = r2.equals(r3)
            if (r5 == 0) goto L29
            java.lang.String r5 = r0.f182171d
            goto L2b
        L29:
            java.lang.String r5 = r0.f182172e
        L2b:
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.K0(r5)
            if (r5 != 0) goto L44
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L3a
            java.lang.String r0 = r0.f182173f
            goto L3c
        L3a:
            java.lang.String r0 = r0.f182174g
        L3c:
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r0 != 0) goto L44
            r0 = r4
            goto L45
        L44:
            r0 = r1
        L45:
            if (r0 == 0) goto Le8
            com.tencent.mm.plugin.webview.luggage.d4 r0 = r13.f182704s
            java.lang.String r3 = r0.f182175h
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L54
            java.lang.String r0 = r0.f182169b
            goto L56
        L54:
            java.lang.String r0 = r0.f182170c
        L56:
            com.tencent.mm.plugin.webview.luggage.d4 r3 = r13.f182704s
            java.lang.String r5 = r3.f182175h
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L63
            java.lang.String r3 = r3.f182171d
            goto L65
        L63:
            java.lang.String r3 = r3.f182172e
        L65:
            r9 = r3
            com.tencent.mm.plugin.webview.luggage.d4 r3 = r13.f182704s
            java.lang.String r5 = r3.f182175h
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L73
            java.lang.String r2 = r3.f182173f
            goto L75
        L73:
            java.lang.String r2 = r3.f182174g
        L75:
            r10 = r2
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r9, r10}
            java.lang.String r3 = "MicroMsg.GameWebViewActionBar"
            java.lang.String r5 = "use js api close window confirm info : %s, %s, %s"
            com.tencent.mars.xlog.Log.i(r3, r5, r2)
            android.content.Context r2 = r13.getContext()
            r3 = 2131498192(0x7f0c14d0, float:1.8619998E38)
            r5 = 0
            android.view.View r8 = android.view.View.inflate(r2, r3, r5)
            r2 = 2131314490(0x7f09473a, float:1.8247406E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.CheckBox r2 = (android.widget.CheckBox) r2
            r2.setChecked(r1)
            r1 = 8
            r2.setVisibility(r1)
            r2 = 2131314492(0x7f09473c, float:1.824741E38)
            android.view.View r2 = r8.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.setText(r0)
            android.content.res.Resources r0 = r13.getResources()
            r3 = 2131101993(0x7f060929, float:1.7816411E38)
            int r0 = r0.getColor(r3)
            r2.setTextColor(r0)
            r0 = 2131314491(0x7f09473b, float:1.8247409E38)
            android.view.View r0 = r8.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            android.content.res.Resources r2 = r13.getResources()
            int r2 = r2.getColor(r3)
            r0.setTextColor(r2)
            r0.setVisibility(r1)
            android.content.Context r5 = r13.getContext()
            r6 = 1
            java.lang.String r7 = ""
            com.tencent.mm.plugin.webview.luggage.e2 r11 = new com.tencent.mm.plugin.webview.luggage.e2
            r11.<init>(r13)
            com.tencent.mm.plugin.webview.luggage.f2 r12 = new com.tencent.mm.plugin.webview.luggage.f2
            r12.<init>(r13)
            com.tencent.mm.ui.widget.dialog.j0 r0 = db5.e1.I(r5, r6, r7, r8, r9, r10, r11, r12)
            r13.f182705t = r0
            return r4
        Le8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.webview.luggage.y1.h():boolean");
    }

    public abstract void i();

    public void setActionBarColorValue(int i17) {
        this.f182708w = i17;
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        if (f17 == 0.0f) {
            g();
            return;
        }
        int i17 = (int) (255.0f * f17);
        android.widget.TextView textView = this.f182699n;
        textView.setVisibility(0);
        boolean z17 = this.A;
        android.widget.ImageView imageView = this.f182697i;
        if (z17) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        int i18 = this.f182708w;
        int i19 = ((i18 >> 16) & 255) << 16;
        setActionBarColor((i18 & 255) | i19 | (i17 << 24) | (((i18 >> 8) & 255) << 8));
        textView.setAlpha(f17);
        imageView.setImageAlpha(i17);
        this.f182698m.setImageAlpha(i17);
        this.f182701p.setImageAlpha(i17);
    }

    public void setBackBtn(int i17) {
        this.f182698m.setImageResource(i17);
    }

    public void setCloseWindowConfirmInfo(android.os.Bundle bundle) {
        this.f182704s = bundle == null ? null : new com.tencent.mm.plugin.webview.luggage.d4(bundle);
    }

    public void setIconDark(int i17) {
        this.f182710y = i17;
    }

    public void setNavigationBarButtons(android.os.Bundle bundle) {
        android.graphics.Bitmap a17;
        if (bundle == null) {
            return;
        }
        java.lang.String string = bundle.getString("set_navigation_bar_buttons_left_text_color");
        boolean z17 = bundle.getBoolean("set_navigation_bar_buttons_hide_right_button", false);
        java.lang.String string2 = bundle.getString("set_navigation_bar_buttons_text");
        java.lang.String string3 = bundle.getString("set_navigation_bar_buttons_icon_data");
        java.lang.String string4 = bundle.getString("set_navigation_bar_buttons_text_color");
        boolean z18 = bundle.getBoolean("set_navigation_bar_buttons_need_click_event", false);
        com.tencent.mm.plugin.webview.ui.tools.a1.c(string, -16777216);
        int d17 = (int) com.tencent.mm.plugin.webview.ui.tools.a1.d(string4, -1L);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
            try {
                a17 = com.tencent.mm.plugin.webview.ui.tools.a1.a(string3);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameWebViewActionBar", "setNavigationBarButtons, decode base64 image, exception = %s", e17);
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.luggage.i2(this, z17, a17, string2, d17, z18));
        }
        a17 = null;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.luggage.i2(this, z17, a17, string2, d17, z18));
    }

    public void setOptionEnable(boolean z17) {
        android.widget.TextView textView = this.f182702q;
        android.widget.ImageView imageView = this.f182701p;
        if (z17) {
            imageView.setClickable(true);
            textView.setClickable(true);
        } else {
            imageView.setClickable(false);
            textView.setClickable(false);
        }
    }

    public void setTitleColor(int i17) {
        this.f182699n.setTextColor(i17);
    }

    public void setTitleText(java.lang.String str) {
        this.f182706u = str;
        this.f182699n.setText(str);
    }
}
