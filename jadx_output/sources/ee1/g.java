package ee1;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final ee1.g f251579a = new ee1.g();

    public static final ee1.e a(ee1.g gVar, com.tencent.mm.modelbase.f fVar) {
        gVar.getClass();
        int i17 = fVar.f70615a;
        int i18 = fVar.f70616b;
        java.lang.String str = fVar.f70617c;
        r45.ss0 ss0Var = (r45.ss0) fVar.f70618d;
        if (i17 != 0 || i18 != 0) {
            return new ee1.b(i17, i18, str);
        }
        if (ss0Var == null) {
            return new ee1.b(i17, i18, "resp is null");
        }
        int i19 = ss0Var.f385959d;
        if (i19 != 0) {
            java.lang.String str2 = ss0Var.f385960e;
            if (str2 == null) {
                str2 = "";
            }
            return new ee1.a(i19, str2);
        }
        java.util.LinkedList linkedList = ss0Var.f385961f;
        java.util.List list = kz5.p0.f313996d;
        java.util.List S0 = linkedList != null ? kz5.n0.S0(linkedList) : list;
        java.util.LinkedList linkedList2 = ss0Var.f385962g;
        if (linkedList2 != null) {
            list = kz5.n0.S0(linkedList2);
        }
        return new ee1.c(S0, list);
    }

    public static final ee1.e b(java.lang.String appId, java.util.List fpanidList, java.util.List issuerIdList) {
        jz5.f0 f0Var = jz5.f0.f302826a;
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(fpanidList, "fpanidList");
        kotlin.jvm.internal.o.g(issuerIdList, "issuerIdList");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.FilterHelper", "requestSync, appId=%s, fpanid=%d, issuer=%d", appId, java.lang.Integer.valueOf(fpanidList.size()), java.lang.Integer.valueOf(issuerIdList.size()));
        ee1.h hVar = new ee1.h(appId, fpanidList, issuerIdList);
        boolean z17 = true;
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        ee1.e[] eVarArr = new ee1.e[1];
        try {
            hVar.l().K(new ee1.f(eVarArr, countDownLatch));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.FilterHelper", "requestSync, cgi.run() threw: " + th6.getClass().getSimpleName() + ": " + th6.getMessage());
            z17 = false;
        }
        if (!z17) {
            return new ee1.b(-1, -1, "cgi.run() failed");
        }
        try {
            if (countDownLatch.await(15000L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                ee1.e eVar = eVarArr[0];
                return eVar == null ? new ee1.d("outcome unset") : eVar;
            }
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                hVar.j();
                kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th7) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
            }
            return new ee1.d("await timeout 15000ms");
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.TransitCard.FilterHelper", "requestSync, interrupted: " + e17.getMessage());
            try {
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                hVar.j();
                kotlin.Result.m521constructorimpl(f0Var);
            } catch (java.lang.Throwable th8) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th8));
            }
            return new ee1.d("interrupted");
        }
    }
}
