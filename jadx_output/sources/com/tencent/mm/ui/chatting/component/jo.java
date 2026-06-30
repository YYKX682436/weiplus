package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.p2.class)
/* loaded from: classes12.dex */
public class jo extends com.tencent.mm.ui.chatting.component.a implements sb5.p2 {

    /* renamed from: e, reason: collision with root package name */
    public final android.util.SparseBooleanArray f199314e = new android.util.SparseBooleanArray();

    /* renamed from: f, reason: collision with root package name */
    public boolean f199315f = false;

    public jo() {
        new java.util.HashMap();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        java.util.Map map = com.tencent.mm.plugin.sight.decode.model.s.H;
        wf0.k1 k1Var = (wf0.k1) i95.n0.c(wf0.k1.class);
        com.tencent.mm.plugin.sight.decode.model.c cVar = new com.tencent.mm.plugin.sight.decode.model.c();
        ((vf0.y1) k1Var).getClass();
        t21.o2.aj(cVar, 0L);
        this.f199314e.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x038c  */
    @Override // yn.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void N(int r32, int r33, android.content.Intent r34) {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.jo.N(int, int, android.content.Intent):void");
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        this.f199315f = j62.e.g().c(new com.tencent.mm.repairer.config.chatting.mediagroup.RepairerConfigMediaGroupVideoExtInfoOpt()) == 1;
        new java.util.HashMap();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VideoComponent", "videoExtInfoOptEnable: " + this.f199315f);
    }

    public boolean m0(com.tencent.mm.storage.f9 f9Var, boolean z17) {
        if (!f9Var.isVideo() && !f9Var.Y2()) {
            return z17;
        }
        t21.v2 s17 = com.tencent.mm.ui.chatting.gallery.j1.s(f9Var);
        if (s17 == null) {
            return false;
        }
        int i17 = s17.f415011i;
        int g17 = t21.d3.g(s17);
        boolean i18 = s17.i();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VideoComponent", "it is video download: %b, status %d, download progress %d", java.lang.Boolean.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(g17));
        return i18;
    }

