package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public abstract class o2 {
    public static long a() {
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_MULTITALK_DISABLE_TIME_INT_SYNC;
        int intValue = ((java.lang.Integer) c17.m(u3Var, -1)).intValue();
        com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_MULTITALK_DISABLE_TIMESTAMP_LONG_SYNC;
        long longValue = ((java.lang.Long) c18.m(u3Var2, -1L)).longValue();
        com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.USERINFO_MULTITALK_CLEAR_DISABLE_TIMESTAMP_BOOLEAN_SYNC;
        boolean o17 = c19.o(u3Var3, true);
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTalkUtil", "checkMultiTalkAvailable, clear:%s, disableTime: %s, disableTimestamp: %s", java.lang.Boolean.valueOf(o17), java.lang.Integer.valueOf(intValue), java.lang.Long.valueOf(longValue));
        if (o17 || intValue <= 0 || longValue <= 0) {
            gm0.j1.u().c().x(u3Var, -1);
            gm0.j1.u().c().x(u3Var2, -1L);
            gm0.j1.u().c().x(u3Var3, java.lang.Boolean.FALSE);
            return 0L;
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - longValue;
        long j17 = intValue * 1000;
        if (currentTimeMillis <= j17) {
            return j17 - currentTimeMillis;
        }
        gm0.j1.u().c().x(u3Var, -1);
        gm0.j1.u().c().x(u3Var2, -1L);
        return 0L;
    }

    public static java.lang.String b(com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup) {
        if (multiTalkGroup == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("->[usernamelist]");
        java.util.List<com.tencent.mm.modeltalkroom.MultiTalkGroupMember> list = multiTalkGroup.f71611i;
        if (list != null) {
            for (com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember : list) {
                stringBuffer.append(multiTalkGroupMember.f71612d + "|");
                stringBuffer.append(multiTalkGroupMember.f71614f + ", ");
            }
        }
        stringBuffer.append(" ->createname:" + multiTalkGroup.f71610h);
        stringBuffer.append(" ->talkgroupId:" + multiTalkGroup.f71606d);
        stringBuffer.append(" ->wxGroupId:" + multiTalkGroup.f71608f);
        return stringBuffer.toString();
    }

    public static com.tencent.mm.plugin.multitalk.model.n2 c() {
        return com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a) ? com.tencent.mm.plugin.multitalk.model.n2.WIFI : com.tencent.mars.comm.NetStatusUtil.is4G(com.tencent.mm.sdk.platformtools.x2.f193071a) ? com.tencent.mm.plugin.multitalk.model.n2._4G : (com.tencent.mars.comm.NetStatusUtil.is3G(com.tencent.mm.sdk.platformtools.x2.f193071a) || com.tencent.mars.comm.NetStatusUtil.is2G(com.tencent.mm.sdk.platformtools.x2.f193071a)) ? com.tencent.mm.plugin.multitalk.model.n2._3GOr_2G : com.tencent.mm.plugin.multitalk.model.n2.None;
    }

    public static java.lang.String d(com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup) {
        java.lang.String str = null;
        for (int i17 = 0; i17 < multiTalkGroup.f71611i.size(); i17++) {
            if (((com.tencent.mm.modeltalkroom.MultiTalkGroupMember) multiTalkGroup.f71611i.get(i17)).f71612d.equals(c01.z1.r())) {
                str = ((com.tencent.mm.modeltalkroom.MultiTalkGroupMember) multiTalkGroup.f71611i.get(i17)).f71613e;
            }
        }
        return str;
    }

    public static java.lang.String e(com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup) {
        if (multiTalkGroup == null) {
            return "";
        }
        java.lang.String str = multiTalkGroup.f71606d;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = multiTalkGroup.f71607e;
        }
        return str == null ? "" : str;
    }

    public static boolean f(com.tencent.mm.modeltalkroom.MultiTalkGroup multiTalkGroup) {
        if (multiTalkGroup == null) {
            return false;
        }
        boolean z17 = false;
        boolean z18 = false;
        for (com.tencent.mm.modeltalkroom.MultiTalkGroupMember multiTalkGroupMember : multiTalkGroup.f71611i) {
            if (multiTalkGroupMember.f71612d.equals(c01.z1.r())) {
                if (multiTalkGroupMember.f71614f != 10) {
                    continue;
                } else {
                    if (z18) {
                        return true;
                    }
                    z17 = true;
                }
            } else if (multiTalkGroupMember.f71614f != 10) {
                continue;
            } else {
                if (z17) {
                    return true;
                }
                z18 = true;
            }
        }
        return false;
    }

    public static boolean g(int i17) {
        return i17 == 2 || i17 == 3;
    }
}
