package iy3;

/* loaded from: classes13.dex */
public final class e implements my3.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ipcinvoker.r f295920a;

    public e(com.tencent.mm.ipcinvoker.r rVar) {
        this.f295920a = rVar;
    }

    public void a(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCASyncInvokeTask_GetLicenceInfo", "invoke GetLicenceInfo deviceId:%s json:%s", str, str2);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.IPCASyncInvokeTask_GetLicenceInfo", "invoke GetLicenceInfo deviceId:%s json:%s", str, com.tencent.mm.sdk.platformtools.t8.G1(str2));
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("licence", str2);
        bundle.putString(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, str);
        com.tencent.mm.ipcinvoker.r rVar = this.f295920a;
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}
