package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes14.dex */
public class w0 extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f177289a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f177290b;

    /* renamed from: c, reason: collision with root package name */
    public long f177291c;

    public w0(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("VoipmpCoreUIController.Destructor", "constructor VoipmpCoreUIController Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("VoipmpCoreUIController.Destructor", "destructor VoipmpCoreUIController Destructor() id:" + this.f177289a + "svrid: " + this.f177290b, new java.lang.Object[0]);
        com.tencent.mm.plugin.voipmp.platform.ZIDL_ibmKH7hbMK.ZIDL_ibmKH7hbMD(this.f177291c, this.f177289a, this.f177290b);
    }
}
