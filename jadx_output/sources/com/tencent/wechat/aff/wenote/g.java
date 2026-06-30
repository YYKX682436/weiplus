package com.tencent.wechat.aff.wenote;

/* loaded from: classes11.dex */
public class g extends com.tencent.wechat.zidl2.DestructorThread.Destructor {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f217691a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f217692b;

    /* renamed from: c, reason: collision with root package name */
    public long f217693c;

    public g(java.lang.Object obj, long j17) {
        super(obj);
        com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelper.Destructor", "constructor WeNoteNativeHelper Destructor()", new java.lang.Object[0]);
    }

    @Override // com.tencent.wechat.zidl2.DestructorThread.Destructor
    public void destruct() {
        com.tencent.wechat.zlog.Zlog.a("WeNoteNativeHelper.Destructor", "destructor WeNoteNativeHelper Destructor() id:" + this.f217691a + "svrid: " + this.f217692b, new java.lang.Object[0]);
        com.tencent.wechat.aff.wenote.ZIDL_qgniI8ycsK.ZIDL_qgniI8ycsD(this.f217693c, this.f217691a, this.f217692b);
    }
}
