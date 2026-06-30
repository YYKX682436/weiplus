package fi2;

/* loaded from: classes3.dex */
public interface m {
    android.view.View a();

    void b(boolean z17);

    default void c(xh2.a micCoverData) {
        kotlin.jvm.internal.o.g(micCoverData, "micCoverData");
    }

    void e(xh2.a aVar);

    void f(java.lang.String str);

    void g(java.lang.String str, boolean z17, int i17, int i18);

    void h();

    void i(java.lang.String str, boolean z17);

    android.view.View j();

    android.view.View k();

    default android.view.View l() {
        return null;
    }

    default android.view.View m() {
        return null;
    }

    void n(boolean z17, boolean z18);

    android.widget.ImageView o();

    android.view.ViewGroup p();

    void q(int i17, java.lang.String str);

    void r();

    android.view.View s();

    void statusChange(qo0.b bVar, android.os.Bundle bundle);

    java.util.ArrayList t();

    void u(r45.xn1 xn1Var);

    android.view.View v();

    void w(java.util.LinkedHashMap linkedHashMap, xh2.b bVar);

    void x(java.lang.String str);
}
