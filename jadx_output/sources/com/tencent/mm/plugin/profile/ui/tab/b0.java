package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class b0 implements com.tencent.mm.plugin.profile.ui.tab.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f154232a;

    /* renamed from: b, reason: collision with root package name */
    public r45.wl f154233b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f154234c;

    /* renamed from: d, reason: collision with root package name */
    public final long f154235d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f154236e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f154237f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f154238g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.profile.ui.tab.view.ProfileLiveNotifyTextLayout f154239h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f154240i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f154241j;

    /* renamed from: k, reason: collision with root package name */
    public final android.view.View f154242k;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View f154243l;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f154244m;

    /* renamed from: n, reason: collision with root package name */
    public r45.mk f154245n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f154246o;

    /* renamed from: p, reason: collision with root package name */
    public zy2.ic f154247p;

    /* renamed from: q, reason: collision with root package name */
    public final int f154248q;

    public b0(com.tencent.mm.ui.MMActivity activity, r45.wl profileInfo, android.view.View rootView, long j17, sr3.g config) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(profileInfo, "profileInfo");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(config, "config");
        this.f154232a = activity;
        this.f154233b = profileInfo;
        this.f154234c = rootView;
        this.f154235d = j17;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.cc8);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f154236e = findViewById;
        android.view.View findViewById2 = findViewById.findViewById(com.tencent.mm.R.id.caa);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f154237f = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById.findViewById(com.tencent.mm.R.id.ca9);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f154238g = findViewById3;
        android.view.View findViewById4 = findViewById.findViewById(com.tencent.mm.R.id.ca_);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f154239h = (com.tencent.mm.plugin.profile.ui.tab.view.ProfileLiveNotifyTextLayout) findViewById4;
        android.view.View findViewById5 = findViewById.findViewById(com.tencent.mm.R.id.caf);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f154240i = findViewById5;
        android.view.View findViewById6 = findViewById.findViewById(com.tencent.mm.R.id.cae);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f154241j = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById.findViewById(com.tencent.mm.R.id.cad);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f154242k = findViewById7;
        android.view.View findViewById8 = findViewById.findViewById(com.tencent.mm.R.id.cac);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f154243l = findViewById8;
        androidx.appcompat.app.AppCompatActivity context = activity.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f154244m = context;
        if (this.f154233b.f389247u.size() > 0) {
            this.f154245n = (r45.mk) this.f154233b.f389247u.getFirst();
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "init liveNoticeInfo ok!");
        }
        this.f154248q = config.g() == sr3.a.f411829e ? 0 : 5;
    }

    public static final void d(com.tencent.mm.plugin.profile.ui.tab.b0 b0Var, boolean z17) {
        if (b0Var.a()) {
            java.lang.String b17 = x51.j1.b(b0Var.f154233b.f389245s.f370126d);
            android.content.Context context = b0Var.f154244m;
            b0Var.f154246o = com.tencent.mm.ui.widget.dialog.u3.f(context, context.getString(com.tencent.mm.R.string.f490604zq), true, 3, null);
            int i17 = z17 ? 1 : 2;
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "try to send cgi, sendCgiType = " + i17);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            kotlin.jvm.internal.o.d(b17);
            r45.mk mkVar = b0Var.f154245n;
            kotlin.jvm.internal.o.d(mkVar);
            java.lang.String notice_id = mkVar.f380599g;
            kotlin.jvm.internal.o.f(notice_id, "notice_id");
            ((com.tencent.mm.feature.finder.live.v4) w0Var).mj(b17, notice_id, i17, null, 1).l().K(new com.tencent.mm.plugin.profile.ui.tab.u(b0Var, z17, b17));
        }
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.a
    public boolean a() {
        r45.mk mkVar = this.f154245n;
        if (mkVar == null) {
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "liveInfo == null");
            return false;
        }
        kotlin.jvm.internal.o.d(mkVar);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(mkVar.f380599g)) {
            r45.mk mkVar2 = this.f154245n;
            kotlin.jvm.internal.o.d(mkVar2);
            if (mkVar2.f380596d != 0) {
                if (this.f154233b.f389245s.f370126d.f192156a.length != 0) {
                    return true;
                }
                com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "finder username is empty");
                return false;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        r45.mk mkVar3 = this.f154245n;
        kotlin.jvm.internal.o.d(mkVar3);
        objArr[0] = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(mkVar3.f380599g));
        r45.mk mkVar4 = this.f154245n;
        kotlin.jvm.internal.o.d(mkVar4);
        objArr[1] = java.lang.Boolean.valueOf(mkVar4.f380596d == 0);
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "notice_id is empty? %s, start_time == 0? %s", objArr);
        return false;
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.a
    public void b(r45.wl wlVar) {
        if (wlVar == null) {
            this.f154245n = null;
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "update: profileInfo empty!");
            return;
        }
        this.f154233b = wlVar;
        java.util.LinkedList<r45.mk> LiveInfo = wlVar.f389247u;
        if (LiveInfo.size() <= 0) {
            this.f154245n = null;
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "update: liveNoticeInfo empty!");
            return;
        }
        this.f154245n = (r45.mk) LiveInfo.getFirst();
        java.lang.String b17 = x51.j1.b(wlVar.f389245s.f370126d);
        kotlin.jvm.internal.o.f(LiveInfo, "LiveInfo");
        for (r45.mk mkVar : LiveInfo) {
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            kotlin.jvm.internal.o.d(b17);
            java.lang.String notice_id = mkVar.f380599g;
            kotlin.jvm.internal.o.f(notice_id, "notice_id");
            ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
            r45.h32 bj6 = ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).bj(b17, notice_id);
            if (bj6 == null) {
                bj6 = new r45.h32();
            }
            bj6.set(0, java.lang.Integer.valueOf(mkVar.f380596d));
            bj6.set(1, java.lang.Integer.valueOf(mkVar.f380597e));
            bj6.set(3, mkVar.f380598f);
            bj6.set(4, mkVar.f380599g);
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "local cache status has been set " + bj6.getInteger(1) + '!');
            com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
            java.lang.String notice_id2 = mkVar.f380599g;
            kotlin.jvm.internal.o.f(notice_id2, "notice_id");
            i1Var.a(b17, notice_id2, bj6);
        }
    }

    @Override // com.tencent.mm.plugin.profile.ui.tab.a
    public void c() {
        if (!a()) {
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "check fail!");
            android.view.View view = this.f154236e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f154236e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "setupLiveNotifyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f154234c;
        if (view3.getTag(com.tencent.mm.R.id.f483392ak0) == null) {
            view3.setTag(com.tencent.mm.R.id.f483392ak0, java.lang.Boolean.TRUE);
            java.lang.String UserName = this.f154233b.f389233d.f383065d;
            kotlin.jvm.internal.o.f(UserName, "UserName");
            gr3.e.d(UserName, 1701, this.f154235d, this.f154232a.getIntent(), this.f154248q, 0, 0, null, null, null, 0, 0, 4064, null);
        }
        r45.mk mkVar = this.f154245n;
        android.view.View view4 = this.f154240i;
        if (mkVar != null) {
            java.lang.String b17 = x51.j1.b(this.f154233b.f389245s.f370126d);
            kotlin.jvm.internal.o.d(b17);
            boolean z17 = this.f154242k.getVisibility() == 0;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view4, "live_reserve_gzh_profile");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view4, 8, 25653);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view4, 32, 25652);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            java.util.Map k17 = kz5.c1.k(new jz5.l("finder_username", b17), new jz5.l("live_notice_id", mkVar.f380599g), new jz5.l("show_type", 0));
            ((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).getClass();
            ((cy1.a) rVar).gk(view4, kz5.c1.m(k17, vd2.m3.f435809a.a()));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(view4, new com.tencent.mm.plugin.profile.ui.tab.a0(z17));
        }
        android.view.View view5 = this.f154236e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "initDisplayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "initDisplayView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView = this.f154237f;
        android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
        if (paint != null) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        android.widget.TextView textView2 = this.f154241j;
        android.text.TextPaint paint3 = textView2 != null ? textView2.getPaint() : null;
        if (paint3 != null) {
            paint3.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        android.text.TextPaint paint4 = textView2 != null ? textView2.getPaint() : null;
        if (paint4 != null) {
            paint4.setStrokeWidth(0.8f);
        }
        kotlin.jvm.internal.o.d(this.f154245n);
        long j17 = r11.f380596d * 1000;
        i95.m c17 = i95.n0.c(vd2.i5.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String r17 = zl2.q4.r(zl2.q4.f473933a, j17, java.lang.Boolean.FALSE, true, false, 8, null);
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "noticeTimeStr = " + r17);
        textView.setText(this.f154244m.getResources().getString(com.tencent.mm.R.string.csf, r17));
        r45.mk mkVar2 = this.f154245n;
        kotlin.jvm.internal.o.d(mkVar2);
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(mkVar2.f380598f);
        com.tencent.mm.plugin.profile.ui.tab.view.ProfileLiveNotifyTextLayout profileLiveNotifyTextLayout = this.f154239h;
        if (K0) {
            profileLiveNotifyTextLayout.setVisibility(8);
            androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
            android.view.View view6 = this.f154238g;
            kotlin.jvm.internal.o.e(view6, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) view6;
            cVar.d(constraintLayout);
            cVar.e(com.tencent.mm.R.id.ca_, 4, 0, 4);
            cVar.b(constraintLayout);
            constraintLayout.setConstraintSet(null);
        } else {
            r45.mk mkVar3 = this.f154245n;
            kotlin.jvm.internal.o.d(mkVar3);
            java.lang.String introduction = mkVar3.f380598f;
            kotlin.jvm.internal.o.f(introduction, "introduction");
            profileLiveNotifyTextLayout.getClass();
            com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = profileLiveNotifyTextLayout.f154669f;
            mMNeat7extView.b(introduction);
            profileLiveNotifyTextLayout.f154670g.b(introduction);
            int i17 = ((com.tencent.neattextview.textview.layout.NeatLayout) mMNeat7extView.i(i65.a.B(profileLiveNotifyTextLayout.getContext()) - i65.a.b(profileLiveNotifyTextLayout.getContext(), com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS), Integer.MAX_VALUE)).L;
            android.view.View view7 = profileLiveNotifyTextLayout.f154667d;
            if (i17 <= 1) {
                profileLiveNotifyTextLayout.b(view7, mMNeat7extView);
            } else {
                profileLiveNotifyTextLayout.b(view7, mMNeat7extView, profileLiveNotifyTextLayout.f154671h);
            }
        }
        com.tencent.mm.ui.tools.d8.b(view4, 0.5f);
        java.lang.String b18 = x51.j1.b(this.f154233b.f389245s.f370126d);
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
        kotlin.jvm.internal.o.d(b18);
        r45.mk mkVar4 = this.f154245n;
        java.lang.String str = mkVar4 != null ? mkVar4.f380599g : null;
        if (str == null) {
            str = "";
        }
        r45.h32 e17 = i1Var.e(b18, str);
        c0Var.f310112d = e17 != null && e17.getInteger(1) == 0;
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "init btn, status = " + c0Var.f310112d);
        e(c0Var.f310112d);
        view4.setOnClickListener(new com.tencent.mm.plugin.profile.ui.tab.z(c0Var, this));
        java.util.LinkedList linkedList = this.f154233b.f389247u;
        if (linkedList == null || linkedList.size() <= 1) {
            android.view.View view8 = this.f154243l;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view8, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "initMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "initMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogic", "no more notice!");
            return;
        }
        android.view.View view9 = this.f154243l;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view9, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "initMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view9.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view9, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "initMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String b19 = x51.j1.b(this.f154233b.f389245s.f370126d);
        vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
        com.tencent.mm.ui.MMActivity mMActivity = this.f154232a;
        r45.qt2 qt2Var = new r45.qt2();
        kotlin.jvm.internal.o.d(b19);
        this.f154247p = ((c61.i8) i5Var).Ri(b19, mMActivity, false, qt2Var, 102);
        this.f154243l.setOnClickListener(new com.tencent.mm.plugin.profile.ui.tab.v(this, b19));
        zy2.ic icVar = this.f154247p;
        kotlin.jvm.internal.o.d(icVar);
        ((com.tencent.mm.plugin.finder.profile.widget.s4) icVar).f124770x = new com.tencent.mm.plugin.profile.ui.tab.w(this, b19);
    }

    public final void e(boolean z17) {
        java.lang.String string;
        android.content.Context context = this.f154244m;
        if (z17) {
            string = context.getResources().getString(com.tencent.mm.R.string.cs7);
            kotlin.jvm.internal.o.d(string);
        } else {
            string = context.getResources().getString(com.tencent.mm.R.string.cs6);
            kotlin.jvm.internal.o.d(string);
        }
        this.f154241j.setText(string);
        android.view.View view = this.f154242k;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "refreshNoticeBtnStatue", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/tab/ContactBizHeaderLiveNoticeLogic", "refreshNoticeBtnStatue", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
