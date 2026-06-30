package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public abstract class v1 {
    public static boolean a(java.lang.String str, android.content.Context context, com.tencent.mm.ui.MMFragment mMFragment, java.lang.String str2) {
        com.tencent.mm.ui.chatting.t1 u1Var;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (str.startsWith("weixin://openNativeUrl/weixinHB")) {
            u1Var = new com.tencent.mm.ui.chatting.r1();
        } else {
            if (str.startsWith("weixin://openNativeUrl/myDeviceList") || str.startsWith("weixin://openNativeUrl/bindMyDevice")) {
                u1Var = new com.tencent.mm.ui.chatting.s1();
            } else {
                u1Var = str.startsWith("weixin://wesport/recommend") || str.startsWith("weixin://openNativeUrl/rankMyHomepage") || str.startsWith("weixin://openNativeUrl/rankSetting") ? new com.tencent.mm.ui.chatting.u1() : null;
            }
        }
        return u1Var != null && u1Var.a(str, context, mMFragment, str2);
    }
}
