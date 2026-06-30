package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class q3 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f113955d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        super(2);
        this.f113955d = v3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String headUrl;
        java.lang.Object cgi = (com.tencent.mm.modelbase.i) obj;
        kotlin.jvm.internal.o.g(cgi, "cgi");
        kotlin.jvm.internal.o.g((com.tencent.mm.protocal.protobuf.FinderUserPageResponse) obj2, "<anonymous parameter 1>");
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f113955d;
        if (v3Var.f113330o.f11605c != androidx.lifecycle.n.DESTROYED) {
            if (cgi instanceof h81.b) {
                bq.z1 z1Var = (bq.z1) ((h81.b) cgi);
                com.tencent.mm.protocal.protobuf.FinderContact J2 = z1Var.J();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update bg,user page isOnlyFetchUserInfo:");
                boolean z17 = z1Var.f23544v;
                sb6.append(z17);
                sb6.append(", local username:");
                sb6.append(((mm2.c1) v3Var.P0(mm2.c1.class)).f328852o);
                sb6.append(",req username:");
                java.lang.String str = z1Var.f23542t;
                sb6.append(str);
                sb6.append("，contact username:");
                sb6.append(J2 != null ? J2.getUsername() : null);
                com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", sb6.toString());
                if (z17 && kotlin.jvm.internal.o.b(str, ((mm2.c1) v3Var.P0(mm2.c1.class)).f328852o) && J2 != null && (headUrl = J2.getHeadUrl()) != null) {
                    v3Var.K1(headUrl);
                }
            } else {
                com.tencent.mars.xlog.Log.i("Finder.LiveAnchorAfterPlugin", "cgi is not IFinderUserPageCGI");
            }
        }
        return jz5.f0.f302826a;
    }
}
