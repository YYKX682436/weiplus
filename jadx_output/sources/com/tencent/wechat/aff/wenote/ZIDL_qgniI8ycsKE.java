package com.tencent.wechat.aff.wenote;

/* loaded from: classes11.dex */
class ZIDL_qgniI8ycsKE {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217674a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217675b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217676c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217677d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217678e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f217679f = new java.util.concurrent.ConcurrentHashMap();

    private void ZIDL_FI(byte[] bArr, byte[] bArr2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217674a;
        com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelperKE", "onReplaceMediaAttachmentEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelperKE", "onReplaceMediaAttachmentEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }

    private void ZIDL_RI() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217675b;
        com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelperKE", "onRecordingStartedEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelperKE", "onRecordingStartedEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_SI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217676c;
        com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelperKE", "onRecordingEndEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelperKE", "onRecordingEndEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_TI(boolean z17) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217677d;
        com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelperKE", "onVoiceInputPanelChangeVisibilityEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelperKE", "onVoiceInputPanelChangeVisibilityEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }

    private void ZIDL_UI(byte[] bArr) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217678e;
        com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelperKE", "onInsertTextToEditorEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelperKE", "onInsertTextToEditorEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8);
            throw null;
        }
    }

    private void ZIDL_VI() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f217679f;
        com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelperKE", "onNotePageEdgePopGestureBeginEvent size: " + concurrentHashMap.size(), new java.lang.Object[0]);
        java.util.Iterator it = concurrentHashMap.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelperKE", "onNotePageEdgePopGestureBeginEven name: " + ((java.lang.String) entry.getKey()), new java.lang.Object[0]);
            android.support.v4.media.f.a(entry.getValue());
            throw null;
        }
    }
}
