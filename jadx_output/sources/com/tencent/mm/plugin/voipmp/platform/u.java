package com.tencent.mm.plugin.voipmp.platform;

/* loaded from: classes14.dex */
public class u extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f177284a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f177285b;

    /* renamed from: c, reason: collision with root package name */
    public long f177286c;

    public u(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("VoipmpCoreNativeController.Destructor", "constructor VoipmpCoreNativeController Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("VoipmpCoreNativeController.Destructor", "destructor VoipmpCoreNativeController Destructor() id:" + this.f177284a + "svrid: " + this.f177285b, new java.lang.Object[0]);
        com.tencent.mm.plugin.voipmp.platform.ZIDL_DVO6HrxwK.ZIDL_DVO6HrxwD(this.f177286c, this.f177284a, this.f177285b);
    }
}
