package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public final class p extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f169400a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.q f169401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.n f169402c;

    public p(r45.g92 g92Var, com.tencent.mm.plugin.sns.ui.item.q qVar, com.tencent.mm.plugin.sns.ui.item.n nVar) {
        this.f169400a = g92Var;
        this.f169401b = qVar;
        this.f169402c = nVar;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$5");
        kotlin.jvm.internal.o.g(view, "view");
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(this.f169400a.getString(2)) + view.hashCode();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getExposedId", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$5");
        return E1;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$5");
        kotlin.jvm.internal.o.g(view, "view");
        r45.g92 g92Var = this.f169400a;
        if (g92Var.getInteger(13) == 1 && !z17) {
            com.tencent.mm.plugin.sns.ui.item.q qVar = this.f169401b;
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.sns.ui.item.q.F(qVar), "#bindActivityIcon onViewExposedListener false, cancel it");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getRefreshActivityIconJob$p", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            kotlinx.coroutines.r2 r2Var = qVar.f169405s;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getRefreshActivityIconJob$p", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem");
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
        }
        if (z17) {
            if (((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Zi(g92Var.getString(1), view.findViewById(com.tencent.mm.R.id.f4x), view.findViewById(com.tencent.mm.R.id.f7y), this.f169402c.i())) {
                long Z = pm0.v.Z(g92Var.getString(2));
                int i17 = qs5.g.f366432a;
                int integer = g92Var.getInteger(22);
                ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Vi(true, Z, ya.a.SHARE, ((integer == 2 || integer == 8 || integer == 16) || g92Var.getInteger(22) == 6) ? 1 : 2, 3);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewExposed", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$5");
    }
}
