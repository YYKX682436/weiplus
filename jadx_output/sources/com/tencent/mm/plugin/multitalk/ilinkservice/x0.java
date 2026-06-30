package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d80 f149854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.y0 f149855e;

    public x0(com.tencent.mm.plugin.multitalk.ilinkservice.y0 y0Var, r45.d80 d80Var) {
        this.f149855e = y0Var;
        this.f149854d = d80Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "recv invite busy callback!");
        com.tencent.mm.plugin.multitalk.ilinkservice.y0 y0Var = this.f149855e;
        r45.d80 d80Var = this.f149854d;
        if (d80Var != null) {
            java.util.Map map = y0Var.f149860a.f149634l2;
            if (map != null && ((java.util.concurrent.ConcurrentHashMap) map).size() > 0) {
                ((java.util.concurrent.ConcurrentHashMap) y0Var.f149860a.f149634l2).clear();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "recv invite busy, imroomid:%d roomid:%d selfmemberid:%d", java.lang.Long.valueOf(d80Var.f372216d), java.lang.Long.valueOf(d80Var.f372217e), java.lang.Integer.valueOf(d80Var.f372219g));
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = y0Var.f149860a;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
        i4Var.u();
    }
}
