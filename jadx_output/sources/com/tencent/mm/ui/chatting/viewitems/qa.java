package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class qa extends com.tencent.mm.ui.chatting.viewitems.a0 implements com.tencent.mm.ui.chatting.l6 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f205340s;

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.tencent.mm.ui.chatting.viewitems.xg(layoutInflater, com.tencent.mm.R.layout.f488551wu);
        com.tencent.mm.ui.chatting.viewitems.ka kaVar = new com.tencent.mm.ui.chatting.viewitems.ka();
        kaVar.a(xgVar, false);
        xgVar.setTag(kaVar);
        return xgVar;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean M() {
        return true;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        java.lang.String str;
        com.tencent.mm.pluginsdk.model.app.d D0;
        com.tencent.mm.storage.f9 f9Var = dVar2.f394254d.f445300b;
        java.lang.String j17 = f9Var.j();
        java.lang.String str2 = null;
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
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.tencent.mm.ui.transmit.MsgRetransmitUI.class);
        intent.putExtra("Retr_Msg_content", f9Var.j());
        intent.putExtra("Retr_File_Name", str2);
        intent.putExtra("Retr_Msg_Type", 16);
        intent.putExtra("Retr_Msg_Id", f9Var.getMsgId());
        intent.putExtra("Retr_MsgTalker", f9Var.Q0());
        intent.putExtra("scene_from", 17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "onContextItemSelected", "(Landroid/view/MenuItem;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.tencent.mm.storage.f9 f9Var = dVar.f394254d.f445300b;
        if (view == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgToImg", "[onCreateContextMenu] v is null");
            return false;
        }
        com.tencent.mm.ui.chatting.viewitems.er erVar = (com.tencent.mm.ui.chatting.viewitems.er) view.getTag();
        if (erVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgToImg", "[onCreateContextMenu] tag is null");
            return false;
        }
        int d17 = erVar.d();
        f9Var.j();
        ot0.q v17 = ot0.q.v(c01.w9.l(this.f205340s.D(), f9Var.j(), f9Var.A0()));
        if (v17 != null) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str = v17.f348646d;
            ((kt.c) i0Var).getClass();
            if (((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).nj(com.tencent.mm.pluginsdk.model.app.w.j(str, false, false)) && !c01.ia.x(f9Var)) {
                g4Var.c(d17, 111, 0, this.f205340s.s().getString(com.tencent.mm.R.string.f492836i24), com.tencent.mm.R.raw.icons_filled_share);
            }
        }
        j45.l.g("favorite");
        g4Var.c(d17, 116, 0, this.f205340s.s().getString(com.tencent.mm.R.string.hjg), com.tencent.mm.R.raw.icons_filled_favorites);
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
        if (!f9Var.t2() && f9Var.o2() && ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.tencent.mm.ui.chatting.viewitems.a0.L(f9Var, this.f205340s) && com.tencent.mm.ui.chatting.viewitems.a0.J(f9Var.Q0()))) {
            g4Var.c(d17, 123, 0, view.getContext().getString(com.tencent.mm.R.string.f490869b40), com.tencent.mm.R.raw.icons_filled_previous);
        }
        if (!this.f205340s.F()) {
            g4Var.c(d17, 100, 0, this.f205340s.s().getString(com.tencent.mm.R.string.b3p), com.tencent.mm.R.raw.icons_filled_delete);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public boolean R(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        int i17;
        int i18;
        int i19;
        if (view == null) {
            return true;
        }
        java.lang.String j17 = f9Var.j();
        ot0.q v17 = j17 != null ? ot0.q.v(j17) : null;
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgToImg", "content is null");
            return true;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f348646d;
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m j18 = com.tencent.mm.pluginsdk.model.app.w.j(str, false, false);
        if (j18 != null) {
            i17 = height;
            i18 = 0;
            i19 = width;
            com.tencent.mm.ui.chatting.w5.e(dVar, v17, c01.z1.r(), j18, f9Var.I0(), dVar.x());
        } else {
            i17 = height;
            i18 = 0;
            i19 = width;
        }
        java.lang.String str2 = v17.f348694p;
        if (str2 == null || str2.length() <= 0) {
            java.lang.String str3 = v17.f348674k;
            if (str3 != null && str3.length() > 0) {
                java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(v17.f348674k, com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
                android.content.pm.PackageInfo j19 = com.tencent.mm.ui.chatting.w5.j(dVar.g(), v17.f348646d);
                boolean z17 = i18;
                com.tencent.mm.ui.chatting.w5.n(dVar, wi6, wi6, j19 == null ? null : j19.versionName, j19 == null ? i18 : j19.versionCode, v17.f348646d, false, f9Var.getMsgId(), f9Var.I0(), f9Var, v17, A(dVar, f9Var));
                return z17;
            }
        } else {
            com.tencent.mm.pluginsdk.model.app.d D0 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p);
            if (D0 != null) {
                if (f9Var.A0() == 1) {
                    java.lang.String str4 = D0.field_fileFullPath;
                    if (!com.tencent.mm.vfs.w6.j(str4)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgToImg", "onItemClick::bigImgPath: %s, msgId: %d, msgSvrId: %d", str4, java.lang.Long.valueOf(f9Var.getMsgId()), java.lang.Long.valueOf(f9Var.I0()));
                        android.content.Intent intent = new android.content.Intent();
                        intent.setClassName(dVar.g(), "com.tencent.mm.ui.chatting.ResourcesExceedUI");
                        intent.putExtra("clean_view_type", 1);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        dVar.a0((android.content.Intent) arrayList.get(i18));
                        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "onItemClick", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else if (str4 != null && !str4.equals("") && com.tencent.mm.vfs.w6.j(str4)) {
                        long msgId = f9Var.getMsgId();
                        long I0 = f9Var.I0();
                        java.lang.String Q0 = f9Var.Q0();
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgToImg", "[ImageGalleryUI] enter");
                        android.content.Intent intent2 = new android.content.Intent(this.f205340s.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
                        intent2.putExtra("img_gallery_msg_id", msgId);
                        intent2.putExtra("img_gallery_talker", Q0);
                        intent2.putExtra("img_gallery_left", iArr[i18]);
                        intent2.putExtra("img_gallery_top", iArr[1]);
                        intent2.putExtra("img_gallery_width", i19);
                        intent2.putExtra("img_gallery_height", i17);
                        java.lang.String x17 = this.f205340s.x();
                        java.lang.String A = A(this.f205340s, f9Var);
                        android.os.Bundle bundle = new android.os.Bundle();
                        if (this.f205340s.D()) {
                            bundle.putInt("stat_scene", 2);
                        } else {
                            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
                        }
                        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(I0));
                        bundle.putString("stat_chat_talker_username", x17);
                        bundle.putString("stat_send_msg_user", A);
                        intent2.putExtra("_stat_obj", bundle);
                        com.tencent.mm.ui.chatting.viewitems.bm.a(intent2, this.f205340s.g());
                        yb5.d dVar2 = this.f205340s;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(intent2);
                        java.util.Collections.reverse(arrayList2);
                        yj0.a.d(dVar2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "showImg", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        dVar2.a0((android.content.Intent) arrayList2.get(i18));
                        yj0.a.f(dVar2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "showImg", "(Lcom/tencent/mm/storage/MsgInfo;Ljava/lang/String;[III)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    }
                }
                return true;
            }
        }
        return i18;
    }

    @Override // com.tencent.mm.ui.chatting.l6
    public void d(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.k2()) {
            com.tencent.mm.pluginsdk.model.app.k0.z(f9Var);
            c01.w9.f(f9Var.getMsgId(), f9Var.Q0());
            dVar.L(true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.viewitems.a0
    public void l(com.tencent.mm.ui.chatting.viewitems.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        int i17;
        int i18;
        ot0.q qVar;
        com.tencent.mm.ui.chatting.viewitems.ka kaVar;
        com.tencent.mm.storage.f9 f9Var;
        int r17;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.storage.f9 f9Var2 = dVar2.f394254d.f445300b;
        com.tencent.mm.ui.chatting.viewitems.ka kaVar2 = (com.tencent.mm.ui.chatting.viewitems.ka) g0Var;
        this.f205340s = dVar;
        ((com.tencent.mm.ui.chatting.component.f7) ((sb5.e0) dVar.f460708c.a(sb5.e0.class))).n0(f9Var2);
        java.lang.String U1 = f9Var2.U1();
        ot0.q v17 = ot0.q.v(U1);
        if (v17 != null) {
            lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str4 = v17.f348646d;
            int i19 = v17.G;
            ((kt.c) i0Var).getClass();
            com.tencent.mm.pluginsdk.model.app.m i27 = com.tencent.mm.pluginsdk.model.app.w.i(str4, i19);
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
                    com.tencent.mm.ui.chatting.w5.p(dVar, kaVar2.f204316c, f9Var2, v17, i27.field_packageName, f9Var2.I0());
                }
                com.tencent.mm.ui.chatting.w5.w(dVar, kaVar2.f204316c, v17.f348646d);
            }
            if (v17.f348666i == 2) {
                kaVar2.f204315b.setVisibility(0);
                com.tencent.mm.pluginsdk.model.app.d D0 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p);
                java.lang.String z07 = f9Var2.z0();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                if (D0 != null) {
                    str2 = D0.field_fileFullPath;
                    bool = java.lang.Boolean.TRUE;
                } else {
                    str2 = z07;
                }
                ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                i17 = 0;
                i18 = 8;
                qVar = v17;
                java.lang.String str7 = str2;
                kaVar = kaVar2;
                f9Var = f9Var2;
                if (!m11.b1.Di().A4(f9Var2, kaVar2.f204315b, str7, bool.booleanValue(), i65.a.g(dVar.g()), v17.S, v17.R, true, com.tencent.mm.R.drawable.bzt, kaVar2.f204321h, com.tencent.mm.R.drawable.f481147lw, 0, true, null)) {
                    kaVar.f204315b.setImageResource(com.tencent.mm.R.raw.chatfrom_bg_pic);
                    kaVar.f204315b.post(new com.tencent.mm.ui.chatting.viewitems.pa(this, kaVar));
                }
                kaVar.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), kaVar, null));
                kaVar.clickArea.setOnClickListener(w(dVar));
                kaVar.clickArea.setOnLongClickListener(u(dVar));
                kaVar.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
                r17 = com.tencent.mm.pluginsdk.model.app.k0.r(U1);
                if (r17 != -1 || r17 >= 100 || qVar.f348682m <= 0 || f9Var.P0() == 5) {
                    android.view.View view = kaVar.f204318e;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(i17)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    kaVar.f204315b.setAlpha(255);
                    kaVar.f204315b.setBackgroundDrawable(null);
                } else {
                    android.view.View view2 = kaVar.f204318e;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(i17)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    kaVar.f204317d.setText("" + r17 + "%");
                    kaVar.f204315b.setAlpha(64);
                    kaVar.f204315b.setBackgroundResource(com.tencent.mm.R.drawable.bmq);
                }
                V(kaVar, dVar2, dVar.t(), dVar.D(), dVar, this);
            }
        }
        i17 = 0;
        i18 = 8;
        qVar = v17;
        kaVar = kaVar2;
        f9Var = f9Var2;
        kaVar.clickArea.setTag(new com.tencent.mm.ui.chatting.viewitems.er(dVar2, dVar.D(), kaVar, null));
        kaVar.clickArea.setOnClickListener(w(dVar));
        kaVar.clickArea.setOnLongClickListener(u(dVar));
        kaVar.clickArea.setOnTouchListener(((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) dVar.f460708c.a(sb5.z.class))).B1);
        r17 = com.tencent.mm.pluginsdk.model.app.k0.r(U1);
        if (r17 != -1) {
        }
        android.view.View view3 = kaVar.f204318e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(i17)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgImg$ChattingItemAppMsgToImg", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        kaVar.f204315b.setAlpha(255);
        kaVar.f204315b.setBackgroundDrawable(null);
        V(kaVar, dVar2, dVar.t(), dVar.D(), dVar, this);
    }
}
