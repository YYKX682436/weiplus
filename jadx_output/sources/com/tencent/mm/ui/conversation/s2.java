package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class s2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f208062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f208063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f208064g;

    public s2(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f208061d = str;
        this.f208062e = i17;
        this.f208063f = i18;
        this.f208064g = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5("notifymessage");
        int createTime = (int) (q57.getCreateTime() / 1000);
        int i17 = !gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true) ? 1 : 0;
        com.tencent.mm.ui.conversation.f2 f2Var = com.tencent.mm.ui.conversation.f2.f207664a;
        f2Var.a(2, createTime, this.f208061d, i17, this.f208062e, q57, this.f208063f);
        f2Var.b(2, createTime, this.f208061d, this.f208062e, q57, this.f208063f, this.f208064g);
    }
}
