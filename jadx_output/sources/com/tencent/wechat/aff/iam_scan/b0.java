package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class b0 extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f216951a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f216952b;

    /* renamed from: c, reason: collision with root package name */
    public long f216953c;

    public b0(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("ScanDecodeCallback.Destructor", "constructor ScanDecodeCallback Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("ScanDecodeCallback.Destructor", "destructor ScanDecodeCallback Destructor() id:" + this.f216951a + "svrid: " + this.f216952b, new java.lang.Object[0]);
        com.tencent.wechat.aff.iam_scan.ZIDL__CzVbChcK.ZIDL__CzVbChcD(this.f216953c, this.f216951a, this.f216952b);
    }
}
