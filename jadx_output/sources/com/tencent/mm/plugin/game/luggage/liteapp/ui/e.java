package com.tencent.mm.plugin.game.luggage.liteapp.ui;

/* loaded from: classes8.dex */
public abstract class e extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final vj5.h f139819d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.RelativeLayout f139820e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f139821f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f139822g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f139823h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f139824i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.LinearLayout f139825m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f139826n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f139827o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.luggage.menu.y f139828p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f139829q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f139830r;

    /* renamed from: s, reason: collision with root package name */
    public int f139831s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f139832t;

    /* renamed from: u, reason: collision with root package name */
    public int f139833u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f139834v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Integer f139835w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View.OnClickListener f139836x;

    public e(android.content.Context context) {
        super(context);
        this.f139830r = false;
        this.f139833u = -1;
        this.f139836x = new com.tencent.mm.plugin.game.luggage.liteapp.ui.l(this);
        setId(com.tencent.mm.R.id.j7i);
        setBackgroundColor(0);
        com.tencent.mm.plugin.webview.luggage.s sVar = new com.tencent.mm.plugin.webview.luggage.s(context);
        this.f139819d = sVar;
        addView(sVar, -1, -1);
        this.f139831s = b3.l.getColor(context, com.tencent.mm.R.color.aay);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.d9q, (android.view.ViewGroup) this, false);
        this.f139834v = inflate;
        setActionBarViewColor(this.f139831s);
        sVar.addView(inflate, new android.widget.FrameLayout.LayoutParams(-1, getActionBarHeight()));
        this.f139820e = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.f482438el);
        this.f139821f = inflate.findViewById(com.tencent.mm.R.id.jbs);
        this.f139822g = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.d0v);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f482510gi);
        this.f139823h = imageView;
        imageView.setOnClickListener(new com.tencent.mm.plugin.game.luggage.liteapp.ui.f(this));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.obc);
        this.f139824i = textView;
        com.tencent.mm.ui.f.b(textView, com.tencent.mm.R.dimen.f479575r);
        this.f139825m = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f482538h4);
        android.widget.ImageView imageView2 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f482537h3);
        this.f139826n = imageView2;
        imageView2.setOnClickListener(new com.tencent.mm.plugin.game.luggage.liteapp.ui.g(this));
        imageView2.setClickable(false);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f482539h5);
        this.f139827o = textView2;
        textView2.setOnClickListener(new com.tencent.mm.plugin.game.luggage.liteapp.ui.h(this));
        textView2.setClickable(false);
    }

    private int getActionBarHeight() {
        return com.tencent.mm.ui.bl.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    private void setActionBarColor(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteActionBar", "setActionBarColor, color : %d", java.lang.Integer.valueOf(i17));
        if (i17 == 0) {
            i17 = getResources().getColor(com.tencent.mm.R.color.aaw);
        }
        boolean g17 = com.tencent.mm.ui.uk.g(i17);
        int i18 = this.f139833u;
        if (i18 == 0) {
            g17 = true;
        } else if (i18 == 1) {
            g17 = false;
        }
        vj5.a.a(this.f139819d, i17, !g17);
        this.f139835w = java.lang.Integer.valueOf(i17);
        setActionBarViewColor(i17);
        a(g17);
    }

    public abstract void a(boolean z17);

    public void b(int i17, boolean z17, boolean z18) {
        java.lang.Integer num;
        this.f139831s = i17;
        this.f139832t = z18;
        if (z17 && ((num = this.f139835w) == null || num.intValue() == 0)) {
            setImmersiveStyle(z18);
        } else {
            setActionBarColor(i17);
        }
    }

    public com.tencent.mm.plugin.webview.luggage.menu.y getMenuHelp() {
        if (this.f139828p == null) {
            this.f139828p = new com.tencent.mm.plugin.webview.luggage.menu.y();
        }
        return this.f139828p;
    }

    public java.lang.String getTitle() {
        return this.f139829q;
    }

    public int getTopBarHeight() {
        return this.f139819d.getHeight();
    }

    public void setActionBarColorValue(int i17) {
        this.f139831s = i17;
    }

    public void setActionBarViewColor(int i17) {
        android.view.View view = this.f139834v;
        if (view != null) {
            view.setBackgroundColor(i17);
            if (((i17 >> 24) & 255) / 255.0f > 0.0f) {
                view.setClickable(true);
            } else {
                view.setClickable(false);
            }
        }
    }

    @Override // android.view.View
    public void setAlpha(float f17) {
        if (f17 < 0.0f || f17 > 1.0f) {
            return;
        }
        if (f17 == 0.0f) {
            setImmersiveStyle(this.f139832t);
            return;
        }
        int i17 = (int) (255.0f * f17);
        android.widget.TextView textView = this.f139824i;
        textView.setVisibility(0);
        android.widget.ImageView imageView = this.f139822g;
        imageView.setVisibility(0);
        int i18 = this.f139831s;
        int i19 = ((i18 >> 16) & 255) << 16;
        setActionBarColor((i18 & 255) | i19 | (i17 << 24) | (((i18 >> 8) & 255) << 8));
        textView.setAlpha(f17);
        imageView.setImageAlpha(i17);
        this.f139823h.setImageAlpha(i17);
        this.f139826n.setImageAlpha(i17);
    }

    public void setBackBtn(int i17) {
        this.f139823h.setImageResource(i17);
    }

    public void setCloseWindowConfirmInfo(android.os.Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.getBoolean("close_window_confirm_dialog_switch");
        bundle.getString("close_window_confirm_dialog_title_cn");
        bundle.getString("close_window_confirm_dialog_title_eng");
        bundle.getString("close_window_confirm_dialog_ok_cn");
        bundle.getString("close_window_confirm_dialog_ok_eng");
        bundle.getString("close_window_confirm_dialog_cancel_cn");
        bundle.getString("close_window_confirm_dialog_cancel_eng");
        com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }

    public void setIconDark(int i17) {
        this.f139833u = i17;
    }

    public void setImmersiveStyle(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteActionBar", "setImmersiveStyle");
        int i17 = this.f139833u;
        if (i17 == 0) {
            z17 = true;
        } else if (i17 == 1) {
            z17 = false;
        }
        vj5.a.a(this.f139819d, 0, !z17);
        this.f139835w = 0;
        setActionBarViewColor(0);
        this.f139824i.setVisibility(8);
        this.f139822g.setVisibility(8);
        this.f139823h.setImageAlpha(255);
        this.f139826n.setImageAlpha(255);
        a(z17);
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
                com.tencent.mars.xlog.Log.e("MicroMsg.LiteActionBar", "setNavigationBarButtons, decode base64 image, exception = %s", e17);
            }
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.luggage.liteapp.ui.k(this, z17, a17, string2, d17, z18));
        }
        a17 = null;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.game.luggage.liteapp.ui.k(this, z17, a17, string2, d17, z18));
    }

    public void setOptionEnable(boolean z17) {
        android.widget.TextView textView = this.f139827o;
        android.widget.ImageView imageView = this.f139826n;
        if (z17) {
            imageView.setClickable(true);
            textView.setClickable(true);
        } else {
            imageView.setClickable(false);
            textView.setClickable(false);
        }
    }

    public void setTitleColor(int i17) {
        this.f139824i.setTextColor(i17);
    }

    public void setTitleText(java.lang.String str) {
        this.f139829q = str;
        android.widget.TextView textView = this.f139824i;
        textView.setText(str);
        textView.setVisibility(0);
    }
}
