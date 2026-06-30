package df2;

/* loaded from: classes10.dex */
public final class wy extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f231736m;

    /* renamed from: n, reason: collision with root package name */
    public int f231737n;

    /* renamed from: o, reason: collision with root package name */
    public kotlinx.coroutines.r2 f231738o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f231739p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ja0 f231740q;

    /* renamed from: r, reason: collision with root package name */
    public dk2.u4 f231741r;

    /* renamed from: s, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f231742s;

    /* renamed from: t, reason: collision with root package name */
    public final java.text.DecimalFormat f231743t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f231744u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wy(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f231736m = "Finder.PKCritController";
        this.f231739p = "";
        this.f231742s = kotlinx.coroutines.flow.r2.b(1, 0, u26.u.DROP_OLDEST, 2, null);
        java.text.DecimalFormat decimalFormat = new java.text.DecimalFormat("0.##");
        decimalFormat.setRoundingMode(java.math.RoundingMode.FLOOR);
        this.f231743t = decimalFormat;
    }

    public static final void Z6(df2.wy wyVar, java.lang.String str) {
        wyVar.getClass();
        com.tencent.mars.xlog.Log.i(wyVar.f231736m, "jumpGiftPanel giftId:" + str);
        r45.zb4 zb4Var = new r45.zb4();
        if (str == null) {
            str = "";
        }
        zb4Var.set(0, str);
        zb4Var.set(1, java.lang.Boolean.TRUE);
        ((mm2.s2) wyVar.business(mm2.s2.class)).f329411p.postValue(zb4Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x00b3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a7(df2.wy r22, r45.ja0 r23, long r24, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wy.a7(df2.wy, r45.ja0, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b7(dk2.u4 u4Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("emitBattleData lastBattleData:");
        dk2.u4 u4Var2 = this.f231741r;
        sb6.append(u4Var2 != null ? u4Var2.hashCode() : 0);
        sb6.append(", curBattle:");
        sb6.append(u4Var != null ? u4Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(this.f231736m, sb6.toString());
        this.f231741r = u4Var;
        ((kotlinx.coroutines.flow.q2) this.f231742s).e(u4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.ViewGroup c7() {
        /*
            r8 = this;
            java.lang.Class<zi2.w> r0 = zi2.w.class
            com.tencent.mm.plugin.finder.live.plugin.l r0 = r8.R6(r0)
            zi2.w r0 = (zi2.w) r0
            r1 = 0
            if (r0 == 0) goto L1f
            fi2.m r0 = r0.x1()
            android.view.View r0 = r0.k()
            if (r0 == 0) goto L1f
            r2 = 2131306084(0x7f092664, float:1.8230357E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            goto L20
        L1f:
            r0 = r1
        L20:
            java.lang.Class<zi2.w> r2 = zi2.w.class
            com.tencent.mm.plugin.finder.live.plugin.l r2 = r8.R6(r2)
            zi2.w r2 = (zi2.w) r2
            if (r2 == 0) goto L45
            java.lang.Class<mm2.c1> r3 = mm2.c1.class
            androidx.lifecycle.c1 r3 = r8.business(r3)
            mm2.c1 r3 = (mm2.c1) r3
            java.lang.String r3 = r3.f328852o
            fi2.m r2 = r2.x1()
            fi2.a r2 = (fi2.a) r2
            lj2.u0 r2 = r2.y(r3)
            if (r2 == 0) goto L45
            android.widget.FrameLayout r2 = r2.getAnchorCriticalLayout()
            goto L46
        L45:
            r2 = r1
        L46:
            java.lang.Class<mm2.o4> r3 = mm2.o4.class
            androidx.lifecycle.c1 r3 = r8.business(r3)
            mm2.o4 r3 = (mm2.o4) r3
            java.util.List r3 = r3.f329324s
            int r3 = r3.size()
            if (r3 <= 0) goto La5
            java.lang.Class<mm2.o4> r1 = mm2.o4.class
            androidx.lifecycle.c1 r1 = r8.business(r1)
            mm2.o4 r1 = (mm2.o4) r1
            java.util.List r1 = r1.f329327v
            java.lang.String r3 = "<get-audienceLinkMicUserList>(...)"
            kotlin.jvm.internal.o.f(r1, r3)
            monitor-enter(r1)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> La2
            r3.<init>()     // Catch: java.lang.Throwable -> La2
            java.util.Iterator r4 = r1.iterator()     // Catch: java.lang.Throwable -> La2
        L6f:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> La2
            if (r5 == 0) goto L8c
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> La2
            r6 = r5
            km2.q r6 = (km2.q) r6     // Catch: java.lang.Throwable -> La2
            java.lang.Boolean r6 = r6.f309189t     // Catch: java.lang.Throwable -> La2
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> La2
            boolean r6 = kotlin.jvm.internal.o.b(r6, r7)     // Catch: java.lang.Throwable -> La2
            r6 = r6 ^ 1
            if (r6 == 0) goto L6f
            r3.add(r5)     // Catch: java.lang.Throwable -> La2
            goto L6f
        L8c:
            monitor-exit(r1)
            boolean r1 = r3.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L9b
            if (r2 == 0) goto La1
            r2.removeAllViews()
            goto La1
        L9b:
            if (r0 == 0) goto La0
            r0.removeAllViews()
        La0:
            r0 = r2
        La1:
            return r0
        La2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        La5:
            if (r0 == 0) goto Laa
            r0.removeAllViews()
        Laa:
            if (r2 == 0) goto Laf
            r2.removeAllViews()
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wy.c7():android.view.ViewGroup");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if ((r5 == null || r5.length() == 0) != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d7(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r4.f231737n
            r1 = 6
            java.lang.Class<mm2.c1> r2 = mm2.c1.class
            r3 = 0
            if (r0 != r1) goto L3c
            androidx.lifecycle.c1 r0 = r4.business(r2)
            mm2.c1 r0 = (mm2.c1) r0
            java.lang.String r0 = r0.f328852o
            boolean r0 = kotlin.jvm.internal.o.b(r0, r5)
            if (r0 != 0) goto L24
            if (r5 == 0) goto L21
            int r0 = r5.length()
            if (r0 != 0) goto L1f
            goto L21
        L1f:
            r0 = r3
            goto L22
        L21:
            r0 = 1
        L22:
            if (r0 == 0) goto L3c
        L24:
            r45.ja0 r0 = r4.f231740q
            if (r0 == 0) goto L3c
            r1 = 5
            java.util.LinkedList r0 = r0.getList(r1)
            if (r0 == 0) goto L3c
            java.lang.Object r0 = kz5.n0.Z(r0)
            r45.ai5 r0 = (r45.ai5) r0
            if (r0 == 0) goto L3c
            int r0 = r0.getInteger(r3)
            r3 = r0
        L3c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getPKExtraTimes ret:"
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r1 = ", curStage:"
            r0.append(r1)
            int r1 = r4.f231737n
            r0.append(r1)
            java.lang.String r1 = ", finderUserName:"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = ", anchorUsername:"
            r0.append(r5)
            androidx.lifecycle.c1 r5 = r4.business(r2)
            mm2.c1 r5 = (mm2.c1) r5
            java.lang.String r5 = r5.f328852o
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = r4.f231736m
            com.tencent.mars.xlog.Log.i(r0, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wy.d7(java.lang.String):int");
    }

    @Override // mf2.c
    public void e1() {
        b7(this.f231741r);
    }

    public final java.lang.String e7(r45.ja0 ja0Var) {
        r45.ai5 ai5Var;
        kotlin.jvm.internal.o.g(ja0Var, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("current_stage:");
        sb6.append(ja0Var.getInteger(8));
        sb6.append(", stage_time_left:");
        sb6.append(ja0Var.getInteger(9));
        sb6.append(", crit_quest_id:");
        sb6.append(ja0Var.getString(11));
        sb6.append(", delivery_crit_quest:");
        sb6.append(ja0Var.getBoolean(6));
        sb6.append(", reward:");
        java.util.LinkedList list = ja0Var.getList(5);
        sb6.append((list == null || (ai5Var = (r45.ai5) kz5.n0.Z(list)) == null) ? null : java.lang.Integer.valueOf(ai5Var.getInteger(0)));
        sb6.append(", progress:");
        java.util.LinkedList list2 = ja0Var.getList(4);
        sb6.append(list2 != null ? kz5.n0.g0(list2, null, null, null, 0, null, df2.dy.f230006d, 31, null) : null);
        return sb6.toString();
    }

    public final void f7(boolean z17) {
        java.util.ArrayList arrayList;
        if (((mm2.o4) business(mm2.o4.class)).f329324s.size() > 0) {
            java.util.List list = ((mm2.o4) business(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
            synchronized (list) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : list) {
                    if (!kotlin.jvm.internal.o.b(((km2.q) obj).f309189t, java.lang.Boolean.TRUE)) {
                        arrayList.add(obj);
                    }
                }
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                km2.q qVar = (km2.q) it.next();
                zi2.w wVar = (zi2.w) R6(zi2.w.class);
                if (wVar != null) {
                    lj2.u0 y17 = ((fi2.a) wVar.x1()).y(qVar.f309172c);
                    if (y17 != null) {
                        y17.j(z17);
                    }
                }
            }
        }
    }

    public final void g7(com.tencent.mm.plugin.finder.live.util.l1 giftShowInfo) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(giftShowInfo, "giftShowInfo");
        com.tencent.mars.xlog.Log.i(this.f231736m, "onShowGiftInfo curStage:" + this.f231737n + ", giftShowInfo.targetUserName:" + giftShowInfo.f115601s);
        int integer = giftShowInfo.f115592g.getInteger(12);
        if (this.f231737n == 6 || integer > 0) {
            java.lang.String str = giftShowInfo.f115601s;
            boolean z17 = true;
            if (!kotlin.jvm.internal.o.b(str, ((mm2.c1) business(mm2.c1.class)).f328852o)) {
                java.util.List list = ((mm2.o4) business(mm2.o4.class)).f329327v;
                kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
                synchronized (list) {
                    java.util.Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        km2.q qVar = (km2.q) obj;
                        if (kotlin.jvm.internal.o.b(qVar.f309189t, java.lang.Boolean.FALSE) && kotlin.jvm.internal.o.b(str, qVar.f309172c)) {
                            break;
                        }
                    }
                }
                if (obj == null) {
                    z17 = false;
                }
            }
            if (z17) {
                float integer2 = (giftShowInfo.f115592g.getInteger(10) - 100.0f) / 100.0f;
                r45.kv1 kv1Var = (r45.kv1) giftShowInfo.f115592g.getCustom(3);
                ce2.i b17 = kv1Var != null ? ce2.i.U1.b(kv1Var) : null;
                float P0 = b17 != null ? b17.P0() : 0.0f;
                float f17 = giftShowInfo.f115595m * integer2 * P0;
                com.tencent.mars.xlog.Log.i(this.f231736m, "pkExtraTimes:" + integer2 + ", extraCount:" + f17 + ", price:" + P0 + ", giftCount:" + giftShowInfo.f115595m + ", gift id:" + giftShowInfo.f115600r + ", extraValue: " + integer);
                java.lang.Number valueOf = integer > 0 ? java.lang.Integer.valueOf(integer) : java.lang.Float.valueOf(f17);
                if (valueOf.floatValue() > 0.0f) {
                    com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.ny(this, giftShowInfo, valueOf, null), 3, null);
                }
            }
        }
    }

    public final void h7() {
        android.view.View k17;
        android.view.ViewGroup viewGroup;
        com.tencent.mars.xlog.Log.i(this.f231736m, "resetCriticalLayout");
        zi2.w wVar = (zi2.w) R6(zi2.w.class);
        if (wVar != null) {
            java.util.ArrayList<lj2.u0> t17 = wVar.x1().t();
            if (t17 == null) {
                t17 = new java.util.ArrayList();
            }
            for (lj2.u0 u0Var : t17) {
                android.widget.FrameLayout anchorCriticalLayout = u0Var.getAnchorCriticalLayout();
                if (anchorCriticalLayout != null) {
                    anchorCriticalLayout.removeAllViews();
                }
                android.widget.FrameLayout criticalGiftLayout = u0Var.getCriticalGiftLayout();
                if (criticalGiftLayout != null) {
                    criticalGiftLayout.removeAllViews();
                }
            }
        }
        zi2.w wVar2 = (zi2.w) R6(zi2.w.class);
        if (wVar2 == null || (k17 = wVar2.x1().k()) == null || (viewGroup = (android.view.ViewGroup) k17.findViewById(com.tencent.mm.R.id.ewe)) == null) {
            return;
        }
        viewGroup.removeAllViews();
    }

    public final void i7() {
        com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView livePkCritBuffView;
        android.view.ViewGroup c76 = c7();
        if (c76 != null) {
            android.view.View childAt = c76.getChildAt(0);
            if (childAt == null || !(childAt instanceof com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView)) {
                c76.removeAllViews();
                android.content.Context context = c76.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                livePkCritBuffView = new com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView(context);
                c76.addView(livePkCritBuffView, new android.view.ViewGroup.LayoutParams(-1, -2));
            } else {
                livePkCritBuffView = (com.tencent.mm.plugin.finder.view.crit.LivePkCritBuffView) childAt;
            }
            f7(true);
            com.tencent.mars.xlog.Log.i(this.f231736m, "setupBuffComputingUI");
            livePkCritBuffView.setOnClickListener(df2.ry.f231275d);
            livePkCritBuffView.g();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k7(r45.ja0 r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.wy.k7(r45.ja0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void l7() {
        com.tencent.mm.plugin.finder.view.crit.LivePkCritDoneView livePkCritDoneView;
        android.view.ViewGroup c76 = c7();
        if (c76 != null) {
            android.view.View childAt = c76.getChildAt(0);
            if (childAt == null || !(childAt instanceof com.tencent.mm.plugin.finder.view.crit.LivePkCritDoneView)) {
                c76.removeAllViews();
                android.content.Context context = c76.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                livePkCritDoneView = new com.tencent.mm.plugin.finder.view.crit.LivePkCritDoneView(context);
                c76.addView(livePkCritDoneView, new android.view.ViewGroup.LayoutParams(-1, -2));
            } else {
                livePkCritDoneView = (com.tencent.mm.plugin.finder.view.crit.LivePkCritDoneView) childAt;
            }
            f7(true);
            com.tencent.mars.xlog.Log.i(this.f231736m, "setupQuestComputingUI");
            livePkCritDoneView.c(3, null);
            livePkCritDoneView.setOnClickListener(df2.vy.f231644d);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mm.plugin.finder.live.util.y.o(this, null, null, new df2.qy(this, null), 3, null);
    }
}
