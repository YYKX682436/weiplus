package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class gj0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.jj0 f112707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj0(com.tencent.mm.plugin.finder.live.plugin.jj0 jj0Var) {
        super(3);
        this.f112707d = jj0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        bw5.gq0 gq0Var = (bw5.gq0) obj3;
        com.tencent.mm.plugin.finder.live.plugin.jj0 jj0Var = this.f112707d;
        if (booleanValue) {
            r45.d22 d22Var = jj0Var.f113123v;
            if (d22Var != null) {
                d22Var.set(7, gq0Var != null ? gq0Var.getUrl() : null);
            }
            bl2.k kVar = jj0Var.f113124w;
            if (kVar != null) {
                kVar.f21717h = jj0Var.f113123v;
                kVar.z();
            }
        } else {
            java.lang.String str2 = jj0Var.f113117p;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetch song url for listenId ");
            r45.d22 d22Var2 = jj0Var.f113123v;
            sb6.append(d22Var2 != null ? d22Var2.getString(9) : null);
            sb6.append(" failed. ErrorMsg ");
            sb6.append(str);
            com.tencent.mars.xlog.Log.w(str2, sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
