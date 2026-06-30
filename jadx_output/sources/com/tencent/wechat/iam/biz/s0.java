package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class s0 extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f217780a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f217781b;

    /* renamed from: c, reason: collision with root package name */
    public long f217782c;

    public s0(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterManager.Destructor", "constructor IamBizPersonalCenterManager Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterManager.Destructor", "destructor IamBizPersonalCenterManager Destructor() id:" + this.f217780a + "svrid: " + this.f217781b, new java.lang.Object[0]);
        com.tencent.wechat.iam.biz.ZIDL_XqmGB1Os3K.ZIDL_XqmGB1Os3D(this.f217782c, this.f217780a, this.f217781b);
    }
}
