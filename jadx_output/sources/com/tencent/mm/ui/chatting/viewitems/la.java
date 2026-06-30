package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class la extends com.tencent.mm.ui.chatting.viewitems.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f204408s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.v_);
        com.tencent.mm.ui.chatting.viewitems.ka kaVar = new com.tencent.mm.ui.chatting.viewitems.ka();
        kaVar.a(xgVar, true);
        xgVar.setTag(kaVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, final yb5.d dVar, rd5.d dVar2) {
        java.lang.String str;
        com.tencent.mm.pluginsdk.model.app.d D0;
        final com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        java.lang.String j17 = f9Var.j();
        final java.lang.String str2 = null;
        ot0.q v17 = j17 != null ? ot0.q.v(j17) : null;
        int itemId = menuItem.getItemId();
        if (itemId != 111) {
            if (itemId != 131) {
                return false;
            }
            com.tencent.mm.ui.chatting.viewitems.ra.a(dVar, menuItem, f9Var);
            return false;
        }
        if (v17 != null && (str = v17.f348694p) != null && str.length() > 0 && (D0 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p)) != null) {
            str2 = D0.field_fileFullPath;
        }
        if (f9Var.z2() || com.tencent.mm.ui.chatting.component.z4.f(f9Var, str2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgFromImg", "img is expired or clean!!!");
            db5.e1.t(dVar.g(), dVar.g().getString(com.tencent.mm.R.string.g0_), dVar.g().getString(com.tencent.mm.R.string.f490573yv), new com.tencent.mm.ui.chatting.viewitems.na(this));
            return false;
        }
        new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.ui.chatting.viewitems.oa(this, f9Var));
        com.tencent.mm.ui.chatting.manager.t.a(f9Var, dVar.g(), new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.viewitems.la$$a
            @Override // java.lang.Runnable
            public final void run() {
                yb5.d dVar3 = yb5.d.this;
                android.content.Intent intent = new android.content.Intent(dVar3.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
                intent.putExtra("Retr_File_Name", str2);
                boolean D = dVar3.D();
                com.tencent.mm.storage.f9 f9Var2 = f9Var;
                intent.putExtra("Retr_Msg_content", c01.w9.l(D, f9Var2.j(), f9Var2.A0()));
                intent.putExtra("Retr_Msg_Type", 16);
                intent.putExtra("Retr_Msg_Id", f9Var2.getMsgId());
                intent.putExtra("Retr_MsgTalker", f9Var2.Q0());
                intent.putExtra("scene_from", 17);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(dVar3, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Ljava/lang/String;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                dVar3.a0((android.content.Intent) arrayList.get(0));
                yj0.a.f(dVar3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "lambda$onContextItemSelected$0", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Ljava/lang/String;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        });
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (view != null && f9Var != null) {
            int d17 = ((com.tencent.mm.ui.chatting.viewitems.er) view.getTag()).d();
            com.tencent.mm.pluginsdk.model.app.k0.r(c01.w9.l(this.f204408s.D(), f9Var.j(), f9Var.A0()));
            ot0.q v17 = ot0.q.v(c01.w9.l(this.f204408s.D(), f9Var.j(), f9Var.A0()));
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str = v17.f348646d;
            ((kt.c) i0Var).getClass();
            if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(com.tencent.mm.pluginsdk.model.app.w.j(str, false, false)) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 111, 0, this.f204408s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
            j45.l.g("favorite");
            g4Var.c(d17, 116, 0, this.f204408s.s().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
            if (f9Var.P0() != 5) {
                android.view.MenuItem c17 = g4Var.c(d17, 131, 0, view.getContext().getString(com.tencent.mm.R.string.b2d), com.tencent.mm.R.raw.icons_filled_pencil);
                int[] iArr = new int[2];
                int width = view.getWidth();
                int height = view.getHeight();
                view.getLocationInWindow(iArr);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("img_gallery_width", width).putExtra("img_gallery_height", height).putExtra("img_gallery_left", iArr[0]).putExtra("img_gallery_top", iArr[1]);
                ((db5.h4) c17).B = intent;
            }
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent exDeviceHaveBindNetworkDeviceEvent = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent();
            long msgId = f9Var.getMsgId();
            am.b6 b6Var = exDeviceHaveBindNetworkDeviceEvent.f54141g;
            b6Var.f6219a = msgId;
            b6Var.f6220b = f9Var.Q0();
            exDeviceHaveBindNetworkDeviceEvent.e();
            if (exDeviceHaveBindNetworkDeviceEvent.f54142h.f6336a) {
                g4Var.c(d17, 129, 0, view.getContext().getString(com.tencent.mm.R.string.b3x), com.tencent.mm.R.raw.icons_filled_open);
            }
            if (c01.ia.A(f9Var)) {
                g4Var.clear();
            }
            if (!this.f204408s.F()) {
                g4Var.c(d17, 100, 0, this.f204408s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        int i17;
        int i18;
        int i19;
        int i27;
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        java.lang.String l17 = c01.w9.l(dVar.D(), f9Var.j(), f9Var.A0());
        ot0.q v17 = l17 != null ? ot0.q.v(l17) : null;
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgFromImg", "content is null");
            return true;
        }
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationInWindow(iArr);
            int width = view.getWidth();
            i17 = view.getHeight();
            i18 = width;
        } else {
            i17 = 0;
            i18 = 0;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f348646d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
        if (h17 == null || !h17.k()) {
            i19 = i17;
            i27 = i18;
        } else {
            i19 = i17;
            i27 = i18;
            com.tencent.mm.ui.chatting.w5.e(dVar, v17, com.tencent.mm.ui.chatting.viewitems.a0.t(dVar, f9Var), h17, f9Var.I0(), dVar.x());
        }
        java.lang.String str2 = v17.f348694p;
        if (str2 == null || str2.length() <= 0) {
            java.lang.String str3 = v17.f348674k;
            if (str3 != null && str3.length() > 0) {
                java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(v17.f348674k, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
                android.content.pm.PackageInfo j17 = com.tencent.mm.ui.chatting.w5.j(dVar.g(), v17.f348646d);
                com.tencent.mm.ui.chatting.w5.n(dVar, wi6, wi6, j17 == null ? null : j17.versionName, j17 == null ? 0 : j17.versionCode, v17.f348646d, false, f9Var.getMsgId(), f9Var.I0(), f9Var, v17, A(dVar, f9Var));
            }
        } else {
            com.tencent.mm.pluginsdk.model.app.d D0 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p);
            if (D0 != null && D0.t0()) {
                java.lang.String str4 = D0.field_fileFullPath;
                if (!com.tencent.mm.vfs.w6.j(str4)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgFromImg", "Img not exist, bigImgPath: %s, msgId: %d, msgSvrId: %d", str4, java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()));
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClassName(dVar.g(), "com.tencent.mm.ui.chatting.ResourcesExceedUI");
                    intent.putExtra("clean_view_type", 1);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    dVar.a0((android.content.Intent) arrayList.get(0));
                    yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    return true;
                }
                if (str4 != null && !str4.equals("") && com.tencent.mm.vfs.w6.j(str4)) {
                    long msgId = f9Var.getMsgId();
                    long I0 = f9Var.I0();
                    java.lang.String Q0 = f9Var.Q0();
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgFromImg", "[ImageGalleryUI] enter");
                    android.content.Intent intent2 = new android.content.Intent(this.f204408s.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
                    intent2.putExtra("img_gallery_msg_id", msgId);
                    intent2.putExtra("img_gallery_talker", Q0);
                    intent2.putExtra("img_gallery_left", iArr[0]);
                    intent2.putExtra("img_gallery_top", iArr[1]);
                    intent2.putExtra("img_gallery_width", i27);
                    intent2.putExtra("img_gallery_height", i19);
                    java.lang.String x17 = this.f204408s.x();
                    java.lang.String A = A(this.f204408s, f9Var);
                    android.os.Bundle bundle = new android.os.Bundle();
                    if (this.f204408s.D()) {
                        bundle.putInt("stat_scene", 2);
                    } else {
                        bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
                    }
                    bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(I0));
                    bundle.putString("stat_chat_talker_username", x17);
                    bundle.putString("stat_send_msg_user", A);
                    intent2.putExtra("_stat_obj", bundle);
                    com.tencent.mm.ui.chatting.viewitems.bm.a(intent2, this.f204408s.g());
                    yb5.d dVar2 = this.f204408s;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(dVar2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "showImg", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    dVar2.a0((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "showImg", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else if (f9Var.A0() == 0) {
                long msgId2 = f9Var.getMsgId();
                java.lang.String Q02 = f9Var.Q0();
                android.content.Intent intent3 = new android.content.Intent();
                intent3.setClassName(this.f204408s.g(), "com.tencent.mm.ui.chatting.AppAttachNewDownloadUI");
                intent3.putExtra("app_msg_id", msgId2);
                intent3.putExtra("msg_talker", Q02);
                yb5.d dVar3 = this.f204408s;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(intent3);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(dVar3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "doGetMsgImg", "(JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                dVar3.a0((android.content.Intent) arrayList3.get(0));
                yj0.a.f(dVar3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgFromImg", "doGetMsgImg", "(JLjava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        yb5.d dVar3;
        rd5.d dVar4;
        com.tencent.mm.ui.chatting.viewitems.ka kaVar;
        java.lang.String str2;
        int i17;
        int i18;
        com.tencent.mm.pluginsdk.model.app.m mVar;
        ot0.q qVar;
        java.lang.String str3;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.ka kaVar2 = (com.tencent.mm.ui.chatting.viewitems.ka) g0Var;
        this.f204408s = dVar;
        ((com.tencent.mm.ui.chatting.component.f7) ((sb5.e0) dVar.f460708c.a(sb5.e0.class))).n0(f9Var);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str4 = v17.f348646d;
            int i19 = v17.G;
            ((kt.c) i0Var).getClass();
            com.tencent.mm.pluginsdk.model.app.m i27 = com.tencent.mm.pluginsdk.model.app.w.i(str4, i19);
            if (i27 != null) {
                q(dVar, v17, f9Var);
            }
            java.lang.String str5 = (i27 == null || (str3 = i27.field_appName) == null || str3.trim().length() <= 0) ? v17.H : i27.field_appName;
            java.lang.String str6 = v17.f348646d;
            if (str6 == null || str6.length() <= 0 || !com.tencent.mm.ui.chatting.w5.y(str5)) {
                kaVar2.f204316c.setVisibility(8);
            } else {
                kaVar2.f204316c.setText(((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(dVar.g(), i27, str5));
                kaVar2.f204316c.setVisibility(0);
                if (i27 == null || !i27.k()) {
                    com.tencent.mm.ui.chatting.w5.r(dVar, kaVar2.f204316c, v17.f348646d);
                } else {
                    com.tencent.mm.ui.chatting.w5.p(dVar, kaVar2.f204316c, f9Var, v17, i27.field_packageName, f9Var.I0());
                }
                com.tencent.mm.ui.chatting.w5.w(dVar, kaVar2.f204316c, v17.f348646d);
            }
            java.lang.String str7 = v17.f348730y;
            if (str7 == null || str7.length() == 0) {
                kaVar2.f204319f.setVisibility(8);
            } else {
                kaVar2.f204319f.setVisibility(0);
                G(dVar, kaVar2.f204319f, com.tencent.mm.ui.chatting.viewitems.er.a(v17.f348730y));
            }
            if (v17.f348666i != 2) {
                i17 = 8;
                i18 = 0;
                mVar = i27;
                qVar = v17;
                kaVar = kaVar2;
            } else {
                kaVar2.f204315b.setVisibility(0);
                com.tencent.mm.pluginsdk.model.app.d D0 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p);
                java.lang.String z07 = f9Var.z0();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (D0 != null) {
                    str2 = D0.field_fileFullPath;
                    bool = java.lang.Boolean.TRUE;
                } else {
                    str2 = z07;
                }
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                i17 = 8;
                i18 = 0;
                mVar = i27;
                java.lang.String str8 = str2;
                qVar = v17;
                kaVar = kaVar2;
                if (!m11.b1.Di().A4(f9Var, kaVar2.f204315b, str8, bool.booleanValue(), i65.a.g(dVar.g()), v17.Q, v17.P, true, com.tencent.mm.R.drawable.bzt, kaVar2.f204321h, com.tencent.mm.R.drawable.f481147lw, 1, true, null)) {
                    kaVar.f204315b.setImageResource(com.tencent.mm.R.raw.chatfrom_bg_pic);
                    kaVar.f204315b.post(new com.tencent.mm.ui.chatting.viewitems.ma(this, kaVar));
                }
            }
            if (dVar.D()) {
                dVar3 = dVar;
                dVar4 = dVar2;
                kaVar.f204320g.setVisibility(i17);
            } else if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).mj(mVar)) {
                kaVar.f204320g.setVisibility(i18);
                kaVar.f204319f.setVisibility(i17);
                android.widget.ImageView imageView = kaVar.f204320g;
                com.tencent.mm.ui.chatting.viewitems.er erVar = new com.tencent.mm.ui.chatting.viewitems.er();
                erVar.f203927w = qVar;
                dVar4 = dVar2;
                erVar.f203905a = dVar4;
                dVar3 = dVar;
                com.tencent.mm.ui.chatting.w5.o(dVar3, imageView, erVar);
            } else {
                dVar3 = dVar;
                dVar4 = dVar2;
                kaVar.f204320g.setVisibility(i17);
            }
        } else {
            dVar3 = dVar;
            dVar4 = dVar2;
            kaVar = kaVar2;
        }
        kaVar.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar4, dVar.D(), kaVar, null));
        kaVar.clickArea.setOnClickListener(w(dVar3));
        kaVar.clickArea.setOnLongClickListener(u(dVar3));
        kaVar.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar3.f460708c.a(sb5.z.class))).B1);
    }
}
