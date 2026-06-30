package vt3;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.l {
    public f(kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new vt3.f(continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        vt3.f fVar = new vt3.f((kotlin.coroutines.Continuation) obj);
        jz5.f0 f0Var = jz5.f0.f302826a;
        fVar.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Finally extract failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        try {
            kotlinx.coroutines.r2 r2Var = vt3.l.f440009e;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            vt3.l.f440009e = null;
            com.tencent.maas.analytics.MJAssetInfoStatistics mJAssetInfoStatistics = vt3.l.f440006b;
            if (mJAssetInfoStatistics != null) {
                mJAssetInfoStatistics.c();
            }
            vt3.l.f440006b = null;
            kotlinx.coroutines.r2 r2Var2 = vt3.l.f440008d;
            if (r2Var2 != null) {
                kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
            }
            vt3.l.f440008d = null;
            u26.w wVar = vt3.l.f440007c;
            if (wVar != null) {
                u26.x0.a(wVar, null, 1, null);
            }
            vt3.l.f440007c = null;
            kotlinx.coroutines.z0.e(vt3.l.f440010f, null, 1, null);
            return jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            kotlinx.coroutines.r2 r2Var3 = vt3.l.f440008d;
            if (r2Var3 != null) {
                kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
            }
            vt3.l.f440008d = null;
            u26.w wVar2 = vt3.l.f440007c;
            if (wVar2 != null) {
                u26.x0.a(wVar2, null, 1, null);
            }
            vt3.l.f440007c = null;
            kotlinx.coroutines.z0.e(vt3.l.f440010f, null, 1, null);
            throw th6;
        }
    }
}
