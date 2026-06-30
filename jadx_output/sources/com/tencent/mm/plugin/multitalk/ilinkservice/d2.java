package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class d2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149545f;

    public d2(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, java.lang.String str, java.lang.String str2) {
        this.f149545f = i4Var;
        this.f149543d = str;
        this.f149544e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149545f;
        java.lang.String str = this.f149543d;
        i4Var.f149643p1 = str;
        java.lang.String str2 = this.f149544e;
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "enter joinSync. %s,%s, %d, %b", str2, str, java.lang.Integer.valueOf(i4Var.f149637n), java.lang.Boolean.valueOf(i4Var.S));
        synchronized (i4Var.X1) {
            if (i4Var.f149637n != 1 && !i4Var.S) {
                i4Var.S = true;
                i4Var.f149631j2 = java.lang.System.currentTimeMillis();
                i4Var.J(new com.tencent.mm.plugin.multitalk.ilinkservice.i3(i4Var, str2, str));
                return;
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkService", "hy: already in room!");
            i4Var.V = com.tencent.mm.plugin.multitalk.ilinkservice.d4.ILinkErrEnterRepeated;
            i4Var.T();
        }
    }
}
