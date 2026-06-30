package com.tencent.wechat.aff.udr;

/* loaded from: classes16.dex */
public class b extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f217531a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f217532b;

    /* renamed from: c, reason: collision with root package name */
    public long f217533c;

    public b(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("IUdrCppBizCallBack.Destructor", "constructor IUdrCppBizCallBack Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("IUdrCppBizCallBack.Destructor", "destructor IUdrCppBizCallBack Destructor() id:" + this.f217531a + "svrid: " + this.f217532b, new java.lang.Object[0]);
        com.tencent.wechat.aff.udr.ZIDL_C2BeJe9_UK.ZIDL_C2BeJe9_UD(this.f217533c, this.f217531a, this.f217532b);
    }
}
