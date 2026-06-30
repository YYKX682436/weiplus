package qk;

/* loaded from: classes3.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f364088a = new java.util.LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    public static final java.util.List a(java.lang.String str) {
        kz5.p0 p0Var = kz5.p0.f313996d;
        if (str == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmotionSafeStrategyManager", "getEmotionList() called with: path = null");
        } else {
            ?? r27 = (java.util.List) ((java.util.LinkedHashMap) f364088a).get(str);
            if (r27 != 0) {
                p0Var = r27;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EmotionSafeStrategyManager", "getEmotionList() called with: path = " + str + ", list.size = " + p0Var.size());
        }
        return p0Var;
    }

    public static final void b(java.lang.String str, java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmotionSafeStrategyManager", "putEmotionList() called with: path = " + str + ", list.size = " + list.size());
        if (str == null) {
            return;
        }
        f364088a.put(str, list);
    }
}
