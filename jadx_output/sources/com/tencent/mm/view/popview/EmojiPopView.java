package com.tencent.mm.view.popview;

/* loaded from: classes12.dex */
public class EmojiPopView extends com.tencent.mm.view.popview.AbstractPopView implements com.tencent.mm.modelbase.u0 {
    public final java.lang.Runnable A;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.emoji.view.EmojiStatusView f213673f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ProgressBar f213674g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f213675h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f213676i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f213677m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f213678n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f213679o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f213680p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f213681q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.WindowManager.LayoutParams f213682r;

    /* renamed from: s, reason: collision with root package name */
    public int f213683s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f213684t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.storage.emotion.EmojiInfo f213685u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f213686v;

    /* renamed from: w, reason: collision with root package name */
    public z12.g f213687w;

    /* renamed from: x, reason: collision with root package name */
    public int f213688x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f213689y;

    /* renamed from: z, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f213690z;

    public EmojiPopView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void e(com.tencent.mm.view.popview.EmojiPopView emojiPopView) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPopView", "top: %s, %s, %s", emojiPopView.f213684t, java.lang.Integer.valueOf(emojiPopView.f213683s), java.lang.Boolean.valueOf(emojiPopView.f213689y));
        if (emojiPopView.f213689y) {
            return;
        }
        int i17 = emojiPopView.f213683s;
        if (i17 == 0 || i17 == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPopView", "showLoading");
            emojiPopView.f213689y = true;
            emojiPopView.postDelayed(emojiPopView.A, 100L);
            emojiPopView.f213687w = new z12.g(emojiPopView.f213683s, 3, java.util.Collections.singletonList(emojiPopView.f213684t), null);
            gm0.j1.n().f273288b.g(emojiPopView.f213687w);
        }
    }

    @Override // com.tencent.mm.view.popview.AbstractPopView
    public void a() {
        f();
        super.a();
    }

    @Override // com.tencent.mm.view.popview.AbstractPopView
    public void d(android.view.View view) {
        c(view.getContext());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.f213682r.x = iArr[0] - ((getMeasuredWidth() - view.getMeasuredWidth()) / 2);
        this.f213682r.y = (iArr[1] - getMeasuredHeight()) - this.f213672e;
        int i17 = getResources().getDisplayMetrics().widthPixels;
        int measuredWidth = iArr[0] + (view.getMeasuredWidth() / 2);
        if (measuredWidth < getWidth() / 2) {
            this.f213682r.x = measuredWidth - i65.a.b(getContext(), 32);
            this.f213675h.setBackgroundResource(com.tencent.mm.R.drawable.emoji_left_popup_bg);
            this.f213678n.setBackgroundResource(com.tencent.mm.R.drawable.emoji_left_popup_left_bg);
            this.f213679o.setBackgroundResource(com.tencent.mm.R.drawable.emoji_left_popup_right_bg);
            this.f213680p.setBackgroundResource(com.tencent.mm.R.drawable.emoji_left_popup_option_all_bg);
            return;
        }
        if ((getWidth() / 2) + measuredWidth <= i17) {
            this.f213675h.setBackgroundResource(com.tencent.mm.R.drawable.emoji_popup_bg);
            this.f213678n.setBackgroundResource(com.tencent.mm.R.drawable.emoji_popup_left_bg);
            this.f213679o.setBackgroundResource(com.tencent.mm.R.drawable.emoji_popup_right_bg);
            this.f213680p.setBackgroundResource(com.tencent.mm.R.drawable.emoji_popup_option_all_bg);
            return;
        }
        this.f213682r.x = (measuredWidth + i65.a.b(getContext(), 32)) - getMeasuredWidth();
        this.f213675h.setBackgroundResource(com.tencent.mm.R.drawable.emoji_right_popup_bg);
        this.f213678n.setBackgroundResource(com.tencent.mm.R.drawable.emoji_right_popup_left_bg);
        this.f213679o.setBackgroundResource(com.tencent.mm.R.drawable.emoji_right_popup_right_bg);
        this.f213680p.setBackgroundResource(com.tencent.mm.R.drawable.emoji_right_popup_option_all_bg);
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPopView", "hideLoading");
        this.f213689y = false;
        removeCallbacks(this.A);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f213690z;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    public final void g() {
        db5.e1.A(getContext(), getContext().getString(com.tencent.mm.R.string.c0c), "", "", getContext().getString(com.tencent.mm.R.string.f490455vj), null, null);
    }

    @Override // com.tencent.mm.view.popview.AbstractPopView
    /* renamed from: getWindowLayoutParams */
    public android.view.WindowManager.LayoutParams getF213696n() {
        return this.f213682r;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            gm0.j1.n().f273288b.q(698, this);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.List singletonList = java.util.Collections.singletonList(this.f213684t);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPopView", "onSceneEnd: %s, %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), this.f213684t, java.lang.Integer.valueOf(this.f213683s));
        z12.g gVar = this.f213687w;
        if (gVar == null || m1Var != gVar) {
            return;
        }
        int i19 = gVar.f469295g;
        if (i19 == 3) {
            if (i17 != 0 || i18 != 0) {
                g();
                f();
                return;
            }
            if (this.f213683s == 0) {
                gr.t.g().n(true);
                gr.t.g().l(true);
            } else {
                gr.t.g().m(true);
            }
            com.tencent.mm.storage.n5.f().c().y2(this.f213683s, singletonList);
            com.tencent.mm.storage.z4.f196391j.g();
            a();
            return;
        }
        if (i19 == 2) {
            if (i17 != 0 || i18 != 0) {
                g();
                f();
                return;
            }
            if (this.f213683s == 0) {
                gr.t.g().n(true);
                gr.t.g().l(true);
            } else {
                gr.t.g().m(true);
            }
            com.tencent.mm.storage.n5.f().c().n1(singletonList, this.f213683s);
            com.tencent.mm.storage.z4 z4Var = com.tencent.mm.storage.z4.f196391j;
            if (z4Var.e() || com.tencent.mm.storage.h5.f195006d.Ai()) {
                z4Var.g();
            }
            gr.v.f274696a.a(true);
            a();
        }
    }

    public void setEmojiInfo(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        if (emojiInfo == null) {
            this.f213673f.setVisibility(4);
            this.f213674g.setVisibility(0);
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPopView", "emoji is null. set null");
        } else {
            if (emojiInfo.getMd5().equals(this.f213684t)) {
                return;
            }
            this.f213684t = emojiInfo.getMd5();
            this.f213685u = emojiInfo;
            this.f213673f.setStatusListener(new gn5.k(this));
            this.f213673f.setEmojiInfo(emojiInfo);
            if (n22.m.f334296b) {
                this.f213681q.setText(emojiInfo.field_meanings);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setPopupType(int r26) {
        /*
            Method dump skipped, instructions count: 1379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.view.popview.EmojiPopView.setPopupType(int):void");
    }

    public EmojiPopView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f213683s = -1;
        this.f213688x = 0;
        this.f213689y = false;
        this.A = new gn5.g(this);
        android.view.View.inflate(context, com.tencent.mm.R.layout.a78, this);
        this.f213675h = findViewById(com.tencent.mm.R.id.dd6);
        this.f213673f = (com.tencent.mm.emoji.view.EmojiStatusView) findViewById(com.tencent.mm.R.id.h88);
        this.f213674g = (android.widget.ProgressBar) findViewById(com.tencent.mm.R.id.lbi);
        this.f213676i = findViewById(com.tencent.mm.R.id.dda);
        this.f213677m = findViewById(com.tencent.mm.R.id.dd8);
        this.f213678n = findViewById(com.tencent.mm.R.id.dd_);
        this.f213679o = findViewById(com.tencent.mm.R.id.dd7);
        this.f213680p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.dd9);
        this.f213681q = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ddb);
        setBackground(null);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(2, 262400, 1);
        this.f213682r = layoutParams;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.gravity = 8388659;
        this.f213678n.setOnClickListener(new gn5.h(this));
        this.f213679o.setOnClickListener(new gn5.i(this));
        this.f213680p.setOnClickListener(new gn5.j(this));
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            gm0.j1.n().f273288b.a(698, this);
        }
    }
}
