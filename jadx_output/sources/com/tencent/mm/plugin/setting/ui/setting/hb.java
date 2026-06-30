package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public final class hb extends wm3.a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f161102d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f161103e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f161104f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f161105g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f161106h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f161107i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f161107i = true;
    }

    public final void T6() {
        if (this.f161106h) {
            return;
        }
        this.f161106h = true;
        java.lang.Object l17 = gm0.j1.u().c().l(5, null);
        this.f161104f = l17 instanceof java.lang.String ? (java.lang.String) l17 : null;
        gm0.j1.d().a(138, this);
        gm0.j1.d().a(254, this);
        gm0.j1.d().a(256, this);
        gm0.j1.d().a(108, this);
        gm0.j1.d().a(255, this);
    }

    public final void U6() {
        gm0.j1.d().q(138, this);
        gm0.j1.d().q(254, this);
        gm0.j1.d().q(256, this);
        gm0.j1.d().q(108, this);
        gm0.j1.d().q(255, this);
    }

    public final void V6() {
        X6();
        U6();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_EMAIL_VERIFY_SEND_TIME_LONG, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()));
        android.content.Intent intent = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
        pf5.j0.a(intent, com.tencent.mm.plugin.setting.ui.setting.tb.class);
        pf5.j0.a(intent, v14.y.class);
        intent.putExtra("verify_email_address", this.f161105g);
        lk5.s.e(intent, true);
        android.app.Activity context = getContext();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(2);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsEmailCgiUIC", "sendEmailVerifySuccess", "()V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void W6(java.lang.String emailAddress, boolean z17) {
        kotlin.jvm.internal.o.g(emailAddress, "emailAddress");
        T6();
        this.f161107i = z17;
        this.f161105g = emailAddress;
        if (!com.tencent.mm.sdk.platformtools.t8.Y0(emailAddress)) {
            db5.e1.i(getContext(), com.tencent.mm.R.string.f493438k64, com.tencent.mm.R.string.f490573yv);
            return;
        }
        java.lang.Object l17 = gm0.j1.u().c().l(7, null);
        kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
        boolean z18 = (((java.lang.Integer) l17).intValue() & 2) != 0;
        if (kotlin.jvm.internal.o.b(this.f161105g, this.f161104f) && z18) {
            return;
        }
        v61.i0 i0Var = new v61.i0(1, this.f161105g);
        gm0.j1.d().g(i0Var);
        this.f161102d = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.ipz), true, true, new com.tencent.mm.plugin.setting.ui.setting.gb(i0Var));
    }

    public final void X6() {
        if (this.f161106h) {
            U6();
            this.f161104f = null;
            this.f161106h = false;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MiroMsg.SettingsEmailCgiUIC", "REQUEST_CODE_VERIFY_EMAIL");
            com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
            if (P6 != null) {
                P6.finish();
                return;
            }
            return;
        }
        if (i18 == -1) {
            com.tencent.mars.xlog.Log.i("MiroMsg.SettingsEmailCgiUIC", "summerunbind REQUEST_CODE_SET_PSW ok and start NetSceneCheckUnBind again oldEmail: " + this.f161104f + " newEmail: " + this.f161105g);
            gm0.j1.d().g(new r61.f1(4));
            this.f161102d = db5.e1.Q(getContext(), getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.irw), true, true, com.tencent.mm.plugin.setting.ui.setting.na.f161354d);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i("MiroMsg.SettingsEmailCgiUIC", "email cgi listener onCreate");
        T6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MiroMsg.SettingsEmailCgiUIC", "email cgi listener onDestroy");
        X6();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd: sceneType = ");
        kotlin.jvm.internal.o.d(m1Var);
        sb6.append(m1Var.getType());
        sb6.append(" errType = ");
        sb6.append(i17);
        sb6.append(" errCode = ");
        sb6.append(i18);
        sb6.append(" errMsg = ");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MiroMsg.SettingsEmailCgiUIC", sb6.toString());
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f161102d;
        if (u3Var != null) {
            u3Var.dismiss();
            this.f161102d = null;
        }
        o25.s1 a17 = f14.g.a();
        android.app.Activity context = getContext();
        ((com.tencent.mm.app.o7) a17).getClass();
        if (com.tencent.mm.ui.pc.a(context, i17, i18, str, 4)) {
            return;
        }
        if (m1Var.getType() == 254) {
            if (i17 == 0 && i18 == 0) {
                r61.f1 f1Var = (r61.f1) m1Var;
                this.f161103e = ((r45.t20) f1Var.f392871e.f70711b.f70700a).f386076e;
                f1Var.H();
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f161103e)) {
                    gm0.j1.d().g(new com.tencent.mm.modelsimple.w0(2));
                    return;
                } else {
                    gm0.j1.d().g(new v61.i0(2, this.f161104f));
                    return;
                }
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f161102d;
            if (u3Var2 != null) {
                u3Var2.dismiss();
                this.f161102d = null;
            }
            if (i18 == -3) {
                db5.e1.C(getContext(), getString(com.tencent.mm.R.string.j0f), null, getString(com.tencent.mm.R.string.j0g), getString(com.tencent.mm.R.string.j0e), true, new com.tencent.mm.plugin.setting.ui.setting.wa(this), com.tencent.mm.plugin.setting.ui.setting.xa.f161733d);
                return;
            }
            switch (i18) {
                case -85:
                    db5.e1.m(getContext(), com.tencent.mm.R.string.inq, com.tencent.mm.R.string.f490573yv, com.tencent.mm.plugin.setting.ui.setting.bb.f160865d);
                    return;
                case -84:
                    db5.e1.m(getContext(), com.tencent.mm.R.string.inv, com.tencent.mm.R.string.f490573yv, com.tencent.mm.plugin.setting.ui.setting.ab.f160809d);
                    return;
                case -83:
                    db5.e1.m(getContext(), com.tencent.mm.R.string.inu, com.tencent.mm.R.string.f490573yv, com.tencent.mm.plugin.setting.ui.setting.za.f161820d);
                    return;
                case -82:
                    db5.e1.m(getContext(), com.tencent.mm.R.string.inx, com.tencent.mm.R.string.f490573yv, com.tencent.mm.plugin.setting.ui.setting.ya.f161781d);
                    return;
                default:
                    return;
            }
        }
        if (m1Var.getType() != 256) {
            if (m1Var.getType() != 138) {
                if (m1Var.getType() == 108) {
                    com.tencent.mm.ui.widget.dialog.u3 u3Var3 = this.f161102d;
                    if (u3Var3 != null) {
                        u3Var3.dismiss();
                        this.f161102d = null;
                    }
                    if (i17 == 0 && i18 == 0) {
                        V6();
                        return;
                    } else {
                        db5.e1.t(getContext(), getContext().getString(com.tencent.mm.R.string.iqb, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), getString(com.tencent.mm.R.string.f490573yv), com.tencent.mm.plugin.setting.ui.setting.ta.f161569d);
                        return;
                    }
                }
                if (m1Var.getType() == 255) {
                    if (i18 == 0) {
                        gm0.j1.d().g(new v61.i0(2, this.f161104f));
                        return;
                    }
                    com.tencent.mm.ui.widget.dialog.u3 u3Var4 = this.f161102d;
                    if (u3Var4 != null) {
                        u3Var4.dismiss();
                        this.f161102d = null;
                    }
                    db5.e1.C(getContext(), getString(com.tencent.mm.R.string.j0f), null, getString(com.tencent.mm.R.string.j0g), getString(com.tencent.mm.R.string.j0e), true, new com.tencent.mm.plugin.setting.ui.setting.ua(this), com.tencent.mm.plugin.setting.ui.setting.va.f161638d);
                    return;
                }
                return;
            }
            return;
        }
        ((com.tencent.mm.app.o7) f14.g.a()).Zi();
        com.tencent.mm.protobuf.f fVar = ((v61.i0) m1Var).f433448e.f70710a.f70684a;
        if (((r45.rh) fVar).f384861d != 1) {
            if (((r45.rh) fVar).f384861d == 2) {
                com.tencent.mm.ui.widget.dialog.u3 u3Var5 = this.f161102d;
                if (u3Var5 != null) {
                    u3Var5.dismiss();
                    this.f161102d = null;
                }
                if (i17 != 0 || i18 != 0) {
                    o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                    androidx.appcompat.app.AppCompatActivity activity = getActivity();
                    ((com.tencent.mm.app.o7) wi6).getClass();
                    com.tencent.mm.ui.pc.a(activity, i17, i18, str, 4);
                    return;
                }
                java.lang.Object l17 = gm0.j1.u().c().l(7, null);
                kotlin.jvm.internal.o.e(l17, "null cannot be cast to non-null type kotlin.Int");
                gm0.j1.u().c().w(7, java.lang.Integer.valueOf(((java.lang.Integer) l17).intValue() | 2));
                if (com.tencent.mm.sdk.platformtools.t8.K0(this.f161103e)) {
                    db5.e1.m(getContext(), com.tencent.mm.R.string.inr, com.tencent.mm.R.string.f490573yv, com.tencent.mm.plugin.setting.ui.setting.sa.f161535d);
                    return;
                } else {
                    db5.e1.y(getContext(), this.f161103e, "", getString(com.tencent.mm.R.string.f490455vj), com.tencent.mm.plugin.setting.ui.setting.ra.f161501d);
                    getActivity().finish();
                    return;
                }
            }
            return;
        }
        if (i17 == 0 && i18 == 0) {
            if (this.f161107i) {
                V6();
                return;
            }
            android.app.Activity context2 = getContext();
            int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context2);
            e4Var.f211776c = "已发送";
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            e4Var.c();
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var6 = this.f161102d;
        if (u3Var6 != null) {
            u3Var6.dismiss();
            this.f161102d = null;
        }
        switch (i18) {
            case -86:
                db5.e1.m(getContext(), com.tencent.mm.R.string.iny, com.tencent.mm.R.string.f490573yv, com.tencent.mm.plugin.setting.ui.setting.pa.f161432d);
                return;
            case -85:
                db5.e1.m(getContext(), com.tencent.mm.R.string.inq, com.tencent.mm.R.string.f490573yv, com.tencent.mm.plugin.setting.ui.setting.oa.f161385d);
                return;
            case -84:
                db5.e1.m(getContext(), com.tencent.mm.R.string.inv, com.tencent.mm.R.string.f490573yv, com.tencent.mm.plugin.setting.ui.setting.eb.f160991d);
                return;
            case -83:
                db5.e1.m(getContext(), com.tencent.mm.R.string.inu, com.tencent.mm.R.string.f490573yv, com.tencent.mm.plugin.setting.ui.setting.db.f160939d);
                return;
            case -82:
                db5.e1.m(getContext(), com.tencent.mm.R.string.inx, com.tencent.mm.R.string.f490573yv, com.tencent.mm.plugin.setting.ui.setting.cb.f160906d);
                return;
            default:
                o25.s1 wi7 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
                androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
                ((com.tencent.mm.app.o7) wi7).getClass();
                if (com.tencent.mm.ui.pc.a(activity2, i17, i18, str, 4)) {
                    return;
                }
                db5.e1.t(getContext(), getContext().getString(com.tencent.mm.R.string.iqb, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), getString(com.tencent.mm.R.string.f490573yv), com.tencent.mm.plugin.setting.ui.setting.qa.f161469d);
                return;
        }
    }
}
