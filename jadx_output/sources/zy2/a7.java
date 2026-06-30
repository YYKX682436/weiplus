package zy2;

/* loaded from: classes2.dex */
public interface a7 extends i95.m {
    static void Ea(zy2.a7 a7Var, java.lang.String exportId, java.lang.String str, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recordPreloadFeed");
        }
        if ((i27 & 16) != 0) {
            i19 = 0;
        }
        int i28 = i19;
        com.tencent.mm.plugin.finder.service.l2 l2Var = (com.tencent.mm.plugin.finder.service.l2) a7Var;
        l2Var.getClass();
        kotlin.jvm.internal.o.g(exportId, "exportId");
        if (!android.text.TextUtils.isEmpty(exportId)) {
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.service.k2(i17, exportId, l2Var, str, i28, i18));
            return;
        }
        com.tencent.mars.xlog.Log.w("FinderFeedDetailService", "recordPreloadFeed commentScene:" + i17 + " return for " + exportId + '.');
    }

    static void sg(zy2.a7 a7Var, long j17, java.lang.String str, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recordPreloadFeed");
        }
        if ((i27 & 16) != 0) {
            i19 = 0;
        }
        int i28 = i19;
        com.tencent.mm.plugin.finder.service.l2 l2Var = (com.tencent.mm.plugin.finder.service.l2) a7Var;
        l2Var.getClass();
        if (j17 != 0) {
            pm0.v.V(0L, new com.tencent.mm.plugin.finder.service.i2(i17, j17, l2Var, i28, i18));
            return;
        }
        com.tencent.mars.xlog.Log.w("FinderFeedDetailService", "recordPreloadFeed commentScene:" + i17 + " return for 0.");
    }
}
