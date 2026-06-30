package com.tencent.wechat.iam.finder_box;

/* loaded from: classes8.dex */
class ZIDL_D39_TNmwpKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217813a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217814b = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_NI(byte[][] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217813a;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizProfileNativeToCppManagerKE", "onOutboxMessagesUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizProfileNativeToCppManagerKE", "onOutboxMessagesUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(r45.e6.f373037f, bArr);
            throw null;
        }
    }

    private void ZIDL_PI(byte[][] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217814b;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizProfileNativeToCppManagerKE", "onProfileMessagesUpdatedNotifyEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizProfileNativeToCppManagerKE", "onProfileMessagesUpdatedNotifyEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(r45.s5.f385508o, bArr);
            throw null;
        }
    }
}
