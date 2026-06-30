package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public final class u1 implements com.tencent.mm.ui.chatting.t1 {
    @Override // com.tencent.mm.ui.chatting.t1
    public boolean a(java.lang.String str, android.content.Context context, com.tencent.mm.ui.MMFragment mMFragment, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (str.startsWith("weixin://wesport/recommend") && mMFragment != null) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.transmit.SelectConversationUI.class);
            intent.putExtra("Select_Talker_Name", str2);
            intent.putExtra("Select_block_List", str2);
            intent.putExtra("Select_Conv_Type", 3);
            intent.putExtra("Select_Send_Card", true);
            mMFragment.startActivityForResult(intent, 224);
            return true;
        }
        if (!str.startsWith("weixin://openNativeUrl/rankMyHomepage")) {
            if (!str.startsWith("weixin://openNativeUrl/rankSetting")) {
                return false;
            }
            j45.l.h(context, "exdevice", ".ui.ExdeviceSettingUI");
            return true;
        }
        java.lang.String r17 = c01.z1.r();
        if (com.tencent.mm.sdk.platformtools.t8.K0(r17)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.BizNativeUrlDispatcher", "Get username from UserInfo return null or nil.");
            return false;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra(dm.i4.COL_USERNAME, r17);
        j45.l.j(context, "exdevice", ".ui.ExdeviceProfileUI", intent2, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizNativeUrlDispatcher", "Jump to ExdeviceProfileUI.");
        return true;
    }
}
