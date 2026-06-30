package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes5.dex */
public class k0 extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f191741b = 0;

    @Override // ot0.h
    public ot0.h a() {
        com.tencent.mm.pluginsdk.ui.tools.k0 k0Var = new com.tencent.mm.pluginsdk.ui.tools.k0();
        k0Var.f191741b = this.f191741b;
        return k0Var;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        sb6.append("<directshare>");
        sb6.append(this.f191741b);
        sb6.append("</directshare>");
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.directshare");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        this.f191741b = com.tencent.mm.sdk.platformtools.t8.D1(str, 0);
    }
}
