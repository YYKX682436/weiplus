package com.tencent.wechat.aff.chatbot;

/* loaded from: classes14.dex */
public class o0 extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f216406a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f216407b;

    /* renamed from: c, reason: collision with root package name */
    public long f216408c;

    public o0(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("ChatbotUICPP2NativeCaller.Destructor", "constructor ChatbotUICPP2NativeCaller Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("ChatbotUICPP2NativeCaller.Destructor", "destructor ChatbotUICPP2NativeCaller Destructor() id:" + this.f216406a + "svrid: " + this.f216407b, new java.lang.Object[0]);
        com.tencent.wechat.aff.chatbot.ZIDL_fc3cA08LjK.ZIDL_fc3cA08LjD(this.f216408c, this.f216406a, this.f216407b);
    }
}
