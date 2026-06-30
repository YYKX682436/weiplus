package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class s1 implements zy2.yb {
    public int A;
    public boolean B;
    public java.lang.String C;
    public boolean D;
    public final jz5.g E;
    public final jz5.g F;
    public java.lang.String G;
    public java.lang.String H;
    public yz5.a I;

    /* renamed from: J, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.profile.widget.l1 f124716J;

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f124717a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f124718b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.qt2 f124719c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f124720d;

    /* renamed from: e, reason: collision with root package name */
    public final kk.l f124721e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f124722f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f124723g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f124724h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f124725i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView f124726j;

    /* renamed from: k, reason: collision with root package name */
    public final android.widget.TextView f124727k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.notice.NoticeStatusView f124728l;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f124729m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f124730n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.LinearLayout f124731o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f124732p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f124733q;

    /* renamed from: r, reason: collision with root package name */
    public final android.view.View f124734r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f124735s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f124736t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f124737u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView f124738v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.RelativeLayout f124739w;

    /* renamed from: x, reason: collision with root package name */
    public final android.view.View f124740x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.TextView f124741y;

    /* renamed from: z, reason: collision with root package name */
    public int f124742z;

    public s1(android.view.View header, androidx.appcompat.app.AppCompatActivity activity, r45.qt2 contextObj, boolean z17, kk.l userExtInfoCache, java.lang.String commentScene, java.lang.String fromQrcode) {
        kotlin.jvm.internal.o.g(header, "header");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        kotlin.jvm.internal.o.g(userExtInfoCache, "userExtInfoCache");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        kotlin.jvm.internal.o.g(fromQrcode, "fromQrcode");
        this.f124717a = header;
        this.f124718b = activity;
        this.f124719c = contextObj;
        this.f124720d = z17;
        this.f124721e = userExtInfoCache;
        this.f124722f = commentScene;
        this.f124723g = fromQrcode;
        android.view.View findViewById = header.findViewById(com.tencent.mm.R.id.f484746fe4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f124725i = (androidx.constraintlayout.widget.ConstraintLayout) findViewById;
        android.view.View findViewById2 = header.findViewById(com.tencent.mm.R.id.p1j);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = header.findViewById(com.tencent.mm.R.id.f484742fe0);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f124726j = (com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView) findViewById3;
        android.view.View findViewById4 = header.findViewById(com.tencent.mm.R.id.feo);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f124727k = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = header.findViewById(com.tencent.mm.R.id.feg);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f124728l = (com.tencent.mm.plugin.finder.view.notice.NoticeStatusView) findViewById5;
        android.view.View findViewById6 = header.findViewById(com.tencent.mm.R.id.ffe);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f124729m = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById6;
        android.view.View findViewById7 = header.findViewById(com.tencent.mm.R.id.fdt);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f124730n = (android.widget.TextView) findViewById7;
        android.view.View findViewById8 = header.findViewById(com.tencent.mm.R.id.l_a);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f124731o = (android.widget.LinearLayout) findViewById8;
        android.view.View findViewById9 = header.findViewById(com.tencent.mm.R.id.kfn);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f124732p = findViewById9;
        this.f124733q = header.findViewById(com.tencent.mm.R.id.kfb);
        this.f124734r = header.findViewById(com.tencent.mm.R.id.f484747tn0);
        this.f124735s = header.findViewById(com.tencent.mm.R.id.ulc);
        this.f124736t = (android.widget.TextView) header.findViewById(com.tencent.mm.R.id.ulb);
        this.f124737u = (android.widget.TextView) header.findViewById(com.tencent.mm.R.id.toz);
        android.view.View findViewById10 = header.findViewById(com.tencent.mm.R.id.ew7);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f124738v = (com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView) findViewById10;
        android.view.View findViewById11 = header.findViewById(com.tencent.mm.R.id.fe6);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f124739w = (android.widget.RelativeLayout) findViewById11;
        android.view.View findViewById12 = header.findViewById(com.tencent.mm.R.id.kfh);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f124740x = findViewById12;
        android.view.View findViewById13 = header.findViewById(com.tencent.mm.R.id.fe7);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f124741y = (android.widget.TextView) findViewById13;
        this.f124742z = -1;
        this.A = -1;
        this.C = "";
        this.E = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.m0(this));
        this.F = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.l0(this));
        this.G = "";
        this.H = "";
        this.f124716J = new com.tencent.mm.plugin.finder.profile.widget.l1(this);
    }

    public static final void g(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, r45.h32 h32Var, r45.h32 h32Var2, int i17) {
        s1Var.f124742z = h32Var2.getInteger(1);
        i95.m c17 = i95.n0.c(c61.zb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.zb zbVar = (c61.zb) c17;
        java.lang.String string = h32Var2.getString(4);
        kotlin.jvm.internal.o.d(string);
        androidx.appcompat.app.AppCompatActivity activity = s1Var.f124718b;
        kotlin.jvm.internal.o.g(activity, "activity");
        gm0.j1.d().g(c61.zb.x3(zbVar, str, string, i17, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), activity.getIntent().getStringExtra("key_promotion_token"), java.lang.Integer.valueOf(str2 == null || str2.length() == 0 ? 0 : 901), null, null, str3, s1Var.f124723g, null, null, null, 7360, null));
        c61.zb zbVar2 = (c61.zb) i95.n0.c(c61.zb.class);
        java.lang.String string2 = h32Var2.getString(4);
        if (string2 == null) {
            string2 = "";
        }
        if (((b92.d1) zbVar2).bj(str, string2) == null) {
            c61.zb zbVar3 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String string3 = h32Var2.getString(4);
            ((b92.d1) zbVar3).Ai(str, string3 != null ? string3 : "", h32Var2);
        } else {
            c61.zb zbVar4 = (c61.zb) i95.n0.c(c61.zb.class);
            java.lang.String string4 = h32Var2.getString(4);
            r45.h32 bj6 = ((b92.d1) zbVar4).bj(str, string4 != null ? string4 : "");
            if (bj6 != null) {
                bj6.set(1, java.lang.Integer.valueOf(h32Var2.getInteger(1)));
            }
        }
        kotlin.jvm.internal.o.g(activity, "activity");
        ((te2.e4) ((zy2.g8) pf5.z.f353948a.a(activity).c(zy2.g8.class))).f417974d.M0(str);
        i(s1Var, str, h32Var);
        h(s1Var, h32Var2, i17);
    }

    public static final void h(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, r45.h32 h32Var, int i17) {
        if (s1Var.e() != 0) {
            com.tencent.mm.plugin.finder.report.l0 l0Var = com.tencent.mm.plugin.finder.report.l0.f125109a;
            r45.qt2 qt2Var = s1Var.f124719c;
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(s1Var.e());
            int i18 = i17 == 1 ? 83 : 84;
            java.lang.String string = h32Var.getString(4);
            if (string == null) {
                string = "";
            }
            com.tencent.mm.plugin.finder.report.l0.e(l0Var, qt2Var, h17, i18, string, 0, 16, null);
        }
    }

    public static final void i(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, java.lang.String str, r45.h32 h32Var) {
        boolean z17 = s1Var.f124720d;
        com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView = s1Var.f124728l;
        if (z17) {
            noticeStatusView.setGoToMemberStyle(tx2.l0.f422607e);
            noticeStatusView.setSetInterceptGoToMemberAgent(new com.tencent.mm.plugin.finder.profile.widget.a1(s1Var, str, h32Var));
        } else {
            noticeStatusView.setGoToMemberStyle(tx2.l0.f422606d);
            noticeStatusView.setSetInterceptGoToMemberAgent(null);
        }
        com.tencent.mm.plugin.finder.view.notice.NoticeStatusView.g(s1Var.f124728l, str, false, new com.tencent.mm.plugin.finder.profile.widget.b1(h32Var), 2, null);
    }

    public static final void m(kotlin.jvm.internal.c0 c0Var, java.lang.String str, com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, boolean z17, boolean z18) {
        int i17 = !c0Var.f310112d ? 1 : 2;
        com.tencent.mars.xlog.Log.i("Finder.HeaderLiveWidget", "CgiFinderAudienceReserveLiveNotification do op=" + i17);
        az2.j Ni = ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).Ni(str, 2, i17, null, 10, 0L);
        androidx.appcompat.app.AppCompatActivity appCompatActivity = s1Var.f124718b;
        Ni.t(appCompatActivity, appCompatActivity.getResources().getString(com.tencent.mm.R.string.f9y), 500L);
        Ni.l().K(new com.tencent.mm.plugin.finder.profile.widget.p1(s1Var, str, i17, z17, z18));
    }

    public final r45.h32 b(r45.h32 h32Var) {
        if (this.A != -1 && this.f124742z != -1) {
            boolean z17 = false;
            if (h32Var != null && h32Var.getInteger(1) == this.A) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.i("Finder.HeaderLiveWidget", "[checkLiveNoticeInfo] notice action change before sceneEnd");
                h32Var.set(1, java.lang.Integer.valueOf(this.f124742z));
            }
        }
        return h32Var;
    }

    public final void c() {
        yz5.a aVar = this.I;
        if (aVar != null) {
            aVar.invoke();
        }
        this.I = null;
    }

    public final int d() {
        return ((java.lang.Number) ((jz5.n) this.F).getValue()).intValue();
    }

    public final long e() {
        return ((java.lang.Number) ((jz5.n) this.E).getValue()).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0829, code lost:
    
        if (((r4 == null || (r4 = r4.B) == null || (r4 = (r45.fw4) r4.getCustom(1)) == null || !r4.getBoolean(0)) ? false : true) != false) goto L235;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x07fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x07e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x091c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x093d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x094d  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v27 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r4v132 */
    /* JADX WARN: Type inference failed for: r4v134 */
    /* JADX WARN: Type inference failed for: r4v137 */
    /* JADX WARN: Type inference failed for: r4v138 */
    /* JADX WARN: Type inference failed for: r4v140 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.lang.String r43, java.lang.String r44, boolean r45, boolean r46, boolean r47, ya2.b2 r48, java.lang.String r49, java.lang.String r50) {
        /*
            Method dump skipped, instructions count: 2538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.widget.s1.f(java.lang.String, java.lang.String, boolean, boolean, boolean, ya2.b2, java.lang.String, java.lang.String):void");
    }

    public final void j(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) this.f124721e.get(userName);
        r45.h32 h32Var = l2Var != null ? l2Var.f123916e : null;
        if (h32Var != null) {
            java.lang.String string = h32Var.getString(4);
            if (string == null || string.length() == 0) {
                return;
            }
            this.f124725i.setVisibility(8);
            android.view.View view = this.f124732p;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget", "hideNoticeView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget", "hideNoticeView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.RelativeLayout relativeLayout = this.f124739w;
            relativeLayout.setVisibility(0);
            android.view.View view2 = this.f124733q;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget", "hideNoticeView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget", "hideNoticeView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view3 = this.f124732p;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget", "hideNoticeView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget", "hideNoticeView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f124734r;
            if (view4 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget", "hideNoticeView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget", "hideNoticeView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View view5 = this.f124735s;
            if (view5 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget", "hideNoticeView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/finder/profile/widget/HeaderLiveWidget", "hideNoticeView", "(Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            relativeLayout.setOnClickListener(new com.tencent.mm.plugin.finder.profile.widget.d1(this));
            android.widget.TextView textView = this.f124741y;
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMargins(textView.getContext().getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479731dn), layoutParams2.topMargin, layoutParams2.rightMargin, layoutParams2.bottomMargin);
                textView.setLayoutParams(layoutParams2);
            }
        }
    }

    public void k(java.lang.String username) {
        r45.h32 h32Var;
        kotlin.jvm.internal.o.g(username, "username");
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) this.f124721e.get(username);
        if (l2Var != null && (h32Var = l2Var.f123916e) != null) {
            this.A = h32Var.getInteger(1);
        }
        ym5.a1.h(this.f124725i, new com.tencent.mm.plugin.finder.profile.widget.e1(this, username));
    }

    public final void l(java.lang.String str, r45.h32 h32Var, boolean z17) {
        com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView.a(this.f124738v, h32Var, z17, false, false, 12, null);
    }

    public final void n(java.lang.String str, boolean z17, boolean z18) {
        r45.fw4 fw4Var;
        r45.fw4 fw4Var2;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) this.f124721e.get(str);
        r45.c32 c32Var = l2Var != null ? l2Var.B : null;
        java.lang.String string = (c32Var == null || (fw4Var2 = (r45.fw4) c32Var.getCustom(1)) == null) ? null : fw4Var2.getString(1);
        if (z17 && z18) {
            string = this.f124718b.getResources().getString(com.tencent.mm.R.string.o0i, c32Var != null ? java.lang.Integer.valueOf(c32Var.getInteger(0)) : null);
        }
        android.widget.TextView textView = this.f124736t;
        if (textView != null) {
            textView.setText(string);
        }
        com.tencent.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        android.widget.TextView textView2 = this.f124737u;
        if (textView2 != null) {
            com.tencent.mm.ui.fk.a(textView2);
        }
        if (textView2 != null) {
            textView2.setVisibility((z17 && z18) ? 8 : 0);
        }
        if ((c32Var == null || (fw4Var = (r45.fw4) c32Var.getCustom(1)) == null || !fw4Var.getBoolean(2)) ? false : true) {
            if (textView2 != null) {
                textView2.setText(com.tencent.mm.R.string.nkl);
            }
        } else if (textView2 != null) {
            textView2.setText(com.tencent.mm.R.string.nkj);
        }
    }

    public /* synthetic */ s1(android.view.View view, androidx.appcompat.app.AppCompatActivity appCompatActivity, r45.qt2 qt2Var, boolean z17, kk.l lVar, java.lang.String str, java.lang.String str2, int i17, kotlin.jvm.internal.i iVar) {
        this(view, appCompatActivity, qt2Var, z17, lVar, str, (i17 & 64) != 0 ? "" : str2);
    }
}
