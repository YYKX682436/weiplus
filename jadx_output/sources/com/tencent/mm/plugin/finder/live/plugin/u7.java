package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class u7 implements zh2.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f114531a;

    public u7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        this.f114531a = x7Var;
    }

    public void a(km2.q linkUser) {
        kotlin.jvm.internal.o.g(linkUser, "linkUser");
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f114531a;
        com.tencent.mars.xlog.Log.i(x7Var.f115037q, "onAcceptItemClick user: " + linkUser.f309170a);
        x7Var.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_FINDER_LIVE_MIC_ID", linkUser.f309175f);
        x7Var.f115036p.statusChange(qo0.b.L3, bundle);
    }

    public void b(km2.q linkUser) {
        kotlin.jvm.internal.o.g(linkUser, "linkUser");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("PARAM_FINDER_LIVE_MIC_ID", linkUser.f309175f);
        this.f114531a.f115036p.statusChange(qo0.b.M3, bundle);
    }
}
