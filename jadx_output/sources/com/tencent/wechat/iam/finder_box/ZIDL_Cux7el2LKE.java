package com.tencent.wechat.iam.finder_box;

/* loaded from: classes11.dex */
class ZIDL_Cux7el2LKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217807a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217808b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217809c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217810d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217811e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217812f = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_GBI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217807a;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListKE", "onTapeItemUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListKE", "onTapeItemUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_HBI(byte[] bArr, byte[] bArr2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217808b;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListKE", "onTingItemUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListKE", "onTingItemUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            bw5.lp0 lp0Var = bw5.lp0.f29890v;
            throw null;
        }
    }

    private void ZIDL_IBI(byte[][] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217809c;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListKE", "onItemsReloadedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListKE", "onItemsReloadedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(bw5.lp0.f29890v, bArr);
            throw null;
        }
    }

    private void ZIDL_JBI(int i17, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217810d;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListKE", "onLoadingStatusChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListKE", "onLoadingStatusChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_KBI(int i17, byte[][] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217811e;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListKE", "onLoadMoreSuccessEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListKE", "onLoadMoreSuccessEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(bw5.lp0.f29890v, bArr);
            throw null;
        }
    }

    private void ZIDL_LBI(int i17, boolean z17, int i18, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217812f;
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListKE", "onLoadErrorEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayListKE", "onLoadErrorEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
