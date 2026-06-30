package i64;

/* loaded from: classes4.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f289062a = new java.util.LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f289063b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f289064c = "AdModelManager";

    public void a(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("applyModelChange", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        com.tencent.mars.xlog.Log.i(d(), "apply k=" + obj + " model=" + obj2);
        ((kotlinx.coroutines.flow.h3) ((kotlinx.coroutines.flow.j2) e(obj))).k(obj2);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("applyModelChange", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
    }

    public java.lang.Object b(java.lang.Object obj) {
        java.lang.Object value;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("currentModel", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        synchronized (this.f289062a) {
            try {
                kotlinx.coroutines.flow.j2 j2Var = (kotlinx.coroutines.flow.j2) ((java.util.LinkedHashMap) this.f289062a).get(obj);
                value = j2Var != null ? ((kotlinx.coroutines.flow.h3) j2Var).getValue() : null;
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("currentModel", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("currentModel", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        return value;
    }

    public final java.util.Map c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getModelFlows", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        java.util.Map map = this.f289062a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getModelFlows", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        return map;
    }

    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        return this.f289064c;
    }

    public kotlinx.coroutines.flow.j e(java.lang.Object obj) {
        kotlinx.coroutines.flow.j2 j2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("observeModelChange", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        synchronized (this.f289062a) {
            try {
                j2Var = (kotlinx.coroutines.flow.j2) ((java.util.LinkedHashMap) this.f289062a).get(obj);
                if (j2Var == null) {
                    j2Var = kotlinx.coroutines.flow.i3.a(null);
                    this.f289062a.put(obj, j2Var);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("observeModelChange", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("observeModelChange", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        return j2Var;
    }

    public final kotlinx.coroutines.sync.d f(java.lang.Object obj) {
        kotlinx.coroutines.sync.d dVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("obtainMutex", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        synchronized (this.f289063b) {
            try {
                dVar = (kotlinx.coroutines.sync.d) ((java.util.LinkedHashMap) this.f289063b).get(obj);
                if (dVar == null) {
                    dVar = kotlinx.coroutines.sync.l.a(false, 1, null);
                    this.f289063b.put(obj, dVar);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainMutex", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("obtainMutex", "com.tencent.mm.plugin.sns.ad.model.AdModelManager");
        return dVar;
    }
}
