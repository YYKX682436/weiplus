package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class LiveTalkRoomTipsBar extends android.widget.LinearLayout {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f196869v = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.RelativeLayout f196870d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.RelativeLayout f196871e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.RelativeLayout f196872f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f196873g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ListView f196874h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f196875i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f196876m;

    /* renamed from: n, reason: collision with root package name */
    public yb5.d f196877n;

    /* renamed from: o, reason: collision with root package name */
    public final android.content.Context f196878o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f196879p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f196880q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f196881r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f196882s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f196883t;

    /* renamed from: u, reason: collision with root package name */
    public m40.m0 f196884u;

    public LiveTalkRoomTipsBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f196878o = context;
        a();
    }

    public static void b(oo0.a aVar, android.content.Context context) {
        en0.g gVar = new en0.g();
        ((w80.i) i95.n0.c(w80.i.class)).getClass();
        ((w80.i) i95.n0.c(w80.i.class)).getClass();
        if (iq.b.g(context) || iq.b.C(context) || iq.b.v(context) || iq.b.e(context)) {
            return;
        }
        gVar.f255246a = !((oo0.d) aVar).field_isSender ? 1 : 0;
        oo0.d dVar = (oo0.d) aVar;
        gVar.f255250e = dVar.field_thumbUrl;
        gVar.f255247b = dVar.field_hostRoomId;
        gVar.f255248c = dVar.field_liveId;
        gVar.f255249d = dVar.field_liveName;
        gVar.f255253h = 1;
        gVar.f255251f = dVar.field_anchorUsername;
        gVar.a();
        if (dVar.field_isSender) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveVisitorIDKeyStat", "markVisitorClickTipbarEnterLive");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1381L, 1L, 1L);
    }

    public final void a() {
        android.view.View.inflate(getContext(), com.tencent.mm.R.layout.brn, this);
        this.f196870d = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.ifj);
        this.f196872f = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.ifh);
        this.f196879p = findViewById(com.tencent.mm.R.id.aun);
        this.f196880q = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.a4f);
        this.f196881r = findViewById(com.tencent.mm.R.id.ifg);
        this.f196871e = (android.widget.RelativeLayout) findViewById(com.tencent.mm.R.id.ifq);
        this.f196874h = (android.widget.ListView) findViewById(com.tencent.mm.R.id.ifl);
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f196878o).inflate(com.tencent.mm.R.layout.bro, (android.view.ViewGroup) null);
        this.f196875i = inflate;
        this.f196874h.addFooterView(inflate);
        this.f196873g = findViewById(com.tencent.mm.R.id.ifk);
        this.f196884u = (m40.m0) findViewById(com.tencent.mm.R.id.ifn);
        c(true, false);
        this.f196870d.setOnClickListener(new com.tencent.mm.ui.l9(this));
        this.f196872f.setVisibility(8);
        this.f196872f.setOnClickListener(new com.tencent.mm.ui.m9(this));
        this.f196873g.setOnClickListener(new com.tencent.mm.ui.n9(this));
    }

    public final void c(boolean z17, boolean z18) {
        com.tencent.mm.view.MMPAGView mMPAGView;
        com.tencent.mm.view.MMPAGView mMPAGView2;
        if (z17) {
            if (this.f196871e.getVisibility() == 0 && z18) {
                android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477858dg);
                loadAnimation.setAnimationListener(new com.tencent.mm.ui.o9(this));
                this.f196871e.startAnimation(loadAnimation);
            } else {
                this.f196871e.setVisibility(8);
                if (!this.f196882s) {
                    this.f196871e.setVisibility(8);
                    setVisibility(8);
                    setRootTipsBarBackground(false);
                    boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_bar_flashing, false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiveExptConfig", "ChatRoomBarFlashingSwitch: " + fj6);
                    if (fj6 && (mMPAGView2 = ((com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) this.f196884u).f131204i) != null) {
                        mMPAGView2.n();
                    }
                }
            }
            setRootTipsBarBackground(false);
            return;
        }
        if (this.f196871e.getVisibility() != 0) {
            this.f196871e.setVisibility(0);
            setRootTipsBarBackground(true);
            if (z18) {
                this.f196871e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477854dc));
                android.view.View view = this.f196876m;
                if (view != null) {
                    view.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), com.tencent.mm.R.anim.f477783bc));
                }
            }
        }
        if (!this.f196882s) {
            this.f196871e.setVisibility(8);
            setVisibility(8);
            setRootTipsBarBackground(false);
            boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_chat_room_live_bar_flashing, false);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiveExptConfig", "ChatRoomBarFlashingSwitch: " + fj7);
            if (fj7 && (mMPAGView = ((com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) this.f196884u).f131204i) != null) {
                mMPAGView.n();
            }
        }
        yb5.d dVar = this.f196877n;
        if (dVar != null) {
            dVar.y();
        }
    }

    public void setChattingContext(yb5.d dVar) {
        this.f196877n = dVar;
    }

    public void setChattingUserName(java.lang.String str) {
        this.f196883t = str;
    }

    public void setInChatRoom(boolean z17) {
        this.f196882s = z17;
    }

    public void setRootTipsBarBackground(android.view.View view) {
        this.f196876m = view;
    }

    public void setRootTipsBarBackground(boolean z17) {
        android.view.View view = this.f196876m;
        if (view != null) {
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f196876m.setOnClickListener(new com.tencent.mm.ui.p9(this));
                android.view.View view2 = this.f196879p;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f196880q;
                if (weImageView != null) {
                    weImageView.setVisibility(4);
                }
                android.view.View view3 = this.f196881r;
                if (view3 != null) {
                    view3.setBackgroundColor(0);
                    return;
                }
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f196879p;
            if (view4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/ui/LiveTalkRoomTipsBar", "setRootTipsBarBackground", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f196880q;
            if (weImageView2 != null) {
                weImageView2.setVisibility(0);
            }
            android.view.View view5 = this.f196881r;
            if (view5 != null) {
                view5.setBackgroundResource(com.tencent.mm.R.drawable.b7a);
            }
        }
    }

    public LiveTalkRoomTipsBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f196878o = context;
        a();
    }
}
