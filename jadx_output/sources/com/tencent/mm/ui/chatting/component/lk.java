package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.w1.class)
/* loaded from: classes12.dex */
public class lk extends com.tencent.mm.ui.chatting.component.a implements sb5.w1, r70.b, o23.a {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.z2 f199438e;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).Zi(this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).mj(this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).mj(this);
    }

    @Override // r70.b
    public void K3(r70.c cVar) {
        android.view.View view;
        r70.d dVar = cVar.f393075b;
        if (dVar == r70.d.f393085f) {
            dw3.c0 c0Var = dw3.c0.f244182a;
            java.lang.String str = cVar.f393074a.f393104f;
            if (str != null) {
                c0Var.j(dw3.c0.f244186e.u(str, ""));
            }
            sb5.z zVar = (sb5.z) this.f198580d.f460708c.a(sb5.z.class);
            long j17 = cVar.f393076c;
            boolean z17 = cVar.f393079f;
            com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar;
            java.util.HashMap hashMap = (java.util.HashMap) kVar.Q;
            if (hashMap.containsKey(java.lang.Long.valueOf(j17))) {
                if (((java.util.HashMap) kVar.R).containsKey(java.lang.Long.valueOf(j17))) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) hashMap.get(java.lang.Long.valueOf(j17));
                    view = weakReference != null ? (android.view.View) weakReference.get() : null;
                    if (view != null) {
                        java.lang.Object tag = view.getTag();
                        if (tag instanceof ze5.w6) {
                            com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingImgMvvmView chattingImgMvvmView = ((ze5.w6) tag).f472284c;
                            chattingImgMvvmView.getClass();
                            if (z17) {
                                if (pd5.l.f353580b.a(com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_ImgArcProgress.class, false)) {
                                    chattingImgMvvmView.getHolder().e().setVisibility(8);
                                    return;
                                }
                                com.tencent.mm.ui.chatting.w5.A(chattingImgMvvmView.getHolder().d(), false, false);
                                chattingImgMvvmView.getHolder().f().setVisibility(4);
                                chattingImgMvvmView.getHolder().g().setVisibility(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (dVar == r70.d.f393084e) {
            int round = java.lang.Math.round(cVar.f393078e * 100.0f);
            sb5.z zVar2 = (sb5.z) this.f198580d.f460708c.a(sb5.z.class);
            long j18 = cVar.f393076c;
            com.tencent.mm.ui.chatting.adapter.k kVar2 = (com.tencent.mm.ui.chatting.adapter.k) zVar2;
            java.util.HashMap hashMap2 = (java.util.HashMap) kVar2.Q;
            if (hashMap2.containsKey(java.lang.Long.valueOf(j18))) {
                if (((java.util.HashMap) kVar2.R).containsKey(java.lang.Long.valueOf(j18))) {
                    java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) hashMap2.get(java.lang.Long.valueOf(j18));
                    view = weakReference2 != null ? (android.view.View) weakReference2.get() : null;
                    if (view != null) {
                        java.lang.Object tag2 = view.getTag();
                        if (tag2 instanceof ze5.w6) {
                            com.tencent.mm.ui.chatting.viewitems.mvvmview.ChattingImgMvvmView chattingImgMvvmView2 = ((ze5.w6) tag2).f472284c;
                            chattingImgMvvmView2.getClass();
                            int i17 = round >= 100 ? 100 : (int) ((round * 100) / 100);
                            if (pd5.l.f353580b.a(com.tencent.mm.repairer.config.chatting.mvvmitem.RepairerConfigMvvmItem_ImgArcProgress.class, false)) {
                                if (i17 < 100 || chattingImgMvvmView2.getHolder().e().getVisibility() == 0) {
                                    em.o holder = chattingImgMvvmView2.getHolder();
                                    if (holder.f254649d == null) {
                                        holder.f254649d = (com.tencent.mm.ui.widget.progress.RoundProgressBtn) holder.f254646a.findViewById(com.tencent.mm.R.id.f487507lg);
                                    }
                                    holder.f254649d.setProgress(i17);
                                    chattingImgMvvmView2.getHolder().e().setVisibility(0);
                                    return;
                                }
                                return;
                            }
                            if (i17 < 100 || chattingImgMvvmView2.getHolder().f().getVisibility() == 0) {
                                android.widget.TextView f17 = chattingImgMvvmView2.getHolder().f();
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                sb6.append(i17);
                                sb6.append('%');
                                f17.setText(sb6.toString());
                                com.tencent.mm.ui.chatting.w5.A(chattingImgMvvmView2.getHolder().d(), true, false);
                                chattingImgMvvmView2.getHolder().f().setVisibility(0);
                                chattingImgMvvmView2.getHolder().g().setVisibility(0);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // yn.d
    public void N(int i17, int i18, android.content.Intent intent) {
        n0(i17, i18, intent);
    }

    public boolean m0(android.view.MenuItem menuItem, final com.tencent.mm.storage.f9 f9Var) {
        if (menuItem.getItemId() != 110) {
            return false;
        }
        com.tencent.mm.ui.chatting.manager.t.a(f9Var, this.f198580d.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.lk$$a
            @Override // java.lang.Runnable
            public final void run() {
                m11.b0 b0Var;
                com.tencent.mm.ui.chatting.component.lk lkVar = com.tencent.mm.ui.chatting.component.lk.this;
                android.app.Activity g17 = lkVar.f198580d.g();
                yb5.d dVar = lkVar.f198580d;
                java.util.Map map = com.tencent.mm.ui.chatting.w5.f206212a;
                if (!c01.d9.b().E()) {
                    db5.t7.k(g17, dVar.f460717l.getContentView());
                    return;
                }
                com.tencent.mm.storage.f9 f9Var2 = f9Var;
                if (f9Var2.getMsgId() > 0) {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    b0Var = m11.b1.Di().T1(f9Var2.Q0(), f9Var2.getMsgId());
                } else {
                    b0Var = null;
                }
                if ((b0Var == null || b0Var.f322633a <= 0) && f9Var2.I0() > 0) {
                    ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                    b0Var = m11.b1.Di().b2(f9Var2.Q0(), f9Var2.I0());
                }
                if (b0Var == null) {
                    return;
                }
                java.lang.String c17 = m11.c0.c(f9Var2, b0Var);
                if (f9Var2.z2()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHelper", "image is clean!!!");
                    db5.e1.t(g17, g17.getString(com.tencent.mm.R.string.g07), g17.getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.ui.chatting.t5());
                    return;
                }
                if (com.tencent.mm.ui.chatting.component.z4.f(f9Var2, c17)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHelper", "img is expired or clean!!!");
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHelper", "[ImageGalleryUI] enter");
                    android.content.Intent intent = new android.content.Intent(g17, (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
                    intent.putExtra("img_gallery_msg_id", f9Var2.getMsgId());
                    intent.putExtra("img_gallery_msg_svr_id", f9Var2.I0());
                    intent.putExtra("img_gallery_talker", f9Var2.Q0());
                    intent.putExtra("img_gallery_chatroom_name", f9Var2.Q0());
                    intent.putExtra("img_gallery_is_restransmit_after_download", true);
                    intent.putExtra("Retr_show_success_tips", true);
                    if (dVar != null) {
                        com.tencent.mm.ui.chatting.component.z4.a(dVar, f9Var2, intent);
                    } else {
                        com.tencent.mm.ui.chatting.w5.a(f9Var2, intent);
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "retransmitImg", "(Lcom/tencent/mm/storage/MsgInfo;Landroid/content/Context;Lcom/tencent/mm/ui/chatting/context/ChattingContext;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    g17.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(g17, "com/tencent/mm/ui/chatting/ChattingItemHelper", "retransmitImg", "(Lcom/tencent/mm/storage/MsgInfo;Landroid/content/Context;Lcom/tencent/mm/ui/chatting/context/ChattingContext;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return;
                }
                java.lang.String c18 = m11.p0.c(f9Var2);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(c18)) {
                    yd5.f.m0(6, dVar.C(), c18);
                }
                com.tencent.mm.modelmulti.BizScreenshotMsgInfo b17 = com.tencent.mm.modelmulti.BizScreenshotMsgInfo.f71250m.b(f9Var2);
                if (b17 != null && b17.a()) {
                    ((qv.s) ((qk.r6) i95.n0.c(qk.r6.class))).Di(b17, dVar.D() ? 2 : 1, 6);
                }
                jd5.a aVar = new jd5.a();
                long msgId = f9Var2.getMsgId();
                int i17 = aVar.f43702d;
                aVar.set(i17 + 0, java.lang.Long.valueOf(msgId));
                aVar.set(i17 + 2, java.lang.Long.valueOf(f9Var2.I0()));
                aVar.set(i17 + 3, java.lang.Integer.valueOf(f9Var2.getType()));
                java.lang.String Q0 = f9Var2.Q0();
                if (Q0 == null) {
                    Q0 = "";
                }
                aVar.set(i17 + 1, Q0);
                n13.r rVar = new n13.r();
                rVar.f334117a = true;
                rVar.f334120d.f334139a = com.tencent.mm.ui.mvvm.uic.conversation.recent.e.b(f9Var2.Q0());
                rVar.f334118b = 231;
                ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(g17, aVar, rVar);
            }
        });
        if (!c01.ia.M(f9Var)) {
            return true;
        }
        com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct spamMediaToEmojiOPStruct = new com.tencent.mm.autogen.mmdata.rpt.SpamMediaToEmojiOPStruct();
        spamMediaToEmojiOPStruct.f60853d = f9Var.I0();
        spamMediaToEmojiOPStruct.f60854e = f9Var.getType();
        spamMediaToEmojiOPStruct.f60855f = c01.ia.l(f9Var);
        spamMediaToEmojiOPStruct.f60856g = 4L;
        spamMediaToEmojiOPStruct.k();
        return true;
    }

    public boolean n0(final int i17, int i18, final android.content.Intent intent) {
        this.f198580d.b();
        boolean z17 = false;
        if (i18 != -1) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.SendImgComponent", "[dealWithRequestCode] resultCode:%d", java.lang.Integer.valueOf(i18));
            return false;
        }
        if (i17 != 200) {
            if (i17 == 201) {
                vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
                android.content.Context applicationContext = this.f198580d.g().getApplicationContext();
                java.lang.String a17 = g83.a.a();
                ((ub0.r) oVar).getClass();
                java.lang.String b17 = com.tencent.mm.pluginsdk.ui.tools.l7.b(applicationContext, intent, a17);
                if (b17 != null) {
                    if (com.tencent.mm.vfs.w6.j(b17)) {
                        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
                        android.app.Activity g17 = this.f198580d.g();
                        ((yb0.g) b0Var).getClass();
                        com.tencent.mm.platformtools.ExportFileUtil.b(g17, b17, null);
                    }
                    android.content.Intent intent2 = new android.content.Intent();
                    java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>(1);
                    arrayList.add(b17);
                    intent2.putExtra("query_source_type", 3);
                    intent2.putExtra("preview_image", true);
                    intent2.putExtra("isTakePhoto", true);
                    intent2.putExtra("GalleryUI_FromUser", this.f198580d.t());
                    intent2.putExtra("GalleryUI_ToUser", this.f198580d.x());
                    intent2.putExtra("is_long_click", true);
                    intent2.putStringArrayListExtra("preview_image_list", arrayList);
                    intent2.addFlags(67108864);
                    if (this.f198580d.f460708c.a(sb5.s0.class) == null || ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e == null) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.SendImgComponent", "onResult, footer is null");
                    } else {
                        r15.b quoteSendExtCommonInfo = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e.getQuoteSendExtCommonInfo();
                        if (quoteSendExtCommonInfo != null) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SendImgComponent", "quoteExtCommonInfo is not null");
                            ok5.d.b(intent2, "key_quote_extcommon", quoteSendExtCommonInfo, new ok5.h());
                            z17 = true;
                        } else {
                            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.SendImgComponent", "quoteExtCommonInfo is null");
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SendImgComponent", "appendQuoteInfoToIntent:%b", java.lang.Boolean.valueOf(z17));
                    j45.l.p(this.f198580d.f460717l, "gallery", ".ui.GalleryEntryUI", intent2, 217);
                }
            } else if (i17 == 203) {
                sb5.s0 s0Var = (sb5.s0) this.f198580d.f460708c.a(sb5.s0.class);
                java.lang.String stringExtra = intent.getStringExtra("CropImage_OutputPath");
                if (stringExtra != null) {
                    boolean a18 = c01.z1.a(stringExtra, this.f198580d.x(), intent.getBooleanExtra("CropImage_Compress_Img", true));
                    int intExtra = intent.getIntExtra("from_source", 0);
                    int intExtra2 = intent.getIntExtra("CropImage_rotateCount", 0);
                    intent.getIntExtra("from_source", 0);
                    o0(a18 ? 1 : 0, intExtra, intExtra2, stringExtra, "");
                    ((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e.clearFocus();
                    return false;
                }
                ((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e.clearFocus();
            } else {
                if (i17 != 217) {
                    if (i17 != 231) {
                        return false;
                    }
                    java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : new java.util.ArrayList<>();
                    if (stringArrayListExtra == null) {
                        return false;
                    }
                    java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
                    while (it.hasNext()) {
                        com.tencent.mm.storage.z3.R4(it.next());
                    }
                    return false;
                }
                if (intent != null) {
                    java.lang.String stringExtra2 = intent.getStringExtra("GalleryUI_ToUser");
                    final java.lang.String x17 = com.tencent.mm.sdk.platformtools.t8.K0(stringExtra2) ? this.f198580d.x() : stringExtra2;
                    final yb5.q v17 = this.f198580d.v();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SendImgComponent", "CONTEXT_MENU_WECHAT_GALLERY_IMAGE userFromIntent:%s rawUsername:%s", stringExtra2, this.f198580d.x());
                    final sb5.s0 s0Var2 = (sb5.s0) this.f198580d.f460708c.a(sb5.s0.class);
                    com.tencent.mm.ui.chatting.component.jb jbVar = (com.tencent.mm.ui.chatting.component.jb) s0Var2;
                    jbVar.f199263e.clearFocus();
                    jbVar.f199263e.setBottomPanelVisibility(8);
                    ((ku5.t0) ku5.t0.f312615d).l(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.component.lk$$b
                        /* JADX WARN: Removed duplicated region for block: B:124:0x03b9  */
                        /* JADX WARN: Removed duplicated region for block: B:126:0x03bb  */
                        /* JADX WARN: Removed duplicated region for block: B:129:0x03cc  */
                        /* JADX WARN: Removed duplicated region for block: B:131:0x03df  */
                        /* JADX WARN: Removed duplicated region for block: B:133:0x03e7  */
                        /* JADX WARN: Removed duplicated region for block: B:136:0x03f5  */
                        /* JADX WARN: Removed duplicated region for block: B:138:0x03fb  */
                        /* JADX WARN: Removed duplicated region for block: B:141:0x03fe  */
                        /* JADX WARN: Removed duplicated region for block: B:143:0x03f8  */
                        /* JADX WARN: Removed duplicated region for block: B:155:0x0459  */
                        /* JADX WARN: Removed duplicated region for block: B:162:0x07b3  */
                        /* JADX WARN: Removed duplicated region for block: B:211:0x088c  */
                        /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
                        /* JADX WARN: Removed duplicated region for block: B:227:0x065e  */
                        /* JADX WARN: Removed duplicated region for block: B:252:0x04e3  */
                        /* JADX WARN: Removed duplicated region for block: B:259:0x0529  */
                        /* JADX WARN: Removed duplicated region for block: B:266:0x054f  */
                        /* JADX WARN: Removed duplicated region for block: B:275:0x05a5  */
                        /* JADX WARN: Removed duplicated region for block: B:291:0x059c  */
                        /* JADX WARN: Removed duplicated region for block: B:294:0x04e8  */
                        /* JADX WARN: Removed duplicated region for block: B:299:0x06aa  */
                        /* JADX WARN: Removed duplicated region for block: B:52:0x0260  */
                        /* JADX WARN: Removed duplicated region for block: B:55:0x026e A[SYNTHETIC] */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void run() {
                            /*
                                Method dump skipped, instructions count: 2194
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.lk$$b.run():void");
                        }
                    }, 100L, "SendImgComponent");
                    return false;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.SendImgComponent", "CONTEXT_MENU_WECHAT_GALLERY_IMAGE intent == null");
            }
        } else if (intent != null) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.setClassName(this.f198580d.g(), "com.tencent.mm.ui.tools.CropImageNewUI");
            intent3.putExtra("CropImageMode", 4);
            intent3.putExtra("CropImage_Filter", true);
            java.lang.String x18 = this.f198580d.x();
            intent3.putExtra("CropImage_Has_Raw_Img_Btn", (com.tencent.mm.storage.z3.G4(x18) || com.tencent.mm.storage.z3.s4(x18)) ? false : true);
            intent3.putExtra("from_source", 3);
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f198580d.f460717l;
            java.lang.String a19 = g83.a.a();
            if (intent.getData().toString().startsWith("content://com.google.android.gallery3d")) {
                new com.tencent.mm.ui.tools.d1(intent, baseChattingUIFragment, a19, null, intent3, 203).execute(0);
            } else {
                java.lang.String b18 = com.tencent.mm.ui.tools.i1.b(baseChattingUIFragment.getContext(), intent, a19);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(b18)) {
                    intent3.putExtra("CropImage_ImgPath", b18);
                    baseChattingUIFragment.startActivityForResult(intent3, 203);
                }
            }
        }
        return true;
    }

    public void o0(int i17, int i18, int i19, java.lang.String str, java.lang.String str2) {
        if (str == null || str.equals("") || !com.tencent.mm.vfs.w6.j(str)) {
            return;
        }
        com.tencent.mm.storage.z3 u17 = this.f198580d.u();
        java.util.Map map = com.tencent.mm.ui.chatting.component.z4.f200360a;
        if (u17.d1().equals("medianote") && (c01.z1.p() & 16384) == 0) {
            return;
        }
        k70.i0 i0Var = new k70.i0();
        i0Var.f304642a = 4;
        i0Var.f304664w = str2;
        java.lang.String t17 = this.f198580d.t();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        r70.g gVar = new r70.g(str, i17, t17 == null ? "" : t17, this.f198580d.x(), i0Var);
        gVar.f393106h = i19;
        gVar.f393108j = "component_send_img";
        ((v70.w) ((xs.d1) i95.n0.c(xs.d1.class))).nj(gVar);
        this.f198580d.L(true);
    }

    public final com.tencent.mm.ui.chatting.component.rk p0(java.lang.String str) {
        com.tencent.mm.ui.chatting.component.rk rkVar = new com.tencent.mm.ui.chatting.component.rk(null);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = this.f199438e;
        if ((z2Var == null || !z2Var.h()) && !com.tencent.mm.sdk.platformtools.t8.K0(str) && com.tencent.mm.sdk.platformtools.y1.f(str)) {
            android.graphics.Bitmap T = com.tencent.mm.sdk.platformtools.x.T(str, 300, 300, false);
            if (T == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ChattingUI.SendImgComponent", "showAlert fail, bmp is null");
                return rkVar;
            }
            sb5.s0 s0Var = (sb5.s0) this.f198580d.f460708c.a(sb5.s0.class);
            android.widget.ImageView imageView = new android.widget.ImageView(this.f198580d.g());
            this.f198580d.s().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
            imageView.setImageBitmap(T);
            android.content.ContentResolver contentResolver = this.f198580d.f460717l.getContentResolver();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("default_input_method");
            arrayList.add(contentResolver);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            java.lang.String str2 = (java.lang.String) yj0.a.k(obj, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/SendImgComponent", "sendImgFromInput", "(Ljava/lang/String;)Lcom/tencent/mm/ui/chatting/component/SendImgComponent$IMESendImageResult;", "android/provider/Settings$Secure", "getString", "(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
            boolean z17 = com.tencent.mm.sdk.platformtools.y1.d(com.tencent.mm.vfs.w6.N(str, 0, -1)) && str2 != null && (str2.contains("com.sohu.inputmethod.sogou") || str2.contains("com.tencent.qqpinyin"));
            if (!z17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1062, 20);
            } else if (str2.contains("com.sohu.inputmethod.sogou")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1062, 1);
            } else if (str2.contains("com.tencent.qqpinyin")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1062, 2);
            }
            if (z17 && com.tencent.mm.storage.z3.K3(this.f198580d.x())) {
                rkVar.f199862b = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.SendImgComponent", "gamelife fobidden image: from the third playground");
                dp.a.makeText(this.f198580d.g(), this.f198580d.s().getString(com.tencent.mm.R.string.bxy), 0).show();
                return rkVar;
            }
            com.tencent.mm.ui.widget.dialog.z2 z2Var2 = new com.tencent.mm.ui.widget.dialog.z2(this.f198580d.g(), 1, 2);
            this.f199438e = z2Var2;
            z2Var2.q(this.f198580d.g().getResources().getString(com.tencent.mm.R.string.ogq));
            com.tencent.mm.ui.bk.r0(this.f199438e.C.getPaint(), 0.8f);
            this.f199438e.j(imageView);
            this.f199438e.m(this.f198580d.g().getResources().getString(com.tencent.mm.R.string.f490347sg), this.f198580d.g().getResources().getString(com.tencent.mm.R.string.f490551ya));
            com.tencent.mm.ui.widget.dialog.z2 z2Var3 = this.f199438e;
            com.tencent.mm.ui.chatting.component.ok okVar = new com.tencent.mm.ui.chatting.component.ok(this);
            com.tencent.mm.ui.chatting.component.pk pkVar = new com.tencent.mm.ui.chatting.component.pk(this, z17, s0Var, str2, str);
            z2Var3.D = okVar;
            z2Var3.E = pkVar;
            z2Var3.C();
            rkVar.f199861a = true;
            rkVar.f199862b = true;
        }
        return rkVar;
    }
}
