package cr3;

/* loaded from: classes11.dex */
public class d0 implements android.view.MenuItem.OnMenuItemClickListener, db5.o4, db5.t4, i35.e {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f221931d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.z3 f221932e;

    /* renamed from: f, reason: collision with root package name */
    public int f221933f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f221934g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f221936i;

    /* renamed from: h, reason: collision with root package name */
    public boolean f221935h = false;

    /* renamed from: m, reason: collision with root package name */
    public android.app.ProgressDialog f221937m = null;

    /* renamed from: n, reason: collision with root package name */
    public boolean f221938n = true;

    public d0(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.storage.z3 z3Var) {
        this.f221931d = mMActivity;
        this.f221932e = z3Var;
        this.f221933f = mMActivity.getIntent().getIntExtra("Contact_Scene", 9);
        this.f221934g = mMActivity.getIntent().getBooleanExtra("Contact_FMessageCard", false);
    }

    public static void a(cr3.d0 d0Var) {
        al5.f3 f3Var = d0Var.f221931d;
        if (f3Var instanceof l75.z0) {
            ((l75.z0) f3Var).g(0, null, d0Var.f221932e.d1());
        }
    }

    public static void b(cr3.d0 d0Var, boolean z17) {
        java.lang.Iterable<com.tencent.mm.vfs.x1> s17;
        d0Var.getClass();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14553, 2, 2, d0Var.f221932e.d1());
        java.lang.String d17 = d0Var.f221932e.d1();
        boolean M = c01.e2.M(d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "dealDelContactEvent() called isClearRecord:%s ctName:%s isGroupCard:%s", java.lang.Boolean.valueOf(z17), d17, java.lang.Boolean.valueOf(M));
        d0Var.f221932e.n1("");
        d0Var.f221932e.d3("");
        d0Var.f221932e.O2(null);
        java.lang.String a17 = i21.q.h().a(d17);
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(a17);
        if (r6Var.m() && r6Var.y() && (s17 = com.tencent.mm.vfs.w6.s(a17, true)) != null) {
            for (com.tencent.mm.vfs.x1 x1Var : s17) {
                if (x1Var != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "deleteUselessFiles: %s", x1Var.f213232b);
                    x1Var.a();
                }
            }
        }
        java.lang.String d18 = d0Var.f221932e.d1();
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "removeNoSeeHimeBlackTag, userName: %s.", d18);
        if (((com.tencent.mm.plugin.sns.storage.r2) p94.w0.f()).P0(d18, 5L)) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(d18);
            com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent postSnsTagMemberOptionEvent = new com.tencent.mm.autogen.events.PostSnsTagMemberOptionEvent();
            am.oo ooVar = postSnsTagMemberOptionEvent.f54621g;
            ooVar.f7570e = linkedList;
            ooVar.f7566a = 2;
            ooVar.f7567b = 5L;
            ooVar.f7568c = 1;
            postSnsTagMemberOptionEvent.e();
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "removeNoSeeHimeBlackTag, is no InTagList, userName: %s.", d18);
        }
        if (M) {
            d0Var.f221932e.s3();
            ((e21.z0) c01.d9.b().w()).c(new e21.l(d17, true));
            ((com.tencent.mm.storage.k4) c01.d9.b().q()).k(d17);
            ((com.tencent.mm.storage.b3) c01.d9.b().l()).y0(d17);
            return;
        }
        d0Var.f221936i = false;
        com.tencent.mm.ui.MMActivity mMActivity = d0Var.f221931d;
        d0Var.f221937m = db5.e1.Q(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490573yv), mMActivity.getString(com.tencent.mm.R.string.f490604zq), true, true, new cr3.i(d0Var));
        java.lang.String wi6 = d0Var.f221936i ? null : ((ng0.o) ((og0.n) i95.n0.c(og0.n.class))).wi(d0Var.f221932e.d1());
        if (com.tencent.mm.sdk.platformtools.t8.K0(wi6)) {
            d0Var.f(d17, z17);
        } else {
            d0Var.f221937m.dismiss();
            db5.e1.L(mMActivity, false, mMActivity.getString(com.tencent.mm.R.string.f493525kl3, wi6), null, mMActivity.getString(com.tencent.mm.R.string.fs8), mMActivity.getString(com.tencent.mm.R.string.boj), new cr3.j(d0Var), new cr3.k(d0Var, d17, z17), -1, com.tencent.mm.R.color.f478622ch);
        }
    }

    @Override // i35.e
    public void K0(java.lang.String str, int i17, r45.g25 g25Var) {
        r61.a h17;
        android.app.ProgressDialog progressDialog = this.f221937m;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f221937m = null;
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f221931d;
        if (i17 == 0) {
            if (!str.equals(this.f221932e.d1())) {
                com.tencent.mars.xlog.Log.w("MicroMsg.ProfileMenuManager", "not current contact %s,%s", this.f221932e.d1(), str);
                return;
            }
            if (this.f221933f == 13 && (h17 = m61.k.wi().h(str)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.f392805u)) {
                h17.f392799o = 1;
                m61.k.wi().j(h17.e(), h17);
            }
            if (this.f221933f == 9) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "add scene unkown, check the contact getsource: " + this.f221932e.getSource());
                int source = this.f221932e.getSource();
                if (source == 10 || source == 13) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "delete the system contact info added by wechat");
                }
            }
            int intExtra = mMActivity.getIntent().getIntExtra("Kdel_from", -1);
            com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "deleteContact() called with: delFrom:%d mIsClearRecord:%s", java.lang.Integer.valueOf(intExtra), java.lang.Boolean.valueOf(this.f221938n));
            if (intExtra == 0 && this.f221938n) {
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.u(intent, mMActivity);
            } else {
                mMActivity.setResult(-1, mMActivity.getIntent().putExtra("_delete_ok_", true));
                mMActivity.finish();
            }
            if (this.f221935h) {
                i();
            }
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = mMActivity.getResources().getString(com.tencent.mm.R.string.mf7);
            e4Var.b(com.tencent.mm.R.raw.check_mark_regular);
            if (e4Var.f211774a == null) {
                e4Var.f211774a = e4Var.a();
            }
            android.view.Window window = e4Var.f211774a.getWindow();
            if (window != null) {
                if (android.os.Build.VERSION.SDK_INT >= 26) {
                    window.setType(2038);
                } else {
                    window.setType(2002);
                }
                window.addFlags(524288);
                com.tencent.mm.ui.yk.a("dialog", "show top window not null!!", new java.lang.Object[0]);
            }
            e4Var.f211774a.show();
            int i19 = e4Var.f211780g;
            if (i19 == 0 || i19 == 1) {
                new android.os.Handler().postDelayed(new com.tencent.mm.ui.widget.dialog.c4(e4Var), 2000);
            }
        } else if (com.tencent.mm.sdk.platformtools.t8.K0(g25Var.f374841d)) {
            db5.e1.s(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490368t1), "");
        } else {
            db5.e1.s(mMActivity, g25Var.f374841d, g25Var.f374842e);
        }
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436683i, vg3.b.f436646f, vg3.c.f436656h, i17, new java.util.ArrayList(java.util.Collections.singletonList(str))));
    }

    public void c() {
        ((br3.f) ((fc0.e) i95.n0.c(fc0.e.class))).Bi(this.f221932e, this.f221931d, false);
    }

    public void d() {
        c01.g8 g8Var;
        boolean o27 = this.f221932e.o2();
        com.tencent.mm.ui.MMActivity mMActivity = this.f221931d;
        if (!o27) {
            android.view.View inflate = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.bxs, null);
            inflate.setPadding(0, 0, 0, 0);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jlf);
            textView.setPadding(0, 0, 0, 0);
            textView.setText(com.tencent.mm.storage.z3.m4(this.f221932e.d1()) ? com.tencent.mm.R.string.bfe : com.tencent.mm.R.string.bfd);
            android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.jld);
            checkBox.setChecked(false);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jle);
            textView2.setText(com.tencent.mm.R.string.bff);
            if (this.f221932e.getSource() == 18) {
                checkBox.setVisibility(0);
                textView2.setVisibility(0);
            } else {
                checkBox.setVisibility(8);
                textView2.setVisibility(8);
            }
            db5.e1.I(mMActivity, false, mMActivity.getString(com.tencent.mm.R.string.bfc), inflate, mMActivity.getString(com.tencent.mm.R.string.f490507x1), mMActivity.getString(com.tencent.mm.R.string.f490347sg), new cr3.p(this, checkBox), new cr3.q(this));
            return;
        }
        com.tencent.mm.storage.z3 z3Var = this.f221932e;
        iz5.a.g(null, z3Var != null);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(z3Var.d1(), true);
        if (n17 == null || com.tencent.mm.sdk.platformtools.t8.K0(n17.d1())) {
            n17 = z3Var;
        }
        n17.r3();
        if (com.tencent.mm.storage.z3.m4(z3Var.d1())) {
            vg3.e4 e4Var = (vg3.e4) i95.n0.c(vg3.e4.class);
            java.lang.String d17 = z3Var.d1();
            ((np.h) e4Var).getClass();
            op.c cVar = new op.c(true);
            cVar.a(new p41.w(d17, 2));
            g8Var = cVar;
        } else {
            g8Var = np.b.c(n17);
        }
        if (g8Var != null) {
            ((java.util.ArrayList) ((op.a) g8Var).f347216a).add(new np.a(z3Var));
        }
        if (g8Var != null) {
            op.a aVar = (op.a) g8Var;
            ((java.util.ArrayList) aVar.f347218c).add(new cr3.u(this));
            ((op.c) aVar).b(mMActivity, mMActivity.getString(com.tencent.mm.R.string.f490573yv), mMActivity.getString(com.tencent.mm.R.string.f490604zq), true, false, null);
            ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436683i, vg3.b.f436645e, vg3.c.f436658m, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f221932e.d1()))));
        }
        com.tencent.mm.plugin.profile.p2.Bi(mMActivity.getIntent(), 14, 2, this.f221932e.d1());
    }

    public void e() {
        java.lang.Class cls = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_set_default_chatonly, 0) == 0 ? com.tencent.mm.plugin.profile.ui.PermissionSettingUI.class : com.tencent.mm.plugin.profile.ui.PermissionSettingUI2.class;
        com.tencent.mm.ui.MMActivity mMActivity = this.f221931d;
        android.content.Intent intent = new android.content.Intent(mMActivity, (java.lang.Class<?>) cls);
        intent.putExtra("sns_permission_userName", this.f221932e.d1());
        if (mMActivity.getIntent() != null) {
            android.content.Intent intent2 = mMActivity.getIntent();
            gr3.l[] lVarArr = gr3.l.f274892d;
            intent.putExtra("entry_50321_path", intent2.getIntExtra("entry_50321_path", 2));
            intent.putExtra("CONTACT_INFO_UI_SOURCE", mMActivity.getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 0));
        }
        intent.putExtra("sns_permission_anim", true);
        intent.putExtra("sns_permission_block_scene", 1);
        intent.putExtra("INTENT_SOURCE_FROM_PROFILE_MENU", true);
        com.tencent.mm.ui.MMActivity mMActivity2 = this.f221931d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mMActivity2, arrayList.toArray(), "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "dealSnsPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        mMActivity2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(mMActivity2, "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "dealSnsPermission", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(java.lang.String str, boolean z17) {
        r61.a h17;
        if ((str == null || r26.n0.N(str)) == false) {
            com.tencent.mars.xlog.Log.isDebug();
            if (!com.tencent.mm.storage.z3.R4(str)) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("delete_contact", kz5.c1.l(new jz5.l("chat_name", str), new jz5.l("is_include_chat_history", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("BeDeleteUinType", java.lang.Integer.valueOf((com.tencent.mm.storage.z3.m4(str) || com.tencent.mm.storage.z3.p4(str)) ? 2 : (com.tencent.mm.storage.z3.L3(str) || com.tencent.mm.storage.z3.z3(str)) ? 0 : 1))), 35602);
            }
        }
        boolean m47 = com.tencent.mm.storage.z3.m4(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "deleteContact() called with: ctName:%s, isClearRecord:%s, isOpenIM:%s", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(m47));
        this.f221938n = z17;
        this.f221932e.s3();
        if (m47) {
            this.f221932e.j3(0);
            ((np.h) ((vg3.e4) i95.n0.c(vg3.e4.class))).wi(str);
            if (z17) {
                c01.w9.h(str, new cr3.l(this));
                ((com.tencent.mm.storage.m4) c01.d9.b().r()).k(str);
            }
            ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
            com.tencent.mm.modelsimple.g1.I(str, 15);
            ((com.tencent.mm.storage.k4) c01.d9.b().q()).p0(str, this.f221932e);
            if (this.f221933f == 13 && (h17 = m61.k.wi().h(str)) != null && !com.tencent.mm.sdk.platformtools.t8.K0(h17.f392805u)) {
                h17.f392799o = 1;
                m61.k.wi().j(h17.e(), h17);
            }
            if (this.f221933f == 9) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "add scene unkown, check the contact getsource: " + this.f221932e.getSource());
                int source = this.f221932e.getSource();
                if (source == 10 || source == 13) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "delete the system contact info added by wechat");
                }
            }
            com.tencent.mm.ui.MMActivity mMActivity = this.f221931d;
            if (mMActivity.getIntent().getIntExtra("Kdel_from", -1) == 0 && this.f221938n) {
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(67108864);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.u(intent, mMActivity);
            } else {
                mMActivity.setResult(-1, mMActivity.getIntent().putExtra("_delete_ok_", true));
                mMActivity.finish();
            }
        } else {
            ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).a(str, z17);
        }
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436683i, vg3.b.f436645e, vg3.c.f436656h, 0, new java.util.ArrayList(java.util.Collections.singletonList(str))));
    }

    public final void g(boolean z17) {
        this.f221935h = z17;
        boolean M = c01.e2.M(this.f221932e.d1());
        com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "deleteInner() called with: isNeedComplaint = [" + z17 + "] isGroupCard:%s", java.lang.Boolean.valueOf(M));
        if (M) {
            com.tencent.mm.ui.MMActivity mMActivity = this.f221931d;
            android.view.View inflate = android.view.View.inflate(mMActivity, com.tencent.mm.R.layout.bxs, null);
            inflate.setPadding(0, 0, 0, 0);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jlf);
            textView.setPadding(0, 0, 0, 0);
            textView.setText(c01.e2.M(this.f221932e.d1()) ? mMActivity.getString(com.tencent.mm.R.string.f491042bo4, this.f221932e.g2()) : mMActivity.getString(com.tencent.mm.R.string.f491039bo1, this.f221932e.g2()));
            android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.jld);
            android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.jle);
            textView2.setText(com.tencent.mm.R.string.bff);
            checkBox.setVisibility(8);
            textView2.setVisibility(8);
            com.tencent.mm.ui.MMActivity mMActivity2 = this.f221931d;
            db5.e1.J(mMActivity2, true, mMActivity2.getString(com.tencent.mm.R.string.f490961bd5), inflate, mMActivity.getString(com.tencent.mm.R.string.f490367t0), mMActivity.getString(com.tencent.mm.R.string.f490347sg), new cr3.b0(this), null, com.tencent.mm.R.color.f478622ch);
        } else {
            java.lang.String string = this.f221931d.getResources().getString(com.tencent.mm.R.string.ndj, this.f221932e.g2());
            java.lang.String string2 = this.f221931d.getResources().getString(com.tencent.mm.R.string.ndi);
            if (com.tencent.mm.storage.z3.L4(this.f221932e.d1())) {
                string2 = j62.e.g().j("clicfg_weclaw_delete_desc", com.tencent.mm.sdk.platformtools.x2.f193075e.getString(com.tencent.mm.R.string.oag), true, true);
            }
            com.tencent.mm.chatroom.ui.ChatroomInfoUI.s7(this.f221931d, this.f221932e.d1(), string, string2, this.f221931d.getResources().getString(com.tencent.mm.R.string.ayt), this.f221931d.getResources().getString(com.tencent.mm.R.string.ndm), new cr3.a0(this));
        }
        if (com.tencent.mm.storage.z3.L3(this.f221932e.d1())) {
            int intExtra = this.f221931d.getIntent().getIntExtra("chat_from_scene", 0);
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_name", this.f221932e.d1());
            hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(intExtra)));
            hashMap.put("view_id", "yuanbao_addrbook_delete");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr3.d0.h():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i() {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr3.d0.i():void");
    }

    public void j(int i17) {
        java.lang.String str = "";
        r61.a aVar = null;
        com.tencent.mm.ui.MMActivity context = this.f221931d;
        switch (i17) {
            case 1:
                if (com.tencent.mm.storage.z3.L4(this.f221932e.d1())) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("FROM_CHATBOT", true);
                    intent.putExtra("CHATBOT_USERNAME", this.f221932e.d1());
                    intent.setClass(context, com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI.class);
                    com.tencent.mm.ui.MMActivity mMActivity = this.f221931d;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "onItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMActivity.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(mMActivity, "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "onItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else if (this.f221932e.r2()) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("Contact_Scene", this.f221933f);
                    intent2.putExtra("Contact_User", this.f221932e.d1());
                    intent2.putExtra("Contact_RoomNickname", context.getIntent().getStringExtra("Contact_RoomNickname"));
                    intent2.putExtra("key_label_click_source", context.getIntent().getIntExtra("key_label_click_source", 0));
                    intent2.putExtra("contact_phone_number_list", this.f221932e.E1);
                    if (!this.f221932e.p2()) {
                        java.lang.String stringExtra = context.getIntent().getStringExtra("Contact_Mobile_MD5");
                        java.lang.String stringExtra2 = context.getIntent().getStringExtra("Contact_full_Mobile_MD5");
                        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) && com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) {
                            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f221932e.d1())) {
                                aVar = m61.k.wi().h(this.f221932e.d1());
                            }
                        } else if ((!com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || !com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2)) && ((aVar = m61.k.wi().i(stringExtra)) == null || com.tencent.mm.sdk.platformtools.t8.K0(aVar.e()))) {
                            aVar = m61.k.wi().i(stringExtra2);
                        }
                        if (aVar != null && !com.tencent.mm.sdk.platformtools.t8.K0(aVar.e())) {
                            java.lang.String f17 = aVar.f();
                            if (f17 == null) {
                                f17 = "";
                            }
                            str = f17.replace(" ", "");
                        }
                    }
                    intent2.putExtra("contact_phone_number_by_md5", str);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.m(intent2, context);
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(this.f221932e.d1())) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ProfileMenuManager", "mod stranger remark, username is null");
                } else {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("Contact_Scene", this.f221933f);
                    intent3.putExtra("Contact_mode_name_type", 0);
                    intent3.putExtra("Contact_ModStrangerRemark", true);
                    intent3.putExtra("Contact_User", this.f221932e.d1());
                    intent3.putExtra("Contact_Nick", this.f221932e.P0());
                    intent3.putExtra("Contact_RemarkName", this.f221932e.w0());
                    intent3.putExtra("Contact_RoomNickname", context.getIntent().getStringExtra("Contact_RoomNickname"));
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.y(intent3, context);
                }
                com.tencent.mm.plugin.profile.p2.Bi(context.getIntent(), 8, 1, this.f221932e.d1());
                return;
            case 2:
                if (this.f221932e.t2()) {
                    c01.e2.y0(this.f221932e);
                    db5.e1.T(context, context.getString(com.tencent.mm.R.string.f491007bj5));
                    ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436683i, vg3.b.f436645e, vg3.c.f436660o, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f221932e.d1()))));
                } else {
                    c01.e2.o0(this.f221932e);
                    db5.e1.T(context, context.getString(com.tencent.mm.R.string.bdk));
                    ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436683i, vg3.b.f436645e, vg3.c.f436659n, 0, new java.util.ArrayList(java.util.Collections.singletonList(this.f221932e.d1()))));
                }
                this.f221932e = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(this.f221932e.d1(), true);
                com.tencent.mm.plugin.profile.p2.Bi(context.getIntent(), 10, 1, this.f221932e.d1());
                return;
            case 3:
                e();
                com.tencent.mm.plugin.profile.p2.Bi(context.getIntent(), 11, 1, this.f221932e.d1());
                return;
            case 4:
                c();
                com.tencent.mm.plugin.profile.p2.Bi(context.getIntent(), 9, 1, this.f221932e.d1());
                return;
            case 5:
                d();
                com.tencent.mm.plugin.profile.p2.Bi(context.getIntent(), 32, this.f221932e.o2() ? 3 : 2, this.f221932e.d1());
                return;
            case 6:
                ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).c(this);
                ((java.util.ArrayList) ((aq1.n) ((i35.g) gm0.j1.s(i35.g.class))).f13070d).add(this);
                boolean z17 = this.f221932e.getSource() == 18;
                int i18 = com.tencent.mm.sdk.platformtools.z.f193112h;
                boolean z18 = ((i18 == 788529167 || i18 == 788529166) || z65.c.a()) && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.friend.RepairerConfigForceLBSDeleteContact()) == 1;
                com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "deleteContact() called isLBS:%s forceLBS:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
                if (!z17 && !z18) {
                    g(false);
                    return;
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) context, false, 1);
                k0Var.f211872n = new cr3.y(this);
                k0Var.f211881s = new cr3.z(this);
                k0Var.v();
                return;
            case 7:
                this.f221932e.getClass();
                cr3.m mVar = new cr3.m(this);
                com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutUtil", "addShortCut()");
                boolean z19 = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getBoolean("no_more_show_add_short_cut_dialog", false);
                android.util.Pair j17 = xp1.d.j(context, null, z19, false, new xp1.h(context));
                xp1.c.j(context, this.f221932e.d1());
                com.tencent.mm.sdk.platformtools.u3.h(new xp1.i(mVar, context, j17, z19));
                com.tencent.mm.plugin.profile.p2.Bi(context.getIntent(), 15, 1, this.f221932e.d1());
                return;
            case 8:
            case 11:
            case 12:
            default:
                return;
            case 9:
                if (com.tencent.mm.storage.z3.L4(this.f221932e.d1())) {
                    android.os.Bundle bundle = new android.os.Bundle();
                    java.lang.String str2 = "{\"scene\":" + (this.f221932e.r2() ? com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS : 152) + "}";
                    bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
                    bundle.putString("query", str2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "doChatbotComplaint open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9");
                    ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(this.f221931d, bundle, true, false, new cr3.n(this));
                } else {
                    i();
                }
                com.tencent.mm.plugin.profile.p2.Bi(context.getIntent(), 25, 1, this.f221932e.d1());
                return;
            case 10:
                q41.f.a(this.f221932e.d1(), 12, 0);
                c();
                return;
            case 13:
                com.tencent.mars.xlog.Log.i("MicroMsg.ProfileMenuManager", "dealSendCardFromCard");
                com.tencent.mm.storage.f9 f27 = pt0.f0.f2(context.getIntent().getStringExtra("key_msg_talker"), context.getIntent().getLongExtra("key_msg_id", -1L));
                if (f27 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.ProfileMenuManager", "SendCardFromCard: msgInfo is null");
                    return;
                }
                if (com.tencent.mm.ui.chatting.n3.p(f27)) {
                    db5.e1.y(context, context.getString(com.tencent.mm.R.string.fef), "", context.getString(com.tencent.mm.R.string.l_e), null);
                    return;
                }
                if (com.tencent.mm.ui.chatting.n3.q(f27)) {
                    db5.e1.y(context, context.getString(com.tencent.mm.R.string.feg), "", context.getString(com.tencent.mm.R.string.l_e), null);
                    return;
                }
                android.content.Intent intent4 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                intent4.putExtra("Retr_Msg_content", f27.U1());
                intent4.putExtra("Retr_Msg_Type", 8);
                intent4.putExtra("Retr_Msg_Id", f27.getMsgId());
                intent4.putExtra("Retr_MsgTalker", f27.Q0());
                com.tencent.mm.ui.MMActivity mMActivity2 = this.f221931d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(mMActivity2, arrayList2.toArray(), "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "dealSendCardFromCard", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                mMActivity2.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(mMActivity2, "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "dealSendCardFromCard", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
            case 14:
                try {
                    android.content.Intent intent5 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.PreviewHdHeadImg.class);
                    intent5.putExtra("USERNAME", this.f221932e.d1());
                    com.tencent.mm.ui.MMActivity mMActivity3 = this.f221931d;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(intent5);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(mMActivity3, arrayList3.toArray(), "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "onItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMActivity3.startActivity((android.content.Intent) arrayList3.get(0));
                    yj0.a.f(mMActivity3, "com/tencent/mm/plugin/profile/logic/ProfileMenuManager", "onItemClick", "(I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                } catch (java.lang.Exception unused) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.ProfileMenuManager", "start PreviewHdHeadImg error");
                    return;
                }
            case 15:
                db5.e1.A(context, context.getString(com.tencent.mm.R.string.bcu), "", context.getString(com.tencent.mm.R.string.f490353sl), context.getString(com.tencent.mm.R.string.f490347sg), new cr3.x(this, this.f221932e.d1()), null);
                return;
            case 16:
                java.lang.String username = this.f221932e.d1();
                kotlin.jvm.internal.o.g(context, "context");
                kotlin.jvm.internal.o.g(username, "username");
                android.content.Intent intent6 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
                intent6.putExtra("extra_username", username);
                pf5.j0.a(intent6, ry4.d1.class);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent6);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(context, arrayList4.toArray(), "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUI", "start", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(context, "com/tencent/mm/plugin/weclaw/shortcut/ShortcutCommandListUI", "start", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00eb, code lost:
    
        if ("3552365301".equals(r6.f221932e.Q0()) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ff, code lost:
    
        if (r6.f221932e.r2() != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    @Override // db5.o4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateMMMenu(db5.g4 r7) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr3.d0.onCreateMMMenu(db5.g4):void");
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        j(menuItem.getItemId());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00cc, code lost:
    
        if (r12 == false) goto L14;
     */
    @Override // android.view.MenuItem.OnMenuItemClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onMenuItemClick(android.view.MenuItem r12) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cr3.d0.onMenuItemClick(android.view.MenuItem):boolean");
    }
}
