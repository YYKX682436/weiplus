package x92;

/* loaded from: classes2.dex */
public interface q {
    default boolean a2() {
        return !com.tencent.mm.sdk.platformtools.t8.K0(d2());
    }

    void b2();

    java.lang.String d2();

    void setNormalStyle();

    default void z5() {
        if (a2()) {
            b2();
        } else {
            setNormalStyle();
        }
    }
}
