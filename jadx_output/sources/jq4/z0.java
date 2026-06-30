package jq4;

/* loaded from: classes5.dex */
public abstract class z0 {

    /* renamed from: a */
    public kotlinx.coroutines.r2 f301232a;

    /* renamed from: b */
    public boolean f301233b;

    /* renamed from: c */
    public volatile kotlinx.coroutines.y0 f301234c;

    /* renamed from: d */
    public android.view.ViewManager f301235d;

    /* renamed from: e */
    public android.view.View f301236e;

    /* renamed from: f */
    public android.content.Intent f301237f;

    /* renamed from: g */
    public long f301238g;

    /* renamed from: h */
    public int f301239h;

    /* renamed from: i */
    public jq4.c0 f301240i;

    /* renamed from: j */
    public android.animation.Animator f301241j;

    /* renamed from: l */
    public boolean f301243l;

    /* renamed from: m */
    public int f301244m;

    /* renamed from: n */
    public int f301245n;

    /* renamed from: o */
    public float f301246o;

    /* renamed from: q */
    public android.view.View f301248q;

    /* renamed from: r */
    public int f301249r;

    /* renamed from: s */
    public boolean f301250s;

    /* renamed from: u */
    public android.view.GestureDetector f301252u;

    /* renamed from: k */
    public java.lang.String f301242k = "";

    /* renamed from: p */
    public java.lang.String f301247p = "";

    /* renamed from: t */
    public final android.view.GestureDetector.SimpleOnGestureListener f301251t = new jq4.j0(this);

    /* renamed from: v */
    public final com.tencent.mm.app.t2 f301253v = new jq4.f0(this);

