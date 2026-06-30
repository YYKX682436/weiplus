package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class cc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.gc f198886e;

    public cc(com.tencent.mm.ui.chatting.component.gc gcVar, java.lang.String str) {
        this.f198886e = gcVar;
        this.f198885d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f198886e.f199097g = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(this.f198885d);
        if (this.f198886e.f199097g == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GetChatroomComponent", "[onChattingInit] cost:%sms talker:%s createTime:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), this.f198885d, java.lang.Long.valueOf(this.f198886e.f199097g.getCreateTime()));
    }
}
