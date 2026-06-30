package com.tencent.wechat.aff.udr;

/* loaded from: classes14.dex */
public class f extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f217534a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f217535b;

    /* renamed from: c, reason: collision with root package name */
    public long f217536c;

    public f(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("IUdrCppBizFeature.Destructor", "constructor IUdrCppBizFeature Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("IUdrCppBizFeature.Destructor", "destructor IUdrCppBizFeature Destructor() id:" + this.f217534a + "svrid: " + this.f217535b, new java.lang.Object[0]);
        com.tencent.wechat.aff.udr.ZIDL_a0qZ_cdBK.ZIDL_a0qZ_cdBD(this.f217536c, this.f217534a, this.f217535b);
    }
}
