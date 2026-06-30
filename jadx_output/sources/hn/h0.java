package hn;

@j95.b
/* loaded from: classes13.dex */
public class h0 extends i95.w implements vg3.h4 {
    public void Ai(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19) {
        if (com.tencent.mm.storage.z3.N4(str) && c01.e2.V(str)) {
            int i27 = c01.e2.T(str) ? 2 : 1;
            com.tencent.mm.autogen.mmdata.rpt.RoomTodoShareStruct roomTodoShareStruct = new com.tencent.mm.autogen.mmdata.rpt.RoomTodoShareStruct();
            roomTodoShareStruct.f60111d = roomTodoShareStruct.b("roomid", str, true);
            roomTodoShareStruct.f60112e = i27;
            roomTodoShareStruct.f60113f = roomTodoShareStruct.b("appid", str2, true);
            roomTodoShareStruct.f60114g = roomTodoShareStruct.b("appname", str3, true);
            roomTodoShareStruct.f60115h = i17;
            roomTodoShareStruct.f60116i = i18;
            roomTodoShareStruct.f60117j = i19;
            roomTodoShareStruct.k();
        }
    }

    public void wi(java.lang.String str, long j17) {
        boolean z17;
        android.database.Cursor E;
        boolean z18;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        if (Li.getMsgId() == j17) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(Li.X1())) {
                return;
            }
            java.lang.String X1 = Li.X1();
            rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(str, X1);
            if (z07 != null) {
                z18 = kn.j0.i(z07);
                java.util.Iterator it = ((java.util.ArrayList) z07.S).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(str, ((java.lang.Long) it.next()).longValue());
                    o27.s3("");
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o27.getMsgId(), o27, true);
                }
                com.tencent.mm.autogen.events.NotifyGroupTodoEvent notifyGroupTodoEvent = new com.tencent.mm.autogen.events.NotifyGroupTodoEvent();
                am.ql qlVar = notifyGroupTodoEvent.f54545g;
                qlVar.f7715a = 1;
                qlVar.f7717c = X1;
                qlVar.f7716b = str;
                notifyGroupTodoEvent.b(android.os.Looper.getMainLooper());
            } else {
                z18 = false;
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = z07 != null ? z07.field_todoid : "null";
            objArr[1] = java.lang.Boolean.valueOf(z18);
            com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.RoomTodoService", "deleteChatroomInfoTodo delete(%s) result:%s", objArr);
            return;
        }
        rn.e Bi = ((nn.j) i95.n0.c(nn.j.class)).Bi();
        Bi.getClass();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (E = Bi.f397602d.E("GroupTodo", rn.c.T.f316954c, "roomname=? and username=? and state!=?", new java.lang.String[]{str, "roomannouncement@app.origin", "2"}, null, null, null)) != null) {
            try {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                while (E.moveToNext()) {
                    rn.c cVar = new rn.c();
                    cVar.convertFrom(E);
                    arrayList.add(cVar);
                }
                r6 = arrayList.size() != 0 ? (rn.c) arrayList.get(0) : null;
            } finally {
                E.close();
            }
        }
        if (r6 != null) {
            z17 = kn.j0.i(r6);
            com.tencent.mm.autogen.events.NotifyGroupTodoEvent notifyGroupTodoEvent2 = new com.tencent.mm.autogen.events.NotifyGroupTodoEvent();
            am.ql qlVar2 = notifyGroupTodoEvent2.f54545g;
            qlVar2.f7715a = 1;
            qlVar2.f7717c = r6.field_todoid;
            qlVar2.f7716b = str;
            notifyGroupTodoEvent2.b(android.os.Looper.getMainLooper());
        } else {
            z17 = false;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[3];
        objArr2[0] = r6 != null ? r6.field_todoid : "null";
        objArr2[1] = str;
        objArr2[2] = java.lang.Boolean.valueOf(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.RoomTodoService", "deleteChatroomAtAllTodo delete(%s) roomname:%s result:%s", objArr2);
    }
}
