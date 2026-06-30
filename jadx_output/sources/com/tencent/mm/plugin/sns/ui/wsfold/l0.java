package com.tencent.mm.plugin.sns.ui.wsfold;

/* loaded from: classes4.dex */
public final class l0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.wsfold.g1 f171401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f171402b;

    public l0(com.tencent.mm.plugin.sns.ui.wsfold.g1 g1Var, kotlin.coroutines.Continuation continuation) {
        this.f171401a = g1Var;
        this.f171402b = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$runGetDataCgi$2$1");
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("call", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$runGetDataCgi$2$1");
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        r45.xf xfVar = (r45.xf) fVar.f70618d;
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDataUIC", "runCgi: " + i17 + ", " + i18);
        kotlin.coroutines.Continuation continuation = this.f171402b;
        if (i17 == 0 && i18 == 0) {
            pc4.d.f353410a.H(xfVar.f390045e);
            java.util.LinkedList object_list = xfVar.f390044d;
            kotlin.jvm.internal.o.f(object_list, "object_list");
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDataUIC", "runCgi id list:".concat(kz5.n0.g0(object_list, ";", null, null, 0, null, com.tencent.mm.plugin.sns.ui.wsfold.k0.f171399d, 30, null)));
            java.util.List a17 = this.f171401a.a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : a17) {
                long longValue = ((java.lang.Number) obj2).longValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(object_list, 10));
                java.util.Iterator it = object_list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(java.lang.Long.valueOf(((com.tencent.mm.protocal.protobuf.SnsObject) it.next()).Id));
                }
                if (!arrayList2.contains(java.lang.Long.valueOf(longValue))) {
                    arrayList.add(obj2);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                long longValue2 = ((java.lang.Number) it6.next()).longValue();
                com.tencent.mm.plugin.sns.model.l4.Fj().delete(longValue2);
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsWsFoldDataUIC", "delete snsinfo:" + ca4.z0.t0(longValue2));
            }
            continuation.resumeWith(kotlin.Result.m521constructorimpl(xfVar));
        } else {
            continuation.resumeWith(kotlin.Result.m521constructorimpl(null));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$runGetDataCgi$2$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("call", "com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldListDataSource$runGetDataCgi$2$1");
        return f0Var;
    }
}
