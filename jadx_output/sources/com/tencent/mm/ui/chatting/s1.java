package com.tencent.mm.ui.chatting;

/* loaded from: classes.dex */
public final class s1 implements com.tencent.mm.ui.chatting.t1 {
    @Override // com.tencent.mm.ui.chatting.t1
    public boolean a(java.lang.String str, android.content.Context context, com.tencent.mm.ui.MMFragment mMFragment, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (!str.startsWith("weixin://openNativeUrl/myDeviceList")) {
            str.startsWith("weixin://openNativeUrl/bindMyDevice");
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("device_brand_name", str2);
        j45.l.j(context, "exdevice", ".ui.ExdeviceManageDeviceUI", intent, null);
        return true;
    }
}
