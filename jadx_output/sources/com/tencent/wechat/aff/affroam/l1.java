package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
public class l1 extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f215895a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f215896b;

    /* renamed from: c, reason: collision with root package name */
    public long f215897c;

    public l1(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("RoamDeviceManager.Destructor", "constructor RoamDeviceManager Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("RoamDeviceManager.Destructor", "destructor RoamDeviceManager Destructor() id:" + this.f215895a + "svrid: " + this.f215896b, new java.lang.Object[0]);
        com.tencent.wechat.aff.affroam.ZIDL_esFfH6f8K.ZIDL_esFfH6f8D(this.f215897c, this.f215895a, this.f215896b);
    }
}
