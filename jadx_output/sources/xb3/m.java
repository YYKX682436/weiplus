package xb3;

/* loaded from: classes9.dex */
public class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI f452910a;

    public m(com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI) {
        this.f452910a = luckyMoneyHKReceiveUI;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        boolean z17;
        int i17;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI luckyMoneyHKReceiveUI = this.f452910a;
        luckyMoneyHKReceiveUI.f145147u.dismiss();
        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "do receive hb, errtype: %s, errcode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            r45.u43 u43Var = (r45.u43) fVar.f70618d;
            com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "do receive hb, retcode: %s, %s", java.lang.Integer.valueOf(u43Var.f387008d), u43Var.f387009e);
            if (u43Var.f387008d == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "jump to h5: %s", java.lang.Boolean.valueOf(u43Var.f387019r));
                if (u43Var.f387019r) {
                    com.tencent.mm.wallet_core.ui.r1.V(luckyMoneyHKReceiveUI.getContext(), luckyMoneyHKReceiveUI.getIntent().getStringExtra("key_hk_url"), true);
                } else {
                    at4.k1 k1Var = new at4.k1();
                    k1Var.field_mNativeUrl = luckyMoneyHKReceiveUI.f145150x;
                    k1Var.field_hbType = u43Var.f387016o;
                    k1Var.field_hbStatus = u43Var.f387014m;
                    k1Var.field_receiveStatus = u43Var.f387013i;
                    ((pg0.a3) i95.n0.c(pg0.a3.class)).Vi().replace(k1Var);
                    if (u43Var.f387013i == 2) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LuckyMoneyHKReceiveUI", "do query detail");
                        new wb3.a(luckyMoneyHKReceiveUI.f145150x, luckyMoneyHKReceiveUI.f145149w, 11, 0, 1, luckyMoneyHKReceiveUI.getIntent().getIntExtra("key_hk_scene", 0)).l().h(new xb3.f(luckyMoneyHKReceiveUI)).f(luckyMoneyHKReceiveUI);
                    } else {
                        com.tencent.mm.plugin.luckymoney.model.m5.b(luckyMoneyHKReceiveUI.f145137h, "", u43Var.f387017p);
                        com.tencent.mm.plugin.luckymoney.model.m5.E(luckyMoneyHKReceiveUI.getContext(), luckyMoneyHKReceiveUI.f145138i, luckyMoneyHKReceiveUI.getString(com.tencent.mm.R.string.god, com.tencent.mm.wallet_core.ui.r1.I(com.tencent.mm.wallet_core.ui.r1.x(u43Var.f387017p), 10)));
                        if (u43Var.f387013i == 1 || (i17 = u43Var.f387014m) == 4 || i17 == 5 || i17 == 1) {
                            luckyMoneyHKReceiveUI.f145141o.setVisibility(8);
                            luckyMoneyHKReceiveUI.f145142p.setVisibility(8);
                            if (com.tencent.mm.sdk.platformtools.t8.K0(u43Var.f387015n)) {
                                luckyMoneyHKReceiveUI.f145140n.setVisibility(8);
                            } else {
                                luckyMoneyHKReceiveUI.f145140n.setText(u43Var.f387015n);
                                luckyMoneyHKReceiveUI.f145140n.setVisibility(0);
                                luckyMoneyHKReceiveUI.f145140n.setSingleLine(false);
                            }
                            android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) luckyMoneyHKReceiveUI.f145143q.getLayoutParams();
                            layoutParams.bottomMargin = com.tencent.mm.sdk.platformtools.j.d(luckyMoneyHKReceiveUI.getContext(), 30.0f);
                            luckyMoneyHKReceiveUI.f145143q.setLayoutParams(layoutParams);
                            z17 = true;
                        } else {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(u43Var.f387015n)) {
                                luckyMoneyHKReceiveUI.f145139m.setText(u43Var.f387015n);
                                luckyMoneyHKReceiveUI.f145139m.setVisibility(0);
                            }
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(u43Var.f387011g)) {
                                com.tencent.mm.plugin.luckymoney.model.m5.E(luckyMoneyHKReceiveUI.getContext(), luckyMoneyHKReceiveUI.f145140n, u43Var.f387011g);
                                luckyMoneyHKReceiveUI.f145140n.setVisibility(0);
                                luckyMoneyHKReceiveUI.f145139m.setVisibility(8);
                            }
                            luckyMoneyHKReceiveUI.f145141o.setOnClickListener(new xb3.k(this, new fo3.m(luckyMoneyHKReceiveUI.f145141o, "ce_open_lm", "<LuckyMoney>"), u43Var));
                            z17 = false;
                        }
                        if (c01.z1.r().equals(null) || (u43Var.f387016o == 1 && z17)) {
                            if (u43Var.f387016o == 1) {
                                luckyMoneyHKReceiveUI.f145145s.setText(com.tencent.mm.R.string.f492416gk1);
                            }
                            android.view.View view = luckyMoneyHKReceiveUI.f145143q;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                            arrayList.add(0);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            luckyMoneyHKReceiveUI.f145143q.setOnClickListener(new xb3.l(this));
                            luckyMoneyHKReceiveUI.f145144r.setVisibility(8);
                        } else {
                            android.view.View view2 = luckyMoneyHKReceiveUI.f145143q;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                            arrayList2.add(8);
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            luckyMoneyHKReceiveUI.f145144r.setVisibility(0);
                        }
                        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) luckyMoneyHKReceiveUI.f145136g.getLayoutParams();
                        layoutParams2.topMargin = com.tencent.mm.sdk.platformtools.j.d(luckyMoneyHKReceiveUI.getContext(), 118.0f);
                        luckyMoneyHKReceiveUI.f145136g.setLayoutParams(layoutParams2);
                        if (com.tencent.mm.ui.bk.C()) {
                            luckyMoneyHKReceiveUI.f145148v.setBackgroundResource(com.tencent.mm.R.color.BW_0_Alpha_0_8);
                            com.tencent.mm.ui.bk.p0(luckyMoneyHKReceiveUI, luckyMoneyHKReceiveUI.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_8));
                        } else {
                            luckyMoneyHKReceiveUI.f145148v.setBackgroundResource(com.tencent.mm.R.color.f479354x8);
                            com.tencent.mm.ui.bk.p0(luckyMoneyHKReceiveUI, luckyMoneyHKReceiveUI.getResources().getColor(com.tencent.mm.R.color.f479354x8));
                        }
                        android.view.View contentView = luckyMoneyHKReceiveUI.getContentView();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(contentView, arrayList3.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        contentView.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(contentView, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI", "setActivityBg", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        android.view.View view3 = luckyMoneyHKReceiveUI.f145146t;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view3, "com/tencent/mm/plugin/luckymoney/hk/ui/LuckyMoneyHKReceiveUI$6", "call", "(Lcom/tencent/mm/modelbase/Cgi$CgiBack;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        com.tencent.mm.plugin.luckymoney.model.m5.A(luckyMoneyHKReceiveUI.f145146t);
                    }
                }
            } else {
                java.lang.String str = com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI.B;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(u43Var.f387009e)) {
                    str = u43Var.f387009e;
                }
                db5.e1.T(luckyMoneyHKReceiveUI.getContext(), str);
                luckyMoneyHKReceiveUI.finish();
            }
        } else {
            java.lang.String str2 = com.tencent.mm.plugin.luckymoney.hk.ui.LuckyMoneyHKReceiveUI.B;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(fVar.f70617c)) {
                str2 = fVar.f70617c;
            }
            db5.e1.T(luckyMoneyHKReceiveUI.getContext(), str2);
            luckyMoneyHKReceiveUI.finish();
        }
        return null;
    }
}
