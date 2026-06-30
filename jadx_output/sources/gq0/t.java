package gq0;

/* loaded from: classes7.dex */
public interface t extends i95.m {
    static void Qh(gq0.t tVar, iq0.c handle, iq0.e eVar, java.lang.String frameSetName, java.lang.String frameSetData, android.graphics.Rect containerRect, hq0.m0 preloadStrategy, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preload");
        }
        jc3.i0 i0Var = null;
        iq0.e eVar2 = (i17 & 2) != 0 ? null : eVar;
        nq0.p pVar = (nq0.p) tVar;
        pVar.getClass();
        kotlin.jvm.internal.o.g(handle, "handle");
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        kotlin.jvm.internal.o.g(frameSetData, "frameSetData");
        kotlin.jvm.internal.o.g(containerRect, "containerRect");
        kotlin.jvm.internal.o.g(preloadStrategy, "preloadStrategy");
        synchronized (handle) {
            jc3.i0 i0Var2 = (jc3.i0) ((java.util.LinkedHashMap) pVar.f338944f).get(handle);
            if (i0Var2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
            } else if (i0Var2 instanceof hq0.h) {
                i0Var = i0Var2;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
            }
        }
        hq0.h hVar = (hq0.h) i0Var;
        if (hVar != null) {
            ((hq0.b0) hVar).Y1(eVar2, frameSetName, frameSetData, containerRect, preloadStrategy);
        }
    }

    static /* synthetic */ void Ve(gq0.t tVar, iq0.c cVar, iq0.e eVar, android.view.ViewGroup viewGroup, java.lang.String str, java.lang.String str2, int i17, yz5.l lVar, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: bindFrameSetView");
        }
        ((nq0.p) tVar).Bi(cVar, (i18 & 2) != 0 ? null : eVar, viewGroup, str, str2, (i18 & 32) != 0 ? 0 : i17, (i18 & 64) != 0 ? null : lVar);
    }

    static /* synthetic */ void bh(gq0.t tVar, iq0.c cVar, android.app.Activity activity, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: active");
        }
        if ((i17 & 2) != 0) {
            activity = null;
        }
        ((nq0.p) tVar).wi(cVar, activity);
    }

    static /* synthetic */ iq0.c de(gq0.t tVar, yz5.a aVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: aquireBiz");
        }
        if ((i17 & 2) != 0) {
            str = "";
        }
        return ((nq0.p) tVar).Ai(aVar, str);
    }

    static void gj(gq0.t tVar, iq0.c handle, iq0.e eVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeAllFrameSetView");
        }
        jc3.i0 i0Var = null;
        if ((i17 & 2) != 0) {
            eVar = null;
        }
        nq0.p pVar = (nq0.p) tVar;
        pVar.getClass();
        kotlin.jvm.internal.o.g(handle, "handle");
        synchronized (handle) {
            jc3.i0 i0Var2 = (jc3.i0) ((java.util.LinkedHashMap) pVar.f338944f).get(handle);
            if (i0Var2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
            } else if (i0Var2 instanceof hq0.h) {
                i0Var = i0Var2;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
            }
        }
        hq0.h hVar = (hq0.h) i0Var;
        if (hVar != null) {
            hq0.b0 b0Var = (hq0.b0) hVar;
            if (eVar == null) {
                eVar = b0Var.f282970x.f293663i;
            }
            java.lang.String str = b0Var.f282971y;
            if (eVar == null) {
                com.tencent.mars.xlog.Log.e(str, "removeAllFrameSetView rootConfig nil");
                return;
            }
            com.tencent.mars.xlog.Log.i(str, "removeAllFrameSetView rootPath:" + eVar.f293657a);
            d75.b.g(new hq0.t(b0Var, eVar.a()));
        }
    }

    static void u5(gq0.t tVar, iq0.c handle, iq0.e eVar, java.lang.String frameSetName, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeFrameSetView");
        }
        jc3.i0 i0Var = null;
        if ((i17 & 2) != 0) {
            eVar = null;
        }
        nq0.p pVar = (nq0.p) tVar;
        pVar.getClass();
        kotlin.jvm.internal.o.g(handle, "handle");
        kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
        synchronized (handle) {
            jc3.i0 i0Var2 = (jc3.i0) ((java.util.LinkedHashMap) pVar.f338944f).get(handle);
            if (i0Var2 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MagicCardStarterFeatureService", "get biz, but not found");
            } else if (i0Var2 instanceof hq0.h) {
                i0Var = i0Var2;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.MagicCardStarterFeatureService", "get biz, but the type is not matched");
            }
        }
        hq0.h hVar = (hq0.h) i0Var;
        if (hVar != null) {
            hq0.b0 b0Var = (hq0.b0) hVar;
            if (eVar == null) {
                eVar = b0Var.f282970x.f293663i;
            }
            java.lang.String str = b0Var.f282971y;
            if (eVar == null || b0Var.C.get(eVar.a()) == null) {
                com.tencent.mars.xlog.Log.e(str, "removeFrameSetView rootConfig nil or frameSetRoot null");
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeFrameSetView rootPath:");
            java.lang.String str2 = eVar.f293657a;
            sb6.append(str2);
            sb6.append(" frameSetName:");
            sb6.append(frameSetName);
            com.tencent.mars.xlog.Log.i(str, sb6.toString());
            d75.b.g(new hq0.w(b0Var, eVar, vq0.b.a(b0Var, str2, frameSetName)));
        }
    }
}
