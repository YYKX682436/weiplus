package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
class ZIDL_MvRZB14SLKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217714a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217715b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217716c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217717d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217718e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217719f = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_IBI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217714a;
        com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListKE", "onTapeItemUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListKE", "onTapeItemUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_JBI(byte[] bArr, byte[] bArr2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217715b;
        com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListKE", "onTingItemUpdatedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListKE", "onTingItemUpdatedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            bw5.lp0 lp0Var = bw5.lp0.f29890v;
            throw null;
        }
    }

    private void ZIDL_KBI(byte[][] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217716c;
        com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListKE", "onItemsReloadedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListKE", "onItemsReloadedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(bw5.lp0.f29890v, bArr);
            throw null;
        }
    }

    private void ZIDL_LBI(int i17, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217717d;
        com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListKE", "onLoadingStatusChangedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListKE", "onLoadingStatusChangedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_MBI(int i17, byte[][] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217718e;
        com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListKE", "onLoadMoreSuccessEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListKE", "onLoadMoreSuccessEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            com.tencent.wechat.zidl2.ZidlUtil.mmpbListUnSerializeFromBasic(bw5.lp0.f29890v, bArr);
            throw null;
        }
    }

    private void ZIDL_NBI(int i17, boolean z17, int i18, byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217719f;
        com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListKE", "onLoadErrorEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayListKE", "onLoadErrorEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }
}
