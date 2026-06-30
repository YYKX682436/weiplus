package ha4;

/* loaded from: classes4.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f279998a = new java.lang.ThreadLocal();

    public static boolean a(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        boolean b17 = b(snsInfo, com.tencent.mm.plugin.sns.model.s5.e(snsInfo));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return b17;
    }

    public static boolean b(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return true;
        }
        r45.kj4 postInfo = snsInfo.getPostInfo();
        if (snsInfo.getTypeFlag() != 21) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return true;
        }
        if (postInfo.D == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return true;
        }
        if (c01.z1.r().equals(snsInfo.getUserName())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return true;
        }
        r45.da6 da6Var = snsObject.SnsRedEnvelops;
        if (da6Var != null) {
            java.util.LinkedList linkedList = da6Var.f372275e;
            if (linkedList == null || linkedList.size() == 0) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                return false;
            }
            java.lang.String r17 = c01.z1.r();
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (r17.equals(((r45.b96) it.next()).f370639d)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                    return true;
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return false;
    }

    public static boolean c(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(str);
        boolean b17 = b(k17, com.tencent.mm.plugin.sns.model.s5.e(k17));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("canISeePhoto", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return b17;
    }

    public static int d(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        int i17 = 0;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        } else {
            com.tencent.mm.protocal.protobuf.SnsObject e17 = com.tencent.mm.plugin.sns.model.s5.e(snsInfo);
            if (e17 == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            } else {
                r45.da6 da6Var = e17.SnsRedEnvelops;
                if (da6Var != null) {
                    java.util.LinkedList linkedList = da6Var.f372275e;
                    if (linkedList.size() != 0) {
                        i17 = linkedList.size();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
                    }
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalCount", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return i17;
    }

    public static long e(com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.SnsObject snsObject) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        long j17 = 0;
        if (snsInfo == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return 0L;
        }
        if (snsObject == null) {
            snsObject = com.tencent.mm.plugin.sns.model.s5.e(snsInfo);
        }
        if (snsObject == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return 0L;
        }
        r45.da6 da6Var = snsObject.SnsRedEnvelops;
        if (da6Var == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return 0L;
        }
        java.util.LinkedList<r45.b96> linkedList = da6Var.f372275e;
        if (linkedList == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return 0L;
        }
        java.lang.String str = snsInfo.contentByteMd5;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = kk.k.g(snsInfo.field_content) + kk.k.g(snsInfo.field_attrBuf);
        }
        java.lang.ThreadLocal threadLocal = f279998a;
        java.util.HashMap hashMap = (java.util.HashMap) threadLocal.get();
        if (hashMap != null && hashMap.containsKey(str)) {
            long longValue = ((java.lang.Long) hashMap.get(str)).longValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
            return longValue;
        }
        for (r45.b96 b96Var : linkedList) {
            r45.vv3 vv3Var = new r45.vv3();
            try {
                vv3Var.parseFrom(x51.j1.d(b96Var.f370641f));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicrMsg.SnsLuckyUtil", e17.getMessage() + "hbBuffer is error");
            }
            j17 += vv3Var.f388604d;
        }
        if (hashMap == null) {
            hashMap = new java.util.HashMap();
        }
        hashMap.put(str, java.lang.Long.valueOf(j17));
        threadLocal.set(hashMap);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTotalMoney", "com.tencent.mm.plugin.sns.lucky.model.SnsLuckyUtil");
        return j17;
    }
}
