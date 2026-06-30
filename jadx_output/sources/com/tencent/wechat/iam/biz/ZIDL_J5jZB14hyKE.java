package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
class ZIDL_J5jZB14hyKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217713a = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_BI(int i17, com.tencent.wechat.zidl2.ZidlObjHolder2 zidlObjHolder2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217713a;
        com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListManagerKE", "onSpecialPlayListChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListManagerKE", "onSpecialPlayListChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            if (i17 == 0 || i17 == 1 || i17 != 2) {
            }
            throw null;
        }
    }
}
