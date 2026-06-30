package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class a1 extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f217739a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f217740b;

    /* renamed from: c, reason: collision with root package name */
    public long f217741c;

    public a1(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterRedDotManager.Destructor", "constructor IamBizPersonalCenterRedDotManager Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("IamBizPersonalCenterRedDotManager.Destructor", "destructor IamBizPersonalCenterRedDotManager Destructor() id:" + this.f217739a + "svrid: " + this.f217740b, new java.lang.Object[0]);
        com.tencent.wechat.iam.biz.ZIDL_XqmGHCCoK.ZIDL_XqmGHCCoD(this.f217741c, this.f217739a, this.f217740b);
    }
}
