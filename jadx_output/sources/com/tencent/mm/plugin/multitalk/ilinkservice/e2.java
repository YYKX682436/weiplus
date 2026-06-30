package com.tencent.mm.plugin.multitalk.ilinkservice;

/* loaded from: classes14.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f149561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.ilinkservice.i4 f149562f;

    public e2(com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var, java.lang.String str, java.util.ArrayList arrayList) {
        this.f149562f = i4Var;
        this.f149560d = str;
        this.f149561e = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = this.f149562f;
        i4Var.f149623f.e();
        com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var = i4Var.f149623f;
        c0Var.f149520d = this.f149560d;
        c0Var.getClass();
        final java.util.ArrayList arrayList = this.f149561e;
        com.tencent.mm.plugin.multitalk.ilinkservice.i4.j(i4Var, new com.tencent.mm.plugin.multitalk.ilinkservice.b() { // from class: com.tencent.mm.plugin.multitalk.ilinkservice.e2$$a
            @Override // com.tencent.mm.plugin.multitalk.ilinkservice.b
            public final void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
                com.tencent.mm.plugin.multitalk.ilinkservice.e2 e2Var = com.tencent.mm.plugin.multitalk.ilinkservice.e2.this;
                java.util.ArrayList arrayList2 = arrayList;
                e2Var.getClass();
                com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "initEngine done! %d, %d, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
                if (i17 != 0 || i18 != 0) {
                    if (i18 != -66) {
                        com.tencent.mm.plugin.multitalk.ilinkservice.i4.m(e2Var.f149562f, true);
                    }
                    com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var2 = e2Var.f149562f;
                    i4Var2.Y.c(16, i4Var2.f149643p1, null);
                    com.tencent.mars.xlog.Log.e("MicroMsg.Multitalk.ILinkService", "initEngine fail errtype %d errcode %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
                    return;
                }
                com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var3 = e2Var.f149562f;
                i4Var3.getClass();
                java.util.LinkedList linkedList = new java.util.LinkedList();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.multitalk.ilinkservice.w wVar = (com.tencent.mm.plugin.multitalk.ilinkservice.w) it.next();
                    if (!wVar.f149842c.equals(i4Var3.f149656y0)) {
                        linkedList.add(wVar.f149842c);
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "on invite users: %s, usrname:%s", wVar.f149841b, wVar.f149842c);
                }
                com.tencent.mm.plugin.multitalk.ilinkservice.c0 c0Var2 = i4Var3.f149623f;
                c0Var2.f149521e = arrayList2;
                com.tencent.mm.plugin.multitalk.ilinkservice.h1 h1Var = new com.tencent.mm.plugin.multitalk.ilinkservice.h1(i4Var3);
                i4Var3.E = h1Var;
                i4Var3.F = new com.tencent.mm.plugin.multitalk.ilinkservice.j1(i4Var3, null);
                i4Var3.C = new com.tencent.mm.plugin.multitalk.ilinkservice.m1(i4Var3);
                i4Var3.D = new com.tencent.mm.plugin.multitalk.ilinkservice.o1(i4Var3, null);
                i4Var3.G = new com.tencent.mm.plugin.multitalk.ilinkservice.p1(i4Var3);
                com.tencent.mm.plugin.multitalk.ilinkservice.f0 f0Var = i4Var3.f149621e;
                f0Var.b(5, h1Var);
                f0Var.b(6, i4Var3.F);
                f0Var.b(22, i4Var3.C);
                f0Var.b(23, i4Var3.D);
                f0Var.b(7, i4Var3.G);
                i4Var3.w();
                c0Var2.f149517a.clear();
                i4Var3.Q();
                if (gq4.v.Ni()) {
                    i4Var3.G();
                }
                i4Var3.Z();
                java.lang.String str2 = i4Var3.f149643p1;
                int i19 = i4Var3.f149657y1;
                java.lang.String[] strArr = com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149583a;
                r45.w70 w70Var = new r45.w70();
                w70Var.f388919d = linkedList;
                w70Var.f388920e = i4Var3.f149645q;
                w70Var.f388921f = true;
                w70Var.f388922g = i19;
                w70Var.f388923h = str2;
                w70Var.f388924i = "";
                int i27 = -1;
                try {
                    i27 = com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.Invite(w70Var.toByteArray(), w70Var.toByteArray().length);
                    com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkNativeEngine", "steve: invite ret:" + i27);
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Multitalk.ILinkNativeEngine", e17, "Invite exception", new java.lang.Object[0]);
                }
                if (i27 != 0) {
                    i4Var3.r(null, -10086, -4, "join room sdk failed: " + i27, null);
                } else {
                    i4Var3.f149636m2 = true;
                    i4Var3.V(new com.tencent.mm.plugin.multitalk.ilinkservice.q1(i4Var3));
                }
                synchronized (e2Var.f149562f.Q1) {
                    java.util.Iterator it6 = e2Var.f149562f.Q1.iterator();
                    while (it6.hasNext()) {
                        r45.q07 q07Var = (r45.q07) it6.next();
                        com.tencent.mars.xlog.Log.i("MicroMsg.Multitalk.ILinkService", "inviteSync deal with the cached invite notify");
                        e2Var.f149562f.Z();
                        byte[] bArr = q07Var.f383546i.f192156a;
                        com.tencent.mm.plugin.multitalk.ilinkservice.g0.f149585c.RecvNotify(bArr, bArr.length, e2Var.f149562f.f149657y1);
                    }
                    e2Var.f149562f.Q1.clear();
                }
            }
        });
    }
}
