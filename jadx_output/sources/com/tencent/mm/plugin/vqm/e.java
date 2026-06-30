package com.tencent.mm.plugin.vqm;

/* loaded from: classes14.dex */
public class e extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f177331a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f177332b;

    /* renamed from: c, reason: collision with root package name */
    public long f177333c;

    public e(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("VQMObserver.Destructor", "constructor VQMObserver Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("VQMObserver.Destructor", "destructor VQMObserver Destructor() id:" + this.f177331a + "svrid: " + this.f177332b, new java.lang.Object[0]);
        com.tencent.mm.plugin.vqm.ZIDL_dPmnyryCK.ZIDL_dPmnyryCD(this.f177333c, this.f177331a, this.f177332b);
    }
}
