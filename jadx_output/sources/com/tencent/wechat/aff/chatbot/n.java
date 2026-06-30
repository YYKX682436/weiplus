package com.tencent.wechat.aff.chatbot;

/* loaded from: classes16.dex */
public class n extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f216385a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f216386b;

    /* renamed from: c, reason: collision with root package name */
    public long f216387c;

    public n(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("CBTStreamMDCppParser.Destructor", "constructor CBTStreamMDCppParser Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("CBTStreamMDCppParser.Destructor", "destructor CBTStreamMDCppParser Destructor() id:" + this.f216385a + "svrid: " + this.f216386b, new java.lang.Object[0]);
        com.tencent.wechat.aff.chatbot.ZIDL_bGXOQSYvK.ZIDL_bGXOQSYvD(this.f216387c, this.f216385a, this.f216386b);
    }
}
