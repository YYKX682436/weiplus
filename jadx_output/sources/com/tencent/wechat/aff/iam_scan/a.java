package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class a extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f216929a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f216930b;

    /* renamed from: c, reason: collision with root package name */
    public long f216931c;

    public a(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("AffQBar.Destructor", "constructor AffQBar Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("AffQBar.Destructor", "destructor AffQBar Destructor() id:" + this.f216929a + "svrid: " + this.f216930b, new java.lang.Object[0]);
        com.tencent.wechat.aff.iam_scan.ZIDL_nneooqeyK.ZIDL_nneooqeyD(this.f216931c, this.f216929a, this.f216930b);
    }
}
