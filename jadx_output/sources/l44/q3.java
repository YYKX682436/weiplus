package l44;

/* loaded from: classes4.dex */
public final class q3 {

    /* renamed from: a, reason: collision with root package name */
    public static final l44.q3 f316313a = new l44.q3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f316314b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.i2 f316315c = kotlinx.coroutines.flow.r2.b(0, 1, u26.u.DROP_OLDEST, 1, null);

    public final void a(java.lang.String str, yz5.a callback) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("registerAdRemovedListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
        kotlin.jvm.internal.o.g(callback, "callback");
        if (str == null) {
            com.tencent.mars.xlog.Log.e("AdRemovedEventHelper", "registerAdRemovedListener() called with: snsStringId = null!");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerAdRemovedListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
            return;
        }
        java.util.Map map = f316314b;
        synchronized (map) {
            try {
                java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(str);
                if (list == null) {
                    list = new java.util.ArrayList();
                }
                list.add(callback);
                map.put(str, list);
                com.tencent.mars.xlog.Log.i("AdRemovedEventHelper", "registerAd, snsId=" + str + ", size=" + list.size());
            } catch (java.lang.Throwable th6) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerAdRemovedListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
                throw th6;
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("registerAdRemovedListener", "com.tencent.mm.plugin.sns.ad.helper.AdRemovedEventHelper");
    }
}
