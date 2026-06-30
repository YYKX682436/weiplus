package pk2;

/* loaded from: classes3.dex */
public abstract class u6 {
    public static final void a(pk2.o9 o9Var, int i17) {
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        df2.zb zbVar;
        df2.zb zbVar2;
        df2.zb zbVar3;
        df2.zb zbVar4;
        df2.zb zbVar5;
        df2.zb zbVar6;
        df2.zb zbVar7;
        pk2.g8 g8Var;
        hn0.r rVar;
        pk2.g8 g8Var2;
        df2.k9 k9Var;
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        lu2.j jVar = lu2.j.f321376a;
        int i18 = o9Var.f356107r0;
        java.lang.String str3 = "";
        com.tencent.mm.ui.MMActivity activity = o9Var.f356078d;
        if (i17 == i18) {
            kotlin.jvm.internal.o.g(activity, "activity");
            if (zl2.r4.f473950a.w1()) {
                str2 = com.tencent.mm.plugin.finder.assist.p8.f102462c;
            } else {
                str2 = (java.lang.String) com.tencent.mm.plugin.finder.assist.y8.f102734c.get("RV_VISITOR_" + ((mm2.e1) o9Var.c(mm2.e1.class)).f328988r.getLong(0));
                if (str2 == null) {
                    str2 = "";
                }
            }
            jVar.a(activity, str2, "");
            return;
        }
        if (i17 == o9Var.f356109s0) {
            if (zl2.q4.f473933a.E()) {
                mm2.k2.f329192h = !mm2.k2.f329192h;
                return;
            }
            return;
        }
        int i19 = o9Var.E0;
        gk2.e liveData = o9Var.f356074b;
        if (i17 == i19) {
            am2.s0 s0Var = new am2.s0(activity, liveData, o9Var);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) s0Var.f8741a, 1, false);
            k0Var.f211872n = am2.z.f8778d;
            k0Var.f211881s = new am2.b0(s0Var);
            k0Var.v();
            return;
        }
        if (i17 == o9Var.H0) {
            kotlin.jvm.internal.o.g(activity, "activity");
            kotlin.jvm.internal.o.g(liveData, "liveData");
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) activity, 1, false);
            k0Var2.f211872n = am2.f2.f8668d;
            k0Var2.f211881s = am2.g2.f8673d;
            k0Var2.v();
            return;
        }
        if (i17 == o9Var.f356113u0) {
            am2.x0 x0Var = new am2.x0(activity, liveData);
            com.tencent.mm.ui.widget.dialog.k0 k0Var3 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) x0Var.f8768a, 1, false);
            k0Var3.f211872n = am2.v0.f8760d;
            k0Var3.f211881s = new am2.w0(x0Var);
            k0Var3.v();
            return;
        }
        if (i17 == o9Var.f356115v0) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) o9Var.c(mm2.c1.class)).f328846n;
            if (finderObject == null || (str = finderObject.getDebugMessage()) == null || android.text.TextUtils.isEmpty(str)) {
                str = "empty msg.";
            }
            lu2.j.b(jVar, o9Var.f356078d, str, null, 4, null);
            return;
        }
        if (i17 == o9Var.f356111t0) {
            am2.s1 s1Var = new am2.s1(activity, liveData);
            com.tencent.mm.ui.widget.dialog.k0 k0Var4 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) s1Var.f8745a, 1, false);
            k0Var4.f211872n = new am2.r1(s1Var);
            k0Var4.v();
            return;
        }
        if (i17 == o9Var.f356121y0) {
            am2.e2 e2Var = new am2.e2(activity, liveData);
            com.tencent.mm.ui.widget.dialog.k0 k0Var5 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) e2Var.f8661a, 1, false);
            k0Var5.f211872n = new am2.d2(e2Var);
            k0Var5.v();
            return;
        }
        int i27 = o9Var.A0;
        pk2.d9 d9Var = o9Var.f356082f;
        if (i17 == i27) {
            if (d9Var == null || (g8Var2 = d9Var.f355658a) == null || (k9Var = (df2.k9) ((pk2.k9) g8Var2).f355924a.controller(df2.k9.class)) == null) {
                return;
            }
            r45.ii1 ii1Var = new r45.ii1();
            ii1Var.set(0, "2");
            k9Var.Z6(ii1Var);
            return;
        }
        if (i17 == o9Var.B0) {
            am2.h hVar = new am2.h(activity, liveData);
            com.tencent.mm.ui.widget.dialog.k0 k0Var6 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) hVar.f8676a, 1, false);
            k0Var6.f211872n = new am2.g(hVar);
            k0Var6.v();
            return;
        }
        if (i17 == o9Var.C0) {
            am2.v vVar = new am2.v(activity, liveData);
            com.tencent.mm.ui.widget.dialog.k0 k0Var7 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) vVar.f8758a, 1, false);
            k0Var7.f211872n = new am2.u(vVar);
            k0Var7.v();
            return;
        }
        if (i17 == o9Var.D0) {
            am2.p pVar = new am2.p(activity, liveData);
            com.tencent.mm.ui.widget.dialog.k0 k0Var8 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) pVar.f8726a, 1, false);
            k0Var8.f211872n = new am2.o(pVar);
            k0Var8.v();
            return;
        }
        if (i17 == o9Var.F0) {
            am2.g3 g3Var = new am2.g3(activity, liveData);
            com.tencent.mm.ui.widget.dialog.k0 k0Var9 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) g3Var.f8674a, 1, false);
            k0Var9.f211872n = new am2.f3(g3Var);
            k0Var9.v();
            return;
        }
        if (i17 == o9Var.G0) {
            am2.x2 x2Var = new am2.x2(activity, liveData);
            com.tencent.mm.ui.widget.dialog.k0 k0Var10 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) x2Var.f8772a, 1, false);
            k0Var10.f211872n = new am2.w2(x2Var);
            k0Var10.v();
            return;
        }
        if (i17 == o9Var.f356117w0) {
            kotlin.jvm.internal.o.g(activity, "activity");
            zl2.r4 r4Var = zl2.r4.f473950a;
            if (r4Var.x1()) {
                if (in0.q.f292769b2 == null) {
                    in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
                }
                in0.q qVar = in0.q.f292769b2;
                kotlin.jvm.internal.o.d(qVar);
                str3 = java.lang.String.valueOf(qVar.hashCode());
            } else {
                co0.s u07 = dk2.ef.f233372a.u0();
                if (u07 != null && (rVar = u07.R1) != null) {
                    str3 = rVar.d();
                }
            }
            java.lang.String str4 = "onLine: " + ((mm2.k2) o9Var.c(mm2.k2.class)).f329194g + "\n " + ((mm2.k2) o9Var.c(mm2.k2.class)).N6(r4Var.x1(), str3);
            androidx.appcompat.app.AppCompatActivity context = activity.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            jVar.a(context, str4, str3);
            return;
        }
        com.tencent.mm.plugin.finder.live.view.k0 k0Var11 = null;
        if (i17 == o9Var.K0) {
            if (d9Var != null && (g8Var = d9Var.f355658a) != null) {
                com.tencent.mm.plugin.finder.live.view.ub ubVar = ((pk2.k9) g8Var).f355924a.f291099e;
                if (ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0) {
                    k0Var11 = (com.tencent.mm.plugin.finder.live.view.k0) ubVar;
                }
            }
            if (k0Var11 == null) {
                com.tencent.mars.xlog.Log.w(o9Var.f356072a, "clickDumpViewHierarchy: pluginLayout is null");
                return;
            }
            zl2.l5 l5Var = zl2.l5.f473884a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            l5Var.a(k0Var11, 0, sb6);
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            com.tencent.mars.xlog.Log.i("ViewHierarchyDumper", "=== Hierarchy Dump: Hierarchy ===");
            java.util.Iterator it = r26.n0.Q(sb7).iterator();
            while (it.hasNext()) {
                com.tencent.mars.xlog.Log.i("ViewHierarchyDumper", (java.lang.String) it.next());
            }
            com.tencent.mars.xlog.Log.i("ViewHierarchyDumper", "=== End Dump: Hierarchy ===");
            return;
        }
        if (i17 == o9Var.L0) {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore2 = dk2.ef.f233371J;
            if (liveRoomControllerStore2 == null || (zbVar7 = (df2.zb) liveRoomControllerStore2.controller(df2.zb.class)) == null) {
                return;
            }
            zbVar7.o7("simulate");
            return;
        }
        if (i17 == o9Var.M0) {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore3 = dk2.ef.f233371J;
            if (liveRoomControllerStore3 == null || (zbVar6 = (df2.zb) liveRoomControllerStore3.controller(df2.zb.class)) == null) {
                return;
            }
            yd2.b bVar = new yd2.b(zbVar6.k7(), ((mm2.e1) zbVar6.getStore().getLiveRoomData().a(mm2.e1.class)).f328983m, "mock_session_" + java.lang.System.currentTimeMillis(), java.lang.System.currentTimeMillis(), "", ((mm2.c1) zbVar6.getStore().getLiveRoomData().a(mm2.c1.class)).f328852o);
            java.util.List c17 = kz5.b0.c(new yd2.n("mock_flip_" + java.lang.System.currentTimeMillis(), "camera::flip", "1.0.0", null));
            yg2.b bVar2 = zbVar6.getStore().getLiveRoomData().f272475i;
            com.tencent.mars.xlog.Log.i(zbVar6.f231939m, "[aiAssistant] mockFlipCamera: dispatching");
            zbVar6.f231940n.d(c17, bVar, bVar2, new df2.ua(zbVar6));
            return;
        }
        if (i17 == o9Var.N0) {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore4 = dk2.ef.f233371J;
            if (liveRoomControllerStore4 == null || (zbVar5 = (df2.zb) liveRoomControllerStore4.controller(df2.zb.class)) == null) {
                return;
            }
            yd2.b bVar3 = new yd2.b(zbVar5.k7(), ((mm2.e1) zbVar5.getStore().getLiveRoomData().a(mm2.e1.class)).f328983m, "mock_session_" + java.lang.System.currentTimeMillis(), java.lang.System.currentTimeMillis(), "", ((mm2.c1) zbVar5.getStore().getLiveRoomData().a(mm2.c1.class)).f328852o);
            java.util.List c18 = kz5.b0.c(new yd2.n("mock_echo_" + java.lang.System.currentTimeMillis(), "debug::echo", "1.0.0", "{\"message\":\"Hello from debug mock\"}"));
            yg2.b bVar4 = zbVar5.getStore().getLiveRoomData().f272475i;
            com.tencent.mars.xlog.Log.i(zbVar5.f231939m, "[aiAssistant] mockEcho: dispatching");
            zbVar5.f231940n.d(c18, bVar3, bVar4, new df2.ta(zbVar5));
            return;
        }
        if (i17 == o9Var.O0) {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore5 = dk2.ef.f233371J;
            if (liveRoomControllerStore5 == null || (zbVar4 = (df2.zb) liveRoomControllerStore5.controller(df2.zb.class)) == null) {
                return;
            }
            yd2.b c76 = zbVar4.c7();
            java.util.List c19 = kz5.b0.c(new yd2.n("mock_lottery_custom_" + java.lang.System.currentTimeMillis(), "lottery::create", "1.0.0", "{\"prizeType\":0,\"winnerCount\":5,\"durationMinutes\":5,\"attendType\":3,\"attendComment\":\"抽奖\",\"allowRepeatWin\":false,\"lotteryDescription\":\"小猫周边大礼包\",\"claimType\":0}"));
            com.tencent.mars.xlog.Log.i(zbVar4.f231939m, "[aiAssistant] mockLotteryCreateCustom: dispatching");
            zbVar4.f231940n.d(c19, c76, zbVar4.getStore().getLiveRoomData().f272475i, new df2.va(zbVar4));
            return;
        }
        if (i17 == o9Var.P0) {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore6 = dk2.ef.f233371J;
            if (liveRoomControllerStore6 == null || (zbVar3 = (df2.zb) liveRoomControllerStore6.controller(df2.zb.class)) == null) {
                return;
            }
            yd2.b c77 = zbVar3.c7();
            java.util.List c27 = kz5.b0.c(new yd2.n("mock_lottery_custom_claim_" + java.lang.System.currentTimeMillis(), "lottery::create", "1.0.0", "{\"prizeType\":0,\"winnerCount\":3,\"durationMinutes\":3,\"attendType\":1,\"allowRepeatWin\":true,\"lotteryDescription\":\"现金红包\",\"claimType\":2,\"claimRemindWording\":\"加主播微信领取\"}"));
            com.tencent.mars.xlog.Log.i(zbVar3.f231939m, "[aiAssistant] mockLotteryCreateCustomClaim: dispatching");
            zbVar3.f231940n.d(c27, c77, zbVar3.getStore().getLiveRoomData().f272475i, new df2.wa(zbVar3));
            return;
        }
        if (i17 == o9Var.Q0) {
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore7 = dk2.ef.f233371J;
            if (liveRoomControllerStore7 == null || (zbVar2 = (df2.zb) liveRoomControllerStore7.controller(df2.zb.class)) == null) {
                return;
            }
            yd2.b c78 = zbVar2.c7();
            java.util.List c28 = kz5.b0.c(new yd2.n("mock_lottery_gift_same_" + java.lang.System.currentTimeMillis(), "lottery::create", "1.0.0", "{\"prizeType\":2,\"winnerCount\":3,\"durationMinutes\":5,\"attendType\":2,\"allowRepeatWin\":false,\"giftDistributeType\":0,\"giftItems\":[{\"product_id\":\"FAKE_PRODUCT_ID_FOR_MOCK\",\"count\":1}]}"));
            com.tencent.mars.xlog.Log.i(zbVar2.f231939m, "[aiAssistant] mockLotteryCreateGift: dispatching");
            zbVar2.f231940n.d(c28, c78, zbVar2.getStore().getLiveRoomData().f272475i, new df2.xa(zbVar2));
            return;
        }
        if (i17 != o9Var.R0 || (liveRoomControllerStore = dk2.ef.f233371J) == null || (zbVar = (df2.zb) liveRoomControllerStore.controller(df2.zb.class)) == null) {
            return;
        }
        yd2.b c79 = zbVar.c7();
        java.util.List c29 = kz5.b0.c(new yd2.n("mock_lottery_gift_random_" + java.lang.System.currentTimeMillis(), "lottery::create", "1.0.0", "{\"prizeType\":2,\"winnerCount\":5,\"durationMinutes\":5,\"attendType\":4,\"allowRepeatWin\":false,\"giftDistributeType\":1,\"giftItems\":[{\"product_id\":\"FAKE_PRODUCT_ID_FOR_MOCK\",\"count\":3}]}"));
        com.tencent.mars.xlog.Log.i(zbVar.f231939m, "[aiAssistant] mockLotteryCreateGiftRandom: dispatching");
        zbVar.f231940n.d(c29, c79, zbVar.getStore().getLiveRoomData().f272475i, new df2.ya(zbVar));
    }
}
