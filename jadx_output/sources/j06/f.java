package j06;

/* loaded from: classes12.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final j06.f f297059d = new j06.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String obj2;
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        kotlin.jvm.internal.o.g(entry, "entry");
        java.lang.String str = (java.lang.String) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof boolean[]) {
            obj2 = java.util.Arrays.toString((boolean[]) value);
            kotlin.jvm.internal.o.f(obj2, "toString(...)");
        } else if (value instanceof char[]) {
            obj2 = java.util.Arrays.toString((char[]) value);
            kotlin.jvm.internal.o.f(obj2, "toString(...)");
        } else if (value instanceof byte[]) {
            obj2 = java.util.Arrays.toString((byte[]) value);
            kotlin.jvm.internal.o.f(obj2, "toString(...)");
        } else if (value instanceof short[]) {
            obj2 = java.util.Arrays.toString((short[]) value);
            kotlin.jvm.internal.o.f(obj2, "toString(...)");
        } else if (value instanceof int[]) {
            obj2 = java.util.Arrays.toString((int[]) value);
            kotlin.jvm.internal.o.f(obj2, "toString(...)");
        } else if (value instanceof float[]) {
            obj2 = java.util.Arrays.toString((float[]) value);
            kotlin.jvm.internal.o.f(obj2, "toString(...)");
        } else if (value instanceof long[]) {
            obj2 = java.util.Arrays.toString((long[]) value);
            kotlin.jvm.internal.o.f(obj2, "toString(...)");
        } else if (value instanceof double[]) {
            obj2 = java.util.Arrays.toString((double[]) value);
            kotlin.jvm.internal.o.f(obj2, "toString(...)");
        } else if (value instanceof java.lang.Object[]) {
            obj2 = java.util.Arrays.toString((java.lang.Object[]) value);
            kotlin.jvm.internal.o.f(obj2, "toString(...)");
        } else {
            obj2 = value.toString();
        }
        return str + '=' + obj2;
    }
}
