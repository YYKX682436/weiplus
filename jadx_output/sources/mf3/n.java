package mf3;

/* loaded from: classes3.dex */
public interface n extends mf3.l {
    mf3.p G();

    default pf5.c H(java.lang.Class apiClass) {
        kotlin.jvm.internal.o.g(apiClass, "apiClass");
        return G().c(apiClass);
    }

    default mf3.j g(java.lang.Class apiClass) {
        kotlin.jvm.internal.o.g(apiClass, "apiClass");
        return G().a(apiClass);
    }

    default boolean n(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        return false;
    }

    void p(java.lang.String str);
}
