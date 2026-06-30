package ze5;

/* loaded from: classes9.dex */
public class y9 extends com.tencent.mm.ui.chatting.b6 {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f472328m;

    /* renamed from: g, reason: collision with root package name */
    public int f472329g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.m5 f472330h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f472331i;

    public y9(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.er erVar) {
        super(dVar, erVar);
        this.f472329g = 0;
        this.f472330h = null;
        this.f472331i = false;
        this.f472331i = erVar.c().A0() != 1;
    }

    @Override // com.tencent.mm.ui.chatting.b6
    public void a(android.view.View view, yb5.d dVar, com.tencent.mm.storage.f9 f9Var) {
        if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(dVar.g(), f9Var.G, null)) {
            return;
        }
        ze5.ja jaVar = (ze5.ja) this.f198493e;
        ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).wi(f9Var);
        b(jaVar.c(), f9Var.Q0(), jaVar.f203909e, jaVar.R, view);
        if (com.tencent.mm.storage.z3.N4(f9Var.Q0())) {
            return;
        }
        boolean z17 = this.f472331i;
        long I0 = f9Var.I0();
        java.lang.String Q0 = f9Var.Q0();
        el0.e eVar = el0.i.f253727h;
        if (eVar != null) {
            wl0.l lVar = (wl0.l) eVar;
            ((ku5.t0) ku5.t0.f312615d).r(new wl0.k(lVar, I0, z17, Q0), "KaraEvent");
        }
    }

    public final void b(com.tencent.mm.storage.f9 f9Var, java.lang.String str, java.lang.String str2, int i17, android.view.View view) {
        int i18;
        int i19;
        java.lang.String Zi;
        com.tencent.mm.modelstat.a aVar = com.tencent.mm.modelstat.a.Click;
        yb5.d dVar = this.f198492d;
        com.tencent.mm.modelstat.b.d(f9Var, aVar, dVar.f460722q, dVar.k());
        if (2 != i17) {
            if (f9Var.A0() == 0) {
                wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
                java.lang.String z07 = f9Var.z0();
                ((vf0.y1) x1Var).getClass();
                t21.v2 h17 = t21.d3.h(z07);
                com.tencent.mars.xlog.Log.i("MicroMsg.DesignerClickListener", "videoReceiverEvent video status:" + h17.f415011i + " is sender:" + f9Var.A0());
                if (i17 == 3) {
                    d(h17);
                } else if (i17 == 4) {
                    if (c01.d9.b().E()) {
                        t21.d3.y(f9Var.z0());
                    } else {
                        yb5.d dVar2 = this.f198492d;
                        db5.t7.k(dVar2.g(), dVar2.f460717l.getContentView());
                    }
                }
            }
            if (f9Var.A0() == 1) {
                ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
                t21.v2 g17 = t21.o2.Ui().g(f9Var.z0());
                if (g17 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.DesignerClickListener", "videoSendEvent but video info is null [%s]", f9Var.z0());
                    return;
                }
                int i27 = g17.f415011i;
                com.tencent.mars.xlog.Log.i("MicroMsg.DesignerClickListener", " videoSendEvent status : " + i27);
                if (i17 != 3) {
                    if (i17 != 4) {
                        if (i17 != 5) {
                            if (i17 != 6) {
                                return;
                            }
                        }
                    }
                    if (i27 == 112) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.DesignerClickListener", "this video come from pc weixin, user pause recv now.");
                        t21.d3.y(f9Var.z0());
                        return;
                    } else {
                        t21.d3.z(f9Var.z0());
                        com.tencent.mm.autogen.events.SendMsgFailEvent sendMsgFailEvent = new com.tencent.mm.autogen.events.SendMsgFailEvent();
                        sendMsgFailEvent.f54753g.f7461a = f9Var;
                        sendMsgFailEvent.e();
                        return;
                    }
                }
                if (i27 == 113) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.DesignerClickListener", "this video come from pc weixin, user restart now.");
                    d(g17);
                    return;
                }
                if (g17.k()) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.DesignerClickListener", "this video come from gallery, but it is illegal.");
                    java.lang.String string = this.f198492d.g().getString(com.tencent.mm.R.string.f493445k75);
                    if (i27 == 142) {
                        string = this.f198492d.g().getString(com.tencent.mm.R.string.f493445k75);
                    } else if (i27 == 141) {
                        string = this.f198492d.g().getString(com.tencent.mm.R.string.k76);
                    } else if (i27 == 140) {
                        string = this.f198492d.g().getString(com.tencent.mm.R.string.f493444k74);
                    }
                    db5.e1.s(this.f198492d.g(), string, this.f198492d.g().getString(com.tencent.mm.R.string.jz9));
                    return;
                }
                f9Var.unsetOmittedFailResend();
                ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(f9Var.getMsgId(), f9Var, true);
                if (c01.id.a() - f9Var.getCreateTime() >= 432000000) {
                    com.tencent.mm.pluginsdk.model.app.k0.Q(this.f198492d, f9Var, g17.f415011i == 198 ? com.tencent.mm.R.string.f490489wi : com.tencent.mm.R.string.f490490wj);
                    return;
                }
                if (g17.f415011i == 198) {
                    t21.d3.C(f9Var.z0());
                    return;
                }
                final java.lang.String z08 = f9Var.z0();
                ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
                t21.d3.M(z08);
                ((ku5.t0) ku5.t0.f312615d).g(new java.lang.Runnable() { // from class: ze5.y9$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        f65.y0 y0Var = f65.y0.f260019a;
                        java.lang.String str3 = z08;
                        if (str3 == null) {
                            return;
                        }
                        ((ku5.t0) ku5.t0.f312615d).b(new f65.r0(str3), "MicroMsg.VideoSendReporter");
                    }
                });
                return;
            }
            return;
        }
        if (iq.b.C(this.f198492d.g()) || iq.b.v(this.f198492d.g()) || iq.b.e(this.f198492d.g())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DesignerClickListener", "Voip or multitalk is running, can't do this");
            return;
        }
        if (f9Var.A0() == 1) {
            if (((vf0.y2) ((wf0.b2) i95.n0.c(wf0.b2.class))).ij(new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var.getMsgId(), f9Var.Q0())) && ((Zi = ((xf0.u) ((wf0.y1) i95.n0.c(wf0.y1.class))).Zi(f9Var)) == null || !com.tencent.mm.vfs.w6.j(Zi))) {
                com.tencent.mars.xlog.Log.i("MicroMsg.DesignerClickListener", "video sending, can't click video to launch imagegallery, playPath not exist");
                return;
            }
        }
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
            i19 = view.getWidth();
            i18 = view.getHeight();
        } else {
            i18 = 0;
            i19 = 0;
        }
        long msgId = f9Var.getMsgId();
        long I0 = f9Var.I0();
        int i28 = this.f472329g;
        com.tencent.mars.xlog.Log.i("MicroMsg.DesignerClickListener", "[ImageGalleryUI] showImgGallery");
        yb5.d dVar3 = this.f198492d;
        android.content.Intent intent = new android.content.Intent(dVar3.g(), (java.lang.Class<?>) com.tencent.mm.ui.chatting.gallery.ImageGalleryUI.class);
        intent.putExtra("show_search_chat_content_result", ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) dVar3.f460708c.a(sb5.u1.class))).f199295f);
        intent.putExtra("img_gallery_msg_id", msgId);
        intent.putExtra("key_is_biz_chat", ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar3.f460708c.a(sb5.f.class))).f198753r);
        intent.putExtra("key_biz_chat_id", ((com.tencent.mm.ui.chatting.component.biz.a) ((sb5.f) dVar3.f460708c.a(sb5.f.class))).w0());
        intent.putExtra("img_gallery_msg_svr_id", I0);
        intent.putExtra("img_gallery_talker", str);
        intent.putExtra("img_gallery_chatroom_name", str2);
        intent.putExtra("img_gallery_left", iArr[0]);
        intent.putExtra("img_gallery_top", iArr[1]);
        intent.putExtra("img_gallery_width", i19);
        intent.putExtra("img_gallery_height", i18);
        intent.putExtra("KOpenArticleSceneFromScene", 1);
        intent.putExtra("img_gallery_enter_from_chatting_ui", true);
        intent.putExtra("msg_type", i28);
        if (i28 == 0) {
            intent.putExtra("key_enter_scene", 1);
        } else if (i28 == 4) {
            intent.putExtra("key_enter_scene", 5);
        }
        com.tencent.mm.ui.chatting.m5 m5Var = this.f472330h;
        if (m5Var != null) {
            com.tencent.mm.ui.chatting.l5 f5Var = new com.tencent.mm.ui.chatting.f5(false, 0);
            com.tencent.mm.ui.chatting.l5 a17 = m5Var.a(com.tencent.mm.ui.chatting.f5.class);
            if (a17 != null) {
                f5Var = a17;
            }
            intent.putExtra("key_is_from_news_jump", ((com.tencent.mm.ui.chatting.f5) f5Var).f200486a);
        }
        java.lang.String x17 = dVar3.x();
        java.lang.String t17 = f9Var.A0() == 1 ? dVar3.t() : str;
        android.os.Bundle bundle = new android.os.Bundle();
        if (dVar3.D()) {
            bundle.putInt("stat_scene", 2);
        } else {
            bundle.putInt("stat_scene", c01.e2.G(x17) ? 7 : 1);
        }
        bundle.putString("stat_msg_id", "msg_" + java.lang.Long.toString(I0));
        bundle.putString("stat_chat_talker_username", x17);
        bundle.putString("stat_send_msg_user", t17);
        intent.putExtra("_stat_obj", bundle);
        if (f9Var.M2()) {
            intent.putExtra("img_gallery_mp_video_click_from", 2);
        }
        com.tencent.mm.ui.report.KV17560Reporter c17 = com.tencent.mm.ui.report.KV17560Reporter.c(dVar3.g());
        c17.f209616h = com.tencent.mm.sdk.platformtools.t8.r0(I0);
        c17.f209617i = com.tencent.mm.ui.report.h0.Video;
        int i29 = bundle.getInt("stat_scene", 0);
        if (i29 == 1) {
            c17.f209613e = com.tencent.mm.ui.report.j0.SingleChat;
            c17.b(com.tencent.mm.ui.report.i0.EnterSingleChat);
        } else if (i29 == 2) {
            c17.f209613e = com.tencent.mm.ui.report.j0.GroupChat;
            c17.b(com.tencent.mm.ui.report.i0.EnterGroupChat);
        }
        c17.a(intent);
        com.tencent.mm.ui.chatting.viewitems.bm.a(intent, dVar3.g());
        yb5.d dVar4 = this.f198492d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar4, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemVideoMvvm$VideoClickListener", "showImgGallery", "(Lcom/tencent/mm/storage/MsgInfo;JJLjava/lang/String;Ljava/lang/String;[IIII)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar4.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar4, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemVideoMvvm$VideoClickListener", "showImgGallery", "(Lcom/tencent/mm/storage/MsgInfo;JJLjava/lang/String;Ljava/lang/String;[IIII)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar3.f460717l.overridePendingTransition(0, 0);
        if (f9Var.Y2() && str != null) {
            com.tencent.mm.ui.chatting.a aVar2 = com.tencent.mm.ui.chatting.a.EnterFullScreen;
            com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
            com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
            if (com.tencent.mm.ui.chatting.e.b(f9Var, pString, pString2)) {
                com.tencent.mm.ui.chatting.e.a(aVar2, f9Var, pString.value, pString2.value);
            }
            if (str.toLowerCase().endsWith("@chatroom")) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11444, 2);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11444, 1);
            }
        }
        g90.s sVar = (g90.s) ((h90.v) i95.n0.c(h90.v.class));
        sVar.getClass();
        if (f9Var.getMsgId() <= 0) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).h(new g90.e(sVar, f9Var), "c2c_origin_auto_clean");
    }

    public void c(com.tencent.mm.storage.f9 f9Var, android.view.View view) {
        int i17 = this.f472329g;
        if (i17 != 1) {
            if (i17 != 4) {
                return;
            }
            b(f9Var, f9Var.Q0(), "", 2, view);
        } else {
            if (((fo.e) ((le5.e) i95.n0.c(le5.e.class))).bj(view.getContext(), f9Var.G, null)) {
                return;
            }
            ((u90.a) ((v90.v) i95.n0.c(v90.v.class))).wi(f9Var);
            b(f9Var, f9Var.Q0(), "", 2, view);
        }
    }

    public final void d(t21.v2 v2Var) {
        boolean E = c01.d9.b().E();
        yb5.d dVar = this.f198492d;
        if (!E) {
            db5.t7.k(dVar.g(), dVar.f460717l.getContentView());
            return;
        }
        if (v2Var.f415011i == 198) {
            t21.d3.B(v2Var.d());
            return;
        }
        if (!com.tencent.mm.network.y2.a(dVar.g()) && !f472328m) {
            f472328m = true;
            db5.e1.n(dVar.g(), com.tencent.mm.R.string.k77, com.tencent.mm.R.string.f490573yv, new ze5.z9(this, v2Var), new ze5.aa(this));
        } else {
            java.lang.String d17 = v2Var.d();
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            t21.d3.L(d17);
        }
    }

    public y9(yb5.d dVar) {
        super(dVar, null);
        this.f472329g = 0;
        this.f472330h = null;
        this.f472331i = false;
    }
}
