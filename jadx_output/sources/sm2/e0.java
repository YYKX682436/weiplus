package sm2;

/* loaded from: classes3.dex */
public final class e0 implements hn0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409433a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.hc1 f409434b;

    public e0(sm2.o4 o4Var, r45.hc1 hc1Var) {
        this.f409433a = o4Var;
        this.f409434b = hc1Var;
    }

    @Override // hn0.i
    public void callback(int i17, android.os.Bundle bundle) {
        java.lang.Class<mm2.e1> cls;
        r45.w22 w22Var;
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        qf2.v0 v0Var;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        java.lang.Class<mm2.o4> cls2;
        java.lang.String str;
        int i18;
        java.lang.Class<mm2.e1> cls3;
        r45.wz1 wz1Var;
        int i19;
        java.lang.String str2;
        char c17;
        int i27;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        r45.xn1 xn1Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        r45.xn1 xn1Var2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5;
        r45.im1 im1Var;
        fm2.a aVar;
        km2.m data2;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore2;
        qf2.c3 c3Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact6;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact7;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact8;
        in0.q qVar;
        kn0.p pVar;
        sm2.o4 o4Var = this.f409433a;
        com.tencent.mars.xlog.Log.i(o4Var.f409610f, "on enterRoom finish, liveData.business(LiveCommonSlice::class.java).enableAudioMode():" + ((mm2.c1) o4Var.c(mm2.c1.class)).l7() + " audioModeHolderBm:" + ((mm2.c1) o4Var.c(mm2.c1.class)).I4);
        int i28 = 2;
        int i29 = 1;
        if (i17 <= 0) {
            com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            com.tencent.mm.plugin.finder.assist.r8 r8Var = com.tencent.mm.plugin.finder.assist.t8.f102555a;
            com.tencent.mm.plugin.finder.assist.p8.c(p8Var, com.tencent.mm.plugin.finder.assist.t8.f102580z.f102540b, null, false, true, 6, null);
            com.tencent.mars.xlog.Log.w(o4Var.f409610f, "enter room fail");
            db5.t7.makeText(o4Var.f19594b, "enter room fail", 0).show();
            fm2.a aVar2 = o4Var.f19595c;
            if (aVar2 != null) {
                qo0.c.a(aVar2, qo0.b.f365363i, null, 2, null);
            }
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("live_user_exit_reason", i17);
            fm2.a aVar3 = o4Var.f19595c;
            if (aVar3 != null) {
                aVar3.statusChange(qo0.b.D1, bundle2);
            }
            dk2.xf g17 = o4Var.g();
            if (g17 != null) {
                dk2.xf.f(g17, 0, new sm2.d0(o4Var), 1, null);
                return;
            }
            return;
        }
        in0.q qVar2 = o4Var.f19597e;
        if (((qVar2 == null || (pVar = qVar2.D) == null || !pVar.e()) ? false : true) && (qVar = o4Var.f19597e) != null) {
            android.graphics.drawable.Drawable drawable = o4Var.f19594b.getResources().getDrawable(com.tencent.mm.R.drawable.ajc);
            kotlin.jvm.internal.o.f(drawable, "getDrawable(...)");
            qVar.I0(pm0.v.n(drawable));
        }
        r45.hc1 hc1Var = this.f409434b;
        r45.wz1 wz1Var2 = (r45.wz1) hc1Var.getCustom(4);
        java.lang.Class<mm2.e1> cls4 = mm2.e1.class;
        boolean g76 = ((mm2.e1) o4Var.c(cls4)).g7();
        int i37 = 3;
        java.lang.String str3 = o4Var.f409610f;
        java.lang.Class<mm2.o4> cls5 = mm2.o4.class;
        if (g76) {
            java.util.LinkedList<r45.uz1> list3 = wz1Var2 != null ? wz1Var2.getList(6) : null;
            if (list3 == null) {
                list3 = new java.util.LinkedList();
            }
            com.tencent.mars.xlog.Log.i(str3, "keepLinkWhenJoinLive micUserList.size:" + list3.size());
            for (r45.uz1 uz1Var : list3) {
                if (uz1Var != null) {
                    java.lang.String string = uz1Var.getString(3);
                    if (((string == null || string.length() == 0) ? i29 : 0) == 0) {
                        java.lang.String string2 = uz1Var.getString(2);
                        r45.xn1 xn1Var3 = (r45.xn1) uz1Var.getCustom(0);
                        java.lang.String headUrl = (xn1Var3 == null || (finderContact8 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact8.getHeadUrl();
                        r45.xn1 xn1Var4 = (r45.xn1) uz1Var.getCustom(0);
                        java.lang.String username = (xn1Var4 == null || (finderContact7 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) == null) ? null : finderContact7.getUsername();
                        r45.xn1 xn1Var5 = (r45.xn1) uz1Var.getCustom(0);
                        java.lang.String nickname = (xn1Var5 == null || (finderContact6 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) == null) ? null : finderContact6.getNickname();
                        int integer = uz1Var.getInteger(i29);
                        java.lang.String string3 = uz1Var.getString(3);
                        int l86 = ((mm2.c1) o4Var.c(mm2.c1.class)).l8();
                        int i38 = uz1Var.getInteger(i29) == 2 ? 4 : 3;
                        r45.xn1 xn1Var6 = (r45.xn1) uz1Var.getCustom(0);
                        km2.q qVar3 = new km2.q(string2, headUrl, username, nickname, integer, string3, null, false, l86, null, null, i38, xn1Var6 != null ? xn1Var6.getInteger(4) : 0, false, null, false, 0L, (r45.xn1) uz1Var.getCustom(0), false, null, null, 0, uz1Var.getInteger(7), uz1Var.getLong(8), null, null, 0L, null, 0, 0L, null, null, null, -12720448, 1, null);
                        com.tencent.mars.xlog.Log.i(str3, "keepLinkWhenJoinLive curLinkUser:" + qVar3);
                        ((mm2.c1) o4Var.c(mm2.c1.class)).k8(qVar3);
                        ((mm2.o4) o4Var.c(cls5)).O7(qVar3);
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        linkedList.addAll(((mm2.o4) o4Var.c(cls5)).f329327v);
                        com.tencent.mars.xlog.Log.i(str3, "startCloseLinkCheck checkList: " + linkedList.size());
                        fm2.a aVar4 = o4Var.f19595c;
                        if (aVar4 != null) {
                            com.tencent.mm.plugin.finder.live.util.y.f(aVar4, null, null, new sm2.j4(linkedList, o4Var, null), 3, null);
                        }
                    }
                }
                i29 = 1;
            }
            if (wz1Var2 != null && (im1Var = (r45.im1) wz1Var2.getCustom(8)) != null && (aVar = o4Var.f19595c) != null && (data2 = aVar.getData()) != null && (liveRoomControllerStore2 = data2.f309131f) != null && (c3Var = (qf2.c3) liveRoomControllerStore2.controller(qf2.c3.class)) != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveMicVisitorBattlePkController", "anchorCancelAbortVisitorBattle status: " + im1Var.getInteger(2) + ", battleId: " + im1Var.getString(0));
                com.tencent.mm.plugin.finder.live.util.y.d(c3Var, null, null, new qf2.d2(c3Var, im1Var, null), 3, null);
            }
            cls = cls4;
        } else {
            java.util.LinkedList list4 = wz1Var2 != null ? wz1Var2.getList(6) : null;
            if (list4 == null) {
                list4 = new java.util.LinkedList();
            }
            java.util.LinkedList<r45.uz1> linkedList2 = list4;
            r45.yz1 yz1Var = wz1Var2 != null ? (r45.yz1) wz1Var2.getCustom(7) : null;
            for (r45.uz1 uz1Var2 : linkedList2) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkLinkMicStateWhenJoin micUserList.size:");
                sb6.append(linkedList2.size());
                sb6.append(" micInfo:[sessionId:");
                sb6.append(uz1Var2 != null ? uz1Var2.getString(i37) : null);
                sb6.append(", micSeq:");
                sb6.append(uz1Var2 != null ? java.lang.Long.valueOf(uz1Var2.getLong(4)) : null);
                sb6.append(", micNickname:");
                sb6.append((uz1Var2 == null || (xn1Var2 = (r45.xn1) uz1Var2.getCustom(0)) == null || (finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact5.getNickname());
                sb6.append("], micPkInfo:[sessionId:");
                sb6.append(yz1Var != null ? yz1Var.getString(0) : null);
                sb6.append(", micPkseq:");
                sb6.append(yz1Var != null ? java.lang.Long.valueOf(yz1Var.getLong(1)) : null);
                sb6.append(", micPkNickname:");
                sb6.append((yz1Var == null || (xn1Var = (r45.xn1) yz1Var.getCustom(i37)) == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact4.getNickname());
                sb6.append(']');
                com.tencent.mars.xlog.Log.i(str3, sb6.toString());
                if (uz1Var2 != null) {
                    java.lang.String string4 = uz1Var2.getString(i37);
                    if (!(string4 == null || string4.length() == 0)) {
                        java.lang.String string5 = uz1Var2.getString(i28);
                        r45.xn1 xn1Var7 = (r45.xn1) uz1Var2.getCustom(0);
                        java.lang.String headUrl2 = (xn1Var7 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var7.getCustom(0)) == null) ? null : finderContact3.getHeadUrl();
                        r45.xn1 xn1Var8 = (r45.xn1) uz1Var2.getCustom(0);
                        java.lang.String username2 = (xn1Var8 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var8.getCustom(0)) == null) ? null : finderContact2.getUsername();
                        r45.xn1 xn1Var9 = (r45.xn1) uz1Var2.getCustom(0);
                        if (xn1Var9 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var9.getCustom(0)) == null) {
                            i19 = 1;
                            str2 = null;
                        } else {
                            str2 = finderContact.getNickname();
                            i19 = 1;
                        }
                        int integer2 = uz1Var2.getInteger(i19);
                        java.lang.String string6 = uz1Var2.getString(i37);
                        int i39 = uz1Var2.getInteger(i19) == i28 ? 4 : 3;
                        r45.xn1 xn1Var10 = (r45.xn1) uz1Var2.getCustom(0);
                        if (xn1Var10 != null) {
                            c17 = 4;
                            i27 = xn1Var10.getInteger(4);
                        } else {
                            c17 = 4;
                            i27 = 0;
                        }
                        km2.q qVar4 = new km2.q(string5, headUrl2, username2, str2, integer2, string6, null, false, 0, null, null, i39, i27, false, null, false, 0L, (r45.xn1) uz1Var2.getCustom(0), false, null, null, 0, 0, uz1Var2.getLong(8), null, null, 0L, null, 0, 0L, null, null, null, -8525888, 1, null);
                        ((mm2.c1) o4Var.c(mm2.c1.class)).k8(qVar4);
                        ((mm2.o4) o4Var.c(cls5)).O7(qVar4);
                        com.tencent.mars.xlog.Log.i(str3, "checkLinkMicStateWhenJoin has unfinished mic, will close. curLinkUser:" + qVar4);
                        cls2 = cls5;
                        i18 = 3;
                        str = str3;
                        cls3 = cls4;
                        wz1Var = wz1Var2;
                        sm2.o4.H(o4Var, qVar4, 1, false, true, null, 20, null);
                        cls5 = cls2;
                        i37 = i18;
                        str3 = str;
                        cls4 = cls3;
                        wz1Var2 = wz1Var;
                        i28 = 2;
                    }
                }
                cls2 = cls5;
                str = str3;
                i18 = i37;
                cls3 = cls4;
                wz1Var = wz1Var2;
                cls5 = cls2;
                i37 = i18;
                str3 = str;
                cls4 = cls3;
                wz1Var2 = wz1Var;
                i28 = 2;
            }
            java.lang.Class<mm2.o4> cls6 = cls5;
            java.lang.String str4 = str3;
            cls = cls4;
            r45.wz1 wz1Var3 = wz1Var2;
            sm2.q qVar5 = new sm2.q(o4Var);
            if (yz1Var != null) {
                java.lang.String string7 = yz1Var.getString(0);
                if (!(string7 == null || string7.length() == 0)) {
                    qVar5.invoke(yz1Var);
                }
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("checkLinkMicStateWhenJoin pkAnchorSize: ");
            sb7.append((wz1Var3 == null || (list2 = wz1Var3.getList(12)) == null) ? null : java.lang.Integer.valueOf(list2.size()));
            com.tencent.mars.xlog.Log.i(str4, sb7.toString());
            if (((wz1Var3 == null || (list = wz1Var3.getList(12)) == null) ? 0 : list.size()) > 0 && wz1Var3 != null && (w22Var = (r45.w22) wz1Var3.getCustom(13)) != null) {
                mm2.o4 o4Var2 = (mm2.o4) o4Var.c(cls6);
                java.lang.String string8 = w22Var.getString(0);
                if (string8 == null) {
                    string8 = "";
                }
                java.lang.String string9 = w22Var.getString(1);
                o4Var2.W = new km2.c(string8, string9 != null ? string9 : "", w22Var.getLong(2));
                fm2.a aVar5 = o4Var.f19595c;
                if (aVar5 != null && (data = aVar5.getData()) != null && (liveRoomControllerStore = data.f309131f) != null && (v0Var = (qf2.v0) liveRoomControllerStore.controller(qf2.v0.class)) != null) {
                    qf2.v0.e7(v0Var, "", true, false, null, 12, null);
                }
            }
        }
        com.tencent.mm.plugin.finder.assist.u8.f102603e = c01.id.a();
        com.tencent.mm.plugin.finder.assist.p8 p8Var2 = com.tencent.mm.plugin.finder.assist.p8.f102460a;
        com.tencent.mm.plugin.finder.assist.r8 r8Var2 = com.tencent.mm.plugin.finder.assist.t8.f102555a;
        com.tencent.mm.plugin.finder.assist.p8.c(p8Var2, com.tencent.mm.plugin.finder.assist.t8.A.f102540b, null, false, false, 14, null);
        dk2.xf g18 = o4Var.g();
        if (g18 != null) {
            java.lang.Class<mm2.e1> cls7 = cls;
            ((dk2.r4) g18).o0(((mm2.e1) o4Var.c(cls7)).f328988r.getLong(0), ((mm2.e1) o4Var.c(cls7)).f328983m, ((mm2.c1) o4Var.c(mm2.c1.class)).f328866q, 1, true, new sm2.c0(o4Var, hc1Var));
        }
    }
}
