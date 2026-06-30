package com.tencent.wechat.aff.affroam;

/* loaded from: classes5.dex */
public class s1 extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f215982a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f215983b;

    /* renamed from: c, reason: collision with root package name */
    public long f215984c;

    public s1(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("RoamTask.Destructor", "constructor RoamTask Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("RoamTask.Destructor", "destructor RoamTask Destructor() id:" + this.f215982a + "svrid: " + this.f215983b, new java.lang.Object[0]);
        com.tencent.wechat.aff.affroam.ZIDL_esFfkZCzK.ZIDL_esFfkZCzD(this.f215984c, this.f215982a, this.f215983b);
    }
}
