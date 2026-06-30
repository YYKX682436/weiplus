package d22;

/* loaded from: classes15.dex */
public interface p {
    default boolean a() {
        return false;
    }

    default com.tencent.mm.plugin.lite.api.LiteAppHalfScreenStatusChangeListener b(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        return null;
    }

    default java.lang.String c() {
        return "";
    }

    java.lang.String d(d22.v vVar);

    java.lang.String e();

    void f(d22.v vVar);

    default java.lang.Object g(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        return null;
    }

    default boolean h() {
        return false;
    }

    com.tencent.mm.plugin.lite.s i(d22.v vVar);

    java.lang.String j();

    void k(android.content.Context context, d22.v vVar);

    boolean l();

    default java.lang.String m() {
        return com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_PUSH;
    }

    boolean n(d22.v vVar);
}
