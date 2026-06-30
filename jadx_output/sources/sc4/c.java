package sc4;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final sc4.c f406560a = new sc4.c();

    public static final void a(sc4.c cVar, r45.jj4 jj4Var, r45.jj4 jj4Var2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$clearErrorOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearErrorOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        if (jj4Var == null || jj4Var2 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearErrorOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        } else {
            r45.g96 g96Var = jj4Var.H1;
            java.lang.String str = g96Var != null ? g96Var.f375027d : null;
            if (str == null) {
                str = "";
            }
            r45.g96 g96Var2 = jj4Var2.H1;
            java.lang.String str2 = g96Var2 != null ? g96Var2.f375027d : null;
            java.lang.String str3 = str2 != null ? str2 : "";
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "checkClearOldVideo >> dbOldMediaCtx: " + str + "  newMediaCtx: " + str3);
            if (!kotlin.jvm.internal.o.b(str, str3)) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "go to clear old video start mediaId: " + jj4Var.f377855d);
                java.util.Iterator it = t21.d3.o(jj4Var.f377855d).iterator();
                while (it.hasNext()) {
                    t21.v2 v2Var = (t21.v2) it.next();
                    java.lang.String str4 = v2Var.B;
                    boolean z17 = false;
                    if (str4 != null) {
                        if (str4.length() > 0) {
                            z17 = true;
                        }
                    }
                    if (z17 && kotlin.jvm.internal.o.b(v2Var.B, "xV2")) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "clear old video >> " + v2Var.d());
                        dw3.c0.f244182a.j(v2Var.C);
                        t21.d3.e(v2Var.d());
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SnsMultiSpecVideoHelper", "clear finish >> costTime: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearErrorOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$clearErrorOldVideo", "com.tencent.mm.plugin.sns.ui.improve.func.SnsMultiSpecVideoHelper");
    }
}
