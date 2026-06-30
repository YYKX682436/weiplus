package n74;

/* loaded from: classes4.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final n74.n0 f335399a = new n74.n0();

    public final void a(java.lang.String str, java.util.Map values, com.tencent.mm.modelbase.p0 addMsgInfo) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onReceiveMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        int i17 = 0;
        int i18 = 0;
        while (true) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(".sysmsg.msgList.msgItem");
            sb6.append(i18 == 0 ? "" : java.lang.Integer.valueOf(i18));
            java.lang.String keyPrefix = sb6.toString();
            if (!values.containsKey(keyPrefix)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onReceiveMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
                return;
            }
            i18++;
            int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(keyPrefix + ".actionType"), i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.AdPushMsgHandler", "onReceiveMsg, msgType=" + str + ", actionType=" + D1);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
            kotlin.jvm.internal.o.g(keyPrefix, "keyPrefix");
            if (D1 == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleDelAdMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
                java.lang.String concat = keyPrefix.concat(".deleteAdInfo");
                java.lang.String str2 = (java.lang.String) values.get(concat + ".snsId");
                int D12 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(concat + ".deleteLevel"), i17);
                if (((str2 == null || str2.length() == 0) ? 1 : i17) != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AdPushMsgHandler", "handleDelAdMsg, snsId is null, deleteLevel=" + D12);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDelAdMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
                } else {
                    com.tencent.mm.plugin.sns.storage.AdSnsInfo y07 = com.tencent.mm.plugin.sns.model.l4.Vi().y0(ca4.z0.F0(str2));
                    l44.t5 b17 = l44.t5.b();
                    if (y07 == null) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AdPushMsgHandler", "handleDelAdMsg, snsId=" + str2 + ", deleteLevel=" + D12 + ", delRet=1");
                        b17.a("", str2, 6, 1);
                    } else {
                        int a17 = l44.i3.a(y07, 8, D12, "");
                        com.tencent.mars.xlog.Log.i("MicroMsg.AdPushMsgHandler", "handleDelAdMsg, snsId=" + str2 + ", deleteLevel=" + D12 + ", delRet=" + a17);
                        b17.a(y07.getAdInfo().uxInfo, str2, 6, a17);
                    }
                    b17.c();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleDelAdMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchMsg", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdPushMsgHandler");
            i17 = 0;
        }
    }
}
