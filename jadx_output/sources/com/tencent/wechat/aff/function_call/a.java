package com.tencent.wechat.aff.function_call;

/* loaded from: classes15.dex */
public class a extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f216886a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f216887b;

    /* renamed from: c, reason: collision with root package name */
    public long f216888c;

    public a(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("FunctionCallCPP2NativeCaller.Destructor", "constructor FunctionCallCPP2NativeCaller Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("FunctionCallCPP2NativeCaller.Destructor", "destructor FunctionCallCPP2NativeCaller Destructor() id:" + this.f216886a + "svrid: " + this.f216887b, new java.lang.Object[0]);
        com.tencent.wechat.aff.function_call.ZIDL_JdUMtI41K.ZIDL_JdUMtI41D(this.f216888c, this.f216886a, this.f216887b);
    }
}
