package hr3;

/* loaded from: classes11.dex */
public abstract class va implements com.tencent.mm.modelbase.u0, i35.e {

    /* renamed from: d, reason: collision with root package name */
    public boolean f284108d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference f284109e;

    public va(com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference) {
        this.f284109e = normalUserFooterPreference;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(hr3.va r11) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr3.va.b(hr3.va):void");
    }

    @Override // i35.e
    public void K0(java.lang.String str, int i17, r45.g25 g25Var) {
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f284109e;
        if (i17 != 0) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(g25Var.f374841d)) {
                db5.e1.s(normalUserFooterPreference.K1, g25Var.f374841d, g25Var.f374842e);
                return;
            } else {
                com.tencent.mm.ui.MMActivity mMActivity = normalUserFooterPreference.K1;
                db5.e1.s(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490368t1), "");
                return;
            }
        }
        if (!str.equals(normalUserFooterPreference.L.d1())) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NormalUserFooterPreference", "not current contact %s,%s", normalUserFooterPreference.L.d1(), str);
            return;
        }
        int i18 = normalUserFooterPreference.N;
        if (i18 == 12) {
            r61.w1 h17 = m61.k.Ri().h(str);
            if (h17 != null) {
                h17.f392979b = 1;
                m61.k.Ri().i(h17.f392978a, h17);
            }
        } else if (i18 == 13) {
            r61.a h18 = m61.k.wi().h(str);
            if (h18 != null && !com.tencent.mm.sdk.platformtools.t8.K0(h18.f392805u)) {
                h18.f392799o = 1;
                m61.k.wi().j(h18.e(), h18);
            }
        } else if (i18 != 31) {
            switch (i18) {
                case 58:
                case com.tencent.mm.plugin.appbrand.jsapi.k9.CTRL_INDEX /* 59 */:
                case 60:
                    m61.k.Di().P0(str, 2, 0);
                    break;
            }
        } else {
            r61.f0 Bi = m61.k.Bi();
            Bi.getClass();
            r61.e0 e0Var = null;
            android.database.Cursor f17 = Bi.f392869d.f("select facebookfriend.fbid,facebookfriend.fbname,facebookfriend.fbimgkey,facebookfriend.status,facebookfriend.username,facebookfriend.nickname,facebookfriend.nicknamepyinitial,facebookfriend.nicknamequanpin,facebookfriend.sex,facebookfriend.personalcard,facebookfriend.province,facebookfriend.city,facebookfriend.signature,facebookfriend.alias,facebookfriend.type,facebookfriend.email from facebookfriend   where facebookfriend.username = \"" + str + "\"", null, 2);
            if (f17 != null) {
                if (f17.moveToFirst()) {
                    e0Var = new r61.e0();
                    e0Var.a(f17);
                }
                f17.close();
            }
            if (e0Var != null) {
                e0Var.f392845d = 100;
                m61.k.Bi().m0(e0Var);
            }
        }
        if (normalUserFooterPreference.N == 9) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NormalUserFooterPreference", "add scene unkown, check the contact getsource: " + normalUserFooterPreference.L.getSource());
            int source = normalUserFooterPreference.L.getSource();
            if (source == 10 || source == 13) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NormalUserFooterPreference", "delete the system contact info added by wechat");
            }
        }
        if (normalUserFooterPreference.P == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.u(intent, normalUserFooterPreference.f197770d);
        } else {
            com.tencent.mm.ui.MMActivity mMActivity2 = normalUserFooterPreference.K1;
            mMActivity2.setResult(-1, mMActivity2.getIntent().putExtra("_delete_ok_", true));
            ((android.app.Activity) normalUserFooterPreference.f197770d).finish();
        }
    }

    public final void a(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NormalUserFooterPreference", "mod stranger remark, username is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f284109e;
        intent.putExtra("Contact_Scene", normalUserFooterPreference.N);
        intent.putExtra("Contact_mode_name_type", 0);
        intent.putExtra("Contact_ModStrangerRemark", true);
        intent.putExtra("Contact_User", normalUserFooterPreference.L.d1());
        intent.putExtra("Contact_Nick", normalUserFooterPreference.L.P0());
        intent.putExtra("Contact_RemarkName", normalUserFooterPreference.L.w0());
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.y(intent, normalUserFooterPreference.f197770d);
    }

    public void c() {
        java.lang.String str;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f284109e;
        g0Var.d(14553, 2, 2, normalUserFooterPreference.L.d1());
        java.lang.String d17 = normalUserFooterPreference.L.d1();
        if (c01.e2.M(d17)) {
            normalUserFooterPreference.L.s3();
            ((e21.z0) c01.d9.b().w()).c(new e21.l(d17, true));
            ((com.tencent.mm.storage.k4) c01.d9.b().q()).k(d17);
            ((com.tencent.mm.storage.b3) c01.d9.b().l()).y0(d17);
            return;
        }
        this.f284108d = false;
        android.content.Context context = normalUserFooterPreference.f197770d;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), normalUserFooterPreference.f197770d.getString(com.tencent.mm.R.string.f490604zq), true, true, new hr3.ga(this));
        if (this.f284108d) {
            str = null;
        } else {
            str = ((ng0.o) ((og0.n) i95.n0.c(og0.n.class))).wi(normalUserFooterPreference.L.d1());
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            d(d17);
            return;
        }
        Q.dismiss();
        android.content.Context context2 = normalUserFooterPreference.f197770d;
        db5.e1.L(context2, false, context2.getString(com.tencent.mm.R.string.f493525kl3, str), null, normalUserFooterPreference.f197770d.getString(com.tencent.mm.R.string.fs8), normalUserFooterPreference.f197770d.getString(com.tencent.mm.R.string.boj), new hr3.ha(this), new hr3.ia(this, Q, d17), -1, com.tencent.mm.R.color.f478622ch);
    }

    public final void d(java.lang.String str) {
        this.f284109e.L.s3();
        if (com.tencent.mm.storage.z3.m4(str)) {
            ((np.h) ((vg3.e4) i95.n0.c(vg3.e4.class))).wi(str);
            ((c01.k7) c01.n8.a()).e(str);
        } else {
            aq1.n nVar = (aq1.n) ((i35.g) gm0.j1.s(i35.g.class));
            nVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.DeleteContactService", "delete contact %s", str);
            nVar.a(str, true);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r10 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference r1 = r10.f284109e
            int r2 = r1.N
            r3 = 45
            r4 = 1
            java.lang.String r5 = "k_outside_expose_proof_item_list"
            if (r2 == r4) goto L98
            r6 = 2
            if (r2 == r6) goto L98
            r7 = 3
            if (r2 == r7) goto L98
            r8 = 9
            r9 = 35
            if (r2 == r8) goto La6
            r8 = 18
            if (r2 == r8) goto L84
            switch(r2) {
                case 12: goto L98;
                case 13: goto L98;
                case 14: goto La6;
                default: goto L23;
            }
        L23:
            switch(r2) {
                case 22: goto L70;
                case 23: goto L70;
                case 24: goto L70;
                case 25: goto L3b;
                case 26: goto L70;
                case 27: goto L70;
                case 28: goto L70;
                case 29: goto L70;
                case 30: goto L2b;
                default: goto L26;
            }
        L26:
            switch(r2) {
                case 58: goto L98;
                case 59: goto L98;
                case 60: goto L98;
                default: goto L29;
            }
        L29:
            goto La6
        L2b:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
            r9 = 7
            java.util.ArrayList r2 = r21.a.b(r9, r2)
            r0.putStringArrayListExtra(r5, r2)
            goto La6
        L3b:
            boolean r2 = r1.Q
            if (r2 == 0) goto L41
            r4 = 6
            goto L42
        L41:
            r4 = 5
        L42:
            r9 = r4
            if (r2 == 0) goto L53
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
            java.util.ArrayList r2 = r21.a.b(r9, r2)
            r0.putExtra(r5, r2)
            goto La6
        L53:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.K2
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r2 != 0) goto L62
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.K2
            goto L68
        L62:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
        L68:
            java.util.ArrayList r2 = r21.a.a(r2)
            r0.putExtra(r5, r2)
            goto La6
        L70:
            boolean r2 = r1.Q
            if (r2 == 0) goto L75
            r7 = 4
        L75:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
            java.util.ArrayList r2 = r21.a.d(r2)
            r0.putStringArrayListExtra(r5, r2)
            r9 = r7
            goto La6
        L84:
            boolean r2 = r1.Q
            if (r2 == 0) goto L89
            r4 = r6
        L89:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
            java.util.ArrayList r2 = r21.a.c(r2)
            r0.putStringArrayListExtra(r5, r2)
            r9 = r4
            goto La6
        L98:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
            java.util.ArrayList r2 = r21.a.b(r3, r2)
            r0.putExtra(r5, r2)
            r9 = r3
        La6:
            com.tencent.mm.storage.z3 r2 = r1.L
            boolean r2 = r2.r2()
            if (r2 != 0) goto Laf
            goto Lb0
        Laf:
            r3 = r9
        Lb0:
            com.tencent.mm.storage.z3 r2 = r1.L
            java.lang.String r2 = r2.d1()
            java.lang.String r4 = "k_username"
            r0.putExtra(r4, r2)
            java.lang.String r2 = "showShare"
            r4 = 0
            r0.putExtra(r2, r4)
            java.lang.String r2 = com.tencent.mm.ui.n2.f209398a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.String r3 = "rawUrl"
            r0.putExtra(r3, r2)
            com.tencent.mm.ui.MMActivity r1 = r1.K1
            r2 = 0
            java.lang.String r3 = "webview"
            java.lang.String r4 = ".ui.tools.WebViewUI"
            j45.l.j(r1, r3, r4, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hr3.va.e():void");
    }

    public abstract void f();

    public void g() {
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f284109e;
        if (normalUserFooterPreference.V) {
            normalUserFooterPreference.K1.showOptionMenu(false);
            return;
        }
        if (c01.z1.r().equals(normalUserFooterPreference.L.d1())) {
            return;
        }
        if (!normalUserFooterPreference.L.r2()) {
            k(false, false);
        } else {
            if (com.tencent.mm.storage.z3.R3(normalUserFooterPreference.L.d1())) {
                return;
            }
            j();
        }
    }

    public void h() {
        f();
        g();
        com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = this.f284109e;
        normalUserFooterPreference.D1.setOnClickListener(new hr3.pa(this));
        normalUserFooterPreference.G1.setOnClickListener(new hr3.qa(this));
        normalUserFooterPreference.E1.setOnClickListener(new hr3.ra(this));
        normalUserFooterPreference.f153737y1.setOnClickListener(new hr3.sa(this));
        normalUserFooterPreference.A1.setOnClickListener(new hr3.ta(this));
        normalUserFooterPreference.F1.setOnClickListener(new hr3.ua(this));
        ((java.util.ArrayList) ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).f13070d).add(this);
    }

    public void i() {
        ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(this);
    }

    public void j() {
        this.f284109e.K1.addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new hr3.ja(this));
    }

    public void k(boolean z17, boolean z18) {
        if (z17 && z18) {
            return;
        }
        this.f284109e.K1.addIconOptionMenu(0, com.tencent.mm.R.raw.icons_outlined_more, new hr3.oa(this, z17, z18));
    }

    public final void l() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f284109e.K1, 1, false);
        k0Var.f211872n = new hr3.da(this);
        k0Var.f211855d2 = true;
        k0Var.Y1 = true;
        k0Var.f211881s = new hr3.ea(this);
        k0Var.v();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NormalUserFooterPreference", "onSceneEnd: errType = " + i17 + " errCode = " + i18 + " errMsg = " + str + " " + m1Var.getType());
    }
}
