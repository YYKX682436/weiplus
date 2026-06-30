package com.tencent.wechat.aff.ovc;

/* loaded from: classes4.dex */
class ZIDL_cLTOhFK1K {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217455a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217456b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217457c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217458d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217459e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217460f = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217461g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217462h = new java.util.concurrent.ConcurrentHashMap();

    static {
        new java.util.concurrent.atomic.AtomicLong(0L);
    }

    private void ZIDL_CI(java.lang.String[] strArr, java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217455a;
        com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onDisplayContactEndEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onDisplayContactEndEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            com.tencent.wechat.zidl2.ZidlUtil.stringArrayToList(strArr);
            throw null;
        }
    }

    private void ZIDL_DI(java.lang.String str, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217456b;
        com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onSendMsgEndEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onSendMsgEndEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_EI(java.lang.String str, int i17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217457c;
        com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onAskConfirmVoipCallEndEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onAskConfirmVoipCallEndEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_FI(int i17, boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217458d;
        com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onMakeVoipEndEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onMakeVoipEndEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_GI(java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217459e;
        com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onStartMsgTypingEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onStartMsgTypingEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_HI(java.lang.String str, java.lang.String str2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217460f;
        com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onAskConfirmSendMsgEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onAskConfirmSendMsgEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_II() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217461g;
        com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onCancelSessionEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onCancelSessionEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_JI(long j17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217462h;
        com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onReportContactSearchCostEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("OVCFunctionCallEventStubK", "onReportContactSearchCostEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    public static native void ZIDL_cLTOhFK1D(long j17, java.lang.String str, java.lang.String str2);

    public native void ZIDL_B(long j17);

    public native void ZIDL_cLTOhFK1C(java.lang.Object obj, java.lang.String str, java.lang.String str2, java.lang.Object obj2);
}
