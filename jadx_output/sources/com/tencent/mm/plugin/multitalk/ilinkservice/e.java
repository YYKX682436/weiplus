package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c0 f149557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c f149558e;

    public e(com.tencent.mm.plugin.multitalk.ilinkservice.c cVar, com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var) {
        this.f149558e = cVar;
        this.f149557d = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = this.f149558e;
        if (cVar.f149514a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onInviteOrAcceptTimeout");
            com.tencent.mm.modeltalkroom.MultiTalkGroup a17 = cVar.a(this.f149557d);
            com.tencent.mm.plugin.multitalk.model.v0 v0Var = cVar.f149514a;
            v0Var.getClass();
            com.tencent.mm.plugin.multitalk.model.u0.e(2, com.tencent.mm.plugin.multitalk.model.o2.e(a17));
            v0Var.j(a17, sj3.e4.Inviting, false, true, true, false);
        }
    }
}
