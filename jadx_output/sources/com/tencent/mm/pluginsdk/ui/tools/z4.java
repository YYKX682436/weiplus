package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes8.dex */
public class z4 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI f192020a;

    public z4(com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI) {
        this.f192020a = miniQBReaderUI;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI = this.f192020a;
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "openReadFile, receiveValue = %s %s", str, miniQBReaderUI.toString());
        if ("query for feature_wx_float_window successfully".equals(str)) {
            miniQBReaderUI.f191404v = true;
            vt0.c.d(miniQBReaderUI.f191401s.s(), miniQBReaderUI.f191401s.a(), true, false, miniQBReaderUI, miniQBReaderUI.f191394i, miniQBReaderUI.f191398p, miniQBReaderUI.f191395m, miniQBReaderUI.f191399q, miniQBReaderUI.f191397o, miniQBReaderUI.f191388J, com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI.V6(miniQBReaderUI, true), miniQBReaderUI.f191397o, miniQBReaderUI.f191407y);
            return;
        }
        if ("xwebFileReaderReachEnd".equals(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "xweb file reader reach end");
            md5.b bVar = miniQBReaderUI.f191401s;
            if (bVar == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MiniQBReaderUI", "mFloatBallHelper null");
                return;
            } else {
                bVar.f325883y = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "setEnded ended:%b", java.lang.Boolean.TRUE);
                return;
            }
        }
        if ("xwebFileReaderUserOperated".equals(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "xweb file reader user operated");
            md5.b bVar2 = miniQBReaderUI.f191401s;
            if (bVar2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MiniQBReaderUI", "mFloatBallHelper null");
                return;
            }
            ak3.c cVar = bVar2.f300111d;
            bVar2.m(bVar2.h(cVar != null ? cVar.getBitmap() : null));
            com.tencent.mars.xlog.Log.i("MicroMsg.FilesFloatBall.FilesPageMultiTaskHelper", "setStart");
            return;
        }
        if ("xwebFileReaderMenuEditClick".equals(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "xweb file reader menu edit click");
            new com.tencent.mm.pluginsdk.ui.n2(miniQBReaderUI, miniQBReaderUI.f191394i, miniQBReaderUI.f191398p, miniQBReaderUI.f191395m, miniQBReaderUI.f191399q, miniQBReaderUI.f191396n).f190911g.C();
            java.lang.String str2 = miniQBReaderUI.f191396n;
            java.lang.String str3 = miniQBReaderUI.f191395m;
            ((ht.s) ((jt.a0) i95.n0.c(jt.a0.class))).getClass();
            int i17 = com.tencent.mm.pluginsdk.model.t3.q(miniQBReaderUI) ? 1 : 2;
            java.lang.String str4 = miniQBReaderUI.f191399q;
            if (str4 == null || str4.isEmpty() || str2 == null || str2.isEmpty() || str3 == null || str3.isEmpty()) {
                by5.c4.c("WXWebReporter", "reportXFilesAction failed, invalid param");
                return;
            }
            java.lang.String str5 = str4 + "," + str2 + "," + str3 + ",6," + i17;
            by5.c4.f("WXWebReporter", "reportXFilesAction key = 25696, value = " + str5);
            by5.s0.t(25696, str5);
            return;
        }
        if ("fileReaderClosed".equals(str)) {
            md5.b bVar3 = miniQBReaderUI.f191401s;
            if (bVar3 == null || bVar3.U(1, bVar3.f325883y)) {
                return;
            }
            boolean z17 = miniQBReaderUI.f191403u;
            if (z17) {
                miniQBReaderUI.finish();
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MiniQBReaderUI", "opCallback isFinishCurPage:%s", java.lang.Boolean.valueOf(z17));
                miniQBReaderUI.f191403u = true;
                return;
            }
        }
        if ("fileReaderMenuClicked".equals(str)) {
            if (miniQBReaderUI.D == null) {
                java.lang.String e17 = com.tencent.mm.pluginsdk.ui.tools.f.e(miniQBReaderUI.f191395m);
                md5.b bVar4 = miniQBReaderUI.f191401s;
                gc5.b bVar5 = miniQBReaderUI.f191400r;
                com.tencent.mm.plugin.handoff.model.HandOffFile handOffFile = miniQBReaderUI.f191406x;
                java.lang.String str6 = miniQBReaderUI.f191395m;
                com.tencent.mm.pluginsdk.ui.tools.x3 x3Var = new com.tencent.mm.pluginsdk.ui.tools.x3(bVar4, bVar5, handOffFile, str6, miniQBReaderUI.f191394i, miniQBReaderUI.f191398p, miniQBReaderUI.f191396n, com.tencent.mm.pluginsdk.ui.tools.f.e(str6), 0, true, miniQBReaderUI.f191389d, miniQBReaderUI.f191390e, true, "", miniQBReaderUI.f191391f, miniQBReaderUI.f191392g);
                x3Var.f191998u = miniQBReaderUI.f191393h;
                jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
                java.lang.String e18 = com.tencent.mm.pluginsdk.ui.tools.f.e(miniQBReaderUI.f191395m);
                ((ht.s) a0Var).getClass();
                java.lang.String[] strArr = com.tencent.mm.pluginsdk.model.t3.f189442a;
                x3Var.f191996s = com.tencent.mm.sdk.platformtools.t8.K0(e18) ? false : com.tencent.mm.pluginsdk.model.t3.f189443b.contains(e18);
                jt.a0 a0Var2 = (jt.a0) i95.n0.c(jt.a0.class);
                androidx.appcompat.app.AppCompatActivity context = miniQBReaderUI.getContext();
                ((ht.s) a0Var2).getClass();
                com.tencent.mm.pluginsdk.model.t3.q(context);
                x3Var.f191995r = miniQBReaderUI.f191397o != 19 && ((t02.e) ((a00.i) i95.n0.c(a00.i.class))).ij();
                miniQBReaderUI.D = new com.tencent.mm.pluginsdk.ui.tools.g6(miniQBReaderUI, x3Var, miniQBReaderUI);
                com.tencent.mm.pluginsdk.model.g2 g2Var = new com.tencent.mm.pluginsdk.model.g2(e17, miniQBReaderUI.f191394i);
                miniQBReaderUI.F = g2Var;
                g2Var.f189311d = miniQBReaderUI.f191395m;
                g2Var.f189310c = miniQBReaderUI.f191398p;
                g2Var.f189312e = miniQBReaderUI.f191389d;
                g2Var.f189313f = miniQBReaderUI.f191390e;
                g2Var.f189315h = 4;
                if (((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ai(4)) {
                    miniQBReaderUI.E = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).wi(miniQBReaderUI.getContext(), miniQBReaderUI.F);
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(miniQBReaderUI.f191390e) && miniQBReaderUI.f191389d > 0) {
                    com.tencent.mm.pluginsdk.ui.tools.g6 g6Var = miniQBReaderUI.D;
                    yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.pluginsdk.ui.tools.z4$$a
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI2;
                            com.tencent.mm.pluginsdk.ui.tools.z4 z4Var = com.tencent.mm.pluginsdk.ui.tools.z4.this;
                            z4Var.getClass();
                            ty.k0 k0Var = (ty.k0) i95.n0.c(ty.k0.class);
                            ty.p0 p0Var = ty.p0.f422746r;
                            ty.r0 r0Var = ty.r0.f422754f;
                            com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI3 = z4Var.f192020a;
                            java.lang.String str7 = miniQBReaderUI3.f191390e;
                            ti3.q qVar = (ti3.q) k0Var;
                            qVar.getClass();
                            if (str7 == null || str7.length() == 0) {
                                miniQBReaderUI2 = miniQBReaderUI3;
                            } else {
                                miniQBReaderUI2 = miniQBReaderUI3;
                                qVar.Bi(p0Var, r0Var, null, null, 0, 0L, 0L, 0L, str7);
                            }
                            android.content.Intent className = new android.content.Intent().putExtra("msg_local_id", miniQBReaderUI2.f191389d).putExtra("Chat_User", miniQBReaderUI2.f191390e).putExtra("from_global_search", true).putExtra("need_hight_item", true).setClassName(miniQBReaderUI2, "com.tencent.mm.ui.chatting.ChattingUI");
                            com.tencent.mm.pluginsdk.ui.tools.MiniQBReaderUI miniQBReaderUI4 = z4Var.f192020a;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            arrayList.add(className);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(miniQBReaderUI4, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/MiniQBReaderUI$6", "lambda$onReceiveValue$0", "()Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            miniQBReaderUI4.startActivity((android.content.Intent) arrayList.get(0));
                            yj0.a.f(miniQBReaderUI4, "com/tencent/mm/pluginsdk/ui/tools/MiniQBReaderUI$6", "lambda$onReceiveValue$0", "()Lkotlin/Unit;", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                            return jz5.f0.f302826a;
                        }
                    };
                    g6Var.getClass();
                    g6Var.f191648e = aVar;
                }
            }
            miniQBReaderUI.D.b();
            com.tencent.mm.pluginsdk.model.m2 m2Var = miniQBReaderUI.E;
            if (m2Var != null) {
                ((com.tencent.mm.pluginsdk.ui.otherway.v) m2Var).e(miniQBReaderUI.D.f191649f);
            } else {
                miniQBReaderUI.W6(new com.tencent.mm.pluginsdk.ui.tools.c5(miniQBReaderUI.D.f191649f));
                ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ni(miniQBReaderUI.F);
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var = miniQBReaderUI.D.f191649f;
            if (k0Var != null) {
                k0Var.v();
            }
            miniQBReaderUI.D.f191649f.B = new com.tencent.mm.pluginsdk.ui.tools.a5(this);
        }
    }
}
