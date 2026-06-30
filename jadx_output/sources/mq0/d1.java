package mq0;

/* loaded from: classes7.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public static final mq0.d1 f330546a = new mq0.d1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f330547b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f330548c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final jz5.g f330549d = jz5.h.b(mq0.c1.f330545d);

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashSet f330550e = new java.util.HashSet();

    public final mq0.b1 a(java.lang.String str) {
        java.util.HashMap hashMap = f330547b;
        mq0.b1 b1Var = (mq0.b1) hashMap.get(str);
        if (b1Var != null) {
            return b1Var;
        }
        mq0.b1 b1Var2 = new mq0.b1(0L, 0L, 0L, false, 15, null);
        hashMap.put(str, b1Var2);
        return b1Var2;
    }

    public final synchronized void b(fq0.x frameSet, java.lang.String bizName) {
        java.lang.Integer valueOf;
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        mq0.b1 a17 = a(frameSet.f265478b);
        gq0.r rVar = (gq0.r) i95.n0.c(gq0.r.class);
        java.lang.String id6 = frameSet.f265478b;
        fq0.z zVar = (fq0.z) rVar;
        zVar.getClass();
        kotlin.jvm.internal.o.g(id6, "id");
        com.tencent.mm.sdk.platformtools.o4 o4Var = zVar.f265494d;
        long j17 = o4Var != null ? o4Var.getLong(id6, 0L) : 0L;
        if (j17 <= 0) {
            valueOf = null;
        } else {
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = zVar.f265494d;
            if (o4Var2 != null) {
                o4Var2.remove(id6);
            }
            valueOf = java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() - j17));
        }
        if (valueOf != null) {
            f330546a.c(frameSet.f265478b, valueOf.intValue());
        }
        a17.f330541b = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandReporter", "markRenderStartTime " + frameSet.f265478b + ' ' + a17.f330541b);
        je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
        java.lang.String str = frameSet.f265478b;
        java.lang.String str2 = frameSet.f265477a;
        com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene iMagicBrushMonitor$PerformanceScene = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene.Start;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("appStatus", com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground() ? 1 : 2);
        hq0.e0 e0Var = frameSet.f265479c;
        jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, e0Var != null ? e0Var.f282982c : null);
        iVar.qa(str, bizName, str2, iMagicBrushMonitor$PerformanceScene, 0L, null, jSONObject);
    }

    public final void c(java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandReporter", "reportGapTimeFromPreloadDoneToActualUse " + str + ' ' + i17);
        i95.m c17 = i95.n0.c(je3.i.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        je3.i.x2((je3.i) c17, "MagicBrandPreloadToUseGap", i17, str, 0.0f, 8, null);
    }

    public final synchronized void d(fq0.x frameSet, java.lang.String bizName, boolean z17) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        if (frameSet.f265487k == com.tencent.mm.magicbrush.plugin.scl.reporter.MagicSclBrandReporter$PreloadScene.OutBox) {
            gq0.r rVar = (gq0.r) i95.n0.c(gq0.r.class);
            java.lang.String id6 = frameSet.f265478b;
            fq0.z zVar = (fq0.z) rVar;
            zVar.getClass();
            kotlin.jvm.internal.o.g(id6, "id");
            com.tencent.mm.sdk.platformtools.o4 o4Var = zVar.f265494d;
            if (o4Var != null) {
                o4Var.putLong(id6, java.lang.System.currentTimeMillis());
            }
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        mq0.b1 b1Var = (mq0.b1) f330547b.get(frameSet.f265478b);
        if (b1Var != null && b1Var.f330540a > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandReporter", "reportPreloadFinish " + frameSet.f265478b + ' ' + currentTimeMillis + ' ' + (currentTimeMillis - b1Var.f330540a) + ' ' + frameSet.f265487k);
            int i17 = 1;
            b1Var.f330543d = true;
            je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
            java.lang.String str = frameSet.f265478b;
            java.lang.String str2 = frameSet.f265477a;
            com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene iMagicBrushMonitor$PerformanceScene = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene.PreloadDone;
            long j17 = currentTimeMillis - b1Var.f330540a;
            java.lang.String[] strArr = new java.lang.String[2];
            strArr[0] = java.lang.String.valueOf(frameSet.f265487k.getValue());
            strArr[1] = z17 ? "1" : "0";
            java.util.List i18 = kz5.c0.i(strArr);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            if (!com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground()) {
                i17 = 2;
            }
            jSONObject.put("appStatus", i17);
            hq0.e0 e0Var = frameSet.f265479c;
            jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, e0Var != null ? e0Var.f282982c : null);
            iVar.qa(str, bizName, str2, iMagicBrushMonitor$PerformanceScene, j17, i18, jSONObject);
        }
    }

    public final synchronized void e(fq0.x frameSet, java.lang.String bizName, boolean z17, int i17, org.json.JSONObject jSONObject) {
        kotlin.jvm.internal.o.g(frameSet, "frameSet");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        mq0.b1 b1Var = (mq0.b1) f330547b.get(frameSet.f265478b);
        if (b1Var != null) {
            boolean z18 = b1Var.f330543d;
            long j17 = b1Var.f330542c;
            long j18 = j17 > 0 ? currentTimeMillis - j17 : -1L;
            if (b1Var.f330541b > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclBrandReporter", "reportRenderFinish " + frameSet.f265478b + ' ' + currentTimeMillis + ' ' + (currentTimeMillis - b1Var.f330541b) + " preloadDone:" + z18 + " expose:" + j18 + ", scene: " + frameSet.f265487k);
                je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
                java.lang.String str = frameSet.f265478b;
                java.lang.String str2 = frameSet.f265477a;
                com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene iMagicBrushMonitor$PerformanceScene = com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$PerformanceScene.FirstFrameFromStart;
                long j19 = currentTimeMillis - b1Var.f330541b;
                java.lang.String[] strArr = new java.lang.String[4];
                strArr[0] = java.lang.String.valueOf(frameSet.f265487k.getValue());
                int i18 = 1;
                strArr[1] = z18 ? "1" : "0";
                strArr[2] = java.lang.String.valueOf(j18);
                strArr[3] = z17 ? "1" : "0";
                java.util.List i19 = kz5.c0.i(strArr);
                org.json.JSONObject jSONObject2 = jSONObject == null ? new org.json.JSONObject() : jSONObject;
                if (!com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground()) {
                    i18 = 2;
                }
                jSONObject2.put("appStatus", i18);
                jSONObject2.put("zidl", i17);
                hq0.e0 e0Var = frameSet.f265479c;
                jSONObject2.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, e0Var != null ? e0Var.f282982c : null);
                jSONObject2.put("hasCover", ((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Ai(bizName, frameSet.f265478b));
                iVar.qa(str, bizName, str2, iMagicBrushMonitor$PerformanceScene, j19, i19, jSONObject2);
            }
        }
    }
}
