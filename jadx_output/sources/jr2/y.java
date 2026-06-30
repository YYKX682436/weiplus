package jr2;

/* loaded from: classes4.dex */
public final class y implements vg3.q4 {
    @Override // vg3.q4
    public com.tencent.mm.modelbase.q0 k7(java.lang.String str, java.util.Map values, com.tencent.mm.modelbase.p0 addMsgInfo) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        if (kotlin.jvm.internal.o.b(str, "FINDER_MENTION_LIST_INTERACTION_JUMP_CONFIG")) {
            r45.et5 et5Var = new r45.et5();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            com.tencent.mars.xlog.Log.i("Finder.FinderMentionListInteractionJumpConsumer", "msg values: " + values);
            java.lang.String str2 = ".sysmsg.RewardTipsInfoList.rewardTipsInfos";
            int i17 = 1;
            while (values.containsKey(str2)) {
                com.tencent.mars.xlog.Log.i("Finder.FinderMentionListInteractionJumpConsumer", "prefix: " + str2);
                r45.dt5 dt5Var = new r45.dt5();
                for (java.util.Map.Entry entry : values.entrySet()) {
                    java.lang.String str3 = (java.lang.String) entry.getKey();
                    java.lang.String str4 = (java.lang.String) entry.getValue();
                    if (r26.i0.A(str3, str2 + ".triggerType", false, 2, null)) {
                        dt5Var.getList(0).add(java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1(str4, 0)));
                    }
                }
                dt5Var.set(1, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(str2 + ".jumpType"), 0)));
                dt5Var.set(2, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(str2 + ".showType"), 0)));
                dt5Var.set(3, com.tencent.mm.sdk.platformtools.t8.z1((java.lang.String) values.get(str2 + ".h5Link"), new java.lang.Object[0]));
                dt5Var.set(4, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.E1((java.lang.String) values.get(str2 + ".expireTime"))));
                linkedList.add(dt5Var);
                com.tencent.mars.xlog.Log.i("Finder.FinderMentionListInteractionJumpConsumer", "RewardTipsInfo, index: " + i17 + ", triggerType: " + dt5Var.getList(0) + ", jumpType: " + dt5Var.getInteger(1) + ", showType: " + dt5Var.getInteger(2) + ", link: " + dt5Var.getString(3) + ", expireTime: " + dt5Var.getLong(4));
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".sysmsg.RewardTipsInfoList.rewardTipsInfos");
                sb6.append(i17);
                str2 = sb6.toString();
                i17++;
            }
            et5Var.set(0, linkedList);
            com.tencent.mars.xlog.Log.i("Finder.FinderMentionListInteractionJumpConsumer", "transXmlToFinderKeyWordsJumpConfigMsg: " + et5Var);
            if (et5Var.getList(0).size() > 0) {
                try {
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MENTION_LIST_INTERACTION_JUMP_STRING_SYNC, com.tencent.mm.sdk.platformtools.t8.l(et5Var.toByteArray()));
                } catch (java.lang.Exception unused) {
                }
            } else {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_MENTION_LIST_INTERACTION_JUMP_STRING_SYNC, "");
            }
        }
        return null;
    }
}
