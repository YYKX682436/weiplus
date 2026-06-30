package com.tencent.wechat.aff.function_call;

/* loaded from: classes15.dex */
public class j extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f216898a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f216899b;

    /* renamed from: c, reason: collision with root package name */
    public long f216900c;

    public j(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("FunctionCallNativeImpl.Destructor", "constructor FunctionCallNativeImpl Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("FunctionCallNativeImpl.Destructor", "destructor FunctionCallNativeImpl Destructor() id:" + this.f216898a + "svrid: " + this.f216899b, new java.lang.Object[0]);
        com.tencent.wechat.aff.function_call.ZIDL_JdUMnLr0K.ZIDL_JdUMnLr0D(this.f216900c, this.f216898a, this.f216899b);
    }
}
