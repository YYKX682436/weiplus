package com.tencent.mm.plugin.sns.ui.item;

/* loaded from: classes4.dex */
public final class o implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f169392a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.q f169393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f169394c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.item.n f169395d;

    public o(r45.g92 g92Var, com.tencent.mm.plugin.sns.ui.item.q qVar, android.view.View view, com.tencent.mm.plugin.sns.ui.item.n nVar) {
        this.f169392a = g92Var;
        this.f169393b = qVar;
        this.f169394c = view;
        this.f169395d = nVar;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onEventOccur", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$4$1");
        r45.g92 finderShareObject = this.f169392a;
        int i17 = finderShareObject.getInteger(13) == 1 ? 1 : 2;
        p52.c cVar = p52.h.f352016a;
        kotlin.jvm.internal.o.d(str);
        kotlin.jvm.internal.o.d(map);
        if (!cVar.c(j17, str, map, i17)) {
            kotlin.jvm.internal.o.f(finderShareObject, "$finderShareObject");
            r45.nw1 nw1Var = (r45.nw1) finderShareObject.getCustom(24);
            com.tencent.mm.plugin.sns.ui.item.q qVar = this.f169393b;
            if (!qVar.H(finderShareObject, nw1Var)) {
                if (!qVar.G(finderShareObject.getString(1), this.f169394c, this.f169395d.i())) {
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Qj(j17, str, cVar.h(map, i17), kz5.b0.c(26236), false);
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onEventOccur", "com.tencent.mm.plugin.sns.ui.item.FinderLiveTimeLineItem$fillItem$4$1");
    }
}
