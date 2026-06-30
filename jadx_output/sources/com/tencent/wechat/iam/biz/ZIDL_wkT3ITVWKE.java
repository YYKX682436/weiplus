package com.tencent.wechat.iam.biz;

/* loaded from: classes4.dex */
class ZIDL_wkT3ITVWKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217737a = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_EI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217737a;
        com.tencent.wechat.zlog.Zlog.a("IamBizNativeToCppManagerKE", "onNotifyMessageEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("IamBizNativeToCppManagerKE", "onNotifyMessageEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }
}
