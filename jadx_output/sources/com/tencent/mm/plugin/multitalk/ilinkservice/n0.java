package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class n0 implements com.tencent.mm.plugin.multitalk.ilinkservice.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.o0 f149727a;

    public n0(com.tencent.mm.plugin.multitalk.ilinkservice.o0 o0Var) {
        this.f149727a = o0Var;
    }

    @Override // com.tencent.mm.plugin.multitalk.ilinkservice.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "initEngine done! %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkService", "initEngine fail errtype %d errcode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            if (i18 != -66) {
                com.tencent.mm.plugin.multitalk.ilinkservice.i4.m(this.f149727a.f149736e, true);
                return;
            }
            synchronized (this.f149727a.f149736e.Q1) {
                com.tencent.mm.plugin.multitalk.ilinkservice.o0 o0Var = this.f149727a;
                o0Var.f149736e.Q1.add(o0Var.f149735d);
            }
            return;
        }
        com.tencent.mm.plugin.multitalk.ilinkservice.o0 o0Var2 = this.f149727a;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = o0Var2.f149736e;
        r45.q07 q07Var = o0Var2.f149735d;
        if (i4Var.Y != null) {
            com.tencent.mm.plugin.multitalk.ilinkservice.w0 w0Var = new com.tencent.mm.plugin.multitalk.ilinkservice.w0(i4Var);
            i4Var.H = w0Var;
            com.tencent.mm.plugin.multitalk.ilinkservice.f0 f0Var = i4Var.f149621e;
            f0Var.b(8, w0Var);
            com.tencent.mm.plugin.multitalk.ilinkservice.y0 y0Var = new com.tencent.mm.plugin.multitalk.ilinkservice.y0(i4Var);
            i4Var.I = y0Var;
            f0Var.b(9, y0Var);
            com.tencent.mm.plugin.multitalk.ilinkservice.a1 a1Var = new com.tencent.mm.plugin.multitalk.ilinkservice.a1(i4Var);
            i4Var.P = a1Var;
            f0Var.b(16, a1Var);
            com.tencent.mm.plugin.multitalk.ilinkservice.b1 b1Var = new com.tencent.mm.plugin.multitalk.ilinkservice.b1(i4Var);
            i4Var.f149615J = b1Var;
            f0Var.b(11, b1Var);
            i4Var.Z();
            byte[] bArr = q07Var.f383546i.f192156a;
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.RecvNotify(bArr, bArr.length, i4Var.f149657y1);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "no delegate, return !");
        }
        synchronized (this.f149727a.f149736e.Q1) {
            java.util.Iterator it = this.f149727a.f149736e.Q1.iterator();
            while (it.hasNext()) {
                r45.q07 q07Var2 = (r45.q07) it.next();
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "recvnotify deal with the cached invite notify");
                this.f149727a.f149736e.Z();
                byte[] bArr2 = q07Var2.f383546i.f192156a;
                com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.RecvNotify(bArr2, bArr2.length, this.f149727a.f149736e.f149657y1);
            }
            this.f149727a.f149736e.Q1.clear();
        }
    }
}
