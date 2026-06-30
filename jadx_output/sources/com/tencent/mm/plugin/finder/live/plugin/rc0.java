package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class rc0 implements com.tencent.mm.sdk.platformtools.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.nd0 f114125d;

    public rc0(com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var) {
        this.f114125d = nd0Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message it) {
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = it.what;
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = this.f114125d;
        if (i17 == nd0Var.L) {
            nd0Var.I1(8);
            nd0Var.u1();
        } else if (i17 == nd0Var.K) {
            boolean C1 = nd0Var.C1();
            com.tencent.mars.xlog.Log.i("FinderLiveTitlePlugin", "has been look for one min ,isFollow" + C1);
            nd0Var.G1(C1, "#3", java.lang.Boolean.FALSE, java.lang.Boolean.TRUE);
        } else if (i17 == nd0Var.M) {
            java.lang.Long valueOf = java.lang.Long.valueOf(((mm2.e1) nd0Var.P0(mm2.e1.class)).f328988r.getLong(0));
            if (!(valueOf.longValue() != 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                dk2.Cif.f233626a.a(nd0Var.f113615p, valueOf.longValue(), dk2.hf.f233590h, true);
            }
        }
        return true;
    }
}
