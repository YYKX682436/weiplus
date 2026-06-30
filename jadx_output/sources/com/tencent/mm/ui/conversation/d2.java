package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public final class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f207627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f207628f;

    public d2(java.lang.String str, int i17, int i18) {
        this.f207626d = str;
        this.f207627e = i17;
        this.f207628f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5("notifymessage");
        if (q57 == null) {
            return;
        }
        int createTime = (int) (q57.getCreateTime() / 1000);
        int i17 = !gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SERVICE_NOTIFY_MESSAGE_NOTICE_BOOLEAN_SYNC, true) ? 1 : 0;
        com.tencent.mm.ui.conversation.f2 f2Var = com.tencent.mm.ui.conversation.f2.f207664a;
        f2Var.a(1, createTime, this.f207626d, i17, this.f207627e, q57, this.f207628f);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (com.tencent.mm.ui.conversation.f2.f207666c != q57.I0() || currentTimeMillis - com.tencent.mm.ui.conversation.f2.f207669f > 1000) {
            f2Var.b(1, createTime, this.f207626d, this.f207627e, q57, this.f207628f, null);
        }
        com.tencent.mm.ui.conversation.f2.f207669f = currentTimeMillis;
        com.tencent.mm.ui.conversation.f2.f207666c = q57.I0();
    }
}
