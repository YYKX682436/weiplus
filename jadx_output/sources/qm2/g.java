package qm2;

/* loaded from: classes3.dex */
public final class g implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qm2.k f364722a;

    public g(qm2.k kVar) {
        this.f364722a = kVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.r1 r1Var;
        com.tencent.mm.network.s sVar;
        com.tencent.mm.protobuf.g gVar;
        com.tencent.mm.protobuf.g gVar2;
        java.util.LinkedList linkedList;
        r45.wc6 wc6Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("FinderStartLiveNetSpeedTestUIC", "CgiTestClientSpeed errType:" + fVar.f70615a + " errCode:" + fVar.f70616b);
        r45.p40 p40Var = (r45.p40) fVar.f70618d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        qm2.k kVar = this.f364722a;
        jz5.f0 f0Var2 = null;
        r5 = null;
        byte[] bArr = null;
        if (p40Var != null) {
            if (fVar.f70615a == 0 && fVar.f70616b == 0) {
                kVar.getClass();
                r45.yc6 yc6Var = (r45.yc6) p40Var.getCustom(1);
                java.lang.String str = (yc6Var == null || (linkedList = yc6Var.f390966d) == null || (wc6Var = (r45.wc6) kz5.n0.a0(linkedList, 0)) == null) ? null : wc6Var.f389070d;
                if (str == null) {
                    str = "";
                }
                java.lang.String str2 = str;
                r45.yc6 yc6Var2 = (r45.yc6) p40Var.getCustom(1);
                int i17 = yc6Var2 != null ? yc6Var2.f390968f : 0;
                r45.yc6 yc6Var3 = (r45.yc6) p40Var.getCustom(2);
                int i18 = yc6Var3 != null ? yc6Var3.f390968f : 0;
                r45.yc6 yc6Var4 = (r45.yc6) p40Var.getCustom(1);
                int i19 = yc6Var4 != null ? yc6Var4.f390970h : 0;
                r45.yc6 yc6Var5 = (r45.yc6) p40Var.getCustom(2);
                int i27 = yc6Var5 != null ? yc6Var5.f390970h : 0;
                r45.yc6 yc6Var6 = (r45.yc6) p40Var.getCustom(1);
                byte[] g17 = (yc6Var6 == null || (gVar2 = yc6Var6.f390969g) == null) ? null : gVar2.g();
                r45.yc6 yc6Var7 = (r45.yc6) p40Var.getCustom(2);
                if (yc6Var7 != null && (gVar = yc6Var7.f390969g) != null) {
                    bArr = gVar.g();
                }
                byte[] bArr2 = bArr;
                gm0.y n17 = gm0.j1.n();
                if (n17 != null && (r1Var = n17.f273288b) != null && (sVar = r1Var.f70764d) != null) {
                    sVar.P(str2, i17, i18, i19, i27, g17, bArr2, new qm2.j(kVar));
                }
            } else {
                qm2.k.O6(kVar, "CgiTestClientSpeed failed: " + fVar.f70615a + ", " + fVar.f70616b);
            }
            f0Var2 = f0Var;
        }
        if (f0Var2 == null) {
            qm2.k.O6(kVar, "Empty response from CgiTestClientSpeed");
        }
        return f0Var;
    }
}
