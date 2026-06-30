package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c f149734d;

    public o(com.tencent.mm.plugin.multitalk.ilinkservice.c cVar) {
        this.f149734d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = this.f149734d;
        if (cVar.f149514a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onJoinErrOtherDevice errorcode:%d", -14256);
            cVar.f149514a.F(-14256, null);
        }
    }
}
