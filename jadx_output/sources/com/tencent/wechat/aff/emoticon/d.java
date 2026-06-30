package com.tencent.wechat.aff.emoticon;

/* loaded from: classes16.dex */
public class d extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f216637a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f216638b;

    /* renamed from: c, reason: collision with root package name */
    public long f216639c;

    public d(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("EmoticonCustomAddLogic.Destructor", "constructor EmoticonCustomAddLogic Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("EmoticonCustomAddLogic.Destructor", "destructor EmoticonCustomAddLogic Destructor() id:" + this.f216637a + "svrid: " + this.f216638b, new java.lang.Object[0]);
        com.tencent.wechat.aff.emoticon.ZIDL_J6WrA01dRK.ZIDL_J6WrA01dRD(this.f216639c, this.f216637a, this.f216638b);
    }
}
