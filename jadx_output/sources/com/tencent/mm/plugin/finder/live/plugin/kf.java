package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class kf implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f113227d;

    public kf(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f113227d = mgVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        dk2.zf zfVar = (dk2.zf) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (zfVar != null && (!zl2.r4.f473950a.w1() || (zfVar.getType() != 20036 && zfVar.getType() != 100000))) {
            com.tencent.mm.plugin.finder.live.plugin.mg mgVar = this.f113227d;
            if (mgVar.H) {
                kotlinx.coroutines.r2 r2Var = mgVar.U;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                dk2.zf zfVar2 = ((mm2.c1) mgVar.S0().a(mm2.c1.class)).Y1;
                if ((zfVar2 != null && zfVar2.getType() == 100000) && zfVar.getType() == 100000) {
                    com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "#onStickTopShowingTitleMsgReceived join live title again. ignore");
                } else {
                    dk2.zf zfVar3 = ((mm2.c1) mgVar.S0().a(mm2.c1.class)).Y1;
                    java.lang.Long valueOf = zfVar3 != null ? java.lang.Long.valueOf(zfVar3.m()) : null;
                    com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "#onStickTopShowingTitleMsgReceived last:" + valueOf + ", cur:" + zfVar.m());
                    if (valueOf != null) {
                        if (valueOf.longValue() == zfVar.m()) {
                            com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "#onStickTopShowingTitleMsgReceived same one, or sticky. ignore");
                        }
                    }
                    ((mm2.c1) mgVar.S0().a(mm2.c1.class)).Y1 = zfVar;
                    mgVar.U = com.tencent.mm.plugin.finder.live.util.y.m(mgVar, null, null, new com.tencent.mm.plugin.finder.live.plugin.rf(zfVar, mgVar, null), 3, null);
                }
            } else {
                kotlinx.coroutines.r2 r2Var2 = mgVar.U;
                if (r2Var2 != null) {
                    kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                }
                com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "#onStickTopShowingTitleMsgReceived comment ban");
            }
        }
        return f0Var;
    }
}
