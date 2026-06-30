package com.tencent.wechat.aff.udr;

/* loaded from: classes15.dex */
public class j extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f217537a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f217538b;

    /* renamed from: c, reason: collision with root package name */
    public long f217539c;

    public j(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("IUdrCppGlobalFeature.Destructor", "constructor IUdrCppGlobalFeature Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("IUdrCppGlobalFeature.Destructor", "destructor IUdrCppGlobalFeature Destructor() id:" + this.f217537a + "svrid: " + this.f217538b, new java.lang.Object[0]);
        com.tencent.wechat.aff.udr.ZIDL_Y5AcJ9_P2K.ZIDL_Y5AcJ9_P2D(this.f217539c, this.f217537a, this.f217538b);
    }
}
