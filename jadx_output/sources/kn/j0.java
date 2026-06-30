package kn;

/* loaded from: classes13.dex */
public abstract class j0 {
    public static android.util.Pair a(com.tencent.mm.storage.f9 f9Var, ot0.q qVar) {
        java.lang.String str;
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "msginfo is null");
            return new android.util.Pair(java.lang.Boolean.FALSE, "");
        }
        if (qVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "content is null");
            return new android.util.Pair(java.lang.Boolean.FALSE, "");
        }
        long createTime = f9Var.getCreateTime();
        ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.f348364t)) {
            str = "related_msgid_" + f9Var.I0();
        } else {
            str = aVar.f348364t;
        }
        rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(f9Var.Q0(), str);
        if (z07 != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "addTodoAppBrandImpl %s(%s) exist", str, java.lang.Integer.valueOf(z07.field_state));
            if (z07.field_state != 2) {
                return new android.util.Pair(java.lang.Boolean.TRUE, z07.field_todoid);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "addTodoAppBrandImpl delete %s", java.lang.Boolean.valueOf(((nn.j) i95.n0.c(nn.j.class)).Bi().y0(z07)));
        }
        rn.c cVar = new rn.c();
        cVar.field_todoid = str;
        cVar.field_roomname = f9Var.Q0();
        cVar.field_username = qVar.f348673j2;
        cVar.field_path = qVar.f348669i2;
        cVar.field_createtime = createTime;
        cVar.field_updatetime = createTime;
        cVar.field_custominfo = "";
        java.lang.String n17 = qVar.n();
        if (com.tencent.mm.sdk.platformtools.t8.K0(n17)) {
            k91.v5 Bi = ((k91.g4) ((com.tencent.mm.plugin.appbrand.service.f6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f6.class))).Bi(qVar.f348673j2);
            if (Bi != null && !com.tencent.mm.sdk.platformtools.t8.K0(Bi.field_nickname)) {
                n17 = Bi.field_nickname;
            }
        }
        cVar.field_title = n17;
        cVar.field_creator = bm5.d1.c(f9Var);
        cVar.field_manager = c01.z1.r();
        cVar.field_nreply = 0;
        cVar.field_related_msgids = f9Var.I0() + "";
        cVar.field_shareKey = qVar.f348693o2;
        cVar.field_shareName = f9Var.Q0();
        boolean insert = ((nn.j) i95.n0.c(nn.j.class)).Bi().insert(cVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "addTodoBySendSuccess todoId:%s result:%s", cVar.field_todoid, java.lang.Boolean.valueOf(insert));
        if (insert) {
            com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(f9Var.Q0(), f9Var.I0());
            o27.s3(cVar.field_todoid);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o27.getMsgId(), o27, true);
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent notifyGroupTodoEvent = new com.tencent.mm.autogen.events.NotifyGroupTodoEvent();
            am.ql qlVar = notifyGroupTodoEvent.f54545g;
            qlVar.f7715a = 0;
            qlVar.f7717c = cVar.field_todoid;
            qlVar.f7716b = f9Var.Q0();
            notifyGroupTodoEvent.b(android.os.Looper.getMainLooper());
        }
        return new android.util.Pair(java.lang.Boolean.valueOf(insert), cVar.field_todoid);
    }

    public static r45.vt5 b(rn.c cVar) {
        r45.vt5 vt5Var = new r45.vt5();
        vt5Var.f388523d = cVar.field_todoid;
        vt5Var.f388524e = cVar.field_username;
        vt5Var.f388525f = cVar.field_path;
        vt5Var.f388526g = (int) (cVar.field_createtime / 1000);
        vt5Var.f388528i = cVar.field_title;
        vt5Var.f388529m = cVar.field_creator;
        vt5Var.f388530n = cVar.u0();
        vt5Var.f388531o = cVar.field_manager;
        vt5Var.f388527h = com.tencent.mm.protobuf.g.c(cVar.field_custominfo);
        vt5Var.f388532p = cVar.field_shareKey;
        vt5Var.f388533q = cVar.field_shareName;
        return vt5Var;
    }

    public static java.lang.String c(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return "";
        }
        if (f9Var.y2()) {
            return "roomannouncement@app.origin";
        }
        ot0.q v17 = ot0.q.v(f9Var.j());
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "getAppUsernameFromMsginfo content is null");
            return "";
        }
        if (((ot0.a) v17.y(ot0.a.class)) != null) {
            return v17.f348673j2;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "getAppUsernameFromMsginfo appContentAppBrandPiece is null");
        return "";
    }

    public static void d(android.content.Context context, java.lang.String str, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "gotoRoomCard roomname is null");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("RoomInfo_Id", str);
        intent.putExtra("room_notice", c01.v1.d(str));
        intent.putExtra("room_notice_xml", c01.v1.g(str));
        intent.putExtra("room_notice_publish_time", c01.v1.f(str));
        intent.putExtra("room_notice_editor", c01.v1.e(str));
        intent.putExtra("from_scene", z17 ? 4 : 3);
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        if (z07 != null) {
            intent.putExtra("Is_RoomOwner", z07.field_roomowner.equals(c01.z1.r()));
            intent.putExtra("Is_RoomManager", z07.G0(c01.z1.r()));
        }
        intent.putExtra("room_member_count", z07.field_memberCount);
        if (z17) {
            intent.setFlags(268435456);
        }
        ((com.tencent.mm.plugin.announcement.x) ((d81.e) i95.n0.c(d81.e.class))).Di(context, intent);
    }

    public static boolean e(rn.c cVar) {
        return (cVar == null || cVar.field_state == 2) ? false : true;
    }

    public static java.lang.String f(r45.vt5 vt5Var) {
        if (vt5Var == null) {
            return "";
        }
        return "RoomToolsTodo{TodoId='" + vt5Var.f388523d + "', Username='" + vt5Var.f388524e + "', Path='" + vt5Var.f388525f + "', Time=" + vt5Var.f388526g + ", CustomInfo=" + vt5Var.f388527h + ", Title='" + com.tencent.mm.sdk.platformtools.t8.G1(vt5Var.f388528i) + "', Creator='" + vt5Var.f388529m + "', RelatedMsgId=" + vt5Var.f388530n + ", Manager='" + vt5Var.f388531o + "'}";
    }

    public static android.util.Pair g(long j17, java.lang.String str) {
        boolean update;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Li.X1())) {
            return new android.util.Pair(java.lang.Boolean.FALSE, "");
        }
        rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(Li.Q0(), Li.X1());
        if (z07 == null) {
            return new android.util.Pair(java.lang.Boolean.FALSE, Li.X1());
        }
        long I0 = Li.I0();
        java.util.ArrayList arrayList = (java.util.ArrayList) z07.S;
        if (arrayList.contains(java.lang.Long.valueOf(I0))) {
            arrayList.remove(java.lang.Long.valueOf(I0));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb6.append(((java.lang.Long) it.next()).longValue());
                sb6.append(",");
            }
            if (sb6.length() - 1 >= 0) {
                sb6.deleteCharAt(sb6.length() - 1);
            }
            z07.field_related_msgids = sb6.toString();
        }
        if (arrayList.size() == 0) {
            update = ((nn.j) i95.n0.c(nn.j.class)).Bi().y0(z07);
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent notifyGroupTodoEvent = new com.tencent.mm.autogen.events.NotifyGroupTodoEvent();
            am.ql qlVar = notifyGroupTodoEvent.f54545g;
            qlVar.f7715a = 1;
            qlVar.f7716b = z07.field_roomname;
            qlVar.f7717c = z07.field_todoid;
            if (update) {
                notifyGroupTodoEvent.b(android.os.Looper.getMainLooper());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByRevokeMsg delete result:%s", java.lang.Boolean.valueOf(update));
        } else {
            rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
            Bi.getClass();
            update = Bi.update(z07.systemRowid, z07);
            com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByRevokeMsg updateGroupTodo result:%s", java.lang.Boolean.valueOf(update));
        }
        if (update) {
            Li.s3("");
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.getMsgId(), Li, true);
        }
        return new android.util.Pair(java.lang.Boolean.TRUE, Li.X1());
    }

    public static void h(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, int i18, int i19, kn.i0 i0Var) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, true);
        if (z17) {
            k0Var.r(context.getString(com.tencent.mm.R.string.aym), 17, i65.a.b(context, 14), null);
        } else {
            k0Var.r(context.getString(com.tencent.mm.R.string.ayl), 17, i65.a.b(context, 14), null);
        }
        k0Var.Z1 = true;
        k0Var.f211872n = new kn.f0(z17, context);
        k0Var.f211881s = new kn.g0(i0Var, z17, i17, str, i18, i19, str2, str3);
        k0Var.f211854d = new kn.h0(i17, str, i18, z17, i19, str2, str3);
        k0Var.v();
    }

    public static boolean i(rn.c cVar) {
        cVar.field_state = 2;
        cVar.field_updatetime = c01.id.c();
        rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
        Bi.getClass();
        return Bi.update(cVar.systemRowid, cVar);
    }

    public static boolean j(rn.c cVar) {
        cVar.field_state = 1;
        cVar.field_updatetime = c01.id.c();
        rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
        Bi.getClass();
        return Bi.update(cVar.systemRowid, cVar);
    }
}
