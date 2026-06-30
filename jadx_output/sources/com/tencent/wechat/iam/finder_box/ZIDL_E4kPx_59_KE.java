package com.tencent.wechat.iam.finder_box;

/* loaded from: classes11.dex */
class ZIDL_E4kPx_59_KE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217815a = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_BI(int i17, com.tencent.wechat.zidl2.ZidlObjHolder2 zidlObjHolder2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217815a;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListManagerKE", "onSpecialPlayListChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListManagerKE", "onSpecialPlayListChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            if (i17 == 0 || i17 == 1 || i17 != 2) {
            }
            throw null;
        }
    }
}
