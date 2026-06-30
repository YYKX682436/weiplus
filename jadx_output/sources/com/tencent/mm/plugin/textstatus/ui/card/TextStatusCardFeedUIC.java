package com.tencent.mm.plugin.textstatus.ui.card;

/* loaded from: classes11.dex */
public final class TextStatusCardFeedUIC extends com.tencent.mm.ui.component.UIComponent {
    public java.lang.ref.WeakReference A;
    public com.tencent.mm.autogen.events.StatusCardFeedItemScrollEvent B;
    public com.tencent.mm.autogen.events.StatusExpandMiniCardEvent C;
    public final com.tencent.mm.sdk.event.IListener D;

    /* renamed from: d, reason: collision with root package name */
    public boolean f173773d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f173774e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f173775f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f173776g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f173777h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f173778i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f173779m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Set f173780n;

    /* renamed from: o, reason: collision with root package name */
    public int f173781o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.HashMap f173782p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.ref.WeakReference f173783q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f173784r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f173785s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f173786t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f173787u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f173788v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f173789w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f173790x;

    /* renamed from: y, reason: collision with root package name */
    public final android.view.GestureDetector f173791y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.GestureDetector f173792z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextStatusCardFeedUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f173776g = "";
        this.f173777h = "";
        this.f173778i = new java.util.LinkedHashMap();
        this.f173779m = new java.util.LinkedHashMap();
        this.f173780n = new java.util.LinkedHashSet();
        this.f173781o = -1;
        this.f173782p = new java.util.HashMap();
        this.f173786t = true;
        this.f173790x = "SCENE_DEFAULT";
        this.f173791y = new android.view.GestureDetector(activity, new uj4.j(this));
        this.f173792z = new android.view.GestureDetector(activity, new uj4.g(this, activity));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.D = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StatusSquareItemScrollEvent>(a0Var) { // from class: com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC$squareScrollListener$1
            {
                this.__eventId = 525584091;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.StatusSquareItemScrollEvent statusSquareItemScrollEvent) {
                com.tencent.mm.autogen.events.StatusSquareItemScrollEvent event = statusSquareItemScrollEvent;
                kotlin.jvm.internal.o.g(event, "event");
                am.ay ayVar = event.f54870g;
                int i17 = ayVar.f6195b;
                int i18 = ayVar.f6196c;
                java.lang.String str = ayVar.f6194a;
                com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC textStatusCardFeedUIC = com.tencent.mm.plugin.textstatus.ui.card.TextStatusCardFeedUIC.this;
                textStatusCardFeedUIC.getIntent().putExtra("KEY_START_CARD_ANIM_X_OFFSET", i17);
                textStatusCardFeedUIC.getIntent().putExtra("KEY_START_CARD_ANIM_Y_OFFSET", i18);
                textStatusCardFeedUIC.getIntent().putExtra("KEY_USER_NAME", str);
                return false;
            }
        };
    }

    public final com.tencent.mm.plugin.textstatus.ui.w1 O6() {
        in5.s0 s0Var;
        java.lang.ref.WeakReference weakReference = this.f173774e;
        if (weakReference == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.TextStatusCardFeedUIC", "getActivateMultiStatusCardView error,null ref");
            return null;
        }
        in5.s0 s0Var2 = (in5.s0) weakReference.get();
        if (s0Var2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.TextStatusCardFeedUIC", "getActivateMultiStatusCardView error,null holder");
            return null;
        }
        java.lang.Object obj = s0Var2.f293124h;
        if (obj == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.TextStatusCardFeedUIC", "getActivateMultiStatusCardView error,null tag");
            return null;
        }
        if (!(obj instanceof com.tencent.mm.plugin.textstatus.ui.w1)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.TextStatusCardFeedUIC", "getActivateMultiStatusCardView error,wrong type:" + obj);
            return null;
        }
        java.lang.ref.WeakReference weakReference2 = this.f173774e;
        java.lang.Object obj2 = (weakReference2 == null || (s0Var = (in5.s0) weakReference2.get()) == null) ? null : s0Var.f293124h;
        com.tencent.mm.plugin.textstatus.ui.w1 w1Var = obj2 instanceof com.tencent.mm.plugin.textstatus.ui.w1 ? (com.tencent.mm.plugin.textstatus.ui.w1) obj2 : null;
        if (w1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TextStatus.TextStatusCardFeedUIC", "getActivateMultiStatusCardView fail");
        }
        return w1Var;
    }

    public final bi4.n0 P6() {
        in5.s0 Q6 = Q6();
        java.lang.Object obj = Q6 != null ? Q6.f293124h : null;
        if (obj instanceof com.tencent.mm.plugin.textstatus.ui.q3) {
            return (com.tencent.mm.plugin.textstatus.ui.q3) obj;
        }
        return null;
    }

    public final in5.s0 Q6() {
        java.lang.ref.WeakReference weakReference = this.f173775f;
        if (weakReference != null) {
            return (in5.s0) weakReference.get();
        }
        return null;
    }

    public final cj4.q1 R6() {
        java.lang.String str = this.f173790x;
        return kotlin.jvm.internal.o.b(str, "SCENE_MORE_TAB") ? true : kotlin.jvm.internal.o.b(str, "SCENE_CONTACT_PROFILE") ? this.f173787u ? cj4.q1.f42021e : cj4.q1.f42022f : cj4.q1.f42020d;
    }

    public final boolean S6() {
        return (getIntent().getIntExtra("KEY_START_CARD_ANIM_X_OFFSET", -1) == -1 || getIntent().getIntExtra("KEY_START_CARD_ANIM_Y_OFFSET", -1) == -1) ? false : true;
    }

    public final void T6(android.widget.RelativeLayout itemView, int i17, int i18, boolean z17) {
        com.tencent.mm.view.MMPAGView mMPAGView;
        in5.s0 s0Var;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        java.lang.ref.WeakReference weakReference = this.f173783q;
        java.lang.Object obj = (weakReference == null || (s0Var = (in5.s0) weakReference.get()) == null) ? null : s0Var.f293124h;
        com.tencent.mm.plugin.textstatus.ui.q3 q3Var = obj instanceof com.tencent.mm.plugin.textstatus.ui.q3 ? (com.tencent.mm.plugin.textstatus.ui.q3) obj : null;
        java.lang.String str = q3Var != null ? q3Var.f174199p : null;
        if (str == null ? false : kotlin.jvm.internal.o.b(str, en1.a.a())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedUIC", "playLikePAG: skip");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.A;
        if (weakReference2 != null && (mMPAGView = (com.tencent.mm.view.MMPAGView) weakReference2.get()) != null) {
            mMPAGView.n();
        }
        com.tencent.mm.view.MMPAGView mMPAGView2 = new com.tencent.mm.view.MMPAGView(getActivity());
        int dimension = (int) getActivity().getResources().getDimension(com.tencent.mm.R.dimen.f479683ci);
        itemView.addView(mMPAGView2);
        android.view.ViewGroup.LayoutParams layoutParams = mMPAGView2.getLayoutParams();
        android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            layoutParams2.width = dimension;
            layoutParams2.height = dimension;
            if (z17) {
                int i19 = i17 + dimension;
                if (i19 > itemView.getWidth()) {
                    layoutParams2.addRule(11, -1);
                    layoutParams2.removeRule(9);
                    layoutParams2.rightMargin = itemView.getWidth() - i19;
                    layoutParams2.leftMargin = 0;
                } else {
                    layoutParams2.addRule(9, -1);
                    layoutParams2.removeRule(11);
                    layoutParams2.leftMargin = i17;
                    layoutParams2.rightMargin = 0;
                }
                int i27 = dimension + i18;
                if (i27 > itemView.getHeight()) {
                    layoutParams2.addRule(12, -1);
                    layoutParams2.removeRule(10);
                    layoutParams2.bottomMargin = itemView.getHeight() - i27;
                    layoutParams2.topMargin = 0;
                } else {
                    layoutParams2.addRule(10, -1);
                    layoutParams2.removeRule(12);
                    layoutParams2.topMargin = i18;
                    layoutParams2.bottomMargin = 0;
                }
            } else {
                layoutParams2.addRule(13, -1);
            }
        }
        mMPAGView2.a(new uj4.i(mMPAGView2, itemView));
        mMPAGView2.o(bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.global.RepairerConfigRfxTextStatusSwitch()) == 1);
        android.content.res.AssetManager assets = getContext().getAssets();
        kotlin.jvm.internal.o.f(assets, "getAssets(...)");
        mMPAGView2.k(assets, "status_like_bmp.pag");
        mMPAGView2.g();
        mMPAGView2.setRotation(z17 ? new java.util.Random().nextInt(31) - 15 : 0);
        this.A = new java.lang.ref.WeakReference(mMPAGView2);
    }

    public final void U6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedUIC", "reset: ");
        java.util.Map map = this.f173778i;
        java.util.Iterator it = ((java.util.LinkedHashMap) map).values().iterator();
        while (it.hasNext()) {
            ((bi4.n0) it.next()).c();
        }
        ((java.util.LinkedHashMap) map).clear();
        ((java.util.LinkedHashMap) this.f173779m).clear();
        this.f173782p.clear();
        this.D.dead();
        this.f173780n.clear();
        this.f173775f = null;
        this.f173774e = null;
        this.f173781o = -1;
        this.f173776g = "";
        this.f173777h = "";
    }

    public final void V6(yz5.a aVar) {
        if (this.f173786t) {
            in5.s0 Q6 = Q6();
            java.lang.Object obj = Q6 != null ? Q6.f293124h : null;
            bi4.n0 n0Var = obj instanceof bi4.n0 ? (bi4.n0) obj : null;
            if (n0Var != null) {
                n0Var.a();
            }
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public final void W6(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f173774e;
        in5.s0 s0Var = weakReference != null ? (in5.s0) weakReference.get() : null;
        java.lang.Object obj = s0Var != null ? s0Var.f293124h : null;
        if (obj instanceof com.tencent.mm.plugin.textstatus.ui.w1) {
            com.tencent.mm.plugin.textstatus.ui.w1 w1Var = (com.tencent.mm.plugin.textstatus.ui.w1) obj;
            int initScrollIndex = w1Var.getInitScrollIndex();
            w1Var.i(initScrollIndex, z17, false);
            w1Var.f(initScrollIndex);
            w1Var.h(initScrollIndex);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public boolean onBackPressed() {
        in5.s0 Q6 = Q6();
        java.lang.Object obj = Q6 != null ? Q6.f293124h : null;
        bi4.n0 n0Var = obj instanceof bi4.n0 ? (bi4.n0) obj : null;
        if (n0Var != null) {
            n0Var.onBackPressed();
        }
        return super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("KEY_FROM_SCENE");
        if (stringExtra == null) {
            stringExtra = "SCENE_DEFAULT";
        }
        this.f173790x = stringExtra;
        if (kotlin.jvm.internal.o.b(stringExtra, "SCENE_DEFAULT") || kotlin.jvm.internal.o.b(this.f173790x, "SCENE_HISTORY_FEED")) {
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_TEXT_STATUS_CARD_FEED_ENTER_TIMES_INT;
            int r17 = c17.r(u3Var, 0);
            this.f173773d = r17 < 3;
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
        }
        if (S6()) {
            this.D.alive();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        if (b21.m.c()) {
            b21.m.j();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        U6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        boolean z17 = false;
        this.f173789w = false;
        in5.s0 Q6 = Q6();
        java.lang.Object obj = Q6 != null ? Q6.f293124h : null;
        bi4.n0 n0Var = obj instanceof bi4.n0 ? (bi4.n0) obj : null;
        if (n0Var != null) {
            n0Var.d();
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        android.app.Activity context = getContext();
        objArr[0] = context != null ? java.lang.Boolean.valueOf(context.isFinishing()) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onPause() called isFinishing:%s", objArr);
        android.app.Activity context2 = getContext();
        if (context2 != null && context2.isFinishing()) {
            z17 = true;
        }
        if (z17) {
            in5.s0 Q62 = Q6();
            java.lang.Object obj2 = Q62 != null ? Q62.f293124h : null;
            bi4.n0 n0Var2 = obj2 instanceof bi4.n0 ? (bi4.n0) obj2 : null;
            if (n0Var2 != null) {
                n0Var2.S5(203L);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f173789w = true;
        if (kotlin.jvm.internal.o.b(this.f173790x, "SCENE_HISTORY_FEED")) {
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.textstatus.ui.ac.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            ((com.tencent.mm.plugin.textstatus.ui.ac) a17).O6(true);
        }
        V6(null);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusCardFeedUIC", "onResume() called");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
    }
}
