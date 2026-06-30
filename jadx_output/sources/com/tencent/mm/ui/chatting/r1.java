package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public final class r1 implements com.tencent.mm.ui.chatting.t1 {
    @Override // com.tencent.mm.ui.chatting.t1
    public boolean a(java.lang.String str, android.content.Context context, com.tencent.mm.ui.MMFragment mMFragment, java.lang.String str2) {
        if (str.startsWith("weixin://openNativeUrl/weixinHB/startsendnormalhbrequest")) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_type", 0);
            ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
            j45.l.j(context, "luckymoney", ".ui.LuckyMoneyNewPrepareUI", intent, null);
            return true;
        }
        if (str.startsWith("weixin://openNativeUrl/weixinHB/startsendrandomhbrequest")) {
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("key_type", 1);
            ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).bj();
            j45.l.j(context, "luckymoney", ".ui.LuckyMoneyNewPrepareUI", intent2, null);
            return true;
        }
        if (str.startsWith("weixin://openNativeUrl/weixinHB/startsendhblistrequest")) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("key_type", 1);
            j45.l.j(context, "luckymoney", ".ui.LuckyMoneyMyRecordUI", intent3, null);
            return true;
        }
        if (str.startsWith("weixin://openNativeUrl/weixinHB/startreceivehblistrequest")) {
            android.content.Intent intent4 = new android.content.Intent();
            intent4.putExtra("key_type", 2);
            j45.l.j(context, "luckymoney", ".ui.LuckyMoneyMyRecordUI", intent4, null);
            return true;
        }
        if (str.startsWith("weixin://openNativeUrl/weixinHB/openDetail")) {
            android.content.Intent intent5 = new android.content.Intent();
            intent5.putExtra("key_native_url", str);
            j45.l.j(context, "luckymoney", ".ui.LuckyMoneyBeforeDetailUI", intent5, null);
            return true;
        }
        if (!str.startsWith("weixin://openNativeUrl/weixinHB/startreceivebizhbrequest")) {
            return false;
        }
        android.content.Intent intent6 = new android.content.Intent();
        intent6.putExtra("key_way", 5);
        intent6.putExtra("key_native_url", str);
        intent6.putExtra("key_static_from_scene", 1);
        j45.l.j(context, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", intent6, null);
        return true;
    }
}
