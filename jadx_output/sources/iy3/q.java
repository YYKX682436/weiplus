package iy3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Liy3/q;", "Lcom/tencent/mm/ipcinvoker/k0;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Landroid/os/Bundle;", "<init>", "()V", "feature-exdevice_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class q implements com.tencent.mm.ipcinvoker.k0 {
    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String string;
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCSyncInvokeTask_GetBindInfo", "invoke GetBindInfo");
        ((my3.q) ((fy3.e) i95.n0.c(fy3.e.class))).getClass();
        android.content.SharedPreferences sharedPreferences = com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e() + "_rtos_account", 0);
        java.lang.String str2 = "";
        if (sharedPreferences == null || (str = sharedPreferences.getString(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC, "")) == null) {
            str = "";
        }
        if (sharedPreferences != null && (string = sharedPreferences.getString(dm.i4.COL_USERNAME, "")) != null) {
            str2 = string;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_MAC, str);
        bundle.putString(dm.i4.COL_USERNAME, str2);
        return bundle;
    }
}
