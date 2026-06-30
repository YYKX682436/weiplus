package sr2;

/* loaded from: classes10.dex */
public final class o1 extends com.tencent.mm.ui.component.UIComponent implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f411653d;

    /* renamed from: e, reason: collision with root package name */
    public aw2.n f411654e;

    /* renamed from: f, reason: collision with root package name */
    public aw2.a f411655f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f411656g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f411657h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f411658i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f411659m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f411660n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f411661o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411659m = "";
        this.f411659m = xy2.c.e(getActivity());
    }

    public static void O6(sr2.o1 o1Var, int i17, java.lang.Integer num, boolean z17, java.lang.String str, yz5.a aVar, boolean z18, yz5.l lVar, int i18, java.lang.Object obj) {
        android.view.View view;
        android.view.View view2 = null;
        java.lang.Integer num2 = (i18 & 2) != 0 ? null : num;
        java.lang.String str2 = (i18 & 8) != 0 ? null : str;
        boolean z19 = (i18 & 32) != 0 ? true : z18;
        yz5.l lVar2 = (i18 & 64) != 0 ? null : lVar;
        android.view.View view3 = o1Var.f411653d;
        android.view.View findViewById = view3 != null ? view3.findViewById(i17) : null;
        if (findViewById == null) {
            return;
        }
        if (num2 != null) {
            int intValue = num2.intValue();
            android.view.View view4 = o1Var.f411653d;
            if (view4 != null) {
                view2 = view4.findViewById(intValue);
            }
        }
        if (!z17) {
            android.view.View view5 = findViewById;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view5, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "checkExtendItemVisible", "(ILjava/lang/Integer;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "checkExtendItemVisible", "(ILjava/lang/Integer;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (view2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            android.view.View view6 = view2;
            yj0.a.d(view6, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "checkExtendItemVisible", "(ILjava/lang/Integer;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "checkExtendItemVisible", "(ILjava/lang/Integer;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        android.view.View view7 = findViewById;
        yj0.a.d(view7, arrayList3.toArray(), "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "checkExtendItemVisible", "(ILjava/lang/Integer;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view7, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "checkExtendItemVisible", "(ILjava/lang/Integer;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (view2 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            android.view.View view8 = view2;
            yj0.a.d(view8, arrayList4.toArray(), "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "checkExtendItemVisible", "(ILjava/lang/Integer;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "checkExtendItemVisible", "(ILjava/lang/Integer;ZLjava/lang/String;Lkotlin/jvm/functions/Function0;ZLkotlin/jvm/functions/Function1;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (str2 != null) {
            view = findViewById;
            com.tencent.mm.plugin.finder.report.d2.m(com.tencent.mm.plugin.finder.report.d2.f124994a, findViewById, str2, 0, 0, null, null, 60, null);
        } else {
            view = findViewById;
        }
        if (lVar2 != null) {
            lVar2.invoke(view);
        }
        view.setOnClickListener(new sr2.c1(aVar, z19, o1Var));
    }

    public final void P6() {
        O6(this, com.tencent.mm.R.id.m6a, null, mv2.m.f331605a.c(this.f411659m) || V6().k7().p(), null, new sr2.e1(this), false, new sr2.f1(this), 10, null);
    }

    public final void Q6() {
        boolean z17;
        java.lang.String str;
        boolean z18;
        boolean z19;
        r45.lp2 lp2Var;
        r45.ew0 ew0Var;
        P6();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.R.id.kav);
        mv2.m mVar = mv2.m.f331605a;
        O6(this, com.tencent.mm.R.id.qdi, valueOf, mVar.b(this.f411659m), "post_link_music", new sr2.h1(this), false, null, 96, null);
        O6(this, com.tencent.mm.R.id.qdh, java.lang.Integer.valueOf(com.tencent.mm.R.id.kau), mVar.a(this.f411659m), "post_link_audio", new sr2.x0(this), false, null, 96, null);
        O6(this, com.tencent.mm.R.id.m6_, java.lang.Integer.valueOf(com.tencent.mm.R.id.ecl), ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).oj(ya2.h.f460484a.b(xy2.c.e(getActivity()))), null, new sr2.b1(this), false, null, 104, null);
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        O6(this, com.tencent.mm.R.id.m69, null, ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.H0).getValue()).r()).intValue() == 1, null, new sr2.y0(this), false, null, 74, null);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.tencent.mm.R.id.f484467td2);
        g92.b bVar = g92.b.f269769e;
        m92.b j37 = g92.a.j3(bVar, this.f411659m, false, 2, null);
        O6(this, com.tencent.mm.R.id.uzp, valueOf2, (j37 == null || (ew0Var = (r45.ew0) j37.u0().getCustom(57)) == null) ? false : ew0Var.getBoolean(0), "post_add_wework_link", new sr2.m1(this), false, null, 96, null);
        O6(this, com.tencent.mm.R.id.m6b, java.lang.Integer.valueOf(com.tencent.mm.R.id.ecu), true, null, new sr2.i1(this), false, new sr2.j1(this), 8, null);
        O6(this, com.tencent.mm.R.id.m6c, java.lang.Integer.valueOf(com.tencent.mm.R.id.ecv), zv2.l0.f476408i.a(getContext()), null, new sr2.k1(this), false, new sr2.l1(this), 40, null);
        android.view.View view = this.f411653d;
        android.view.View findViewById = view != null ? view.findViewById(com.tencent.mm.R.id.q_e) : null;
        m92.b j38 = g92.a.j3(bVar, this.f411659m, false, 2, null);
        if ((j38 != null ? j38.y0() : null) != null && !V6().M) {
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "checkMemberVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "checkMemberVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (findViewById != null) {
                findViewById.setOnClickListener(new sr2.g1(this));
            }
        } else if (findViewById != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "checkMemberVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/post/PostExtendLinkUIC", "checkMemberVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.tencent.mm.R.id.f484465td1);
        java.lang.String username = this.f411659m;
        kotlin.jvm.internal.o.g(username, "username");
        m92.b j39 = g92.a.j3(bVar, username, false, 2, null);
        boolean z27 = ((j39 != null ? j39.u0().getLong(51) : 0L) & 1) != 0;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127926s4).getValue()).r()).intValue() == 1) {
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostChecker", "checkSupoportGame isShowGameLink:" + z27);
            z17 = z27;
        }
        O6(this, com.tencent.mm.R.id.uzo, valueOf3, z17, null, new sr2.d1(this), false, null, 104, null);
        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(com.tencent.mm.R.id.f484464td0);
        java.lang.String username2 = this.f411659m;
        kotlin.jvm.internal.o.g(username2, "username");
        m92.b j310 = g92.a.j3(bVar, username2, false, 2, null);
        boolean z28 = ((j310 != null ? j310.u0().getLong(51) : 0L) & 2) != 0;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127944t4).getValue()).r()).intValue() == 1) {
            str = "LogPost.FinderPostChecker";
            z18 = true;
        } else {
            str = "LogPost.FinderPostChecker";
            com.tencent.mars.xlog.Log.i(str, "checkSupportDrama isShowDramaLink:" + z28);
            z18 = z28;
        }
        java.lang.String str2 = str;
        O6(this, com.tencent.mm.R.id.uzn, valueOf4, z18, null, new sr2.a1(this), false, null, 104, null);
        java.lang.Integer valueOf5 = java.lang.Integer.valueOf(com.tencent.mm.R.id.tcz);
        java.lang.String username3 = this.f411659m;
        kotlin.jvm.internal.o.g(username3, "username");
        m92.b j311 = g92.a.j3(bVar, username3, false, 2, null);
        boolean z29 = (j311 == null || (lp2Var = (r45.lp2) j311.u0().getCustom(58)) == null) ? false : lp2Var.getBoolean(0);
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127962u4).getValue()).r()).intValue() == 1) {
            z19 = true;
        } else {
            com.tencent.mars.xlog.Log.i(str2, "checkSupportCollection isShowCollectionLink:" + z29);
            z19 = z29;
        }
        O6(this, com.tencent.mm.R.id.uzm, valueOf5, z19, null, new sr2.z0(this), false, null, 104, null);
    }

    public final boolean R6() {
        com.tencent.mm.plugin.finder.storage.ad0 ad0Var = com.tencent.mm.plugin.finder.storage.ad0.f126402a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.ad0.f126413l).getValue()).r()).intValue() == 1) {
            if (!(getIntent().getLongExtra("key_topic_id", 0L) != 0)) {
                return true;
            }
        }
        return false;
    }

    public final void S6(int i17) {
        U6().P6(i17, 0).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean T6() {
        /*
            r7 = this;
            boolean r0 = r7.f411660n
            r1 = 0
            if (r0 != 0) goto L76
            android.content.Intent r0 = r7.getIntent()
            java.lang.String r2 = "key_topic_id"
            r3 = 0
            long r5 = r0.getLongExtra(r2, r3)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r2 = 1
            if (r0 == 0) goto L18
            r0 = r2
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 != 0) goto L76
            aw2.n r0 = r7.f411654e
            r3 = 0
            if (r0 == 0) goto L3d
            android.content.Intent r0 = r0.f14781i
            if (r0 == 0) goto L2b
            java.lang.String r4 = "saveExtendReadingLink"
            java.lang.String r0 = r0.getStringExtra(r4)
            goto L2c
        L2b:
            r0 = r3
        L2c:
            if (r0 == 0) goto L37
            int r0 = r0.length()
            if (r0 != 0) goto L35
            goto L37
        L35:
            r0 = r1
            goto L38
        L37:
            r0 = r2
        L38:
            r0 = r0 ^ r2
            if (r0 != r2) goto L3d
            r0 = r2
            goto L3e
        L3d:
            r0 = r1
        L3e:
            if (r0 != 0) goto L51
            sr2.q1 r0 = r7.U6()
            zv2.r0 r0 = r0.f411681f
            if (r0 == 0) goto L4c
            zv2.b r0 = (zv2.b) r0
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r0.f476397f
        L4c:
            if (r3 == 0) goto L4f
            goto L51
        L4f:
            r0 = r1
            goto L52
        L51:
            r0 = r2
        L52:
            if (r0 != 0) goto L76
            com.tencent.mm.plugin.finder.post.PostMainUIC r0 = r7.V6()
            ry2.o r0 = r0.k7()
            boolean r0 = r0.o()
            if (r0 != 0) goto L76
            com.tencent.mm.plugin.finder.post.PostMainUIC r0 = r7.V6()
            ry2.o r0 = r0.k7()
            r3 = 108(0x6c, float:1.51E-43)
            int r0 = r0.U
            if (r3 != r0) goto L72
            r0 = r2
            goto L73
        L72:
            r0 = r1
        L73:
            if (r0 != 0) goto L76
            r1 = r2
        L76:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sr2.o1.T6():boolean");
    }

    public final sr2.q1 U6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(sr2.q1.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (sr2.q1) a17;
    }

    public final com.tencent.mm.plugin.finder.post.PostMainUIC V6() {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.plugin.finder.post.PostMainUIC) a17;
    }

    public final void W6() {
        aw2.a aVar = this.f411655f;
        if (aVar != null) {
            aVar.b();
        }
        aw2.n nVar = this.f411654e;
        if (nVar != null) {
            nVar.d();
        }
        this.f411660n = true;
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        kotlin.jvm.internal.o.g(account, "account");
        this.f411659m = xy2.c.e(getActivity());
        Q6();
    }
}
