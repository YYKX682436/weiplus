package com.tencent.wechat.iam.biz;

/* loaded from: classes11.dex */
public class i extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f217751a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f217752b;

    /* renamed from: c, reason: collision with root package name */
    public long f217753c;

    public i(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayList.Destructor", "constructor IamBizAudioPlayList Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("IamBizAudioPlayList.Destructor", "destructor IamBizAudioPlayList Destructor() id:" + this.f217751a + "svrid: " + this.f217752b, new java.lang.Object[0]);
        com.tencent.wechat.iam.biz.ZIDL_MvRZB14SLK.ZIDL_MvRZB14SLD(this.f217753c, this.f217751a, this.f217752b);
    }
}
