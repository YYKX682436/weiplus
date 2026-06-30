package jq4;

/* loaded from: classes5.dex */
public abstract class y extends jq4.z0 {
    public boolean A;

    /* renamed from: w, reason: collision with root package name */
    public wu5.c f301222w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f301223x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f301224y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f301225z;

    public static /* synthetic */ void y(jq4.y yVar, android.content.Context context, android.content.Intent intent, long j17, int i17, boolean z17, java.lang.String str, boolean z18, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCard");
        }
        yVar.x(context, intent, j17, i17, z17, str, (i19 & 64) != 0 ? false : z18, (i19 & 128) != 0 ? 1 : i18);
    }

    public void A(java.lang.String toUser) {
        kotlin.jvm.internal.o.g(toUser, "toUser");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showRejectCard: ");
        sb6.append(toUser);
        sb6.append(" and ");
        ((com.tencent.mm.booter.notification.z) ((oo3.i) i95.n0.c(oo3.i.class))).getClass();
        sb6.append(((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b);
        com.tencent.mars.xlog.Log.i("VoipFloatCardManager", sb6.toString());
        ((com.tencent.mm.booter.notification.z) ((oo3.i) i95.n0.c(oo3.i.class))).getClass();
        if (kotlin.jvm.internal.o.b(((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b, toUser) || this.A) {
            super.s();
            return;
        }
        this.f301223x = true;
        int i17 = this.f301239h;
        long j17 = this.f301238g;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "voip_banner_after_reject");
        hashMap.put("voip_roomid", java.lang.Integer.valueOf(i17));
        hashMap.put("voip_roomKey", java.lang.Long.valueOf(j17));
        hashMap.put("voip_banner_after_reject_from", 1);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 26804);
        this.f301249r = 2;
        wu5.c cVar = this.f301222w;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        jq4.s sVar = new jq4.s(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f301222w = t0Var.z(sVar, 2500L, false);
        if (this.f301248q == null) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            z(context, toUser);
            return;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.by), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj));
        android.view.View view = this.f301248q;
        if (view != null) {
            ofInt.addUpdateListener(new jq4.w(view, this));
        }
        android.view.View view2 = this.f301236e;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.tencent.mm.R.id.lsu) : null;
        android.view.View view3 = this.f301236e;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = view3 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view3.findViewById(com.tencent.mm.R.id.gww) : null;
        android.view.View view4 = this.f301236e;
        android.view.View findViewById2 = view4 != null ? view4.findViewById(com.tencent.mm.R.id.mlr) : null;
        android.view.View view5 = this.f301236e;
        android.view.View findViewById3 = view5 != null ? view5.findViewById(com.tencent.mm.R.id.mlq) : null;
        android.view.View view6 = this.f301236e;
        if (view6 != null) {
            view6.setOnClickListener(new jq4.t(this, toUser));
        }
        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479732dp), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df));
        ofInt2.addUpdateListener(new jq4.x(findViewById));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new jq4.u(weImageView, findViewById, findViewById2, findViewById3));
        android.animation.ValueAnimator ofInt3 = android.animation.ValueAnimator.ofInt(28, 0);
        ofInt3.addUpdateListener(new jq4.v(weImageView));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.play(ofInt).with(ofInt2).with(ofInt3).with(ofFloat);
        animatorSet.start();
    }

    @Override // jq4.z0
    public void b(boolean z17, boolean z18, boolean z19) {
        if (z19 && this.f301249r == 3) {
            com.tencent.mars.xlog.Log.i("VoipFloatCardManager", "dismiss card, current card is incoming card, skip");
            return;
        }
        if (this.f301222w == null) {
            super.b(z17, z18, z19);
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).rj(".ui.voip.VoipFloatView");
            this.f301249r = 0;
            if (this.f301223x) {
                int i17 = this.f301239h;
                long j17 = this.f301238g;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("view_id", "voip_banner_after_reject");
                hashMap.put("voip_roomid", java.lang.Integer.valueOf(i17));
                hashMap.put("voip_roomKey", java.lang.Long.valueOf(j17));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_unexp", hashMap, 26804);
            }
        }
    }

    @Override // jq4.z0
    public int d() {
        return this.f301225z ? com.tencent.mm.R.drawable.f480722b3 : com.tencent.mm.R.drawable.f480719b0;
    }

    @Override // jq4.z0
    public int e() {
        return this.A ? com.tencent.mm.R.layout.dci : com.tencent.mm.R.layout.baq;
    }

    @Override // jq4.z0
    public int f() {
        return this.f301225z ? com.tencent.mm.R.string.f493470kc3 : this.A ? com.tencent.mm.R.string.lgj : com.tencent.mm.R.string.f493469kc2;
    }

    @Override // jq4.z0
    public void k(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        int i17 = this.f301249r;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.w("VoipFloatCardManager", "onAccept, cardType is null, ignore");
            return;
        }
        if (i17 != 3) {
            android.view.View view = this.f301236e;
            if (view != null) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                jq4.a aVar = new jq4.a(view, intent, this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(aVar, 200L, false);
            }
            b(false, false, false);
        }
    }

    @Override // jq4.z0
    public android.animation.Animator n() {
        ((com.tencent.mm.booter.notification.z) ((oo3.i) i95.n0.c(oo3.i.class))).getClass();
        if (kotlin.jvm.internal.o.b(((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b, this.f301242k)) {
            return super.n();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new jq4.b(this));
        ofFloat.setDuration(300L);
        ofFloat.start();
        return ofFloat;
    }

    @Override // jq4.z0
    public void o() {
        if (this.f301223x) {
            int i17 = this.f301239h;
            long j17 = this.f301238g;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "voip_banner_after_reject");
            hashMap.put("voip_roomid", java.lang.Integer.valueOf(i17));
            hashMap.put("voip_roomKey", java.lang.Long.valueOf(j17));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_slide_up", hashMap, 26804);
        }
        if (this.f301225z) {
            rq4.s.f399098a.a(this.f301238g, 2, 2);
        } else {
            rq4.s.f399098a.a(this.f301238g, 2, 1);
        }
        if (this.f301223x) {
            int i18 = this.f301239h;
            long j18 = this.f301238g;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("view_id", "voip_banner_after_reject");
            hashMap2.put("voip_roomid", java.lang.Integer.valueOf(i18));
            hashMap2.put("voip_roomKey", java.lang.Long.valueOf(j18));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_slide_up", hashMap2, 26804);
        }
    }

    @Override // jq4.z0
    public void p(android.content.Intent intent) {
        kotlin.jvm.internal.o.g(intent, "intent");
        int i17 = this.f301249r;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.w("VoipFloatCardManager", "onFullscreen, cardType is null, ignore");
            return;
        }
        if (i17 == 3) {
            j();
            yz5.a aVar = this.f301224y;
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        b(true, false, false);
        android.view.View view = this.f301236e;
        ku5.u0 u0Var = ku5.t0.f312615d;
        jq4.c cVar = new jq4.c(view, intent, this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(cVar, 200L, false);
        if (this.f301225z) {
            rq4.s.f399098a.a(this.f301238g, 1, 2);
        } else {
            rq4.s.f399098a.a(this.f301238g, 1, 1);
        }
    }

    @Override // jq4.z0
    public void q() {
        if (this.f301249r == 3) {
            j();
        }
    }

    @Override // jq4.z0
    public void s() {
        ((com.tencent.mm.booter.notification.z) ((oo3.i) i95.n0.c(oo3.i.class))).getClass();
        if (kotlin.jvm.internal.o.b(((com.tencent.mm.booter.notification.x) c01.d9.f()).f63516b, this.f301242k) || this.A) {
            super.s();
            return;
        }
        this.f301223x = true;
        int i17 = this.f301239h;
        long j17 = this.f301238g;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "voip_banner_after_reject");
        hashMap.put("voip_roomid", java.lang.Integer.valueOf(i17));
        hashMap.put("voip_roomKey", java.lang.Long.valueOf(j17));
        hashMap.put("voip_banner_after_reject_from", 1);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 26804);
        this.f301249r = 2;
        wu5.c cVar = this.f301222w;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        jq4.d dVar = new jq4.d(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f301222w = t0Var.z(dVar, 2500L, false);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.by), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj));
        android.view.View view = this.f301248q;
        if (view != null) {
            ofInt.addUpdateListener(new jq4.h(view, this));
        }
        android.view.View view2 = this.f301236e;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.tencent.mm.R.id.lsu) : null;
        android.view.View view3 = this.f301236e;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = view3 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) view3.findViewById(com.tencent.mm.R.id.gww) : null;
        android.view.View view4 = this.f301236e;
        android.view.View findViewById2 = view4 != null ? view4.findViewById(com.tencent.mm.R.id.mlr) : null;
        android.view.View view5 = this.f301236e;
        android.view.View findViewById3 = view5 != null ? view5.findViewById(com.tencent.mm.R.id.mlq) : null;
        android.view.View view6 = this.f301236e;
        if (view6 != null) {
            view6.setOnClickListener(new jq4.e(this));
        }
        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479732dp), com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479723df));
        ofInt2.addUpdateListener(new jq4.i(findViewById));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new jq4.f(weImageView, findViewById, findViewById2, findViewById3));
        android.animation.ValueAnimator ofInt3 = android.animation.ValueAnimator.ofInt(28, 0);
        ofInt3.addUpdateListener(new jq4.g(weImageView));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.play(ofInt).with(ofInt2).with(ofInt3).with(ofFloat);
        animatorSet.start();
        r();
    }

    public void x(android.content.Context context, android.content.Intent intent, long j17, int i17, boolean z17, java.lang.String toUser, boolean z18, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(toUser, "toUser");
        wu5.c cVar = this.f301222w;
        if (cVar != null || this.f301223x) {
            if (cVar != null) {
                cVar.cancel(false);
            }
            this.f301222w = null;
            jq4.z0.c(this, true, false, false, 2, null);
            this.f301223x = false;
        }
        this.f301249r = i18;
        rq4.s sVar = rq4.s.f399098a;
        int i19 = z17 ? 2 : 1;
        rq4.r rVar = rq4.s.f399100c;
        rVar.f399096d = 1;
        rVar.f399095c = i19;
        rq4.s.f399099b = java.lang.System.currentTimeMillis();
        v(context, intent, j17, i17, toUser, z18);
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).qj(".ui.voip.VoipFloatView");
    }

    public void z(android.content.Context context, java.lang.String toUser) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(toUser, "toUser");
        if (this.f301236e != null) {
            return;
        }
        this.f301223x = true;
        wu5.c cVar = this.f301222w;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f312615d;
        jq4.j jVar = new jq4.j(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f301222w = t0Var.z(jVar, 2500L, false);
        if (this.f301249r != 2) {
            jq4.z0.c(this, true, false, false, 6, null);
        }
        int i17 = this.f301239h;
        long j17 = this.f301238g;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "voip_banner_after_reject");
        hashMap.put("voip_roomid", java.lang.Integer.valueOf(i17));
        hashMap.put("voip_roomKey", java.lang.Long.valueOf(j17));
        hashMap.put("voip_banner_after_reject_from", 2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 26804);
        this.f301249r = 2;
        this.f301238g = this.f301238g;
        this.f301242k = toUser;
        com.tencent.mm.app.w.INSTANCE.a(this.f301253v);
        if (this.f301232a == null) {
            kotlinx.coroutines.c0 a17 = kotlinx.coroutines.v2.a(null, 1, null);
            this.f301234c = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(a17));
            this.f301232a = a17;
        }
        if (this.f301235d == null) {
            com.tencent.mars.xlog.Log.i("VoipFloatCardManager", "Load windowManager: " + getClass());
            java.lang.Object systemService = context.getSystemService("window");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f301235d = new jq4.d0((android.view.WindowManager) systemService);
        }
        if (this.f301236e == null) {
            this.f301252u = new android.view.GestureDetector(context, this.f301251t);
            this.f301236e = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.bar, (android.view.ViewGroup) null, false);
        }
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = fp.h.c(26) ? 2038 : 2002;
        layoutParams.flags = com.tencent.mm.plugin.appbrand.jsapi.share.f0.CTRL_INDEX;
        layoutParams.format = 1;
        layoutParams.packageName = context.getPackageName();
        layoutParams.gravity = 49;
        layoutParams.width = -1;
        layoutParams.height = -2;
        android.view.View view = this.f301236e;
        if (view != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.kfz);
            imageView.post(new jq4.m(this, imageView));
            w();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager", "showFinishCard", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager", "showFinishCard", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager", "showFinishCard", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager", "showFinishCard", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewManager viewManager = this.f301235d;
            if (viewManager != null) {
                viewManager.addView(view, layoutParams);
            }
            view.post(new jq4.q(this, view));
            view.setOnClickListener(new jq4.r(this, toUser));
        }
    }
}
