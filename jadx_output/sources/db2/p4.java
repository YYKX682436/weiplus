package db2;

/* loaded from: classes10.dex */
public final class p4 extends com.tencent.mm.modelbase.i {
    public p4(java.util.LinkedList userList) {
        kotlin.jvm.internal.o.g(userList, "userList");
        r45.q91 q91Var = new r45.q91();
        q91Var.set(1, db2.t4.f228171a.a(6688));
        q91Var.set(2, userList);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = q91Var;
        r45.r91 r91Var = new r45.r91();
        r91Var.set(0, new r45.ie());
        lVar.f70665b = r91Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetprivatemsgcontactextinfolist";
        lVar.f70667d = 6688;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Cgi.CgiPrivateMsgContactExtInfo", "CgiPrivateMsgContactExtInfo init userNameList.size = " + userList.size());
    }

    @Override // com.tencent.mm.modelbase.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        java.lang.Object obj;
        java.util.LinkedList list;
        r45.r91 r91Var = (r45.r91) fVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(", resp: ");
        if (r91Var == null || (obj = pm0.b0.b(r91Var)) == null) {
            obj = " null";
        }
        sb6.append(obj);
        com.tencent.mars.xlog.Log.i("Cgi.CgiPrivateMsgContactExtInfo", sb6.toString());
        if (i17 == 0 && i18 == 0) {
            if (r91Var != null) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_ENTER_PERSONAL_MSG_REFRESH_INTERVAL_INT_SYNC, java.lang.Integer.valueOf(r91Var.getInteger(2)));
            }
            if (r91Var == null || (list = r91Var.getList(1)) == null) {
                return;
            }
            int i19 = 0;
            for (java.lang.Object obj2 : list) {
                int i27 = i19 + 1;
                if (i19 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.ar2 ar2Var = (r45.ar2) obj2;
                zy2.dc fj6 = ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).fj(ar2Var.getString(0));
                if (!(fj6 instanceof ya2.b2)) {
                    fj6 = null;
                }
                ya2.b2 b2Var = fj6 != null ? (ya2.b2) fj6 : null;
                if (b2Var != null) {
                    r45.zl1 zl1Var = new r45.zl1();
                    zl1Var.set(0, ar2Var.getList(1));
                    r45.zl1 zl1Var2 = b2Var.field_badgeInfoList;
                    byte[] byteArray = zl1Var2 != null ? zl1Var2.toByteArray() : null;
                    if (byteArray == null) {
                        byteArray = new byte[0];
                    }
                    if (!com.tencent.mm.sdk.platformtools.w2.b(byteArray).equals(com.tencent.mm.sdk.platformtools.w2.b(zl1Var.toByteArray())) || b2Var.field_rewardTotalAmountInWecoin != ar2Var.getLong(2) || b2Var.field_interactionCount != ar2Var.getLong(3) || b2Var.field_follow_Flag != ar2Var.getInteger(4) || b2Var.field_is_my_member != ar2Var.getBoolean(5)) {
                        b2Var.field_badgeInfoList = zl1Var;
                        b2Var.field_personalMsgUpdateTime = c01.id.c();
                        b2Var.field_rewardTotalAmountInWecoin = ar2Var.getLong(2);
                        b2Var.field_interactionCount = ar2Var.getLong(3);
                        b2Var.field_follow_Flag = ar2Var.getInteger(4);
                        b2Var.field_is_my_member = ar2Var.getBoolean(5);
                        ((com.tencent.mm.plugin.finder.service.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).oj(b2Var);
                    }
                }
                i19 = i27;
            }
        }
    }
}
