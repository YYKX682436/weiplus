package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes.dex */
public final class o3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f124660a;

    public o3(kotlin.coroutines.Continuation continuation) {
        this.f124660a = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean e17 = xg2.g.e(fVar);
        kotlin.coroutines.Continuation continuation = this.f124660a;
        if (e17) {
            java.util.Iterator it = ((r45.m02) fVar.f70618d).getList(1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
                    break;
                }
                r45.ix0 ix0Var = (r45.ix0) it.next();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#cgiModNoticeInfo ret:");
                kotlin.jvm.internal.o.d(ix0Var);
                sb6.append(pm0.b0.g(ix0Var));
                com.tencent.mars.xlog.Log.i("FinderMoreLiveNoticeListWidget", sb6.toString());
                if (ix0Var.getInteger(0) == 10) {
                    if (ix0Var.getInteger(1) == 0) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
                    } else {
                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                        continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
                    }
                }
            }
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("#cgiModNoticeInfo errType ");
            sb7.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
            sb7.append(",errCode:");
            sb7.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
            sb7.append(",errMsg:");
            sb7.append(fVar != null ? fVar.f70617c : null);
            com.tencent.mars.xlog.Log.e("FinderMoreLiveNoticeListWidget", sb7.toString());
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        }
        return jz5.f0.f302826a;
    }
}
