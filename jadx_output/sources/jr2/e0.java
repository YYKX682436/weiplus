package jr2;

/* loaded from: classes8.dex */
public final class e0 implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map values, com.tencent.mm.modelbase.p0 addMsgInfo) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        if (!kotlin.jvm.internal.o.b(str, "FinderHotWordsJumpMsg")) {
            return null;
        }
        ((c61.l7) i95.n0.c(c61.l7.class)).qk().z0(false);
        r45.sb1 sb1Var = new r45.sb1();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mars.xlog.Log.i("Finder.FinderSnsKeyWordsJumpConsumer", "msg values: " + values);
        int i17 = 1;
        java.lang.String str2 = ".sysmsg.msg.infos";
        while (values.containsKey(str2)) {
            com.tencent.mars.xlog.Log.i("Finder.FinderSnsKeyWordsJumpConsumer", "prefix: " + str2);
            r45.tb1 tb1Var = new r45.tb1();
            tb1Var.set(0, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(str2 + ".start_time"), 0)));
            tb1Var.set(1, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(str2 + ".end_time"), 0)));
            tb1Var.set(2, (java.lang.String) values.get(str2 + ".key_word"));
            r45.rb1 rb1Var = new r45.rb1();
            rb1Var.set(0, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(str2 + ".jump_info.jump_dest"), 0)));
            rb1Var.set(1, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(str2 + ".jump_info.jump_scene"), 0)));
            rb1Var.set(2, (java.lang.String) values.get(str2 + ".jump_info.jump_bypass_info"));
            tb1Var.set(3, rb1Var);
            linkedList.add(tb1Var);
            str2 = ".sysmsg.msg.infos" + i17;
            i17++;
        }
        sb1Var.set(0, linkedList);
        com.tencent.mars.xlog.Log.i("Finder.FinderSnsKeyWordsJumpConsumer", "transXmlToFinderKeyWordsJumpConfigMsg: " + sb1Var);
        java.util.LinkedList list = sb1Var.getList(0);
        if (list == null || list.isEmpty()) {
            ((c61.l7) i95.n0.c(c61.l7.class)).qk().z0(true);
            return null;
        }
        java.util.LinkedList<r45.tb1> list2 = sb1Var.getList(0);
        if (list2 != null) {
            long j17 = 1;
            for (r45.tb1 tb1Var2 : list2) {
                com.tencent.mm.plugin.finder.storage.fj0 fj0Var = new com.tencent.mm.plugin.finder.storage.fj0();
                long j18 = j17 + 1;
                fj0Var.field_localId = j17;
                r45.rb1 rb1Var2 = (r45.rb1) tb1Var2.getCustom(3);
                fj0Var.field_jumpScene = rb1Var2 != null ? rb1Var2.getInteger(1) : -1;
                r45.rb1 rb1Var3 = (r45.rb1) tb1Var2.getCustom(3);
                fj0Var.field_jumpDest = rb1Var3 != null ? rb1Var3.getInteger(0) : -1;
                fj0Var.field_startTime = tb1Var2.getInteger(0);
                fj0Var.field_endTime = tb1Var2.getInteger(1);
                fj0Var.field_keyWord = tb1Var2.getString(2);
                r45.rb1 rb1Var4 = (r45.rb1) tb1Var2.getCustom(3);
                fj0Var.field_passByInfo = rb1Var4 != null ? rb1Var4.getString(2) : null;
                ((c61.l7) i95.n0.c(c61.l7.class)).qk().y0(fj0Var);
                j17 = j18;
            }
        }
        ((c61.l7) i95.n0.c(c61.l7.class)).qk().doNotify("SnsHotWord add data");
        return null;
    }
}