    public boolean n0(android.view.MenuItem menuItem, final com.tencent.mm.storage.f9 f9Var) {
        int i17;
        int i18;
        int i19;
        int itemId = menuItem.getItemId();
        if (itemId == 106) {
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
            if (g17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.VideoComponent", "save video but videoInfo is null!");
                return true;
            }
            if (g17.f415011i != 199) {
                gm0.j1.e().j(new com.tencent.mm.ui.chatting.component.ko(this, g17.d(), 6));
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VideoComponent", "[ImageGalleryUI] enter");
                android.content.Intent intent = new android.content.Intent(this.f198580d.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
                intent.putExtra("img_gallery_msg_id", f9Var.getMsgId());
                intent.putExtra("img_gallery_msg_svr_id", f9Var.I0());
                intent.putExtra("img_gallery_talker", f9Var.Q0());
                intent.putExtra("img_gallery_chatroom_name", f9Var.Q0());
                intent.putExtra("img_gallery_enter_video_opcode", t21.d3.d(f9Var.getMsgId(), 2));
                com.tencent.mm.ui.chatting.component.z4.a(this.f198580d, f9Var, intent);
                com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f198580d.f460717l;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(baseChattingUIFragment, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickSaveVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                baseChattingUIFragment.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(baseChattingUIFragment, "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickSaveVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                this.f198580d.f460717l.overridePendingTransition(0, 0);
                return true;
            }
            java.lang.String rj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false);
            if (com.tencent.mm.storage.z3.R4(g17.h())) {
                i17 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(g17.h());
            } else {
                i17 = 0;
            }
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(106L, 215L, 1L, false);
            g0Var.d(12084, java.lang.Integer.valueOf(g17.f415008f), java.lang.Integer.valueOf(g17.f415015m * 1000), 0, 2, g17.h(), java.lang.Integer.valueOf(i17), t21.v2.c(g17.g()), java.lang.Long.valueOf(g17.f415012j));
            java.lang.String str = g17.S;
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            t21.v2 h17 = t21.d3.h(str);
            if (h17 != null && h17.f415011i == 199) {
                rj6 = ((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).Ai(f9Var, false);
            }
            ((yb0.g) ((zb0.b0) i95.n0.c(zb0.b0.class))).Bi(this.f198580d.g(), rj6, new com.tencent.mm.ui.chatting.component.lo(this));
            return true;
        }
        if (itemId == 107) {
            com.tencent.mm.ui.chatting.manager.t.a(f9Var, this.f198580d.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.jo$$a
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.ui.chatting.component.jo joVar = com.tencent.mm.ui.chatting.component.jo.this;
                    joVar.getClass();
                    if (!c01.d9.b().E()) {
                        db5.t7.k(joVar.f198580d.g(), joVar.f198580d.f460717l.getContentView());
                        return;
                    }
                    com.tencent.mm.storage.f9 f9Var2 = f9Var;
                    if (f9Var2.M2()) {
                        android.content.Intent intent2 = new android.content.Intent(joVar.f198580d.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                        intent2.putExtra("Retr_Msg_Id", f9Var2.getMsgId());
                        intent2.putExtra("Retr_MsgTalker", f9Var2.Q0());
                        intent2.putExtra("Retr_Msg_content", f9Var2.j());
                        intent2.putExtra("Retr_From", "chattingui");
                        intent2.putExtra("scene_from", 17);
                        intent2.putExtra("Retr_Msg_Type", 1);
                        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment2 = joVar.f198580d.f460717l;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(baseChattingUIFragment2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        baseChattingUIFragment2.startActivity((android.content.Intent) arrayList2.get(0));
                        yj0.a.f(baseChattingUIFragment2, "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        return;
                    }
                    wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                    java.lang.String z07 = f9Var2.z0();
                    ((vf0.y1) x1Var).getClass();
                    t21.v2 h18 = t21.d3.h(z07);
                    if (h18 == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.VideoComponent", "retransmit video but videoInfo is null!");
                        return;
                    }
                    java.lang.String f17 = h18.f();
                    if (!com.tencent.mm.vfs.w6.j(f17)) {
                        f17 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var2, bm5.f0.f22571s, f9Var2.z0(), false);
                    }
                    java.lang.String rj7 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var2, bm5.f0.f22570r, f9Var2.z0(), false);
                    if (f9Var2.z2()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VideoComponent", "video is clean!!!");
                        db5.e1.t(joVar.f198580d.g(), joVar.f198580d.g().getString(com.tencent.mm.R.string.k6n), joVar.f198580d.g().getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.ui.chatting.component.mo(joVar));
                        return;
                    }
                    if (com.tencent.mm.ui.chatting.component.z4.f(f9Var2, f17) && com.tencent.mm.ui.chatting.component.z4.f(f9Var2, rj7)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VideoComponent", "video is expired");
                        gm0.j1.e().j(new com.tencent.mm.ui.chatting.component.ko(joVar, h18.d(), 3));
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VideoComponent", "[ImageGalleryUI] enter");
                        android.content.Intent intent3 = new android.content.Intent(joVar.f198580d.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
                        intent3.putExtra("img_gallery_msg_id", f9Var2.getMsgId());
                        intent3.putExtra("img_gallery_msg_svr_id", f9Var2.I0());
                        intent3.putExtra("img_gallery_talker", f9Var2.Q0());
                        intent3.putExtra("img_gallery_chatroom_name", f9Var2.Q0());
                        intent3.putExtra("img_gallery_enter_video_opcode", t21.d3.d(f9Var2.getMsgId(), 1));
                        com.tencent.mm.ui.chatting.component.z4.a(joVar.f198580d, f9Var2, intent3);
                        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment3 = joVar.f198580d.f460717l;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent3);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(baseChattingUIFragment3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        baseChattingUIFragment3.startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(baseChattingUIFragment3, "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        joVar.f198580d.f460717l.overridePendingTransition(0, 0);
                        return;
                    }
                    if (((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).fj(vf0.j3.f436205g)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VideoComponent", "start forward video " + f9Var2.getMsgId() + " launch forward UIC ");
                        jd5.c cVar = new jd5.c();
                        long msgId = f9Var2.getMsgId();
                        int i27 = cVar.f43702d;
                        cVar.set(i27 + 0, java.lang.Long.valueOf(msgId));
                        cVar.set(i27 + 2, java.lang.Long.valueOf(f9Var2.I0()));
                        cVar.set(i27 + 3, java.lang.Integer.valueOf(f9Var2.getType()));
                        java.lang.String Q0 = f9Var2.Q0();
                        if (Q0 == null) {
                            Q0 = "";
                        }
                        cVar.set(i27 + 1, Q0);
                        cVar.q(h18.f415015m);
                        n13.r rVar = new n13.r();
                        rVar.f334117a = true;
                        rVar.f334120d.f334139a = 1;
                        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(joVar.f198580d.f460717l.getActivity(), cVar, rVar);
                        return;
                    }
                    if (!f9Var2.isVideo() && !f9Var2.Y2()) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUI.VideoComponent", "retranmist video unknow status.");
                        return;
                    }
                    android.content.Intent intent4 = new android.content.Intent(joVar.f198580d.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                    intent4.putExtra("Retr_length", h18.f415015m);
                    intent4.putExtra("Retr_File_Name", f9Var2.z0());
                    intent4.putExtra("Retr_video_isexport", h18.f415022t);
                    intent4.putExtra("Retr_Msg_Id", f9Var2.getMsgId());
                    intent4.putExtra("Retr_MsgTalker", f9Var2.Q0());
                    intent4.putExtra("Retr_From", "chattingui");
                    intent4.putExtra("scene_from", 17);
                    if (f9Var2.Y2()) {
                        intent4.putExtra("Retr_Msg_Type", 11);
                    } else {
                        intent4.putExtra("Retr_Msg_Type", 1);
                    }
                    com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment4 = joVar.f198580d.f460717l;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(intent4);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(baseChattingUIFragment4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    baseChattingUIFragment4.startActivity((android.content.Intent) arrayList4.get(0));
                    yj0.a.f(baseChattingUIFragment4, "com/tencent/mm/ui/chatting/component/VideoComponent", "longClickRetransmitVideo", "(Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            });
            if (c01.ia.M(f9Var)) {
                com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct spamMediaToEmojiOPStruct = new com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct();
                spamMediaToEmojiOPStruct.f60853d = f9Var.I0();
                spamMediaToEmojiOPStruct.f60854e = f9Var.getType();
                spamMediaToEmojiOPStruct.f60855f = c01.ia.l(f9Var);
                spamMediaToEmojiOPStruct.f60856g = 4L;
                spamMediaToEmojiOPStruct.k();
            }
            return false;
        }
        if (itemId != 130) {
            return false;
        }
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(this.f198580d.g(), f9Var.G, null)) {
            return true;
        }
        android.content.Intent intent2 = menuItem.getIntent();
        int[] iArr = new int[2];
        if (intent2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.VideoComponent", "[LONGCLICK_MENU_MUTE_PLAY] intent is null!");
            i18 = 0;
            i19 = 0;
        } else {
            int intExtra = intent2.getIntExtra("img_gallery_width", 0);
            int intExtra2 = intent2.getIntExtra("img_gallery_height", 0);
            iArr[0] = intent2.getIntExtra("img_gallery_left", 0);
            iArr[1] = intent2.getIntExtra("img_gallery_top", 0);
            i18 = intExtra;
            i19 = intExtra2;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VideoComponent", "[ImageGalleryUI] LONGCLICK_MENU_MUTE_PLAY");
        android.content.Intent intent3 = new android.content.Intent(this.f198580d.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
        intent3.putExtra("img_gallery_msg_id", f9Var.getMsgId());
        intent3.putExtra("img_gallery_msg_svr_id", f9Var.I0());
        intent3.putExtra("img_gallery_talker", f9Var.Q0());
        intent3.putExtra("img_gallery_chatroom_name", f9Var.Q0());
        intent3.putExtra("img_gallery_left", iArr[0]);
        intent3.putExtra("img_gallery_top", iArr[1]);
        intent3.putExtra("img_gallery_width", i18);
        intent3.putExtra("img_gallery_height", i19);
        intent3.putExtra("img_gallery_enter_video_opcode", t21.d3.d(f9Var.getMsgId(), 3));
        com.tencent.mm.ui.chatting.component.z4.a(this.f198580d, f9Var, intent3);
        com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment2 = this.f198580d.f460717l;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent3);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(baseChattingUIFragment2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/component/VideoComponent", "dealWithLongClick", "(Landroid/view/MenuItem;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        baseChattingUIFragment2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(baseChattingUIFragment2, "com/tencent/mm/ui/chatting/component/VideoComponent", "dealWithLongClick", "(Landroid/view/MenuItem;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        this.f198580d.f460717l.overridePendingTransition(0, 0);
        return true;
    }

    public final void o0(android.content.Intent intent, java.lang.String str) {
        t21.l0 l0Var = new t21.l0();
        l0Var.a(this.f198580d.g(), intent, str, !intent.getBooleanExtra("CropImage_Compress_Img", true) && t21.d3.s(), new com.tencent.mm.ui.chatting.component.po(this, str, intent != null ? intent.getStringExtra("MsgRevokeBatchId") : ""));
        yb5.d dVar = this.f198580d;
        dVar.W(dVar.g(), this.f198580d.s().getString(com.tencent.mm.R.string.f490573yv), this.f198580d.s().getString(com.tencent.mm.R.string.f490604zq), true, true, new com.tencent.mm.ui.chatting.component.qo(this, l0Var));
    }

    public void p0(android.content.Intent intent, java.lang.String str) {
        if (com.tencent.mm.network.y2.a(this.f198580d.g())) {
            o0(intent, str);
        } else {
            db5.e1.n(this.f198580d.g(), com.tencent.mm.R.string.k77, com.tencent.mm.R.string.f490573yv, new com.tencent.mm.ui.chatting.component.oo(this, intent, str), null);
        }
    }

    public final void q0(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VideoComponent", "sendVideoFromCustomRecord");
        if (intent == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.VideoComponent", "data == null");
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("VideoRecorder_ToUser");
        java.lang.String stringExtra2 = intent.getStringExtra("VideoRecorder_FileName");
        int intExtra = intent.getIntExtra("VideoRecorder_VideoLength", 0);
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.VideoComponent", "fileName " + stringExtra2 + " length " + intExtra + " user " + stringExtra);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra) || com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) || intExtra < 0) {
            return;
        }
        if (!stringExtra.equals("medianote") || (c01.z1.p() & 16384) != 0) {
            t21.d3.p(stringExtra2, null, intExtra, stringExtra, null, 0, "", 43, null, "", null, null, null, false, -1L, null, "");
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            t21.d3.M(stringExtra2);
            this.f198580d.L(true);
            return;
        }
        t21.v2 v2Var = new t21.v2();
        v2Var.f415000a = stringExtra2;
        v2Var.f415015m = intExtra;
        v2Var.f415019q = stringExtra;
        v2Var.f415021s = (java.lang.String) gm0.j1.u().c().l(2, "");
        v2Var.f415012j = com.tencent.mm.sdk.platformtools.t8.i1();
        v2Var.f415013k = com.tencent.mm.sdk.platformtools.t8.i1();
        v2Var.f415007e = intExtra;
        v2Var.f415006d = intExtra;
        int t17 = t21.w2.t(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(null, bm5.f0.f22571s, stringExtra2, false));
        if (t17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoLogic", "get Video size failed :" + stringExtra2);
            return;
        }
        v2Var.f415008f = t17;
        java.lang.String tj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).tj(null, stringExtra2, false);
        int t18 = t21.w2.t(tj6);
        if (t18 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoLogic", "get Thumb size failed :" + tj6 + " size:" + t18);
            return;
        }
        v2Var.f415010h = t18;
        v2Var.f415011i = 199;
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.u1(v2Var.h());
        f9Var.setType(43);
        f9Var.j1(1);
        if (!((vf0.c) ((c35.m) i95.n0.c(c35.m.class))).hj()) {
            f9Var.i1(stringExtra2);
        }
        f9Var.r1(2);
        f9Var.e1(c01.w9.o(v2Var.h()));
        v2Var.f415016n = c01.w9.x(f9Var);
        v2Var.n(f9Var.Q0());
        t21.o2.Ui().x(v2Var, true);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VideoComponent", "[onChattingResume]");
        sb5.z zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class);
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().b(((com.tencent.mm.ui.chatting.adapter.k) zVar).N1, android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.VideoComponent", "[onChattingPause]");
        sb5.z zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class);
        ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
        t21.o2.Ui().A(((com.tencent.mm.ui.chatting.adapter.k) zVar).N1);
    }
}
