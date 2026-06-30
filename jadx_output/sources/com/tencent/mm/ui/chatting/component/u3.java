package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.t.class)
/* loaded from: classes10.dex */
public final class u3 extends com.tencent.mm.ui.chatting.component.a implements sb5.t, xg3.h0 {

    /* renamed from: e, reason: collision with root package name */
    public boolean f200048e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f200049f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Long f200050g;

    /* renamed from: h, reason: collision with root package name */
    public c50.m0 f200051h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f200052i;

    /* renamed from: m, reason: collision with root package name */
    public org.json.JSONObject f200053m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f200054n = "";

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.Rect f200055o = new android.graphics.Rect();

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).n0(this, android.os.Looper.getMainLooper());
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        if (gm0.j1.a()) {
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).za(this);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        if (p0()) {
            o0(true);
            c50.m0 m0Var = this.f200051h;
            if (m0Var != null) {
                ((gp2.l0) m0Var).o();
            }
            this.f200052i = false;
            vd2.e2 e2Var = (vd2.e2) ((en0.e) i95.n0.c(en0.e.class));
            e2Var.f435708d = false;
            e2Var.f435712h.clear();
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        if (gm0.j1.a()) {
            ((com.tencent.mm.storage.g9) c01.d9.b().u()).za(this);
        }
    }

    @Override // xg3.h0
    public void c0(xg3.m0 msgstg, xg3.l0 notifyInfo) {
        kotlin.jvm.internal.o.g(msgstg, "msgstg");
        kotlin.jvm.internal.o.g(notifyInfo, "notifyInfo");
        com.tencent.mars.xlog.Log.i("ChattingFinderLiveNotifyComponent", "[onNotifyChange]");
        if (kotlin.jvm.internal.o.b(notifyInfo.f454411b, "delete")) {
            java.util.ArrayList msgList = notifyInfo.f454412c;
            kotlin.jvm.internal.o.f(msgList, "msgList");
            if (!msgList.isEmpty()) {
                java.util.Iterator it = msgList.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) it.next();
                    s40.y0 y0Var = (s40.y0) i95.n0.c(s40.y0.class);
                    long msgId = f9Var.getMsgId();
                    ((com.tencent.mm.feature.finder.live.f5) y0Var).getClass();
                    ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).Pj().y0(msgId);
                }
            }
        }
    }

    @Override // yn.d
    public void j0(android.view.View view, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (p0() && i17 == 0) {
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.component.t3(this));
            m0("scrollIdle");
            n0("scrollIdle");
        }
    }

    public final void m0(java.lang.String str) {
        java.lang.String str2;
        boolean z17;
        java.lang.String str3;
        com.tencent.mm.ui.chatting.component.u3 u3Var = this;
        java.lang.String str4 = str;
        if (p0()) {
            java.lang.String str5 = "ChattingFinderLiveNotifyComponent";
            if (!u3Var.f200048e) {
                com.tencent.mars.xlog.Log.i("ChattingFinderLiveNotifyComponent", "checkAutoPlay: pause, don't auto play, source=" + str4);
                return;
            }
            int m17 = u3Var.f198580d.m();
            int j17 = u3Var.f198580d.j() - m17;
            int o17 = u3Var.f198580d.o() - m17;
            if (j17 < 0 || j17 > o17) {
                com.tencent.mars.xlog.Log.e("ChattingFinderLiveNotifyComponent", "checkAutoPlay: error, source=" + str4 + ", index start:%d,end:%d", java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(o17));
                return;
            }
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = u3Var.f198580d.f460717l;
            com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = baseChattingUIFragment instanceof com.tencent.mm.ui.chatting.ChattingUIFragment ? (com.tencent.mm.ui.chatting.ChattingUIFragment) baseChattingUIFragment : null;
            if (chattingUIFragment == null) {
                return;
            }
            sb5.z zVar = chattingUIFragment.f198268s;
            kotlin.jvm.internal.g0 g0Var = new kotlin.jvm.internal.g0();
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            f0Var.f310116d = -1;
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            kotlin.jvm.internal.h0 h0Var3 = new kotlin.jvm.internal.h0();
            if (j17 <= o17) {
                while (true) {
                    com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) zVar;
                    com.tencent.mm.storage.f9 item = kVar.getItem(o17);
                    if (item != null && item.getType() == 1075839025) {
                        android.view.View O0 = kVar.O0(item.getMsgId());
                        if (O0 == null) {
                            com.tencent.mars.xlog.Log.w(str5, "checkAutoPlay: view is null, source=" + str4 + ", index=" + o17 + ", msgId=" + item.getMsgId());
                        } else {
                            android.view.View findViewById = O0.findViewById(com.tencent.mm.R.id.icp);
                            if (findViewById != null) {
                                if (findViewById.getVisibility() == 8) {
                                    z17 = true;
                                } else if (findViewById.isShown()) {
                                    android.graphics.Rect rect = u3Var.f200055o;
                                    z17 = findViewById.getGlobalVisibleRect(rect) && rect.width() >= findViewById.getMeasuredWidth() && rect.height() >= findViewById.getMeasuredHeight();
                                    java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
                                } else {
                                    z17 = false;
                                }
                                if (z17) {
                                    java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(item.j(), "msg", null);
                                    if (com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.live_widget.status"), 0) == 1) {
                                        java.lang.String str7 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.live_widget.thumb_url");
                                        if (str7 == null) {
                                            str7 = "";
                                        }
                                        long Z = pm0.v.Z((java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.live_id"));
                                        str2 = str5;
                                        long Z2 = pm0.v.Z((java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id"));
                                        java.lang.String str8 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username");
                                        if (str8 == null) {
                                            str8 = "";
                                        }
                                        java.lang.String str9 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_nonce_id");
                                        if (str9 == null) {
                                            str9 = "";
                                        }
                                        int i17 = o17;
                                        java.lang.String str10 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.tips_id");
                                        if (str10 == null) {
                                            str10 = "";
                                        }
                                        java.lang.String str11 = str10;
                                        java.lang.String str12 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.notice_id");
                                        if (str12 == null) {
                                            str12 = "";
                                        }
                                        java.lang.String str13 = str12;
                                        java.lang.String str14 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.report_ext_info");
                                        if (str14 == null) {
                                            str14 = "";
                                        }
                                        java.lang.String str15 = str14;
                                        java.lang.String str16 = (java.lang.String) d17.get(".msg.appmsg.extinfo.notifymsg.title.nickname");
                                        if (str16 == null) {
                                            str16 = "";
                                        }
                                        g0Var.f310121d = Z;
                                        com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
                                        h0Var2.f310123d = finderObject;
                                        finderObject.setId(Z2);
                                        ((com.tencent.mm.protocal.protobuf.FinderObject) h0Var2.f310123d).setObjectNonceId(str9);
                                        ((com.tencent.mm.protocal.protobuf.FinderObject) h0Var2.f310123d).setUsername(str8);
                                        ((com.tencent.mm.protocal.protobuf.FinderObject) h0Var2.f310123d).setNickname(str16);
                                        com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) h0Var2.f310123d;
                                        com.tencent.mm.protocal.protobuf.FinderObjectDesc finderObjectDesc = new com.tencent.mm.protocal.protobuf.FinderObjectDesc();
                                        finderObjectDesc.setMediaType(9);
                                        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> media = finderObjectDesc.getMedia();
                                        com.tencent.mm.protocal.protobuf.FinderMedia finderMedia = new com.tencent.mm.protocal.protobuf.FinderMedia();
                                        finderMedia.setMediaType(9);
                                        finderMedia.setThumbUrl(str7);
                                        media.add(finderMedia);
                                        finderObject2.setObjectDesc(finderObjectDesc);
                                        h0Var3.f310123d = item;
                                        h0Var.f310123d = findViewById;
                                        f0Var.f310116d = i17;
                                        u3Var = this;
                                        u3Var.f200054n = str13;
                                        org.json.JSONObject jSONObject = new org.json.JSONObject();
                                        jSONObject.put("msgid", str11);
                                        jSONObject.put("type", str13.length() == 0 ? 2L : 1L);
                                        byte[] bArr = ((com.tencent.mm.feature.finder.live.f5) ((s40.y0) i95.n0.c(s40.y0.class))).wi(item.getMsgId()).field_businessBuf;
                                        if (bArr != null) {
                                            java.lang.String str17 = new java.lang.String(bArr, r26.c.f368865a);
                                            if (!(str17.length() > 0)) {
                                                str17 = null;
                                            }
                                            if (str17 != null) {
                                                str3 = str17;
                                                jSONObject.put("reportcontent", str3);
                                                u3Var.f200053m = jSONObject;
                                            }
                                        }
                                        str3 = str15;
                                        jSONObject.put("reportcontent", str3);
                                        u3Var.f200053m = jSONObject;
                                    }
                                }
                            }
                        }
                    }
                    str2 = str5;
                    if (o17 == j17) {
                        break;
                    }
                    o17--;
                    str4 = str;
                    str5 = str2;
                }
            } else {
                str2 = "ChattingFinderLiveNotifyComponent";
            }
            if (g0Var.f310121d == 0 || h0Var.f310123d == null || h0Var2.f310123d == null || h0Var3.f310123d == null) {
                com.tencent.mars.xlog.Log.i(str2, "checkAutoPlay: source=" + str + ", 0 view need to auto play");
                u3Var.o0(true);
                return;
            }
            r45.l71 Hj = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Hj(g0Var.f310121d);
            r45.nw1 nw1Var = Hj != null ? (r45.nw1) Hj.getCustom(1) : null;
            u3Var.f200050g = java.lang.Long.valueOf(g0Var.f310121d);
            if (nw1Var == null) {
                com.tencent.mars.xlog.Log.i(str2, "checkAutoPlay: live info is null, source=" + str + ", autoPlayIndex=" + f0Var.f310116d + ", autoPlayLiveId=" + g0Var.f310121d);
                return;
            }
            java.lang.String str18 = str2;
            if (nw1Var.getInteger(2) != 1) {
                u3Var.f200050g = null;
                com.tencent.mars.xlog.Log.i(str18, "checkAutoPlay: live is end, source=" + str + ", autoPlayIndex=" + f0Var.f310116d + ", autoPlayLiveId=" + g0Var.f310121d);
                return;
            }
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            long j18 = nw1Var.getLong(0);
            qs5.d dVar = qs5.d.f366426e;
            java.lang.Integer Uj = ((com.tencent.mm.feature.finder.live.v4) w0Var).Uj(j18, 5);
            if (Uj == null || (Uj.intValue() & 1) == 0) {
                if (Uj == null) {
                    com.tencent.mars.xlog.Log.i(str18, "checkAutoPlay: flag is null wait cgi back, source=" + str + ", autoPlayIndex=" + f0Var.f310116d + ", autoPlayLiveId=" + g0Var.f310121d);
                    return;
                }
                u3Var.o0(true);
                com.tencent.mars.xlog.Log.i(str18, "checkAutoPlay: server ban auto play, source=" + str + ", auto_play_control_flag=" + Uj + ", autoPlayIndex=" + f0Var.f310116d + ", autoPlayLiveId=" + g0Var.f310121d);
                return;
            }
            if (u3Var.f200051h == null) {
                c50.q0 q0Var = (c50.q0) i95.n0.c(c50.q0.class);
                android.app.Activity g17 = u3Var.f198580d.g();
                kotlin.jvm.internal.o.e(g17, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                c50.m0 Ai = ((v40.q) q0Var).Ai((androidx.appcompat.app.AppCompatActivity) g17);
                u3Var.f200051h = Ai;
                ((gp2.l0) Ai).f(c50.a.f38588g, 16);
            }
            if (!u3Var.f200052i) {
                u3Var.f200052i = true;
                c50.m0 m0Var = u3Var.f200051h;
                if (m0Var != null) {
                    ((gp2.l0) m0Var).e(null);
                }
            }
            ((com.tencent.mm.protocal.protobuf.FinderObject) h0Var2.f310123d).setLiveInfo(nw1Var);
            c50.m0 m0Var2 = u3Var.f200051h;
            boolean C = m0Var2 != null ? ((gp2.l0) m0Var2).C(str18, nw1Var.getLong(0)) : false;
            com.tencent.mars.xlog.Log.i(str18, "checkAutoPlay: start play live, source=" + str + ", isPlaying=" + C + ", autoPlayLiveId=" + nw1Var.getLong(0) + ", autoPlayIndex=" + f0Var.f310116d + ", feedId=" + pm0.v.u(((com.tencent.mm.protocal.protobuf.FinderObject) h0Var2.f310123d).getId()));
            if (C) {
                return;
            }
            u3Var.o0(false);
            c50.m0 m0Var3 = u3Var.f200051h;
            if (m0Var3 != null) {
                ((gp2.l0) m0Var3).F((com.tencent.mm.protocal.protobuf.FinderObject) h0Var2.f310123d, (android.view.View) h0Var.f310123d, new com.tencent.mm.ui.chatting.component.l3(g0Var, h0Var2, h0Var, u3Var), new com.tencent.mm.ui.chatting.component.n3(nw1Var, f0Var, h0Var2, this, h0Var3), null, true);
            }
        }
    }

    public final void n0(java.lang.String str) {
        if (p0()) {
            int m17 = this.f198580d.m();
            int j17 = this.f198580d.j() - m17;
            int o17 = this.f198580d.o() - m17;
            if (j17 < 0 || j17 > o17) {
                com.tencent.mars.xlog.Log.e("ChattingFinderLiveNotifyComponent", "checkGetMoreLive: error, source=" + str + ", index start:%d,end:%d", java.lang.Integer.valueOf(j17), java.lang.Integer.valueOf(o17));
                return;
            }
            com.tencent.mm.ui.chatting.BaseChattingUIFragment baseChattingUIFragment = this.f198580d.f460717l;
            com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = baseChattingUIFragment instanceof com.tencent.mm.ui.chatting.ChattingUIFragment ? (com.tencent.mm.ui.chatting.ChattingUIFragment) baseChattingUIFragment : null;
            if (chattingUIFragment == null) {
                return;
            }
            sb5.z zVar = chattingUIFragment.f198268s;
            java.util.ArrayList<com.tencent.mm.storage.f9> arrayList = new java.util.ArrayList();
            if (j17 <= o17) {
                while (true) {
                    com.tencent.mm.storage.f9 item = ((com.tencent.mm.ui.chatting.adapter.k) zVar).getItem(o17);
                    if (item != null && item.getType() == 1075839025) {
                        arrayList.add(item);
                    }
                    if (o17 == j17) {
                        break;
                    } else {
                        o17--;
                    }
                }
            }
            vd2.e2 e2Var = (vd2.e2) ((en0.e) i95.n0.c(en0.e.class));
            e2Var.getClass();
            if (arrayList.isEmpty()) {
                com.tencent.mars.xlog.Log.i("FinderLiveNotifyGetMoreLiveService", "notifyVisibleMsgInfo: ");
                return;
            }
            java.util.ArrayList arrayList2 = e2Var.f435711g;
            arrayList2.clear();
            for (com.tencent.mm.storage.f9 f9Var : arrayList) {
                java.lang.String str2 = (java.lang.String) com.tencent.mm.sdk.platformtools.aa.d(f9Var.j(), "msg", null).get(".msg.appmsg.extinfo.notifymsg.tipsinfo.object_id");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                if (str2 == null) {
                    str2 = "";
                }
                long Z = pm0.v.Z(str2);
                if (Z != 0) {
                    arrayList2.add(java.lang.Long.valueOf(Z));
                    e2Var.f435712h.put(java.lang.Long.valueOf(Z), f9Var);
                }
            }
            e2Var.Ai("notifyVisibleMsgInfo");
        }
    }

    public final void o0(boolean z17) {
        com.tencent.mars.xlog.Log.i("ChattingFinderLiveNotifyComponent", "clearAllPlayer: isClearAll=" + z17);
        c50.m0 m0Var = this.f200051h;
        if (m0Var != null) {
            com.tencent.mm.ui.chatting.component.o3 o3Var = new com.tencent.mm.ui.chatting.component.o3(this);
            gp2.l0 l0Var = (gp2.l0) m0Var;
            l0Var.m();
            l0Var.M(o3Var);
        }
        if (z17) {
            this.f200050g = null;
        }
    }

    public final boolean p0() {
        return kotlin.jvm.internal.o.b("notifymessage", this.f198580d.u().d1());
    }

    public void q0(hd5.n action) {
        kotlin.jvm.internal.o.g(action, "action");
        if (p0() && this.f200049f) {
            com.tencent.mars.xlog.Log.i("ChattingFinderLiveNotifyComponent", "onDataSetChangeFinish: action=" + action);
            com.tencent.mm.pluginsdk.ui.tools.v3 p17 = this.f198580d.p();
            if (p17 != null) {
                pm0.v.b(p17.f(), new com.tencent.mm.ui.chatting.component.s3(this));
                this.f200049f = false;
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        this.f200048e = true;
        if (p0()) {
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            vd2.j2.f435779h = new com.tencent.mm.ui.chatting.component.q3(this);
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            vd2.j2.f435777f = true;
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.component.t3(this));
            n0("onResume");
            pm0.v.V(0L, new com.tencent.mm.ui.chatting.component.r3(this));
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        this.f200048e = false;
        if (p0()) {
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            vd2.j2 j2Var = vd2.j2.f435772a;
            vd2.j2.f435779h = null;
            ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).getClass();
            vd2.j2.f435777f = false;
            vd2.j2.f435780i.removeMessages(vd2.j2.f435775d);
            o0(true);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        if (p0()) {
            vd2.e2 e2Var = (vd2.e2) ((en0.e) i95.n0.c(en0.e.class));
            e2Var.f435708d = true;
            e2Var.f435709e = e2Var.f435710f;
        }
    }
}
