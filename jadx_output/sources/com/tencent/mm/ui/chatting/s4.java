package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class s4 implements com.tencent.mm.pluginsdk.ui.chat.u {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f202658a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.h4 f202659b;

    public s4(com.tencent.mm.ui.chatting.h4 h4Var) {
        this.f202659b = h4Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void C() {
        c01.d9.b().p().w(81, java.lang.Boolean.FALSE);
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        if (com.tencent.mars.comm.NetStatusUtil.isNetworkConnected(h4Var.f201645j.g())) {
            h4Var.A();
        } else {
            p21.i.b(h4Var.f201645j.g(), com.tencent.mm.R.string.f490500wu, null);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void a() {
        j45.l.j(this.f202659b.f201645j.g(), "subapp", ".ui.openapi.AddAppUI", new android.content.Intent(), null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void b() {
        java.util.HashSet c17;
        com.tencent.mm.ui.chatting.component.j0 j0Var = (com.tencent.mm.ui.chatting.component.j0) ((sb5.h) this.f202659b.f201645j.f460708c.a(sb5.h.class));
        j0Var.getClass();
        android.content.Intent intent = new android.content.Intent(j0Var.f198580d.f460717l.getContext(), (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
        if (com.tencent.mm.storage.z3.m4(j0Var.f198580d.x()) || com.tencent.mm.storage.z3.q4(j0Var.f198580d.x())) {
            com.tencent.mm.ui.contact.i5.e();
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206786g, 1, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62));
        } else {
            com.tencent.mm.ui.contact.i5.e();
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206786g, 1, 2048, com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62));
        }
        intent.putExtra("list_type", 4);
        intent.putExtra("received_card_name", j0Var.f198580d.x());
        ((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).getClass();
        if (ih.a.b("clicfg_chatbot_hide_card_list", 0) == 0) {
            c17 = c01.e2.i();
            c17.add(c01.z1.r());
            c17.add("weixin");
        } else {
            c17 = com.tencent.mm.ui.contact.i5.c();
        }
        c17.add(j0Var.f198580d.x());
        intent.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.J1(c17, ","));
        intent.putExtra("titile", j0Var.f198580d.s().getString(com.tencent.mm.R.string.f489934fx));
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 16);
        intent.putExtra("INTENT_KEY_PUSH_DOWN_OUT_ANIMATION", true);
        pf5.j0.a(intent, wb5.i.class);
        pf5.j0.a(intent, aj5.g1.class);
        pf5.j0.a(intent, aj5.i.class);
        pf5.j0.a(intent, cj5.u3.class);
        pf5.j0.a(intent, cj5.k4.class);
        pf5.j0.a(intent, cj5.s.class);
        pf5.j0.a(intent, cj5.h3.class);
        pf5.j0.a(intent, cj5.n3.class);
        pf5.j0.a(intent, cj5.w2.class);
        pf5.j0.a(intent, cj5.l2.class);
        ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
        pf5.j0.a(intent, k50.g.class);
        intent.putExtra("ForwardParams_ForwardByUIC", true);
        n13.b0 b0Var = (n13.b0) i95.n0.c(n13.b0.class);
        android.app.Activity context = j0Var.f198580d.f460717l.getContext();
        dk5.b0 b0Var2 = (dk5.b0) b0Var;
        b0Var2.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        b0Var2.Ai(context, intent);
        context.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void c(int i17) {
        int i18;
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        if (i17 == 0) {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.app.Activity g17 = h4Var.f201645j.g();
            ((sb0.f) jVar).getClass();
            boolean a17 = j35.u.a(g17, "android.permission.CAMERA", 20, "", "");
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkcamera[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), h4Var.f201645j.g());
            if (a17 && h4Var.z()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10923, 1, "", 3, h4Var.I());
                return;
            }
            return;
        }
        if (i17 != 1) {
            return;
        }
        java.lang.String string = h4Var.f201645j.g().getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getString("gallery", "1");
        com.tencent.mm.plugin.report.service.f0.a(19);
        boolean equalsIgnoreCase = string.equalsIgnoreCase("0");
        yb5.d dVar = h4Var.f201645j;
        if (equalsIgnoreCase) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = dVar.f460717l;
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.g(baseChattingUIFragment, 200, 1, 0, 1, "", "", null);
        } else {
            java.lang.String t17 = dVar.t();
            java.lang.String x17 = dVar.x();
            android.content.Intent intent = new android.content.Intent();
            if (dVar.D()) {
                intent.putExtra("gallery_report_tag", 20);
            } else {
                intent.putExtra("gallery_report_tag", 21);
            }
            if (com.tencent.mm.storage.z3.a4(x17)) {
                intent.putExtra("album_business_tag", "album_business_byp");
            }
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_c2c_img_use_start_activity_for_result, false)) {
                i18 = 217;
            } else {
                java.lang.String sessionId = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
                intent.putExtra("album_query_session_id", sessionId);
                com.tencent.mm.ui.chatting.component.lk lkVar = (com.tencent.mm.ui.chatting.component.lk) ((sb5.w1) dVar.f460708c.a(sb5.w1.class));
                lkVar.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SendImgComponent", "registerAlbumCallback %s", sessionId);
                o23.b bVar = o23.b.f342411a;
                kotlin.jvm.internal.o.g(sessionId, "sessionId");
                java.util.HashMap hashMap = o23.b.f342412b;
                hashMap.put(sessionId, new java.lang.ref.WeakReference(lkVar));
                com.tencent.mars.xlog.Log.i("MicroMsg.AlbumResultDispatcher", "registerCallback: count " + hashMap.size());
                i18 = -1;
            }
            int i19 = i18;
            r15.b quoteSendExtCommonInfo = h4Var.f201636a.getQuoteSendExtCommonInfo();
            if (quoteSendExtCommonInfo != null) {
                ok5.d.b(intent, "key_quote_extcommon", quoteSendExtCommonInfo, new ok5.h());
            }
            if (h4Var.f201644i && com.tencent.mm.ui.chatting.h4.f201635w) {
                if (com.tencent.mm.storage.z3.O4(x17) || com.tencent.mm.storage.z3.N4(x17) || com.tencent.mm.storage.z3.m4(x17)) {
                    if (j62.e.g().c(new com.tencent.mm.repairer.config.chatting.RepairerConfigDragSelectPic()) == 1) {
                        pf5.j0.a(intent, i33.h.class);
                    }
                    boolean z18 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigC2CLiveImageSend()) == 1;
                    boolean z19 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).nj(new com.tencent.mm.repairer.config.chatting.RepairerConfigC2CLiveAlbumAutoEnableConfig()) == 1;
                    if (z18) {
                        intent.putExtra("Gallery_LivePhoto_Need_Query", true);
                        intent.putExtra("Gallery_LivePhoto_Auto_Enable", z19);
                    }
                    vb0.o oVar2 = (vb0.o) i95.n0.c(vb0.o.class);
                    com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment2 = dVar.f460717l;
                    int Ri = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_c2c_video_gallery_select_limit, bm5.h0.RepairerConfig_Media_C2CGallerySelectLimit_Int, 9);
                    ((ub0.r) oVar2).getClass();
                    com.tencent.mm.pluginsdk.ui.tools.l7.g(baseChattingUIFragment2, i19, Ri, 3, 3, t17, x17, intent);
                } else {
                    intent.putExtra("key_enable_send_as_file", com.tencent.mm.storage.z3.p4(x17));
                    vb0.o oVar3 = (vb0.o) i95.n0.c(vb0.o.class);
                    com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment3 = dVar.f460717l;
                    ((ub0.r) oVar3).getClass();
                    com.tencent.mm.pluginsdk.ui.tools.l7.g(baseChattingUIFragment3, i19, 9, 3, 3, t17, x17, intent);
                }
            } else if (com.tencent.mm.storage.z3.z3(x17)) {
                vb0.o oVar4 = (vb0.o) i95.n0.c(vb0.o.class);
                com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment4 = dVar.f460717l;
                ((ub0.r) oVar4).getClass();
                com.tencent.mm.pluginsdk.ui.tools.l7.g(baseChattingUIFragment4, i19, 9, 12, 1, t17, x17, intent);
            } else {
                vb0.o oVar5 = (vb0.o) i95.n0.c(vb0.o.class);
                com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment5 = dVar.f460717l;
                ((ub0.r) oVar5).getClass();
                com.tencent.mm.pluginsdk.ui.tools.l7.g(baseChattingUIFragment5, i19, 9, 3, 1, t17, x17, intent);
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 2, 1);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void d() {
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14523, 0);
        this.f202659b.D();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void e() {
        ((com.tencent.mm.ui.chatting.component.le) ((sb5.x0) this.f202659b.f201645j.f460708c.a(sb5.x0.class))).q0(true);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void f(com.tencent.mm.pluginsdk.model.app.m mVar) {
        nr4.a aVar;
        com.tencent.mm.ui.chatting.component.f fVar = (com.tencent.mm.ui.chatting.component.f) ((sb5.b) this.f202659b.f201645j.f460708c.a(sb5.b.class));
        fVar.getClass();
        if (mVar == null) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "onAppSelected, info is null, %s", new com.tencent.mm.sdk.platformtools.z3());
            return;
        }
        l75.e0 e0Var = com.tencent.mm.pluginsdk.model.app.m.f188983f2;
        if ("wxce6f23b478a3a2a2".equals(mVar.field_appId) && (aVar = fVar.f198995e) != null) {
            aVar.a(2, fVar.f198580d.u().d1());
        }
        if (!mVar.G0()) {
            if (mVar.field_status == 3) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "onAppSeleted fail, app is in blacklist, packageName = " + mVar.field_packageName);
                return;
            } else {
                if (fVar.f198996f.c(mVar.field_packageName, mVar.field_openId) || mVar.field_status != 5 || com.tencent.mm.sdk.platformtools.t8.K0(mVar.S)) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("rawUrl", mVar.S);
                j45.l.j(fVar.f198580d.g(), "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            }
        }
        if (!mVar.G0()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "serviceAppSelect not service app");
            return;
        }
        if (fVar.f198580d.u() == null || com.tencent.mm.sdk.platformtools.t8.K0(fVar.f198580d.u().d1())) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "serviceAppSelect talker is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.AppMsgComponent", "serviceApp, jumpType[%d], package[%s], appid[%s]", java.lang.Integer.valueOf(mVar.f238391x1), mVar.field_packageName, mVar.field_appId);
        if (mVar.f238391x1 == 2 && !com.tencent.mm.sdk.platformtools.t8.K0(mVar.f238381p1)) {
            fVar.m0(mVar);
            return;
        }
        int i17 = mVar.f238391x1;
        if (i17 != 3) {
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.AppMsgComponent", "JUMP NATIVE ForwardUrl[%s]", mVar.f238381p1);
                ((com.tencent.mm.app.plugin.j) o25.z1.a()).c(fVar.f198580d.f460717l.getContext(), mVar.f238381p1, false, new com.tencent.mm.ui.chatting.component.e(fVar));
                return;
            }
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_openId)) {
            com.tencent.mm.pluginsdk.model.app.u5.Ui().b(mVar.field_appId);
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP fail, openId is null, go get it");
        } else {
            if (fVar.f198996f == null || com.tencent.mm.sdk.platformtools.t8.K0(mVar.field_packageName)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP fail");
                fVar.m0(mVar);
                return;
            }
            boolean c17 = fVar.f198996f.c(mVar.field_packageName, mVar.field_openId);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP success[%s]", java.lang.Boolean.valueOf(c17));
            if (c17) {
                return;
            }
            fVar.m0(mVar);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void g() {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("enterprise_scene", 4);
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        intent.putExtra("enterprise_biz_name", h4Var.I());
        intent.putExtra("biz_chat_chat_id", ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) h4Var.f201645j.f460708c.a(sb5.f.class))).w0());
        j45.l.j(h4Var.f201645j.g(), "brandservice", ".ui.EnterpriseBizContactPlainListUI", intent, null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void h(int i17, long j17) {
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        if (isTeenMode) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "exit in teen mode");
            ((uh4.c0) i95.n0.c(uh4.c0.class)).O8(h4Var.f201645j.g());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "gotoRoomLiveEntrance");
        ss5.c0 c0Var = (ss5.c0) i95.n0.c(ss5.c0.class);
        android.app.Activity context = h4Var.f201645j.g();
        java.lang.String x17 = h4Var.f201645j.x();
        vd2.u0 u0Var = (vd2.u0) c0Var;
        u0Var.getClass();
        kotlin.jvm.internal.o.g(context, "context");
        boolean z17 = u0Var.f435927e;
        java.lang.String str = u0Var.f435926d;
        if (z17 || com.tencent.mm.plugin.finder.feed.ui.FinderLivePostPendingUI.f109394w) {
            com.tencent.mars.xlog.Log.i(str, "startChatroomLive startingLive:" + u0Var.f435927e + ", isPendingPost:" + com.tencent.mm.plugin.finder.feed.ui.FinderLivePostPendingUI.f109394w);
            return;
        }
        u0Var.f435927e = true;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", i17);
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", j17);
        intent.putExtra("ENTER_SCENE", 2);
        intent.putExtra("KEY_FROM_CHAT_ROOM_ID", x17);
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_START_ONLY_FROM_CHATROOM_VISIBLE_INT_SYNC, -1);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        com.tencent.mars.xlog.Log.i(str, "lastLiveStartOnlyFromChatRoomVisibleTag:" + intValue);
        if (intValue < 0) {
            intent.putExtra("KEY_WHITE_LIST_MODE_UNSELECT", true);
        } else if (intValue > 0) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(x17);
            intent.putExtra("KEY_WHITE_ROOM_LIST", arrayList);
            intent.putExtra("KEY_WHITE_LIST_MODE", 2);
        } else {
            intent.putExtra("KEY_WHITE_LIST_MODE", 0);
        }
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb.H7((c61.yb) c17, context, intent, 0L, null, 0, 0, false, 124, null);
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderLivePostPendingUI.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/FinderChatroomLiveFeatureService", "startChatroomLive", "(Landroid/content/Context;Ljava/lang/String;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/finder/live/FinderChatroomLiveFeatureService", "startChatroomLive", "(Landroid/content/Context;Ljava/lang/String;IJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        u0Var.f435927e = false;
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void i() {
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        sb5.f fVar = (sb5.f) h4Var.f201645j.f460708c.a(sb5.f.class);
        android.content.Intent intent = new android.content.Intent();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(java.lang.String.valueOf(3));
        if (fVar != null && ((com.tencent.mm.ui.chatting.component.biz.a) fVar).f198753r) {
            arrayList.add(java.lang.String.valueOf(4));
            arrayList.add(java.lang.String.valueOf(7));
            arrayList.add(java.lang.String.valueOf(21));
            arrayList.add(java.lang.String.valueOf(32));
            arrayList.add(java.lang.String.valueOf(33));
            arrayList.add(java.lang.String.valueOf(9));
            arrayList.add(java.lang.String.valueOf(10));
            arrayList.add(java.lang.String.valueOf(11));
            arrayList.add(java.lang.String.valueOf(12));
            arrayList.add(java.lang.String.valueOf(13));
            arrayList.add(java.lang.String.valueOf(15));
            arrayList.add(java.lang.String.valueOf(16));
            arrayList.add(java.lang.String.valueOf(17));
            arrayList.add(java.lang.String.valueOf(18));
            arrayList.add(java.lang.String.valueOf(19));
            arrayList.add(java.lang.String.valueOf(20));
            arrayList.add(java.lang.String.valueOf(34));
            arrayList.add(java.lang.String.valueOf(24));
        } else if (com.tencent.mm.storage.z3.p4(h4Var.f201639d.d1())) {
            arrayList.add(java.lang.String.valueOf(5));
            arrayList.add(java.lang.String.valueOf(7));
            arrayList.add(java.lang.String.valueOf(14));
            arrayList.add(java.lang.String.valueOf(18));
            arrayList.add(java.lang.String.valueOf(4));
            arrayList.add(java.lang.String.valueOf(9));
            arrayList.add(java.lang.String.valueOf(10));
            arrayList.add(java.lang.String.valueOf(11));
            arrayList.add(java.lang.String.valueOf(12));
            arrayList.add(java.lang.String.valueOf(15));
            arrayList.add(java.lang.String.valueOf(13));
            arrayList.add(java.lang.String.valueOf(16));
            arrayList.add(java.lang.String.valueOf(17));
            arrayList.add(java.lang.String.valueOf(19));
            arrayList.add(java.lang.String.valueOf(20));
        }
        intent.putExtra("key_to_user", h4Var.f201639d.d1());
        intent.putExtra("key_fav_item_id", android.text.TextUtils.join(",", arrayList));
        z30.u uVar = (z30.u) i95.n0.c(z30.u.class);
        android.app.Activity g17 = h4Var.f201645j.g();
        ((y30.q) uVar).getClass();
        o72.x1.L0(g17, ".ui.FavSelectUI", intent, null);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14103, 1, com.tencent.mm.sdk.platformtools.z.f193109e);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void j() {
        qk.z zVar = new qk.z();
        zVar.f364112h = 17L;
        zVar.f364155a = 13;
        com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
        if (p6Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingFooterEventImpl", "unable to get emoticon liteapp feature service");
        } else {
            ((com.tencent.mm.feature.emoji.f4) p6Var).wi(this.f202659b.f201645j.g(), zVar);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(12065, 4);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void k(int i17) {
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        if (iq.b.g(h4Var.f201645j.g()) || iq.b.C(h4Var.f201645j.g()) || iq.b.v(h4Var.f201645j.g()) || iq.b.z(h4Var.f201645j.g()) || iq.b.e(h4Var.f201645j.g())) {
            return;
        }
        h4Var.E(i17);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void l(int i17, int i18) {
        boolean z17;
        com.tencent.mm.ui.chatting.component.yg ygVar = (com.tencent.mm.ui.chatting.component.yg) ((sb5.c1) this.f202659b.f201645j.f460708c.a(sb5.c1.class));
        if (com.tencent.mm.storage.z3.m4(ygVar.f198580d.x()) || com.tencent.mm.storage.z3.q4(ygVar.f198580d.u().d1())) {
            z17 = (((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).bj(ygVar.f198580d.u().Q0(), 0) & 4096) == 0;
        } else {
            z17 = false;
        }
        boolean z18 = c01.e2.E(ygVar.f198580d.u().d1()) && (c01.z1.d() & 8) != 0;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) ygVar.f198580d.g(), 1, false);
        k0Var.f211872n = new com.tencent.mm.ui.chatting.component.ug(ygVar, i17, i18, z18, z17);
        k0Var.f211881s = new com.tencent.mm.ui.chatting.component.vg(ygVar, i17, i18);
        k0Var.v();
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void m() {
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        if (h4Var.f201642g) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("enter_scene", 1);
            intent.putExtra("chatroom_name", h4Var.I());
            j45.l.j(h4Var.f201645j.g(), "aa", ".ui.LaunchAAUI", intent, null);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void n() {
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        if (iq.b.v(h4Var.f201645j.g())) {
            return;
        }
        iq.b.s(h4Var.f201645j.g());
        if (iq.b.e(h4Var.f201645j.g())) {
            return;
        }
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        java.lang.String I = h4Var.I();
        am.w00 w00Var = voipCheckIsDeviceUsingEvent.f54943g;
        if (I.equals(w00Var.f8248d) || !(w00Var.f8246b || w00Var.f8247c)) {
            h4Var.B();
        } else {
            dp.a.makeText(h4Var.f201645j.g(), w00Var.f8245a ? com.tencent.mm.R.string.aqg : com.tencent.mm.R.string.aqh, 0).show();
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "voip is running, can't do this");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x026f, code lost:
    
        if (r6 == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e7  */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [int] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [int] */
    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o() {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.s4.o():void");
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void p() {
        char c17;
        m53.v2 v2Var;
        m53.x2 x2Var;
        m53.r3 r3Var;
        java.lang.String a17;
        t53.k kVar = (t53.k) i95.n0.c(t53.k.class);
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        android.app.Activity context = h4Var.f201645j.g();
        java.lang.String sessionId = h4Var.I();
        ((t53.m0) kVar).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "enterSendGift sessionId[%s]", sessionId);
        f63.e eVar = (f63.e) ((f63.h) ((u53.e0) i95.n0.c(u53.e0.class))).Ai(sessionId);
        y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(eVar.t0());
        y53.m Di2 = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(eVar.v0());
        if (Di != null && Di2 != null) {
            long j17 = Di.field_accountType;
            java.lang.String t07 = Di.t0();
            long j18 = Di2.field_accountType;
            java.lang.String t08 = Di2.t0();
            com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct gameLifeSessionStruct = new com.tencent.mm.autogen.mmdata.rpt.GameLifeSessionStruct();
            gameLifeSessionStruct.f58340d = 3L;
            gameLifeSessionStruct.f58341e = 302L;
            gameLifeSessionStruct.f58342f = 2L;
            gameLifeSessionStruct.f58343g = 2L;
            gameLifeSessionStruct.f58344h = 301L;
            gameLifeSessionStruct.f58352p = gameLifeSessionStruct.b("SessionId", sessionId, true);
            gameLifeSessionStruct.f58347k = j17;
            gameLifeSessionStruct.f58348l = gameLifeSessionStruct.b("from_username", t07, true);
            gameLifeSessionStruct.f58349m = j18;
            gameLifeSessionStruct.f58350n = gameLifeSessionStruct.b("to_username", t08, true);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("ser_name", 4L);
            gameLifeSessionStruct.p(java.net.URLEncoder.encode(jSONObject.toString()));
            gameLifeSessionStruct.k();
        }
        m33.l1 l1Var = (m33.l1) i95.n0.c(m33.l1.class);
        java.lang.String t09 = eVar.t0();
        java.lang.String v07 = eVar.v0();
        ((com.tencent.mm.plugin.game.p0) l1Var).getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.GameExternalService", "fromUsername:%s, toUsername:%s", t09, v07);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(t09) && !com.tencent.mm.sdk.platformtools.t8.K0(v07)) {
            m53.l1 i17 = com.tencent.mm.plugin.game.commlib.i.i();
            if (i17 != null && (v2Var = i17.f323863h) != null && (x2Var = v2Var.f324124d) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GameExternalService", "GiftEntranceType:%d", java.lang.Integer.valueOf(x2Var.f324169d));
                m53.x2 x2Var2 = i17.f323863h.f324124d;
                int i18 = x2Var2.f324169d;
                if (i18 != 1) {
                    if (i18 == 2 && (r3Var = x2Var2.f324171f) != null && !com.tencent.mm.sdk.platformtools.t8.K0(r3Var.f324005d)) {
                        java.lang.String str = i17.f323863h.f324124d.f324171f.f324006e;
                        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                            a17 = "?from_username=" + java.net.URLEncoder.encode(t09) + "&to_username=" + java.net.URLEncoder.encode(v07);
                        } else {
                            java.util.HashMap hashMap = new java.util.HashMap();
                            hashMap.put("from_username", t09);
                            hashMap.put("to_username", v07);
                            a17 = r53.f.a(str, hashMap);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.GameExternalService", "Gift Weapp, AppId:%s, Path:%s", i17.f323863h.f324124d.f324171f.f324005d, a17);
                        m53.r3 r3Var2 = i17.f323863h.f324124d.f324171f;
                        r53.f.w(context, r3Var2.f324005d, a17, r3Var2.f324007f);
                        c17 = 'G';
                    }
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(x2Var2.f324170e)) {
                    java.util.HashMap hashMap2 = new java.util.HashMap();
                    hashMap2.put("from_username", t09);
                    hashMap2.put("to_username", v07);
                    java.lang.String a18 = r53.f.a(i17.f323863h.f324124d.f324170e, hashMap2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.GameExternalService", "Gift jumpUrl:%s", a18);
                    r53.f.u(context, a18);
                    c17 = '(';
                }
                if (Di != null || Di2 == null) {
                }
                com.tencent.mm.game.report.d dVar = com.tencent.mm.game.report.e.f68194a;
                if (c17 == '(') {
                    dVar.b(sessionId, Di.field_accountType, Di.t0(), Di2.field_accountType, Di2.t0(), 40L, 4L);
                    return;
                } else {
                    dVar.b(sessionId, Di.field_accountType, Di.t0(), Di2.field_accountType, Di2.t0(), 71L, 4L);
                    return;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.GameExternalService", "no Gift info");
        }
        c17 = 65535;
        if (Di != null) {
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void q() {
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        if (iq.b.C(h4Var.f201645j.g())) {
            return;
        }
        yb5.d dVar = h4Var.f201645j;
        if (iq.b.v(dVar.g()) || iq.b.e(dVar.g())) {
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.app.Activity g17 = dVar.g();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(g17, "android.permission.RECORD_AUDIO", 81, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "summerper checkPermission checkmicrophone[%b], stack[%s], activity[%s]", valueOf, new com.tencent.mm.sdk.platformtools.z3(), dVar.g());
        if (a17) {
            ((com.tencent.mm.ui.chatting.component.sm) ((sb5.j2) dVar.f460708c.a(sb5.j2.class))).o0(false);
            h4Var.f201636a.setBottomPanelVisibility(8);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void r() {
        int r17;
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var.d(12097, 11, 0, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        g0Var.d(11850, 4, 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        sb6.append(h4Var.f201646k);
        sb6.append("_");
        sb6.append(java.lang.System.currentTimeMillis());
        h4Var.f201647l = sb6.toString();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        com.tencent.mm.ui.chatting.h4.O(2, 0, h4Var.f201647l);
        com.tencent.mm.ui.chatting.b5 b5Var = new com.tencent.mm.ui.chatting.b5();
        java.lang.String Zi = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_weishi_hb_config, "", true);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(Zi)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(Zi);
                int i17 = jSONObject.getInt("weishi_hb_sw");
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "getWeiShiHbConfig() weishi_hb_sw: %s", java.lang.Integer.valueOf(i17));
                if (i17 == 0) {
                    b5Var.f198486a = false;
                } else {
                    b5Var.f198486a = true;
                }
                b5Var.f198487b = com.tencent.mm.ui.chatting.h4.H(jSONObject, "simple_chinese");
                b5Var.f198488c = com.tencent.mm.ui.chatting.h4.H(jSONObject, "xg_traditional_chinese");
                b5Var.f198489d = com.tencent.mm.ui.chatting.h4.H(jSONObject, "tw_traditional_chinese");
                b5Var.f198490e = com.tencent.mm.ui.chatting.h4.H(jSONObject, "english");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingFooterEventImpl", "getWeiShiHbConfig() Exception:%s", e17.getMessage());
            }
        }
        java.lang.String I = h4Var.I();
        ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
        java.util.HashMap hashMap = com.tencent.mm.plugin.luckymoney.model.m5.f145452a;
        if (c01.e2.S(I)) {
            gm0.j1.i();
            r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_WEISHI_UNION_SWITCH_INT_SYNC, 0);
        } else {
            gm0.j1.i();
            r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_WEISHI_SWITCH_INT_SYNC, 0);
        }
        boolean z17 = r17 == 1 && b5Var.f198486a;
        com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        g0Var2.d(28838, 0, 1, 0, 0, 1);
        yb5.d dVar = h4Var.f201645j;
        if (h4Var.f201642g) {
            g0Var2.d(11701, 1, 0, 0, 2, 2);
            gm0.j1.i();
            boolean z18 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).el() && ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).gl() && !((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode() && ((java.lang.Integer) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_LUCKY_MONEY_LIVE_SWITCH_INT_SYNC, 0)).intValue() == 1;
            if (!z17 && !z18) {
                com.tencent.mm.ui.chatting.h4.v(h4Var, uuid);
                g0Var2.d(18890, 4, 0, uuid, "", "");
                return;
            }
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) dVar.g(), 1, false);
            k0Var.f211872n = new com.tencent.mm.ui.chatting.v4(this, z18, z17, b5Var);
            k0Var.f211881s = new com.tencent.mm.ui.chatting.w4(this, uuid);
            k0Var.v();
            com.tencent.mm.ui.chatting.h4.x(h4Var);
            com.tencent.mm.ui.chatting.h4.O(3, 0, h4Var.f201647l);
            return;
        }
        if (!(r17 == 1 && b5Var.f198486a) && com.tencent.mm.ui.chatting.h4.M(I)) {
            com.tencent.mm.ui.chatting.h4.y(h4Var, uuid);
            ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).getClass();
            if (com.tencent.mm.plugin.luckymoney.model.m5.s()) {
                com.tencent.mm.ui.chatting.h4.x(h4Var);
            }
            g0Var2.d(18890, 4, 0, uuid, "", "");
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) dVar.g(), 1, false);
        k0Var2.f211872n = new com.tencent.mm.ui.chatting.x4(this, I, b5Var, r17);
        k0Var2.f211881s = new com.tencent.mm.ui.chatting.y4(this, uuid);
        k0Var2.v();
        com.tencent.mm.ui.chatting.h4.x(h4Var);
        com.tencent.mm.ui.chatting.h4.O(3, 0, h4Var.f201647l);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void s() {
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "onEnterGroupSolitaire() chatroom:%s", h4Var.f201645j.x());
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_group_solitatire_create", true);
        intent.putExtra("key_group_solitatire_scene", 5);
        y63.a aVar = new y63.a();
        aVar.H = h4Var.f201645j.g().getString(com.tencent.mm.R.string.fsk) + "\n";
        java.lang.String o17 = x63.g.o(aVar);
        aVar.field_key = o17;
        aVar.K = ".";
        aVar.Q = 1;
        intent.putExtra("key_group_solitatire_key", o17);
        intent.putExtra("key_group_solitatire_chatroom_username", h4Var.f201645j.x());
        x63.g.e(h4Var.f201645j.x(), aVar);
        ((t63.e) i95.n0.c(t63.e.class)).wi().k(h4Var.f201645j.x(), aVar);
        j45.l.j(h4Var.f201645j.g(), "groupsolitaire", ".ui.GroupSolitatireEditUI", intent, null);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void t() {
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        intent.putExtra("service_app_talker_user", h4Var.I());
        j45.l.p(h4Var.f201645j.f460717l, "subapp", ".ui.openapi.ServiceAppUI", intent, com.tencent.cloud.huiyan.exception.CallbackErrorCode.HY_VERIFY_LOCAL_TIME_OUT);
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.u
    public void u(int i17, int i18) {
        boolean z17;
        com.tencent.mm.ui.chatting.h4 h4Var = this.f202659b;
        if (iq.b.v(h4Var.f201645j.g())) {
            return;
        }
        iq.b.s(h4Var.f201645j.g());
        if (iq.b.m(h4Var.f201645j.g(), true, null) || iq.b.n(h4Var.f201645j.g(), true) || iq.b.q(h4Var.f201645j.g(), true) || iq.b.e(h4Var.f201645j.g())) {
            return;
        }
        com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent voipCheckIsDeviceUsingEvent = new com.tencent.mm.autogen.events.VoipCheckIsDeviceUsingEvent();
        voipCheckIsDeviceUsingEvent.e();
        if (h4Var.I() != null) {
            java.lang.String I = h4Var.I();
            am.w00 w00Var = voipCheckIsDeviceUsingEvent.f54943g;
            if (!I.equals(w00Var.f8248d) && (w00Var.f8246b || w00Var.f8247c)) {
                dp.a.makeText(h4Var.f201645j.g(), w00Var.f8245a ? com.tencent.mm.R.string.aqg : com.tencent.mm.R.string.aqh, 0).show();
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterEventImpl", "voip is running, can't do this");
                return;
            }
        }
        boolean z18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().i() == 2;
        if (1 != ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableVoiceVoipFromPlugin", 1) || z18) {
            h4Var.C();
        } else {
            java.lang.String I2 = h4Var.I();
            if (!android.text.TextUtils.isEmpty(I2)) {
                ((co5.p) ((jp5.n) i95.n0.c(jp5.n.class))).Ni(I2);
            }
            yb5.d dVar = h4Var.f201645j;
            if (com.tencent.mm.storage.z3.m4(dVar.u().d1()) || com.tencent.mm.storage.z3.q4(dVar.u().d1())) {
                z17 = (((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).bj(dVar.u().Q0(), 0) & 8192) == 0;
            } else {
                z17 = false;
            }
            this.f202658a = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) dVar.g(), 1, false);
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class))).f199263e;
            java.util.HashMap hashMap = new java.util.HashMap();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f202658a;
            k0Var.f211872n = new com.tencent.mm.ui.chatting.t4(this, hashMap, chatFooter, i17, i18, z17);
            k0Var.f211855d2 = true;
            k0Var.Y1 = true;
            k0Var.f211881s = new com.tencent.mm.ui.chatting.u4(this, hashMap, i17, i18, chatFooter);
            k0Var.v();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11033, 4, 1, 0);
    }
}
