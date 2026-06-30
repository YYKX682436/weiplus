package com.tencent.wechat.aff.ilink_stream;

/* loaded from: classes5.dex */
public class i extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f217290a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f217291b;

    /* renamed from: c, reason: collision with root package name */
    public long f217292c;

    public i(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("IlinkStreamChannel.Destructor", "constructor IlinkStreamChannel Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("IlinkStreamChannel.Destructor", "destructor IlinkStreamChannel Destructor() id:" + this.f217290a + "svrid: " + this.f217291b, new java.lang.Object[0]);
        com.tencent.wechat.aff.ilink_stream.ZIDL_NyGFwFn1K.ZIDL_NyGFwFn1D(this.f217292c, this.f217290a, this.f217291b);
    }
}
