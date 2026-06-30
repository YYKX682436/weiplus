package com.tencent.mm.plugin.multitalk.ui.widget;

/* loaded from: classes14.dex */
public class CollapseView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.content.Context f150308d;

    /* renamed from: e, reason: collision with root package name */
    public final long f150309e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f150310f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.RelativeLayout f150311g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.RelativeLayout f150312h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.RelativeLayout f150313i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f150314m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f150315n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f150316o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f150317p;

    /* renamed from: q, reason: collision with root package name */
    public final float f150318q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f150319r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.ImageButton f150320s;

    /* renamed from: t, reason: collision with root package name */
    public float f150321t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f150322u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f150323v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f150324w;

    /* renamed from: x, reason: collision with root package name */
    public float f150325x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f150326y;

    public CollapseView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f150309e = 200L;
        this.f150318q = 0.7f;
        this.f150322u = false;
        this.f150323v = false;
        this.f150324w = false;
        this.f150325x = 0.0f;
        this.f150326y = true;
        this.f150308d = context;
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c39, this);
        this.f150314m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487622p80);
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.i2s);
        this.f150315n = imageView;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.raw.icons_filled_arrow, -1));
        this.f150313i = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.cgn);
        this.f150312h = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.gwx);
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.jqn);
        this.f150310f = imageView2;
        imageView2.setBackground(com.tencent.mm.ui.uk.e(context, com.tencent.mm.R.raw.icons_filled_arrow, -1));
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.jqx);
        this.f150311g = relativeLayout;
        int i17 = sj3.i1.f408566k;
        android.view.View view = (android.view.View) relativeLayout.getParent();
        view.post(new sj3.l(relativeLayout, i17, view));
        this.f150311g.setOnClickListener(new sj3.k(this));
        this.f150310f.setRotation(270.0f);
        this.f150313i.setVisibility(4);
    }

    public final void a(android.view.View view) {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(com.tencent.mm.ui.bk.h(this.f150308d).x, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        int measuredHeight = view.getMeasuredHeight();
        android.view.View view2 = this.f150316o;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "collapse", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "collapse", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        sj3.r rVar = new sj3.r(this, view, measuredHeight);
        rVar.setDuration(this.f150309e);
        view.startAnimation(rVar);
    }

    public void b(android.view.View view) {
        int i17 = sj3.i1.f408570o;
        int i18 = sj3.i1.f408566k + ((int) ((i17 - r1) * this.f150325x));
        view.getLayoutParams().height = i18;
        view.getLayoutParams().width = i18;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
        int i19 = sj3.i1.f408562g;
        layoutParams.bottomMargin = ((int) ((sj3.i1.f408563h - i19) * this.f150325x)) + i19;
        ((android.widget.RelativeLayout.LayoutParams) view.getLayoutParams()).topMargin = (int) (i19 * (1.0f - this.f150325x));
        view.requestLayout();
        this.f150320s.setTag(java.lang.Boolean.valueOf(i18 != i17));
    }

    public final void c(android.view.View view, float f17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f150316o;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(com.tencent.mm.ui.bk.h(this.f150308d).x, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        float f18 = view.getLayoutParams().height + f17;
        float measuredHeight = view.getMeasuredHeight();
        if (f18 >= measuredHeight) {
            f18 = measuredHeight;
        } else if (f18 <= 0.0f) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f18 = 0.0f;
        }
        float f19 = f18 / measuredHeight;
        this.f150325x = f19;
        float f27 = this.f150318q;
        if (f19 >= f27) {
            android.view.View view3 = this.f150316o;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f150316o;
            float f28 = this.f150325x;
            float f29 = (((double) (f28 - f27)) + 0.1d) * 2.5d >= 1.0d ? 1.0f : 2.5f * ((f28 - f27) + 0.1f);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Float.valueOf(f29));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view4.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expandManual", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        ((android.widget.LinearLayout.LayoutParams) view.getLayoutParams()).topMargin = (int) (this.f150325x * sj3.i1.f408565j);
        ((android.widget.LinearLayout.LayoutParams) view.getLayoutParams()).bottomMargin = (int) (this.f150325x * sj3.i1.f408560e);
        view.getLayoutParams().height = (int) f18;
        view.requestLayout();
    }

    public void d(android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.f150322u) {
                return;
            }
            this.f150321t = motionEvent.getRawY();
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            float rawY = motionEvent.getRawY() - this.f150321t;
            if (this.f150322u || java.lang.Math.abs(rawY) >= 5.0f) {
                this.f150321t = motionEvent.getRawY();
                if (java.lang.Math.abs(rawY) > 1.0f) {
                    c(this.f150313i, -rawY);
                    b(this.f150320s);
                    h();
                    if (rawY > 0.0f) {
                        this.f150322u = true;
                        this.f150324w = true;
                        this.f150323v = false;
                        return;
                    } else {
                        if (rawY < 0.0f) {
                            this.f150322u = true;
                            this.f150323v = true;
                            this.f150324w = false;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        float f17 = this.f150325x;
        float f18 = this.f150318q;
        if (f17 > f18 && f17 < 1.0f) {
            this.f150323v = true;
            this.f150324w = false;
        } else if (f17 < 1.0f - f18 && f17 > 0.0f) {
            this.f150323v = false;
            this.f150324w = true;
        } else if (f17 != 0.0f && f17 != 1.0f) {
            this.f150323v = !this.f150323v;
            this.f150324w = !this.f150324w;
        }
        if (this.f150323v && this.f150322u) {
            this.f150323v = false;
            c(this.f150313i, 9999.0f);
            b(this.f150320s);
            h();
        } else if (this.f150324w && this.f150322u) {
            this.f150324w = false;
            c(this.f150313i, -9999.0f);
            b(this.f150320s);
            h();
        }
        this.f150322u = false;
    }

    public void e() {
        if (this.f150320s.getTag() == null || this.f150320s.getTag().equals(java.lang.Boolean.TRUE)) {
            f();
        }
        if (this.f150310f.getTag() == null || this.f150310f.getTag().equals(java.lang.Boolean.TRUE)) {
            g();
        }
    }

    public final void f() {
        android.widget.ImageButton imageButton = this.f150320s;
        if (imageButton != null) {
            java.lang.Object tag = imageButton.getTag();
            long j17 = this.f150309e;
            if (tag != null) {
                java.lang.Object tag2 = this.f150320s.getTag();
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (!tag2.equals(bool)) {
                    this.f150320s.setTag(bool);
                    android.widget.ImageButton imageButton2 = this.f150320s;
                    sj3.p pVar = new sj3.p(this, imageButton2, sj3.i1.f408570o - sj3.i1.f408566k);
                    pVar.setDuration(j17);
                    imageButton2.startAnimation(pVar);
                    return;
                }
            }
            this.f150320s.setTag(java.lang.Boolean.FALSE);
            android.widget.ImageButton imageButton3 = this.f150320s;
            int i17 = sj3.i1.f408570o;
            imageButton3.measure(i17, i17);
            sj3.o oVar = new sj3.o(this, imageButton3, i17 - sj3.i1.f408566k);
            oVar.setDuration(j17);
            imageButton3.startAnimation(oVar);
        }
    }

    public void g() {
        int i17;
        java.lang.Object tag = this.f150310f.getTag();
        long j17 = this.f150309e;
        if (tag != null) {
            java.lang.Object tag2 = this.f150310f.getTag();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (!tag2.equals(bool)) {
                this.f150310f.setTag(bool);
                a(this.f150313i);
                java.lang.String str = this.f150319r;
                if (str != null) {
                    com.tencent.mm.plugin.multitalk.model.u0.g(2, str, 2);
                }
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(220L, 31L, 1L, false);
                i17 = 270;
                this.f150310f.animate().setDuration(j17).rotation(i17);
            }
        }
        this.f150310f.setTag(java.lang.Boolean.FALSE);
        android.widget.RelativeLayout relativeLayout = this.f150313i;
        relativeLayout.measure(android.view.View.MeasureSpec.makeMeasureSpec(com.tencent.mm.ui.bk.h(this.f150308d).x, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(1073741823, Integer.MIN_VALUE));
        int measuredHeight = relativeLayout.getMeasuredHeight();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(relativeLayout, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        relativeLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(relativeLayout, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view = this.f150316o;
        if (view != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/CollapseView", "expand", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        sj3.q qVar = new sj3.q(this, relativeLayout, measuredHeight);
        qVar.setDuration(j17);
        relativeLayout.startAnimation(qVar);
        java.lang.String str2 = this.f150319r;
        if (str2 != null) {
            com.tencent.mm.plugin.multitalk.model.u0.g(2, str2, 1);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(220L, 30L, 1L, false);
        i17 = 90;
        this.f150310f.animate().setDuration(j17).rotation(i17);
    }

    public void h() {
        this.f150310f.setRotation((int) (270 + (this.f150325x * 180.0f)));
        this.f150310f.setTag(java.lang.Boolean.valueOf(this.f150325x == 0.0f));
        this.f150310f.requestLayout();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        d(motionEvent);
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        motionEvent.getAction();
        d(motionEvent);
        return true;
    }

    public void setLinkToAutoMobileListener(sj3.t tVar) {
        if (findViewById(com.tencent.mm.R.id.k6o) != null) {
            findViewById(com.tencent.mm.R.id.k6o).setOnClickListener(new sj3.s(this, tVar));
        }
    }

    public void setRoomKey(java.lang.String str) {
        this.f150319r = str;
    }
}
