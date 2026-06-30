package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes12.dex */
class ZIDL_VE9_HaSDB extends com.tencent.wechat.zidl2.ZidlBaseBridge implements com.tencent.wechat.aff.ilink_stream.q {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.wechat.aff.ilink_stream.r f217212a;

    private native void ZIDL_AX(long j17, long j18, int i17);

    public void ZIDL_AV(long j17) {
        zv5.a aVar = (zv5.a) this.f217212a;
        aVar.getClass();
        com.tencent.wechat.zlog.Zlog.c("IlinkStreamPlatformCommon", "getCurrentNetworkTypeAsync called", new java.lang.Object[0]);
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) zv5.a.f476483b.getSystemService("connectivity");
        com.tencent.wechat.aff.ilink_stream.w wVar = com.tencent.wechat.aff.ilink_stream.w.kStreamNetworkTypeUnknown;
        if (connectivityManager == null) {
            aVar.a(j17, wVar);
            return;
        }
        android.net.NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            aVar.a(j17, wVar);
            return;
        }
        try {
            int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    aVar.a(j17, com.tencent.wechat.aff.ilink_stream.w.kStreamNetworkTypeWiFi);
                } else if (type != 2 && type != 3 && type != 4 && type != 5) {
                    aVar.a(j17, com.tencent.wechat.aff.ilink_stream.w.kStreamNetworkTypeEthernet);
                }
            }
            aVar.a(j17, com.tencent.wechat.aff.ilink_stream.w.kStreamNetworkTypeCellular);
        } catch (java.lang.Exception unused) {
            aVar.a(j17, wVar);
        }
    }

    @Override // com.tencent.wechat.zidl2.ZidlBaseBridge
    public void attachStub(java.lang.Object obj) {
        com.tencent.wechat.aff.ilink_stream.r rVar = (com.tencent.wechat.aff.ilink_stream.r) obj;
        this.f217212a = rVar;
        ((zv5.a) rVar).f476484a = this;
    }

    @Override // com.tencent.wechat.aff.ilink_stream.q
    public void l0(long j17, com.tencent.wechat.aff.ilink_stream.w wVar) {
        ZIDL_AX(this.nativeHandler, j17, wVar.f217330d);
    }
}
