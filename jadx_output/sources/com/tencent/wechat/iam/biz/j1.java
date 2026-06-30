package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class j1 extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f217754a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f217755b;

    /* renamed from: c, reason: collision with root package name */
    public long f217756c;

    public j1(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("IamBizProfileNativeToCppManager.Destructor", "constructor IamBizProfileNativeToCppManager Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("IamBizProfileNativeToCppManager.Destructor", "destructor IamBizProfileNativeToCppManager Destructor() id:" + this.f217754a + "svrid: " + this.f217755b, new java.lang.Object[0]);
        com.tencent.wechat.iam.biz.ZIDL_pjvjmq0eK.ZIDL_pjvjmq0eD(this.f217756c, this.f217754a, this.f217755b);
    }
}
