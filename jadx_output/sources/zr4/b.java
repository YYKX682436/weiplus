package zr4;

/* loaded from: classes9.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f475197a = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f475198b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f475199c = new java.util.concurrent.ConcurrentHashMap();

    public static boolean a(java.lang.String str) {
        java.lang.Integer num;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        java.util.Map map = f475199c;
        return ((java.util.concurrent.ConcurrentHashMap) map).containsKey(str) && (num = (java.lang.Integer) ((java.util.concurrent.ConcurrentHashMap) map).get(str)) != null && num.intValue() > 1;
    }

    public static void b(java.lang.String str, int i17, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.Map map = f475197a;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(str)) {
            java.util.List list = (java.util.List) ((java.util.concurrent.ConcurrentHashMap) map).get(str);
            list.add(java.lang.Integer.valueOf(i17));
            ((java.util.concurrent.ConcurrentHashMap) map).put(str, list);
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(java.lang.Integer.valueOf(i17));
            ((java.util.concurrent.ConcurrentHashMap) map).put(str, arrayList);
        }
    }

    public static void c(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) f475197a).remove(str);
        ((java.util.concurrent.ConcurrentHashMap) f475198b).remove(str);
    }

    public static void d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        java.util.Map map = f475197a;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(str)) {
            return;
        }
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, new java.util.ArrayList());
    }
}
