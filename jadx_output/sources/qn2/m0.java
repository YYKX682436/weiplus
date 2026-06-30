package qn2;

/* loaded from: classes3.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.v0 f365115d;

    public m0(qn2.v0 v0Var) {
        this.f365115d = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        com.tencent.mm.protobuf.g byteString;
        r45.mg0 mg0Var;
        r45.y23 y23Var;
        r45.ce0 ce0Var;
        int i17;
        int i18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget$initDoneDetailView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f361767a >= 500) {
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f361767a);
            z17 = true;
        }
        qd2.h.f361767a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget$initDoneDetailView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        qn2.v0 v0Var = this.f365115d;
        km2.z zVar = ((on2.z2) v0Var.f365176a.P0(on2.z2.class)).f347092m;
        r45.cz1 cz1Var = zVar != null ? zVar.f309232d : null;
        if (cz1Var == null) {
            com.tencent.mars.xlog.Log.e("VisitorLotteryCardDoneWidget", "onClaimClick but lotteryInfo is null!");
        } else {
            com.tencent.mars.xlog.Log.i("VisitorLotteryCardDoneWidget", "[onClaimClick] lotteryInfo:" + pm0.b0.g(cz1Var));
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.p4 p4Var = ml2.p4.f327807u;
            on2.l3 l3Var = on2.l3.f346966a;
            r45.yy1 yy1Var = (r45.yy1) cz1Var.getCustom(13);
            int integer = yy1Var != null ? yy1Var.getInteger(0) : 0;
            ml2.r0.ek(r0Var, p4Var, integer != 1 ? integer != 2 ? integer != 3 ? "1" : "4" : "3" : "2", null, 0, null, 28, null);
            r45.yy1 yy1Var2 = (r45.yy1) cz1Var.getCustom(13);
            java.lang.Integer valueOf = yy1Var2 != null ? java.lang.Integer.valueOf(yy1Var2.getInteger(0)) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                android.content.Context context = v0Var.f365177b.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.lang.String str = ((mm2.c1) v0Var.f365176a.P0(mm2.c1.class)).f328852o;
                r45.j55 j55Var = (r45.j55) cz1Var.getCustom(11);
                if (j55Var != null) {
                    i17 = 0;
                    i18 = j55Var.getInteger(0);
                } else {
                    i17 = 0;
                    i18 = 0;
                }
                java.lang.String string = cz1Var.getString(i17);
                l3Var.c(context, str, i18, string == null ? "" : string, ((mm2.e1) v0Var.f365176a.P0(mm2.e1.class)).f328983m, v0Var.f365176a.f113326h);
            } else if (valueOf != null && valueOf.intValue() == 1) {
                android.content.Context context2 = v0Var.f365177b.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("launch_from_select_addr", true);
                intent.putExtra("enter_scene_address", 3);
                j45.l.o(context2, "address", ".ui.WalletSelectAddrUI", intent, 1001, false);
            } else if (valueOf != null && valueOf.intValue() == 2) {
                android.view.ViewGroup viewGroup = v0Var.f365177b;
                if (viewGroup.getContext() instanceof android.app.Activity) {
                    android.content.Context context3 = viewGroup.getContext();
                    kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
                    v0Var.f365200y = l3Var.a((android.app.Activity) context3, cz1Var, new qn2.u0(v0Var, cz1Var));
                } else {
                    com.tencent.mars.xlog.Log.e("VisitorLotteryCardDoneWidget", "claimByCustomize but context isn't Activity!");
                }
            } else if (valueOf != null && valueOf.intValue() == 3) {
                r45.yy1 yy1Var3 = (r45.yy1) cz1Var.getCustom(13);
                if (yy1Var3 != null && (byteString = yy1Var3.getByteString(7)) != null) {
                    l81.b1 b1Var = new l81.b1();
                    b1Var.f317032k = 1205;
                    r45.yy1 yy1Var4 = (r45.yy1) cz1Var.getCustom(13);
                    if (yy1Var4 != null && yy1Var4.getInteger(3) == 0) {
                        r45.y23 y23Var2 = new r45.y23();
                        try {
                            y23Var2.parseFrom(byteString.g());
                            y23Var = y23Var2;
                        } catch (java.lang.Exception e17) {
                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                            y23Var = null;
                        }
                        if (y23Var != null && (ce0Var = (r45.ce0) y23Var.getCustom(8)) != null) {
                            java.lang.String string2 = ce0Var.getString(0);
                            if (string2 == null) {
                                string2 = "";
                            }
                            b1Var.f317014b = string2;
                            java.lang.String string3 = ce0Var.getString(1);
                            b1Var.f317022f = string3 != null ? string3 : "";
                            b1Var.f317037o = new qn2.l0(v0Var.f365176a);
                            float f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y;
                            if (com.tencent.mm.sdk.platformtools.x2.f193075e.getConfiguration().orientation == 2) {
                                f17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).x;
                            }
                            b1Var.G = new com.tencent.mm.plugin.appbrand.config.HalfScreenConfig(true, (int) ((ae2.in.f3688a.h0() / 100.0f) * f17), null, false, null, false, null, k91.t2.f305768f, false, false, null, null, true, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -4996, 2047, null);
                            dk2.q4 q4Var = dk2.q4.f233938a;
                            android.content.Context context4 = v0Var.f365177b.getContext();
                            kotlin.jvm.internal.o.f(context4, "getContext(...)");
                            q4Var.n(context4, v0Var.f365176a.S0(), b1Var, v0Var.f365176a.Y0());
                            com.tencent.mars.xlog.Log.i("VisitorLotteryCardDoneWidget", "claim prize appid = " + b1Var.f317014b + ", username = " + b1Var.f317012a + ", path = " + b1Var.f317022f);
                        }
                    } else {
                        r45.mg0 mg0Var2 = new r45.mg0();
                        try {
                            mg0Var2.parseFrom(byteString.g());
                            mg0Var = mg0Var2;
                        } catch (java.lang.Exception e18) {
                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                            mg0Var = null;
                        }
                        if (mg0Var != null) {
                            java.lang.String string4 = mg0Var.getString(1);
                            if (string4 == null) {
                                string4 = "";
                            }
                            b1Var.f317012a = string4;
                            java.lang.String string5 = mg0Var.getString(2);
                            b1Var.f317022f = string5 != null ? string5 : "";
                            ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(v0Var.f365177b.getContext(), b1Var);
                            com.tencent.mars.xlog.Log.i("VisitorLotteryCardDoneWidget", "claim prize appid = " + b1Var.f317014b + ", username = " + b1Var.f317012a + ", path = " + b1Var.f317022f);
                        }
                    }
                }
            } else if (valueOf != null && valueOf.intValue() == 4) {
                com.tencent.mars.xlog.Log.i("VisitorLotteryCardDoneWidget", "onClaimClick open gift panel");
                v0Var.f365176a.K0(8);
                r45.zb4 zb4Var = new r45.zb4();
                zb4Var.set(2, v0Var.f365177b.getContext().getString(com.tencent.mm.R.string.f491563dj5));
                zb4Var.set(4, java.lang.Boolean.TRUE);
                ((mm2.s2) v0Var.f365176a.P0(mm2.s2.class)).f329411p.postValue(zb4Var);
            } else if (valueOf != null && valueOf.intValue() == 5) {
                df2.oj ojVar = (df2.oj) v0Var.f365176a.U0(df2.oj.class);
                if (ojVar != null) {
                    ojVar.k7(r45.r84.AfterLottery, null);
                }
            } else {
                com.tencent.mars.xlog.Log.e("VisitorLotteryCardDoneWidget", "onClaimClick but claim type is error!");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardDoneWidget$initDoneDetailView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
