package ln;

/* loaded from: classes5.dex */
public class b implements c01.yc {
    public b() {
        dm.w9.createTable(gm0.j1.u().f273153f);
    }

    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 p0Var) {
        java.lang.String str;
        java.lang.Object valueOf;
        r45.j4 j4Var = p0Var.f70726a;
        int i17 = j4Var.f377560g;
        if (i17 != 10002) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomAccessVerifySysCmdMsgListener", "not new xml type:%d ", java.lang.Integer.valueOf(i17));
            return;
        }
        java.lang.String g17 = x51.j1.g(j4Var.f377561h);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChatroomAccessVerifySysCmdMsgListener", "msg content is null");
            return;
        }
        java.lang.String g18 = x51.j1.g(j4Var.f377558e);
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(g17, "sysmsg", null);
        if (d17 == null || !(((java.lang.String) d17.get(".sysmsg.$type")).equals("NewXmlChatRoomAccessVerifyApplication") || ((java.lang.String) d17.get(".sysmsg.$type")).equals("NewXmlOpenIMChatRoomAddChatRoomMemberApplication"))) {
            com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g18, j4Var.f377568r);
            boolean z17 = o27.getMsgId() > 0;
            o27.o1(j4Var.f377568r);
            o27.e1(c01.w9.m(g18, j4Var.f377565o));
            o27.setType(10002);
            o27.d1(g17);
            o27.j1(0);
            o27.u1(g18);
            o27.u3(j4Var.f377566p);
            o27.l1(o27.F & (-129));
            c01.w9.n(o27, p0Var);
            if (z17) {
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(j4Var.f377568r, o27);
                return;
            } else {
                c01.w9.x(o27);
                return;
            }
        }
        java.lang.String str2 = ((java.lang.String) d17.get(".sysmsg.$type")).equals("NewXmlChatRoomAccessVerifyApplication") ? ".sysmsg.NewXmlChatRoomAccessVerifyApplication" : ".sysmsg.NewXmlOpenIMChatRoomAddChatRoomMemberApplication";
        java.lang.String str3 = (java.lang.String) d17.get(str2.concat(".RoomName"));
        java.lang.String str4 = (java.lang.String) d17.get(str2.concat(".link.inviterusername"));
        if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            str4 = (java.lang.String) d17.get(str2.concat(".link.inviter.username"));
        }
        java.lang.String str5 = (java.lang.String) d17.get(str2.concat(".link.joinscene"));
        java.lang.String str6 = (java.lang.String) d17.get(str2.concat(".link.joinqrcode.qrcode"));
        java.lang.String str7 = (java.lang.String) d17.get(str2.concat(".link.joinqrcode.expiredtime"));
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatroomAccessVerifySysCmdMsgListener", "ChatroomManagerIndependentQR joinscene=%s, joinqrcode=%s, expiredtime=%s", str5, str6, str7);
        java.lang.String str8 = (java.lang.String) d17.get(str2.concat(".link.scene"));
        java.lang.String str9 = (java.lang.String) d17.get(str2.concat(".link.ticket"));
        java.lang.String str10 = (java.lang.String) d17.get(str2.concat(".link.invitationreason"));
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        java.util.LinkedList linkedList5 = new java.util.LinkedList();
        java.util.LinkedList linkedList6 = new java.util.LinkedList();
        java.lang.String str11 = "MicroMsg.ChatroomAccessVerifySysCmdMsgListener";
        java.util.LinkedList linkedList7 = new java.util.LinkedList();
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(str2.concat(".link.memberlist.memberlistsize")), 0);
        int i18 = 0;
        while (i18 < P) {
            int i19 = P;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(str2);
            java.lang.String str12 = str5;
            sb6.append(".link.memberlist.member");
            if (i18 == 0) {
                str = g18;
                valueOf = "";
            } else {
                str = g18;
                valueOf = java.lang.Integer.valueOf(i18);
            }
            sb6.append(valueOf);
            sb6.append(".username");
            java.lang.String str13 = (java.lang.String) d17.get(sb6.toString());
            if (str13 == null) {
                str13 = "";
            }
            linkedList.add(str13);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(str2);
            sb7.append(".link.memberlist.member");
            sb7.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
            sb7.append(".nickname");
            java.lang.String str14 = (java.lang.String) d17.get(sb7.toString());
            if (str14 == null) {
                str14 = "";
            }
            linkedList2.add(str14);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            sb8.append(str2);
            sb8.append(".link.memberlist.member");
            sb8.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
            sb8.append(".headimgurl");
            java.lang.String str15 = (java.lang.String) d17.get(sb8.toString());
            if (str15 == null) {
                str15 = "";
            }
            linkedList3.add(str15);
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(str2);
            sb9.append(".link.memberlist.member");
            sb9.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
            sb9.append(".quitchatroominfo");
            java.lang.String str16 = (java.lang.String) d17.get(sb9.toString());
            if (str16 == null) {
                str16 = "";
            }
            linkedList4.add(str16);
            java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
            sb10.append(str2);
            sb10.append(".link.memberlist.member");
            sb10.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
            sb10.append(".sex");
            java.lang.String str17 = (java.lang.String) d17.get(sb10.toString());
            if (str17 == null) {
                str17 = "";
            }
            linkedList5.add(str17);
            java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
            sb11.append(str2);
            sb11.append(".link.memberlist.member");
            sb11.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
            sb11.append(".appid");
            java.lang.String str18 = (java.lang.String) d17.get(sb11.toString());
            if (str18 == null) {
                str18 = "";
            }
            linkedList6.add(str18);
            java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
            sb12.append(str2);
            sb12.append(".link.memberlist.member");
            sb12.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
            sb12.append(".descid");
            java.lang.String str19 = (java.lang.String) d17.get(sb12.toString());
            if (str19 == null) {
                str19 = "";
            }
            linkedList7.add(str19);
            i18++;
            P = i19;
            str5 = str12;
            g18 = str;
        }
        java.lang.String str20 = g18;
        java.lang.String str21 = str5;
        p75.n0 n0Var = dm.w9.f240866o;
        java.util.LinkedList linkedList8 = new java.util.LinkedList();
        java.util.LinkedList linkedList9 = new java.util.LinkedList();
        java.util.LinkedList linkedList10 = new java.util.LinkedList();
        java.util.LinkedList linkedList11 = linkedList5;
        p75.y yVar = new p75.y(dm.w9.f240868q.j(str3));
        yVar.f(dm.w9.f240867p.j(b(str4, linkedList)));
        java.util.LinkedList linkedList12 = linkedList7;
        java.lang.String str22 = null;
        yVar.f(dm.w9.f240870s.i(0));
        p75.i0 g19 = dm.w9.f240866o.g(linkedList8);
        g19.f352657d = yVar;
        g19.f352659f = linkedList9;
        g19.f352660g = linkedList10;
        dm.w9 w9Var = (dm.w9) g19.a().o(gm0.j1.u().f273153f, dm.w9.class);
        try {
            in.b bVar = new in.b();
            try {
                if (w9Var == null) {
                    w9Var = new dm.w9();
                    w9Var.field_chatRoomName = str20;
                    w9Var.field_hashKey = b(str4, linkedList);
                    w9Var.field_primaryKey = b(str4, linkedList) + "_" + java.lang.System.currentTimeMillis();
                    in.c cVar = new in.c();
                    cVar.f292721d = str4;
                    cVar.f292725h = (java.lang.String) d17.get(str2 + ".link.inviter.appid");
                    cVar.f292726i = (java.lang.String) d17.get(str2 + ".link.inviter.descid");
                    if (str21 == null || !str21.equals("1")) {
                        cVar.f292727m = 0;
                    } else {
                        cVar.f292727m = 1;
                    }
                    if (str6 != null && str7 != null) {
                        cVar.f292728n = str6;
                        cVar.f292729o = com.tencent.mm.sdk.platformtools.t8.V(str7, 0L);
                    }
                    bVar.f292718d = cVar;
                    int i27 = 0;
                    while (i27 < linkedList.size()) {
                        java.util.LinkedList linkedList13 = bVar.f292719e;
                        in.c cVar2 = new in.c();
                        cVar2.f292721d = (java.lang.String) linkedList.get(i27);
                        cVar2.f292722e = (java.lang.String) linkedList2.get(i27);
                        cVar2.f292723f = (java.lang.String) linkedList3.get(i27);
                        cVar2.f292724g = (java.lang.String) linkedList4.get(i27);
                        cVar2.f292725h = (java.lang.String) linkedList6.get(i27);
                        java.util.LinkedList linkedList14 = linkedList12;
                        cVar2.f292726i = (java.lang.String) linkedList14.get(i27);
                        java.util.LinkedList linkedList15 = linkedList11;
                        cVar2.f292730p = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) linkedList15.get(i27), 0);
                        linkedList13.add(cVar2);
                        java.lang.String str23 = str11;
                        com.tencent.mars.xlog.Log.i(str23, "add member: username:%s nickname:%s quit:%s sex:%s", linkedList.get(i27), linkedList2.get(i27), linkedList4.get(i27), linkedList15.get(i27));
                        i27++;
                        linkedList12 = linkedList14;
                        linkedList11 = linkedList15;
                        str11 = str23;
                    }
                    str22 = str11;
                } else {
                    str22 = str11;
                    bVar.parseFrom(w9Var.field_data);
                }
                java.util.LinkedList linkedList16 = bVar.f292720f;
                in.a aVar = new in.a();
                aVar.f292714d = str8;
                aVar.f292715e = str9;
                aVar.f292716f = str10;
                aVar.f292717g = j4Var.f377568r;
                linkedList16.add(aVar);
                w9Var.field_msgId = j4Var.f377568r;
                w9Var.field_state = 0;
                w9Var.field_read = 0;
                w9Var.field_data = bVar.toByteArray();
                w9Var.field_updateTime = c01.id.a();
                l75.k0 k0Var = gm0.j1.u().f273153f;
                o75.c cVar3 = new o75.c(o75.b.f343583d, java.lang.String.valueOf(w9Var.field_primaryKey), "MicroMsg.SDK.BaseRoomVerifyApplicationStg");
                cVar3.f343590d = w9Var;
                new m75.d(w9Var, cVar3, dm.w9.G, "MicroMsg.SDK.BaseRoomVerifyApplicationStg").a(k0Var);
                ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().doNotify(str3);
                java.util.LinkedList linkedList17 = new java.util.LinkedList();
                java.util.LinkedList linkedList18 = new java.util.LinkedList();
                java.util.LinkedList linkedList19 = new java.util.LinkedList();
                p75.y yVar2 = new p75.y(dm.w9.f240868q.j(str3));
                yVar2.f(dm.w9.f240871t.i(0).c(dm.w9.f240870s.i(0)));
                linkedList18.add(dm.w9.f240872u.u());
                p75.i0 g27 = dm.w9.f240866o.g(linkedList17);
                g27.f352657d = yVar2;
                g27.f352659f = linkedList18;
                g27.f352660g = linkedList19;
                java.util.List k17 = g27.a().k(gm0.j1.u().f273153f, dm.w9.class);
                com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str3);
                if (p17 != null) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) k17;
                    p17.Z1(arrayList.size());
                    if (arrayList.size() == 0) {
                        g95.u.l(str3, 7);
                    } else {
                        g95.u.j(str3, 7);
                    }
                    com.tencent.mars.xlog.Log.i(str22, "chatRoomAccessVerify setUnReadInvite %s", java.lang.Integer.valueOf(arrayList.size()));
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().W(p17, str3);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().R(p17);
                }
            } catch (java.io.IOException e17) {
                e = e17;
                com.tencent.mars.xlog.Log.printErrStackTrace(str22, e, null, new java.lang.Object[0]);
            }
        } catch (java.io.IOException e18) {
            e = e18;
            str22 = str11;
        }
    }

    public final java.lang.String b(java.lang.String str, java.util.List list) {
        java.util.LinkedList linkedList = new java.util.LinkedList(list);
        java.util.Collections.sort(linkedList, new ln.a(this));
        return kk.k.g((str + ":" + linkedList.toString()).getBytes());
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 r0Var) {
    }
}
