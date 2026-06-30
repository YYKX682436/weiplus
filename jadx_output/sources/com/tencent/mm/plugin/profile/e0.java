package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public class e0 implements t25.b, p94.m0 {
    public static boolean D;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f153420d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f153421e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f153422f;

    /* renamed from: g, reason: collision with root package name */
    public int f153423g;

    /* renamed from: h, reason: collision with root package name */
    public int f153424h;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f153431r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f153432s;

    /* renamed from: t, reason: collision with root package name */
    public cr3.d0 f153433t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f153434u;

    /* renamed from: x, reason: collision with root package name */
    public com.tencent.mm.plugin.profile.ui.MultiButtonPreference f153437x;

    /* renamed from: i, reason: collision with root package name */
    public boolean f153425i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f153426m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f153427n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f153428o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f153429p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f153430q = false;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f153435v = new java.util.LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public boolean f153436w = false;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.Map f153438y = new java.util.HashMap();

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f153439z = null;
    public final com.tencent.mm.sdk.event.IListener A = new com.tencent.mm.plugin.profile.NewContactWidgetNormal$25(this, com.tencent.mm.app.a0.f53288d);
    public boolean B = false;
    public long C = 0;

    public e0(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f153420d = mMActivity;
    }

    public static void b(com.tencent.mm.plugin.profile.e0 e0Var, com.tencent.mm.storage.z3 z3Var, int i17, java.lang.String str) {
        r61.a h17;
        int i18;
        e0Var.getClass();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewContactWidgetNormal", "addContact respUsername is empty");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(931, 21);
        }
        if (((int) z3Var.E2) == 0) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                z3Var.X1(str);
            }
            ((com.tencent.mm.storage.k4) c01.d9.b().q()).i0(z3Var);
            ((com.tencent.mm.storage.k4) c01.d9.b().q()).m(z3Var.d1());
        } else if (com.tencent.mm.sdk.platformtools.t8.D0(z3Var.d1(), z3Var.J0()) && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str;
            java.lang.String d17 = z3Var.d1();
            if (d17 == null) {
                d17 = "";
            }
            objArr[1] = d17;
            java.lang.String J0 = z3Var.J0();
            objArr[2] = J0 != null ? J0 : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "addContact respUsername:%s, username:%s, encryptUsername:%s", objArr);
            z3Var.X1(str);
        }
        if (((int) z3Var.E2) <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewContactWidgetNormal", "addContact : insert contact failed");
            return;
        }
        if (!z3Var.r2() && i17 == 15 && (h17 = m61.k.wi().h(z3Var.d1())) != null && !com.tencent.mm.sdk.platformtools.t8.K0(z3Var.E1)) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.String d18 = z3Var.d1();
            java.lang.Integer valueOf = java.lang.Integer.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(h17.e()) ? 1 : 0);
            java.lang.String[] b17 = com.tencent.mm.contact.a.b(z3Var);
            if (b17 == null) {
                i18 = 0;
            } else {
                i18 = 5;
                if (b17.length < 5) {
                    i18 = b17.length;
                }
            }
            g0Var.d(12040, d18, 3, valueOf, java.lang.Integer.valueOf(i18));
        }
        c01.e2.m0(z3Var);
        ((com.tencent.mm.ui.base.preference.h0) e0Var.f153422f).notifyDataSetChanged();
        r61.z1.c(z3Var.J0(), 0);
        com.tencent.mm.autogen.events.RecoverAccountFriendEvent recoverAccountFriendEvent = new com.tencent.mm.autogen.events.RecoverAccountFriendEvent();
        java.lang.String J02 = z3Var.J0();
        am.hq hqVar = recoverAccountFriendEvent.f54666g;
        hqVar.f6862a = J02;
        hqVar.f6863b = 1;
        recoverAccountFriendEvent.e();
    }

    public final void A(com.tencent.mm.storage.z3 z3Var, com.tencent.mm.storage.e9 e9Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "verifyUser user:%s", z3Var.d1());
        com.tencent.mm.storage.ya z07 = ((com.tencent.mm.storage.ab) c01.d9.b().B()).z0(z3Var.d1());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("Contact_Nick", z3Var.P0());
        if (z07 != null) {
            intent.putExtra("Contact_RemarkName", z07.field_conRemark);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(e9Var.f193884z)) {
            com.tencent.mm.storage.a3 z08 = ((com.tencent.mm.storage.b3) c01.d9.b().l()).z0(e9Var.f193884z);
            if (z08 != null) {
                intent.putExtra("Contact_RoomNickname", z08.z0(e9Var.f193859a));
                intent.putExtra("room_name", e9Var.f193884z);
            }
        }
        intent.putExtra("Contact_Scene", e9Var.f193866h);
        intent.putExtra("Verify_ticket", e9Var.f193878t);
        intent.putExtra("sayhi_with_sns_perm_send_verify", false);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", true);
        intent.putExtra("sayhi_with_jump_to_profile", true);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 7);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 2);
        java.lang.String str = (com.tencent.mm.storage.z3.m4(z3Var.d1()) || Ni != 1) ? (com.tencent.mm.storage.z3.m4(z3Var.d1()) || Ni != 2 || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? ".ui.SayHiWithSnsPermissionUI" : ".ui.SayHiWithSnsPermissionUI3" : ".ui.SayHiWithSnsPermissionUI2";
        boolean m47 = com.tencent.mm.storage.z3.m4(z3Var.d1());
        com.tencent.mm.ui.MMActivity mMActivity = this.f153420d;
        if ((m47 || com.tencent.mm.storage.z3.n4(z3Var.d1())) && !com.tencent.mm.sdk.platformtools.f9.ContactNewFriendWeWeCom.k(mMActivity, null)) {
            return;
        }
        j45.l.j(mMActivity, com.google.android.gms.common.Scopes.PROFILE, str, intent, null);
    }

    public final void B(java.lang.String str, com.tencent.mm.storage.z3 z3Var) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewContactWidgetNormal", "view stranger remark, username is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_Scene", this.f153423g);
        intent.putExtra("Contact_mode_name_type", 0);
        intent.putExtra("Contact_ModStrangerRemark", true);
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("Contact_Nick", z3Var.P0());
        intent.putExtra("Contact_RemarkName", z3Var.w0());
        com.tencent.mm.ui.MMActivity mMActivity = this.f153420d;
        intent.putExtra("Contact_RoomNickname", mMActivity.getIntent().getStringExtra("Contact_RoomNickname"));
        int intExtra = mMActivity.getIntent().getIntExtra("key_label_click_source", 0);
        if (intExtra != 0) {
            intent.putExtra("CONTACT_INFO_UI_SOURCE", intExtra);
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.y(intent, mMActivity);
    }

    @Override // p94.m0
    public void B4(java.lang.String str, java.lang.String str2, boolean z17, int i17, p94.d0 d0Var, boolean z18) {
    }

    @Override // p94.m0
    public void O0(java.lang.String str, boolean z17, int i17, p94.d0 d0Var) {
        com.tencent.mm.ui.base.preference.s sVar = (com.tencent.mm.ui.base.preference.s) ((com.tencent.mm.ui.base.preference.h0) this.f153422f).h("contact_profile_sns");
        if (sVar == null || p94.w0.c() == null) {
            return;
        }
        com.tencent.mm.pluginsdk.ui.preference.SnsPreference snsPreference = (com.tencent.mm.pluginsdk.ui.preference.SnsPreference) sVar;
        snsPreference.M(this.f153421e.d1());
        com.tencent.mm.plugin.sns.statistics.s0.f164937k0.y().f60774g = snsPreference.Z != null ? ((java.util.LinkedList) r5).size() : 0;
        if (p94.w0.b() != null) {
            ((com.tencent.mm.plugin.sns.model.d6) p94.w0.b()).c(this, 3);
        }
        ((com.tencent.mm.ui.base.preference.h0) this.f153422f).notifyDataSetChanged();
        if (!d0Var.o() || p94.w0.b() == null) {
            return;
        }
        p94.n0 b17 = p94.w0.b();
        java.lang.String d17 = this.f153421e.d1();
        ((com.tencent.mm.plugin.sns.model.d6) b17).getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("deleteBg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
        java.lang.String Di = com.tencent.mm.plugin.sns.model.l4.Di();
        java.lang.String str2 = d17 + "bg_";
        java.lang.String str3 = d17 + "tbg_";
        if (com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mm.vfs.w6.h(com.tencent.mm.plugin.sns.model.f6.d(Di, d17) + str3);
            com.tencent.mm.vfs.w6.P(com.tencent.mm.plugin.sns.model.f6.d(Di, d17), str2, str3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("deleteBg", "com.tencent.mm.plugin.sns.model.SnsLogic$SnsServer");
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x0797, code lost:
    
        if ((((i41.l) i95.n0.c(i41.l.class)).Ri().z0(r2.d1()) & 1) > 0) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x07ac, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0a7a, code lost:
    
        if ((r4.getIntent().getIntExtra("Contact_Scene", -1) == 14) != false) goto L392;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x07aa, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x07a8, code lost:
    
        if ((r11.f371428d & 1) > 0) goto L273;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x08e0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0a3b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0b3d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0b71  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0b9d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0bfe  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0c71  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0cb1  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0ca3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0c6c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0be9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0b8a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0ac2  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0a4e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x07c4  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0608  */
    @Override // t25.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Q(com.tencent.mm.ui.base.preference.r r37, com.tencent.mm.storage.z3 r38, boolean r39, int r40) {
        /*
            Method dump skipped, instructions count: 3302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.e0.Q(com.tencent.mm.ui.base.preference.r, com.tencent.mm.storage.z3, boolean, int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0717  */
    @Override // t25.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean R(java.lang.String r33) {
        /*
            Method dump skipped, instructions count: 3343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.e0.R(java.lang.String):boolean");
    }

    @Override // p94.m0
    public void S0(java.lang.String str, boolean z17, int i17, p94.d0 d0Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.content.Context context, com.tencent.mm.storage.z3 z3Var) {
        java.lang.Class cls;
        int i17;
        if (c01.e2.a0() && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && (i17 = this.f153423g) != 14 && i17 != 30) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).na(context, context.getString(com.tencent.mm.R.string.jtx));
            return;
        }
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        mMActivity.getIntent().removeExtra("Accept_NewFriend_FromOutside");
        cls = com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.class;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) (bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.friend.RepairerConfigTestJumpSayHi3()) == 1 ? com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI3.class : (com.tencent.mm.storage.z3.m4(z3Var.d1()) || c01.e2.k() < ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_add_friends_without_choose_permission_threshold, 5000)) ? com.tencent.mm.plugin.profile.ui.SayHiWithSnsPermissionUI.class : cls));
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("room_name", this.f153432s);
        intent.putExtra("Contact_Nick", z3Var.P0());
        intent.putExtra("Contact_RemarkName", z3Var.w0());
        int i18 = this.f153423g;
        if (i18 == 14 || i18 == 8) {
            intent.putExtra("Contact_RoomNickname", mMActivity.getIntent().getStringExtra("Contact_RoomNickname"));
        }
        intent.putExtra("Contact_Scene", this.f153423g);
        java.lang.String stringExtra = ((android.app.Activity) context).getIntent().getStringExtra("Verify_ticket");
        if (stringExtra == null) {
            stringExtra = "";
        }
        intent.putExtra("Verify_ticket", stringExtra);
        intent.putExtra("sayhi_with_sns_perm_send_verify", false);
        intent.putExtra("sayhi_with_sns_perm_add_remark", true);
        intent.putExtra("sayhi_with_sns_perm_set_label", true);
        intent.putExtra("sayhi_with_sns_permission", z3Var.x2());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "acceptContact", "(Landroid/content/Context;Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "acceptContact", "(Landroid/content/Context;Lcom/tencent/mm/storage/Contact;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0138 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.tencent.mm.ui.MMActivity r22, com.tencent.mm.storage.z3 r23, int r24, boolean r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 1076
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.e0.c(com.tencent.mm.ui.MMActivity, com.tencent.mm.storage.z3, int, boolean, java.lang.String):void");
    }

    public void d(final com.tencent.mm.ui.MMActivity mMActivity, final com.tencent.mm.storage.z3 z3Var, final int i17, final boolean z17, final java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "dealAddContactPreCheck() called with: context = [" + mMActivity + "], user = [" + z3Var + "], addContactScene = [" + i17 + "], hasCheckNeedConfirm = [" + z17 + "]");
        ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Ai(mMActivity, new ns.j() { // from class: com.tencent.mm.plugin.profile.e0$$d
            @Override // ns.j
            public final void a(boolean z18) {
                com.tencent.mm.plugin.profile.e0 e0Var = com.tencent.mm.plugin.profile.e0.this;
                com.tencent.mm.ui.MMActivity mMActivity2 = mMActivity;
                com.tencent.mm.storage.z3 z3Var2 = z3Var;
                int i18 = i17;
                boolean z19 = z17;
                java.lang.String str2 = str;
                if (!z18) {
                    e0Var.c(mMActivity2, z3Var2, i18, z19, str2);
                    return;
                }
                e0Var.getClass();
                ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Bi(mMActivity2, 3, z3Var2.d1(), new com.tencent.mm.plugin.profile.o0(e0Var, mMActivity2, z3Var2, i18, z19, str2));
            }
        });
        if (k()) {
            com.tencent.mm.ui.MMActivity mMActivity2 = this.f153420d;
            int intExtra = mMActivity2.getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 0) == 2 ? mMActivity2.getIntent().getIntExtra("chat_from_scene", 0) : 0;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", this.f153421e.d1());
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(intExtra)));
            hashMap.put("view_id", "yuanbao_addrbook_add");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        }
    }

    public void e(long j17, android.content.Context context) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.profile.d1(this, context, j17));
    }

    @Override // p94.m0
    public void e6(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
    }

    public final void f(final com.tencent.mm.storage.z3 z3Var, final java.lang.String str, final r35.a aVar, final java.util.LinkedList linkedList) {
        java.lang.String str2;
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(z3Var.d1(), true);
        java.lang.String str3 = "";
        if (n17 != null && (str2 = n17.F1) != null) {
            str3 = str2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "handleContactWithTicket dkverify footer add:%s chat:%s ticket:%s", z3Var.d1(), str, str3);
        if (!android.text.TextUtils.isEmpty(str3)) {
            aVar.m(str3);
            aVar.a(z3Var.d1(), str, linkedList);
        } else {
            ((c01.k7) c01.n8.a()).e(z3Var.d1());
            ((java.util.LinkedList) this.f153435v).add(z3Var.d1());
            ((c01.k7) c01.n8.a()).g(z3Var.d1(), str, r35.s.a(java.lang.Integer.valueOf(this.f153423g)), new c01.o8() { // from class: com.tencent.mm.plugin.profile.e0$$g
                @Override // c01.o8
                public final void a(java.lang.String str4, boolean z17) {
                    java.lang.String str5;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "handleContactWithTicket getContactCallBack() called with: username =%s, succ =%s", str4, java.lang.Boolean.valueOf(z17));
                    com.tencent.mm.storage.e8 q17 = c01.d9.b().q();
                    com.tencent.mm.storage.z3 z3Var2 = com.tencent.mm.storage.z3.this;
                    com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.storage.k4) q17).n(z3Var2.d1(), true);
                    if (n18 == null || (str5 = n18.F1) == null) {
                        str5 = "";
                    }
                    java.lang.String str6 = str;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "handleContactWithTicket userName:%s roomId:%s ticket:%s", str4, str6, str5);
                    r35.a aVar2 = aVar;
                    aVar2.m(str5);
                    aVar2.a(z3Var2.d1(), str6, linkedList);
                }
            });
        }
    }

    public final void g() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f153420d;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) mMActivity.findViewById(com.tencent.mm.R.id.l2v);
        if (frameLayout == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewContactWidgetNormal", "[-] bottomContainer was not found, there must be some issues.");
            return;
        }
        vh0.f2 f2Var = (vh0.f2) ((vh0.d1) i95.n0.c(vh0.d1.class));
        java.util.List Ai = f2Var.Ai(this.f153421e.d1());
        if (Ai.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewContactWidgetNormal", "[-] no service agreements found, hide bottom container.");
            frameLayout.removeAllViews();
            frameLayout.setVisibility(8);
        } else {
            frameLayout.removeAllViews();
            if (f2Var.wi(mMActivity, frameLayout, this.f153421e.d1(), Ai)) {
                frameLayout.setVisibility(0);
            } else {
                frameLayout.setVisibility(8);
            }
        }
    }

    public final void h(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference, com.tencent.mm.ui.base.preference.ButtonPreference buttonPreference, com.tencent.mm.ui.base.preference.ButtonPreference buttonPreference2) {
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.t();
        h0Var.d(normalProfileHeaderPreference, -1);
        vh0.i2 i2Var = (vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class));
        org.json.JSONArray bj6 = i2Var.bj(this.f153421e.d1());
        com.tencent.mm.ui.MMActivity mMActivity = this.f153420d;
        if (bj6 != null) {
            for (int i17 = 0; i17 < bj6.length(); i17++) {
                try {
                    org.json.JSONObject jSONObject = bj6.getJSONObject(i17);
                    com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference = new com.tencent.mm.ui.base.preference.KeyValuePreference(mMActivity);
                    keyValuePreference.Q = true;
                    keyValuePreference.L(jSONObject.getString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE));
                    keyValuePreference.H(jSONObject.getString("content"));
                    keyValuePreference.S(Integer.MAX_VALUE);
                    keyValuePreference.P = false;
                    keyValuePreference.E(8);
                    java.lang.String str = "";
                    try {
                        str = jSONObject.getString("url");
                    } catch (org.json.JSONException e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NewContactWidgetNormal", e17, "cannot get url", new java.lang.Object[0]);
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                        keyValuePreference.E(8);
                    } else {
                        keyValuePreference.f197772f = new com.tencent.mm.plugin.profile.i1(this, this.f153421e.d1(), str);
                        keyValuePreference.E(0);
                    }
                    h0Var.d(keyValuePreference, -1);
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NewContactWidgetNormal", e18, "[-] fail to get profile config detail.", new java.lang.Object[0]);
                }
            }
            if (this.f153421e.r2()) {
                i();
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.NewContactWidgetNormal", "[-] fail to get profile config detail.");
        }
        if (i2Var.Di(this.f153421e.d1())) {
            vh0.g1 g1Var = (vh0.g1) i95.n0.c(vh0.g1.class);
            java.lang.String d17 = this.f153421e.d1();
            vh0.i2 i2Var2 = (vh0.i2) g1Var;
            if (i2Var2.Di(d17)) {
                java.lang.String Vi = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Vi(i2Var2.Vi(d17), "openim_custom_info_header", j41.a0.TYPE_WORDING, 0);
                if (!android.text.TextUtils.isEmpty(Vi)) {
                    com.tencent.mm.ui.base.preference.PreferenceTitleCategory preferenceTitleCategory = new com.tencent.mm.ui.base.preference.PreferenceTitleCategory(mMActivity, null);
                    preferenceTitleCategory.C("openim_company_info_title");
                    preferenceTitleCategory.G = com.tencent.mm.R.layout.c0l;
                    preferenceTitleCategory.L(Vi);
                    h0Var.d(preferenceTitleCategory, -1);
                }
            }
            java.util.LinkedList<j41.d0> linkedList = new java.util.LinkedList();
            java.lang.String Zi = i2Var2.Zi(d17);
            com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "get customDetailJson:%s, username:%s", Zi, d17);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
                try {
                    org.json.JSONArray optJSONArray = new org.json.JSONObject(Zi).optJSONArray("custom_info");
                    if (optJSONArray != null) {
                        for (int i18 = 0; i18 < optJSONArray.length(); i18++) {
                            org.json.JSONObject jSONObject2 = optJSONArray.getJSONObject(i18);
                            j41.d0 d0Var = new j41.d0();
                            d0Var.a(jSONObject2);
                            linkedList.add(d0Var);
                        }
                    }
                } catch (org.json.JSONException e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OpenIMCustomDetail", e19, "parse", new java.lang.Object[0]);
                }
            }
            java.lang.String Vi2 = i2Var2.Vi(d17);
            for (j41.d0 d0Var2 : linkedList) {
                for (j41.e0 e0Var : d0Var2.f297618b) {
                    com.tencent.mm.plugin.profile.logic.OpenIMPreference openIMPreference = new com.tencent.mm.plugin.profile.logic.OpenIMPreference(mMActivity);
                    openIMPreference.f153524x1 = e0Var;
                    openIMPreference.S = d0Var2.f297617a;
                    openIMPreference.S(2);
                    openIMPreference.P = false;
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String a17 = e0Var.a(Vi2);
                    ((ke0.e) xVar).getClass();
                    openIMPreference.H(com.tencent.mm.pluginsdk.ui.span.c0.i(mMActivity, a17));
                    h0Var.d(openIMPreference, -1);
                    if (e0Var.f297622d == 4) {
                        openIMPreference.f197772f = new com.tencent.mm.plugin.profile.j1(this, e0Var, d17);
                    }
                }
            }
        }
        h0Var.d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(mMActivity, null), -1);
        if (this.f153421e.r2()) {
            h0Var.d(buttonPreference, -1);
        } else {
            h0Var.d(buttonPreference2, -1);
        }
    }

    public final void i() {
        com.tencent.mm.ui.MMActivity mMActivity = this.f153420d;
        com.tencent.mm.ui.base.preference.KeyValuePreference keyValuePreference = new com.tencent.mm.ui.base.preference.KeyValuePreference(mMActivity);
        if (!mMActivity.getIntent().getBooleanExtra("YuanBaoRecommendExposed", false)) {
            mMActivity.getIntent().putExtra("YuanBaoRecommendExposed", true);
            java.util.HashMap hashMap = new java.util.HashMap();
            java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("chat_session");
            hashMap.put("view_id", "yuanbao_profile_recommend_btn");
            hashMap.put("enter_type", java.lang.Integer.valueOf(this.f153424h));
            hashMap.put("enter_sessionid", stringExtra);
            hashMap.put("chat_name", this.f153421e.d1());
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 34004);
        }
        keyValuePreference.Q = true;
        keyValuePreference.J(com.tencent.mm.R.string.pdq);
        keyValuePreference.G(com.tencent.mm.R.string.pdp);
        keyValuePreference.S(Integer.MAX_VALUE);
        keyValuePreference.P = false;
        keyValuePreference.E(0);
        keyValuePreference.f197772f = new com.tencent.mm.ui.base.preference.r0() { // from class: com.tencent.mm.plugin.profile.e0$$e
            @Override // com.tencent.mm.ui.base.preference.r0
            public final boolean a(com.tencent.mm.ui.base.preference.Preference preference) {
                com.tencent.mm.plugin.profile.e0 e0Var = com.tencent.mm.plugin.profile.e0.this;
                e0Var.getClass();
                ((br3.f) ((fc0.e) i95.n0.c(fc0.e.class))).Bi(e0Var.f153421e, e0Var.f153420d, true);
                return true;
            }
        };
        com.tencent.mm.ui.base.preference.r rVar = this.f153422f;
        if (rVar != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).d(keyValuePreference, -1);
        }
    }

    public final void j(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var) {
        java.lang.String str;
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var.m("contact_info_invite_source", true);
        com.tencent.mm.storage.a3 a3Var = this.f153431r;
        com.tencent.mm.ui.MMActivity mMActivity = this.f153420d;
        boolean booleanExtra = a3Var == null ? mMActivity.getIntent().getBooleanExtra("Is_RoomOwner", false) : a3Var.P0();
        if (this.f153423g != 14 || !booleanExtra || this.f153431r == null || z3Var.d1().equals(this.f153431r.field_roomowner)) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(this.f153423g);
            objArr[1] = java.lang.Boolean.valueOf(booleanExtra);
            objArr[2] = java.lang.Boolean.valueOf(this.f153431r == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "[initInviteSource] addContactScene:%s isOwner:%s null == member:%s", objArr);
            h0Var.m("contact_info_invite_source", true);
            return;
        }
        java.lang.String stringExtra = mMActivity.getIntent().getStringExtra("inviteer");
        this.f153439z = stringExtra;
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            mo.b v07 = this.f153431r.v0(z3Var.d1());
            if (v07 == null || (str = v07.f330250g) == null) {
                str = "";
            }
            this.f153439z = str;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f153439z)) {
            java.lang.String d17 = z3Var.d1();
            java.lang.String str2 = this.f153432s;
            java.util.Map map = c01.v1.f37519a;
            java.lang.String str3 = str2 + "#" + d17;
            com.tencent.mm.sdk.platformtools.r2 r2Var = (com.tencent.mm.sdk.platformtools.r2) c01.v1.f37521c;
            this.f153439z = r2Var.m(str3) ? (java.lang.String) r2Var.get(str3) : "";
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f153439z);
        java.util.List list = this.f153435v;
        if (K0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NewContactWidgetNormal", "mRoomId:%s member:%s , inviter is null!", this.f153432s, z3Var.d1());
            this.A.alive();
            ((java.util.LinkedList) list).add(z3Var.d1());
            ((c01.k7) c01.n8.a()).g(z3Var.d1(), this.f153432s, r35.s.a(java.lang.Integer.valueOf(this.f153423g)), new com.tencent.mm.plugin.profile.w0(this));
            return;
        }
        mMActivity.getIntent().putExtra("inviteer", this.f153439z);
        java.lang.String f17 = com.tencent.mm.plugin.profile.n2.f(this.f153431r, this.f153439z);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            r(h0Var, this.f153420d, this.f153439z, f17, z3Var, this.f153431r);
        } else {
            ((java.util.LinkedList) list).add(z3Var.d1());
            ((c01.k7) c01.n8.a()).g(z3Var.d1(), this.f153432s, r35.s.a(java.lang.Integer.valueOf(this.f153423g)), new com.tencent.mm.plugin.profile.x0(this, h0Var));
        }
    }

    public final boolean k() {
        return com.tencent.mm.storage.z3.L3(this.f153421e.d1());
    }

    public final boolean l() {
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        com.tencent.mm.plugin.finder.service.m4 m4Var = com.tencent.mm.plugin.finder.service.m4.f126148a;
        java.lang.String d17 = this.f153421e.d1();
        if (d17 != null) {
            return r26.i0.n(d17, "@findermsg", false);
        }
        return false;
    }

    public final boolean m() {
        return this.f153420d.getIntent().getIntExtra("Contact_Scene", 0) == 18;
    }

    public final boolean n() {
        return !this.f153421e.r2() && this.f153420d.getIntent().getBooleanExtra("User_Verify", false);
    }

    public final boolean o() {
        com.tencent.mm.storage.z3 z3Var = this.f153421e;
        return z3Var != null && com.tencent.mm.storage.z3.p4(z3Var.d1());
    }

    @Override // t25.a
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        q(this.f153422f, this.f153421e, true);
    }

    @Override // t25.b
    public boolean onBackPress() {
        return false;
    }

    @Override // t25.b
    public boolean onCreate() {
        float f17;
        if (k()) {
            java.lang.String d17 = this.f153421e.d1();
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e());
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = M.getLong("SP_CHAT_BOT_GET_CONTACT", 0L);
            ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).getClass();
            java.lang.String j18 = j62.e.g().j("clicfg_chatbot_profile_getcontact_interval_hour", "1.0", false, true);
            try {
                kotlin.jvm.internal.o.d(j18);
                f17 = java.lang.Float.parseFloat(j18);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatBotConfigService", e17, "", new java.lang.Object[0]);
                f17 = 1.0f;
            }
            if (((float) (currentTimeMillis - j17)) < f17 * 3600000.0f) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "getChatBotContact not within the time range");
            } else {
                ((c01.k7) ((j11.q) ((ct.z2) i95.n0.c(ct.z2.class))).wi()).b(d17, 12, new com.tencent.mm.plugin.profile.c1(this));
                M.putLong("SP_CHAT_BOT_GET_CONTACT", currentTimeMillis);
            }
        }
        return false;
    }

    @Override // t25.b
    public boolean onDestroy() {
        return false;
    }

    @Override // t25.a
    public boolean onDetach() {
        if (p94.w0.b() != null) {
            ((com.tencent.mm.plugin.sns.model.d6) p94.w0.b()).c(this, 3);
        }
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) this.f153422f).h("contact_profile_header_normal");
        if (normalProfileHeaderPreference != null) {
            normalProfileHeaderPreference.T();
        }
        this.A.dead();
        cr3.d0 d0Var = this.f153433t;
        if (d0Var != null) {
            ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(d0Var);
        }
        java.util.Iterator it = this.f153435v.iterator();
        while (it.hasNext()) {
            ((c01.k7) c01.n8.a()).f((java.lang.String) it.next());
        }
        return false;
    }

    @Override // t25.b
    public void onPause() {
    }

    @Override // t25.b
    public void onResume() {
        t();
        if (k()) {
            g();
        }
    }

    public final boolean p() {
        int intExtra = this.f153420d.getIntent().getIntExtra("Contact_Scene", 0);
        return 26 <= intExtra && intExtra <= 29;
    }

    public final void q(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var, boolean z17) {
        java.lang.String[] strArr;
        int i17;
        int i18;
        int i19;
        if (!n()) {
            com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
            h0Var.m("contact_profile_accept_contact", true);
            h0Var.m("contact_profile_accept_contact_by_wework", true);
            return;
        }
        com.tencent.mm.ui.base.preference.h0 h0Var2 = (com.tencent.mm.ui.base.preference.h0) rVar;
        h0Var2.m("contact_profile_setting_permission", true);
        h0Var2.m("contact_profile_phone", true);
        h0Var2.m("contact_profile_sns", com.tencent.mm.storage.z3.m4(z3Var.d1()));
        boolean z18 = false;
        boolean z19 = (c01.z1.j() & 268435456) != 0;
        com.tencent.mm.ui.MMActivity mMActivity = this.f153420d;
        boolean f17 = com.tencent.mm.pluginsdk.model.app.j1.f(mMActivity, "com.tencent.wework");
        java.lang.Integer num = (java.lang.Integer) c01.d9.b().p().m(com.tencent.mm.storage.u3.USERINFO_ADD_CONTACT_BY_WEWORK_SWITCH_INT, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "onAttachVerify addByWeworkLocalSwitch:%s ExtStatus:%s openAddByWework:%s isInstallWework:%s", num, java.lang.Long.valueOf(c01.z1.j()), java.lang.Boolean.valueOf(z19), java.lang.Boolean.valueOf(f17));
        int intValue = num.intValue();
        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (!(intValue == 1) && (!z19 || !f17)) {
            if (!(j62.e.g().c(new com.tencent.mm.repairer.config.friend.RepairerConfigExpiredAddContactFix()) == 1) && mMActivity.getIntent().getBooleanExtra("isVerifyExpired", false)) {
                com.tencent.mm.ui.base.preference.ButtonPreference buttonPreference = (com.tencent.mm.ui.base.preference.ButtonPreference) h0Var2.h("contact_profile_accept_contact");
                buttonPreference.O(mMActivity.getString(com.tencent.mm.R.string.f489904f0), mMActivity.getResources().getColor(com.tencent.mm.R.color.f478895k4));
                buttonPreference.w(false);
            }
            h0Var2.m("contact_profile_accept_contact_by_wework", true);
            return;
        }
        h0Var2.m("contact_profile_accept_contact_by_wework", false);
        y35.r[] a17 = hr3.c9.a(mMActivity, z3Var, this.f153423g);
        java.lang.String b17 = (a17 == null || a17.length < 1) ? "" : hr3.c9.b(mMActivity, z3Var, this.f153423g);
        java.lang.String d17 = this.f153421e.d1();
        gm0.j1.i();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_ADD_CONTACT_BY_WEWORK_USERNAME_STRING_SYNC, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactUsernameByWework() username:%s", d17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            try {
                cl0.g gVar = new cl0.g(str);
                java.lang.String optString = gVar.optString("usernames");
                java.lang.String optString2 = gVar.optString("states");
                java.lang.String[] split = optString.split(",");
                java.lang.String[] split2 = optString2.split(",");
                if (split != null && split2 != null) {
                    int i27 = 0;
                    while (i27 < split.length) {
                        if (com.tencent.mm.sdk.platformtools.t8.D0(d17, split[i27])) {
                            try {
                                i17 = java.lang.Integer.valueOf(split2[i27]).intValue();
                                strArr = split;
                            } catch (java.lang.NumberFormatException e17) {
                                strArr = split;
                                com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactUsernameByWework() Exception:%s", e17.getMessage());
                                i17 = 0;
                            }
                            if (!(i17 == 2)) {
                                if (!(i17 == 3)) {
                                    if (i17 == 1) {
                                        break;
                                    }
                                }
                            }
                            z18 = true;
                            break;
                        }
                        strArr = split;
                        i27++;
                        split = strArr;
                    }
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactUsernameByWework() Exception:%s", e18.getMessage());
            }
            z18 = false;
        }
        if (z18) {
            ((com.tencent.mm.ui.base.preference.ButtonPreference) h0Var2.h("contact_profile_accept_contact_by_wework")).O(mMActivity.getString(com.tencent.mm.R.string.f490965be1), mMActivity.getResources().getColor(com.tencent.mm.R.color.f478734fp));
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(b17)) {
            return;
        }
        gm0.j1.i();
        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_ADD_CONTACT_BY_WEWORK_STRING_SYNC, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactByWework() climsgid:%s", b17);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            try {
                cl0.g gVar2 = new cl0.g(str2);
                java.lang.String optString3 = gVar2.optString("svrids");
                java.lang.String optString4 = gVar2.optString("states");
                java.lang.String[] split3 = optString3.split(",");
                java.lang.String[] split4 = optString4.split(",");
                if (split3 != null && split4 != null) {
                    for (int i28 = 0; i28 < split3.length; i28++) {
                        if (com.tencent.mm.sdk.platformtools.t8.D0(b17, split3[i28])) {
                            try {
                                i18 = java.lang.Integer.valueOf(split4[i28]).intValue();
                            } catch (java.lang.NumberFormatException e19) {
                                i18 = 0;
                                com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactByWework() Exception:%s", e19.getMessage());
                            }
                            i19 = i18;
                            break;
                        }
                    }
                }
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.OpenIMFriReqAcceptedInWxWorkMsg", "getStateAddContactByWework() Exception:%s", e27.getMessage());
            }
        }
        i19 = 1;
        if (i19 == 2 || i19 == 3) {
            h0Var2.m("contact_profile_accept_contact", true);
        }
    }

    public final void r(com.tencent.mm.ui.base.preference.r rVar, android.app.Activity activity, java.lang.String str, java.lang.String str2, com.tencent.mm.storage.z3 z3Var, final com.tencent.mm.storage.a3 a3Var) {
        java.lang.CharSequence charSequence;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "[showInviterView] inviter:%s inviterDisplayName:%s", str, str2);
        activity.getIntent().putExtra("inviteer", str);
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.profile.e0$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                com.tencent.mm.plugin.profile.e0 e0Var = com.tencent.mm.plugin.profile.e0.this;
                e0Var.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.tencent.mm.storage.a3 a3Var2 = a3Var;
                arrayList.add(a3Var2);
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/profile/NewContactWidgetNormal", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", e0Var, array);
                com.tencent.mm.plugin.profile.n2.n(e0Var.f153420d, a3Var2, e0Var.f153432s);
                yj0.a.h(e0Var, "com/tencent/mm/plugin/profile/NewContactWidgetNormal", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        if (str2 == null) {
            charSequence = "";
        } else {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String string = activity.getResources().getString(com.tencent.mm.R.string.f490969be4, str2);
            ((ke0.e) xVar).getClass();
            android.text.SpannableString spannableString = new android.text.SpannableString(com.tencent.mm.pluginsdk.ui.span.c0.i(activity, string));
            spannableString.setSpan(new com.tencent.mm.plugin.profile.x1(onClickListener), 0, str2.length(), 33);
            charSequence = spannableString;
        }
        ((com.tencent.mm.plugin.profile.ui.FriendProfilePreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_profile_info_profile")).M(com.tencent.mm.R.string.f490970be5, charSequence, 2, null, false);
    }

    public final void s(com.tencent.mm.storage.z3 z3Var, android.content.Context context) {
        java.lang.String d17 = z3Var.d1();
        if (!android.text.TextUtils.isEmpty(d17)) {
            ((co5.p) ((jp5.n) i95.n0.c(jp5.n.class))).Ni(d17);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) this.f153420d, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.profile.j0(this);
        k0Var.f211855d2 = true;
        k0Var.Y1 = true;
        k0Var.f211881s = new com.tencent.mm.plugin.profile.k0(this, context, z3Var);
        k0Var.v();
    }

    public final void t() {
        if (!((com.tencent.mm.ui.base.preference.h0) this.f153422f).q("contact_profile_add_contact")) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "updateAddContactPrefenceState, prefence no show. ");
            return;
        }
        com.tencent.mm.ui.base.preference.ButtonPreference buttonPreference = (com.tencent.mm.ui.base.preference.ButtonPreference) ((com.tencent.mm.ui.base.preference.h0) this.f153422f).h("contact_profile_add_contact");
        com.tencent.mm.storage.m7 P0 = r21.w.wi().P0(this.f153421e.d1());
        int i17 = eg4.t1.f252810t;
        this.f153429p = P0 != null && P0.field_state == 2 && c01.id.c() - P0.field_lastModifiedTime < com.tencent.mm.storage.o7.J0();
        com.tencent.mm.ui.MMActivity mMActivity = this.f153420d;
        boolean z17 = this.f153429p && mMActivity.getIntent().getBooleanExtra("Contact_ToProfilePageFromSource", false);
        this.f153429p = z17;
        if (buttonPreference != null) {
            if (z17) {
                buttonPreference.L(mMActivity.getResources().getString(com.tencent.mm.R.string.f489907f3));
                buttonPreference.O(mMActivity.getResources().getString(com.tencent.mm.R.string.f489907f3), mMActivity.getResources().getColor(com.tencent.mm.R.color.FG_2));
                buttonPreference.N(com.tencent.mm.R.drawable.bbw);
                return;
            }
            int color = mMActivity.getResources().getColor(com.tencent.mm.R.color.f478734fp);
            if (this.f153423g == 17) {
                com.tencent.mm.storage.f9 f27 = pt0.f0.f2(mMActivity.getIntent().getStringExtra("key_msg_talker"), mMActivity.getIntent().getLongExtra("key_msg_id", -1L));
                if (f27 != null && com.tencent.mm.ui.chatting.n3.p(f27)) {
                    this.f153434u = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", "SendCardFromCard: updateAddContactPrefenceState, msg is forbid forward");
                }
                if (this.f153434u) {
                    color = mMActivity.getResources().getColor(com.tencent.mm.R.color.Link_170);
                    buttonPreference.w(false);
                    ((com.tencent.mm.ui.base.preference.h0) this.f153422f).m("contact_profile_has_forward_hint", false);
                } else {
                    buttonPreference.w(true);
                    ((com.tencent.mm.ui.base.preference.h0) this.f153422f).m("contact_profile_has_forward_hint", true);
                }
            }
            buttonPreference.O(mMActivity.getResources().getString(com.tencent.mm.R.string.hnr), color);
            buttonPreference.L(mMActivity.getResources().getString(com.tencent.mm.R.string.hnr));
            buttonPreference.N(com.tencent.mm.R.drawable.azm);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0139, code lost:
    
        if (r1 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c3, code lost:
    
        if (r5 == null) goto L74;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(android.content.Context r29, com.tencent.mm.ui.base.preference.r r30, com.tencent.mm.storage.z3 r31) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.e0.u(android.content.Context, com.tencent.mm.ui.base.preference.r, com.tencent.mm.storage.z3):void");
    }

    public final void v(com.tencent.mm.ui.base.preference.r rVar, java.lang.Object obj) {
        boolean z17 = obj instanceof r45.nw6;
        if (z17) {
            r45.nw6 nw6Var = (r45.nw6) obj;
            com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
            com.tencent.mm.pluginsdk.ui.preference.FinderPreference finderPreference = (com.tencent.mm.pluginsdk.ui.preference.FinderPreference) h0Var.h("contact_profile_finder");
            if (finderPreference == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NewContactWidgetNormal", "preference is null!");
                return;
            }
            if (((com.tencent.mm.protocal.protobuf.FinderContact) nw6Var.getCustom(0)) == null) {
                h0Var.m("contact_profile_finder", true);
            } else {
                if (!this.B) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21908, 2, 2, 1);
                }
                h0Var.m("contact_profile_finder", false);
                finderPreference.R = nw6Var;
                finderPreference.M();
                this.B = true;
                if (this.f153426m) {
                    com.tencent.mm.ui.base.preference.Preference h17 = h0Var.h("openim_pref_key_info");
                    if (h17 instanceof com.tencent.mm.plugin.profile.logic.OpenIMPreference) {
                        ((com.tencent.mm.plugin.profile.logic.OpenIMPreference) h17).f153525y1 = true;
                        h0Var.notifyDataSetChanged();
                    }
                }
            }
            java.lang.String d17 = this.f153421e.d1();
            boolean z18 = this.B;
            com.tencent.mm.storage.z3 z3Var = com.tencent.mm.plugin.profile.p2.f153578e;
            if (z3Var != null && z3Var.d1().equals(d17)) {
                com.tencent.mm.plugin.profile.p2.f153580g = java.lang.Boolean.valueOf(z18);
            }
            com.tencent.mm.plugin.profile.p2.Bi(this.f153420d.getIntent(), 33, 1, this.f153421e.d1());
        } else {
            ((com.tencent.mm.ui.base.preference.h0) rVar).m("contact_profile_finder", true);
        }
        if (z17) {
            com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_profile_header_normal");
            if (normalProfileHeaderPreference != null) {
                normalProfileHeaderPreference.Z = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.nw6) obj).getCustom(0);
                ((com.tencent.mm.ui.base.preference.h0) this.f153422f).notifyDataSetChanged();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference normalProfileHeaderPreference2 = (com.tencent.mm.plugin.profile.ui.NormalProfileHeaderPreference) ((com.tencent.mm.ui.base.preference.h0) rVar).h("contact_profile_header_normal");
        if (normalProfileHeaderPreference2 != null) {
            normalProfileHeaderPreference2.Z = null;
            ((com.tencent.mm.ui.base.preference.h0) this.f153422f).notifyDataSetChanged();
        }
    }

    public final void w(com.tencent.mm.ui.base.preference.r rVar, java.lang.Object obj) {
        if ((obj instanceof r45.nw6) && !this.f153426m && !this.f153427n) {
            r45.nw6 nw6Var = (r45.nw6) obj;
            if (nw6Var.getInteger(3) == 1) {
                com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
                h0Var.m("contact_profile_finder_recent_like", false);
                com.tencent.mm.pluginsdk.ui.preference.FinderRecentLikePreference finderRecentLikePreference = (com.tencent.mm.pluginsdk.ui.preference.FinderRecentLikePreference) h0Var.h("contact_profile_finder_recent_like");
                r45.qw6 qw6Var = null;
                if (h0Var.q("contact_profile_finder")) {
                    finderRecentLikePreference.N = null;
                    finderRecentLikePreference.M();
                    return;
                }
                if (((r45.d71) nw6Var.getCustom(4)) != null && !com.tencent.mm.sdk.platformtools.t8.L0(((r45.d71) nw6Var.getCustom(4)).getList(1))) {
                    qw6Var = new r45.qw6();
                    qw6Var.getList(1).addAll(((r45.d71) nw6Var.getCustom(4)).getList(1));
                }
                finderRecentLikePreference.N = qw6Var;
                finderRecentLikePreference.M();
                return;
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) rVar).m("contact_profile_finder_recent_like", true);
    }

    public final void x(com.tencent.mm.ui.base.preference.r rVar) {
        if (this.f153437x == null || rVar == null) {
            return;
        }
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        if (h0Var.q("contact_profile_multi_button")) {
            return;
        }
        h0Var.m("line3", true);
    }

    public final void y(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var) {
        if (this.f153436w) {
            com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
            com.tencent.mm.ui.base.preference.TextPreference textPreference = (com.tencent.mm.ui.base.preference.TextPreference) h0Var.h("contact_profile_wechat_info");
            com.tencent.mm.ui.MMActivity mMActivity = this.f153420d;
            java.lang.String string = mMActivity.getResources().getString(com.tencent.mm.R.string.g8p);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            android.content.res.Resources resources = mMActivity.getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = mMActivity.getString(!((z3Var.G1 & 2) > 0) ? com.tencent.mm.R.string.f490927ba3 : com.tencent.mm.R.string.f490928ba4);
            sb6.append(resources.getString(com.tencent.mm.R.string.bj6, objArr));
            sb6.append("  ");
            sb6.append(string);
            java.lang.String sb7 = sb6.toString();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(string);
            textPreference.P = new com.tencent.mm.plugin.profile.l1(this, textPreference, sb7, arrayList);
            if (!h0Var.q("contact_profile_hint")) {
                h0Var.m("line2", true);
                h0Var.m("line4", true);
            }
            x(h0Var);
        }
    }

    public final void z(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.storage.z3 z3Var) {
        com.tencent.mm.ui.base.preference.h0 h0Var = (com.tencent.mm.ui.base.preference.h0) rVar;
        boolean z17 = h0Var.q("contact_profile_add_contact") || h0Var.q("contact_profile_accept_contact");
        boolean a07 = c01.e2.a0();
        int i17 = z3Var.G1;
        if ((i17 & 4) > 0) {
            if (!a07) {
                if ((i17 & 2) > 0) {
                    this.f153436w = true;
                }
            }
            if (a07) {
                if (!((i17 & 2) > 0)) {
                    this.f153436w = true;
                }
            }
        }
        boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_profile_contact_add_wechat_tip, 0) == 1;
        boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_profile_contact_wechat_tip, 0) == 1;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needShowWechatTip = ");
        sb6.append(this.f153436w);
        sb6.append(", addWechatUser = ");
        sb6.append(z18);
        sb6.append(", profileWechat = ");
        sb6.append(z19);
        sb6.append(", contact.getExtFlag = ");
        sb6.append(z3Var.G1);
        sb6.append(", isSelfWechatUser = ");
        sb6.append(a07);
        sb6.append(", contact.isWeChatContact() = ");
        sb6.append((z3Var.G1 & 2) > 0);
        sb6.append(", contact.isContactExtflagHasOverseaInfo() = ");
        sb6.append((z3Var.G1 & 4) > 0);
        sb6.append("， isaddContact = ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewContactWidgetNormal", sb6.toString());
        if (this.f153436w) {
            if (z17) {
                if (z18) {
                    this.f153436w = true;
                } else {
                    this.f153436w = false;
                }
            } else if (z19) {
                this.f153436w = true;
            } else {
                this.f153436w = false;
            }
            com.tencent.mm.ui.MMActivity mMActivity = this.f153420d;
            if (mMActivity == null || !mMActivity.getIntent().hasExtra("Contact_Ext_Flag") || z3Var.r2()) {
                return;
            }
            h0Var.m("line5", true);
        }
    }
}
