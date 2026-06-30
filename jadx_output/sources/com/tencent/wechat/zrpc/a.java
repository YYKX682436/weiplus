package com.tencent.wechat.zrpc;

/* loaded from: classes15.dex */
public class a extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f220036a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f220037b;

    /* renamed from: c, reason: collision with root package name */
    public long f220038c;

    public a(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("ExtChannel.Destructor", "constructor ExtChannel Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("ExtChannel.Destructor", "destructor ExtChannel Destructor() id:" + this.f220036a + "svrid: " + this.f220037b, new java.lang.Object[0]);
        com.tencent.wechat.zrpc.ZIDL_c9_jRtgnK.ZIDL_c9_jRtgnD(this.f220038c, this.f220036a, this.f220037b);
    }
}
