package vh4;

@j95.b
/* loaded from: classes.dex */
public class t1 extends i95.w implements uh4.c0 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f437138h;

    /* renamed from: d, reason: collision with root package name */
    public int f437134d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f437135e = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: f, reason: collision with root package name */
    public boolean f437136f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f437137g = false;

    /* renamed from: i, reason: collision with root package name */
    public int f437139i = 1;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f437140m = new java.util.HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashMap f437141n = new java.util.HashMap();

    public static void Ai(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.content.Intent intent, boolean z17) {
        intent.putExtra("intent_extra_type", i17);
        intent.putExtra("intent_extra_key", str);
        intent.putExtra("intent_extra_title", str2);
        intent.putExtra("intent_extra_digest", str3);
        intent.putExtra("intent_extra_content", str4);
        intent.putExtra("intent_extra_can_auth", z17);
    }

    public static void wi(android.app.Activity activity, int i17, int i18, java.lang.String bizKey, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, uh4.a0 a0Var) {
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI.class);
        Ai(i18, bizKey, str, str2, str3, intent, z17);
        jz5.g gVar = vh4.c.f437058a;
        kotlin.jvm.internal.o.g(bizKey, "bizKey");
        if (a0Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AuthorizationReqCallbackMgr", "addCallback bizType:" + i18 + " bizKey:" + bizKey);
            ((java.util.Map) ((jz5.n) vh4.c.f437058a).getValue()).put(i18 + '#' + bizKey, a0Var);
        }
        if (i17 > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "doJumpToSendAuthorizationReqUI", "(Landroid/app/Activity;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/tencent/mm/plugin/teenmode/api/ITeenModeService$AuthorizationReqResultCallback;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "doJumpToSendAuthorizationReqUI", "(Landroid/app/Activity;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/tencent/mm/plugin/teenmode/api/ITeenModeService$AuthorizationReqResultCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "doJumpToSendAuthorizationReqUI", "(Landroid/app/Activity;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/tencent/mm/plugin/teenmode/api/ITeenModeService$AuthorizationReqResultCallback;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean Bi() {
        boolean z17 = false;
        try {
            if (android.provider.Settings.Secure.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "minors_mode", 0) == 1) {
                if (android.provider.Settings.Secure.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "minors_mode_enabled", 0) == 1) {
                    z17 = true;
                }
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.TeenModeService", "getSysTeenMode end");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TeenModeService", "Setting not found: " + e17.getMessage());
        }
        return z17;
    }

    @Override // uh4.c0
    public void C5() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "disableTeenMode");
        r45.p53 p53Var = new r45.p53();
        p53Var.f382761d = 59;
        p53Var.f382762e = 2;
        if (this.f437138h != null) {
            r45.cu5 cu5Var = new r45.cu5();
            p53Var.f382763f = cu5Var;
            cu5Var.d(this.f437138h.getBytes());
        }
        p53Var.f382764g = this.f437139i;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new xg3.p0(23, p53Var));
        e21.j jVar = new e21.j(linkedList);
        gm0.j1.i();
        jVar.doScene(gm0.j1.n().f273288b.f70764d, new vh4.f2(this));
        int i17 = uh4.b0.TeenagerModeOperationType_CLOSE.f427978d;
        ((ku5.t0) ku5.t0.f312615d).B(new vh4.t1$$a(this, i17, null));
    }

    public final void Di(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.BindGuardianMsgUI.class);
        intent.putExtra("intent_extra_bind_guardian_username", str);
        intent.putExtra("intent_extra_bind_ward_username", str2);
        intent.putExtra("intent_extra_bind_ticket", str3);
        intent.putExtra("intent_extra_request_time", j17);
        intent.putExtra("intent_extra_msg_type", i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToBindGuardianUIByOrigin", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToBindGuardianUIByOrigin", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // uh4.c0
    public void G5(uh4.e eVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "enableTeenMode");
        int i17 = uh4.b0.TeenagerModeOperationType_OPEN.f427978d;
        ((ku5.t0) ku5.t0.f312615d).B(new vh4.t1$$a(this, i17, eVar));
    }

    @Override // uh4.c0
    public int G8() {
        return gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_FINDER_RANGE_INT_SYNC, 2);
    }

    @Override // uh4.c0
    public boolean Ib() {
        return !java.lang.Boolean.valueOf(c01.e2.a0()).booleanValue();
    }

    @Override // uh4.c0
    public void If() {
        if (!isTeenMode() || !T2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "checkShowOnlyAgeChange skip! not in teenmode");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "checkShowOnlyAgeChange");
        if (com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_AGE_NEED_NOTICE_STATE_BOOLEAN_SYNC, false)))) {
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "age change checkSysAge");
        xh4.x xVar = xh4.x.f454643a;
        if (xVar.g(context) && T2()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "age notice IS_ONLY_SYS_AGE_CHANGE");
            xVar.i(context);
            android.content.Intent addFlags = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.SettingsSysTeenModeIntro.class).addFlags(268435456);
            com.tencent.mm.plugin.teenmode.ui.a6 a6Var = new com.tencent.mm.plugin.teenmode.ui.a6();
            a6Var.p(true);
            addFlags.putExtra("IntentKey_TeenModeIntroData", a6Var.toXml());
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(addFlags);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "checkSysAge", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "checkSysAge", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // uh4.c0
    public void K4() {
        G5(null);
    }

    @Override // uh4.c0
    public void Kb(uh4.i0 i0Var) {
        if (i0Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) this.f437135e).add(i0Var);
        }
    }

    @Override // uh4.c0
    public void Kf(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.AuthorizationRequestUI.class);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        Ai(i17, str, str2, str3, str4, intent, true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToSendAuthorizationReqUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToSendAuthorizationReqUI", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean Ni(android.app.Activity activity, int i17, int i18, java.lang.String str, android.content.DialogInterface.OnDismissListener onDismissListener) {
        if (!((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            return false;
        }
        new vh4.c1().l().h(new vh4.j2(this, db5.e1.Q(activity, "", "", true, false, null), onDismissListener, activity, i18, str, i17));
        return true;
    }

    @Override // uh4.c0
    public void O8(android.content.Context context) {
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        db5.t7.i(context2, context2.getString(com.tencent.mm.R.string.f493341jt2), com.tencent.mm.R.raw.icons_outlined_umbrella);
    }

    @Override // uh4.c0
    public void Od(android.app.Activity activity, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, uh4.a0 a0Var) {
        wi(activity, i17, i18, str, str2, str3, str4, z17, a0Var);
    }

    @Override // uh4.c0
    public int P3(android.content.Context context) {
        try {
            boolean z17 = true;
            if (android.provider.Settings.Secure.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "minors_mode", 0) != 1) {
                z17 = false;
            }
            if (z17) {
                return android.provider.Settings.Secure.getInt(context.getContentResolver(), "minors_mode_age_range", 0);
            }
            return 0;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TeenModeService", "Setting not found: " + e17.getMessage());
            return 0;
        }
    }

    @Override // uh4.c0
    public void Pc(int i17, uh4.c cVar) {
        ((java.util.HashMap) this.f437140m).put(java.lang.Integer.valueOf(i17), cVar);
    }

    @Override // uh4.c0
    public boolean R1(android.app.Activity activity, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr, com.tencent.mm.ui.widget.dialog.k kVar, android.content.DialogInterface.OnDismissListener onDismissListener) {
        if (i17 == 1) {
            return Ni(activity, 0, i18, str, onDismissListener);
        }
        if (i17 == 2) {
            return u6(activity, i18, str, str2, str3, str4, bArr, kVar);
        }
        return false;
    }

    @Override // uh4.c0
    public boolean Se(java.lang.String str) {
        com.tencent.mm.storage.z3 z3Var;
        android.database.Cursor J2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().J(com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING, false);
        while (true) {
            if (!J2.moveToNext()) {
                z3Var = null;
                break;
            }
            z3Var = new com.tencent.mm.storage.z3();
            z3Var.convertFrom(J2);
            if (z3Var.d1().equalsIgnoreCase(str)) {
                break;
            }
        }
        J2.close();
        return z3Var != null;
    }

    @Override // uh4.c0
    public void T(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "report: " + i17);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(20917, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f437134d));
    }

    @Override // uh4.c0
    public boolean T2() {
        boolean n17 = com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_SYSTEM_STATE_BOOLEAN_SYNC, false)));
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "isSysTeenMode:" + n17);
        return n17;
    }

    @Override // uh4.c0
    public void Uc(android.app.Activity activity, int i17) {
        Ni(activity, i17, 0, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uh4.c0
    public boolean Xd() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_show_wechat_teenmode_entrance, z65.c.a() ? 1 : 0) == 0) {
            java.lang.String str = (java.lang.String) gm0.j1.u().c().l(274436, null);
            if ((!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.toUpperCase().equals("CN")) == false) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "isHideTeenModeEntrance, not in china, hide entrance.");
                return true;
            }
        }
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("ShowTeenagerMode");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "isHideTeenModeEntrance, ShowTeenagerMode is null");
            return false;
        }
        int parseInt = java.lang.Integer.parseInt(d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "isHideTeenModeEntrance, val is %s", java.lang.Integer.valueOf(parseInt));
        return d17 != null && 1 == parseInt;
    }

    @Override // uh4.c0
    public boolean Yd() {
        if (isTeenMode()) {
            return gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_ENABLE_BY_SYS_BOOLEAN_SYNC, false);
        }
        return false;
    }

    @Override // uh4.c0
    public int ag() {
        if (!isTeenMode()) {
            return 1;
        }
        if (Ib()) {
            return gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_EMOTICON_RANGE_INT_SYNC, 0);
        }
        return 2;
    }

    @Override // uh4.c0
    public void b8() {
        java.util.Set set = this.f437135e;
        ((java.util.concurrent.CopyOnWriteArraySet) set).size();
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArraySet) set).iterator();
        while (it.hasNext()) {
            ((uh4.i0) it.next()).onDataChanged();
        }
        fs.g.b(uh4.f0.class, new vh4.i2(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x02cd A[Catch: Exception -> 0x0389, TryCatch #0 {Exception -> 0x0389, blocks: (B:19:0x021b, B:21:0x021f, B:23:0x0227, B:25:0x022d, B:27:0x0235, B:29:0x0262, B:31:0x0284, B:32:0x029e, B:37:0x02cd, B:39:0x0334, B:41:0x02bd, B:43:0x02c3), top: B:18:0x021b }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0334 A[Catch: Exception -> 0x0389, TRY_LEAVE, TryCatch #0 {Exception -> 0x0389, blocks: (B:19:0x021b, B:21:0x021f, B:23:0x0227, B:25:0x022d, B:27:0x0235, B:29:0x0262, B:31:0x0284, B:32:0x029e, B:37:0x02cd, B:39:0x0334, B:41:0x02bd, B:43:0x02c3), top: B:18:0x021b }] */
    @Override // uh4.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void bg(boolean r27) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vh4.t1.bg(boolean):void");
    }

    @Override // uh4.c0
    public com.tencent.mm.storage.z3 df() {
        android.database.Cursor J2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().J(1073741824, false);
        com.tencent.mm.storage.z3 z3Var = null;
        while (J2.moveToNext()) {
            z3Var = new com.tencent.mm.storage.z3();
            z3Var.convertFrom(J2);
        }
        J2.close();
        return z3Var;
    }

    @Override // uh4.c0
    public void ed(android.app.Activity activity, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        wi(activity, 0, i17, str, str2, str3, str4, true, null);
    }

    public final android.content.Context getContext() {
        java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
        return (k17 == null || k17.get() == null) ? com.tencent.mm.sdk.platformtools.x2.f193071a : (android.content.Context) k17.get();
    }

    @Override // uh4.c0
    public int h4() {
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_BIZ_ACCT_RANGE_INT_SYNC, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "getBizAcctOption, option:%s", java.lang.Integer.valueOf(r17));
        return r17;
    }

    @Override // uh4.c0
    public uh4.d ha(int i17) {
        uh4.d dVar = (uh4.d) this.f437141n.get(java.lang.Integer.valueOf(i17));
        if (dVar != null) {
            return dVar;
        }
        uh4.e0[] e0VarArr = {null};
        fs.g.a(uh4.e0.class, java.lang.Integer.valueOf(i17), new vh4.b2(this, e0VarArr));
        uh4.e0 e0Var = e0VarArr[0];
        return e0Var != null ? e0Var : vh4.i.f437082d;
    }

    @Override // uh4.c0
    public void hc(java.lang.String str) {
        java.lang.String str2;
        if (!gm0.j1.a() || c01.e2.a0() || !xh4.x.d()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "onSysContentChange skip account:" + gm0.j1.a());
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "onSysContentChange skip enableSysTeenModeXLab:" + xh4.x.d());
            return;
        }
        if (str.equals(android.provider.Settings.Secure.getUriFor("minors_mode_enabled").getPath())) {
            boolean Bi = Bi();
            boolean T2 = T2();
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "startWatchingMinorsModeState sys teen mode onchange, newState: %s oldState:%s", java.lang.Boolean.valueOf(Bi), java.lang.Boolean.valueOf(T2));
            if (Bi != T2 && Bi != ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
                if (Bi && !com.tencent.mm.sdk.platformtools.t8.n1(java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_NEED_NOTICE_STATE_BOOLEAN_SYNC, false)))) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeService", "USERINFO_SETTING_TEEN_MODE_NEED_NOTICE_STATE_BOOLEAN_SYNC set startWatchingMinorsModeState");
                    if (com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(15, null)) != 0) {
                        this.f437137g = true;
                        ((ku5.t0) ku5.t0.f312615d).B(new vh4.c2(this));
                    }
                } else if (com.tencent.mm.app.w.INSTANCE.f53889n) {
                    bg(false);
                }
            }
            this.f437136f = true;
            if (gm0.j1.a()) {
                str2 = gm0.j1.b().j();
                kotlin.jvm.internal.o.f(str2, "getUinString(...)");
            } else {
                str2 = "default";
            }
            com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("MicroMsg.TeenModeStatusManager_".concat(str2));
            kotlin.jvm.internal.o.f(M, "getMMKV(...)");
            M.putBoolean("MMKVKey_ManuallyClose", false);
            com.tencent.mars.xlog.Log.i("MicroMsg.TeenModeStatusManager", "resetManuallyClose:false");
        }
    }

    @Override // uh4.c0
    public int hd() {
        return gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_MINI_PROGRAM_RANGE_INT_SYNC, 0);
    }

    @Override // uh4.c0
    public void i3(android.content.Context context) {
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        ((uh4.c0) i95.n0.c(uh4.c0.class)).qc(1);
        ((uh4.c0) i95.n0.c(uh4.c0.class)).T(1);
        this.f437138h = null;
        this.f437139i = 1;
        if (isTeenMode) {
            ((uh4.c0) i95.n0.c(uh4.c0.class)).v5(context);
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "enterTeenModeMainUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "enterTeenModeMainUI", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // uh4.c0
    public java.util.HashMap i8() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(1, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jts));
        if (df() != null) {
            hashMap.put(2, com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.jqs));
        }
        return hashMap;
    }

    @Override // uh4.c0
    public boolean isTeenMode() {
        return gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_STATE_BOOLEAN_SYNC, false);
    }

    @Override // uh4.c0
    public boolean kf(int i17, java.lang.String str) {
        uh4.g0 y07 = wh4.j.f446012a.a().y0(i17, str, 0L);
        return !ha(i17).b(y07.field_time, c01.id.a()) && c01.z1.r().equals(y07.field_wardUserName);
    }

    @Override // uh4.c0
    public void na(android.content.Context context, java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(com.tencent.mm.sdk.platformtools.x2.f193071a);
        u1Var.g(str);
        u1Var.n(context.getString(com.tencent.mm.R.string.f490454vi));
        u1Var.l(new vh4.g2(this));
        u1Var.q(false);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        ((ku5.t0) ku5.t0.f312615d).k(new java.lang.Runnable() { // from class: vh4.t1$$b
            @Override // java.lang.Runnable
            public final void run() {
                vh4.t1.this.bg(false);
            }
        }, 1000L);
    }

    @Override // uh4.c0
    public void q3(int i17, uh4.d dVar) {
        this.f437141n.put(java.lang.Integer.valueOf(i17), dVar);
    }

    @Override // uh4.c0
    public void q8(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, long j17, int i17, boolean z17) {
        if (!z17 || !c01.e2.a0()) {
            Di(context, str, str2, str3, j17, i17);
            return;
        }
        vh4.u1 u1Var = new vh4.u1(this, context, str, str2, str3, j17, i17);
        vh4.v1 v1Var = new vh4.v1(this, context, str, str2, str3, j17, i17);
        r45.x04 x04Var = new r45.x04();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 19502;
        lVar.f70666c = "/cgi-bin/micromsg-bin/isadultage";
        lVar.f70664a = x04Var;
        lVar.f70665b = new r45.y04();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.modelbase.i iVar = new com.tencent.mm.modelbase.i();
        iVar.p(a17);
        iVar.l().h(new vh4.w1(this, u1Var, v1Var));
    }

    @Override // uh4.c0
    public void qc(int i17) {
        this.f437134d = i17;
    }

    @Override // uh4.c0
    public void rh(android.content.Context context, java.lang.String str, java.lang.String str2, long j17, long j18, java.lang.String str3, java.lang.String str4, java.lang.Boolean bool) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.AuthorizationDetailUI.class);
        intent.putExtra("intent_extra_msg_content", str3);
        intent.putExtra("intent_extra_cdn_img_path", str4);
        intent.putExtra("intent_extra_guardian_username", str);
        intent.putExtra("intent_extra_ward_username", str2);
        intent.putExtra("intent_extra_request_time", j17);
        intent.putExtra("intent_extra_msg_svrid", j18);
        intent.putExtra("intent_extra_need_anim", bool);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToAuthorizationMsgUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/teenmode/model/TeenModeService", "jumpToAuthorizationMsgUI", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // uh4.c0
    public void tc(uh4.i0 i0Var) {
        if (i0Var != null) {
            ((java.util.concurrent.CopyOnWriteArraySet) this.f437135e).remove(i0Var);
        }
    }

    @Override // uh4.c0
    public boolean u6(android.content.Context context, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, byte[] bArr, com.tencent.mm.ui.widget.dialog.k kVar) {
        com.tencent.mm.storage.z3 df6 = df();
        if (df6 == null) {
            return false;
        }
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        ((c61.l7) b6Var).dl(context, df6.d1(), context.getString(com.tencent.mm.R.string.jqi) + str2, true, context.getString(com.tencent.mm.R.string.f490551ya), new vh4.y1(this, str2, str3, i17, str, str4, df6, bArr, context, kVar), null);
        return true;
    }

    @Override // uh4.c0
    public void v5(android.content.Context context) {
        if (!(context instanceof com.tencent.mm.ui.MMFragmentActivity)) {
            new vh4.c1().l().h(new vh4.h2(this, db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.ggd), true, false, null), context));
        } else {
            com.tencent.mm.ui.MMFragmentActivity context2 = (com.tencent.mm.ui.MMFragmentActivity) context;
            kotlin.jvm.internal.o.g(context2, "context");
            kotlinx.coroutines.l.d(v65.m.b(context2), null, null, new xh4.u(context2, null, null), 3, null);
        }
    }

    @Override // uh4.c0
    public uh4.c xf(int i17) {
        java.util.Map map = this.f437140m;
        uh4.c cVar = (uh4.c) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17));
        if (cVar != null) {
            return cVar;
        }
        uh4.d0[] d0VarArr = {null};
        fs.g.a(uh4.d0.class, java.lang.Integer.valueOf(i17), new vh4.z1(this, d0VarArr));
        uh4.d0 d0Var = d0VarArr[0];
        if (d0Var != null) {
            return d0Var;
        }
        uh4.c cVar2 = (uh4.c) ((java.util.HashMap) map).get(Integer.MAX_VALUE);
        if (cVar2 != null) {
            return cVar2;
        }
        uh4.d0[] d0VarArr2 = {null};
        fs.g.a(uh4.d0.class, Integer.MAX_VALUE, new vh4.a2(this, d0VarArr2));
        return d0VarArr2[0];
    }
}
