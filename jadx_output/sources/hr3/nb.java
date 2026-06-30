package hr3;

/* loaded from: classes11.dex */
public abstract class nb extends hr3.eb {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference f283832g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference) {
        super(normalUserFooterPreference);
        this.f283832g = normalUserFooterPreference;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        c01.d9.e().q(30, this);
        c01.d9.e().q(ma1.a.CTRL_INDEX, this);
        c01.d9.e().q(td1.h.CTRL_INDEX, this);
    }

    @Override // hr3.eb, hr3.va
    public void f() {
        i();
        o();
        c01.d9.e().a(30, this);
        c01.d9.e().a(ma1.a.CTRL_INDEX, this);
        c01.d9.e().a(td1.h.CTRL_INDEX, this);
        super.f();
    }

    @Override // hr3.eb, hr3.va
    public void i() {
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f283832g;
        android.view.View view = normalUserFooterPreference.f153734x0;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyBaseHandler", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyBaseHandler", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = normalUserFooterPreference.f153738z1;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyBaseHandler", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/profile/ui/NormalUserFooterPreference$VertifyBaseHandler", "onDetach", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.Button button = normalUserFooterPreference.D1;
        if (button != null) {
            button.setVisibility(8);
        }
        android.widget.Button button2 = normalUserFooterPreference.G1;
        if (button2 != null) {
            button2.setVisibility(8);
        }
        android.widget.Button button3 = normalUserFooterPreference.E1;
        if (button3 != null) {
            button3.setVisibility(8);
        }
        android.widget.Button button4 = normalUserFooterPreference.C1;
        if (button4 != null) {
            button4.setVisibility(8);
        }
        android.widget.TextView textView = normalUserFooterPreference.H1;
        if (textView != null) {
            textView.setVisibility(8);
        }
        o();
    }

    @Override // hr3.va, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.List list;
        if (m1Var.getType() == 30 || m1Var.getType() == 667 || m1Var.getType() == 853) {
            o();
            com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f283832g;
            if (com.tencent.mm.sdk.platformtools.t8.U0(normalUserFooterPreference.f197770d)) {
                if (i17 == 0 && i18 == 0) {
                    if (m1Var.getType() == 30) {
                        com.tencent.mm.pluginsdk.model.m3 m3Var = (com.tencent.mm.pluginsdk.model.m3) m1Var;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VerifyBaseHandler onSceneEnd, opCode = ");
                        int i19 = m3Var.f189380g;
                        sb6.append(i19);
                        com.tencent.mars.xlog.Log.i("MicroMsg.NormalUserFooterPreference", sb6.toString());
                        if ((i19 == 1 || i19 == 3) && (list = m3Var.f189379f) != null && list.contains(normalUserFooterPreference.L.d1())) {
                            normalUserFooterPreference.I1 = true;
                            p();
                            com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference2 = ((hr3.rb) this).f283832g;
                            hr3.va vaVar = normalUserFooterPreference2.f153732p0;
                            if (vaVar != null) {
                                vaVar.i();
                            }
                            hr3.eb ebVar = new hr3.eb(normalUserFooterPreference2);
                            normalUserFooterPreference2.f153732p0 = ebVar;
                            ebVar.h();
                            java.util.Iterator it = list.iterator();
                            while (it.hasNext()) {
                                y35.r.l((java.lang.String) it.next(), normalUserFooterPreference.N, "NormalUserFooterPreference verify onsceneEnd opCode: " + i19);
                            }
                            ((com.tencent.mm.booter.notification.x) c01.d9.f()).g();
                            return;
                        }
                        return;
                    }
                    if (m1Var.getType() == 667 || m1Var.getType() == 853) {
                        normalUserFooterPreference.I1 = true;
                        p();
                        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference3 = ((hr3.rb) this).f283832g;
                        hr3.va vaVar2 = normalUserFooterPreference3.f153732p0;
                        if (vaVar2 != null) {
                            vaVar2.i();
                        }
                        hr3.eb ebVar2 = new hr3.eb(normalUserFooterPreference3);
                        normalUserFooterPreference3.f153732p0 = ebVar2;
                        ebVar2.h();
                        y35.r.l(normalUserFooterPreference.L.d1(), normalUserFooterPreference.N, "NormalUserFooterPreference verify onsceneEnd openIm");
                        ((com.tencent.mm.booter.notification.x) c01.d9.f()).g();
                        return;
                    }
                }
                com.tencent.mm.ui.MMActivity mMActivity = normalUserFooterPreference.K1;
                if (i17 == 4 && i18 == -302) {
                    int i27 = m1Var.getType() == 30 ? ((com.tencent.mm.pluginsdk.model.m3) m1Var).f189380g : 0;
                    com.tencent.mars.xlog.Log.w("MicroMsg.NormalUserFooterPreference", "VerifyBaseHandler onSceneEnd, verify relation out of date, opCode = %d", java.lang.Integer.valueOf(i27));
                    if (i27 == 3 || m1Var.getType() == 853) {
                        db5.e1.A(mMActivity, mMActivity.getString(com.tencent.mm.R.string.bja), mMActivity.getString(com.tencent.mm.R.string.f490573yv), mMActivity.getString(com.tencent.mm.R.string.f490004i6), mMActivity.getString(com.tencent.mm.R.string.f490347sg), new hr3.mb(this), null);
                        return;
                    }
                    return;
                }
                if (i17 == 4 && i18 == -24 && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    ((en.a) ((en.k) i95.n0.c(en.k.class))).aj(com.tencent.mm.sdk.platformtools.x2.f193071a, str);
                    return;
                }
                android.content.Context context = normalUserFooterPreference.f197770d;
                if (i17 == 1) {
                    if (c01.d9.e().m()) {
                        c01.d9.e().l();
                        return;
                    } else {
                        if (com.tencent.mm.network.y2.a(context)) {
                            com.tencent.mm.pluginsdk.ui.tools.l5.a(context);
                            return;
                        }
                        return;
                    }
                }
                if (i17 == 2) {
                    dp.a.makeText(context, context.getString(com.tencent.mm.R.string.f490500wu), 0).show();
                    return;
                }
                if (i17 != 4) {
                    return;
                }
                if (i18 == -100 || i18 == -2023) {
                    gm0.j1.i();
                    gm0.j1.b();
                    db5.e1.M(context, gm0.m.f273235x, i65.a.r(context, com.tencent.mm.R.string.f490573yv), new hr3.kb(this), new hr3.lb(this));
                    return;
                }
                if (i17 == 4 && i18 == -34) {
                    str = mMActivity.getString(com.tencent.mm.R.string.fbm);
                } else if (i17 == 4 && i18 == -94) {
                    str = mMActivity.getString(com.tencent.mm.R.string.fbp);
                } else if (i17 != 4 || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    str = mMActivity.getString(com.tencent.mm.R.string.iil);
                }
                dp.a.makeText(mMActivity, str, 1).show();
            }
        }
    }

    public final void p() {
        com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f283832g;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) q17).n(normalUserFooterPreference.L.d1(), true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.tencent.mm.storage.z3 z3Var = normalUserFooterPreference.L;
            if (((com.tencent.mm.storage.k4) c01.d9.b().q()).l0(z3Var)) {
                n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(normalUserFooterPreference.L.d1(), true);
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.NormalUserFooterPreference", "insert contact failed, username = " + z3Var.d1());
                n17 = null;
            }
        }
        normalUserFooterPreference.L = n17;
        com.tencent.mm.storage.z3 z3Var2 = normalUserFooterPreference.L;
        if (z3Var2 != null) {
            c01.e2.m0(z3Var2);
        }
    }
}
