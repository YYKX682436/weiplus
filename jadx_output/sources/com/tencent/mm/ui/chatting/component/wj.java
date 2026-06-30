package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class wj implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f200177d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f200178e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f200179f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.xj f200180g;

    public wj(com.tencent.mm.ui.chatting.component.xj xjVar) {
        this.f200180g = xjVar;
        this.f200177d = xjVar.f200235a.getMsgId();
        this.f200178e = xjVar.f200235a.Q0();
        this.f200179f = xjVar.f200236b;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f200178e;
        long j17 = this.f200177d;
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
        com.tencent.mm.modelsimple.d1.J(this.f200180g.f200237c.f198580d.s().getString(com.tencent.mm.R.string.b5s), "", Li, "");
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).lb(Li.getMsgId(), Li, true);
        com.tencent.mm.autogen.events.RevokeNativeMsgEvent revokeNativeMsgEvent = new com.tencent.mm.autogen.events.RevokeNativeMsgEvent();
        am.ds dsVar = revokeNativeMsgEvent.f54714g;
        dsVar.f6496a = j17;
        dsVar.f6498c = str;
        dsVar.f6497b = this.f200179f;
        revokeNativeMsgEvent.e();
    }
}
