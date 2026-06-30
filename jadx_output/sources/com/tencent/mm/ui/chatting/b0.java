package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class b0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.AppAttachNewDownloadUI f198483d;

    public b0(com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI) {
        this.f198483d = appAttachNewDownloadUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.pluginsdk.model.m2 m2Var;
        boolean z17;
        com.tencent.mm.storage.f9 f27;
        ty.m0 m0Var = (ty.m0) i95.n0.c(ty.m0.class);
        java.lang.String num = java.lang.Integer.toString(hashCode());
        final com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI = this.f198483d;
        ((sy.x) m0Var).wi(num, appAttachNewDownloadUI.E, com.tencent.mm.sdk.platformtools.w2.a(appAttachNewDownloadUI.C), 301L, appAttachNewDownloadUI.g7(), appAttachNewDownloadUI.i5());
        if (appAttachNewDownloadUI.M) {
            com.tencent.mm.pluginsdk.ui.tools.y3 y3Var = appAttachNewDownloadUI.B1;
            boolean z18 = appAttachNewDownloadUI.J1;
            if (y3Var == null) {
                java.lang.String str = appAttachNewDownloadUI.f198116u;
                int i17 = x51.t1.f452086a;
                if (str == null) {
                    str = "";
                }
                long j17 = -1;
                if (str.startsWith("gh_")) {
                    rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
                    java.lang.String str2 = appAttachNewDownloadUI.f198116u;
                    ((qv.o) u2Var).getClass();
                    boolean g17 = r01.z.g(str2);
                    if (g17 && (f27 = pt0.f0.f2(appAttachNewDownloadUI.f198116u, appAttachNewDownloadUI.f198115t)) != null) {
                        j17 = f27.t0();
                    }
                    z17 = g17;
                } else {
                    z17 = false;
                }
                long j18 = j17;
                jk3.v vVar = appAttachNewDownloadUI.f198121x1;
                gc5.c cVar = appAttachNewDownloadUI.f198124y1;
                com.tencent.mm.plugin.handoff.model.AbsHandOffFile absHandOffFile = appAttachNewDownloadUI.f198111p1;
                java.lang.String str3 = appAttachNewDownloadUI.E;
                java.lang.String str4 = appAttachNewDownloadUI.B;
                java.lang.String str5 = appAttachNewDownloadUI.C;
                java.lang.String e17 = kk.k.e(str4);
                jt.v vVar2 = (jt.v) i95.n0.c(jt.v.class);
                java.lang.String str6 = appAttachNewDownloadUI.E;
                ((ht.a) vVar2).getClass();
                com.tencent.mm.pluginsdk.ui.tools.x3 x3Var = new com.tencent.mm.pluginsdk.ui.tools.x3(vVar, cVar, absHandOffFile, str3, str4, str5, e17, com.tencent.mm.pluginsdk.ui.tools.f.e(str6), 0, false, appAttachNewDownloadUI.f198115t, appAttachNewDownloadUI.f198116u, true, "", z17, j18);
                x3Var.f191997t = z18;
                x3Var.f191995r = ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).ij();
                ((sy.x) ((ty.i0) i95.n0.c(ty.i0.class))).getClass();
                appAttachNewDownloadUI.B1 = new com.tencent.mm.pluginsdk.ui.tools.g6(appAttachNewDownloadUI, x3Var, appAttachNewDownloadUI);
            }
            com.tencent.mm.pluginsdk.ui.tools.y3 y3Var2 = appAttachNewDownloadUI.B1;
            yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$a
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i18 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.Y1;
                    com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.this.b7();
                    return jz5.f0.f302826a;
                }
            };
            com.tencent.mm.pluginsdk.ui.tools.g6 g6Var = (com.tencent.mm.pluginsdk.ui.tools.g6) y3Var2;
            g6Var.getClass();
            g6Var.f191647d = aVar;
            if (appAttachNewDownloadUI.getIntent().getBooleanExtra("show_jump_chat", false)) {
                com.tencent.mm.pluginsdk.ui.tools.y3 y3Var3 = appAttachNewDownloadUI.B1;
                yz5.a aVar2 = new yz5.a() { // from class: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$b
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        int i18 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.Y1;
                        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI2 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.this;
                        appAttachNewDownloadUI2.getClass();
                        android.content.Intent putExtra = new android.content.Intent(appAttachNewDownloadUI2, (java.lang.Class<?>) com.tencent.mm.ui.chatting.ChattingUI.class).putExtra("msg_local_id", appAttachNewDownloadUI2.f198115t).putExtra("finish_direct", true).putExtra("show_search_chat_content_result", true).putExtra("need_hight_item", true).putExtra("Chat_User", appAttachNewDownloadUI2.f198117v.Q0());
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(putExtra);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(appAttachNewDownloadUI2, arrayList.toArray(), "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "doGotoChatting", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        appAttachNewDownloadUI2.startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(appAttachNewDownloadUI2, "com/tencent/mm/ui/chatting/AppAttachNewDownloadUI", "doGotoChatting", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return jz5.f0.f302826a;
                    }
                };
                com.tencent.mm.pluginsdk.ui.tools.g6 g6Var2 = (com.tencent.mm.pluginsdk.ui.tools.g6) y3Var3;
                g6Var2.getClass();
                g6Var2.f191648e = aVar2;
            }
            ((com.tencent.mm.pluginsdk.ui.tools.g6) appAttachNewDownloadUI.B1).b();
            if (z18) {
                if (appAttachNewDownloadUI.C1 == null) {
                    appAttachNewDownloadUI.k7();
                }
                if (!x51.t1.b(appAttachNewDownloadUI.B) && (m2Var = appAttachNewDownloadUI.C1) != null) {
                    ((com.tencent.mm.pluginsdk.ui.otherway.v) m2Var).e(((com.tencent.mm.pluginsdk.ui.tools.g6) appAttachNewDownloadUI.B1).f191649f);
                }
            } else {
                com.tencent.mm.ui.widget.dialog.k0 k0Var = ((com.tencent.mm.pluginsdk.ui.tools.g6) appAttachNewDownloadUI.B1).f191649f;
                if (appAttachNewDownloadUI.N1 != null) {
                    com.tencent.mm.plugin.appbrand.service.k5 k5Var = (com.tencent.mm.plugin.appbrand.service.k5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.k5.class);
                    if (k5Var == null) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppAttachNewDownloadUI", "enhanceBottomSheet, openMaterialService is null");
                    } else {
                        bi1.g gVar = bi1.g.ATTACH;
                        zh1.p pVar = (zh1.p) k5Var;
                        if (!pVar.Vi(gVar)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "tryEnhanceBottomSheet, openMaterialService is not enabled");
                        } else if (pVar.Zi(k0Var, appAttachNewDownloadUI.N1)) {
                            zh1.z0 z0Var = appAttachNewDownloadUI.P1;
                            if (z0Var != null) {
                                z0Var.dead();
                            }
                            appAttachNewDownloadUI.P1 = pVar.Ai(gVar, appAttachNewDownloadUI, k0Var, appAttachNewDownloadUI.N1, null, null);
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppAttachNewDownloadUI", "tryEnhanceBottomSheet, not need enhance");
                        }
                    }
                }
                com.tencent.mm.pluginsdk.model.g2 g2Var = new com.tencent.mm.pluginsdk.model.g2("", appAttachNewDownloadUI.B);
                g2Var.f189312e = appAttachNewDownloadUI.f198115t;
                g2Var.f189313f = appAttachNewDownloadUI.f198116u;
                g2Var.f189310c = appAttachNewDownloadUI.C;
                g2Var.f189311d = appAttachNewDownloadUI.E;
                g2Var.f189315h = 3;
                ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ni(g2Var);
            }
            com.tencent.mm.pluginsdk.ui.tools.y3 y3Var4 = appAttachNewDownloadUI.B1;
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            final java.util.ArrayList arrayList2 = new java.util.ArrayList();
            appAttachNewDownloadUI.V6(arrayList, arrayList2);
            if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                yz5.p pVar2 = new yz5.p() { // from class: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$f
                    @Override // yz5.p
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        db5.g4 g4Var = (db5.g4) obj2;
                        int i18 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.Y1;
                        int i19 = 0;
                        while (true) {
                            java.util.List list = arrayList;
                            if (i19 >= list.size()) {
                                break;
                            }
                            java.util.List list2 = arrayList2;
                            if (i19 >= list2.size()) {
                                break;
                            }
                            g4Var.g(((java.lang.Integer) list2.get(i19)).intValue(), (java.lang.CharSequence) list.get(i19), com.tencent.mm.R.raw.icons_filled_open);
                            i19++;
                        }
                        return jz5.f0.f302826a;
                    }
                };
                com.tencent.mm.pluginsdk.ui.tools.g6 g6Var3 = (com.tencent.mm.pluginsdk.ui.tools.g6) y3Var4;
                g6Var3.getClass();
                g6Var3.f191651h = pVar2;
                g6Var3.f191652i = new yz5.l() { // from class: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$g
                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        int i18 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.Y1;
                        com.tencent.mm.ui.chatting.AppAttachNewDownloadUI appAttachNewDownloadUI2 = com.tencent.mm.ui.chatting.AppAttachNewDownloadUI.this;
                        appAttachNewDownloadUI2.getClass();
                        appAttachNewDownloadUI2.q7(((android.view.MenuItem) obj).getItemId());
                        return jz5.f0.f302826a;
                    }
                };
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var2 = ((com.tencent.mm.pluginsdk.ui.tools.g6) appAttachNewDownloadUI.B1).f191649f;
            if (k0Var2 != null) {
                k0Var2.v();
            }
            ((com.tencent.mm.pluginsdk.ui.tools.g6) appAttachNewDownloadUI.B1).f191649f.B = new com.tencent.mm.ui.chatting.c0(appAttachNewDownloadUI);
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            j45.l.g("favorite");
            arrayList3.add(appAttachNewDownloadUI.getString(com.tencent.mm.R.string.hjg));
            arrayList4.add(22);
            appAttachNewDownloadUI.V6(arrayList3, arrayList4);
            com.tencent.mm.ui.chatting.d0 d0Var = new com.tencent.mm.ui.chatting.d0(appAttachNewDownloadUI);
            if (arrayList3.size() != 0 || !com.tencent.mm.sdk.platformtools.t8.K0(null)) {
                com.tencent.mm.ui.widget.dialog.k0 k0Var3 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) appAttachNewDownloadUI, 1, false);
                k0Var3.f211872n = new com.tencent.mm.ui.chatting.e0(appAttachNewDownloadUI, null, arrayList3, arrayList4, null);
                k0Var3.f211881s = new com.tencent.mm.ui.chatting.f0(appAttachNewDownloadUI, d0Var);
                k0Var3.f211854d = new com.tencent.mm.ui.chatting.g0(appAttachNewDownloadUI);
                appAttachNewDownloadUI.Q1 = k0Var3;
                k0Var3.v();
            }
        }
        return false;
    }
}
