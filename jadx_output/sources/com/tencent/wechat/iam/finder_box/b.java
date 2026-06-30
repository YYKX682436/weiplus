package com.tencent.wechat.iam.finder_box;

/* loaded from: classes11.dex */
public class b extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f217828a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f217829b;

    /* renamed from: c, reason: collision with root package name */
    public long f217830c;

    public b(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayList.Destructor", "constructor BoxIamBizAudioPlayList Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("BoxIamBizAudioPlayList.Destructor", "destructor BoxIamBizAudioPlayList Destructor() id:" + this.f217828a + "svrid: " + this.f217829b, new java.lang.Object[0]);
        com.tencent.wechat.iam.finder_box.ZIDL_Cux7el2LK.ZIDL_Cux7el2LD(this.f217830c, this.f217828a, this.f217829b);
    }
}
