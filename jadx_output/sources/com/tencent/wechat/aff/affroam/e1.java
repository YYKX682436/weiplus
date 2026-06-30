package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
public class e1 extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f215820a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f215821b;

    /* renamed from: c, reason: collision with root package name */
    public long f215822c;

    public e1(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("RoamBackupper.Destructor", "constructor RoamBackupper Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("RoamBackupper.Destructor", "destructor RoamBackupper Destructor() id:" + this.f215820a + "svrid: " + this.f215821b, new java.lang.Object[0]);
        com.tencent.wechat.aff.affroam.ZIDL_esFfd8OmK.ZIDL_esFfd8OmD(this.f215822c, this.f215820a, this.f215821b);
    }
}
