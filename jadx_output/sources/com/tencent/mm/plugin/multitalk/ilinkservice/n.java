package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes8.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.c f149726e;

    public n(com.tencent.mm.plugin.multitalk.ilinkservice.c cVar, java.lang.String str) {
        this.f149726e = cVar;
        this.f149725d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.c cVar = this.f149726e;
        if (cVar.f149514a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILink2MtCallBack", "onOtherDeviceHandle errorcode:%d", -1400);
            cVar.f149514a.F(-1400, this.f149725d);
        }
    }
}
