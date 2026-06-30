package com.tencent.wechat.aff.chatbot;

/* loaded from: classes16.dex */
public class q extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f216427a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f216428b;

    /* renamed from: c, reason: collision with root package name */
    public long f216429c;

    public q(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("CBTStreamMDParserDelegateInterface.Destructor", "constructor CBTStreamMDParserDelegateInterface Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("CBTStreamMDParserDelegateInterface.Destructor", "destructor CBTStreamMDParserDelegateInterface Destructor() id:" + this.f216427a + "svrid: " + this.f216428b, new java.lang.Object[0]);
        com.tencent.wechat.aff.chatbot.ZIDL_H7GR2X7uJK.ZIDL_H7GR2X7uJD(this.f216429c, this.f216427a, this.f216428b);
    }
}
