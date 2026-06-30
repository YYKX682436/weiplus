package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class SnsHeader extends android.widget.LinearLayout {
    public int A;
    public final android.view.View.OnClickListener B;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.dj f167165d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.bj f167166e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f167167f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.storage.x1 f167168g;

    /* renamed from: h, reason: collision with root package name */
    public long f167169h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.Context f167170i;

    /* renamed from: m, reason: collision with root package name */
    public int f167171m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f167172n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f167173o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f167174p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f167175q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f167176r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f167177s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.animation.Animation f167178t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f167179u;

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.c3 f167180v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.ListView f167181w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f167182x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Boolean f167183y;

    /* renamed from: z, reason: collision with root package name */
    public int f167184z;

    public SnsHeader(android.content.Context context) {
        super(context);
        this.f167169h = 0L;
        this.f167172n = false;
        this.f167173o = false;
        this.f167174p = false;
        this.f167175q = true;
        new java.util.HashMap();
        this.f167178t = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f167179u = false;
        this.f167183y = java.lang.Boolean.FALSE;
        this.B = new com.tencent.mm.plugin.sns.ui.ti(this);
        g(context);
    }

    public static void a(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader, float f17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        snsHeader.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCoverOpening", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        snsHeader.f167165d.f168186c.setVisibility(0);
        snsHeader.f167165d.f168184a.setVisibility(0);
        android.view.View view = snsHeader.f167165d.f168196m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverOpening", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverOpening", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (snsHeader.f167171m == 1) {
            snsHeader.f167165d.f168185b.setVisibility(8);
        } else {
            snsHeader.f167165d.f168185b.setVisibility(0);
        }
        if (snsHeader.f167174p) {
            snsHeader.f167165d.f168187d.setVisibility(0);
        }
        if (snsHeader.f167172n) {
            snsHeader.f167165d.f168193j.setVisibility(0);
        } else if (snsHeader.h()) {
            snsHeader.f167165d.f168194k.setVisibility(0);
        } else {
            snsHeader.f167165d.f168194k.setVisibility(8);
        }
        double d17 = f17;
        if (d17 <= 0.01d) {
            if (snsHeader.f167172n) {
                snsHeader.f167165d.f168193j.setVisibility(4);
            } else if (snsHeader.h()) {
                snsHeader.f167165d.f168194k.setVisibility(4);
            } else {
                snsHeader.f167165d.f168194k.setVisibility(8);
            }
        } else if (d17 >= 0.99d) {
            snsHeader.f167165d.f168186c.setVisibility(4);
            snsHeader.f167165d.f168184a.setVisibility(4);
            android.view.View view2 = snsHeader.f167165d.f168196m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverOpening", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverOpening", "(F)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (snsHeader.f167171m == 1) {
                snsHeader.f167165d.f168185b.setVisibility(8);
            } else {
                snsHeader.f167165d.f168185b.setVisibility(4);
            }
            if (snsHeader.f167174p) {
                snsHeader.f167165d.f168187d.setVisibility(4);
            }
        }
        float f18 = 1.0f - f17;
        snsHeader.f167165d.f168186c.setAlpha(f18);
        snsHeader.f167165d.f168184a.setAlpha(f18);
        snsHeader.f167165d.f168185b.setAlpha(f18);
        snsHeader.f167165d.f168187d.setAlpha(f18);
        if (snsHeader.f167172n) {
            snsHeader.f167165d.f168193j.setAlpha(f17);
        } else {
            snsHeader.f167165d.f168194k.setAlpha(f17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCoverOpening", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$200", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.widget.c3 b(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.widget.c3 c3Var = snsHeader.f167180v;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return c3Var;
    }

    public static void c(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader) {
        android.content.Context context;
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        snsHeader.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCoverClick", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        int previewType = snsHeader.f167165d.f168192i.getPreviewType();
        if (!w94.a.f444075a.b()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("legacyClick", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            java.lang.String[] strArr = snsHeader.f167172n ? new java.lang.String[]{snsHeader.f167170i.getString(com.tencent.mm.R.string.jgq)} : snsHeader.f167168g.field_isLike ? new java.lang.String[0] : new java.lang.String[]{snsHeader.f167170i.getString(com.tencent.mm.R.string.jch)};
            java.lang.String string = (snsHeader.f167172n || !snsHeader.f167168g.field_isLike) ? "" : snsHeader.f167170i.getString(com.tencent.mm.R.string.jed);
            if (snsHeader.f167172n || !snsHeader.f167168g.field_isLike) {
                context = snsHeader.f167170i;
                i17 = com.tencent.mm.R.string.f490347sg;
            } else {
                context = snsHeader.f167170i;
                i17 = com.tencent.mm.R.string.f490507x1;
            }
            db5.e1.f(snsHeader.getContext(), string, strArr, null, context.getString(i17), new com.tencent.mm.plugin.sns.ui.si(snsHeader));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("legacyClick", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        } else if (snsHeader.f167175q || previewType == 0) {
            snsHeader.f();
        } else {
            android.widget.ListView listView = snsHeader.f167181w;
            if (listView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(listView, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverClick", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                listView.smoothScrollToPosition(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(listView, "com/tencent/mm/plugin/sns/ui/SnsHeader", "onCoverClick", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            }
            if (snsHeader.f167180v.k()) {
                snsHeader.f167180v.h();
            } else {
                com.tencent.mm.plugin.sns.ui.widget.c3 c3Var = snsHeader.f167180v;
                c3Var.getClass();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("open", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                c3Var.f171103g = false;
                db5.y4.b(c3Var.f171097a, -c3Var.f171099c, 0, 2, null);
                c3Var.g(false);
                c3Var.f171104h = true;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("open", "com.tencent.mm.plugin.sns.ui.widget.SnsOpenScroller");
                com.tencent.mm.plugin.sns.statistics.s0.f164937k0.f(2);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCoverClick", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.storage.x1 d(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.storage.x1 x1Var = snsHeader.f167168g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return x1Var;
    }

    public static /* synthetic */ com.tencent.mm.plugin.sns.ui.bj e(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.bj bjVar = snsHeader.f167166e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return bjVar;
    }

    public void f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeCover", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        if (!this.f167172n) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeCover", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.bj bjVar = this.f167166e;
        if (bjVar != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onChangeCover", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction = ((com.tencent.mm.plugin.sns.ui.lt) bjVar).f169876a;
            boolean z17 = snsUIAction.P;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.SnsUIAction");
            if (z17) {
                snsUIAction.o(2, 4);
            } else {
                ((com.tencent.mm.plugin.sns.ui.iv) com.tencent.mm.plugin.sns.ui.SnsUIAction.c(snsUIAction)).a();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onChangeCover", "com.tencent.mm.plugin.sns.ui.SnsUIAction$2");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeCover", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public final void g(android.content.Context context) {
        int i17;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f167170i = context;
        this.f167184z = ca4.z0.l0(context) ? 1 : 2;
        this.A = com.tencent.mm.ui.bh.a(context).f197135a;
        ((ze4.f) i95.n0.c(ze4.f.class)).getClass();
        this.f167179u = bf4.f.f19715b.f();
        android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getHeaderLayoutRes", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        pc4.d dVar = pc4.d.f353410a;
        if (dVar.y()) {
            i17 = ca4.z0.l0(context) ? com.tencent.mm.R.layout.f489509ep2 : com.tencent.mm.R.layout.f489508ep1;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeaderLayoutRes", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getHeaderLayoutRes", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            i17 = com.tencent.mm.R.layout.f489507cs4;
        }
        android.view.View inflate = b17.inflate(i17, (android.view.ViewGroup) this, true);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) inflate.findViewById(com.tencent.mm.R.id.nb7);
        com.tencent.mm.plugin.sns.ui.dj djVar = new com.tencent.mm.plugin.sns.ui.dj(this);
        this.f167165d = djVar;
        djVar.f168186c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kbq);
        this.f167165d.f168184a = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a_4);
        this.f167165d.f168187d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kjp);
        this.f167165d.f168185b = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.mwr);
        com.tencent.mm.plugin.sns.ui.dj djVar2 = this.f167165d;
        djVar2.getClass();
        com.tencent.mm.plugin.sns.ui.dj djVar3 = this.f167165d;
        djVar3.getClass();
        this.f167165d.f168189f = (android.widget.RelativeLayout) inflate.findViewById(com.tencent.mm.R.id.n8w);
        this.f167165d.f168190g = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.n8x);
        this.f167165d.f168191h = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.n8y);
        com.tencent.mm.plugin.sns.ui.dj djVar4 = this.f167165d;
        djVar4.getClass();
        this.f167165d.f168192i = (com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout) inflate.findViewById(com.tencent.mm.R.id.n6n);
        if (dVar.y()) {
            this.f167165d.f168192i.setMode(this.f167184z);
            this.f167165d.f168192i.setFoldHeight((int) (this.A * (this.f167184z == 1 ? 0.9f : 0.45f)));
            com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout snsCoverContainerLayout = this.f167165d.f168192i;
            snsCoverContainerLayout.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsCoverContainerLayout", "reset: ");
            snsCoverContainerLayout.setHeight(snsCoverContainerLayout.f164009r);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.cover.preview.SnsCoverContainerLayout");
        }
        this.f167165d.f168193j = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.n6v);
        this.f167165d.f168196m = inflate.findViewById(com.tencent.mm.R.id.qko);
        inflate.findViewById(com.tencent.mm.R.id.n6v).setContentDescription(context.getString(com.tencent.mm.R.string.j9i));
        inflate.findViewById(com.tencent.mm.R.id.n6v).setOnClickListener(new com.tencent.mm.plugin.sns.ui.vi(this));
        this.f167165d.f168192i.setCoverClickListener(new com.tencent.mm.plugin.sns.ui.wi(this));
        this.f167165d.f168192i.setOnViewSizeChanged(new com.tencent.mm.plugin.sns.ui.xi(this));
        this.f167165d.f168194k = (android.view.ViewGroup) inflate.findViewById(com.tencent.mm.R.id.n7o);
        this.f167165d.f168195l = (com.tencent.mm.ui.widget.imageview.WeImageView) inflate.findViewById(com.tencent.mm.R.id.n7n);
        this.f167165d.f168194k.setOnClickListener(new com.tencent.mm.plugin.sns.ui.yi(this));
        android.view.animation.Animation animation = this.f167178t;
        animation.setDuration(1000L);
        animation.setRepeatCount(-1);
        animation.setInterpolator(new android.view.animation.LinearInterpolator());
        if (!bi4.v1.g()) {
            com.tencent.mm.plugin.sns.ui.dj djVar5 = this.f167165d;
            ((ye4.e) ((ze4.f) i95.n0.c(ze4.f.class))).getClass();
            e51.f fVar = ef4.j0.f252452a;
            djVar5.getClass();
            this.f167165d.f168188e = new com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView(context, null);
            if (this.f167179u) {
                this.f167165d.getClass();
            } else {
                frameLayout.addView(this.f167165d.f168188e);
                this.f167165d.f168188e.setSessionId(this.f167176r);
                this.f167165d.f168188e.setEnterObjectId(this.f167177s);
            }
        }
        android.widget.TextView textView = this.f167165d.f168186c;
        android.view.View.OnClickListener onClickListener = this.B;
        textView.setOnClickListener(onClickListener);
        this.f167165d.f168184a.setOnClickListener(onClickListener);
        if (((android.app.Activity) context).getIntent().getBooleanExtra("sns_timeline_NeedShowChangeAlbumDialog", false)) {
            postDelayed(new com.tencent.mm.plugin.sns.ui.zi(this), 150L);
        }
        getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.sns.ui.aj(this));
        getViewTreeObserver().addOnGlobalLayoutListener(new com.tencent.mm.plugin.sns.ui.qi(this, context));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public android.view.View getFinderSnsRecyclerView() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getFinderSnsRecyclerView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.dj djVar = this.f167165d;
        if (djVar != null) {
            djVar.getClass();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getFinderSnsRecyclerView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return null;
    }

    public int getLoadingGroupHeight() {
        android.widget.LinearLayout linearLayout;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getLoadingGroupHeight", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.dj djVar = this.f167165d;
        int height = (djVar == null || (linearLayout = djVar.f168190g) == null) ? 0 : linearLayout.getHeight() + com.tencent.mm.ui.zk.a(getContext(), 32);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getLoadingGroupHeight", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return height;
    }

    public com.tencent.mm.plugin.sns.ui.dj getViewHeader() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getViewHeader", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.dj djVar = this.f167165d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getViewHeader", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return djVar;
    }

    public final boolean h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isCoverShowLike", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        boolean z17 = (this.f167173o || this.f167175q || this.f167168g.getType() == 5 || !c01.e2.J(this.f167167f)) ? false : true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isCoverShowLike", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return z17;
    }

    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("refreshAvatar", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.dj djVar = this.f167165d;
        if (djVar == null || djVar.f168184a == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshAvatar", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            return;
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(this.f167165d.f168184a, this.f167167f, pc4.d.f353410a.l());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("refreshAvatar", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void j(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        if (str == null || str2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsHeader", "userName or selfName is null ");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            return;
        }
        this.f167167f = str.trim();
        this.f167172n = str2.equals(str);
        this.f167165d.f168192i.setPreview(this.f167183y.booleanValue());
        this.f167165d.f168192i.c(this.f167172n, str);
        i();
        if (str.length() > 0) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            java.lang.String v07 = (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(n17.g2())) ? ca4.z0.v0(str3) : n17.g2();
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = this.f167170i;
            ((ke0.e) xVar).getClass();
            android.text.SpannableString i17 = com.tencent.mm.pluginsdk.ui.span.c0.i(context, v07);
            xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
            this.f167165d.f168186c.setText(((we0.j1) l0Var).Ai(this.f167165d.f168186c, str, i17, bi4.c.SNS_TIMELINE_NICK, (int) (r2.getTextSize() * 1.15d)));
            android.widget.TextView textView = this.f167165d.f168185b;
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = this.f167170i;
            float textSize = this.f167165d.f168185b.getTextSize();
            ((ke0.e) xVar2).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str4, textSize));
            boolean m47 = com.tencent.mm.storage.z3.m4(str);
            this.f167174p = m47;
            if (m47) {
                this.f167165d.f168187d.setVisibility(0);
                this.f167165d.f168187d.setText(t41.g.a(n17));
            } else {
                this.f167165d.f168187d.setVisibility(8);
            }
            this.f167173o = false;
            com.tencent.mm.plugin.sns.storage.d2 J0 = com.tencent.mm.plugin.sns.model.l4.Ej().J0(str);
            if (this.f167174p && (com.tencent.mm.sdk.platformtools.t8.K0(J0.field_bgUrl) || com.tencent.mm.sdk.platformtools.t8.K0(J0.field_imBGmd5sum) || com.tencent.mm.sdk.platformtools.t8.K0(J0.field_imBGfileid))) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SnsHeader", "openim bg error, do not show like btn");
                this.f167173o = true;
            }
        }
        com.tencent.mm.plugin.sns.ui.dj djVar = this.f167165d;
        djVar.f168184a.setContentDescription(this.f167170i.getString(com.tencent.mm.R.string.j9d, djVar.f168186c.getText()));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public final void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("updateLikeInfo", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsHeader", "updateLikeInfo: ");
        com.tencent.mm.plugin.sns.storage.x1 x1Var = this.f167168g;
        if (x1Var == null || !x1Var.field_isLike) {
            this.f167165d.f168195l.setImageResource(com.tencent.mm.R.raw.icons_outlined_like);
            this.f167165d.f168195l.setIconColor(this.f167170i.getResources().getColor(com.tencent.mm.R.color.f478553an));
        } else {
            this.f167165d.f168195l.setImageResource(com.tencent.mm.R.raw.icons_filled_like);
            this.f167165d.f168195l.setIconColor(this.f167170i.getResources().getColor(com.tencent.mm.R.color.f478532ac));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("updateLikeInfo", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        if (!this.f167165d.f168192i.getStatus().f434167a) {
            this.f167165d.f168192i.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCoverPreClose", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            android.view.View view = this.f167182x;
            if (view != null) {
                view.animate().translationY(0.0f).start();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCoverPreClose", "com.tencent.mm.plugin.sns.ui.SnsHeader");
            this.f167165d.f168192i.a();
        }
        boolean onKeyDown = super.onKeyDown(i17, keyEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onKeyDown", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        return onKeyDown;
    }

    public void setActionBarView(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setActionBarView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f167182x = view;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setActionBarView", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setAvatarOnClickListener(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setAvatarOnClickListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.dj djVar = this.f167165d;
        if (djVar != null && (imageView = djVar.f168184a) != null) {
            imageView.setOnClickListener(onClickListener);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setAvatarOnClickListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setBackClickListener(com.tencent.mm.plugin.sns.ui.bj bjVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setBackClickListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f167166e = bjVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setBackClickListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setEnterObjectId(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView snsStoryHeaderView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f167177s = str;
        com.tencent.mm.plugin.sns.ui.dj djVar = this.f167165d;
        if (djVar != null && (snsStoryHeaderView = djVar.f168188e) != null && !this.f167179u) {
            snsStoryHeaderView.setEnterObjectId(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnterObjectId", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setHeadBgListener(com.tencent.mm.plugin.sns.ui.cj cjVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setHeadBgListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setHeadBgListener", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setIsCoverPreview(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setIsCoverPreview", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f167183y = java.lang.Boolean.valueOf(z17);
        this.f167165d.f168192i.setPreview(z17);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setIsCoverPreview", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setSessionId(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView snsStoryHeaderView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        this.f167176r = str;
        com.tencent.mm.plugin.sns.ui.dj djVar = this.f167165d;
        if (djVar != null && (snsStoryHeaderView = djVar.f168188e) != null && !this.f167179u) {
            snsStoryHeaderView.setSessionId(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSessionId", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public void setStoryAction(yd4.c cVar) {
        com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView snsStoryHeaderView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setStoryAction", "com.tencent.mm.plugin.sns.ui.SnsHeader");
        com.tencent.mm.plugin.sns.ui.dj djVar = this.f167165d;
        if (djVar != null && (snsStoryHeaderView = djVar.f168188e) != null && !this.f167179u) {
            snsStoryHeaderView.setStoryAction(cVar);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setStoryAction", "com.tencent.mm.plugin.sns.ui.SnsHeader");
    }

    public SnsHeader(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f167169h = 0L;
        this.f167172n = false;
        this.f167173o = false;
        this.f167174p = false;
        this.f167175q = true;
        new java.util.HashMap();
        this.f167178t = new android.view.animation.RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f167179u = false;
        this.f167183y = java.lang.Boolean.FALSE;
        this.B = new com.tencent.mm.plugin.sns.ui.ti(this);
        g(context);
    }
}
