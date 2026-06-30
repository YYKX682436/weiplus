package com.tencent.mm.plugin.setting.ui.fixtools;

@db5.a(3)
/* loaded from: classes11.dex */
public class FixToolsUI extends com.tencent.mm.ui.base.preference.MMPreference {

    /* renamed from: e, reason: collision with root package name */
    public static boolean f160064e;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.base.preference.r f160065d;

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public int getResourceId() {
        return com.tencent.mm.R.xml.f494891ar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0165  */
    @Override // com.tencent.mm.ui.base.preference.MMPreference, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.base.preference.MMPreference
    public boolean onPreferenceTreeClick(com.tencent.mm.ui.base.preference.r rVar, com.tencent.mm.ui.base.preference.Preference preference) {
        boolean z17;
        java.lang.Class<vg3.x3> cls;
        boolean z18;
        android.database.Cursor B;
        if (preference.f197780q.equals("fix_tools_uplog")) {
            ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).getClass();
            if (k14.n.a().f303361a) {
                com.tencent.mm.ui.MMWizardActivity.X6(this, new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI.class));
            } else {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.class);
                intent.putExtra("entry_fix_tools_uplog", 9);
                com.tencent.mm.ui.MMWizardActivity.X6(this, intent);
            }
            return true;
        }
        int i17 = 2;
        int i18 = 0;
        if (preference.f197780q.equals("fix_tools_db_recover")) {
            android.content.Intent className = new android.content.Intent().setClassName(getContext(), "com.tencent.mm.plugin.dbbackup.DBRecoveryUI");
            className.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 2);
            androidx.appcompat.app.AppCompatActivity context = getContext();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(className);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToRecovery", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToRecovery", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (preference.f197780q.equals("fix_tools_contact_recover")) {
            final com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), "修复中", true, false, null);
            try {
                ((com.tencent.mm.plugin.messenger.foundation.d0) ((vg3.r3) i95.n0.c(vg3.r3.class))).wi(this, new yz5.l() { // from class: o14.m$$b
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        java.lang.Boolean bool = (java.lang.Boolean) obj;
                        boolean z19 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI.f160064e;
                        com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI fixToolsUI = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI.this;
                        fixToolsUI.getClass();
                        Q.dismiss();
                        dp.a.makeText(fixToolsUI, bool.booleanValue() ? "修复完成" : "修复失败", 1).show();
                        if (!bool.booleanValue()) {
                            return null;
                        }
                        ((com.tencent.mm.ui.base.preference.h0) fixToolsUI.f160065d).m("fix_tools_contact_recover", true);
                        ((com.tencent.mm.ui.base.preference.h0) fixToolsUI.f160065d).notifyDataSetChanged();
                        return null;
                    }
                });
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FixToolsUI", th6, "fixContactRecover err", new java.lang.Object[0]);
                Q.dismiss();
                dp.a.makeText(this, "修复失败", 1).show();
            }
            return true;
        }
        java.lang.Throwable th7 = null;
        java.lang.Class<vg3.x3> cls2 = vg3.x3.class;
        if (preference.f197780q.equals("fix_tools_add_friend_verify_record")) {
            com.tencent.mm.ui.widget.dialog.u3 Q2 = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), "修复中", true, false, null);
            try {
                com.tencent.mm.storage.jb jbVar = (com.tencent.mm.storage.jb) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls2))).oj();
                l75.k0 k0Var = jbVar.f195062d;
                if (k0Var != null) {
                    k0Var.delete("VerifyRecordMsgInfo", null, null);
                }
                jbVar.doNotify("VerifyRecordMsgInfo", 5, null);
                o14.n nVar = new o14.n(this, Q2);
                ft1.j jVar = (ft1.j) ((xg3.u) i95.n0.c(xg3.u.class));
                jVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "getAllVerifyRecordHistory start");
                com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordService", "resetAllFetchedFlag");
                ((com.tencent.mm.sdk.platformtools.o4) ((jz5.n) jVar.f266495e).getValue()).putBoolean("all_history_fetched", false);
                v65.i.b((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) jVar.f266494d).getValue(), null, new ft1.f(jVar, nVar, null), 1, null);
            } catch (java.lang.Throwable th8) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FixToolsUI", th8, "fixAddFriendVerifyRecordRecover err", new java.lang.Object[0]);
                try {
                    Q2.dismiss();
                } catch (java.lang.Exception unused) {
                }
                dp.a.makeText(this, "修复失败", 1).show();
            }
            return true;
        }
        if (preference.f197780q.endsWith("fix_tools_matrix")) {
            if (!ih.d.c()) {
                dp.a.makeText(this, "Matrix is never installed", 0).show();
            }
            return true;
        }
        if (preference.f197780q.endsWith("fix_tools_search")) {
            android.content.Intent intent2 = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.fixtools.FixSearchUI.class);
            intent2.addFlags(67108864);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToSearchUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "goToSearchUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        }
        if (preference.f197780q.equals("fix_force_update")) {
            ((tn4.o) ((un4.e) i95.n0.c(un4.e.class))).qj(1, getContext());
            return true;
        }
        if (preference.f197780q.equals("fix_tools_chat_msg_time")) {
            final com.tencent.mm.ui.widget.dialog.u3 c17 = com.tencent.mm.ui.widget.dialog.u3.c(this, getString(com.tencent.mm.R.string.f490468vx), false, 0, null);
            yz5.p pVar = new yz5.p() { // from class: o14.m$$c
                @Override // yz5.p
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    java.lang.Integer num = (java.lang.Integer) obj;
                    java.lang.Integer num2 = (java.lang.Integer) obj2;
                    boolean z19 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI.f160064e;
                    com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI fixToolsUI = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUI.this;
                    fixToolsUI.getClass();
                    boolean equals = num.equals(num2);
                    com.tencent.mm.ui.widget.dialog.u3 u3Var = c17;
                    if (!equals) {
                        u3Var.setMessage(java.lang.String.format("%d/%d", java.lang.Integer.valueOf(num.intValue()), java.lang.Integer.valueOf(num2.intValue())));
                        u3Var.show();
                        return null;
                    }
                    u3Var.dismiss();
                    if (v24.c.f432903a.a()) {
                        return null;
                    }
                    ((com.tencent.mm.ui.base.preference.h0) fixToolsUI.f160065d).m("fix_tools_chat_msg_time", true);
                    ((com.tencent.mm.ui.base.preference.h0) fixToolsUI.f160065d).notifyDataSetChanged();
                    int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(fixToolsUI);
                    e4Var.f211776c = fixToolsUI.getString(com.tencent.mm.R.string.f490441v5);
                    e4Var.c();
                    return null;
                }
            };
            if (c01.id.f37261a) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                android.database.Cursor B2 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls2))).Di().B(1, new java.util.ArrayList(), "*", true);
                kotlin.jvm.internal.o.f(B2, "getNecessaryCursorWithConversation(...)");
                while (B2.moveToNext()) {
                    com.tencent.mm.storage.l4 l4Var = new com.tencent.mm.storage.l4();
                    l4Var.convertFrom(B2);
                    if (l4Var.w0() > c01.id.c()) {
                        arrayList3.add(l4Var);
                        ot5.g.c("MicroMsg.ChatMsgTimeFixer", "[getWrongConversation] collect wrong conversation: " + l4Var.h1() + ' ' + l4Var.w0());
                    }
                }
                B2.close();
                if (arrayList3.isEmpty()) {
                    ot5.g.c("MicroMsg.ChatMsgTimeFixer", "fix all time but it's empty");
                } else {
                    ot5.g.c("MicroMsg.ChatMsgTimeFixer", "collect wrong conversation size:" + arrayList3.size());
                    pVar.invoke(0, java.lang.Integer.valueOf(arrayList3.size()));
                    ((ku5.t0) ku5.t0.f312615d).g(new v24.b(arrayList3, pVar));
                    v24.c.f432904b = null;
                    i18 = 1;
                }
            } else {
                ot5.g.c("MicroMsg.ChatMsgTimeFixer", "fix all time but not sync time");
            }
            if (i18 != 0) {
                c17.show();
            }
            return true;
        }
        if (!preference.f197780q.equals("fix_tools_conversation_flag")) {
            if (preference.f197780q.equals("fix_tools_aggressive_clean")) {
                j45.l.j(this, "clean", ".ui.CleanUI", new android.content.Intent(), null);
                return true;
            }
            if (preference.f197780q.equals("fix_tools_file_analyse")) {
                android.content.Intent intent3 = new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.fixtools.FixToolsFileListUI.class);
                intent3.addFlags(67108864);
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(intent3);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(this, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((android.content.Intent) arrayList4.get(0));
                yj0.a.f(this, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            }
            if (!preference.f197780q.equals("fix_tools_filehelper")) {
                return false;
            }
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls2))).Bi().n("filehelper", true);
            if (n17 != null) {
                if (n17.r2()) {
                    z17 = false;
                } else {
                    n17.N2();
                    z17 = true;
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(n17.w0())) {
                    n17.n1("");
                    z17 = true;
                }
                if (n17.o2()) {
                    n17.r3();
                    z17 = true;
                }
                if (z17) {
                    c01.e2.g0(n17, true);
                    ((com.tencent.mm.ui.base.preference.h0) this.f160065d).m("fix_tools_filehelper", true);
                    int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(this);
                    e4Var.f211776c = getString(com.tencent.mm.R.string.o39);
                    e4Var.c();
                }
            }
            return true;
        }
        p75.n0 n0Var = dm.i2.K;
        p75.d dVar = dm.i2.T;
        p75.i0 g17 = n0Var.g(kz5.c0.i(dm.i2.L, dVar, dm.i2.Q));
        p75.m0 x17 = dVar.x(0);
        p75.d dVar2 = dm.i2.W;
        g17.f352657d = x17.c(dVar2.m().d(dVar2.j("message_fold")));
        p75.l0 a17 = g17.a();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        l75.k0 k0Var2 = gm0.j1.u().f273153f;
        if (k0Var2 == null || (B = k0Var2.B(a17.f352636a, a17.f352637b)) == null) {
            cls = cls2;
        } else {
            while (B.moveToNext()) {
                try {
                    java.lang.String string = B.getString(i18);
                    long j17 = B.getLong(1);
                    java.lang.Class<vg3.x3> cls3 = cls2;
                    long j18 = B.getLong(i17);
                    arrayList5.add(new jz5.o(string, java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18)));
                    com.tencent.mars.xlog.Log.i("MicroMsg.ConversationFlagFixer", "[fixAllFlag] found wrong conversation: " + string + ", flag=" + j17 + ", conversationTime=" + j18);
                    cls2 = cls3;
                    i17 = 2;
                    i18 = 0;
                    th7 = null;
                } finally {
                }
            }
            cls = cls2;
            vz5.b.a(B, th7);
        }
        if (arrayList5.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ConversationFlagFixer", "[fixAllFlag] no wrong conversation found");
            z18 = false;
        } else {
            java.util.Iterator it = arrayList5.iterator();
            while (it.hasNext()) {
                jz5.o oVar = (jz5.o) it.next();
                java.lang.String str = (java.lang.String) oVar.f302841d;
                long longValue = ((java.lang.Number) oVar.f302842e).longValue();
                long longValue2 = ((java.lang.Number) oVar.f302843f).longValue();
                p75.n0 n0Var2 = dm.i2.K;
                android.content.ContentValues contentValues = new android.content.ContentValues();
                contentValues.put(dm.i2.T.f352625a, java.lang.Long.valueOf(longValue2));
                p75.h1 j19 = n0Var2.j(contentValues);
                j19.f352651c = dm.i2.L.j(str);
                int f17 = j19.a().f(gm0.j1.u().f273153f);
                com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(cls))).Di();
                if ((Di instanceof l75.a1) && f17 > 0) {
                    Di.b(3, Di, str);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ConversationFlagFixer", "[fixAllFlag] fixed " + str + ": " + longValue + " -> " + longValue2 + ", ret=" + f17);
            }
            v24.h.f432924b = null;
            z18 = true;
        }
        if (z18 && !v24.h.f432923a.a()) {
            ((com.tencent.mm.ui.base.preference.h0) this.f160065d).m("fix_tools_conversation_flag", true);
            ((com.tencent.mm.ui.base.preference.h0) this.f160065d).notifyDataSetChanged();
            int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(this);
            e4Var2.f211776c = getString(com.tencent.mm.R.string.o39);
            e4Var2.c();
        }
        return true;
    }
}
