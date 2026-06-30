package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes13.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.g1 f158943d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.scanner.model.g1 g1Var) {
        super(2);
        this.f158943d = g1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        com.tencent.mm.plugin.scanner.model.i1 decodeInfo = (com.tencent.mm.plugin.scanner.model.i1) obj;
        kotlin.jvm.internal.o.g(decodeInfo, "decodeInfo");
        if (decodeInfo.f158935b == 0) {
            java.util.Iterator it = this.f158943d.f158911b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsResourceManager", "checkFinish finish");
                    z17 = true;
                    break;
                }
                if (((com.tencent.mm.plugin.scanner.model.i1) it.next()).f158936c != 2) {
                    z17 = false;
                    break;
                }
            }
            if (z17) {
                com.tencent.mm.plugin.scanner.model.g1 g1Var = this.f158943d;
                java.util.Iterator it6 = g1Var.f158911b.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        g1Var.f158912c = 0;
                        g1Var.f158913d = "ok";
                        break;
                    }
                    int i17 = ((com.tencent.mm.plugin.scanner.model.i1) it6.next()).f158935b;
                    if (i17 != 0) {
                        g1Var.f158912c = i17;
                        g1Var.f158913d = i17 != 0 ? i17 == 2 ? "image not exist" : i17 == 3 ? "decode fail" : "unknown error" : "ok";
                    }
                }
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.scanner.model.j1(this.f158943d));
            }
        }
        return jz5.f0.f302826a;
    }
}
