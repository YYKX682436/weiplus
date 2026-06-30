package s61;

/* loaded from: classes5.dex */
public class m1 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.MMActivity f403370d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f403372f;

    /* renamed from: h, reason: collision with root package name */
    public final s61.k1 f403374h;

    /* renamed from: i, reason: collision with root package name */
    public r61.e1 f403375i;

    /* renamed from: m, reason: collision with root package name */
    public r61.e1 f403376m;

    /* renamed from: p, reason: collision with root package name */
    public final s61.l1 f403379p;

    /* renamed from: e, reason: collision with root package name */
    public boolean f403371e = false;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f403373g = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f403377n = true;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f403378o = "";

    public m1(s61.l1 l1Var, com.tencent.mm.ui.MMActivity mMActivity, s61.k1 k1Var) {
        this.f403379p = l1Var;
        this.f403370d = mMActivity;
        this.f403374h = k1Var;
        z61.a aVar = (z61.a) com.tencent.mm.sdk.event.q.f192403a.a(z61.a.class);
        com.tencent.mm.ui.MMActivity lifecycleOwner = this.f403370d;
        s61.g1 g1Var = new s61.g1(this);
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        aVar.f192369d.observe(lifecycleOwner, g1Var);
    }

    public final void a(int i17, android.os.Bundle bundle) {
        s61.l1 l1Var = s61.l1.BINDMOBILE;
        s61.l1 l1Var2 = this.f403379p;
        if (l1Var2 == l1Var || l1Var2 == s61.l1.CHANGEMOBILE) {
            gm0.j1.d().q(132, this);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f403378o)) {
            bundle.putString("policyTicket", this.f403378o);
        }
        s61.k1 k1Var = this.f403374h;
        if (k1Var != null) {
            k1Var.a(i17, bundle);
        }
    }

    public void b() {
        gm0.j1.d().q(132, this);
        this.f403370d = null;
        this.f403371e = true;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f403373g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
    }

    public final void c() {
        java.lang.String str = this.f403378o;
        s61.l1 l1Var = this.f403379p;
        com.tencent.mars.xlog.Log.i("MicroMsg.SmsBindMobileObserver", "sendGetVerifyReq %s policyTicket:%s", l1Var, str);
        s61.l1 l1Var2 = s61.l1.BINDMOBILE;
        s61.l1 l1Var3 = s61.l1.CHANGEMOBILE;
        if (l1Var == l1Var2 || l1Var == l1Var3) {
            r61.e1 e1Var = new r61.e1(this.f403372f, l1Var == l1Var3 ? 18 : 1, "", 0, "");
            this.f403376m = e1Var;
            ((r45.di) e1Var.f392860d.f70710a.f70684a).D = this.f403378o;
            gm0.j1.d().g(this.f403376m);
        }
    }

    public void d(java.lang.String str) {
        s61.l1 l1Var = s61.l1.BINDMOBILE;
        s61.l1 l1Var2 = this.f403379p;
        if (l1Var2 == l1Var || l1Var2 == s61.l1.CHANGEMOBILE) {
            gm0.j1.d().a(132, this);
        }
        this.f403372f = str;
        this.f403371e = false;
        c();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f403373g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f403370d;
        this.f403373g = db5.e1.Q(mMActivity, "", mMActivity.getString(com.tencent.mm.R.string.f490552yb), false, true, new s61.h1(this));
    }

    public void e(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SmsBindMobileObserver", "start send verify sms %s %s %s", str, str2, java.lang.Integer.valueOf(i17));
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f403372f)) {
            this.f403372f = str;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f403373g;
        if (u3Var != null) {
            u3Var.setCancelable(true);
        }
        s61.l1 l1Var = s61.l1.BINDMOBILE;
        s61.l1 l1Var2 = s61.l1.CHANGEMOBILE;
        s61.l1 l1Var3 = this.f403379p;
        if (l1Var3 == l1Var || l1Var3 == l1Var2) {
            gm0.j1.d().a(132, this);
            com.tencent.mm.autogen.events.GetSafeDeviceNameEvent getSafeDeviceNameEvent = new com.tencent.mm.autogen.events.GetSafeDeviceNameEvent();
            getSafeDeviceNameEvent.f54407g.f6951a = this.f403370d;
            getSafeDeviceNameEvent.e();
            java.lang.String str4 = getSafeDeviceNameEvent.f54408h.f7032a;
            com.tencent.mm.autogen.events.GetSafeDeviceTypeEvent getSafeDeviceTypeEvent = new com.tencent.mm.autogen.events.GetSafeDeviceTypeEvent();
            getSafeDeviceTypeEvent.e();
            java.lang.String str5 = getSafeDeviceTypeEvent.f54409g.f7148a;
            if (l1Var3 == l1Var2 && i17 != 25) {
                i17 = 19;
            }
            this.f403371e = false;
            r61.e1 e1Var = new r61.e1(this.f403372f, i17, str2, 0, "", str4, str5);
            com.tencent.mm.protobuf.f fVar = e1Var.f392860d.f70710a.f70684a;
            ((r45.di) fVar).E = str3;
            this.f403375i = e1Var;
            ((r45.di) fVar).D = this.f403378o;
            gm0.j1.d().g(this.f403375i);
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f403373g;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            com.tencent.mm.ui.MMActivity mMActivity = this.f403370d;
            this.f403373g = db5.e1.Q(mMActivity, "", mMActivity.getString(com.tencent.mm.R.string.ahe), false, true, new s61.i1(this));
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        tm.a b17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SmsBindMobileObserver", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f403373g;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (m1Var != this.f403375i && m1Var != this.f403376m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SmsBindMobileObserver", "onSceneEnd, doScene is not called by this class");
            return;
        }
        if (this.f403371e) {
            return;
        }
        boolean z17 = true;
        if (i17 == 4 && i18 == -445 && !com.tencent.mm.sdk.platformtools.t8.K0(str) && (b17 = tm.a.b(str)) != null && b17.f420400c == 9) {
            c71.b.c(this.f403370d, b17.f420398a, 0, true);
            return;
        }
        s61.l1 l1Var = s61.l1.BINDMOBILE;
        s61.l1 l1Var2 = s61.l1.CHANGEMOBILE;
        s61.l1 l1Var3 = this.f403379p;
        if ((l1Var != l1Var3 && l1Var2 != l1Var3) || m1Var.getType() != 132) {
            iz5.a.g("code path should not be here!", false);
            return;
        }
        r61.e1 e1Var = (r61.e1) m1Var;
        int I = e1Var.I();
        com.tencent.mars.xlog.Log.i("MicroMsg.SmsBindMobileObserver", "bindMobileOnSceneEnd %s %s %s %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(I));
        if (I == 1 || I == 2 || I == 18 || I == 19 || I == 25) {
            com.tencent.mm.modelbase.o oVar = e1Var.f392860d;
            if (i17 == 0 && i18 == 0) {
                if (e1Var.I() != 2 && e1Var.I() != 25 && e1Var.I() != 19) {
                    a(1, new android.os.Bundle());
                    return;
                }
                if (this.f403377n) {
                    ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                    x51.e.a(x51.e.f451990b);
                }
                android.os.Bundle bundle = new android.os.Bundle();
                if (e1Var.I() == 2) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SmsBindMobileObserver", "bind mobile check, ticket %s", ((r45.ei) oVar.f70711b.f70700a).f373509d);
                    bundle.putString("setpwd_ticket", ((r45.ei) oVar.f70711b.f70700a).f373509d);
                }
                if (((r45.ei) oVar.f70711b.f70700a).B != 0) {
                    bundle.putBoolean("restart_wechat", true);
                }
                a(2, bundle);
                return;
            }
            if (i18 == -445 || i18 == -214) {
                tm.a b18 = tm.a.b(str);
                if (b18 != null) {
                    if (b18.f420400c == 8) {
                        c71.b.c(this.f403370d, b18.f420398a, 100, true);
                    } else {
                        b18.c(this.f403370d, null, null);
                    }
                }
            } else if (i18 == -74) {
                db5.e1.m(this.f403370d, com.tencent.mm.R.string.f490712ag3, com.tencent.mm.R.string.f490573yv, null);
            } else if (i18 != -59) {
                if (i18 != -57) {
                    if (i18 == -43) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SmsBindMobileObserver", "dealErrCodeBindMobile");
                        if (l1Var == l1Var3 || l1Var3 == l1Var2) {
                            gm0.j1.u().c().w(4097, "");
                            java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(6, "");
                            gm0.j1.u().c().w(6, this.f403372f);
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                                com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
                                com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_LAST_LOGIN_USERNAME_STRING;
                                if (c17.m(u3Var2, "").equals(str2)) {
                                    gm0.j1.u().c().x(u3Var2, c01.z1.r());
                                }
                                java.util.Iterator it = ((java.util.HashSet) c01.uc.f37514c.d()).iterator();
                                while (it.hasNext()) {
                                    java.lang.String str3 = (java.lang.String) it.next();
                                    c01.uc ucVar = c01.uc.f37514c;
                                    if (str2.equals(ucVar.c(str3, "login_user_name"))) {
                                        ucVar.h(str3, "login_user_name", str3);
                                    }
                                }
                            }
                            ((m61.i) ((y61.e) i95.n0.c(y61.e.class))).getClass();
                            x51.e.a(x51.e.f451990b);
                        }
                        a(2, new android.os.Bundle());
                        dp.a.makeText(this.f403370d, com.tencent.mm.R.string.f490713ag4, 0).show();
                    } else if (i18 == -41) {
                        dp.a.makeText(this.f403370d, com.tencent.mm.R.string.ag6, 0).show();
                    } else if (i18 != -1) {
                        switch (i18) {
                            case -36:
                                dp.a.makeText(this.f403370d, com.tencent.mm.R.string.ag9, 0).show();
                                break;
                            case -35:
                                db5.e1.m(this.f403370d, com.tencent.mm.R.string.f490714ag5, com.tencent.mm.R.string.aho, new s61.j1(this));
                                break;
                            case -34:
                                dp.a.makeText(this.f403370d, com.tencent.mm.R.string.ag7, 0).show();
                                break;
                            default:
                                z17 = false;
                                break;
                        }
                    }
                }
                dp.a.makeText(this.f403370d, com.tencent.mm.R.string.f490391to, 0).show();
            } else {
                db5.e1.m(this.f403370d, com.tencent.mm.R.string.ag8, com.tencent.mm.R.string.f490573yv, null);
            }
            if (z17) {
                if (i18 == -445) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("setpwd_ticket", ((r45.ei) oVar.f70711b.f70700a).E);
                    a(3, bundle2);
                    return;
                }
                return;
            }
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            com.tencent.mm.ui.MMActivity mMActivity = this.f403370d;
            ((com.tencent.mm.app.o7) wi6).getClass();
            if (com.tencent.mm.ui.pc.a(mMActivity, i17, i18, str, 4)) {
                return;
            }
            com.tencent.mm.ui.MMActivity mMActivity2 = this.f403370d;
            dp.a.makeText(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.ahh, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18)), 0).show();
        }
    }
}
