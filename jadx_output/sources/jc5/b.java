package jc5;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final jc5.b f299016a = new jc5.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f299017b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f299018c = new java.util.LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f299019d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f299020e = new java.util.LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public static long f299021f;

    /* renamed from: g, reason: collision with root package name */
    public static int f299022g;

    public final void a(com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        java.lang.String b17 = b(msg);
        if (b17.length() == 0) {
            return;
        }
        java.util.Map map = f299017b;
        java.lang.String Q0 = msg.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) map;
        java.lang.Object obj = linkedHashMap.get(Q0);
        if (obj == null) {
            obj = new java.util.ArrayList();
            linkedHashMap.put(Q0, obj);
        }
        java.util.List list = (java.util.List) obj;
        if (list.contains(b17)) {
            return;
        }
        list.add(b17);
    }

    public final java.lang.String b(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        if (f9Var == null) {
            return "";
        }
        java.util.Map map = (java.util.Map) ((java.util.LinkedHashMap) f299018c).get(f9Var.Q0());
        if (map == null || (str = (java.lang.String) map.get(java.lang.Long.valueOf(f9Var.getMsgId()))) == null) {
            return "";
        }
        if (!(!kotlin.jvm.internal.o.b(str, "NoneId"))) {
            str = null;
        }
        return str == null ? "" : str;
    }
}
