package com.tencent.mm.plugin.sns.ui.monitor;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0018\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR0\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0\u000ej\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/monitor/SnsMethodCalculate;", "", "", "methodName", "className", "Ljz5/f0;", "markStartTimeMs", "markEndTimeMs", "frameClear", "TAG", "Ljava/lang/String;", "", "LIMIT", "I", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "methodStartTimeMap", "Ljava/util/HashMap;", "<init>", "()V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class SnsMethodCalculate {
    private static final int LIMIT = 5000;
    private static final java.lang.String TAG = "MicroMsg.SnsMethodCalculate";
    public static final com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate INSTANCE = new com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate();
    private static final java.util.HashMap<java.lang.String, java.lang.Long> methodStartTimeMap = new java.util.HashMap<>();

    private SnsMethodCalculate() {
    }

    public static final void frameClear() {
        methodStartTimeMap.clear();
    }

    public static final void markEndTimeMs(java.lang.String methodName, java.lang.String className) {
        kotlin.jvm.internal.o.g(methodName, "methodName");
        kotlin.jvm.internal.o.g(className, "className");
        if (ld4.a.f318106b && kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            java.util.HashMap<java.lang.String, java.lang.Long> hashMap = methodStartTimeMap;
            java.lang.Long remove = hashMap.remove(methodName + '#' + className);
            if (remove == null) {
                return;
            }
            long longValue = remove.longValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Set<java.lang.String> keySet = hashMap.keySet();
            kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
            long currentTimeMillis = java.lang.System.currentTimeMillis() - longValue;
            if (!(!keySet.isEmpty()) || currentTimeMillis <= 1) {
                return;
            }
            arrayList.addAll(keySet);
            java.lang.String g07 = kz5.n0.g0(arrayList, "->", null, null, 0, null, null, 62, null);
            com.tencent.mars.xlog.Log.i(TAG, g07 + " name:" + methodName + '#' + className + " cost:" + currentTimeMillis);
            ((ku5.t0) ku5.t0.f312615d).g(new sd4.e(className, methodName, currentTimeMillis, g07));
        }
    }

    public static final void markStartTimeMs(java.lang.String methodName, java.lang.String className) {
        kotlin.jvm.internal.o.g(methodName, "methodName");
        kotlin.jvm.internal.o.g(className, "className");
        if (ld4.a.f318106b && kotlin.jvm.internal.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread())) {
            java.util.HashMap<java.lang.String, java.lang.Long> hashMap = methodStartTimeMap;
            if (hashMap.size() > 5000) {
                return;
            }
            hashMap.put(methodName + '#' + className, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }
}
