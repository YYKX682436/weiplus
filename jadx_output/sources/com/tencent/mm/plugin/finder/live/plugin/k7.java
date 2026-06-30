package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes10.dex */
public final class k7 implements ke2.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x7 f113200a;

    public k7(com.tencent.mm.plugin.finder.live.plugin.x7 x7Var) {
        this.f113200a = x7Var;
    }

    @Override // ke2.f0
    public void a(int i17, int i18, java.lang.String str, r45.h62 resp) {
        kotlin.jvm.internal.o.g(resp, "resp");
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f113200a;
        com.tencent.mars.xlog.Log.i(x7Var.f115037q, "launchRandomMatch: errType=" + i17 + ", errCode=" + i18 + ", errMsg=" + str);
        x7Var.R = false;
        if (i17 != 0 || i18 != 0) {
            if (str == null || str.length() == 0) {
                db5.t7.makeText(x7Var.f365323d.getContext(), x7Var.f365323d.getContext().getString(com.tencent.mm.R.string.dnm), 0).show();
                return;
            } else {
                db5.t7.makeText(x7Var.f365323d.getContext(), str, 0).show();
                return;
            }
        }
        qo0.c cVar = x7Var.f115036p;
        qo0.b bVar = qo0.b.Z3;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("PARAM_FINDER_LIVE_RANDOM_MATCH_LINK_MIC_CONTACT_LIST", resp.toByteArray());
        cVar.statusChange(bVar, bundle);
        pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.j7(x7Var));
    }
}
