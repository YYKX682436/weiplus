package com.tencent.mm.ui.base;

/* loaded from: classes8.dex */
public class TalkRoomPopupNav extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public db5.i9 f197687d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f197688e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f197689f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f197690g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f197691h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f197692i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.LinearLayout f197693m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f197694n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f197695o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f197696p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f197697q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f197698r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f197699s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f197700t;

    /* renamed from: u, reason: collision with root package name */
    public yb5.d f197701u;

    /* renamed from: v, reason: collision with root package name */
    public int f197702v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.animation.Animation f197703w;

    public TalkRoomPopupNav(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b();
    }

    public void a() {
        android.view.View view = this.f197698r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "hideTipsBarBackground", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/TalkRoomPopupNav", "hideTipsBarBackground", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void b() {
        android.view.View.inflate(getContext(), getInitViewLayout(), this);
        this.f197699s = findViewById(com.tencent.mm.R.id.aun);
        this.f197688e = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f486094k54);
        this.f197689f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.f486095k55);
        this.f197690g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.czs);
        this.f197691h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.h9u);
        this.f197692i = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.h9w);
        this.f197693m = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.h9v);
        this.f197694n = findViewById(com.tencent.mm.R.id.f483482b02);
        this.f197695o = (android.widget.Button) findViewById(com.tencent.mm.R.id.b08);
        this.f197700t = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.a4f);
        this.f197696p = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.nxz);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.f487220ny0);
        this.f197697q = weImageView;
        weImageView.setVisibility(8);
        this.f197688e.setOnClickListener(new db5.d9(this));
        android.view.View view = this.f197698r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/TalkRoomPopupNav", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i17 = this.f197688e.getLayoutParams().height;
        int i18 = this.f197690g.getLayoutParams().height;
        ((android.view.WindowManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("window")).getDefaultDisplay().getMetrics(new android.util.DisplayMetrics());
        this.f197702v = (int) java.lang.Math.floor((r0.widthPixels - com.tencent.mm.ui.zk.a(getContext(), 56)) / com.tencent.mm.ui.zk.a(getContext(), 48));
    }

    public void c(int i17, int i18) {
        if (i17 < 0) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f197697q;
            if (weImageView != null) {
                weImageView.setVisibility(8);
                return;
            }
            return;
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f197697q;
        if (weImageView2 != null) {
            weImageView2.setImageResource(i17);
            this.f197697q.setIconColor(i18);
            this.f197697q.setVisibility(0);
        }
    }

    public void d(java.util.List list) {
        boolean z17;
        android.widget.LinearLayout linearLayout = this.f197691h;
        boolean z18 = true;
        int i17 = 0;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            z17 = false;
        } else {
            this.f197691h.removeAllViews();
            z17 = true;
        }
        android.widget.LinearLayout linearLayout2 = this.f197692i;
        if (linearLayout2 != null && linearLayout2.getVisibility() == 0) {
            this.f197692i.removeAllViews();
            z17 = true;
        }
        android.widget.LinearLayout linearLayout3 = this.f197693m;
        if (linearLayout3 == null || linearLayout3.getVisibility() != 0) {
            z18 = z17;
        } else {
            this.f197693m.removeAllViews();
        }
        if (z18) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                android.widget.ImageView imageView = new android.widget.ImageView(getContext());
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40));
                layoutParams.rightMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
                imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                imageView.setLayoutParams(layoutParams);
                int i18 = this.f197702v;
                if (i17 < i18) {
                    this.f197691h.addView(imageView);
                } else if (i17 >= i18 && i17 < i18 * 2) {
                    this.f197692i.addView(imageView);
                } else if (i17 >= i18 * 2 && i17 < i18 * 3) {
                    this.f197693m.addView(imageView);
                }
                ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str, null);
                i17++;
            }
        }
    }

    public final void e(boolean z17) {
        android.view.View view = this.f197698r;
        if (view != null) {
            if (!z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f197699s;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.widget.LinearLayout linearLayout = this.f197688e;
                if (linearLayout != null) {
                    linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.b7a);
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f197700t;
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                    return;
                }
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = this.f197699s;
            if (view3 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/ui/base/TalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.LinearLayout linearLayout2 = this.f197688e;
            if (linearLayout2 != null) {
                linearLayout2.setBackgroundColor(0);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f197700t;
            if (weImageView2 != null) {
                weImageView2.setVisibility(4);
            }
            yb5.d dVar = this.f197701u;
            if (dVar != null) {
                dVar.y();
            }
        }
    }

    public void f(long j17) {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477854dc);
        loadAnimation.setDuration(j17);
        this.f197690g.startAnimation(loadAnimation);
    }

    public void g(long j17) {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477858dg);
        this.f197703w = loadAnimation;
        loadAnimation.setDuration(j17);
        this.f197703w.setAnimationListener(new db5.h9(this));
        this.f197690g.startAnimation(this.f197703w);
    }

    public com.tencent.mm.ui.widget.imageview.WeImageView getArrowImg() {
        return this.f197700t;
    }

    public android.widget.Button getBtnEnter() {
        return this.f197695o;
    }

    public int getInitViewLayout() {
        return com.tencent.mm.R.layout.cxq;
    }

    public void h() {
        this.f197689f.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477783bc));
    }

    public void i() {
    }

    public void j(java.lang.String str, java.util.List list, long j17) {
        this.f197695o.setOnClickListener(new db5.e9(this, str));
        this.f197694n.setOnClickListener(new db5.f9(this));
        android.view.View view = this.f197698r;
        if (view != null) {
            view.setOnClickListener(new db5.g9(this));
        }
        int i17 = 0;
        if (this.f197690g.getVisibility() != 0) {
            this.f197690g.setVisibility(0);
            e(true);
            f(j17);
            android.view.View view2 = this.f197698r;
            if (view2 != null) {
                view2.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477783bc));
            }
        }
        this.f197691h.setVisibility(0);
        this.f197691h.removeAllViews();
        if (list != null) {
            if (list.size() > this.f197702v) {
                this.f197692i.setVisibility(0);
                this.f197692i.removeAllViews();
            }
            if (list.size() > this.f197702v * 2) {
                this.f197693m.setVisibility(0);
                this.f197693m.removeAllViews();
            }
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str2 = (java.lang.String) it.next();
            android.widget.ImageView imageView = new android.widget.ImageView(getContext());
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 40));
            layoutParams.rightMargin = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 8);
            imageView.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(layoutParams);
            int i18 = this.f197702v;
            if (i17 < i18) {
                this.f197691h.addView(imageView);
            } else if (i17 >= i18 && i17 < i18 * 2) {
                this.f197692i.addView(imageView);
            } else if (i17 >= i18 * 2 && i17 < i18 * 3) {
                this.f197693m.addView(imageView);
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str2, null);
            i17++;
        }
    }

    public void k(long j17) {
        e(false);
        if (this.f197690g.getVisibility() == 0) {
            g(j17);
        } else {
            h();
        }
        this.f197688e.setClickable(true);
    }

    public void setBgViewResource(int i17) {
        android.widget.LinearLayout linearLayout = this.f197688e;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(i17);
        }
    }

    public void setChattingContext(yb5.d dVar) {
        this.f197701u = dVar;
    }

    public void setDialogContent(java.lang.String str) {
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.omc)).setText(str);
    }

    public void setNavContent(java.lang.String str) {
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.oob)).setText(str);
    }

    public void setOnClickListener(db5.i9 i9Var) {
        this.f197687d = i9Var;
    }

    public void setRootTipsBarBackground(android.view.View view) {
        this.f197698r = view;
    }

    public TalkRoomPopupNav(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }
}
