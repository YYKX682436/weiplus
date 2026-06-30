package sj3;

/* loaded from: classes14.dex */
public final class j extends androidx.recyclerview.widget.k3 {
    public static final /* synthetic */ int C = 0;
    public final android.widget.RelativeLayout A;
    public boolean B;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView f408577d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f408578e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f408579f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f408580g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f408581h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f408582i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f408583m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f408584n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f408585o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f408586p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f408587q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f408588r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.l f408589s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.FrameLayout f408590t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f408591u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f408592v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f408593w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f408594x;

    /* renamed from: y, reason: collision with root package name */
    public int f408595y;

    /* renamed from: z, reason: collision with root package name */
    public final uj3.g f408596z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.a9u);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f408590t = (android.widget.FrameLayout) findViewById;
        this.f408591u = true;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.nyb);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f408592v = findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.gz8);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f408593w = findViewById3;
        android.view.View findViewById4 = itemView.findViewById(com.tencent.mm.R.id.f485044gc4);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f408594x = findViewById4;
        this.f408595y = -1;
        this.f408577d = (com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView) itemView.findViewById(com.tencent.mm.R.id.nyi);
        this.f408578e = itemView.findViewById(com.tencent.mm.R.id.jcb);
        android.view.View findViewById5 = itemView.findViewById(com.tencent.mm.R.id.p5h);
        kotlin.jvm.internal.o.e(findViewById5, "null cannot be cast to non-null type android.widget.ImageView");
        this.f408579f = (android.widget.ImageView) findViewById5;
        android.view.View findViewById6 = itemView.findViewById(com.tencent.mm.R.id.jxj);
        kotlin.jvm.internal.o.e(findViewById6, "null cannot be cast to non-null type android.widget.ImageView");
        this.f408580g = (android.widget.ImageView) findViewById6;
        android.view.View findViewById7 = itemView.findViewById(com.tencent.mm.R.id.ntr);
        kotlin.jvm.internal.o.e(findViewById7, "null cannot be cast to non-null type android.widget.TextView");
        android.view.View findViewById8 = itemView.findViewById(com.tencent.mm.R.id.im6);
        kotlin.jvm.internal.o.e(findViewById8, "null cannot be cast to non-null type android.widget.ImageView");
        this.f408582i = (android.widget.ImageView) findViewById8;
        android.view.View findViewById9 = itemView.findViewById(com.tencent.mm.R.id.jwr);
        kotlin.jvm.internal.o.e(findViewById9, "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView");
        this.f408581h = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById9;
        android.view.View findViewById10 = itemView.findViewById(com.tencent.mm.R.id.a_m);
        kotlin.jvm.internal.o.e(findViewById10, "null cannot be cast to non-null type android.widget.TextView");
        this.f408583m = (android.widget.TextView) findViewById10;
        this.f408585o = itemView.findViewById(com.tencent.mm.R.id.a_l);
        this.f408584n = itemView.findViewById(com.tencent.mm.R.id.a_9);
        this.A = (android.widget.RelativeLayout) itemView.findViewById(com.tencent.mm.R.id.f486741mb4);
        android.content.Context context = itemView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f408596z = new uj3.g(context);
    }

    public final void i() {
        int i17 = this.f408595y;
        if (i17 == 2 || i17 == 1) {
            j(true);
        }
        this.f408590t.removeAllViews();
        this.f408595y = -1;
    }

    public final void j(boolean z17) {
        if (z17 || this.f408595y != 2) {
            int i17 = this.f408595y;
            if (i17 == 1 || i17 == 2) {
                android.widget.FrameLayout frameLayout = this.f408590t;
                if (frameLayout.getChildCount() != 1) {
                    return;
                }
                android.view.View childAt = frameLayout.getChildAt(0);
                kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
                android.widget.ImageView imageView = (android.widget.ImageView) childAt.findViewById(com.tencent.mm.R.id.f486023jw5);
                if ((imageView != null ? imageView.getBackground() : null) instanceof android.graphics.drawable.AnimationDrawable) {
                    android.graphics.drawable.Drawable background = imageView.getBackground();
                    kotlin.jvm.internal.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                    ((android.graphics.drawable.AnimationDrawable) background).stop();
                }
                frameLayout.removeViewAt(0);
                this.f408595y = -1;
            }
        }
    }

    public final void k() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.view.View view = this.f408584n;
        if (view != null && (animate2 = view.animate()) != null) {
            animate2.cancel();
        }
        if (view != null && (animate = view.animate()) != null && (alpha = animate.alpha(0.0f)) != null && (duration = alpha.setDuration(150L)) != null) {
            duration.setListener(new sj3.e(this));
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f408588r;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f408588r;
        if (b4Var2 != null) {
            b4Var2.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var3 = this.f408588r;
        if (b4Var3 != null) {
            b4Var3.quitSafely();
        }
    }

    public final void l(android.view.View centerView, int i17, int i18, boolean z17) {
        android.graphics.Bitmap m17;
        jz5.f0 f0Var = jz5.f0.f302826a;
        kotlin.jvm.internal.o.g(centerView, "centerView");
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i18, 17);
        android.widget.FrameLayout frameLayout = this.f408590t;
        if (!z17) {
            frameLayout.addView(centerView, layoutParams);
            return;
        }
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(this.itemView.getContext());
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView = this.f408577d;
        boolean z18 = false;
        if (multitalkFrameView != null && (m17 = com.tencent.mm.sdk.platformtools.x.m(frameLayout.getWidth() / 4, frameLayout.getHeight() / 4, android.graphics.Bitmap.Config.ARGB_8888, false)) != null) {
            try {
                new android.graphics.Canvas(m17).drawColor(-16777216);
                sj3.b5 elementPrev = multitalkFrameView.getElementPrev();
                jz5.f0 f0Var2 = null;
                if (!(elementPrev.f408444a != null)) {
                    elementPrev = null;
                }
                if (elementPrev != null) {
                    java.lang.String str = this.f408586p;
                    kotlin.jvm.internal.o.d(str);
                    android.graphics.Bitmap bitmap = elementPrev.f408444a;
                    kotlin.jvm.internal.o.d(bitmap);
                    multitalkFrameView.a(str, bitmap, 0, 0);
                    f0Var2 = f0Var;
                }
                if (f0Var2 != null) {
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(this.itemView.getResources(), com.tencent.mm.sdk.platformtools.x.X(m17, 10));
                    bitmapDrawable.setColorFilter(new android.graphics.ColorMatrixColorFilter(new android.graphics.ColorMatrix(new float[]{0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
                    frameLayout2.setBackground(bitmapDrawable);
                    z18 = true;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AvatarLayoutHolder", e17.getMessage() + ' ' + f0Var);
            }
        }
        if (!z18) {
            frameLayout2.setBackgroundColor(this.itemView.getResources().getColor(com.tencent.mm.R.color.f479453zq));
        }
        frameLayout2.addView(centerView, layoutParams);
        frameLayout.addView(frameLayout2, new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    public final void n(boolean z17, boolean z18) {
        int i17 = this.f408595y;
        if (i17 == 3) {
            return;
        }
        if (z17 && i17 == 2) {
            return;
        }
        if (z17 || i17 == -1) {
            java.lang.Object systemService = this.itemView.getContext().getSystemService("layout_inflater");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            android.view.View inflate = ((android.view.LayoutInflater) systemService).inflate(com.tencent.mm.R.layout.f489311c33, (android.view.ViewGroup) this.f408590t, false);
            kotlin.jvm.internal.o.f(inflate, "inflate(...)");
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.f486023jw5);
            kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
            android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
            if (!z17 || !z18) {
                ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jw6)).setVisibility(8);
            }
            l(inflate, -2, -2, true);
            if (imageView.getBackground() instanceof android.graphics.drawable.AnimationDrawable) {
                android.graphics.drawable.Drawable background = imageView.getBackground();
                kotlin.jvm.internal.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.AnimationDrawable");
                ((android.graphics.drawable.AnimationDrawable) background).start();
            }
            if (z17) {
                this.f408595y = 2;
            } else {
                this.f408595y = 1;
            }
        }
    }

    public final void o(int i17) {
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f408581h;
        if (weImageView != null) {
            weImageView.setImageDrawable(com.tencent.mm.ui.uk.e(this.itemView.getContext(), com.tencent.mm.R.raw.icon_filled_mike_off, -65536));
        }
        if (weImageView != null) {
            weImageView.setIconColor(this.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.a2y));
        }
        com.tencent.mm.plugin.multitalk.ui.widget.MultitalkFrameView multitalkFrameView = this.f408577d;
        if (multitalkFrameView != null) {
            multitalkFrameView.setTag(com.tencent.mm.R.id.nwx, java.lang.Boolean.valueOf(i17 == 0));
        }
        ((android.widget.RelativeLayout) this.itemView.findViewById(com.tencent.mm.R.id.jwq)).setBackground(com.tencent.mm.ui.uk.e(this.itemView.getContext(), com.tencent.mm.R.drawable.aqf, this.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.f478553an)));
        ((android.widget.RelativeLayout) this.itemView.findViewById(com.tencent.mm.R.id.jwq)).setVisibility(i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r15) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sj3.j.p(int):void");
    }

    public final void q(yz5.l lVar, boolean z17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate2;
        android.widget.TextView textView = this.f408583m;
        if (!(textView != null && textView.getVisibility() == 8)) {
            k();
            return;
        }
        this.f408589s = lVar;
        if (textView != null) {
            textView.setText(this.f408586p);
        }
        android.view.View view = this.f408584n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder", "showUserName", "(Lkotlin/jvm/functions/Function1;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder", "showUserName", "(Lkotlin/jvm/functions/Function1;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View view2 = this.f408585o;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder", "showUserName", "(Lkotlin/jvm/functions/Function1;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/AvatarLayoutHolder", "showUserName", "(Lkotlin/jvm/functions/Function1;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (textView != null) {
            textView.setVisibility(0);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f408588r;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f408588r;
        if (b4Var2 != null) {
            b4Var2.removeCallbacksAndMessages(null);
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var3 = this.f408588r;
        if (b4Var3 != null) {
            b4Var3.quitSafely();
        }
        this.f408588r = new com.tencent.mm.sdk.platformtools.b4(new sj3.h(this), false);
        if (view != null && (animate2 = view.animate()) != null) {
            animate2.cancel();
        }
        if (view == null || (animate = view.animate()) == null || (alpha = animate.alpha(1.0f)) == null || (duration = alpha.setDuration(150L)) == null) {
            return;
        }
        duration.setListener(new sj3.i(this));
    }
}