    public static /* synthetic */ void c(jq4.z0 z0Var, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dismissCard");
        }
        if ((i17 & 1) != 0) {
            z17 = false;
        }
        if ((i17 & 2) != 0) {
            z18 = true;
        }
        if ((i17 & 4) != 0) {
            z19 = true;
        }
        z0Var.b(z17, z18, z19);
    }

    public java.lang.String a() {
        com.tencent.mm.storage.k4 Bi;
        com.tencent.mm.storage.z3 n17;
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        vg3.x3 x3Var = (vg3.x3) gm0.j1.s(vg3.x3.class);
        java.lang.String d17 = (x3Var == null || (Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) x3Var).Bi()) == null || (n17 = Bi.n(this.f301242k, true)) == null) ? null : n17.d1();
        ((sg3.a) v0Var).getClass();
        return c01.a2.e(d17) + this.f301247p + ',';
    }

    public void b(boolean z17, boolean z18, boolean z19) {
        com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "dismissCard() called with: quickHide = " + z17 + ", releaseViewAndIntent = " + z18);
        com.tencent.mm.app.w.INSTANCE.p(this.f301253v);
        rq4.s sVar = rq4.s.f399098a;
        rq4.r rVar = rq4.s.f399100c;
        if (rVar.f399096d == 1) {
            rVar.f399093a = 1;
            rVar.f399097e = java.lang.System.currentTimeMillis() - rq4.s.f399099b;
        }
        if (this.f301236e == null) {
            com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "floatView is null: ".concat(getClass().getName()));
        }
        if (this.f301235d == null) {
            com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "windowManager is null: ".concat(getClass().getName()));
        }
        android.view.View view = this.f301236e;
        if (view != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager", "dismissCard", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager", "dismissCard", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.ViewManager viewManager = this.f301235d;
                if (viewManager != null) {
                    viewManager.removeView(view);
                }
                rq4.r rVar2 = rq4.s.f399100c;
                if (rVar2.f399096d == 1) {
                    rVar2.f399094b = 1;
                }
                this.f301235d = null;
                if (z18) {
                    u(view);
                }
                this.f301233b = false;
            } else {
                if (this.f301250s) {
                    return;
                }
                android.animation.Animator animator = this.f301241j;
                if (animator != null) {
                    animator.cancel();
                }
                android.animation.Animator n17 = n();
                n17.addListener(new jq4.g0(view, this, z18));
                n17.setDuration(200L);
                n17.start();
                this.f301250s = true;
                this.f301241j = n17;
            }
        }
        this.f301243l = false;
        jq4.c0 c0Var = this.f301240i;
        if (c0Var != null) {
            c0Var.b();
        }
        this.f301240i = null;
        this.f301234c = null;
        kotlinx.coroutines.r2 r2Var = this.f301232a;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f301232a = null;
        this.f301242k = "";
    }

    public abstract int d();

    public int e() {
        return com.tencent.mm.R.layout.bap;
    }

    public abstract int f();

    public final int g(float f17) {
        return this.f301245n + ((int) (f17 - this.f301246o));
    }

    public void h() {
        com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "hideCard() called");
        c(this, true, false, false, 2, null);
    }

    public void i(android.content.Intent intent, java.lang.String toUser) {
        android.widget.TextView textView;
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(toUser, "toUser");
        com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "initView: ");
        android.view.View view = this.f301236e;
        if (view != null) {
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(toUser, true);
            java.lang.String d17 = n17 != null ? n17.d1() : null;
            ((sg3.a) v0Var).getClass();
            java.lang.String e17 = c01.a2.e(d17);
            this.f301242k = toUser;
            com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(toUser, true);
            this.f301248q = view.findViewById(com.tencent.mm.R.id.f485020g91);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kg8);
            if (textView2 != null) {
                textView2.setText(e17);
            }
            java.lang.String a17 = t41.g.a(n18);
            if (!android.text.TextUtils.isEmpty(a17) && (textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kg8)) != null) {
                android.text.SpannableString spannableString = new android.text.SpannableString(e17 + ' ' + a17);
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(view.getResources().getColor(com.tencent.mm.R.color.a0j)), e17.length() + 1, spannableString.length(), 33);
                textView.setText(spannableString);
            }
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.kfq);
            if (imageView == null) {
                return;
            }
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, toUser, null);
            android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kg6);
            if (textView3 != null) {
                int f17 = f();
                textView3.setText(f17);
                this.f301247p = textView3.getText().toString();
                if (this.f301240i == null) {
                    this.f301240i = new jq4.c0();
                }
                jq4.c0 c0Var = this.f301240i;
                if (c0Var != null) {
                    c0Var.b();
                }
                jq4.c0 c0Var2 = this.f301240i;
                if (c0Var2 != null) {
                    java.lang.String string = view.getResources().getString(f17);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    c0Var2.a(textView3, string, 500);
                }
            }
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f486172kg4);
            if (findViewById != null) {
                findViewById.setOnClickListener(new jq4.k0(this));
            }
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.kfp);
            if (findViewById2 != null) {
                findViewById2.setBackground(findViewById2.getResources().getDrawable(d()));
                findViewById2.setOnClickListener(new jq4.l0(this, intent));
            }
            android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.kfz);
            if (imageView2 == null) {
                return;
            }
            imageView2.post(new jq4.o0(this, imageView2, view));
            w();
            view.setOnTouchListener(new jq4.p0(this, view));
        }
    }

    public abstract boolean j();

    public abstract void k(android.content.Intent intent);

    public void l() {
    }

    public boolean m() {
        return false;
    }

    public android.animation.Animator n() {
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(0, -this.f301244m);
        ofInt.addUpdateListener(new jq4.q0(this));
        return ofInt;
    }

    public abstract void o();

    public abstract void p(android.content.Intent intent);

    public abstract void q();

    public abstract void r();

    public void s() {
        c(this, false, false, false, 3, null);
        r();
    }

    public boolean t() {
        return false;
    }

    public final void u(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "releaseViewAndIntent: view: " + view + " floatView: " + this.f301236e);
        if (kotlin.jvm.internal.o.b(this.f301236e, view)) {
            this.f301237f = null;
            this.f301236e = null;
            this.f301248q = null;
        }
    }

    public final void v(android.content.Context context, android.content.Intent intent, long j17, int i17, java.lang.String toUser, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(toUser, "toUser");
        com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "showCard() called with: context = " + context + ", intent = " + intent + ", roomKey = " + j17 + ", toUser = " + toUser + ", quickShow = " + z17 + " and roomId=" + i17);
        this.f301233b = true;
        this.f301238g = j17;
        this.f301239h = i17;
        com.tencent.mm.app.w.INSTANCE.a(this.f301253v);
        if (this.f301232a == null) {
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            this.f301234c = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(a17));
            this.f301232a = a17;
        }
        if (this.f301235d == null) {
            com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "Load windowManager:".concat(getClass().getName()));
            java.lang.Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f301235d = new jq4.d0((android.view.WindowManager) systemService);
        }
        if (this.f301236e == null) {
            this.f301252u = new android.view.GestureDetector(context, this.f301251t);
            this.f301236e = android.view.LayoutInflater.from(context).inflate(e(), (android.view.ViewGroup) null, false);
        }
        this.f301237f = intent;
        i(intent, toUser);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = fp.h.c(26) ? 2038 : 2002;
        layoutParams.flags = 2621992;
        layoutParams.format = -3;
        layoutParams.packageName = context.getPackageName();
        layoutParams.gravity = 49;
        layoutParams.width = -1;
        layoutParams.height = -2;
        android.view.View view = this.f301236e;
        if (view != null) {
            if (z17) {
                android.view.ViewManager viewManager = this.f301235d;
                if (viewManager != null) {
                    viewManager.addView(view, layoutParams);
                    return;
                }
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager", "showCard", "(Landroid/content/Context;Landroid/content/Intent;JILjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/voip/floatcard/VoipBaseFloatCardManager", "showCard", "(Landroid/content/Context;Landroid/content/Intent;JILjava/lang/String;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewManager viewManager2 = this.f301235d;
            if (viewManager2 != null) {
                viewManager2.addView(view, layoutParams);
            }
            view.post(new jq4.v0(this, view));
        }
    }

    public final void w() {
        android.view.View view;
        if ((this.f301242k.length() == 0) || (view = this.f301236e) == null) {
            return;
        }
        kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
        java.lang.String str = this.f301242k;
        ((com.tencent.mm.feature.avatar.w) c0Var).getClass();
        view.post(new jq4.y0(this, com.tencent.mm.modelavatar.g.b(str, false, 0, null), view, (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.kfz), view.findViewById(com.tencent.mm.R.id.kfs)));
    }
}
