package com.tencent.wechat.aff.iam_scan;

/* loaded from: classes15.dex */
public class l0 extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f217096a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f217097b;

    /* renamed from: c, reason: collision with root package name */
    public long f217098c;

    public l0(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("ScanGoodsCallback.Destructor", "constructor ScanGoodsCallback Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("ScanGoodsCallback.Destructor", "destructor ScanGoodsCallback Destructor() id:" + this.f217096a + "svrid: " + this.f217097b, new java.lang.Object[0]);
        com.tencent.wechat.aff.iam_scan.ZIDL_NguQFDciK.ZIDL_NguQFDciD(this.f217098c, this.f217096a, this.f217097b);
    }
}
