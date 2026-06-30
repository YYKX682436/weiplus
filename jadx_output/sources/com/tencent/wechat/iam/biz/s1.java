package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class s1 extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f217783a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f217784b;

    /* renamed from: c, reason: collision with root package name */
    public long f217785c;

    public s1(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("IamBizServiceProxy.Destructor", "constructor IamBizServiceProxy Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("IamBizServiceProxy.Destructor", "destructor IamBizServiceProxy Destructor() id:" + this.f217783a + "svrid: " + this.f217784b, new java.lang.Object[0]);
        com.tencent.wechat.iam.biz.ZIDL_vXOGfK5oK.ZIDL_vXOGfK5oD(this.f217785c, this.f217783a, this.f217784b);
    }
}
