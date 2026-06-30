package dp1;

/* loaded from: classes14.dex */
public class l extends androidx.recyclerview.widget.f2 {
    public static final int A;
    public static final int B;
    public static final int C;
    public static final int D;

    /* renamed from: o, reason: collision with root package name */
    public static final int f242150o = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1o);

    /* renamed from: p, reason: collision with root package name */
    public static final int f242151p = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a17);

    /* renamed from: q, reason: collision with root package name */
    public static final int f242152q = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1p);

    /* renamed from: r, reason: collision with root package name */
    public static final int f242153r = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a18);

    /* renamed from: s, reason: collision with root package name */
    public static final int f242154s = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.ap_);

    /* renamed from: t, reason: collision with root package name */
    public static final int f242155t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f242156u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f242157v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f242158w;

    /* renamed from: x, reason: collision with root package name */
    public static final int f242159x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f242160y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f242161z;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f242162d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f242163e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f242164f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f242165g;

    /* renamed from: h, reason: collision with root package name */
    public mp1.e f242166h;

    /* renamed from: i, reason: collision with root package name */
    public mp1.c f242167i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f242168m;

    /* renamed from: n, reason: collision with root package name */
    public rp1.i2 f242169n;

    static {
        i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.ap6);
        f242155t = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1l);
        f242156u = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1m);
        f242157v = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1k);
        i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1e);
        i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1g);
        i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1a);
        i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1c);
        f242158w = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1f);
        f242159x = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1h);
        f242160y = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1b);
        f242161z = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1d);
        A = qp1.e0.a(i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479648bn));
        B = qp1.e0.a(i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1h));
        C = qp1.e0.a(i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.a1b));
        D = qp1.e0.a(i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479648bn));
    }

    public l(android.content.Context context) {
        this.f242162d = context;
    }

    public static boolean x(com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        int i17;
        if (!((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().O()) {
            return !ballInfo.I || (i17 = ballInfo.f93046d) == 16 || i17 == 17 || i17 == 19 || i17 == 20 || i17 == 70;
        }
        if (ballInfo.f93046d == 23) {
            return false;
        }
        return ballInfo.K;
    }

    public final void B(dp1.k kVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (ballInfo.I) {
            z(kVar, qp1.w.p(ballInfo), ballInfo);
            return;
        }
        int i17 = ballInfo.f93060u;
        if (i17 != -1) {
            z(kVar, i17, ballInfo);
            return;
        }
        int o17 = qp1.w.o(ballInfo);
        if (com.tencent.mm.sdk.platformtools.t8.K0(ballInfo.f93057r)) {
            z(kVar, o17, ballInfo);
        } else {
            kVar.f242148s = -1;
            l01.d0.f314761a.m(new dp1.e(this, kVar, o17, ballInfo), ballInfo.f93057r, rp1.a.f398352d);
        }
    }

    public final void E(dp1.k kVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        boolean x17 = x(ballInfo);
        if (kVar.f242145p != null) {
            boolean y17 = y();
            android.widget.ImageView imageView = kVar.f242145p;
            if (y17) {
                com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = ballInfo.f93054o;
                imageView.setImageResource(ballButtonInfo.f93069d ? com.tencent.mm.R.raw.icons_filled_pause : com.tencent.mm.R.raw.icons_filled_specialplay);
                if (ballInfo.f93046d != 23) {
                    java.lang.Boolean bool = qp1.w.f365755a;
                    if ((ballInfo.H == 2) && ballButtonInfo.f93070e) {
                        r5 = 0;
                    }
                }
                imageView.setVisibility(r5);
                if (imageView.getVisibility() == 0) {
                    imageView.setTag(com.tencent.mm.R.id.nwb, new com.tencent.mm.accessibility.base.ViewTag());
                    imageView.post(new dp1.f(this, kVar));
                }
                imageView.setOnClickListener(new dp1.g(this, ballInfo));
            } else {
                java.lang.Boolean bool2 = qp1.w.f365755a;
                if (ballInfo.H == 16) {
                    imageView.setVisibility(dp1.p.f242170a.a(ballInfo) ? 0 : 8);
                    if (imageView.getVisibility() == 0) {
                        imageView.post(new dp1.h(this, kVar));
                    }
                    imageView.setOnClickListener(new dp1.i(this, ballInfo));
                } else {
                    imageView.setVisibility(x(ballInfo) ? 0 : 8);
                }
            }
        }
        kVar.itemView.setTag(ballInfo);
        if (!x17 || this.f242166h == null) {
            kVar.itemView.setOnClickListener(null);
        } else {
            kVar.itemView.setOnClickListener(new dp1.j(this, ballInfo));
        }
        boolean z17 = com.tencent.mm.plugin.ball.ui.q0.e().f93349g;
        int i17 = f242155t;
        if (z17) {
            android.view.View view = kVar.itemView;
            boolean z18 = this.f242163e;
            view.setPadding(z18 ? A : B + i17, 0, z18 ? C + i17 : D, 0);
        } else {
            android.view.View view2 = kVar.itemView;
            boolean z19 = this.f242163e;
            view2.setPadding(z19 ? f242158w : f242159x + i17, 0, z19 ? f242160y + i17 : f242161z, 0);
        }
    }

    public final void I(dp1.k kVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        android.view.View view = ballInfo.f93052m;
        if (view != null && ballInfo.I) {
            if (view.getParent() instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) ballInfo.f93052m.getParent()).removeView(ballInfo.f93052m);
            }
            android.widget.LinearLayout linearLayout = kVar.f242146q;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            android.widget.LinearLayout linearLayout2 = kVar.f242147r;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
                linearLayout2.removeAllViews();
                android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 8388627;
                linearLayout2.addView(ballInfo.f93052m, layoutParams);
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout3 = kVar.f242146q;
        if (linearLayout3 != null) {
            linearLayout3.setVisibility(0);
        }
        android.widget.LinearLayout linearLayout4 = kVar.f242147r;
        if (linearLayout4 != null) {
            linearLayout4.setVisibility(8);
        }
        dp1.q qVar = dp1.p.f242170a;
        android.widget.TextView textView = kVar.f242142m;
        if (!qVar.c(textView, ballInfo)) {
            int i17 = ballInfo.f93046d;
            android.content.Context context = this.f242162d;
            if (i17 == 20) {
                java.lang.String string = context.getString(com.tencent.mm.R.string.far);
                java.lang.Object[] objArr = new java.lang.Object[1];
                java.lang.String str = ballInfo.f93063x;
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str == null) {
                    str = "";
                }
                objArr[0] = str;
                K(textView, java.lang.String.format(string, objArr));
            } else {
                K(textView, com.tencent.mm.sdk.platformtools.t8.u1(ballInfo.f93063x, context.getString(com.tencent.mm.R.string.o3f)));
            }
        }
        java.lang.String str2 = ballInfo.f93065z;
        android.widget.TextView textView2 = kVar.f242143n;
        K(textView2, str2);
        int visibility = textView.getVisibility();
        android.widget.LinearLayout linearLayout5 = kVar.f242144o;
        if (visibility == 8 && textView2.getVisibility() == 8) {
            linearLayout5.setVisibility(8);
        } else {
            linearLayout5.setVisibility(0);
        }
    }

    public final void J(dp1.k kVar, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (this.f242164f) {
            kVar.f242141i.setVisibility(4);
        } else {
            kVar.f242141i.setVisibility(0);
            if (y()) {
                kVar.f242140h.setImageResource(com.tencent.mm.R.raw.float_ball_icon_close_regular);
                android.widget.ImageView imageView = kVar.f242140h;
                imageView.setColorFilter(i65.a.d(imageView.getContext(), com.tencent.mm.R.color.BW_50));
            } else {
                kVar.f242140h.setImageResource(com.tencent.mm.R.raw.icons_filled_close);
                android.widget.ImageView imageView2 = kVar.f242140h;
                imageView2.setColorFilter(i65.a.d(imageView2.getContext(), com.tencent.mm.R.color.BW_50));
            }
            kVar.f242141i.setOnClickListener(new dp1.c(this, ballInfo, kVar));
        }
        int i17 = ballInfo.f93047e;
        if (i17 == 6) {
            kVar.f242141i.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.jpg));
            return;
        }
        if (i17 == 2 || i17 == 50) {
            kVar.f242141i.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.jox));
        } else if (i17 == 16) {
            kVar.f242141i.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f493310jp4));
        } else {
            kVar.f242141i.setContentDescription(com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.f493308jp2));
        }
    }

    public final void K(android.widget.TextView textView, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setText("");
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(android.text.Html.fromHtml(str));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        if (qp1.w.a(this.f242165g)) {
            return this.f242165g.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (!qp1.w.a(this.f242165g) || i17 < 0 || i17 >= this.f242165g.size()) {
            return 1;
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) this.f242165g.get(i17);
        return (ballInfo.I || ballInfo.f93046d == 20) ? 2 : 1;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        dp1.k kVar = (dp1.k) k3Var;
        if (!qp1.w.a(this.f242165g) || i17 < 0 || i17 >= this.f242165g.size()) {
            return;
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) this.f242165g.get(i17);
        kVar.f242137e = i17;
        kVar.f242136d = ballInfo;
        kVar.itemView.setTranslationX(0.0f);
        android.view.View view = kVar.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$FloatMenuViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$FloatMenuViewHolder;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        J(kVar, ballInfo);
        B(kVar, ballInfo);
        I(kVar, ballInfo);
        E(kVar, ballInfo);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        boolean y17 = y();
        int i18 = f242157v;
        int i19 = f242155t;
        if (y17) {
            android.view.View inflate = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.ei6, (android.view.ViewGroup) null, false);
            androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = new androidx.recyclerview.widget.RecyclerView.LayoutParams(f242154s + i19, -2);
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i18;
            inflate.setLayoutParams(layoutParams);
            return new dp1.k(this, inflate);
        }
        if (i17 == 1) {
            android.view.View inflate2 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.bo9, (android.view.ViewGroup) null, false);
            inflate2.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(f242150o + i19, f242151p + f242156u + i18));
            return new dp1.k(this, inflate2);
        }
        android.view.View inflate3 = android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.bo_, (android.view.ViewGroup) null, false);
        inflate3.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(f242152q + i19, f242153r));
        return new dp1.k(this, inflate3);
    }

    public boolean y() {
        return ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().O();
    }

    public final void z(dp1.k kVar, int i17, com.tencent.mm.plugin.ball.model.BallInfo ballInfo) {
        if (i17 != -1) {
            if (com.tencent.mm.sdk.platformtools.y1.b(com.tencent.mm.sdk.platformtools.x2.f193071a, i17)) {
                int i18 = kVar.f242148s;
                com.tencent.mm.plugin.ball.view.CircleAnimateView circleAnimateView = kVar.f242139g;
                if (i18 != i17) {
                    kVar.f242138f.setVisibility(8);
                    circleAnimateView.setVisibility(0);
                    try {
                        circleAnimateView.setImageResource(i17);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallMenuAdapter", e17, "setIconAnimateView exception:%s", e17);
                        circleAnimateView.setImageResource(qp1.w.p(ballInfo));
                    }
                }
                long j17 = ballInfo.A;
                if (j17 >= 0) {
                    circleAnimateView.setProgress(j17);
                } else {
                    circleAnimateView.setProgress(-2147483648L);
                }
            } else {
                int i19 = kVar.f242148s;
                com.tencent.mm.plugin.ball.view.CircleImageView circleImageView = kVar.f242138f;
                if (i19 != i17) {
                    kVar.f242139g.setVisibility(8);
                    circleImageView.setVisibility(0);
                    try {
                        circleImageView.setImageResource(i17);
                        android.graphics.drawable.Drawable drawable = circleImageView.getDrawable();
                        if (drawable instanceof android.graphics.drawable.AnimationDrawable) {
                            ((android.graphics.drawable.AnimationDrawable) drawable).start();
                        }
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FloatBallMenuAdapter", e18, "setIconImageView exception:%s", e18);
                        int o17 = qp1.w.o(ballInfo);
                        circleImageView.setImageResource(o17);
                        ballInfo.f93060u = o17;
                    }
                }
                long j18 = ballInfo.A;
                if (j18 >= 0) {
                    circleImageView.setProgress(j18);
                } else {
                    circleImageView.setProgress(-2147483648L);
                }
            }
        } else if (ballInfo.f93062w != null) {
            kVar.f242138f.setVisibility(8);
            com.tencent.mm.plugin.ball.view.CircleAnimateView circleAnimateView2 = kVar.f242139g;
            circleAnimateView2.setVisibility(0);
            android.graphics.drawable.Drawable drawable2 = ballInfo.f93062w;
            if (drawable2 != kVar.f242149t) {
                kVar.f242149t = drawable2;
                circleAnimateView2.setImageDrawable(drawable2);
                if (drawable2 instanceof android.graphics.drawable.AnimationDrawable) {
                    ((android.graphics.drawable.AnimationDrawable) drawable2).start();
                }
            }
        } else {
            kVar.f242138f.setVisibility(4);
            kVar.f242139g.setVisibility(4);
        }
        kVar.f242148s = i17;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17, java.util.List list) {
        dp1.k kVar = (dp1.k) k3Var;
        if (!qp1.w.a(this.f242165g) || i17 < 0 || i17 >= this.f242165g.size()) {
            return;
        }
        com.tencent.mm.plugin.ball.model.BallInfo ballInfo = (com.tencent.mm.plugin.ball.model.BallInfo) this.f242165g.get(i17);
        kVar.f242137e = i17;
        kVar.f242136d = ballInfo;
        kVar.itemView.setTranslationX(0.0f);
        android.view.View view = kVar.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$FloatMenuViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/ball/adapter/FloatBallMenuAdapter$FloatMenuViewHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        J(kVar, ballInfo);
        B(kVar, ballInfo);
        I(kVar, ballInfo);
        E(kVar, ballInfo);
    }
}
