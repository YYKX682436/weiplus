package kn;

/* loaded from: classes11.dex */
public abstract class l0 {
    public static boolean a(com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17;
        if (f9Var == null || !com.tencent.mm.storage.z3.N4(f9Var.Q0()) || (v17 = ot0.q.v(f9Var.j())) == null) {
            return false;
        }
        if (!k01.i.a(v17)) {
            if (!(v17.f348666i == 44) && !"1001".equals(v17.f348700q1)) {
                return false;
            }
        }
        return true;
    }

    public static com.tencent.mm.chatroom.storage.GroupToolItem b(com.tencent.mm.storage.f9 f9Var) {
        try {
            ot0.q v17 = ot0.q.v(f9Var.j());
            if (v17 == null) {
                return null;
            }
            com.tencent.mm.chatroom.storage.GroupToolItem groupToolItem = new com.tencent.mm.chatroom.storage.GroupToolItem();
            java.lang.String str = v17.f348673j2;
            java.lang.String str2 = "";
            if (str == null) {
                str = "";
            }
            groupToolItem.f63682d = str;
            java.lang.String str3 = v17.f348669i2;
            if (str3 != null) {
                str2 = str3;
            }
            groupToolItem.f63683e = str2;
            groupToolItem.f63684f = f9Var.getCreateTime();
            return groupToolItem;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomtools.RoomToolsHelp", "getGroupToolItemFromMsg Exception:%s %s", e17.getClass().getSimpleName(), e17.getMessage());
            return null;
        }
    }

    public static rn.h c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        rn.h y07 = ((nn.j) i95.n0.c(nn.j.class)).Di().y0(str);
        if (y07 != null) {
            return y07;
        }
        rn.h hVar = new rn.h();
        hVar.field_chatroomname = str;
        if (((nn.j) i95.n0.c(nn.j.class)).Di().insert(hVar)) {
            return ((nn.j) i95.n0.c(nn.j.class)).Di().y0(str);
        }
        return null;
    }

    public static boolean d(com.tencent.mm.storage.f9 f9Var) {
        ot0.q v17;
        return f9Var != null && f9Var.getType() == 436207665 && (v17 = ot0.q.v(f9Var.U1())) != null && "1001".equals(v17.f348700q1);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.String r4) {
        /*
            boolean r0 = com.tencent.mm.storage.z3.N4(r4)
            if (r0 == 0) goto L5c
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.K0(r4)
            r1 = 0
            if (r0 != 0) goto L36
            java.lang.Class<nn.j> r0 = nn.j.class
            i95.m r2 = i95.n0.c(r0)
            nn.j r2 = (nn.j) r2
            rn.i r2 = r2.Di()
            rn.h r2 = r2.y0(r4)
            if (r2 == 0) goto L37
            int r3 = r2.field_queryState
            if (r3 == 0) goto L37
            r2.field_queryState = r1
            i95.m r0 = i95.n0.c(r0)
            nn.j r0 = (nn.j) r0
            rn.i r0 = r0.Di()
            java.lang.String[] r3 = new java.lang.String[r1]
            boolean r0 = r0.update(r2, r3)
            goto L38
        L36:
            r2 = 0
        L37:
            r0 = r1
        L38:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            if (r4 != 0) goto L3f
            java.lang.String r4 = ""
        L3f:
            r3[r1] = r4
            if (r2 != 0) goto L47
            java.lang.String r4 = "null"
            goto L4a
        L47:
            java.lang.String r4 = "not_null"
        L4a:
            r1 = 1
            r3[r1] = r4
            r4 = 2
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3[r4] = r0
            java.lang.String r4 = "MicroMsg.roomtools.RoomToolsHelp"
            java.lang.String r0 = "resetGroupToolsByTalker roomName:%s groupTools:%s result:%s"
            com.tencent.mars.xlog.Log.i(r4, r0, r3)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kn.l0.e(java.lang.String):void");
    }
}
